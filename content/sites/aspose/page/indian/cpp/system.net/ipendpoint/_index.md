---
title: "System::Net::IPEndPoint क्लास"
linktitle: "IPEndPoint"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::IPEndPoint क्लास। एक नेटवर्क एंडपॉइंट का प्रतिनिधित्व करता है जिसमें IP पता और पोर्ट होता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.net/ipendpoint/
---
## IPEndPoint class


एक नेटवर्क एंडपॉइंट का प्रतिनिधित्व करता है जिसमें IP पता और पोर्ट होता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | निर्दिष्ट सॉकेट पते का उपयोग करके [EndPoint](../endpoint/) क्लास का नया इंस्टेंस बनाएँ। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Address](./get_address/)() | एंडपॉइंट पता प्राप्त करता है। |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI जानकारी। |
| [get_Port](./get_port/)() | पोर्ट नंबर प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [GetImpl](./getimpl/)() const override | इम्प्लीमेंटेशन के लिए एक पॉइंटर लौटाता है। |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | एक नया उदाहरण बनाता है। |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | एक नया उदाहरण बनाता है। |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | एंडपॉइंट पता सेट करता है। |
| [set_Port](./set_port/)(int32_t) | पोर्ट नंबर सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Any](./any/) | किसी भी IPv4 पते और किसी भी पोर्ट के लिए एंडपॉइंट। |
| static [AnyPort](./anyport/) | एक मान जो दर्शाता है कि कोई भी पोर्ट उपयोग किया जा सकता है या नहीं। |
| static [IPv6Any](./ipv6any/) | किसी भी IPv6 पते और किसी भी पोर्ट के लिए एंडपॉइंट। |
| static [MaxPort](./maxport/) | अधिकतम पोर्ट नंबर। |
| static [MinPort](./minport/) | RTTI जानकारी। |
## संबंधित देखें

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
