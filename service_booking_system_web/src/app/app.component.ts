import { Component } from '@angular/core';
import { UserStorageService } from './basic/services/storage/user-storage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'service_booking_system_web';

  // Ao declarar a variável dessa maneira é apresentado o erro -> localStorage is not defined
  // isClientLoggedIn: boolean = UserStorageService.isClientLoggedIn();
  // isCompanyLoggedIn: boolean = UserStorageService.isCompanyLoggedIn();



  isClientLoggedIn: boolean = false;
  isCompanyLoggedIn: boolean = false;


  constructor(
    private router: Router
  ){}

  ngOnInit(){
    this.router.events.subscribe(event => {
      this.isClientLoggedIn = UserStorageService.isClientLoggedIn();
      this.isCompanyLoggedIn = UserStorageService.isCompanyLoggedIn();
    })
  }

  logout(){
    UserStorageService.signOut();
    this.router.navigateByUrl('login');
  }
}
