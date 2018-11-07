package com.sxu.movieelasticsearch.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QueryDTO {

    private String origin;

    private String category;

    private Float minScore;

    private String orderBy;

}