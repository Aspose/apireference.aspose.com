---
title: "Aspose::Page::EPS::PsDocument klass"
linktitle: "PsDocument"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument klass. Denna klass kapslar PS/EPS-dokument i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Denna klass kapslar in PS/EPS‑dokument.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Lägger till klippning i aktuell grafikstatus. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Lägger till klippning i aktuell grafikstatus och skriver sedan \"newpath\"-operatorn. Detta är nödvändigt för att undvika sammansmältning av denna klippningsbana med vissa efterföljande banor såsom glyfer som kontureras med \"charpath\"-operatorn. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Lägger till klippningsrektangel i aktuell grafikstatus. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Lägger till klippning från konturen av given text i given teckensnitt. |
| [ClosePage](./closepage/)() | Slutför aktuell sida. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Konverterar Type 1-typsnitt till **TrueType**. Namnet på det konverterade TTF-typsnittet blir samma som inmatat Type 1-typsnitt med \".ttf\"-ändelse. TTF-filen sparas till den tilldelade utdatamappen. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Konverterar Type 3-typsnitt till **TrueType**. Namnet på det konverterade TTF-typsnittet blir samma som inmatad Type 3-typsnittfil med \".ttf\"-ändelse. TTF-filen sparas till den tilldelade utdatamappen. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Konverterar Type 3-typsnitt till **TrueType**-ström. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Beskär given [PsDocument](./) som [EPS](../)-fil. Den sparar den ursprungliga [EPS](../)-filen med uppdaterad befintlig %BoundingBox eller en ny skapas. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Beskär given [PsDocument](./) som [EPS](../)-fil. Den sparar den ursprungliga [EPS](../)-filen med uppdaterad befintlig %BoundingBox eller en ny skapas. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Rita en godtycklig bana. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Ritar en båge. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Rita maskerad bild. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Rita bild. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Rita transformerad bild med bakgrund. |
| [DrawLine](./drawline/)(double, double, double, double) | Ritar ett linjesegment. |
| [DrawOval](./drawoval/)(double, double, double, double) | Ritar en oval. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Ritar en polygon. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Ritar en poligon. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Ritar en polylinje. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Ritar en polylinje. |
| [DrawRect](./drawrect/)(double, double, double, double) | Ritar en rektangel. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Ritar en rund rektangel. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Ritar transformerad transparent bild. Om bilden inte har en Alpha-kanal kommer den att ritas som en opak bild. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Läser [EPS](../)-fil och extraherar begränsningsrutan för [EPS](../)-bilden från %BoundingBox-kommentaren eller gränserna för standard sidstorlek (0, 0, 595, 842) om den inte finns. |
| [ExtractEpsSize](./extractepssize/)() | Läser [EPS](../)-fil och extraherar storleken på [EPS](../)-bilden från %BoundingBox-kommentaren eller standard sidstorlek (595, 842) om den inte finns. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extrahera text från PS-fil. Texten kan endast extraheras om den är skriven med Type 42 (**TrueType**)-teckensnitt eller Type 0-teckensnitt med Type 42-teckensnitt i dess vektorkarta. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Fyll en godtycklig bana. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Fyll en båge. |
| [FillOval](./filloval/)(double, double, double, double) | Fyll en oval. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Fyll en poligon. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Fyll en poligon. |
| [FillRect](./fillrect/)(double, double, double, double) | Fyll en rektangel. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Fyll en rund rektangel. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Lägger till en textsträng genom att fylla inuti teckenformer. |
| [get_InputStream](./get_inputstream/)() | Initierar [PsDocument](./) med en ström och laddningsalternativ. |
| [get_NumberOfPages](./get_numberofpages/)() const | Returnerar antalet sidor i det resulterande PDF-dokumentet. |
| [GetPaint](./getpaint/)() | Hämtar färg för aktuellt grafikläge. |
| [GetStroke](./getstroke/)() | Ställer in penseldrag i aktuellt grafikläge. |
| [GetXmpMetadata](./getxmpmetadata/)() | Läser PS/EPS-fil och extraherar XmpMetdata om den redan finns eller lägger till en ny om den inte finns. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Slår samman PS/EPS-filer till en enhet. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Slår samman PS/EPS-filer till en enhet. |
| [OpenPage](./openpage/)(float, float) | Skapar en ny sida och gör den till den aktuella. |
| [OpenPage](./openpage/)(System::String) | Skapar en ny sida med dokumentets storlek och gör den till den aktuella. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att rita glyfkonturer. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Lägger till en textsträng genom att rita glyfkonturer. |
| [PsDocument](./psdocument/)() | Initierar ett tomt [PsDocument](./). Denna konstruktor används endast för ytterligare operationer som inte är relaterade till PostScript-filer, till exempel konvertering av teckensnitt. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Initierar ett tomt [PsDocument](./) med en initierad sida. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Initierar ett tomt [PsDocument](./) med en initierad sida. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initierar ett tomt [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initierar ett tomt [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initierar ett tomt [PsDocument](./) när antalet [Postscript](../../aspose.page.eps.postscript/) dokumentsidor är känt i förväg. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initierar ett tomt [PsDocument](./) när antalet [Postscript](../../aspose.page.eps.postscript/) dokumentsidor är känt i förväg. |
| [PsDocument](./psdocument/)(System::String) | Initierar [PsDocument](./) med en inmatningsfil för PS/EPS. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Initierar [PsDocument](./) med en ström av PS/EPS-fil. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Ändrar storlek på angivet [PsDocument](./) som en [EPS](../)-fil. Denna metod används endast efter att ha extraherat [EPS](../)-storlek. Den sparar den ursprungliga [EPS](../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e med uppdaterad befintlig %BoundingBox eller en ny kommer att skapas. [Page](../../aspose.page/) transformationsmatrisen kommer också att sättas. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Ändrar storlek på angivet [PsDocument](./) som en [EPS](../)-fil. Denna metod används endast efter att ha extraherat [EPS](../)-storlek. Den sparar den ursprungliga [EPS](../)-filen med uppdaterad befintlig %BoundingBox eller en ny kommer att skapas. [Page](../../aspose.page/)-transformationsmatrisen kommer också att sättas. |
| [Rotate](./rotate/)(float) | Lägger till en motursrotation kring origo i det aktuella grafikläget (rotera den aktuella matrisen). |
| [Rotate](./rotate/)(int32_t) | Lägger till en motursrotation kring origo i det aktuella grafikläget (rotera den aktuella matrisen). |
| [Save](./save/)(System::String) | Sparar angivet [PsDocument](./) som en [EPS](../)-fil. Denna metod används endast efter att ha uppdaterat [XMP](../../aspose.page.eps.xmp/)-metadata. Den sparar den ursprungliga [EPS](../)-filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av GetMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och [EPS](../)-kommentarer till. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Sparar angivet [PsDocument](./) till strömmen. Denna metod används endast efter att ha uppdaterat [XMP](../../aspose.page.eps.xmp/)-metadata. Den sparar den ursprungliga [EPS](../)-filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av GetMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och [EPS](../)-kommentarer till. |
| [Save](./save/)() | Sparar angivet [PsDocument](./) som PS‑ eller [EPS](../)-fil. Denna metod används endast när [PsDocument](./) skapades från början. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Sparar PS/EPS‑fil till en bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som för indata‑PS‑filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte är FileStream, sparas bildfilen i den aktuella mappen med standardmall för filnamn. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Sparar PS/EPS‑fil till en bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i parametern \"options\". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Sparar PS/EPS‑fil till bild‑byte‑arrayer. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Sparar PS/EPS‑fil till en PDF‑fil. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Sparar PS/EPS‑fil till en PDF‑ström. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Sparar PNG/JPEG/TIFF/BMP/GIF/EMF‑bild från inmatningsström till [EPS](../)-utström. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Sparar PNG/JPEG/TIFF/BMP/GIF/EMF‑bild från fil till [EPS](../)-fil. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Sparar Bitmap‑objekt till [EPS](../)-fil. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Sparar Bitmap‑objekt till [EPS](../)-utström. |
| [Scale](./scale/)(float, float) | Lägger till skalning i det aktuella grafikläget (skala den aktuella matrisen). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Initierar [PsDocument](./) med en ström och laddningsalternativ. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Ställer in sidans enhetsparametrar (se operatorn \"setpagedevice\" i PostScript‑specifikationen). Bland dessa kan sidstorlek, färg osv. ingå. |
| [SetPageSize](./setpagesize/)(float, float) | Ställer in sidstorlek. För att skapa sidor med olika storlekar i ett dokument, använd metoden [SetPageDevice](./setpagedevice/) direkt efter denna metod. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Ställer in färg i det aktuella grafikläget. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Ställer in penseldrag i aktuellt grafikläge. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ställ in den aktuella transformationen till denna. |
| [Shear](./shear/)(float, float) | Roterar det aktuella grafikläget moturs runt en punkt. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Lägger till transformation till det aktuella grafikläget (konkatenerar denna matris med den aktuella). |
| [Translate](./translate/)(float, float) | Lägger till förskjutning till det aktuella grafikläget (förskjuter den aktuella matrisen). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Skriver återställning av det aktuella grafikläget (se PostScript-specifikationen för operatorn "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Skriver sparande av det aktuella grafikläget (se PostScript-specifikationen för operatorn "gsave"). |
## Se även

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
