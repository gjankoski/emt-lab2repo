package mk.ukim.finki.wp.exam.example.web.Rest;

import mk.ukim.finki.wp.exam.example.model.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/categories")

public class CategoryRestController {

    @GetMapping
    public List<Category> findAll()
    {
        return Arrays.asList(Category.values());
    }

}
