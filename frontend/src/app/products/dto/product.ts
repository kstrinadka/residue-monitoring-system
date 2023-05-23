
export class ProductFront {
  id: number;
  item_number: string;
  name: string;
  rest: number;
  type_id: number;
  cost: number;
  outOfStock: number;
  sold_quantity: number;
}

export class Product {
  id: number;
  item_number: string;
  name: string;
  rest: number;
  type: Category;
  cost: number;
  outOfStock: number;
  soldQuantity: number;
}

export class Category {
  id: number;
  categoryname: string
}
