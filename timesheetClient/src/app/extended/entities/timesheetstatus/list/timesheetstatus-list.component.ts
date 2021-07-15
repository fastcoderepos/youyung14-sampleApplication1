import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { Router, ActivatedRoute } from '@angular/router';

import { TimesheetstatusExtendedService } from '../timesheetstatus.service';
import { TimesheetstatusNewExtendedComponent } from '../new/timesheetstatus-new.component';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';

import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { TimesheetstatusListComponent } from 'src/app/entities/timesheetstatus/index';

@Component({
  selector: 'app-timesheetstatus-list',
  templateUrl: './timesheetstatus-list.component.html',
  styleUrls: ['./timesheetstatus-list.component.scss']
})
export class TimesheetstatusListExtendedComponent extends TimesheetstatusListComponent implements OnInit {

	title:string = "Timesheetstatus";
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public timesheetstatusService: TimesheetstatusExtendedService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, global, dialog, changeDetectorRefs, pickerDialogService, timesheetstatusService, errorService,
		globalPermissionService,
		)
  }

	ngOnInit() {
		super.ngOnInit();
	}
  
	addNew() {
		super.addNew(TimesheetstatusNewExtendedComponent);
	}
  
}
