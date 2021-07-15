import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { IRole } from '../irole';
import { RoleService } from '../role.service';
import { Router, ActivatedRoute } from '@angular/router';
import { RoleNewComponent } from '../new/role-new.component';
import { BaseListComponent, Globals, listColumnType, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';


@Component({
  selector: 'app-role-list',
  templateUrl: './role-list.component.html',
  styleUrls: ['./role-list.component.scss']
})
export class RoleListComponent extends BaseListComponent<IRole> implements OnInit {

	title = 'Role';
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public roleService: RoleService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, dialog, global, changeDetectorRefs, pickerDialogService, roleService, errorService)
  }

	ngOnInit() {
		this.entityName = 'Role';
		this.setAssociation();
		this.setColumns();
		this.primaryKeys = ['id', ]
		super.ngOnInit();
	}
  
  
	setAssociation(){
  	
		this.associations = [
		];
	}
  
  	setColumns(){
  		this.columns = [
    		{
				column: 'displayName',
				searchColumn: 'displayName',
				label: 'display Name',
				sort: true,
				filter: true,
				type: listColumnType.String
			},
    		{
				column: 'id',
				searchColumn: 'id',
				label: 'id',
				sort: true,
				filter: true,
				type: listColumnType.Number
			},
    		{
				column: 'name',
				searchColumn: 'name',
				label: 'name',
				sort: true,
				filter: true,
				type: listColumnType.String
			},
		  	{
				column: 'actions',
				label: 'Actions',
				sort: false,
				filter: false,
				type: listColumnType.String
			}
		];
		this.selectedColumns = this.columns;
		this.displayedColumns = this.columns.map((obj) => { return obj.column });
  	}
  addNew(comp) {
	if(!comp){
		comp = RoleNewComponent;
	}
	super.addNew(comp);
  }
  
}
