package com.xiaopy.sharding.repository;

import com.xiaopy.sharding.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/12/17
 */
@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findAllByType(String type);


}
