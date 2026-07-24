---
title: "System::Net::SocketAddress क्लास"
linktitle: "SocketAddress"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::SocketAddress क्लास। EndPoint क्लास के उदाहरणों के बारे में क्रमबद्ध जानकारी संग्रहीत करने के लिए उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 3300
url: /hi/cpp/system.net/socketaddress/
---
## SocketAddress class


इसका उपयोग [EndPoint](../endpoint/) क्लास के उदाहरणों के बारे में क्रमबद्ध जानकारी संग्रहीत करने के लिए किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class SocketAddress : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Family](./get_family/)() | RTTI जानकारी। |
| [get_Size](./get_size/)() | अंतर्निहित बफ़र का आकार लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [idx_get](./idx_get/)(int32_t) | निर्दिष्ट इंडेक्स पर अंतर्निहित बफ़र का मान प्राप्त करता है। |
| [idx_set](./idx_set/)(int32_t, uint8_t) | निर्दिष्ट इंडेक्स पर अंतर्निहित बफ़र का मान सेट करता है। |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | एक नया उदाहरण बनाता है। |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
