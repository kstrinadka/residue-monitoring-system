import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Product} from "../dto/product";
import {Observable} from "rxjs";

@Injectable()
export class ProductService {

  constructor(private http: HttpClient) { }

  /**
   *  - Перечень всех продуктов
   */
  public  findAll(): Observable<Product[]> {
    let url = `http://localhost:8080/main/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех молдингов
   */
  public  getAllMoldings(): Observable<Product[]> {
    let url = `http://localhost:8080/moldings/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех освежителей воздуха
   */
  public  getAllFlavorings(): Observable<Product[]> {
    let url = `http://localhost:8080/flavoring/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех карнизов
   */
  public  getAllCornices(): Observable<Product[]> {
    let url = `http://localhost:8080/cornices/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех бадей
   */
  public  getAllTubs(): Observable<Product[]> {
    let url = `http://localhost:8080/tub/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех подоконников
   */
  public  getAllWindowsills(): Observable<Product[]> {
    let url = `http://localhost:8080/windowsill/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  - Перечень всех банных шляп
   */
  public  getAllHats(): Observable<Product[]> {
    let url = `http://localhost:8080/hats/all`;
    return this.http.get<Product[]>(url);
  }

  /**
   *  Купить выбранный товар в заданном количестве
   */
  public buyProduct(item_number: string, quantity: number): Observable<Product[]> {
    console.log('item_number = ', item_number);
    console.log('quantity = ', quantity);

    // let params = new HttpParams();
    let params = new HttpParams()
      .set('item_number', item_number)
      .set('quantity', quantity.toString());

    let url = `http://localhost:8080/buy/trytobuy`;
    return this.http.put<Product[]>(url, null, { params: params });
  }

  /**
   *  Купить выбранный товар в заданном количестве
   */
  public resetSystem(): Observable<Product[]> {
    let url = `http://localhost:8080/reset/all`;
    return this.http.put<Product[]>(url, null);
  }


  /**
   *  - Перечень всех out of stock товаров
   */
  public  getOutOfStockStatistic(): Observable<Product[]> {
    let url = `http://localhost:8080/main/all/outofstock`;
    return this.http.get<Product[]>(url);
  }
}
