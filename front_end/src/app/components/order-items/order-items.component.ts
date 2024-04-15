import { Component, OnInit } from '@angular/core';
import { Order } from '../../model/order';
import { OrderSerivceService } from './../../service/order-serivce.service';

@Component({
  selector: 'app-order-items',
  standalone: true,
  imports: [],
  templateUrl: './order-items.component.html',
  styleUrl: './order-items.component.css',
})
export class OrderItemsComponent implements OnInit {
  orders: Order[] = [];
  constructor(private order: OrderSerivceService) {}

  ngOnInit(): void {
    this.getOrders();
  }

  getOrders() {
    this.order.getOrders().subscribe((data) => {
      this.orders = data;
    });
  }
}
