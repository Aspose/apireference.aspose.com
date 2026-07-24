---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class. C++ में JobInputBin, DocumentInputBin और PageInputBin सुविधाओं के विकल्पों का वर्णन करता है।"
type: docs
weight: 700
url: /hi/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


वर्णन करता है [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) और [PageInputBin](../../pageinputbin/) सुविधाओं के विकल्प।

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | विकल्प में [IInputBinOptionItem](../iinputbinoptionitem/) के उदाहरणों की एक सरणी जोड़ता है। |
| [Clone](./clone/)() | इस विकल्प इंस्टेंस को क्लोन करता है। |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [AutoSelect](./autoselect/) | डिवाइस कॉन्फ़िगरेशन के आधार पर स्वचालित रूप से सर्वोत्तम विकल्प चुन लेगा। |
| static [AutoSheetFeeder](./autosheetfeeder/) | इंकजेट प्रिंटरों के लिए डिवाइस इनपुट ट्रे। |
| static [Cassette](./cassette/) | निर्दिष्ट करता है कि फीड बिन एक कैसिट है। |
| static [Manual](./manual/) | डिफ़ॉल्ट मैनुअल फीड बिन को निर्दिष्ट करता है। |
| static [Tractor](./tractor/) | निर्दिष्ट करता है कि फीड बिन एक ट्रैक्टर है। |
## संबंधित देखें

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
