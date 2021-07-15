import { Component, OnInit, Inject } from '@angular/core';
import { PermissionExtendedService } from '../permission.service';

import { ActivatedRoute,Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { PermissionNewComponent } from 'src/app/admin/user-management/permission/index';

@Component({
  selector: 'app-permission-new',
  templateUrl: './permission-new.component.html',
  styleUrls: ['./permission-new.component.scss']
})
export class PermissionNewExtendedComponent extends PermissionNewComponent implements OnInit {
  
    title:string = "New Permission";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<PermissionNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public permissionExtendedService: PermissionExtendedService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, permissionExtendedService, errorService,
		globalPermissionService,
		);
	}
 
	ngOnInit() {
		super.ngOnInit();
  }
     
}
