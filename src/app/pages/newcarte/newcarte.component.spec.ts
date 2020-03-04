import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewcarteComponent } from './newcarte.component';

describe('NewcarteComponent', () => {
  let component: NewcarteComponent;
  let fixture: ComponentFixture<NewcarteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewcarteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewcarteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
