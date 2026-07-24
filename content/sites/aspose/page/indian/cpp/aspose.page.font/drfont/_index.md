---
title: "Aspose::Page::Font::DrFont क्लास"
linktitle: "DrFont"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::Font::DrFont क्लास. C++ में GDI+ Font के बजाय इस क्लास का उपयोग करें।"
type: docs
weight: 100
url: /hi/cpp/aspose.page.font/drfont/
---
## DrFont class


GDI+ [Font](../) के बजाय इस क्लास का उपयोग करें।

```cpp
class DrFont : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | निर्धारित करता है कि निर्दिष्ट [System::Object](../../system/object/) इस इंस्टेंस के बराबर है या नहीं। |
| [get_AscentLis](./get_ascentlis/)() | इस फ़ॉन्ट (lis) का सेल असेंट। यह सेल शीर्ष से सेल बेसलाइन तक की ऊर्ध्वाधर दूरी है। |
| [get_AscentPoints](./get_ascentpoints/)() | सेल असेंट को पॉइंट्स में लौटाता है। |
| [get_CellHeightLis](./get_cellheightlis/)() | इस फ़ॉन्ट की सेल ऊँचाई (lis) लौटाता है। यह [AscentLis](../) + [DescentLis](../) का शॉर्टकट है। |
| [get_CellHeightPoints](./get_cellheightpoints/)() | [AscentPoints](../) + [DescentPoints](../) का शॉर्टकट। |
| [get_DescentLis](./get_descentlis/)() | इस फ़ॉन्ट का सेल डिसेंट (lis)। यह सेल के नीचे से बेसलाइन तक की लंबवत दूरी है। |
| [get_DescentPoints](./get_descentpoints/)() | सेल डिसेंट को पॉइंट्स में लौटाता है। |
| [get_FamilyName](./get_familyname/)() | इस फ़ॉन्ट का नाम प्राप्त करता है। |
| [get_IsBold](./get_isbold/)() | यह दर्शाने वाला मान प्राप्त करता है कि यह इंस्टेंस बोल्ड है या नहीं। |
| [get_IsItalic](./get_isitalic/)() | यह दर्शाने वाला मान प्राप्त करता है कि यह इंस्टेंस इटैलिक है या नहीं। |
| [get_LeadingLis](./get_leadinglis/)() | इस फ़ॉन्ट का लीडिंग (lis) लौटाता है। यह [LineSpacingLis](../) - [CellHeightLis](../) का शॉर्टकट है। |
| [get_LeadingPoints](./get_leadingpoints/)() | इस फ़ॉन्ट का लीडिंग (lis) लौटाता है। यह [LineSpacingLis](../) - [CellHeightLis](../) का शॉर्टकट है। |
| [get_LineSpacingLis](./get_linespacinglis/)() | इस फ़ॉन्ट का सेल स्पेसिंग (lis) लौटाता है। यह दो ग्लिफ़ों की बेसलाइन के बीच की लंबवत दूरी है। |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | इस फ़ॉन्ट का सेल स्पेसिंग (पॉइंट्स) लौटाता है। यह दो ग्लिफ़ों की बेसलाइन के बीच की लंबवत दूरी है। |
| [get_SizePoints](./get_sizepoints/)() | इस फ़ॉन्ट का आकार (पॉइंट्स) प्राप्त करता है। |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | फ़ॉन्ट के कैपिटल्स प्राप्त करता है। |
| [get_Style](./get_style/)() | ट्रू टाइप फ़ॉन्ट प्राप्त करता है। |
| [get_StyleEx](./get_styleex/)() | यह प्रॉपर्टी फ़ॉन्ट की शैली के बारे में अतिरिक्त जानकारी रखती है। |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | कैरेक्टर की चौड़ाई (lis) प्राप्त करता है। |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | कैरेक्टर की चौड़ाई (पॉइंट्स) लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | इस इंस्टेंस के लिए एक हैश कोड लौटाता है। |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | पॉइंट्स में टेक्स्ट का माप बॉक्स लौटाता है। |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | टेक्स्ट की चौड़ाई (lis) प्राप्त करता है। |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | टेक्स्ट की चौड़ाई (पॉइंट्स) प्राप्त करता है। |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | टेक्स्ट की चौड़ाई (पॉइंट्स) प्राप्त करता है। |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | "Microsoft Sans Serif" फ़ॉन्ट के लिए True लौटाता है। यह GDI+ द्वारा खराब रेंडर किया जाता है। Test286 और Gemini-6959 देखें। |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | फ़ॉन्ट सामग्री को बदलें। |
| [set_SizePoints](./set_sizepoints/)(float) | इस फ़ॉन्ट का आकार (पॉइंट्स) प्राप्त करता है। |
| [set_StyleEx](./set_styleex/)(int16_t) | यह प्रॉपर्टी फ़ॉन्ट की शैली के बारे में अतिरिक्त जानकारी रखती है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
