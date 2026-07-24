---
title: "System::Drawing::Graphics::MeasureString मेथड"
linktitle: "MeasureString"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics::MeasureString मेथड। निर्दिष्ट फ़ॉन्ट और निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट स्ट्रिंग को ड्रॉ करने पर उसका आकार लौटाता है C++ में।"
type: docs
weight: 6500
url: /hi/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है।

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String const\& | जिस स्ट्रिंग का आकार गणना करना है |
| फ़ॉन्ट | System::SharedPtr\<Font\> const\& | स्ट्रिंग को ड्रॉ करने के लिए उपयोग किया गया फ़ॉन्ट |
| width | int | स्ट्रिंग की अधिकतम चौड़ाई |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | स्ट्रिंग फ़ॉर्मेट निर्दिष्ट करता है |

### ReturnValue

एक [SizeF](../../sizef/) ऑब्जेक्ट जो वर्तमान Grapphics ऑब्जेक्ट की PageUnit प्रॉपर्टी द्वारा निर्दिष्ट मापन इकाइयों में स्ट्रिंग का आकार दर्शाता है।

## संबंधित देखें

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है।

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String const\& | जिस स्ट्रिंग का आकार गणना करना है |
| फ़ॉन्ट | System::SharedPtr\<Font\> const\& | स्ट्रिंग को ड्रॉ करने के लिए उपयोग किया गया फ़ॉन्ट |
| origin | PointF const\& | स्ट्रिंग के ऊपरी बाएँ कोने का स्थान निर्दिष्ट करता है |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | स्ट्रिंग फ़ॉर्मेट निर्दिष्ट करता है |

### ReturnValue

एक [SizeF](../../sizef/) ऑब्जेक्ट जो वर्तमान Grapphics ऑब्जेक्ट की PageUnit प्रॉपर्टी द्वारा निर्दिष्ट मापन इकाइयों में स्ट्रिंग का आकार दर्शाता है।

## संबंधित देखें

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


लागू नहीं किया गया।

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## संबंधित देखें

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है।

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String const\& | जिस स्ट्रिंग का आकार गणना करना है |
| फ़ॉन्ट | System::SharedPtr\<Font\> const\& | स्ट्रिंग को ड्रॉ करने के लिए उपयोग किया गया फ़ॉन्ट |
| layoutArea | SizeF const\& | स्ट्रिंग का अधिकतम लेआउट क्षेत्र |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | स्ट्रिंग फ़ॉर्मेट निर्दिष्ट करता है |

### ReturnValue

एक [SizeF](../../sizef/) ऑब्जेक्ट जो वर्तमान Grapphics ऑब्जेक्ट की PageUnit प्रॉपर्टी द्वारा निर्दिष्ट मापन इकाइयों में स्ट्रिंग का आकार दर्शाता है।

## संबंधित देखें

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
