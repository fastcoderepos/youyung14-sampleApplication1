import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { FormBuilder } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';

import { TimeofftypeExtendedService } from '../timeofftype.service';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';


import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { TimeofftypeDetailsComponent } from 'src/app/entities/timeofftype/index';

@Component({
  selector: 'app-timeofftype-details',
  templateUrl: './timeofftype-details.component.html',
  styleUrls: ['./timeofftype-details.component.scss']
})
export class TimeofftypeDetailsExtendedComponent extends TimeofftypeDetailsComponent implements OnInit {
	title:string='Timeofftype';
	parentUrl:string='timeofftype';
	//roles: IRole[];  
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public global: Globals,
		public timeofftypeExtendedService: TimeofftypeExtendedService,
		public pickerDialogService: PickerDialogService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, global, timeofftypeExtendedService, pickerDialogService, errorService,
		globalPermissionService,
		);
  }

	ngOnInit() {
		super.ngOnInit();
  }
  
}
