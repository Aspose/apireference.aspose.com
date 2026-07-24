---
title: "System::Net::DnsEndPoint class"
linktitle: "DnsEndPoint"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::DnsEndPoint क्लास। एप्लिकेशन द्वारा सेवा से कनेक्ट होने के लिए उपयोग की जाने वाली जानकारी शामिल है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 800
url: /hi/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


एप्लिकेशन द्वारा सेवा से कनेक्ट होने के लिए उपयोग की जाने वाली जानकारी शामिल है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | एक नया उदाहरण बनाता है। |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI जानकारी। |
| [get_Host](./get_host/)() | RTTI जानकारी। |
| [get_Port](./get_port/)() | पोर्ट नंबर लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
