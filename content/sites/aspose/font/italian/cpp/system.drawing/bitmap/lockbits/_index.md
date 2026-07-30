---
title: "System::Drawing::Bitmap::LockBits metodo"
linktitle: "LockBits"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Bitmap::LockBits metodo. Blocca un Bitmap nella memoria di sistema in C++."
type: docs
weight: 1500
url: /it/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Blocca un [Bitmap](../) nella memoria di sistema.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | const Rectangle\& | Un rettangolo che specifica l'area dell'immagine da bloccare |
| flag | Imaging::ImageLockMode | Specifica il livello di accesso al bitmap |
| formato | Imaging::PixelFormat | Il formato dati di questo bitmap |

### ReturnValue

Un puntatore condiviso a un oggetto BitmapData che contiene informazioni sull'operazione di lock eseguita

## Vedi anche

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Blocca un [Bitmap](../) nella memoria di sistema.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | const Rectangle\& | Un rettangolo che specifica l'area dell'immagine da bloccare |
| flag | Imaging::ImageLockMode | Specifica il livello di accesso al bitmap |
| formato | Imaging::PixelFormat | Il formato dati di questo bitmap |
| bitmap_data | const Imaging::BitmapDataPtr\& | Contiene informazioni sull'operazione di blocco |

### ReturnValue

Un puntatore condiviso a un oggetto BitmapData che contiene informazioni sull'operazione di lock eseguita

## Vedi anche

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
