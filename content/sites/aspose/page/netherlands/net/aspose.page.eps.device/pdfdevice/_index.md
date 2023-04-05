---
title: Class PdfDevice
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.EPS.Device.PdfDevice klas. Deze klasse omvat het renderen van documenten naar PDF.
type: docs
weight: 60
url: /nl/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Deze klasse omvat het renderen van documenten naar PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Initialiseert nieuw exemplaar van`PdfDevice` met uitvoerstroom. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Initialiseert nieuw exemplaar van`PdfDevice`met uitvoerstroom en gespecificeerde grootte van een pagina. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Retourneert of specificeert de huidige achtergrond van de pagina. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Retourneert of specificeert de transformatie van huidige tekens. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Retourneert of specificeert de maker van de resulterende apparaatuitvoer. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Huidig paginanummer. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Geeft het huidige lettertype aan. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Geeft aan of het apparaat de directe RGB-modus gebruikt, dat wil zeggen RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Geeft aan of deze instantie van de Aspose.Page-bibliotheek is gelicentieerd. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Retourneert of specificeert de huidige dekking. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Retourneert of specificeert het huidige dekkingsmasker. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Specificeert of retourneert een uitvoerstroom. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Retourneert of specificeert de huidige verf. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Apparaateigenschappen inclusief metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opties voor het beheren van het weergaveproces. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Retourneert of specificeert een grootte van de pagina. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Retourneert of specificeert de huidige slag. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Retourneert of specificeert de huidige tekstweergavemodus. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Retourneert of specificeert de huidige lijndikte van de tekst. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Zorgt voor de nodige voorbereiding van het apparaat nadat de pagina is weergegeven. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Maakt een kopie van dit apparaat. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Verwijdert de grafische context. Als bij het maken restoreOnDispose waar was, wordt writeGraphicsRestore() aangeroepen. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Tekent een pad. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Tekent een boog. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Tekent een lijnstuk. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Tekent een ovaal. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Tekent een poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Tekent een polygoon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Tekent een polylijn. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Tekent een polylijn. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Tekent een rechthoek. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Tekent een ronde rechthoek. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Tekent een string op een bepaald punt. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Zorgt voor de nodige voorbereiding van het apparaat nadat het document is weergegeven. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Vult een pad. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Vult een boog. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Vult een ovaal. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Vult een poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Vult een poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Vult een rechthoek. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Vult een ronde rechthoek. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Krijgt een waarde van tekenreekseigenschap. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Krijgt een waarde van de kleureigenschap. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Krijgt een waarde van dubbele eigenschap. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Krijgt een waarde van eigenschap integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Krijgt een waarde van margin-eigenschap. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Krijgt een waarde van de eigenschap rechthoek. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Krijgt een waarde van de eigenschap size. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Krijgt huidige transformatie. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Initialiseert clip van het apparaat. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Initialiseert het aantal pagina's om uit te voeren. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Krijgt een waarde van booleaanse eigenschap. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Zorgt voor de nodige voorbereiding van het apparaat voordat de pagina wordt weergegeven. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Zorgt voor de nodige voorbereiding van het apparaat voordat elke pagina wordt weergegeven. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Reset het apparaat naar de oorspronkelijke staat voor het hele document. Wordt gebruikt voor het resetten van uitvoerstream. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Als pagina-apparaatparameters worden ingesteld, maakt deze methode het mogelijk om de schrijfstroom terug te sturen naar het begin van de pagina. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Roteer de huidige transformatie over de Z-as. Roept writeTransform(Transform). Roteren met een positieve hoek theta roteert punten op de positieve x-as naar de positieve y-as. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Roteer de huidige transformatiematrix rond een punt. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Schaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Specificeert de clip van het apparaat. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Specificeert de huidige transformatie. Aangezien de meeste uitvoerformaten deze functionaliteit niet implementeren, wordt de inverse transformatie van de currentTransform berekend en vermenigvuldigd met de in te stellen -transformatie. Het resultaat wordt vervolgens doorgestuurd door een call naar writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Verschuift de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Zorgt voor de nodige voorbereiding van het apparaat voordat het document wordt weergegeven. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Retourneert de naam van het apparaattype. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Transformeert de huidige transformatiematrix. Aanroepen writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Vertaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Werkt paginaparameters bij van een ander apparaat met meerdere pagina's. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Schrijft een opmerking. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Eigenschapswaarde "Auteur". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Eigenschapssleutel "Achtergrond". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Eigenschapssleutel "Achtergrondkleur". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Eigenschapssleutel "Comprimeren". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Eigenschapssleutel "Lettertype in document insluiten". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Eigenschapssleutel "Welk lettertype wordt gebruikt voor insluiten". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Eigenschapswaarde "Fouten verzenden". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Eigenschapswaarde 'Waarschuwingen verzenden'. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Eigenschapssleutel "Inhoud aan pagina aanpassen". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Eigenschapswaarde 'Zoekwoorden'. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Eigenschapssleutel "Oriëntatie". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Eigenschapssleutel "Paginamarges". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Eigenschapssleutel "Paginaformaat". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Eigenschapswaarde "Onderwerp". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Eigenschapswaarde "Titel". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Eigenschapssleutel "Transparant". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Eigenschapssleutel "Versie". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Eigenschapswaarde "Versie van Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Eigenschapssleutel "Formaat van afbeeldingen". |

### Zie ook

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* naamruimte [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* montage [Aspose.Page](../../)


