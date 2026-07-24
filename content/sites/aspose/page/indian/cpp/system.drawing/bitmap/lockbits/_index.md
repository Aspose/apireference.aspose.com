---
title: "System::Drawing::Bitmap::LockBits विधि"
linktitle: "LockBits"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Bitmap::LockBits विधि. C++ में एक Bitmap को सिस्टम मेमोरी में लॉक करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


एक [Bitmap](../) को सिस्टम मेमोरी में लॉक करता है।

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | const Rectangle\& | एक आयत जो लॉक करने के लिए इमेज के क्षेत्र को निर्दिष्ट करती है |
| flags | Imaging::ImageLockMode | बिटमैप के एक्सेस स्तर को निर्दिष्ट करता है |
| फ़ॉर्मेट | Imaging::PixelFormat | इस बिटमैप का डेटा फ़ॉर्मेट |

### ReturnValue

एक साझा पॉइंटर जो BitmapData ऑब्जेक्ट की ओर इशारा करता है, जिसमें किए गए लॉक ऑपरेशन की जानकारी होती है

## संबंधित देखें

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


एक [Bitmap](../) को सिस्टम मेमोरी में लॉक करता है।

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | const Rectangle\& | एक आयत जो लॉक करने के लिए इमेज के क्षेत्र को निर्दिष्ट करती है |
| flags | Imaging::ImageLockMode | बिटमैप के एक्सेस स्तर को निर्दिष्ट करता है |
| फ़ॉर्मेट | Imaging::PixelFormat | इस बिटमैप का डेटा फ़ॉर्मेट |
| bitmap_data | const Imaging::BitmapDataPtr\& | लॉक ऑपरेशन के बारे में जानकारी रखता है |

### ReturnValue

एक साझा पॉइंटर जो BitmapData ऑब्जेक्ट की ओर इशारा करता है, जिसमें किए गए लॉक ऑपरेशन की जानकारी होती है

## संबंधित देखें

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
