---
title: "System::Security::Cryptography::AsnEncodedData क्लास"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::AsnEncodedData क्लास। ASN.1-एन्कोडेड डेटा। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1-एन्कोडेड डेटा। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class AsnEncodedData : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI जानकारी। |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | निर्माता। |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | निर्माता। |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | निर्माता। |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | विभिन्न ऑब्जेक्ट से डेटा कॉपी करता है। |
| virtual [Format](./format/)(bool) const | डेटा को मानव-पठनीय रूप में फॉर्मेट करता है। |
| [get_Oid](./get_oid/)() const | एन्कोडेड डेटा का ऑब्जेक्ट पहचानकर्ता प्राप्त करता है। |
| [get_RawData](./get_rawdata/)() const | कच्चा एन्कोडेड डेटा प्राप्त करता है। |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | एन्कोडेड डेटा का ऑब्जेक्ट पहचानकर्ता सेट करता है। |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | कच्चा एन्कोडेड डेटा सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
