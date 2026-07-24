---
title: "System::Drawing::Bitmap::LockBits methode"
linktitle: "LockBits"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Bitmap::LockBits methode. Vergrendelt een Bitmap in het systeemgeheugen in C++."
type: docs
weight: 1500
url: /nl/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Vergrendelt een [Bitmap](../) in het systeemgeheugen.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | const Rectangle\& | Een rechthoek die het gebied van de afbeelding specificeert dat moet worden vergrendeld |
| flags | Imaging::ImageLockMode | Specificeert het toegangsniveau tot de bitmap |
| formaat | Imaging::PixelFormat | Het gegevensformaat van deze bitmap |

### ReturnValue

Een gedeelde pointer naar een BitmapData-object dat informatie bevat over de uitgevoerde vergrendelingsbewerking

## Zie ook

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Vergrendelt een [Bitmap](../) in het systeemgeheugen.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | const Rectangle\& | Een rechthoek die het gebied van de afbeelding specificeert dat moet worden vergrendeld |
| flags | Imaging::ImageLockMode | Specificeert het toegangsniveau tot de bitmap |
| formaat | Imaging::PixelFormat | Het gegevensformaat van deze bitmap |
| bitmap_data | const Imaging::BitmapDataPtr\& | Bevat informatie over de vergrendelingsbewerking |

### ReturnValue

Een gedeelde pointer naar een BitmapData-object dat informatie bevat over de uitgevoerde vergrendelingsbewerking

## Zie ook

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
