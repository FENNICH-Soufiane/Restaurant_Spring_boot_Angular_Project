export class Order {
  id: number;
  data_create: Date;
  data_update: Date;
  name: string;
  description: string;
  img: string;
  price: number;
  // id_category
  constructor(
    id_: number,
    data_create_: Date,
    data_update_: Date,
    name_: string,
    description_: string,
    image: string,
    price_: number
  ) {
    this.id = id_;
    this.data_create = data_create_;
    this.data_update = data_update_;
    this.name = name_;
    this.description = description_;
    this.img = image;
    this.price = price_;
  }
}
