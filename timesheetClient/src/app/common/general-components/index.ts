// import { GeneralListComponent } from './general-list/general-list.component';
// import { GeneralNewComponent } from './general-new/general-new.component';
// import { GeneralDetailsComponent } from './general-details/general-details.component';
// import { FieldsComponent } from './fields/fields.component';

import { GeneralListExtendedComponent } from './extended/general-list/general-list.component';
import { GeneralDetailsExtendedComponent } from './extended/general-details/general-details.component';
import { GeneralNewExtendedComponent } from './extended/general-new/general-new.component';
import { FieldsExtendedComponent } from './extended/fields/fields.component';

// export let ListComponent = GeneralListComponent;
// export let DetailsComponent = GeneralDetailsComponent;
// export let NewComponent = GeneralNewComponent;
// export let FieldsComp = FieldsComponent;

export let DetailsComponent = GeneralDetailsExtendedComponent;
export let ListComponent = GeneralListExtendedComponent;
export let NewComponent = GeneralNewExtendedComponent;
export let FieldsComp = FieldsExtendedComponent;

export let GeneralComponents: any[] = [
    DetailsComponent,
    NewComponent,
    ListComponent,
    FieldsComp,
]