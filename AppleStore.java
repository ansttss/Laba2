import java.util.HashMap;
import java.util.Map;

//клас - магазин
public class AppleStore {
    ProductGroup devices;
    ProductGroup accesories;

    AppleStore() {

        devices = new ProductGroup("Електронні пристрої", "Побутова електроніка для щоденного домашнього та робочого користування.");

        Map<String, Product> devHash = new HashMap<>();

        Product iPhone7 = new Product("iPhone7", "Мобільний пристрій сьомого покоління", "Джонатан Айв", 20, 799);
        devHash.put(iPhone7.getName(), iPhone7);
        Product MacbookPro = new Product("MacBook Pro", "Потужний користувацький комп'ютер", "Роберт Браннер", 12, 1599);
        devHash.put(MacbookPro.getName(), MacbookPro);
        Product AppleWatch = new Product("Apple Watch", "Розумний годинник", "Тім Кук", 53, 499);
        devHash.put(AppleWatch.getName(), AppleWatch);
        Product iPod = new Product("iPod", "Графічний пристрій без підтримки стільникового зв'язку", "Едді К'ю", 0, 299);
        devHash.put(iPod.getName(), iPod);
        Product iMac = new Product("iMac", "Комп'ютер для домашнього користування", "Філ Шиллер", 9, 1349);
        devHash.put(iMac.getName(), iMac);
        Product AppleTV = new Product("Apple TV", "Інтерактивне телебачення", "Ангела Арендс", 11, 149);
        devHash.put(AppleTV.getName(), AppleTV);

        devices.setAllproducts(devHash);

        accesories = new ProductGroup("Аксесуари", "Аксесуари для підтримки роботи пристроїв.");

    }
}
