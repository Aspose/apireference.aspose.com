---
title: "System::Drawing::Graphics::DrawString मेथड"
linktitle: "DrawString"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics::DrawString मेथड। निर्दिष्ट स्ट्रिंग को निर्दिष्ट स्थान पर निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके C++ में ड्रॉ करता है।"
type: docs
weight: 2800
url: /hi/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट स्थान पर निर्दिष्ट स्ट्रिंग को ड्रॉ करता है।

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | ड्रॉ करने के लिए स्ट्रिंग |
| फ़ॉन्ट | const SharedPtr\<Font\>\& | उपयोग करने के लिए फ़ॉन्ट |
| brush | const SharedPtr\<Brush\>\& | ड्रॉइंग के लिए उपयोग करने वाला एक [Brush](../../brush/) ऑब्जेक्ट |
| x | फ़्लोट | ड्रॉ की गई स्ट्रिंग के ऊपरी बाएँ कोने के स्थान का X निर्देशांक |
| y | फ़्लोट | ड्रॉ की गई स्ट्रिंग के ऊपरी बाएँ कोने के स्थान का Y निर्देशांक |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | स्ट्रिंग के फ़ॉर्मेट को निर्दिष्ट किया गया |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट स्थान पर निर्दिष्ट स्ट्रिंग को ड्रॉ करता है।

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | ड्रॉ करने के लिए स्ट्रिंग |
| फ़ॉन्ट | const SharedPtr\<Font\>\& | उपयोग करने के लिए फ़ॉन्ट |
| brush | const SharedPtr\<Brush\>\& | ड्रॉइंग के लिए उपयोग करने वाला एक [Brush](../../brush/) ऑब्जेक्ट |
| topLeft | PointF | ड्रॉ की गई स्ट्रिंग के ऊपरी बाएँ कोने का स्थान निर्दिष्ट करता है |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | स्ट्रिंग के फ़ॉर्मेट को निर्दिष्ट किया गया |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट आयत में निर्दिष्ट स्ट्रिंग को ड्रॉ करता है।

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | ड्रॉ करने के लिए स्ट्रिंग |
| फ़ॉन्ट | const SharedPtr\<Font\>\& | उपयोग करने के लिए फ़ॉन्ट |
| brush | const SharedPtr\<Brush\>\& | ड्रॉइंग के लिए उपयोग करने वाला एक [Brush](../../brush/) ऑब्जेक्ट |
| layoutRectangle | RectangleF | स्ट्रिंग को ड्रॉ करने के लिए एक आयत निर्दिष्ट करता है |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | स्ट्रिंग के फ़ॉर्मेट को निर्दिष्ट किया गया |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
