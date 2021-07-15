import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { IProject } from '../iproject';
import { ProjectService } from '../project.service';
import { Router, ActivatedRoute } from '@angular/router';
import { ProjectNewComponent } from '../new/project-new.component';
import { BaseListComponent, Globals, listColumnType, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { CustomerService } from 'src/app/entities/customer/customer.service';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss']
})
export class ProjectListComponent extends BaseListComponent<IProject> implements OnInit {

	title = 'Project';
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public projectService: ProjectService,
		public errorService: ErrorService,
		public customerService: CustomerService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, dialog, global, changeDetectorRefs, pickerDialogService, projectService, errorService)
  }

	ngOnInit() {
		this.entityName = 'Project';
		this.setAssociation();
		this.setColumns();
		this.primaryKeys = ['id', ]
		super.ngOnInit();
	}
  
  
	setAssociation(){
  	
		this.associations = [
			{
				column: [
            {
					  	key: 'customerid',
					  	value: undefined,
					  	referencedkey: 'customerid'
					  },
					  
				],
				isParent: false,
				descriptiveField: 'customerDescriptiveField',
				referencedDescriptiveField: 'customerid',
				service: this.customerService,
				associatedObj: undefined,
				table: 'customer',
				type: 'ManyToOne',
				url: 'projects',
				listColumn: 'customer',
				label: 'customer',

			},
		];
	}
  
  	setColumns(){
  		this.columns = [
    		{
				column: 'description',
				searchColumn: 'description',
				label: 'description',
				sort: true,
				filter: true,
				type: listColumnType.String
			},
    		{
				column: 'enddate',
				searchColumn: 'enddate',
				label: 'enddate',
				sort: true,
				filter: true,
				type: listColumnType.Date
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
				column: 'startdate',
				searchColumn: 'startdate',
				label: 'startdate',
				sort: true,
				filter: true,
				type: listColumnType.Date
			},
			{
	  			column: 'customerDescriptiveField',
				searchColumn: 'customer',
				label: 'customer',
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
		comp = ProjectNewComponent;
	}
	super.addNew(comp);
  }
  
}
