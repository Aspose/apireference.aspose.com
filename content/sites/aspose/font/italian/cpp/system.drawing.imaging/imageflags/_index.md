---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::ImageFlags enum. Rappresenta gli attributi dei dati pixel rappresentati da un oggetto Image in C++."
type: docs
weight: 2200
url: /it/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


Rappresenta gli attributi dei dati pixel rappresentati da un oggetto [Image](../../system.drawing/image/).

```cpp
enum class ImageFlags
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 |  |
| Scalabile | 1 | Scalabile. |
| HasAlpha | 2 | Contiene informazioni alfa. |
| HasTranslucent | 4 | Ci sono valori alfa maggiori di 0 e minori di 255. |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | I dati dei pixel sono rappresentati nello spazio colore RGB. |
| ColorSpaceCmyk | 32 | I dati dei pixel sono rappresentati nello spazio colore CMYK. |
| ColorSpaceGray | 64 | I dati dei pixel sono in scala di grigi. |
| ColorSpaceYcbcr | 128 | I dati dei pixel sono rappresentati nello spazio colore YCBCR. |
| ColorSpaceYcck | 256 | I dati dei pixel sono rappresentati nello spazio colore YCCK. |
| HasRealDpi | 4096 | Le informazioni DPI sono memorizzate nell'immagine. |
| HasRealPixelSize | 8192 | La dimensione di un pixel è memorizzata nell'immagine. |
| ReadOnly | 65536 | I dati dei pixel sono di sola lettura. |
| Caching | 131072 | Può essere memorizzato nella cache per un accesso più veloce. |

## Vedi anche

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
