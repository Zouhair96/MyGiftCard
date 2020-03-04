import { TestBed } from '@angular/core/testing';

import { EnseignsService } from './enseigns.service';

describe('EnseignsService', () => {
  let service: EnseignsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EnseignsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
