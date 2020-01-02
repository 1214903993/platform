package platform.Repo;

import com.wyh.platform.entity.po.TagPo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepo extends JpaRepository<TagPo,Long> {
    /**
     * 根据名称和等级查询
     */
    List<TagPo> findByNameAndLevelAndPid(String name, Integer level, Long pid);
}
