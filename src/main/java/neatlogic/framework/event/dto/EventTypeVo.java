package neatlogic.framework.event.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.constvalue.GroupSearch;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.dto.AuthorityVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class EventTypeVo extends BasePageVo {

	public static final Long ROOT_PARENTID = -1L;
	public static final Long ROOT_ID = 0L;

	@EntityField(name = "事件类型ID", type = ApiParamType.LONG)
	private Long id;
	@EntityField(name = "事件类型名称", type = ApiParamType.STRING)
	private String name;
	@EntityField(name = "父类型ID", type = ApiParamType.LONG)
	private Long parentId;
	@EntityField(name = "左编码", type = ApiParamType.INTEGER)
	private Integer lft;
	@EntityField(name = "右编码", type = ApiParamType.INTEGER)
	private Integer rht;
	@EntityField(name = "子节点数量", type = ApiParamType.INTEGER)
	private Integer childCount;
	@EntityField(name = "授权对象", type = ApiParamType.JSONARRAY)
	private List<String> authorityList;

	/** 节点在树的层级*/
	private Integer layer;

	private List<EventTypeVo> children = new ArrayList<>();

	private Integer solutionCount;

	@JSONField(serialize = false)
	private List<AuthorityVo> authorityVoList;

	@JSONField(serialize = false)
	private EventTypeVo parent;

	public EventTypeVo() {}

	public Long getId() {
		if(id == null){
			id = SnowflakeUtil.uniqueLong();
		}
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getLft() {
		return lft;
	}

	public EventTypeVo getParent() {
		return parent;
	}

	public void setParent(EventTypeVo parent) {
		this.parent = parent;
		parent.getChildren().add(this);
	}

	public List<EventTypeVo> getChildren() {
		return children;
	}

	public void setChildren(List<EventTypeVo> children) {
		this.children = children;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRht() {
		return rht;
	}

	public void setRht(Integer rht) {
		this.rht = rht;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public List<String> getAuthorityList() {
		if(authorityList == null && CollectionUtils.isNotEmpty(authorityVoList)) {
			authorityList = new ArrayList<>();
			for(AuthorityVo authorityVo : authorityVoList) {
				GroupSearch groupSearch = GroupSearch.getGroupSearch(authorityVo.getType());
				if(groupSearch != null) {
					authorityList.add(groupSearch.getValuePlugin() + authorityVo.getUuid());
				}
			}
		}
		return authorityList;
	}

	public void setAuthorityList(List<String> authorityList) {
		this.authorityList = authorityList;
	}

	public List<AuthorityVo> getAuthorityVoList() {
		if(authorityVoList == null && CollectionUtils.isNotEmpty(authorityList)) {
			authorityVoList = new ArrayList<>();
			for(String authority : authorityList) {
				String[] split = authority.split("#");
				if(GroupSearch.getGroupSearch(split[0]) != null) {
					AuthorityVo authorityVo = new AuthorityVo();
					authorityVo.setType(split[0]);
					authorityVo.setUuid(split[1]);
					authorityVoList.add(authorityVo);
				}
			}
		}
		return authorityVoList;
	}

	public void setAuthorityVoList(List<AuthorityVo> authorityVoList) {
		this.authorityVoList = authorityVoList;
	}

	public Integer getSolutionCount() {
		return solutionCount;
	}

	public void setSolutionCount(Integer solutionCount) {
		this.solutionCount = solutionCount;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EventTypeVo vo = (EventTypeVo) o;
		return vo.getId().equals(id);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
