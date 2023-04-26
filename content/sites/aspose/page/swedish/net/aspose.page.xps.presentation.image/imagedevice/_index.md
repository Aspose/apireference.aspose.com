---
title: Class ImageDevice
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.Presentation.Image.ImageDevice klass. Klassinkapslande bildkomponerande enhet.
type: docs
weight: 360
url: /sv/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Klassinkapslande bildkomponerande enhet.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Skapar den nya instansen. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Skapar den nya instansen med angiven mediastorlek. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Får/ställer in bakgrundsfärgen. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Returnerar eller specificerar aktuella tecken transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Returnerar eller anger skaparen av resulterande enhetsutdata. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Returnerar det absoluta talet för den aktuella sidan i dokumentet. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Returnerar det relativa numret för den aktuella sidan inom den aktuella partitionen. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Hämtar/ställer in det aktuella teckensnittet. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indikerar om enheten använder direkt RGB-läge, det vill säga RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indikerar om denna instans av Aspose.Page-biblioteket är licensierad. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Får/ställer in opaciteten. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Får/ställer in borsten för opacitetsmask. Masken appliceras över Paint eller Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Får/ställer in borsten för fyllningsbanor. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Enhetsegenskaper inklusive metadata. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Returnerar de resulterande bilderna byte-arrayer. Den första dimensionen är för inre documents och den andra är för sidor i inre dokument. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Initierar sparalternativ. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Hämtar/ställer in enhetens mediastorlek. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Hämtar/ställer in linjen för att rita banor. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Returnerar eller anger aktuellt textåtergivningsläge. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Returnerar eller anger aktuell textlinjebredd. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Klarar sidan. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Utförde dokumentpartitionen. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Skapar en ny instans av enheten baserat på denna enhetsinstans. Skriver enhetens grafiktillstånd, dvs skaparApsCanvas instans(er) med motsvarande egenskaper för RenderTransform och Clip. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Kasserar denna enhetsinstans. Slutför denna enhetsinstanss grafiktillstånd, dvs växlar APS-komponeringskontext tillApsCanvas av nivån högre än denna enhets grafiktillståndApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Ritar den angivna sökvägen. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Ritar en båge. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Ritar en bild med tilldelad transformation och bakgrund. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Ritar ett linjesegment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Ritar en oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Ritar en poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Ritar en polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Ritar en polylinje. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Ritar en polylinje. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Ritar en rektangel. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Ritar en rund rektangel. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Ritar en sträng på angiven position. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Utför dokumentet. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Fyller den angivna sökvägen. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Returnerar den aktuella transformationsmatrisen. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initierar klippet på enheten. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Initierar antalet sidor som ska matas ut. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Får värdet boolesk egenskap. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Startar en ny sida med den angivna titeln. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Startar en ny sida med angiven bredd och höjd. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Startar en ny dokumentpartition. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Ställer in enheterna till utgångsläget. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Återställer enheten. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Tillämpar en medurs rotation kring origo på den aktuella transformationsmatrisen. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Rotera den aktuella transformationsmatrisen runt en punkt. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Tillämpar den angivna skalvektorn på den aktuella transformationsmatrisen. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Lägger till den angivna sökvägen till den aktuella klippvägen. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Ställer in den aktuella transformationsmatrisen. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Tillämpar den angivna skjuvvektorn på den aktuella transformationsmatrisen. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Startar dokumentet. |
| override [ToString](../../aspose.page/device/tostring/)() | Returnerar namnet på enhetstypen. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Multiplicerar den aktuella transformationsmatrisen med den angivnaMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Tillämpar den angivna översättningsvektorn på den aktuella transformationsmatrisen. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Uppdaterar de aktuella sidparametrarna. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Skriver en kommentar. |

### Se även

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* namnutrymme [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* hopsättning [Aspose.Page](../../)


