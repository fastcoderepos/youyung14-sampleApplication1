
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { RolepermissionDetailsComponent, RolepermissionListComponent, RolepermissionNewComponent } from './';

const routes: Routes = [
	// { path: '', component: RolepermissionListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: RolepermissionDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: RolepermissionNewComponent, canActivate: [ AuthGuard ] },
];

export const rolepermissionRoute: ModuleWithProviders = RouterModule.forChild(routes);