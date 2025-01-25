package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.DeliveryAddresses;
import com.example.fashionshop.models.enums.DeliveryCompanyNamesEnum;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeliveryAddressesRepository extends JpaRepository<DeliveryAddresses, Long> {

    @Query("SELECT DISTINCT d.companyName FROM DeliveryAddresses d")
    List<String> findAllCompanyNames();

    @Query("SELECT d.officeName FROM DeliveryAddresses d WHERE d.companyName = :companyName")
    List<String> findOfficesByCompanyName(@Param("companyName") DeliveryCompanyNamesEnum companyNameEnum);

    Optional<DeliveryAddresses> findByOfficeName(String officeName);

}
