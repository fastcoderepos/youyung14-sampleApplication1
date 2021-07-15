import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { Router, ActivatedRoute } from '@angular/router';

import { UsersroleExtendedService } from '../usersrole.service';
import { UsersroleNewExtendedComponent } from '../new/usersrole-new.component';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';

import { RoleExtendedService } from 'src/app/extended/admin/user-management/role/role.service';
import { UsersExtendedService } from 'src/app/extended/admin/user-management/users/users.service';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { UsersroleListComponent } from 'src/app/admin/user-management/usersrole/index';

@Component({
  selector: 'app-usersrole-list',
  templateUrl: './usersrole-list.component.html',
  styleUrls: ['./usersrole-list.component.scss']
})
export class UsersroleListExtendedComponent extends UsersroleListComponent implements OnInit {

	title:string = "Usersrole";
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public usersroleService: UsersroleExtendedService,
		public errorService: ErrorService,
		public roleService: RoleExtendedService,
		public usersService: UsersExtendedService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, global, dialog, changeDetectorRefs, pickerDialogService, usersroleService, errorService,
		roleService,
		usersService,
		globalPermissionService,
		)
  }

	ngOnInit() {
		super.ngOnInit();
	}
  
	addNew() {
		super.addNew(UsersroleNewExtendedComponent);
	}
  
}
