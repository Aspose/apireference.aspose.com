---
title: Class ImageDevice
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.EPS.Device.ImageDevice klas. Deze klasse omvat het renderen van document naar afbeelding.
type: docs
weight: 40
url: /nl/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Deze klasse omvat het renderen van document naar afbeelding.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Initialiseert nieuw exemplaar van`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | Initialiseert nieuw exemplaar van`ImageDevice` met opgegeven afbeeldingsformaat. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | Initialiseert nieuw exemplaar van`ImageDevice` met opgegeven grootte van een pagina. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | Initialiseert nieuw exemplaar van`ImageDevice` met opgegeven grootte van een pagina en afbeeldingsformaat. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | Geeft aan of het apparaat de directe RGB-modus gebruikt, dat wil zeggen RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | Retourneert of specificeert de transformatie van huidige tekens. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | Retourneert of specificeert de maker van de resulterende apparaatuitvoer. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | Huidig paginanummer. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | Retourneert of specificeert het huidige lettertype. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | Beeldformaat. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | Retourneert resulterende afbeeldingen in bytes, één byte array voor één pagina. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | Geeft aan of het apparaat de directe RGB-modus gebruikt, dat wil zeggen RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Geeft aan of deze instantie van de Aspose.Page-bibliotheek is gelicentieerd. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | Retourneert of specificeert de huidige achtergrond van de pagina. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Retourneert of specificeert het huidige dekkingsmasker. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | Retourneert of specificeert de huidige verf. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Apparaateigenschappen inclusief metadata. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | Opties voor het beheren van het weergaveproces. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | Retourneert of specificeert een grootte van de pagina. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | Retourneert of specificeert de huidige slag. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | Retourneert of specificeert de huidige tekstweergavemodus. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | Retourneert of specificeert de huidige lijndikte van de tekst. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | Zorgt voor de nodige voorbereiding van het apparaat nadat de pagina is weergegeven. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | Maakt een kopie van dit apparaat. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | Verwijdert het apparaat. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | Tekent een pad. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Tekent een boog. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Tekent een lijnstuk. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Tekent een ovaal. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Tekent een poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Tekent een polygoon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Tekent een polylijn. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Tekent een polylijn. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Tekent een rechthoek. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Tekent een ronde rechthoek. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | Tekent een string op een bepaald punt. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | Zorgt voor de nodige voorbereiding van het apparaat nadat het document is weergegeven. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | Vult een pad. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Vult een boog. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Vult een ovaal. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Vult een poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Vult een poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Vult een rechthoek. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Vult een ronde rechthoek. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | Krijgt een waarde van tekenreekseigenschap. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | Krijgt een waarde van de kleureigenschap. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | Krijgt een waarde van dubbele eigenschap. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | Krijgt een waarde van eigenschap integer. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | Krijgt een waarde van de eigenschap margins. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | Krijgt een waarde van de eigenschap rechthoek. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | Krijgt een waarde van de eigenschap size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | Haalt de huidige transformatie op. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | Initialiseert een clip van het apparaat. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | Initialiseert het aantal pagina's om uit te voeren. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | Krijgt een waarde van booleaanse eigenschap. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | Zorgt voor de nodige voorbereiding van het apparaat voordat de pagina wordt weergegeven. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | Zorgt voor de nodige voorbereiding van het apparaat voordat elke pagina wordt weergegeven. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | Reset apparaat naar beginstatus voor het hele document. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | Reset het apparaat naar de oorspronkelijke status voor een pagina. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | Roteer de huidige transformatiematrix over de Z-as. Roept writeTransform(Transform). Roteren met een positieve hoek theta roteert punten op de positieve x-as naar de positieve y-as. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Roteer de huidige transformatiematrix rond een punt. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | Schaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | Clips vorm. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | Specificeert huidige transformatie. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | Verschuift de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | Zorgt voor de nodige voorbereiding van het apparaat voordat het document wordt weergegeven. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | Retourneert de naam van het apparaattype. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | Transformeert de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | Vertaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | Werkt paginaparameters bij van een ander apparaat met meerdere pagina's. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | Schrijft een opmerking. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | Eigenschapssleutel "Achtergrond". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | Eigenschapssleutel "Achtergrondkleur". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | Eigenschapssleutel "Lettertype in document insluiten". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | Eigenschapswaarde "Fouten verzenden". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | Eigenschapswaarde 'Waarschuwingen verzenden'. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | Eigenschapssleutel "Inhoud aan pagina aanpassen". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | Eigenschapssleutel "Oriëntatie". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | Eigenschapssleutel "Paginamarges". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | Eigenschapssleutel "Paginaformaat". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | Eigenschapswaarde "Producer". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | Eigenschapssleutel "Transparant". |

### Zie ook

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* naamruimte [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* montage [Aspose.Page](../../)


