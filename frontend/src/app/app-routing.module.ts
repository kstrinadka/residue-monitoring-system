import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {ProductListComponent} from "./products/product-list/product-list.component";
import {BuyProductComponent} from "./buy-product/buy-product.component";

// связывание адреса и компонента
const routes: Routes = [
  { path: 'main', component: AppComponent },

  { path: 'productlist', component: ProductListComponent },
  { path: 'buyproducts', component: BuyProductComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
