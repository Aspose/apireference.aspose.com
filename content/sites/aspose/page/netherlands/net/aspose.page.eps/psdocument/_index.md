---
title: Class PsDocument
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.EPS.PsDocument klas. Deze klasse kapselt PS/EPSdocumenten in.
type: docs
weight: 140
url: /nl/net/aspose.page.eps/psdocument/
---
## PsDocument class

Deze klasse kapselt PS/EPS-documenten in.

```csharp
public sealed class PsDocument : Document
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Initialiseert`PsDocument` met een stroom PS/EPS-bestand. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Initialiseert leeg`PsDocument` met geïnitialiseerde pagina. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Initialiseert leeg`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Initialiseert leeg`PsDocument` wanneer het aantal Postscript-documentpagina's vooraf bekend is. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Retourneert het aantal pagina's in het resulterende PDF-document. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Voegt clip toe aan huidige grafische status. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Voegt een clip toe aan de huidige grafische status en schrijft vervolgens de "newpath"-operator. Het is noodzakelijk om te ontsnappen aan de samenvloeiing van dit uitknippad en enkele daaropvolgende paden, zoals glyphs omlijnd met de "charpath"-operator. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Voegt een uitkniprechthoek toe aan de huidige grafische status. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Volledige huidige pagina. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Teken een willekeurig pad. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Gemaskerde afbeelding tekenen. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Afbeelding tekenen. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Teken getransformeerde afbeelding met achtergrond. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Vul een willekeurig pad in. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Voegt een tekenreeks toe door de binnenkant van glyphs te vullen en contouren van glyphs te tekenen. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Voegt een tekenreeks toe door de binnenkant van glyphs te vullen en contouren van glyphs te tekenen. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Voegt een tekenreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Voegt een tekenreeks toe door de binnenkant van glyphs te vullen. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Krijgt verf van de huidige grafische status. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Haalt de huidige grafische status op. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Leest PS/EPS-bestand en extraheert XmpMetdata als het al bestaat of voegt een nieuw toe als het niet bestaat. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Voegt PS/EPS-bestanden samen op een apparaat. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Maakt een nieuwe pagina aan en maakt deze de huidige. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Voegt een tekenreeks toe door glyphs-contouren te tekenen. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Voegt een tekenreeks toe door glyphs-contouren te tekenen. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Voegt rotatie toe aan huidige grafische status (roteer huidige matrix). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Slaat opgegeven`PsDocument` als EPS-bestand. Deze methode wordt alleen gebruikt wanneer PsDocument helemaal opnieuw is gemaakt. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Slaat opgegeven`PsDocument` als EPS-bestand. Deze methode wordt alleen gebruikt na het bijwerken van de XMP-metadata. Het slaat het initiële EPS-bestand op met bijgewerkte bestaande metadata of een nieuw aangemaakt bestand tijdens het aanroepen van de GetMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en EPS-opmerkingen toegevoegd. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Slaat PS/EPS-bestand op een apparaat op. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Voegt schaal toe aan de huidige grafische status (schaal huidige matrix). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Stelt pagina-apparaatparameters in (zie operator "setpagedevice" PostScript-specificatie). Hiertoe kunnen paginagrootte en -kleur enz. behoren. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Stelt het paginaformaat in. Gebruik om pagina's met verschillende formaten in één document te maken[`SetPageDevice`](./setpagedevice/) methode net na deze methode. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Stelt verf in huidige grafische status in. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Stelt lijn in huidige grafische status in. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Voegt afschuiftransformatie toe aan de huidige grafische status (afschuifstroommatrix). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Voegt transformatie toe aan de huidige grafische staat (voegt deze matrix samen met de huidige). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Voegt vertaling toe aan huidige grafische staat (vertaalt huidige matrix). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Schrijft herstel van de huidige grafische staat (Zie PostScript-specificatie op operator "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Schrijft het opslaan van de huidige grafische status (Zie PostScript-specificatie op operator "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Slaat Bitmap-object op in EPS-uitvoerstroom. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Slaat Bitmap-object op in EPS-bestand. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Slaat PNG/JPEG/TIFF/BMP/GIF/EMF-afbeelding op van invoerstroom naar EPS-uitvoerstroom. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Slaat PNG/JPEG/TIFF/BMP/GIF/EMF-afbeelding op van bestand naar EPS-bestand. |

### Zie ook

* class [Document](../../aspose.page/document/)
* naamruimte [Aspose.Page.EPS](../../aspose.page.eps/)
* montage [Aspose.Page](../../)


