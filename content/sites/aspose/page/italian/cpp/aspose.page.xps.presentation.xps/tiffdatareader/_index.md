---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader classe"
linktitle: "TiffDataReader"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader classe. La classe è usata per leggere i dati dalla directory dei file immagine TIFF (IFD). Aiuta a leggere la risoluzione TIFF e a verificare la conformità TIFF in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


La classe è usata per leggere i dati dalla directory dei file immagine TIFF (IFD). Aiuta a leggere la risoluzione TIFF e a verificare la conformità TIFF.

```cpp
class TiffDataReader : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Restituisce l'altezza dell'immagine Tiff. Se l'altezza è 0, restituisce il valore predefinito (100). |
| [get_ImageWidth](./get_imagewidth/)() | Restituisce la larghezza dell'immagine Tiff. Se la larghezza è 0, restituisce il valore predefinito (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Restituisce la risoluzione X dell'immagine Tiff. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Restituisce la risoluzione Y dell'immagine Tiff. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Restituisce true se l'immagine TIFF è conforme alla specifica [XPS](../../aspose.page.xps/) e può essere inserita nel documento [XPS](../../aspose.page.xps/) così com'è. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | La documentazione per il formato è in Aspose.Words\\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Inizializza una nuova istanza della classe [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Inizializza una nuova istanza della classe [TiffDataReader](./). |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
