package io.lhysin.mybatis.ddd.mapper;

import io.lhysin.mybatis.ddd.entity.Order;
import io.lhysin.mybatis.ddd.provider.CrudSqlProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

/**
 * The interface Order mapper.
 */
@Repository
public interface OrderMapper extends CrudMapper<Order, Order.PK> {

    @Override
    @InsertProvider(type = CrudSqlProvider.class, method = "create")
    @SelectKey(keyColumn = "ORD_SEQ", keyProperty = "ordSeq", resultType = Integer.class, before = true, statement = "SELECT ADM.ORDER_SEQUENCE.nextval FROM DUAL")
    int create(Order entity);
}
