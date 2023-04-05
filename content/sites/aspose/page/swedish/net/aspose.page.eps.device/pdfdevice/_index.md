---
title: Class PdfDevice
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.EPS.Device.PdfDevice klass. Denna klass kapslar in rendering av dokument till PDF.
type: docs
weight: 60
url: /sv/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Denna klass kapslar in rendering av dokument till PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Initierar ny instans av`PdfDevice` med utgångsström. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Initierar ny instans av`PdfDevice`med utdataström och angiven storlek på en sida. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Returnerar eller anger aktuell bakgrund för sidan. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Returnerar eller specificerar aktuella tecken transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Returnerar eller anger skaparen av resulterande enhetsutdata. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Aktuellt sidnummer. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Anger aktuellt teckensnitt. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indikerar om enheten använder direkt RGB-läge, det vill säga RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indikerar om denna instans av Aspose.Page-biblioteket är licensierad. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Returnerar eller anger aktuell opacitet. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Returnerar eller anger aktuell opacitetsmask. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Anger eller returnerar en utdataström. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Returnerar eller specificerar aktuell färg. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Enhetsegenskaper inklusive metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Alternativ för att hantera renderingsprocessen. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Returnerar eller anger en storlek på sidan. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Returnerar eller anger aktuellt streck. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Returnerar eller anger aktuellt textåtergivningsläge. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Returnerar eller anger aktuell textlinjebredd. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Gör nödvändiga förberedelser av enheten efter att sidan har renderats. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Skapar en kopia av den här enheten. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Disponerar grafikkontexten. Om restoreOnDispose var sant vid skapandet kommer writeGraphicsRestore() att anropas. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Ritar en bana. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Ritar en båge. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Ritar en bild med tilldelad transformation och bakgrund. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Ritar ett linjesegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Ritar en oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Ritar en poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Ritar en polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Ritar en polylinje. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Ritar en polylinje. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Ritar en rektangel. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Ritar en rund rektangel. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Ritar en sträng vid en given punkt. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Gör nödvändig förberedelse av enheten efter att dokumentet har renderats. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Fyller en sökväg. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Fyller en båge. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Fyller en oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Fyller en poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Fyller en poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Fyller en rektangel. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Fyller en rund rektangel. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Får värdet på strängegenskap. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Får värdet färgegenskap. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Får värdet dubbel egenskap. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Får värdet på heltalsegenskapen. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Får värdet av margin-egenskapen. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Får värdet rektangelegenskapen. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Får ett värde av egenskapen storlek. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Hämtar aktuell transformation. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Initierar klippet på enheten. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Initierar antalet sidor som ska matas ut. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Får värdet boolesk egenskap. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Gör nödvändiga förberedelser av enheten innan sidrendering. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Gör nödvändiga förberedelser av enheten före varje sidrendering. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Återställ enheten till utgångsläget för hela dokumentet. Används för att återställa utdataström. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Om sidenhetsparametrar kommer att ställas in gör denna metod att returnera skrivström tillbaka i början av sidan. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Rotera den aktuella transformationen över Z-axeln. Anropar writeTransform(Transform). Roterande med en positiv vinkel theta roterar punkter på den positiva x-axeln mot den positiva y-axeln. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Rotera den aktuella transformationsmatrisen runt en punkt. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Skalar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Anger enhetens klipp. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Anger den aktuella transformationen. Eftersom de flesta utdataformat inte implementerar denna funktionalitet, beräknas den inversa transformationen av currentTransform och multipliceras med transformationen som ska ställas in. Resultatet vidarebefordras sedan av en call till writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Skär den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Gör nödvändig förberedelse av enheten innan renderingen av dokumentet påbörjas. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Returnerar namnet på enhetstypen. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Transformerar den aktuella transformationsmatrisen. Anropar writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Översätter den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Uppdaterar sidparametrar från andra flersidiga enheter. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Skriver en kommentar. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Egenskapens värde för "Author". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Egenskapsnyckel "Bakgrund". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Egenskapsnyckel "Bakgrundsfärg". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | "Komprimera" egenskapsnyckel. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | "Bädda in teckensnitt i dokument" egenskapsnyckel. |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | "Vilken teckensnittstyp används för inbäddning" egenskapsnyckel. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Egenskapsvärde "Emit errors". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Egenskapsvärde "Emit warnings". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Egenskapsnyckeln "Anpassa innehåll till sida". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Egenskapens värde för "Sökord". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | "Orientering" egenskapsnyckel. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Egenskapsnyckel "Sidmarginaler". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Egenskapsnyckel "Sidstorlek". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Egenskapens värde för "Ämne". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | "Titel" egenskapens värde. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "Transparent" egenskapsnyckel. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | "Version" egenskapsnyckel. |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Egenskapsvärde "Version av Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | "Format av bilder" egenskapsnyckel. |

### Se även

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* namnutrymme [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* hopsättning [Aspose.Page](../../)


