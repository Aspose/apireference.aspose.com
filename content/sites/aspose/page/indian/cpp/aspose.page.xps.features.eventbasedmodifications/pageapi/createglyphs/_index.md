---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs मेथड"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs मेथड. C++ में नए ग्लिफ़ बनाता है।"
type: docs
weight: 900
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


नए Glyphs बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) संसाधन। |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) आकार। |
| originX | फ़्लोट | ग्लिफ़्स मूल X निर्देशांक। |
| originY | फ़्लोट | ग्लिफ़्स मूल Y निर्देशांक। |
| unicodeString | System::String | प्रिंट करने के लिए स्ट्रिंग। |

### ReturnValue

नए ग्लिफ़।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


नए Glyphs बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) परिवार। |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) आकार। |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) शैली। |
| originX | फ़्लोट | ग्लिफ़्स मूल X निर्देशांक। |
| originY | फ़्लोट | ग्लिफ़्स मूल Y निर्देशांक। |
| unicodeString | System::String | प्रिंट करने के लिए स्ट्रिंग। |

### ReturnValue

नए ग्लिफ़।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
