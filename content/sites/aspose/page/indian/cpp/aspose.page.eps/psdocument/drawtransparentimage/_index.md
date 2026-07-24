---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage विधि"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage विधि। परिवर्तित पारदर्शी छवि को ड्रॉ करता है। यदि छवि में Alpha चैनल नहीं है तो इसे C++ में अपारदर्शी छवि के रूप में ड्रॉ किया जाएगा।"
type: docs
weight: 2000
url: /hi/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


परिवर्तित पारदर्शी छवि को बनाता है। यदि छवि में अल्फा चैनल नहीं है तो इसे अपारदर्शी छवि के रूप में बनाया जाएगा।

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| छवि | System::SharedPtr\<System::Drawing::Bitmap\> | ड्रॉ करने के लिए छवि। |
| ट्रांसफ़ॉर्म | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | छवि को ट्रांसफ़ॉर्म करने के लिए मैट्रिक्स। |
| transparencyThreshold | int32_t | एक थ्रेशोल्ड जो निर्धारित करता है कि किस पारदर्शिता मान से पिक्सेल को पूरी तरह पारदर्शी माना जाएगा। इस थ्रेशोल्ड से नीचे के सभी मानों को पूरी तरह अपारदर्शी माना जाएगा। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
