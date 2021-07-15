
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { TimesheetstatusDetailsComponent, TimesheetstatusListComponent, TimesheetstatusNewComponent } from './';

const routes: Routes = [
	// { path: '', component: TimesheetstatusListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: TimesheetstatusDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: TimesheetstatusNewComponent, canActivate: [ AuthGuard ] },
];

export const timesheetstatusRoute: ModuleWithProviders = RouterModule.forChild(routes);