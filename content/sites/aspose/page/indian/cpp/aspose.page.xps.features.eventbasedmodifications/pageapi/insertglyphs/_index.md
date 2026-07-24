---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs विधि"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs विधि. पृष्ठ में नए ग्लिफ़ को इंडेक्स स्थिति पर C++ में सम्मिलित करता है।"
type: docs
weight: 3000
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## PageAPI::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


पेज में *index* स्थिति पर नए ग्लिफ़्स डालता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int32_t | स्थिति जहाँ नए ग्लिफ़ सम्मिलित किए जाने चाहिए। |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) संसाधन। |
| fontSize | float | [Font](../../../aspose.page.font/) आकार। |
| originX | फ़्लोट | ग्लिफ़्स मूल X निर्देशांक। |
| originY | फ़्लोट | ग्लिफ़्स मूल Y निर्देशांक। |
| unicodeString | System::String | प्रिंट करने के लिए स्ट्रिंग। |

### ReturnValue

सम्मिलित ग्लिफ़।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


पेज में *index* स्थिति पर नए ग्लिफ़्स डालता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int32_t | स्थिति जहाँ नए ग्लिफ़ सम्मिलित किए जाने चाहिए। |
| fontFamily | System::String | [Font](../../../aspose.page.font/) परिवार। |
| fontSize | float | [Font](../../../aspose.page.font/) आकार। |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) शैली। |
| originX | फ़्लोट | ग्लिफ़्स मूल X निर्देशांक। |
| originY | फ़्लोट | ग्लिफ़्स मूल Y निर्देशांक। |
| unicodeString | System::String | प्रिंट करने के लिए स्ट्रिंग। |

### ReturnValue

सम्मिलित ग्लिफ़।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
