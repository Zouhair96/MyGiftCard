import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatButtonModule } from '@angular/material/button';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from "@angular/common/http";
import { MatCardModule } from '@angular/material/card';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { PagesComponent } from './pages/pages.component';
import { CartesComponent } from './pages/cartes/cartes.component';
import { CategoriesComponent } from './pages/categories/categories.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { EnseignsComponent } from './pages/enseigns/enseigns.component';
import { NewcarteComponent } from './pages/newcarte/newcarte.component';

const AppRoutes =[
  {path: '' , component : PagesComponent , children : [
    {path : 'cartes', component: CartesComponent},
    {path : 'categories', component: CategoriesComponent},
    {path : 'dashboard', component: DashboardComponent},
    {path : 'enseigns', component: EnseignsComponent},
    {path : 'newcarte', component: NewcarteComponent}
  ]},

]
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    PagesComponent,
    CartesComponent,
    CategoriesComponent,
    DashboardComponent,
    EnseignsComponent,
    NewcarteComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatGridListModule,
    MatButtonModule,
    MatCardModule,
    MatFormFieldModule,
    MatStepperModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(AppRoutes),

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
