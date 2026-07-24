---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName क्लास"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName क्लास। X509 प्रमाणपत्र का विशिष्ट नाम दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


X509 प्रमाणपत्र का विशिष्ट नाम दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | फ़्लैग्स द्वारा निर्दिष्ट पैरामीटरों का उपयोग करके नाम डिकोड करता है। |
| [Format](./format/)(bool) const override | प्रिंटिंग के लिए नाम को फॉर्मेट करता है। |
| [get_Name](./get_name/)() const | प्रमाणपत्र का विशिष्ट नाम प्राप्त करता है। |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI जानकारी। |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | निर्माता। |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | निर्माता। |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | कॉपी कंस्ट्रक्टर। |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | निर्माता। |
## संबंधित देखें

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
