---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::CaptureCollection क्लास। एकल कैप्चरिंग समूह द्वारा किए गए कैप्चर की सूची। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


एकल कैप्चरिंग समूह द्वारा किए गए कैप्चर की सूची। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | संग्रह संशोधन को अक्षम करता है। |
| [AddCapture](./addcapture/)(const CapturePtr\&) | संग्रह में कैप्चर जोड़ने के लिए सेवा विधि। |
| [Clear](./clear/)() override | संग्रह की सफाई को अक्षम करता है। |
| [get_Count](./get_count/)() const override | कैप्चर की संख्या प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const override | संग्रह को केवल‑पढ़ने योग्य चिह्नित करता है। |
| [get_IsSynchronized](./get_issynchronized/)() const | संग्रह को असिंक्रोनाइज़्ड के रूप में चिह्नित करता है। |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) एक्सेसर। |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) एक्सेसर। |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) एक्सेसर। |
| [Remove](./remove/)(const CapturePtr\&) override | संग्रह संशोधन को अक्षम करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Base](./base/) | [Base](./base/) प्रकार। |
## संबंधित देखें

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
