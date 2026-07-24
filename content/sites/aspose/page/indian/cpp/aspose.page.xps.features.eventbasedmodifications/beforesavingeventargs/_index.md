---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. C++ में विभिन्न before‑saving इवेंट्स के तर्कों के लिए बेस क्लास को परिभाषित करता है।"
type: docs
weight: 200
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


विभिन्न सेविंग-से-पहले इवेंट्स के तर्कों के लिए बेस क्लास को परिभाषित करता है।

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | मॉडिफिकेशन API प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | [XPS](../../aspose.page.xps/) पैकेज के सभी दस्तावेज़ों में वर्तमान पूर्ण पृष्ठ संख्या। |
| [get_DocumentNumber](./get_documentnumber/)() const | [XPS](../../aspose.page.xps/) पैकेज के भीतर वर्तमान दस्तावेज़ संख्या। |
| [get_ElementAPI](./get_elementapi/)() const | सेव होने वाले तत्व की मॉडिफिकेशन API प्राप्त करता है। |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | वर्तमान आउटपुट संख्या। यदि **PageNumbers** सेव विकल्प निर्दिष्ट किया गया है तो यह **AbsolutePageNumber** से अलग होती है। |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | [XPS](../../aspose.page.xps/) पैकेज के भीतर वर्तमान दस्तावेज़ के सापेक्ष वर्तमान पृष्ठ संख्या। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
