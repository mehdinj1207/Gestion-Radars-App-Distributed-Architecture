import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehiculeDialogComponent } from './vehicule-dialog.component';

describe('VehiculeDialogComponent', () => {
  let component: VehiculeDialogComponent;
  let fixture: ComponentFixture<VehiculeDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehiculeDialogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VehiculeDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
