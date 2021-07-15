
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { CustomerDetailsExtendedComponent, CustomerListExtendedComponent , CustomerNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: CustomerListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: CustomerDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: CustomerNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const customerRoute: ModuleWithProviders = RouterModule.forChild(routes);