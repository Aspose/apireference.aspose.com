---
title: "System::Security::Cryptography::X509Certificates::X509Extension क्लास"
linktitle: "X509Extension"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::X509Extension क्लास। एक्सटेंशन ऑब्जेक्ट जो X.509 प्रमाणपत्र से जुड़ी अतिरिक्त जानकारी रखता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1200
url: /hi/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


एक्सटेंशन ऑब्जेक्ट जो X.509 प्रमाणपत्र से जुड़ी अतिरिक्त जानकारी रखता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | अन्य ऑब्जेक्ट से एक्सटेंशन डेटा की प्रतिलिपि बनाता है। |
| [get_Critical](./get_critical/)() const | जाँचता है कि एक्सटेंशन महत्वपूर्ण है या नहीं। |
| [set_Critical](./set_critical/)(bool) | परिभाषित करता है कि एक्सटेंशन महत्वपूर्ण है या नहीं। |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI जानकारी। |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | निर्माता। |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | निर्माता। |
## संबंधित देखें

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
