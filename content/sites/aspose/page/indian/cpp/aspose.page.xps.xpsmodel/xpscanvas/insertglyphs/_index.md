---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs method"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs method. नए ग्लिफ़ को इस कैनवास'' की चाइल्ड सूची में निर्दिष्ट इंडेक्स पर C++ में सम्मिलित करता है।"
type: docs
weight: 900
url: /hi/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


इस कैनवास की चाइल्ड सूची में *index*  स्थिति पर नए glyphs सम्मिलित करता है।

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int32_t | स्थिति जहाँ नए ग्लिफ़ सम्मिलित किए जाने चाहिए। |
| fontFamily | System::String | [Font](../../../aspose.page.font/) परिवार। |
| fontSize | float | [Font](../../../aspose.page.font/) आकार। |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) शैली। |
| originX | फ़्लोट | ग्लिफ़्स मूल X निर्देशांक। |
| originY | फ़्लोट | ग्लिफ़ का मूल T निर्देशांक। |
| unicodeString | System::String | प्रिंट करने के लिए स्ट्रिंग। |

### ReturnValue

जोड़े गए ग्लिफ़्स।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
