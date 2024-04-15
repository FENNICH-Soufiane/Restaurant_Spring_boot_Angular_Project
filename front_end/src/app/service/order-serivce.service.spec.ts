import { TestBed } from '@angular/core/testing';

import { OrderSerivceService } from './order-serivce.service';

describe('OrderSerivceService', () => {
  let service: OrderSerivceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OrderSerivceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
