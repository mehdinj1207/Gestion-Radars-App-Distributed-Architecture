import { Routes } from '@angular/router';

// ui
import { AppBadgeComponent } from './badge/badge.component';
import { AppChipsComponent } from './chips/chips.component';
import { InfractionsComponent } from './infractions/infractions.component';
import { AppListsComponent } from './lists/lists.component';
import { AppMenuComponent } from './menu/menu.component';
import { OwnerComponent } from './owner/owner.component';
import { RadarsComponent } from './radars/radars.component';
import { AppTooltipsComponent } from './tooltips/tooltips.component';
import { VehiclesComponent } from './vehicles/vehicles.component';

export const UiComponentsRoutes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'badge',
        component: AppBadgeComponent,
      },
      {
        path: 'chips',
        component: AppChipsComponent,
      },
      {
        path: 'lists',
        component: AppListsComponent,
      },
      {
        path: 'menu',
        component: AppMenuComponent,
      },
      {
        path: 'tooltips',
        component: AppTooltipsComponent,
      },
      {
        path: 'radars',
        component: RadarsComponent,
      },
      {
        path: 'owner',
        component: OwnerComponent,
      },
      {
        path: 'vehicles',
        component: VehiclesComponent,
      },
      {
        path: 'infractions',
        component: InfractionsComponent,
      }
    ],
  },
];
