import { NgModule } from '@angular/core';;
import { GeneralListExtendedComponent } from './general-list/general-list.component';
import { GeneralNewExtendedComponent } from './general-new/general-new.component';
import { GeneralDetailsExtendedComponent } from './general-details/general-details.component';
import { FieldsExtendedComponent } from './fields/fields.component';
import { SharedModule } from 'src/app/common/shared';

const components = [
    GeneralListExtendedComponent,
    GeneralNewExtendedComponent,
    GeneralDetailsExtendedComponent,
    FieldsExtendedComponent
  ]
@NgModule({
	declarations: components,
	exports: components,
  imports: [
    SharedModule
  ]
})
export class GeneralComponentsExtendedModule {
}
