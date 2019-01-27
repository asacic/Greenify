import { TestBed } from '@angular/core/testing';

import { LocalPositionService } from './local-position.service';

describe('LocalPositionService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LocalPositionService = TestBed.get(LocalPositionService);
    expect(service).toBeTruthy();
  });
});
