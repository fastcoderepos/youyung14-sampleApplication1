import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { Router, ActivatedRoute } from '@angular/router';

import { UsertaskExtendedService } from '../usertask.service';
import { UsertaskNewExtendedComponent } from '../new/usertask-new.component';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';

import { TaskExtendedService } from 'src/app/extended/entities/task/task.service';
import { UsersExtendedService } from 'src/app/extended/admin/user-management/users/users.service';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { UsertaskListComponent } from 'src/app/entities/usertask/index';

@Component({
  selector: 'app-usertask-list',
  templateUrl: './usertask-list.component.html',
  styleUrls: ['./usertask-list.component.scss']
})
export class UsertaskListExtendedComponent extends UsertaskListComponent implements OnInit {

	title:string = "Usertask";
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public usertaskService: UsertaskExtendedService,
		public errorService: ErrorService,
		public taskService: TaskExtendedService,
		public usersService: UsersExtendedService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, global, dialog, changeDetectorRefs, pickerDialogService, usertaskService, errorService,
		taskService,
		usersService,
		globalPermissionService,
		)
  }

	ngOnInit() {
		super.ngOnInit();
	}
  
	addNew() {
		super.addNew(UsertaskNewExtendedComponent);
	}
  
}
