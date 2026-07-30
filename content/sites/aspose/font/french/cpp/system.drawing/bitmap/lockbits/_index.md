---
title: "System::Drawing::Bitmap::LockBits méthode"
linktitle: "LockBits"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Bitmap::LockBits méthode. Verrouille un Bitmap dans la mémoire système en C++."
type: docs
weight: 1500
url: /fr/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Verrouille un [Bitmap](../) dans la mémoire système.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rect | const Rectangle\& | Un rectangle qui spécifie la région de l'image à verrouiller |
| indicateurs | Imaging::ImageLockMode | Spécifie le niveau d'accès au bitmap |
| format | Imagerie::FormatPixel | Le format de données de ce bitmap |

### ReturnValue

Un pointeur partagé vers un objet BitmapData contenant des informations sur l'opération de verrouillage effectuée

## Voir aussi

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Verrouille un [Bitmap](../) dans la mémoire système.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rect | const Rectangle\& | Un rectangle qui spécifie la région de l'image à verrouiller |
| indicateurs | Imaging::ImageLockMode | Spécifie le niveau d'accès au bitmap |
| format | Imagerie::FormatPixel | Le format de données de ce bitmap |
| bitmap_data | const Imaging::BitmapDataPtr\& | Contient des informations sur l'opération de verrouillage |

### ReturnValue

Un pointeur partagé vers un objet BitmapData contenant des informations sur l'opération de verrouillage effectuée

## Voir aussi

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
