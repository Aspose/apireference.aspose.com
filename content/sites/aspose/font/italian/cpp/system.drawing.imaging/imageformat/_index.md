---
title: "classe System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Font per C++"
description: "classe System::Drawing::Imaging::ImageFormat. Rappresenta il formato file di un'immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Rappresenta il formato file di un'immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ImageFormat : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Determina se i formati immagine rappresentati dagli oggetti corrente e specificato sono uguali. |
| static [get_Bmp](./get_bmp/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine bitmap. |
| static [get_Emf](./get_emf/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato metafile avanzato. |
| static [get_Exif](./get_exif/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Restituisce il GUID associato al formato immagine rappresentato dall'oggetto corrente. |
| static [get_Icon](./get_icon/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine icona [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato di un bitmap in memoria. |
| static [get_Png](./get_png/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Restituisce un puntatore condiviso a un oggetto [ImageFormat](./) che rappresenta il formato immagine metafile [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Costruisce un'istanza della classe [ImageFormat](./) che rappresenta un formato immagine associato al GUID specificato. |
| virtual [ToString](./tostring/)() const | Converte questo oggetto [ImageFormat](./) in una stringa leggibile dall'uomo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
