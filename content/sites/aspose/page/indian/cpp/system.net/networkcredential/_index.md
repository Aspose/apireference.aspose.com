---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::NetworkCredential class. पासवर्ड-आधारित प्रमाणीकरण योजनाओं के लिए क्रेडेंशियल प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2900
url: /hi/cpp/system.net/networkcredential/
---
## NetworkCredential class


पासवर्ड-आधारित प्रमाणीकरण योजनाओं के लिए क्रेडेंशियल प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Domain](./get_domain/)() | क्रेडेंशियल की पुष्टि करने वाले डोमेन को प्राप्त करता है। |
| [get_Password](./get_password/)() | पासवर्ड प्राप्त करता है। |
| [get_UserName](./get_username/)() | RTTI जानकारी। |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | निर्दिष्ट URI और प्रमाणीकरण प्रकार के लिए क्रेडेंशियल लौटाता है। |
| [GetCredential](./getcredential/)(String, int32_t, String) override | निर्दिष्ट होस्ट नाम, पोर्ट, और प्रमाणीकरण प्रकार के लिए क्रेडेंशियल लौटाता है। |
| [NetworkCredential](./networkcredential/)() | एक नया उदाहरण बनाता है। |
| [NetworkCredential](./networkcredential/)(String, String) | एक नया उदाहरण बनाता है। |
| [NetworkCredential](./networkcredential/)(String, String, String) | एक नया उदाहरण बनाता है। |
| [set_Domain](./set_domain/)(String) | क्रेडेंशियल की पुष्टि करने वाले डोमेन को सेट करता है। |
| [set_Password](./set_password/)(String) | पासवर्ड सेट करता है। |
| [set_UserName](./set_username/)(String) | उपयोगकर्ता नाम सेट करता है। |
## संबंधित देखें

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
