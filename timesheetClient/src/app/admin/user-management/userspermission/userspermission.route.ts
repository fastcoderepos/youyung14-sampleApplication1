
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { UserspermissionDetailsComponent, UserspermissionListComponent, UserspermissionNewComponent } from './';

const routes: Routes = [
	// { path: '', component: UserspermissionListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: UserspermissionDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: UserspermissionNewComponent, canActivate: [ AuthGuard ] },
];

export const userspermissionRoute: ModuleWithProviders = RouterModule.forChild(routes);