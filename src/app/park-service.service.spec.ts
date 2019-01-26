import { TestBed } from '@angular/core/testing';

import { ParkServiceService } from './park-service.service';

describe('ParkServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ParkServiceService = TestBed.get(ParkServiceService);
    expect(service).toBeTruthy();
  });
});
