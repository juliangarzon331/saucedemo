package com.demo.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {

    public static final Target LABEL_TITLE= Target.the("Titulo")
            .locatedBy("//div[contains(text(), '{0}')]");
    public static final Target LABEL_PRODUCTO= Target.the("Producto")
            .located(By.xpath("//div[contains(@class, 'inventory_details_name')]"));

    public static final Target DROPDOWN_SORT_PRODUCT= Target.the("ORdernar producto")
            .located(By.xpath("//select[@data-test='product_sort_container']"));

    public static final Target LINK_ABOUT= Target.the("boton About")
            .located(By.id("about_sidebar_link"));
    public static final Target BOTON_MENU= Target.the("boton menu")
            .located(By.id("react-burger-menu-btn"));
    public static final Target PRICE_LIST= Target.the("Lista Precios")
            .located(By.xpath("//div[@class='inventory_item_price']"));


}
