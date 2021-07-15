
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { RolepermissionDetailsExtendedComponent, RolepermissionListExtendedComponent , RolepermissionNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: RolepermissionListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: RolepermissionDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: RolepermissionNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const rolepermissionRoute: ModuleWithProviders = RouterModule.forChild(routes);