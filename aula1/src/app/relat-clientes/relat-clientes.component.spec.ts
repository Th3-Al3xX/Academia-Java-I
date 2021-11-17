import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatClientesComponent } from './relat-clientes.component';

describe('RelatClientesComponent', () => {
  let component: RelatClientesComponent;
  let fixture: ComponentFixture<RelatClientesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RelatClientesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatClientesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
