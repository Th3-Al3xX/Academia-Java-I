import { Component, OnInit } from '@angular/core';

export interface Cliente {
  id: number;
  nome: string;
  telefone: string;
}

const ELEMENT_DATA: Cliente[] = [
  {id: 1, nome: 'Antonio da Silva1', telefone: '4444 4441'},
  {id: 1, nome: 'Antonio da Silva2', telefone: '4444 4442'},
  {id: 1, nome: 'Antonio da Silva3', telefone: '4444 4443'},
  {id: 1, nome: 'Antonio da Silva4', telefone: '4444 4444'}
];

@Component({
  selector: 'app-crud-clientes',
  templateUrl: './crud-clientes.component.html',
  styleUrls: ['./crud-clientes.component.scss']
})
export class CrudClientesComponent implements OnInit {

  displayedColumns: string[] = ['id', 'nome', 'telefone'];
  dataSource = ELEMENT_DATA;
  
  constructor() { }

  ngOnInit(): void {
  }

}
