
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { AuthGuard } from 'src/app/core/auth-guard';


const routes: Routes = [
	{
		path: 'rolepermission',
		loadChildren: './user-management/rolepermission/rolepermission.module#RolepermissionModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'role',
		loadChildren: './user-management/role/role.module#RoleModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'permission',
		loadChildren: './user-management/permission/permission.module#PermissionModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'usersrole',
		loadChildren: './user-management/usersrole/usersrole.module#UsersroleModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'users',
		loadChildren: './user-management/users/users.module#UsersModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'userspermission',
		loadChildren: './user-management/userspermission/userspermission.module#UserspermissionModule',
		canActivate: [AuthGuard]
	},
];

export const routingModule: ModuleWithProviders = RouterModule.forChild(routes);