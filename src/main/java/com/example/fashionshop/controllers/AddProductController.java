package com.example.fashionshop.controllers;

import com.example.fashionshop.models.dtos.forLogic.AddProductDto;
import com.example.fashionshop.models.enums.BrandNamesEnum;
import com.example.fashionshop.models.enums.SizesEnum;
import com.example.fashionshop.services.CategoriesService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AddProductController {

    private final CategoriesService categoriesService;

    public AddProductController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @ModelAttribute(name = "brandsList")
    public BrandNamesEnum[] brandNamesEnums() {
        return BrandNamesEnum.values();
    }

    @ModelAttribute(name = "sizesList")
    public SizesEnum[] sizesEnums() {
        return SizesEnum.values();
    }

    @GetMapping("/add-product")
    public String addProduct(Model model) {

        if (!model.containsAttribute("addProductDto")) {
            model.addAttribute("addProductDto", AddProductDto.construct());
        }

        model.addAttribute("categories", categoriesService.getAllCategoriesNames());

        return "add-product";
    }

    @PostMapping("/add-product")
    public String addProduct(@Valid AddProductDto addProductDto, BindingResult bindingResult,
                             RedirectAttributes rAttr) {

        if (bindingResult.hasErrors()) {
            rAttr.addFlashAttribute("addProductDto", addProductDto);
            rAttr.addFlashAttribute("org.springframework.validation.BindingResult.addProductDto",
                    bindingResult);

            return "redirect:/add-product";
        }

        return "redirect:home";
    }

}
