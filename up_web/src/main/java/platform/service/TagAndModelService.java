package platform.service;

import platform.entity.dto.TagDto;

import java.util.List;

public interface TagAndModelService {
    /**
     * 增加标签
     * @param tags
     */
    public void addTagsByRelation(List<TagDto> tags) ;
}
