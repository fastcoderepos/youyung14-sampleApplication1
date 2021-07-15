
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { CustomerDetailsComponent, CustomerListComponent, CustomerNewComponent } from './';

const routes: Routes = [
	// { path: '', component: CustomerListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: CustomerDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: CustomerNewComponent, canActivate: [ AuthGuard ] },
];

export const customerRoute: ModuleWithProviders = RouterModule.forChild(routes);