
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { UsersDetailsExtendedComponent, UsersListExtendedComponent , UsersNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: UsersListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: UsersDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: UsersNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const usersRoute: ModuleWithProviders = RouterModule.forChild(routes);