import { Component } from '@angular/core';
import {Product} from "../products/dto/product";
import {ProductService} from "../products/service/product.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-buy-product',
  templateUrl: './buy-product.component.html',
  styleUrls: ['./buy-product.component.css']
})
export class BuyProductComponent {


  products: Product[];
  productsCount: number;
  error: string;

  constructor(private productService: ProductService,
              private route: ActivatedRoute,
              private router: Router,) {
  }

  /**
   *  обновляет список продуктов на сайте и необходимые показатели
   */
  private updateParameters(data: Product[]): void {
    this.products = data;
    this.productsCount = data.length;
  }

  ngOnInit() {
    this.productService.findAll().subscribe(data => {
      this.updateParameters(data)
    });
  }

  public findAll(): void {
    this.productService.findAll().subscribe(data => {
      this.updateParameters(data)
    });
  }

  /**
   *  конвертирует строку в число
   */
  private convertStringToNumber(input: string) {
    console.log(input);
    var numberValue: number;

    if (!input) return 0;

    if(!isNaN(Number(input))){
      numberValue = Number(input);
      return numberValue;
    }

    if (input.trim().length==0) {
      return 0;
    }
    return Number(input);
  }

  getAllCornices() {
    this.productService.getAllCornices().subscribe(data => {
      this.updateParameters(data)
    });
  }

  getAllMoldings() {
    this.productService.getAllMoldings().subscribe(data => {
      this.updateParameters(data)
    });
  }

  getAllFlavorings() {
    this.productService.getAllFlavorings().subscribe(data => {
      this.updateParameters(data)
    });
  }

  getAllTubs() {
    this.productService.getAllTubs().subscribe(data => {
      this.updateParameters(data)
    });
  }

  getAllWindowsills() {
    this.productService.getAllWindowsills().subscribe(data => {
      this.updateParameters(data)
    });
  }

  getAllHats() {
    this.productService.getAllHats().subscribe(data => {
      this.updateParameters(data)
    });
  }


  buyProduct(product: Product, value: string) {
    var quantity = this.convertStringToNumber(value);
    var item_number = product.item_number;

    this.productService.buyProduct(item_number, quantity).subscribe(
      product => {
        console.log('Покупка успешно совершена:', product);
        this.updateProductList();
        // this.gotoProductList();
      },
      error => {
        console.log('Ошибка при покупке товара:', error);
        this.error = 'Ошибка при покупке товара';
      }
    );
  }

  gotoProductList() {
    this.router.navigate(['/buyproducts']);
  }

  updateProductList() {
    this.findAll();
    // if (product.type.categoryname == 'карниз') {
    //   this.getAllCornices();
    // }
    // if (product.type.categoryname == 'молдинг') {
    //   this.getAllMoldings();
    // }
    // if (product.type.categoryname == 'ароматизатор') {
    //   this.getAllFlavorings();
    // }
    // if (product.type.categoryname == 'бадья') {
    //   this.getAllTubs();
    // }
    // if (product.type.categoryname == 'подоконник') {
    //   this.getAllWindowsills();
    // }
    // if (product.type.categoryname == 'шапка') {
    //   this.getAllHats();
    // }

  }
}
