---
title: Class Device
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.Device klas. Deze klasse omvat de weergave van een document naar een abstract apparaat. De weergave van het document wordt pagina voor pagina uitgevoerd.
type: docs
weight: 20
url: /nl/net/aspose.page/device/
---
## Device class

Deze klasse omvat de weergave van een document naar een abstract apparaat. De weergave van het document wordt pagina voor pagina uitgevoerd.

```csharp
public abstract class Device
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Device](device/)(Size) | Initialiseert`Device` met een grootte van een pagina. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Retourneert of specificeert de huidige achtergrond van de pagina. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Retourneert of specificeert de transformatie van huidige tekens. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Retourneert of specificeert de maker van de resulterende apparaatuitvoer. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Retourneert of specificeert het huidige lettertype. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Geeft aan of het apparaat de directe RGB-modus gebruikt, dat wil zeggen RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Geeft aan of deze instantie van de Aspose.Page-bibliotheek is gelicentieerd. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Retourneert of specificeert de huidige dekking. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Retourneert of specificeert het huidige dekkingsmasker. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Retourneert of specificeert de huidige verf. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Apparaateigenschappen inclusief metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opties voor het beheren van het weergaveproces. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Retourneert of specificeert een grootte van de pagina. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Retourneert of specificeert de huidige slag. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Retourneert of specificeert de huidige tekstweergavemodus. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Retourneert of specificeert de huidige lijndikte van de tekst. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Maakt een kopie van dit apparaat. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Verwijdert het apparaat. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Tekent een pad. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Tekent een boog. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Tekent een lijnstuk. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Tekent een ovaal. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Tekent een poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Tekent een polygoon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Tekent een polylijn. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Tekent een polylijn. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Tekent een rechthoek. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Tekent een ronde rechthoek. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Tekent een string op een bepaald punt. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Zorgt voor de nodige voorbereiding van het apparaat nadat het document is weergegeven. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Vult een pad. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Vult een boog. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Vult een ovaal. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Vult een poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Vult een poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Vult een rechthoek. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Vult een ronde rechthoek. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Krijgt een waarde van tekenreekseigenschap. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Krijgt een waarde van de kleureigenschap. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Krijgt een waarde van dubbele eigenschap. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Krijgt een waarde van eigenschap integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Krijgt een waarde van margin-eigenschap. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Krijgt een waarde van de eigenschap rechthoek. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Krijgt een waarde van de eigenschap size. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Krijgt huidige transformatie. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initialiseert clip van het apparaat. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Krijgt een waarde van booleaanse eigenschap. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Reset het apparaat naar de oorspronkelijke staat voor het hele document. Wordt gebruikt voor het resetten van uitvoerstream. |
| virtual [Reset](../../aspose.page/device/reset/)() | Reset het apparaat naar de oorspronkelijke status voor een pagina. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Roteer de huidige transformatiematrix. Roept writeTransform(Transform). Roteren met een positieve hoek theta roteert punten op de positieve x-as naar de positieve y-as. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Roteer de huidige transformatiematrix rond een punt. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Schaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Specificeert de clip van het apparaat. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Specificeert huidige transformatie. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Verschuift de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Zorgt voor de nodige voorbereiding van het apparaat voordat het document wordt weergegeven. |
| override [ToString](../../aspose.page/device/tostring/)() | Retourneert de naam van het apparaattype. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Transformeert de huidige transformatiematrix. Aanroepen writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Vertaalt de huidige transformatiematrix. Aanroepen writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Schrijft een opmerking. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Huidige apparaatversie. |

### Zie ook

* naamruimte [Aspose.Page](../../aspose.page/)
* montage [Aspose.Page](../../)


