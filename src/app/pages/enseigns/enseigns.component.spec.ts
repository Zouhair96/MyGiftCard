import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EnseignsComponent } from './enseigns.component';

describe('EnseignsComponent', () => {
  let component: EnseignsComponent;
  let fixture: ComponentFixture<EnseignsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EnseignsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EnseignsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
