package platform.service.impl;

import com.wyh.platform.Repo.TagRepo;
import com.wyh.platform.entity.dto.TagDto;
import com.wyh.platform.service.TagAndModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagAndModelServiceImpl implements TagAndModelService {
    @Autowired
    private TagRepo tagRepo;
    @Override
    public void addTagsByRelation(List<TagDto> tags) {

    }
}
