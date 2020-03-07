import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditEnseignComponent } from './edit-enseign.component';

describe('EditEnseignComponent', () => {
  let component: EditEnseignComponent;
  let fixture: ComponentFixture<EditEnseignComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditEnseignComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditEnseignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
