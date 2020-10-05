package com.bloggerman.article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloggerman/api/articles")
@CrossOrigin(
        methods = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE},
        maxAge = 3600,
        origins = "*"
)
@Api(value = "/api/articles", tags = {"Articles Api"})
public class ArticleController {
    public final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Read all articles from database", response = Article.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "List of articles"),
            @ApiResponse(code = 500, message = "Internal error")
    })
    public List<Article> findAllArticles() {
        return service.findAll();
    }
}
