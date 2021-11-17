import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatProdutosComponent } from './relat-produtos.component';

describe('RelatProdutosComponent', () => {
  let component: RelatProdutosComponent;
  let fixture: ComponentFixture<RelatProdutosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RelatProdutosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatProdutosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
