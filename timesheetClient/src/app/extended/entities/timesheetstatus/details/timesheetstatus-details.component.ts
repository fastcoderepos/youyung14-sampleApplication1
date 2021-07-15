import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';

import { TimesheetstatusExtendedService } from '../timesheetstatus.service';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';


import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { TimesheetstatusDetailsComponent } from 'src/app/entities/timesheetstatus/index';

@Component({
  selector: 'app-timesheetstatus-details',
  templateUrl: './timesheetstatus-details.component.html',
  styleUrls: ['./timesheetstatus-details.component.scss']
})
export class TimesheetstatusDetailsExtendedComponent extends TimesheetstatusDetailsComponent implements OnInit {
	title:string='Timesheetstatus';
	parentUrl:string='timesheetstatus';
	//roles: IRole[];  
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public global: Globals,
		public timesheetstatusExtendedService: TimesheetstatusExtendedService,
		public pickerDialogService: PickerDialogService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, global, timesheetstatusExtendedService, pickerDialogService, errorService,
		globalPermissionService,
		);
  }

	ngOnInit() {
		super.ngOnInit();
  }
  
}
