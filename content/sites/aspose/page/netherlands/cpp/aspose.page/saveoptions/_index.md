---
title: "Aspose::Page::SaveOptions klasse"
linktitle: "SaveOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::SaveOptions klasse. Deze klasse bevat opties die nodig zijn voor het beheren van het conversieproces in C++."
type: docs
weight: 1500
url: /nl/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Deze klasse bevat opties die nodig zijn voor het beheren van het conversieproces.

```cpp
class SaveOptions : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specificeert extra mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaardlettertype-map waar het OS lettertypen voor interne behoeften vindt. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Specificeert of niet-TrueType-lettertypen naar TTF moeten worden opgeslagen. Het verkleint aanzienlijk het volume van het resulterende document bij PS-naar-PDF-conversie en verhoogt de snelheid van de conversie van PS-bestanden met een grote hoeveelheid tekst in niet-TrueType-lettertypen naar elk uitvoerformaat. Er is echter een kleine verticale verschuiving van tekst bij het converteren van een PostScript-bestand naar een afbeelding. |
| virtual [get_Debug](./get_debug/)() | Specificeert of debug-informatie al dan niet naar de standaarduitvoerstream moet worden afgedrukt. |
| virtual [get_Exceptions](./get_exceptions/)() | Retourneert een lijst van onderdrukte conversiefouten als [SuppressErrors](../) waar is. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
| [get_Size](./get_size/)() const | Haalt de grootte van de afbeelding op / stelt deze in. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Specificeert of fouten al dan niet moeten worden onderdrukt. Indien waar worden onderdrukte fouten toegevoegd aan de [Exceptions](../)-lijst. Indien onwaar zal de eerste fout het programma beëindigen. |
| [SaveOptions](./saveoptions/)() | Initialiseert een nieuw exemplaar van de [SaveOptions](./) klasse met standaardwaarden voor de vlaggen [SuppressErrors](../) (true) en [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Initialiseert een nieuw exemplaar van de [SaveOptions](./) klasse met de standaardwaarde voor de vlag [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Initialiseert een nieuw exemplaar van de [SaveOptions](./) met de opgegeven grootte van de pagina. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Initialiseert een nieuw exemplaar van de [SaveOptions](./) klasse met de standaardwaarde voor de vlag [Debug](../) (false) en met de opgegeven grootte van de pagina. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specificeert extra mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaardlettertype-map waar het OS lettertypen voor interne behoeften vindt. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Specificeert of niet-TrueType-lettertypen naar TTF moeten worden opgeslagen. Het verkleint aanzienlijk het volume van het resulterende document bij PS-naar-PDF-conversie en verhoogt de snelheid van de conversie van PS-bestanden met een grote hoeveelheid tekst in niet-TrueType-lettertypen naar elk uitvoerformaat. Er is echter een kleine verticale verschuiving van tekst bij het converteren van een PostScript-bestand naar een afbeelding. |
| virtual [set_Debug](./set_debug/)(bool) | Specificeert of debug-informatie al dan niet naar de standaarduitvoerstream moet worden afgedrukt. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Haalt de grootte van de afbeelding op / stelt deze in. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Specificeert of fouten al dan niet moeten worden onderdrukt. Indien waar worden onderdrukte fouten toegevoegd aan de [Exceptions](../)-lijst. Indien onwaar zal de eerste fout het programma beëindigen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
