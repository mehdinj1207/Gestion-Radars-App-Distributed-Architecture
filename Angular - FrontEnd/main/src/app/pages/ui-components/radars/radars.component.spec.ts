import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RadarsComponent } from './radars.component';

describe('RadarsComponent', () => {
  let component: RadarsComponent;
  let fixture: ComponentFixture<RadarsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RadarsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RadarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
