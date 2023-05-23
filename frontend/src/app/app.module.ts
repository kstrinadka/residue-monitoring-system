import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './products/product-list/product-list.component';
import {HttpClientModule} from "@angular/common/http";
import {ProductService} from "./products/service/product.service";
import { BuyProductComponent } from './buy-product/buy-product.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    BuyProductComponent,
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],

  providers: [
    ProductService
  ],

  // стартовый компонент, с которого стартует приложение
  bootstrap: [AppComponent]
})
export class AppModule { }
