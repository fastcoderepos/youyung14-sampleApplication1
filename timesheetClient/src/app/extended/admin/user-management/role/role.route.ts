
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { RoleDetailsExtendedComponent, RoleListExtendedComponent , RoleNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: RoleListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: RoleDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: RoleNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const roleRoute: ModuleWithProviders = RouterModule.forChild(routes);