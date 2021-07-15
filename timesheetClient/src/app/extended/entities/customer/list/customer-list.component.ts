import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { MatDialog } from '@angular/material';

import { Router, ActivatedRoute } from '@angular/router';

import { CustomerExtendedService } from '../customer.service';
import { CustomerNewExtendedComponent } from '../new/customer-new.component';
import { Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';

import { GlobalPermissionService } from 'src/app/core/global-permission.service';
import { CustomerListComponent } from 'src/app/entities/customer/index';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListExtendedComponent extends CustomerListComponent implements OnInit {

	title:string = "Customer";
	constructor(
		public router: Router,
		public route: ActivatedRoute,
		public global: Globals,
		public dialog: MatDialog,
		public changeDetectorRefs: ChangeDetectorRef,
		public pickerDialogService: PickerDialogService,
		public customerService: CustomerExtendedService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) { 
		super(router, route, global, dialog, changeDetectorRefs, pickerDialogService, customerService, errorService,
		globalPermissionService,
		)
  }

	ngOnInit() {
		super.ngOnInit();
	}
  
	addNew() {
		super.addNew(CustomerNewExtendedComponent);
	}
  
}
