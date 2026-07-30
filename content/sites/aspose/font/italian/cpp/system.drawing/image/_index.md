---
title: "System::Drawing::Image class"
linktitle: "Image"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Image. Una classe base per le classi System::Drawing::Bitmap e System::Drawing::Metafile che fornisce funzionalità di base. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.drawing/image/
---
## Image class


Una classe base per [System::Drawing::Bitmap](../bitmap/) e le classi System::Drawing::Metafile che fornisce funzionalità di base. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Image : public virtual System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clone](./clone/)() | Crea una copia dell'oggetto corrente. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse acquisite dall'oggetto corrente. |
| static [FromFile](./fromfile/)(const String\&, bool) | Crea un oggetto [Image](./) dal file specificato. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Costruisce un oggetto [Bitmap](../bitmap/) dal bitmap GDI specificato. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Crea un oggetto [Image](./) dallo stream specificato. |
| virtual [get_Flags](./get_flags/)() const | Restituisce una combinazione bitwise dei valori enum ImageFlags che rappresenta gli attributi dell'immagine. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Restituisce un array di GUID che rappresentano le dimensioni dei fotogrammi all'interno dell'immagine rappresentata dall'oggetto corrente. |
| virtual [get_Height](./get_height/)() const | Restituisce l'altezza dell'immagine in pixel. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Restituisce la risoluzione orizzontale dell'immagine rappresentata dall'oggetto corrente in pixel per pollice. |
| virtual [get_Palette](./get_palette/)() const | Restituisce la tavolozza dei colori usata dall'immagine rappresentata dall'oggetto corrente. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Restituisce il formato pixel dell'immagine rappresentata dall'oggetto corrente. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Ottiene gli ID degli elementi di proprietà memorizzati in questa immagine. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Ottiene tutti gli elementi di proprietà (pezzi di metadati) memorizzati in questa immagine. |
| virtual [get_RawFormat](./get_rawformat/)() const | Restituisce il formato file dell'immagine rappresentata dall'oggetto corrente. |
| [get_Size](./get_size/)() const | Restituisce un oggetto [Size](../size/) che rappresenta la larghezza e l'altezza dell'immagine in pixel. |
| virtual [get_Tag](./get_tag/)() const | Ottiene un oggetto che fornisce dati aggiuntivi sull'immagine. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Restituisce la risoluzione verticale dell'immagine rappresentata dall'oggetto corrente in pixel per pollice. |
| virtual [get_Width](./get_width/)() const | Restituisce la larghezza dell'immagine in pixel. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Restituisce i limiti dell'immagine nelle unità di misura specificate. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Restituisce il numero di fotogrammi della dimensione di fotogramma specificata. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Restituisce il numero di bit usati per rappresentare la profondità di colore nel formato pixel specificato. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Restituisce un oggetto SkBitmap sottostante. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Ottiene una miniatura per questo oggetto [System::Drawing::Image](./). |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Determina se il formato pixel specificato contiene informazioni alfa. |
| virtual [IsMultiImage](./ismultiimage/)() const | Restituisce se il formato originale è un'immagine multipla. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Ruota l'immagine di un multiplo di 90 gradi e capovolge. |
| [Save](./save/)(const String\&) | Salva l'immagine rappresentata dall'oggetto corrente nel file specificato in formato PNG. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Salva l'immagine rappresentata dall'oggetto corrente nel file specificato nel formato specificato. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Salva l'immagine rappresentata dall'oggetto corrente nello stream specificato nel formato specificato. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Salva l'immagine rappresentata dall'oggetto corrente nel file specificato usando il codificatore e i parametri del codificatore specificati. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Salva l'immagine rappresentata dall'oggetto corrente nello stream specificato utilizzando l'encoder e i parametri dell'encoder specificati. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Aggiunge un fotogramma al file o allo stream specificato in una chiamata precedente al metodo [Save()](./save/). |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Aggiunge un fotogramma al file o allo stream specificato in una chiamata precedente al metodo [Save()](./save/). |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Seleziona il fotogramma specificato. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Imposta la tavolozza dei colori usata dall'immagine rappresentata dall'oggetto corrente. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Imposta un oggetto che fornisce dati aggiuntivi sull'immagine. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | Una callback per annullare l'esecuzione di GetThumbnailImage. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
