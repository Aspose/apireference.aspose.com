---
title: "Classe System::Drawing::Imaging::ImageCodecInfo"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page per C++"
description: "Classe System::Drawing::Imaging::ImageCodecInfo. Fornisce informazioni su un codec immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Fornisce informazioni su un codec immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ImageCodecInfo : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Restituisce un GUID associato al formato del codec rappresentato dall'oggetto corrente. |
| [get_MimeType](./get_mimetype/)() | Restituisce il tipo Multipurpose Internet Mail Extensions (MIME) del codec rappresentato dall'oggetto corrente. |
| static [GetImageDecoders](./getimagedecoders/)() | Restituisce un array di oggetti [ImageCodecInfo](./) che rappresentano i decoder immagine supportati. |
| static [GetImageEncoders](./getimageencoders/)() | Restituisce un array di oggetti [ImageCodecInfo](./) che rappresentano gli encoder immagine supportati. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Imposta un GUID associato al formato del codec rappresentato dall'oggetto corrente. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
