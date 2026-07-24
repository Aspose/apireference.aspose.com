---
title: "Aspose::Page::EPS::PsDocument klasse"
linktitle: "PsDocument"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument klasse. Deze klasse omvat PS/EPS‑documenten in C++."
type: docs
weight: 700
url: /nl/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Deze klasse encapsuleert PS/EPS‑documenten.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Voegt clip toe aan de huidige grafische status. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Voegt clip toe aan de huidige grafische status en schrijft vervolgens de "newpath"‑operator. Dit is nodig om de samenvloeiing van dit clippad en enkele daaropvolgende paden, zoals glyphs omlijnd met de "charpath"‑operator, te vermijden. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Voegt een clip‑rechthoek toe aan de huidige grafische status. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Voegt clip toe vanuit een omtrek van de opgegeven tekst in het opgegeven lettertype. |
| [ClosePage](./closepage/)() | Voltooi huidige pagina. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Converteert Type‑1‑lettertype naar **TrueType**. De naam van het geconverteerde TTF‑lettertype wordt dezelfde als het invoer‑Type‑1‑lettertype met de extensie ".ttf". Het TTF‑bestand wordt opgeslagen in de toegewezen uitvoermap. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Converteert Type‑3‑lettertype naar **TrueType**. De naam van het geconverteerde TTF‑lettertype wordt dezelfde als het invoer‑Type‑3‑lettertypebestand met de extensie ".ttf". Het TTF‑bestand wordt opgeslagen in de toegewezen uitvoermap. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Converteert Type‑3‑lettertype naar **TrueType**‑stroom. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Bijsnijdt gegeven [PsDocument](./) als [EPS](../)‑bestand. Het slaat het oorspronkelijke [EPS](../)‑bestand op met een bijgewerkte bestaande %BoundingBox of er wordt een nieuwe aangemaakt. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Bijsnijdt gegeven [PsDocument](./) als [EPS](../)‑bestand. Het slaat het oorspronkelijke [EPS](../)‑bestand op met een bijgewerkte bestaande %BoundingBox of er wordt een nieuwe aangemaakt. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Teken een willekeurig pad. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Teken een boog. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Teken gemaskeerde afbeelding. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Teken afbeelding. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Teken getransformeerde afbeelding met achtergrond. |
| [DrawLine](./drawline/)(double, double, double, double) | Teken een lijnsegment. |
| [DrawOval](./drawoval/)(double, double, double, double) | Teken een ovaal. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Tekent een veelhoek. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Tekent een veelhoek. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Tekent een polylijn. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Tekent een polylijn. |
| [DrawRect](./drawrect/)(double, double, double, double) | Tekent een rechthoek. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Tekent een afgeronde rechthoek. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Tekent een getransformeerde transparante afbeelding. Als de afbeelding geen alfakanaal heeft, wordt deze getekend als een ondoorzichtige afbeelding. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Leest een [EPS](../)-bestand en haalt de begrenzingskader van de [EPS](../)-afbeelding op uit de %BoundingBox-opmerking of de grenzen voor de standaard paginagrootte (0, 0, 595, 842) als deze niet bestaat. |
| [ExtractEpsSize](./extractepssize/)() | Leest een [EPS](../)-bestand en haalt de grootte van de [EPS](../)-afbeelding op uit de %BoundingBox-opmerking of de standaard paginagrootte (595, 842) als deze niet bestaat. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extraheer tekst uit een PS-bestand. De tekst kan alleen worden geëxtraheerd als deze is geschreven met een Type 42 (**TrueType**) lettertype of Type 0-lettertype met Type 42-lettertypen in de Vector Map. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Vul een willekeurig pad. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Vult een boog. |
| [FillOval](./filloval/)(double, double, double, double) | Vult een ovaal. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Vult een veelhoek. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Vult een veelhoek. |
| [FillRect](./fillrect/)(double, double, double, double) | Vult een rechthoek. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Vult een afgeronde rechthoek. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Voegt een tekstreeks toe door de binnenkant van glyphs te vullen. |
| [get_InputStream](./get_inputstream/)() | Initialiseert [PsDocument](./) met een stream en laadopties. |
| [get_NumberOfPages](./get_numberofpages/)() const | Retourneert het aantal pagina's in het resulterende PDF-document. |
| [GetPaint](./getpaint/)() | Haalt de paint op van de huidige grafische toestand. |
| [GetStroke](./getstroke/)() | Stelt de stroke in van de huidige grafische toestand. |
| [GetXmpMetadata](./getxmpmetadata/)() | Leest een PS/EPS-bestand en haalt XmpMetdata op als het al bestaat of voegt een nieuwe toe als het niet bestaat. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Voegt PS/EPS-bestanden samen naar een apparaat. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Voegt PS/EPS-bestanden samen naar een apparaat. |
| [OpenPage](./openpage/)(float, float) | Maakt een nieuwe pagina aan en maakt deze de huidige. |
| [OpenPage](./openpage/)(System::String) | Maakt een nieuwe pagina aan met de grootte van het document en maakt deze de huidige. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Voegt een tekststring toe door de contouren van glyphs te tekenen. |
| [PsDocument](./psdocument/)() | Initialiseert een leeg [PsDocument](./). Deze constructor wordt alleen gebruikt voor extra bewerkingen die niet gerelateerd zijn aan PostScript‑bestanden, bijvoorbeeld het converteren van lettertypen. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Initialiseert een leeg [PsDocument](./) met een geïnitialiseerde pagina. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Initialiseert een leeg [PsDocument](./) met een geïnitialiseerde pagina. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialiseert een leeg [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialiseert een leeg [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialiseert een leeg [PsDocument](./) wanneer het aantal [Postscript](../../aspose.page.eps.postscript/) documentpagina's van tevoren bekend is. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialiseert een leeg [PsDocument](./) wanneer het aantal [Postscript](../../aspose.page.eps.postscript/) documentpagina's van tevoren bekend is. |
| [PsDocument](./psdocument/)(System::String) | Initialiseert [PsDocument](./) met een invoer‑PS/EPS‑bestand. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Initialiseert [PsDocument](./) met een stream van een PS/EPS‑bestand. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Verandert de grootte van het opgegeven [PsDocument](./) als een [EPS](../)‑bestand. Deze methode wordt alleen gebruikt na het extraheren van de [EPS](../)‑grootte. Het slaat het oorspronkelijke [EPS](../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hDe uitvoermap waar het afbeeldingsbestand zal worden opgeslagen.e op met een bijgewerkte bestaande %BoundingBox of maakt een nieuwe aan. De [Page](../../aspose.page/) transformatiematrix wordt ook ingesteld. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Verandert de grootte van het opgegeven [PsDocument](./) als een [EPS](../)‑bestand. Deze methode wordt alleen gebruikt na het extraheren van de [EPS](../)‑grootte. Het slaat het oorspronkelijke [EPS](../)‑bestand op met een bijgewerkte bestaande %BoundingBox of maakt een nieuwe aan. De [Page](../../aspose.page/) transformatiematrix wordt ook ingesteld. |
| [Rotate](./rotate/)(float) | Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix). |
| [Rotate](./rotate/)(int32_t) | Voegt een tegen de klok in rotatie rond de oorsprong toe aan de huidige grafische toestand (roteer de huidige matrix). |
| [Save](./save/)(System::String) | Slaat het opgegeven [PsDocument](./) op als een [EPS](../)‑bestand. Deze methode wordt alleen gebruikt na het bijwerken van de [XMP](../../aspose.page.eps.xmp/)‑metadata. Het slaat het oorspronkelijke [EPS](../)‑bestand op met bijgewerkte bestaande metadata of een nieuwe die is aangemaakt tijdens het aanroepen van de GetMetadata‑methode. In het laatste geval worden alle benodigde PostScript‑code en [EPS](../)‑commentaren toegevoegd. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Slaat het opgegeven [PsDocument](./) op naar de stream. Deze methode wordt alleen gebruikt na het bijwerken van de [XMP](../../aspose.page.eps.xmp/)‑metadata. Het slaat het oorspronkelijke [EPS](../)‑bestand op met bijgewerkte bestaande metadata of een nieuwe die is aangemaakt tijdens het aanroepen van de GetMetadata‑methode. In het laatste geval worden alle benodigde PostScript‑code en [EPS](../)‑commentaren toegevoegd. |
| [Save](./save/)() | Slaat het opgegeven [PsDocument](./) op als PS‑ of [EPS](../)‑bestand. Deze methode wordt alleen gebruikt wanneer [PsDocument](./) vanaf nul is aangemaakt. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Slaat een PS/EPS‑bestand op als afbeeldingsbestand. De uitvoermap en de bestandsnaam zijn dezelfde als van het invoer‑PS‑bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options". Als het document is geïnitialiseerd met een stream die geen FileStream is, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Slaat een PS/EPS‑bestand op als afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Slaat een PS/EPS‑bestand op als byte‑arrays van afbeeldingen. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Slaat een PS/EPS‑bestand op als PDF‑bestand. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Slaat een PS/EPS‑bestand op als PDF‑stream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Slaat een PNG/JPEG/TIFF/BMP/GIF/EMF‑afbeelding op van een invoer‑stream naar een [EPS](../)‑uitvoer‑stream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Slaat een PNG/JPEG/TIFF/BMP/GIF/EMF‑afbeelding op van een bestand naar een [EPS](../)‑bestand. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Slaat een Bitmap‑object op naar een [EPS](../)‑bestand. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Slaat een Bitmap‑object op naar een [EPS](../)‑uitvoer‑stream. |
| [Scale](./scale/)(float, float) | Voegt een schaal toe aan de huidige grafische toestand (schaal de huidige matrix). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Initialiseert [PsDocument](./) met een stream en laadopties. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Stelt paginabereidingsparameters in (zie operator "setpagedevice" PostScript‑specificatie). Hieronder kunnen paginagrootte, kleur enzovoort vallen. |
| [SetPageSize](./setpagesize/)(float, float) | Stelt de paginagrootte in. Om pagina's met verschillende groottes in één document te maken, gebruik je de [SetPageDevice](./setpagedevice/)‑methode direct na deze methode. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Stelt de verf in de huidige grafische toestand in. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Stelt de stroke in van de huidige grafische toestand. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Stel de huidige transformatie in op deze. |
| [Shear](./shear/)(float, float) | Roteert de huidige grafische toestand tegen de klok in rond een punt. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Voegt een transformatie toe aan de huidige grafische toestand (voegt deze matrix samen met de huidige). |
| [Translate](./translate/)(float, float) | Voegt een translatie toe aan de huidige grafische toestand (verplaatst de huidige matrix). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Schrijft het herstellen van de huidige grafische toestand (Zie de PostScript-specificatie voor de operator \"grestore\"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Schrijft het opslaan van de huidige grafische toestand (Zie de PostScript-specificatie voor de operator \"gsave\"). |
## Zie ook

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
