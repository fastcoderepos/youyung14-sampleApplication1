import { Component, OnInit, Inject } from '@angular/core';
import { TimesheetExtendedService } from '../timesheet.service';

import { ActivatedRoute,Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { TimesheetstatusExtendedService } from 'src/app/extended/entities/timesheetstatus/timesheetstatus.service';
import { UsersExtendedService } from 'src/app/extended/admin/user-management/users/users.service';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { TimesheetNewComponent } from 'src/app/entities/timesheet/index';

@Component({
  selector: 'app-timesheet-new',
  templateUrl: './timesheet-new.component.html',
  styleUrls: ['./timesheet-new.component.scss']
})
export class TimesheetNewExtendedComponent extends TimesheetNewComponent implements OnInit {
  
    title:string = "New Timesheet";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<TimesheetNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public timesheetExtendedService: TimesheetExtendedService,
		public errorService: ErrorService,
		public timesheetstatusExtendedService: TimesheetstatusExtendedService,
		public usersExtendedService: UsersExtendedService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, timesheetExtendedService, errorService,
		timesheetstatusExtendedService,
		usersExtendedService,
		globalPermissionService,
		);
	}
 
	ngOnInit() {
		super.ngOnInit();
  }
     
}
