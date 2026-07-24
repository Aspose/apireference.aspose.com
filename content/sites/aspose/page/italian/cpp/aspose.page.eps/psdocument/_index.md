---
title: "classe Aspose::Page::EPS::PsDocument"
linktitle: "PsDocument"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::EPS::PsDocument. Questa classe incapsula documenti PS/EPS in C++."
type: docs
weight: 700
url: /it/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Questa classe incapsula documenti PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Aggiunge clip allo stato grafico corrente. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Aggiunge clip allo stato grafico corrente e poi scrive l'operatore "newpath". È necessario farlo per evitare la confluenza di questo percorso di ritaglio con alcuni percorsi successivi, come i glifi delineati con l'operatore "charpath". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Aggiunge un rettangolo di ritaglio allo stato grafico corrente. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Aggiunge clip da un contorno del testo fornito nel font specificato. |
| [ClosePage](./closepage/)() | Completa la pagina corrente. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Converte il font Type 1 in **TrueType**. Il nome del font TTF convertito sarà lo stesso del font Type 1 di input con estensione ".ttf". Il file TTF sarà salvato nella directory di output assegnata. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Converte il font Type 3 in **TrueType**. Il nome del font TTF convertito sarà lo stesso del file font Type 3 di input con estensione ".ttf". Il file TTF sarà salvato nella directory di output assegnata. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Converte il font Type 3 in flusso **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Ritaglia il [PsDocument](./) fornito come file [EPS](../). Salva il file [EPS](../) iniziale con %BoundingBox esistente aggiornato o ne crea uno nuovo. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Ritaglia il [PsDocument](./) fornito come file [EPS](../). Salva il file [EPS](../) iniziale con %BoundingBox esistente aggiornato o ne crea uno nuovo. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Disegna un percorso arbitrario. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Disegna un arco. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Disegna un'immagine mascherata. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Disegna un'immagine. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Disegna un'immagine trasformata con sfondo. |
| [DrawLine](./drawline/)(double, double, double, double) | Disegna un segmento di linea. |
| [DrawOval](./drawoval/)(double, double, double, double) | Disegna un'ovale. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Disegna un poligono. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Disegna un poligono. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Disegna una polilinea. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Disegna una polilinea. |
| [DrawRect](./drawrect/)(double, double, double, double) | Disegna un rettangolo. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Disegna un rettangolo arrotondato. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Disegna un'immagine trasparente trasformata. Se l'immagine non ha canale Alpha, verrà disegnata come immagine opaca. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Legge il file [EPS](../) ed estrae il riquadro di delimitazione dell'immagine [EPS](../) dal commento %BoundingBox o i limiti per la dimensione predefinita della pagina (0, 0, 595, 842) se non esiste. |
| [ExtractEpsSize](./extractepssize/)() | Legge il file [EPS](../) ed estrae la dimensione dell'immagine [EPS](../) dal commento %BoundingBox o la dimensione predefinita della pagina (595, 842) se non esiste. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Estrai il testo dal file PS. Il testo può essere estratto solo se è scritto con il font Type 42 (**TrueType**) o con il font Type 0 con font Type 42 nella sua Mappa Vettoriale. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Riempi un percorso arbitrario. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Riempi un arco. |
| [FillOval](./filloval/)(double, double, double, double) | Riempi un ovale. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Riempi un poligono. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Riempi un poligono. |
| [FillRect](./fillrect/)(double, double, double, double) | Riempi un rettangolo. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Riempi un rettangolo arrotondato. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Aggiunge una stringa di testo riempiendo l'interno dei glifi. |
| [get_InputStream](./get_inputstream/)() | Inizializza [PsDocument](./) con uno stream e opzioni di caricamento. |
| [get_NumberOfPages](./get_numberofpages/)() const | Restituisce il numero di pagine nel documento PDF risultante. |
| [GetPaint](./getpaint/)() | Ottiene il colore di riempimento dello stato grafico corrente. |
| [GetStroke](./getstroke/)() | Imposta il tratto nello stato grafico corrente. |
| [GetXmpMetadata](./getxmpmetadata/)() | Legge il file PS/EPS ed estrae XmpMetdata se esiste già o ne aggiunge uno nuovo se non esiste. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Unisce i file PS/EPS a un dispositivo. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Unisce i file PS/EPS a un dispositivo. |
| [OpenPage](./openpage/)(float, float) | Crea una nuova pagina e la rende quella corrente. |
| [OpenPage](./openpage/)(System::String) | Crea una nuova pagina con le dimensioni del documento e la rende quella corrente. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [PsDocument](./psdocument/)() | Inizializza un [PsDocument](./) vuoto. Questo costruttore è usato solo per operazioni aggiuntive che non sono correlate ai file PostScript, ad esempio la conversione dei font. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Inizializza un [PsDocument](./) vuoto con una pagina inizializzata. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Inizializza un [PsDocument](./) vuoto con una pagina inizializzata. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Inizializza un [PsDocument](./) vuoto. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Inizializza un [PsDocument](./) vuoto. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Inizializza un [PsDocument](./) vuoto quando il numero di pagine del documento [Postscript](../../aspose.page.eps.postscript/) è noto in anticipo. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Inizializza un [PsDocument](./) vuoto quando il numero di pagine del documento [Postscript](../../aspose.page.eps.postscript/) è noto in anticipo. |
| [PsDocument](./psdocument/)(System::String) | Inizializza il [PsDocument](./) con un file PS/EPS di input. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Inizializza il [PsDocument](./) con uno stream di file PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Ridimensiona il [PsDocument](./) fornito come file [EPS](../). Questo metodo è usato solo dopo aver estratto la dimensione del [EPS](../). Salva il file [EPS](../) iniziale D:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.h nella directory di output dove verrà salvato il file immagine, con il %BoundingBox esistente aggiornato o ne crea uno nuovo. Anche la matrice di trasformazione del [Page](../../aspose.page/) verrà impostata. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Ridimensiona il [PsDocument](./) fornito come file [EPS](../). Questo metodo è usato solo dopo aver estratto la dimensione del [EPS](../). Salva il file [EPS](../) iniziale con il %BoundingBox esistente aggiornato o ne crea uno nuovo. Anche la matrice di trasformazione del [Page](../../aspose.page/) verrà impostata. |
| [Rotate](./rotate/)(float) | Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente). |
| [Rotate](./rotate/)(int32_t) | Aggiunge una rotazione in senso antiorario attorno all'origine allo stato grafico corrente (ruota la matrice corrente). |
| [Save](./save/)(System::String) | Salva il [PsDocument](./) fornito come file [EPS](../). Questo metodo è usato solo dopo l'aggiornamento dei metadati [XMP](../../aspose.page.eps.xmp/). Salva il file [EPS](../) iniziale con i metadati esistenti aggiornati o ne crea uno nuovo chiamando il metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutti i codici PostScript necessari e i commenti [EPS](../). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Salva il [PsDocument](./) fornito nello stream. Questo metodo è usato solo dopo l'aggiornamento dei metadati [XMP](../../aspose.page.eps.xmp/). Salva il file [EPS](../) iniziale con i metadati esistenti aggiornati o ne crea uno nuovo chiamando il metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutti i codici PostScript necessari e i commenti [EPS](../). |
| [Save](./save/)() | Salva il [PsDocument](./) fornito come file PS o [EPS](../). Questo metodo è usato solo quando il [PsDocument](./) è stato creato da zero. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Salva il file PS/EPS in un file immagine. La directory di output e il nome del file saranno gli stessi del file PS di input. L'estensione del file corrisponderà al formato immagine specificato nel parametro \"options\". Se il documento è stato inizializzato con uno stream che non è un FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Salva il file PS/EPS in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine indicato nel parametro \"options\". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Salva il file PS/EPS in array di byte di immagini. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Salva il file PS/EPS in un file PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Salva il file PS/EPS in uno stream PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Salva l'immagine PNG/JPEG/TIFF/BMP/GIF/EMF dallo stream di input nello stream di output [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Salva l'immagine PNG/JPEG/TIFF/BMP/GIF/EMF da file a file [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Salva l'oggetto Bitmap in un file [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Salva l'oggetto Bitmap nello stream di output [EPS](../). |
| [Scale](./scale/)(float, float) | Aggiunge una scala allo stato grafico corrente (scala la matrice corrente). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Inizializza [PsDocument](./) con uno stream e opzioni di caricamento. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Imposta i parametri del dispositivo di pagina (vedi l'operatore \"setpagedevice\" nella specifica PostScript). Tra questi possono esserci dimensioni della pagina, colore, ecc. |
| [SetPageSize](./setpagesize/)(float, float) | Imposta la dimensione della pagina. Per creare pagine di dimensioni diverse in un unico documento, usa il metodo [SetPageDevice](./setpagedevice/) subito dopo questo metodo. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Imposta la vernice nello stato grafico corrente. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Imposta il tratto nello stato grafico corrente. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Imposta la trasformazione corrente a questa. |
| [Shear](./shear/)(float, float) | Ruota lo stato grafico corrente in senso antiorario attorno a un punto. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Aggiunge una trasformazione allo stato grafico corrente (concatena questa matrice con quella corrente). |
| [Translate](./translate/)(float, float) | Aggiunge una traslazione allo stato grafico corrente (trasla la matrice corrente). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Scrive il ripristino dello stato grafico corrente (vedi la specifica PostScript sull'operatore "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Scrive il salvataggio dello stato grafico corrente (vedi la specifica PostScript sull'operatore "gsave"). |
## Vedi anche

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
