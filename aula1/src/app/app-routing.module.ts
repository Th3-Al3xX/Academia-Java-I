import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CrudClientesComponent } from './crud-clientes/crud-clientes.component';
import { CrudFornecedoresComponent } from './crud-fornecedores/crud-fornecedores.component';
import { CrudPedidosComponent } from './crud-pedidos/crud-pedidos.component';
import { CrudProdutosComponent } from './crud-produtos/crud-produtos.component';
import { RelatClientesComponent } from './relat-clientes/relat-clientes.component';
import { RelatFornecedoresComponent } from './relat-fornecedores/relat-fornecedores.component';
import { RelatProdutosComponent } from './relat-produtos/relat-produtos.component';

const routes: Routes = [
  { path: 'crud-clientes', component: CrudClientesComponent },
  { path: 'crud-fornecedores', component: CrudFornecedoresComponent},
  { path: 'crud-produtos', component: CrudProdutosComponent},
  { path: 'crud-pedidos', component: CrudPedidosComponent},
  { path: 'relat-clientes', component: RelatClientesComponent},
  { path: 'relat-fornecedores', component: RelatFornecedoresComponent},
  { path: 'relat-produtos', component: RelatProdutosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
