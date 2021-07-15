import { Component, OnInit, Inject } from '@angular/core';
import { RoleExtendedService } from '../role.service';

import { ActivatedRoute,Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { RoleNewComponent } from 'src/app/admin/user-management/role/index';

@Component({
  selector: 'app-role-new',
  templateUrl: './role-new.component.html',
  styleUrls: ['./role-new.component.scss']
})
export class RoleNewExtendedComponent extends RoleNewComponent implements OnInit {
  
    title:string = "New Role";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<RoleNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public roleExtendedService: RoleExtendedService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, roleExtendedService, errorService,
		globalPermissionService,
		);
	}
 
	ngOnInit() {
		super.ngOnInit();
  }
     
}
