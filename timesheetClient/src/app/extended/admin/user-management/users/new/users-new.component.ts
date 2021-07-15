import { Component, OnInit, Inject } from '@angular/core';
import { UsersExtendedService } from '../users.service';

import { ActivatedRoute,Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { UsersNewComponent } from 'src/app/admin/user-management/users/index';

@Component({
  selector: 'app-users-new',
  templateUrl: './users-new.component.html',
  styleUrls: ['./users-new.component.scss']
})
export class UsersNewExtendedComponent extends UsersNewComponent implements OnInit {
  
    title:string = "New Users";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<UsersNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public usersExtendedService: UsersExtendedService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, usersExtendedService, errorService,
		globalPermissionService,
		);
	}
 
	ngOnInit() {
		super.ngOnInit();
  }
     
}
