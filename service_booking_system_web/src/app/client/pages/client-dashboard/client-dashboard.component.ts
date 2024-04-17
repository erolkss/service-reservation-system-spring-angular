import { Component } from '@angular/core';
import { ClientService } from '../../services/client.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-client-dashboard',
  templateUrl: './client-dashboard.component.html',
  styleUrl: './client-dashboard.component.scss'
})
export class ClientDashboardComponent {

  ads: any = [];
  validateForm!: FormGroup;

  constructor(
    private clientService: ClientService,
    private fb: FormBuilder
  ) { }


  ngOnInit() {
    this.validateForm = this.fb.group({
      service: [null, [Validators.required]]
    })
    this.getAllAds();
  }

  searchAdByName(){
    this.clientService.searchByName(this.validateForm.get(['service']).value).subscribe(res => {
      this.ads = res;
    })
  }

  getAllAds() {
    this.clientService.getAllAds().subscribe(res => {
      this.ads = res;
    })
  }

  updateImg(img) {
    return 'data:image/jpeg;base64,' + img;
  }
}
