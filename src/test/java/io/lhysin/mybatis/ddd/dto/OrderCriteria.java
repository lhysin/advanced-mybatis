package io.lhysin.mybatis.ddd.dto;

import io.lhysin.mybatis.ddd.spec.Column;
import io.lhysin.mybatis.ddd.spec.Comparison;
import io.lhysin.mybatis.ddd.spec.NullHandler;
import io.lhysin.mybatis.ddd.spec.WhereClause;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderCriteria {

    @WhereClause(column = @Column(name = "ORD_NO"), comparison = Comparison.EQUAL, nullHandler = NullHandler.IGNORE)
    private String ordNo;

    @WhereClause(column = @Column(name = "ORD_SEQ"), comparison = Comparison.LESS_THAN_EQUAL, nullHandler = NullHandler.IGNORE)
    private Integer ordSeq;

    @WhereClause(column = @Column(name = "NAME"), comparison = Comparison.NOT_EQUAL, nullHandler = NullHandler.IGNORE)
    private String name;

}
