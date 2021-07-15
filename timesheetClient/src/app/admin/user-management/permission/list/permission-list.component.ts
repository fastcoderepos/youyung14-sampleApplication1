import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { IPermission } from '../ipermission';
import { PermissionService } from '../permission.service';
import { Router, ActivatedRoute } from '@angular/router';
import { PermissionNewComponent } from '../new/permission-new.component';
import { BaseListComponent, Globals, listColumnType, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';


@Component({
  selector: 'app-permission-list',
  templateUrl: './permission-list.component.html',
  styleUrls: ['./permission-list.component.scss']
})
export class PermissionListComponent extends BaseListComponent<IPermission> implements OnInit {

	title = 'Permission';
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public permissionService: PermissionService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, dialog, global, changeDetectorRefs, pickerDialogService, permissionService, errorService)
  }

	ngOnInit() {
		this.entityName = 'Permission';
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
		comp = PermissionNewComponent;
	}
	super.addNew(comp);
  }
  
}
