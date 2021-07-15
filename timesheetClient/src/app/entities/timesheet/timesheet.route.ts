
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { TimesheetDetailsComponent, TimesheetListComponent, TimesheetNewComponent } from './';

const routes: Routes = [
	// { path: '', component: TimesheetListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: TimesheetDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: TimesheetNewComponent, canActivate: [ AuthGuard ] },
];

export const timesheetRoute: ModuleWithProviders = RouterModule.forChild(routes);