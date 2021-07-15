import { NgModule } from '@angular/core';
import { LoginExtendedComponent } from './login/login.component';
import { MainNavExtendedComponent } from './main-nav/main-nav.component';
import { DashboardExtendedComponent } from './dashboard/dashboard.component';
import { SharedModule } from 'src/app/common/shared';
import { CoreRoutingExtendedModule } from './core.routing';

const components = [
    DashboardExtendedComponent,
    LoginExtendedComponent,
    MainNavExtendedComponent
]
@NgModule({
	declarations: components,
	exports: components,
  imports: [
    SharedModule,
    CoreRoutingExtendedModule
  ]
})
export class CoreExtendedModule {
}
