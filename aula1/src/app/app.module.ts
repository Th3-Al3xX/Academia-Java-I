import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatTableModule} from '@angular/material/table';
import {MatCardModule} from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatDividerModule} from '@angular/material/divider';
import {MatIconModule} from '@angular/material/icon';

import { TopoComponent } from './topo/topo.component';
import { CrudClientesComponent } from './crud-clientes/crud-clientes.component';
import { CrudFornecedoresComponent } from './crud-fornecedores/crud-fornecedores.component';
import { CrudProdutosComponent } from './crud-produtos/crud-produtos.component';
import { CrudPedidosComponent } from './crud-pedidos/crud-pedidos.component';
import { RelatClientesComponent } from './relat-clientes/relat-clientes.component';
import { RelatFornecedoresComponent } from './relat-fornecedores/relat-fornecedores.component';
import { RelatProdutosComponent } from './relat-produtos/relat-produtos.component';

@NgModule({
  declarations: [
    AppComponent,
    TopoComponent,
    CrudClientesComponent,
    CrudFornecedoresComponent,
    CrudProdutosComponent,
    CrudPedidosComponent,
    RelatClientesComponent,
    RelatFornecedoresComponent,
    RelatProdutosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatToolbarModule,
    MatGridListModule,
    MatTableModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatDividerModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
