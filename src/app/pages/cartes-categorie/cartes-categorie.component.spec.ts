import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CartesCategorieComponent } from './cartes-categorie.component';

describe('CartesCategorieComponent', () => {
  let component: CartesCategorieComponent;
  let fixture: ComponentFixture<CartesCategorieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CartesCategorieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CartesCategorieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
