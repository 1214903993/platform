package platform.controller;

import com.wyh.platform.entity.dto.TagDto;
import com.wyh.platform.service.TagAndModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagAndModelController {
    @Autowired
    private TagAndModelService service;
    /**
     * 添加标签
     */
    @PutMapping("tags/relation")
    public void putTags(@RequestBody List<TagDto> tags){
        service.addTagsByRelation(tags);
        System.out.println("success!");
    }
}
