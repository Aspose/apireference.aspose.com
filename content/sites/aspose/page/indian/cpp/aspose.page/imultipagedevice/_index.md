---
title: "Aspose::Page::IMultiPageDevice क्लास"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::IMultiPageDevice क्लास। यह इंटरफ़ेस C++ में मल्टी‑पेज़ डिवाइस को नियंत्रित करने के लिए मेथड्स रखता है।"
type: docs
weight: 800
url: /hi/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


यह इंटरफ़ेस मल्टी-पेज्ड डिवाइस को नियंत्रित करने के मेथड्स शामिल करता है।

```cpp
class IMultiPageDevice : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [ClosePage](./closepage/)() | पृष्ठ रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | वर्तमान पृष्ठ संख्या। |
| virtual [InitPageNumbers](./initpagenumbers/)() | आउटपुट के लिए पृष्ठों की संख्या को प्रारंभ करता है। |
| virtual [OpenPage](./openpage/)(System::String) | पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| virtual [OpenPage](./openpage/)(float, float) | प्रत्येक पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | अन्य मल्टी‑पेज्ड डिवाइस से पेज पैरामीटर अपडेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
