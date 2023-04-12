package com.dori.Dori90v.repositories;

import com.dori.Dori90v.inventory.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * This is the Inventory Repository.
 * @author Dori.
 */
@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long>,
        JpaSpecificationExecutor<Inventory> {
}
