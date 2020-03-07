import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatProgressBarModule } from '@angular/material/progress-bar';

import { RouterModule } from '@angular/router';
import { MatMenuModule } from '@angular/material/menu';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule , ReactiveFormsModule} from '@angular/forms';
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
import { EditCarteComponent } from './pages/cartes/edit-carte/edit-carte.component';
import { EditCategorieComponent } from './pages/categories/edit-categorie/edit-categorie.component';
import { EditEnseignComponent } from './pages/enseigns/edit-enseign/edit-enseign.component';
import { NewCategorieComponent } from './pages/new-categorie/new-categorie.component';
import { NewEnseignComponent } from './pages/new-enseign/new-enseign.component';

const AppRoutes = [
  {path: '' , component : PagesComponent , children : [
    {path : 'cartes', component: CartesComponent},
    {path : 'cartes/edit/:id', component: EditCarteComponent },
    {path : 'categories', component: CategoriesComponent},
    {path : 'categories/edit/:id', component: EditCategorieComponent },
    {path : 'dashboard', component: DashboardComponent},
    {path : 'enseigns', component: EnseignsComponent},
    {path : 'enseigns/edit/:id', component: EditEnseignComponent },
    {path : 'newcarte', component: NewcarteComponent},
    {path : 'newcategorie', component: NewCategorieComponent},
    {path : 'newenseign', component: NewEnseignComponent}

  ]},

];
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
    NewcarteComponent,
    EditCarteComponent,
    EditCategorieComponent,
    EditEnseignComponent,
    NewCategorieComponent,
    NewEnseignComponent
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
    MatInputModule,
    MatFormFieldModule,
    MatProgressBarModule,
    MatMenuModule,
    MatStepperModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(AppRoutes),

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
