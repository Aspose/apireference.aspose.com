---
title: "System::UriBuilder क्लास"
linktitle: "UriBuilder"
second_title: "Aspose.Page C++ के लिए"
description: "System::UriBuilder क्लास। यूनिवर्सल रिसोर्स आइडेंटिफ़ायर्स (URIs) को बनाना और संशोधित करने के लिए मेथड प्रदान करता है। इस क्लास के ऑब्जेक्ट को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन्स के आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 6800
url: /hi/cpp/system/uribuilder/
---
## UriBuilder class


यूनिवर्सल रिसोर्स आइडेंटिफ़ायर्स (URIs) को बनाना और संशोधित करने के लिए मेथड प्रदान करता है। इस क्लास के ऑब्जेक्ट को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स के आर्ग्यूमेंट के रूप में पास करें।

```cpp
class UriBuilder : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | वर्तमान ऑब्जेक्ट द्वारा निर्मित URI का स्कीम लौटाता है। |
| [get_Uri](./get_uri/)() const | वर्तमान ऑब्जेक्ट द्वारा निर्मित [Uri](../uri/) ऑब्जेक्ट लौटाता है। |
| [set_Port](./set_port/)(int) | URI का पोर्ट नंबर सेट करता है। |
| [set_Scheme](./set_scheme/)(const String\&) | वर्तमान ऑब्जेक्ट द्वारा निर्मित URI की scheme को निर्दिष्ट मान पर सेट करता है। |
| [ToString](./tostring/)() const override | वर्तमान ऑब्जेक्ट द्वारा निर्मित URI का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [UriBuilder](./uribuilder/)(const String\&) | निर्दिष्ट URI का प्रतिनिधित्व करने वाला एक [UriBuilder](./) ऑब्जेक्ट बनाता है। |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | निर्दिष्ट URI का प्रतिनिधित्व करने वाला एक [UriBuilder](./) ऑब्जेक्ट बनाता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
