import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatFornecedoresComponent } from './relat-fornecedores.component';

describe('RelatFornecedoresComponent', () => {
  let component: RelatFornecedoresComponent;
  let fixture: ComponentFixture<RelatFornecedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RelatFornecedoresComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatFornecedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
