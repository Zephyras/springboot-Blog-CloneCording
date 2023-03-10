package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    List<Post> findByPage(@Param("limit") Integer limit, @Param("offset") Integer offset);
    Post findOne(@Param("id") Integer id); //privamary id 키를 의마함.
    Integer save(@Param("post") Post post);
    Integer update(@Param("post") Post post);
}
