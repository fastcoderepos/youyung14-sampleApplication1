import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { ITask } from '../itask';
import { TaskService } from '../task.service';
import { Router, ActivatedRoute } from '@angular/router';
import { TaskNewComponent } from '../new/task-new.component';
import { BaseListComponent, Globals, listColumnType, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { ProjectService } from 'src/app/entities/project/project.service';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.scss']
})
export class TaskListComponent extends BaseListComponent<ITask> implements OnInit {

	title = 'Task';
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public taskService: TaskService,
		public errorService: ErrorService,
		public projectService: ProjectService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, dialog, global, changeDetectorRefs, pickerDialogService, taskService, errorService)
  }

	ngOnInit() {
		this.entityName = 'Task';
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
					  	key: 'projectid',
					  	value: undefined,
					  	referencedkey: 'id'
					  },
					  
				],
				isParent: false,
				descriptiveField: 'projectDescriptiveField',
				referencedDescriptiveField: 'id',
				service: this.projectService,
				associatedObj: undefined,
				table: 'project',
				type: 'ManyToOne',
				url: 'tasks',
				listColumn: 'project',
				label: 'project',

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
				column: 'id',
				searchColumn: 'id',
				label: 'id',
				sort: true,
				filter: true,
				type: listColumnType.Number
			},
    		{
				column: 'isactive',
				searchColumn: 'isactive',
				label: 'isactive',
				sort: true,
				filter: true,
				type: listColumnType.Boolean
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
	  			column: 'projectDescriptiveField',
				searchColumn: 'project',
				label: 'project',
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
		comp = TaskNewComponent;
	}
	super.addNew(comp);
  }
  
}
