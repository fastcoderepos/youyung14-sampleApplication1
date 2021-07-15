import { Component, OnInit, Inject } from '@angular/core';
import { UsersroleExtendedService } from '../usersrole.service';

import { ActivatedRoute,Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { RoleExtendedService } from 'src/app/extended/admin/user-management/role/role.service';
import { UsersExtendedService } from 'src/app/extended/admin/user-management/users/users.service';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { UsersroleNewComponent } from 'src/app/admin/user-management/usersrole/index';

@Component({
  selector: 'app-usersrole-new',
  templateUrl: './usersrole-new.component.html',
  styleUrls: ['./usersrole-new.component.scss']
})
export class UsersroleNewExtendedComponent extends UsersroleNewComponent implements OnInit {
  
    title:string = "New Usersrole";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<UsersroleNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public usersroleExtendedService: UsersroleExtendedService,
		public errorService: ErrorService,
		public roleExtendedService: RoleExtendedService,
		public usersExtendedService: UsersExtendedService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, usersroleExtendedService, errorService,
		roleExtendedService,
		usersExtendedService,
		globalPermissionService,
		);
	}
 
	ngOnInit() {
		super.ngOnInit();
  }
     
}
