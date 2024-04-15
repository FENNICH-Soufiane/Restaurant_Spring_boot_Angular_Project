import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { OrderItemsComponent } from "./components/order-items/order-items.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, OrderItemsComponent]
})
export class AppComponent {
  title = 'front_end';
}
