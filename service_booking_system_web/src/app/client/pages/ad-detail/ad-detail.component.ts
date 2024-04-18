import { Component } from '@angular/core';
import { ClientService } from '../../services/client.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-ad-detail',
  templateUrl: './ad-detail.component.html',
  styleUrl: './ad-detail.component.scss'
})
export class AdDetailComponent {

  adId = this.activateRoute.snapshot.params['adId'];

  constructor(
    private clientService: ClientService,
    private activateRoute: ActivatedRoute
  ){}

  ngOnInit(){
    this.getAdDetailsByAdId();
  }

  getAdDetailsByAdId(){
    this.clientService.getAdDetailsByAdId(this.adId).subscribe(res => {
      console.log(res);
    })
  }



}
