import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewEnseignComponent } from './new-enseign.component';

describe('NewEnseignComponent', () => {
  let component: NewEnseignComponent;
  let fixture: ComponentFixture<NewEnseignComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewEnseignComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewEnseignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
