---
title: Class PdfDevice
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice klas. Klasse inkapselend apparaat voor het samenstellen van afbeeldingen.
type: docs
weight: 410
url: /nl/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Klasse inkapselend apparaat voor het samenstellen van afbeeldingen.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Maakt de nieuwe instantie aan. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Maakt de nieuwe instantie met opgegeven mediagrootte. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | Krijgt/stelt de achtergrondkleur in. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Retourneert of specificeert de transformatie van huidige tekens. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Retourneert of specificeert de maker van de resulterende apparaatuitvoer. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Retourneert het absolute nummer van de huidige pagina in het document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Retourneert het nummer van de huidige pagina binnen de huidige partitie. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | Haalt/zet het huidige lettertype op. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Geeft aan of het apparaat de directe RGB-modus gebruikt, dat wil zeggen RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Geeft aan of deze instantie van de Aspose.Page-bibliotheek is gelicentieerd. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | Krijgt/stelt de dekking in. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | Haalt/stelt het penseel in voor dekkingsmasker. Het masker is van toepassing op Paint of Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | Haalt/stelt het penseel in voor het vullen van paden. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Apparaateigenschappen inclusief metadata. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | Initialiseert opslagopties. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | Haalt/stelt de mediagrootte van het apparaat op. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | Haalt/stelt de lijn op voor het tekenen van paden. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Retourneert of specificeert de huidige tekstweergavemodus. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Retourneert of specificeert de huidige lijndikte van de tekst. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Voegt een overzichtsitem toe met het laatste object als doel. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Voegt een overzichtsitem toe met het oorsprongspunt als doel. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Voltooit de pagina. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | De documentpartitie voltooid. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | Maakt een nieuwe instantie van het apparaat op basis van deze apparaatinstantie. Schrijft de grafische status van dit apparaat, dwz maaktApsCanvas instantie(s) met bijbehorende RenderTransform- en Clip-eigenschappen. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | Verwijdert deze apparaatinstantie. Voltooit de grafische status van deze apparaatinstantie, dwz schakelt de APS-samenstelcontext naar deApsCanvas van het niveau hoger dan de grafische status van dit apparaatApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | Tekent het gespecificeerde pad. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Tekent een boog. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Tekent een lijnstuk. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Tekent een ovaal. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Tekent een poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Tekent een polygoon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Tekent een polylijn. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Tekent een polylijn. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Tekent een rechthoek. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Tekent een ronde rechthoek. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | Tekent een tekenreeks op de opgegeven positie. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | Voltooit het document. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | Vult het opgegeven pad. |
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
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | Geeft de huidige transformatiematrix terug. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initialiseert clip van het apparaat. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Initialiseert het aantal pagina's om uit te voeren. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Krijgt een waarde van booleaanse eigenschap. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Start een nieuwe pagina met de opgegeven titel. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Start een nieuwe pagina met de opgegeven breedte en hoogte. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Start een nieuwe documentpartitie. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | Zet de apparaten in de oorspronkelijke staat. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | Reset het apparaat. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | Past een rotatie met de klok mee rond de oorsprong toe op de huidige transformatiematrix. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Roteer de huidige transformatiematrix rond een punt. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | Past de opgegeven schaalvector toe op de huidige transformatiematrix. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | Voegt het opgegeven pad toe aan het huidige clippad. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Stelt de hyperlink in met een paginanummer als doel. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Stelt de hyperlink in met een externe URI als doel. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | Stelt de huidige transformatiematrix in. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | Past de opgegeven afschuifvector toe op de huidige transformatiematrix. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | Start het document. |
| override [ToString](../../aspose.page/device/tostring/)() | Retourneert de naam van het apparaattype. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | Vermenigvuldigt de huidige transformatiematrix met de opgegeven waardeMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | Past de gespecificeerde translatievector toe op de huidige transformatiematrix. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Werkt de huidige paginaparameters bij. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Schrijft een opmerking. |

### Zie ook

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* naamruimte [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* montage [Aspose.Page](../../)


