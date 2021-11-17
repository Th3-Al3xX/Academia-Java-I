import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudFornecedoresComponent } from './crud-fornecedores.component';

describe('CrudFornecedoresComponent', () => {
  let component: CrudFornecedoresComponent;
  let fixture: ComponentFixture<CrudFornecedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrudFornecedoresComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CrudFornecedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
