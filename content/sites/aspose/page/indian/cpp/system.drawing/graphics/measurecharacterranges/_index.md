---
title: "System::Drawing::Graphics::MeasureCharacterRanges मेथड"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics::MeasureCharacterRanges मेथड। C++ में निर्दिष्ट स्ट्रिंग में अक्षर स्थितियों को सीमित करने वाले प्रत्येक क्षेत्र की एक एरे लौटाता है।"
type: docs
weight: 6400
url: /hi/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


निर्दिष्ट स्ट्रिंग में अक्षर स्थितियों को सीमित करने वाले प्रत्येक क्षेत्र की एक सरणी लौटाता है।

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | const System::String\& | मापने के लिए स्ट्रिंग |
| फ़ॉन्ट | const SharedPtr\<Font\>\& | स्ट्रिंग के मापन के दौरान उपयोग किया गया फ़ॉन्ट |
| layoutRect | RectangleF | स्ट्रिंग के मापन के दौरान उपयोग किया गया लेआउट आयत |
| stringFormat | const SharedPtr\<StringFormat\>\& | स्ट्रिंग फ़ॉर्मेट, जिसमें मापने के लिए अक्षर रेंज शामिल हैं |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
