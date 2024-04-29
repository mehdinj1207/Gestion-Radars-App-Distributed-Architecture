import { NavItem } from './nav-item/nav-item';

export const navItems: NavItem[] = [
  {
    navCap: 'Home',
  },
  {
    displayName: 'Dashboard',
    iconName: 'layout-dashboard',
    route: '/dashboard',
  },
  {
    navCap: 'Other Features',
  },
  
  {
    displayName: 'Radars',
    iconName: 'radar',
    route: '/ui-components/radars',
  },
  {
    displayName: 'Owners',
    iconName: 'user',
    route: '/ui-components/owner',
  },
  {
    displayName: 'Vehicles',
    iconName: 'car',
    route: '/ui-components/vehicles',
  },
  {
    displayName: 'Infractions',
    iconName: 'currency',
    route: '/ui-components/infractions',
  },
];
