---
title: "System::Net::EndPoint क्लास"
linktitle: "EndPoint"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::EndPoint क्लास। यह सारभूत क्लास एक नेटवर्क पता रखती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें।"
type: docs
weight: 900
url: /hi/cpp/system.net/endpoint/
---
## EndPoint class


यह सारभूत क्लास एक नेटवर्क पता रखती है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के तर्क के रूप में पास करें।

```cpp
class EndPoint : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | निर्दिष्ट सॉकेट पते का उपयोग करके [EndPoint](./) क्लास की नई इंस्टेंस बनाएँ। |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI जानकारी। |
| virtual [GetImpl](./getimpl/)() const | इम्प्लीमेंटेशन के लिए एक पॉइंटर लौटाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ImplPtr](./implptr/) | कार्यान्वयन के लिए एक पॉइंटर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
