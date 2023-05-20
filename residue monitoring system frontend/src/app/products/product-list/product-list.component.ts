import { Component } from '@angular/core';
import {Product} from "../dto/product";
import {ProductService} from "../service/product.service";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {

  products: Product[];
  productsCount: number;
  totalEarned: number;
  outOfStockAmount: number;
  possibleProfit: number;
  lossesAmount: number;

  constructor(private productService: ProductService) {
  }

  /**
   *  обновляет список продуктов на сайте и необходимые показатели
   */
  private updateParameters(data: Product[]): void {
    this.products = data;
    this.productsCount = data.length;
    this.totalEarned = this.countTotalEarned(data);
    this.outOfStockAmount = this.coutOutOfStockAmount(data);
    this.possibleProfit = this.countPossibleProfit(data);
    this.lossesAmount = this.countLossesAmount(data);
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

  private coutOutOfStockAmount(data: Product[]) {
    var sumOutOfStock:number = 0;
    for (let product of data) {
      sumOutOfStock += product.outOfStock;
    }
    return sumOutOfStock;
  }

  private countTotalEarned(data: Product[]) {
    var totalEarnedSum:number = 0;
    for (let product of data) {
      totalEarnedSum += product.cost * product.soldQuantity;
    }
    return totalEarnedSum;
  }

  private countPossibleProfit(data: Product[]) {
    var lossesAmount:number = this.countLossesAmount(data);
    var totalEarnedSum:number = this.countTotalEarned(data);
    return lossesAmount + totalEarnedSum;
  }

  private countLossesAmount(data: Product[]) {
    var lossesAmount:number = 0;
    for (let product of data) {
      lossesAmount += product.cost * product.outOfStock;
    }
    return lossesAmount;
  }
}
