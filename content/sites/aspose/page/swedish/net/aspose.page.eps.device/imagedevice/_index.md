---
title: ImageDevice
second_title: Aspose.Page för .NET API-referens
description: Denna klass kapslar in rendering av dokument till bild.
type: docs
weight: 40
url: /sv/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Denna klass kapslar in rendering av dokument till bild.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Initierar ny instans av[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Initierar ny instans av[`ImageDevice`](../imagedevice) med angivet bildformat. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Initierar ny instans av[`ImageDevice`](../imagedevice) med angiven storlek på en sida. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Initierar ny instans av[`ImageDevice`](../imagedevice)med angiven storlek på en sida och bildformat. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Indikerar om enheten använder direkt RGB-läge, det vill säga RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Returnerar eller specificerar aktuella tecken transform. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Returnerar eller anger skaparen av resulterande enhetsutdata. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Aktuellt sidnummer. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Returnerar eller anger aktuellt teckensnitt. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Bildformat. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Returnerar resulterande bilder i byte, en byte array för en sida. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Indikerar om enheten använder direkt RGB-läge, det vill säga RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indikerar om denna instans av Aspose.Page-biblioteket är licensierad. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Returnerar eller anger aktuell bakgrund för sidan. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Returnerar eller anger aktuell opacitetsmask. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Returnerar eller specificerar aktuell färg. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Enhetsegenskaper inklusive metadata. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Alternativ för att hantera renderingsprocessen. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Returnerar eller anger en storlek på sidan. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Returnerar eller anger aktuellt streck. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Returnerar eller anger aktuellt textåtergivningsläge. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Returnerar eller anger aktuell textlinjebredd. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Gör nödvändiga förberedelser av enheten efter att sidan har renderats. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Skapar en kopia av den här enheten. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Kasserar enheten. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Ritar en bana. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Ritar en båge. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Ritar en bild med tilldelad transformation och bakgrund. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Ritar ett linjesegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Ritar en oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Ritar en poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Ritar en polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Ritar en polylinje. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Ritar en polylinje. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Ritar en rektangel. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Ritar en rund rektangel. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Ritar en sträng vid en given punkt. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Gör nödvändig förberedelse av enheten efter att dokumentet har renderats. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Fyller en sökväg. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Fyller en båge. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Fyller en oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Fyller en poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Fyller en poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Fyller en rektangel. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Fyller en rund rektangel. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Får värdet på strängegenskap. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Får värdet färgegenskap. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Får värdet dubbel egenskap. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Får värdet på heltalsegenskapen. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Får värdet av egenskapen margins. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Får värdet rektangelegenskapen. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Får ett värde av egenskapen storlek. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Hämtar den aktuella transformationen. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Initierar ett klipp av enheten. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Initierar antalet sidor som ska matas ut. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Får värdet boolesk egenskap. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Gör nödvändiga förberedelser av enheten innan sidrendering. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Gör nödvändiga förberedelser av enheten före varje sidrendering. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Återställ enheten till utgångsläget för hela dokumentet. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Återställ enheten till initialläge för en sida. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Rotera den aktuella transformationsmatrisen över Z-axeln. Anropar writeTransform(Transform). Roterande med en positiv vinkel theta roterar punkter på den positiva x-axeln mot den positiva y-axeln. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Rotera den aktuella transformationsmatrisen runt en punkt. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Skalar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Klippform. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Anger aktuell transformation. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Skär den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Gör nödvändig förberedelse av enheten innan renderingen av dokumentet påbörjas. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Returnerar namnet på enhetstypen. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Transformerar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Översätter den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Uppdaterar sidparametrar från andra flersidiga enheter. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Skriver en kommentar. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Egenskapsnyckel "Bakgrund". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Egenskapsnyckel "Bakgrundsfärg". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | "Bädda in teckensnitt i dokument" egenskapsnyckel. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Egenskapsvärde "Emit errors". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Egenskapsvärde "Emit warnings". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Egenskapsnyckeln "Anpassa innehåll till sida". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | "Orientering" egenskapsnyckel. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Egenskapsnyckel "Sidmarginaler". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Egenskapsnyckel "Sidstorlek". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | "Producer" fastighetsvärde. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | "Transparent" egenskapsnyckel. |

### Se även

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namnutrymme [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* hopsättning [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
