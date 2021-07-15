
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { TimesheetstatusDetailsExtendedComponent, TimesheetstatusListExtendedComponent , TimesheetstatusNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: TimesheetstatusListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: TimesheetstatusDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: TimesheetstatusNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const timesheetstatusRoute: ModuleWithProviders = RouterModule.forChild(routes);