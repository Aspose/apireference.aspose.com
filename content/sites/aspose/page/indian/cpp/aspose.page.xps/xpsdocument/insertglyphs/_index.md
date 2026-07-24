---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs method"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs method. C++ में सक्रिय पृष्ठ पर इंडेक्स स्थिति पर नए ग्लिफ़्स सम्मिलित करता है।"
type: docs
weight: 4400
url: /hi/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


*index* स्थिति पर सक्रिय पृष्ठ में नए ग्लिफ़्स सम्मिलित करता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


*index* स्थिति पर सक्रिय पृष्ठ में नए ग्लिफ़्स सम्मिलित करता है।

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
