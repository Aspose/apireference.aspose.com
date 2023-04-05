---
title: Class Device
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.Device klass. Denna klass kapslar in rendering av dokument till abstrakt enhet. Rendering av dokumentet utförs sida för sida.
type: docs
weight: 20
url: /sv/net/aspose.page/device/
---
## Device class

Denna klass kapslar in rendering av dokument till abstrakt enhet. Rendering av dokumentet utförs sida för sida.

```csharp
public abstract class Device
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Device](device/)(Size) | Initialiserar`Device` med storleken på en sida. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Returnerar eller anger aktuell bakgrund för sidan. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Returnerar eller specificerar aktuella tecken transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Returnerar eller anger skaparen av resulterande enhetsutdata. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Returnerar eller anger aktuellt teckensnitt. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indikerar om enheten använder direkt RGB-läge, det vill säga RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indikerar om denna instans av Aspose.Page-biblioteket är licensierad. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Returnerar eller anger aktuell opacitet. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Returnerar eller anger aktuell opacitetsmask. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Returnerar eller specificerar aktuell färg. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Enhetsegenskaper inklusive metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Alternativ för att hantera renderingsprocessen. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Returnerar eller anger en storlek på sidan. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Returnerar eller anger aktuellt streck. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Returnerar eller anger aktuellt textåtergivningsläge. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Returnerar eller anger aktuell textlinjebredd. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Skapar en kopia av den här enheten. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Kasserar enheten. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Ritar en bana. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Ritar en båge. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Ritar en bild med tilldelad transformation och bakgrund. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Ritar ett linjesegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Ritar en oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Ritar en poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Ritar en polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Ritar en polylinje. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Ritar en polylinje. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Ritar en rektangel. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Ritar en rund rektangel. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Ritar en sträng vid en given punkt. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Gör nödvändig förberedelse av enheten efter att dokumentet har renderats. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Fyller en sökväg. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Fyller en båge. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Fyller en oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Fyller en poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Fyller en poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Fyller en rektangel. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Fyller en rund rektangel. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Får värdet på strängegenskap. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Får värdet färgegenskap. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Får värdet dubbel egenskap. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Får värdet på heltalsegenskapen. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Får värdet av margin-egenskapen. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Får värdet rektangelegenskapen. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Får ett värde av egenskapen storlek. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Får aktuell transformation. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initierar klippet på enheten. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Får värdet boolesk egenskap. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Återställ enheten till utgångsläget för hela dokumentet. Används för att återställa utdataström. |
| virtual [Reset](../../aspose.page/device/reset/)() | Återställ enheten till initialläge för en sida. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Rotera den aktuella transformationsmatrisen. Anropar writeTransform(Transform). Roterande med en positiv vinkel theta roterar punkter på den positiva x-axeln mot den positiva y-axeln. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Rotera den aktuella transformationsmatrisen runt en punkt. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Skalar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Anger enhetens klipp. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Anger aktuell transformation. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Skär den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Gör nödvändig förberedelse av enheten innan renderingen av dokumentet påbörjas. |
| override [ToString](../../aspose.page/device/tostring/)() | Returnerar namnet på enhetstypen. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Transformerar den aktuella transformationsmatrisen. Anropar writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Översätter den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Skriver en kommentar. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Aktuell enhetsversion. |

### Se även

* namnutrymme [Aspose.Page](../../aspose.page/)
* hopsättning [Aspose.Page](../../)


