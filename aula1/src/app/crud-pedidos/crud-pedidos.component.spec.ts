import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudPedidosComponent } from './crud-pedidos.component';

describe('CrudPedidosComponent', () => {
  let component: CrudPedidosComponent;
  let fixture: ComponentFixture<CrudPedidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrudPedidosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CrudPedidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
