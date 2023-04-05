---
title: Class PsDocument
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.EPS.PsDocument klass. Den här klassen kapslar in PS/EPSdokument.
type: docs
weight: 140
url: /sv/net/aspose.page.eps/psdocument/
---
## PsDocument class

Den här klassen kapslar in PS/EPS-dokument.

```csharp
public sealed class PsDocument : Document
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Initialiserar`PsDocument` med en ström av PS/EPS-fil. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Initialiserar tom`PsDocument` med initierad sida. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Initialiserar tom`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Initialiserar tom`PsDocument` när antalet Postscript-dokumentsidor är känt i förväg. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Returnerar antalet sidor i det resulterande PDF-dokumentet. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Lägger till klipp till aktuell grafikstatus. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Lägger till klipp till aktuell grafikstatus och sedan skriver "newpath"-operatorn. Det är nödvändigt att göra för att escape av sammanflödet av denna urklippsbana och några efterföljande sökvägar, såsom glyfer som beskrivs med "charpath"-operatorn. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Lägger till urklippsrektangel till aktuellt grafikläge. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Slutför aktuell sida. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Rita en godtycklig bana. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Rita maskerad bild. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Rita bild. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Rita transformerad bild med bakgrund. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Fyll en godtycklig sökväg. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Lägger till en textsträng genom att fylla insidan av glyfer och rita glyfers konturer. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Lägger till en textsträng genom att fylla insidan av glyfer och rita glyfers konturer. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Lägger till en textsträng genom att fylla insidan av glyfer. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Lägger till en textsträng genom att fylla insidan av glyfer. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Får målning av aktuell grafikstatus. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Får ett slag av aktuellt grafikläge. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Läser PS/EPS-fil och extraherar XmpMetdata om den redan finns eller lägg till ny om den inte finns. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Slår ihop PS/EPS-filer till en enhet. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Skapar ny sida och gör den aktuell. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Lägger till en textsträng genom att rita glyfers konturer. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Lägger till en textsträng genom att rita glyfers konturer. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Lägger till rotation till aktuellt grafikläge (rotera aktuell matris). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Sparningar ges`PsDocument` som EPS-fil. Denna metod används endast när PsDocument skapades från början. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Sparningar ges`PsDocument` som EPS-fil. Den här metoden används endast efter uppdatering av XMP-metadata. Den sparar den initiala EPS-filen med uppdaterad befintlig metadata eller ny skapad under anrop av GetMetadata-metoden. I det sista fallet läggs all nödvändig PostScript-kod och EPS-kommentarer till. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Sparar PS/EPS-fil på en enhet. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Lägger till skala till aktuellt grafikläge (skala aktuell matris). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Ställer in sidenhetsparametrar (se operatör "setpagedevice" PostScript-specifikation). Bland dessa kan vara sidstorlek och färg etc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Anger sidstorlek. För att skapa sidor med olika storlekar i ett dokument använd[`SetPageDevice`](./setpagedevice/) metod strax efter denna metod. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Ställer in färg i aktuellt grafikläge. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Ställer in linje i aktuellt grafikläge. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Lägger till skjuvtransformation till aktuellt grafiktillstånd (skjuvströmmatris). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Lägger till transformation till aktuellt grafiktillstånd (sammanfogar denna matris med nuvarande). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Lägger till översättning till aktuellt grafikläge (översätter aktuell matris). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Skriver återställning av det aktuella grafiktillståndet (se PostScript-specifikationen på operatorn "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Skriver lagring av det aktuella grafiktillståndet (se PostScript-specifikationen på operatorn "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Sparar bitmappsobjekt till EPS-utgångsström. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Sparar bitmappsobjekt till EPS-fil. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Sparar PNG/JPEG/TIFF/BMP/GIF/EMF-bild från ingångsström till EPS-utgångsström. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Sparar PNG/JPEG/TIFF/BMP/GIF/EMF-bild från fil till EPS-fil. |

### Se även

* class [Document](../../aspose.page/document/)
* namnutrymme [Aspose.Page.EPS](../../aspose.page.eps/)
* hopsättning [Aspose.Page](../../)


