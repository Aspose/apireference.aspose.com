---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension क्लास"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension क्लास। कुंजी के उपयोग के बारे में अतिरिक्त जानकारी रखने के लिए एक्सटेंशन ऑब्जेक्ट। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1600
url: /hi/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


कुंजी के उपयोग के बारे में अतिरिक्त जानकारी रखने के लिए एक्सटेंशन ऑब्जेक्ट। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | अन्य ऑब्जेक्ट से एक्सटेंशन डेटा की प्रतिलिपि बनाता है। |
| [get_KeyUsages](./get_keyusages/)() | कुंजी उपयोग प्राप्त करता है। |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI जानकारी। |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | निर्माता। |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | निर्माता। |
## संबंधित देखें

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
