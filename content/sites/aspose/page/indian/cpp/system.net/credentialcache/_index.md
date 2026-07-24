---
title: "System::Net::CredentialCache क्लास"
linktitle: "CredentialCache"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CredentialCache क्लास। क्रेडेंशियल्स स्टोरेज प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.net/credentialcache/
---
## CredentialCache class


क्रेडेंशियल्स स्टोरेज प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | निर्दिष्ट नेटवर्क क्रेडेंशियल्स को कैश में जोड़ता है। |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | निर्दिष्ट नेटवर्क क्रेडेंशियल्स को कैश में जोड़ता है। |
| [CredentialCache](./credentialcache/)() | एक नया उदाहरण बनाता है। |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI जानकारी। |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | वर्तमान उपयोगकर्ता या एप्लिकेशन के नेटवर्क क्रेडेंशियल्स लौटाता है। |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | निर्दिष्ट URI प्रीफ़िक्स और ऑथेंटिकेशन प्रकार के लिए क्रेडेंशियल्स लौटाता है। |
| [GetCredential](./getcredential/)(String, int32_t, String) override | निर्दिष्ट होस्ट नाम, पोर्ट, और प्रमाणीकरण प्रकार के लिए क्रेडेंशियल लौटाता है। |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | निर्दिष्ट URI प्रीफ़िक्स और ऑथेंटिकेशन प्रकार के लिए नेटवर्क क्रेडेंशियल्स हटाता है। |
| [Remove](./remove/)(String, int32_t, String) | निर्दिष्ट होस्ट नाम, पोर्ट, और ऑथेंटिकेशन प्रकार के लिए नेटवर्क क्रेडेंशियल्स हटाता है। |
## संबंधित देखें

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
