package com.ecommerce.library.repository;

import com.ecommerce.library.model.ShoppingCart;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
//    @Override
//    @Query(select * from )
//    List<ShoppingCart> findCartItems(Long id);
}
