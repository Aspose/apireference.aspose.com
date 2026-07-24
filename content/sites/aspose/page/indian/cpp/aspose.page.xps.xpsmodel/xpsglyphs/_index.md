---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs क्लास"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs क्लास। क्लास Glyphs तत्व की विशेषताओं को समाहित करती है। यह तत्व एक ही फ़ॉन्ट से समान रूप से स्वरूपित टेक्स्ट की रन का प्रतिनिधित्व करता है। यह सटीक रेंडरिंग के लिए आवश्यक जानकारी प्रदान करता है और C++ में व्यूइंग कंज्यूमर्स में खोज और चयन सुविधाओं का समर्थन करता है।"
type: docs
weight: 1500
url: /hi/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Glyphs तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व एक ही फ़ॉन्ट से समान रूप से स्वरूपित पाठ की एक श्रृंखला का प्रतिनिधित्व करता है। यह सटीक रेंडरिंग के लिए आवश्यक जानकारी प्रदान करता है और दृश्य उपभोक्ताओं में खोज और चयन सुविधाओं का समर्थन करता है।

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस glyphs को क्लोन करें। |
| [get_BidiLevel](./get_bidilevel/)() const | Unicode एल्गोरिद्म द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान लौटाता/सेट करता है। सम मान बाएँ‑से‑दाएँ लेआउट दर्शाते हैं, विषम मान दाएँ‑से‑बाएँ लेआउट दर्शाते हैं। दाएँ‑से‑बाएँ लेआउट में रन की उत्पत्ति पहले glyph के दाएँ पक्ष पर स्थित होती है, सकारात्मक अग्रिम चौड़ाइयाँ (जो बाएँ की ओर अग्रसर होती हैं) बाद के glyphs को पिछले glyph के बाएँ ओर रखती हैं। |
| [get_Fill](./get_fill/)() | रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [get_Font](./get_font/)() | तत्वों के टेक्स्ट को टाइपसेट करने के लिए उपयोग किए गए **TrueType** फ़ॉन्ट के फ़ॉन्ट संसाधन को लौटाता है। |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | ड्रॉइंग सतह इकाइयों में फ़ॉन्ट आकार को लौटाता/सेट करता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में एक फ्लोट के रूप में व्यक्त किया जाता है। |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | वापसी/सेट करता है वह मान जो दर्शाता है कि एक glyph अपनी साइड पर घुमा हुआ है, जहाँ मूल को अनटर्न्ड glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है। |
| [get_OriginX](./get_originx/)() const | वापसी/सेट करता है पहले glyph के x निर्देशांक को, रन में, प्रभावी निर्देशांक स्थान की इकाइयों में। |
| [get_OriginY](./get_originy/)() const | वापसी/सेट करता है पहले glyph के y निर्देशांक को, रन में, प्रभावी निर्देशांक स्थान की इकाइयों में। |
| [get_StyleSimulations](./get_stylesimulations/)() const | वापसी/सेट करता है वह मान जो एक शैली सिमुलेशन को निर्दिष्ट करता है। |
| [get_UnicodeString](./get_unicodestring/)() const | वापसी/सेट करता है Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग को। पाठ को Unicode कोड पॉइंट्स के रूप में निर्दिष्ट किया गया है। |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Unicode एल्गोरिद्म द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान लौटाता/सेट करता है। सम मान बाएँ‑से‑दाएँ लेआउट दर्शाते हैं, विषम मान दाएँ‑से‑बाएँ लेआउट दर्शाते हैं। दाएँ‑से‑बाएँ लेआउट में रन की उत्पत्ति पहले glyph के दाएँ पक्ष पर स्थित होती है, सकारात्मक अग्रिम चौड़ाइयाँ (जो बाएँ की ओर अग्रसर होती हैं) बाद के glyphs को पिछले glyph के बाएँ ओर रखती हैं। |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | ड्रॉइंग सतह इकाइयों में फ़ॉन्ट आकार को लौटाता/सेट करता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में एक फ्लोट के रूप में व्यक्त किया जाता है। |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | वापसी/सेट करता है वह मान जो दर्शाता है कि एक glyph अपनी साइड पर घुमा हुआ है, जहाँ मूल को अनटर्न्ड glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है। |
| [set_OriginX](./set_originx/)(float) | वापसी/सेट करता है पहले glyph के x निर्देशांक को, रन में, प्रभावी निर्देशांक स्थान की इकाइयों में। |
| [set_OriginY](./set_originy/)(float) | वापसी/सेट करता है पहले glyph के y निर्देशांक को, रन में, प्रभावी निर्देशांक स्थान की इकाइयों में। |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | वापसी/सेट करता है वह मान जो एक शैली सिमुलेशन को निर्दिष्ट करता है। |
| [set_UnicodeString](./set_unicodestring/)(System::String) | वापसी/सेट करता है Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग को। पाठ को Unicode कोड पॉइंट्स के रूप में निर्दिष्ट किया गया है। |
## संबंधित देखें

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
