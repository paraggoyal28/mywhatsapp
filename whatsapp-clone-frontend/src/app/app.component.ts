import {Component, inject, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {
  NgbAccordionBody,
  NgbAccordionButton,
  NgbAccordionCollapse, NgbAccordionDirective,
  NgbAccordionHeader, NgbAccordionItem
} from "@ng-bootstrap/ng-bootstrap";
import {FaIconComponent, FaIconLibrary} from '@fortawesome/angular-fontawesome';
import {fontAwesomeIcons} from './shared/font=awesome-icons';

@Component({
  selector: 'wac-root',
  imports: [RouterOutlet, NgbAccordionCollapse, NgbAccordionBody, NgbAccordionButton, NgbAccordionHeader, NgbAccordionItem, NgbAccordionDirective, FaIconComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {

  title = 'whatsapp-clone-frontend';

  private faIconLibrary: FaIconLibrary = inject(FaIconLibrary);

  ngOnInit(): void {
    this.initFontAwesome();
  }


  private initFontAwesome() {
    this.faIconLibrary.addIcons(...fontAwesomeIcons);
  }


}
