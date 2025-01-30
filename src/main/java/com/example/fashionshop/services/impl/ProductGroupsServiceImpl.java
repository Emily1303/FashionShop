package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.models.enums.CategoriesEnum;
import com.example.fashionshop.models.enums.ProductGroupsNamesEnum;
import com.example.fashionshop.repositories.CategoriesRepository;
import com.example.fashionshop.repositories.ProductGroupsRepository;
import com.example.fashionshop.services.ProductGroupsService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductGroupsServiceImpl implements ProductGroupsService {

    private final ProductGroupsRepository productGroupsRepository;

    private final CategoriesRepository categoriesRepository;

    public ProductGroupsServiceImpl(ProductGroupsRepository productGroupsRepository, CategoriesRepository
            categoriesRepository) {
        this.productGroupsRepository = productGroupsRepository;
        this.categoriesRepository = categoriesRepository;
    }


    @PostConstruct
    @Override
    public void fillProductGroups() {
        if (productGroupsRepository.count() == 0) {
            List<ProductGroups> productGroupsList = new ArrayList<>();

            Categories womenCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.ЖЕНИ).get();
            Categories menCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МЪЖЕ).get();
            Categories girlsCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМИЧЕТА).get();
            Categories boysCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМЧЕТА).get();

            ProductGroups dressProductGroup = new ProductGroups();
            List<Categories> dressList = new ArrayList<>();
            dressList.add(womenCategory);
            dressProductGroup.setProductGroupName(ProductGroupsNamesEnum.РОКЛИ_ГАЩЕРИЗОНИ.toString());
            dressProductGroup.setCategories(dressList);
            productGroupsList.add(dressProductGroup);

            List<Categories> jacketsList = new ArrayList<>();
            ProductGroups jacketsProductGroup = new ProductGroups();
            jacketsList.add(womenCategory);
            jacketsList.add(menCategory);
            jacketsList.add(girlsCategory);
            jacketsList.add(boysCategory);
            jacketsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ЯКЕТА_ПАЛТА.toString());
            jacketsProductGroup.setCategories(jacketsList);
            productGroupsList.add(jacketsProductGroup);

            List<Categories> blousesList = new ArrayList<>();
            blousesList.add(womenCategory);
            blousesList.add(menCategory);
            ProductGroups blousesProductGroup = new ProductGroups();
            blousesProductGroup.setProductGroupName(ProductGroupsNamesEnum.БЛУЗИ_РИЗИ.toString());
            blousesProductGroup.setCategories(blousesList);
            productGroupsList.add(blousesProductGroup);

            List<Categories> shirtsList = new ArrayList<>();
            shirtsList.add(womenCategory);
            ProductGroups shirtsProductGroup = new ProductGroups();
            shirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ТЕНИСКИ_ТОПОВЕ.toString());
            shirtsProductGroup.setCategories(shirtsList);
            productGroupsList.add(shirtsProductGroup);

            List<Categories> trousersList = new ArrayList<>();
            trousersList.add(womenCategory);
            trousersList.add(menCategory);
            ProductGroups trousersProductGroup = new ProductGroups();
            trousersProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПАНТАЛОНИ.toString());
            trousersProductGroup.setCategories(trousersList);
            productGroupsList.add(trousersProductGroup);

            List<Categories> jeansList = new ArrayList<>();
            jeansList.add(womenCategory);
            jeansList.add(menCategory);
            jeansList.add(girlsCategory);
            jeansList.add(boysCategory);
            ProductGroups jeansProductGroup = new ProductGroups();
            jeansProductGroup.setProductGroupName(ProductGroupsNamesEnum.ДЪНКИ.toString());
            jeansProductGroup.setCategories(jeansList);
            productGroupsList.add(jeansProductGroup);

            List<Categories> skirtsList = new ArrayList<>();
            skirtsList.add(womenCategory);
            ProductGroups skirtsProductGroup = new ProductGroups();
            skirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПОЛИ_КЪСИ_ПАНТАЛОНИ.toString());
            skirtsProductGroup.setCategories(skirtsList);
            productGroupsList.add(skirtsProductGroup);

            List<Categories> costumesList = new ArrayList<>();
            costumesList.add(womenCategory);
            costumesList.add(menCategory);
            ProductGroups costumesProductGroup = new ProductGroups();
            costumesProductGroup.setProductGroupName(ProductGroupsNamesEnum.КОСТЮМИ.toString());
            costumesProductGroup.setCategories(costumesList);
            productGroupsList.add(costumesProductGroup);

            List<Categories> swimsuitsList = new ArrayList<>();
            swimsuitsList.add(womenCategory);
            swimsuitsList.add(menCategory);
            ProductGroups swimsuitsProductGroup = new ProductGroups();
            swimsuitsProductGroup.setProductGroupName(ProductGroupsNamesEnum.БАНСКИ_КОСТЮМИ.toString());
            swimsuitsProductGroup.setCategories(swimsuitsList);
            productGroupsList.add(swimsuitsProductGroup);

            List<Categories> forPregnantList = new ArrayList<>();
            forPregnantList.add(womenCategory);
            ProductGroups forPregnantProductGroup = new ProductGroups();
            forPregnantProductGroup.setProductGroupName(ProductGroupsNamesEnum.ОБЛЕКЛО_ЗА_БРЕМЕННИ_ЖЕНИ.toString());
            forPregnantProductGroup.setCategories(forPregnantList);
            productGroupsList.add(forPregnantProductGroup);

            List<Categories> sportList = new ArrayList<>();
            sportList.add(womenCategory);
            sportList.add(menCategory);
            sportList.add(girlsCategory);
            sportList.add(boysCategory);
            ProductGroups sportProductGroup = new ProductGroups();
            sportProductGroup.setProductGroupName(ProductGroupsNamesEnum.СПОРТНО_ОБЛЕКЛО.toString());
            sportProductGroup.setCategories(sportList);
            productGroupsList.add(sportProductGroup);

            List<Categories> underwearList = new ArrayList<>();
            underwearList.add(womenCategory);
            underwearList.add(menCategory);
            ProductGroups underwearProductGroup = new ProductGroups();
            underwearProductGroup.setProductGroupName(ProductGroupsNamesEnum.БЕЛЬО_ПИЖАМИ_И_ЧОРАПИ.toString());
            underwearProductGroup.setCategories(underwearList);
            productGroupsList.add(underwearProductGroup);

            List<Categories> pulloverList = new ArrayList<>();
            pulloverList.add(womenCategory);
            pulloverList.add(menCategory);
            pulloverList.add(boysCategory);
            ProductGroups pulloverProductGroup = new ProductGroups();
            pulloverProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПУЛОВЕРИ_СУИТЧЪРИ.toString());
            pulloverProductGroup.setCategories(pulloverList);
            productGroupsList.add(pulloverProductGroup);

            List<Categories> tShirtsList = new ArrayList<>();
            tShirtsList.add(menCategory);
            ProductGroups tShirtsProductGroup = new ProductGroups();
            tShirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ТЕНИСКИ.toString());
            tShirtsProductGroup.setCategories(tShirtsList);
            productGroupsList.add(tShirtsProductGroup);

            List<Categories> coatsList = new ArrayList<>();
            coatsList.add(menCategory);
            ProductGroups coatsProductGroup = new ProductGroups();
            coatsProductGroup.setProductGroupName(ProductGroupsNamesEnum.САКА.toString());
            coatsProductGroup.setCategories(coatsList);
            productGroupsList.add(coatsProductGroup);

            List<Categories> blousesAndShirtsList = new ArrayList<>();
            blousesAndShirtsList.add(girlsCategory);
            blousesAndShirtsList.add(boysCategory);
            ProductGroups blousesAndShirtsProductGroup = new ProductGroups();
            blousesAndShirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.БЛУЗИ_РИЗИ_ТЕНИСКИ.toString());
            blousesAndShirtsProductGroup.setCategories(blousesAndShirtsList);
            productGroupsList.add(blousesAndShirtsProductGroup);

            List<Categories> dressesAndSkirtsList = new ArrayList<>();
            dressesAndSkirtsList.add(girlsCategory);
            ProductGroups dressesAndSkirtsProductGroup = new ProductGroups();
            dressesAndSkirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.РОКЛИ_ПОЛИ.toString());
            dressesAndSkirtsProductGroup.setCategories(dressesAndSkirtsList);
            productGroupsList.add(dressesAndSkirtsProductGroup);

            List<Categories> shortTrousersList = new ArrayList<>();
            shortTrousersList.add(girlsCategory);
            ProductGroups shortTrousersProductGroup = new ProductGroups();
            shortTrousersProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПАНТАЛОНИ_КЪСИ_ПАНТАЛОНИ.toString());
            shortTrousersProductGroup.setCategories(shortTrousersList);
            productGroupsList.add(shortTrousersProductGroup);

            List<Categories> sweatshirtsList = new ArrayList<>();
            sweatshirtsList.add(girlsCategory);
            ProductGroups sweatshirtsProductGroup = new ProductGroups();
            sweatshirtsProductGroup.setProductGroupName(ProductGroupsNamesEnum.СУИТЧЪРИ_ПУЛОВЕРИ_ЖИЛЕТКИ.toString());
            sweatshirtsProductGroup.setCategories(sweatshirtsList);
            productGroupsList.add(sweatshirtsProductGroup);

            List<Categories> beachList = new ArrayList<>();
            beachList.add(girlsCategory);
            beachList.add(boysCategory);
            ProductGroups beachProductGroup = new ProductGroups();
            beachProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПЛАЖНО_ОБЛЕКЛО.toString());
            beachProductGroup.setCategories(beachList);
            productGroupsList.add(beachProductGroup);

            List<Categories> underwearAndSocksList = new ArrayList<>();
            underwearAndSocksList.add(girlsCategory);
            underwearAndSocksList.add(boysCategory);
            ProductGroups underwearAndSocksProductGroup = new ProductGroups();
            underwearAndSocksProductGroup.setProductGroupName(ProductGroupsNamesEnum.БЕЛЬО_И_ЧОРАПИ.toString());
            underwearAndSocksProductGroup.setCategories(underwearAndSocksList);
            productGroupsList.add(underwearAndSocksProductGroup);

            List<Categories> pyjamasList = new ArrayList<>();
            pyjamasList.add(girlsCategory);
            pyjamasList.add(boysCategory);
            ProductGroups pyjamasProductGroup = new ProductGroups();
            pyjamasProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПИЖАМИ.toString());
            pyjamasProductGroup.setCategories(pyjamasList);
            productGroupsList.add(pyjamasProductGroup);

            List<Categories> shortsList = new ArrayList<>();
            shortsList.add(boysCategory);
            ProductGroups shortsProductGroup = new ProductGroups();
            shortsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ПАНТАЛОНИ_И_ШОРТИ.toString());
            shortsProductGroup.setCategories(shortsList);
            productGroupsList.add(shortsProductGroup);

            List<Categories> shoesAndBagsList = new ArrayList<>();
            shoesAndBagsList.add(womenCategory);
            shoesAndBagsList.add(menCategory);
            shoesAndBagsList.add(girlsCategory);
            shoesAndBagsList.add(boysCategory);
            ProductGroups shoesAndBagsProductGroup = new ProductGroups();
            shoesAndBagsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ОБУВКИ_ЧАНТИ.toString());
            shoesAndBagsProductGroup.setCategories(shoesAndBagsList);
            productGroupsList.add(shoesAndBagsProductGroup);

            List<Categories> beltsList = new ArrayList<>();
            beltsList.add(womenCategory);
            beltsList.add(menCategory);
            ProductGroups beltsProductGroups = new ProductGroups();
            beltsProductGroups.setProductGroupName(ProductGroupsNamesEnum.КОЛАНИ_ПОРТМОНЕТА.toString());
            beltsProductGroups.setCategories(beltsList);
            productGroupsList.add(beltsProductGroups);

            List<Categories> hatsList = new ArrayList<>();
            hatsList.add(womenCategory);
            hatsList.add(menCategory);
            hatsList.add(girlsCategory);
            hatsList.add(boysCategory);
            ProductGroups hatsProductGroup = new ProductGroups();
            hatsProductGroup.setProductGroupName(ProductGroupsNamesEnum.ШАЛОВЕ_ШАПКИ_И_РЪКАВИЦИ.toString());
            hatsProductGroup.setCategories(hatsList);
            productGroupsList.add(hatsProductGroup);

            productGroupsRepository.saveAll(productGroupsList);


        }

    }

    @Override
    public List<ProductGroups> getAllProductGroupsForWomenCategory() {

        return productGroupsRepository.findByCategories(
                categoriesRepository.findByCategoriesEnum(CategoriesEnum.ЖЕНИ).get()).get();
    }

    @Override
    public List<ProductGroups> getAllProductGroupsForMenCategory() {
        return productGroupsRepository.findByCategories(
                categoriesRepository.findByCategoriesEnum(CategoriesEnum.МЪЖЕ).get()).get();
    }

    @Override
    public List<ProductGroups> getAllProductGroupsForGirlsCategory() {
        return productGroupsRepository.findByCategories(
                categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМИЧЕТА).get()).get();
    }

    @Override
    public List<ProductGroups> getAllProductGroupsForBoysCategory() {
        return productGroupsRepository.findByCategories(
                categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМЧЕТА).get()).get();
    }

    @Override
    public ProductGroups findProductGroupInListByName(List<ProductGroups> productGroups, String name) {
        List<String> productGroupNames = productGroups.stream()
                .map(ProductGroups::getProductGroupName).collect(Collectors.toList());

        int index = productGroupNames.indexOf(name);

        return productGroups.get(index);
    }
}
