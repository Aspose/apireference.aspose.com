---
title: "System::Drawing::Bitmap::LockBits μέθοδος"
linktitle: "LockBits"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Bitmap::LockBits μέθοδος. Κλειδώνει ένα Bitmap στη μνήμη του συστήματος σε C++."
type: docs
weight: 1500
url: /el/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Κλειδώνει ένα [Bitmap](../) στη μνήμη του συστήματος.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rect | const Rectangle\& | Ένα ορθογώνιο που καθορίζει την περιοχή της εικόνας προς κλείδωμα |
| flags | Imaging::ImageLockMode | Καθορίζει το επίπεδο πρόσβασης στο bitmap |
| μορφή | Imaging::PixelFormat | Η μορφή δεδομένων αυτού του bitmap |

### ReturnValue

Ένας κοινόχρηστος δείκτης σε αντικείμενο BitmapData που περιέχει πληροφορίες σχετικά με την εκτελεσμένη λειτουργία κλειδώματος

## Δείτε επίσης

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Κλειδώνει ένα [Bitmap](../) στη μνήμη του συστήματος.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rect | const Rectangle\& | Ένα ορθογώνιο που καθορίζει την περιοχή της εικόνας προς κλείδωμα |
| flags | Imaging::ImageLockMode | Καθορίζει το επίπεδο πρόσβασης στο bitmap |
| μορφή | Imaging::PixelFormat | Η μορφή δεδομένων αυτού του bitmap |
| bitmap_data | const Imaging::BitmapDataPtr\& | Περιέχει πληροφορίες σχετικά με τη λειτουργία κλειδώματος |

### ReturnValue

Ένας κοινόχρηστος δείκτης σε αντικείμενο BitmapData που περιέχει πληροφορίες σχετικά με την εκτελεσμένη λειτουργία κλειδώματος

## Δείτε επίσης

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
