---
title: "System::Security::Cryptography::X509Certificates::PublicKey क्लास"
linktitle: "PublicKey"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::PublicKey क्लास। X509‑प्रमाणपत्र की सार्वजनिक कुंजी जानकारी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


X509‑प्रमाणपत्र की सार्वजनिक कुंजी जानकारी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class PublicKey : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | ASN.1‑एन्कोडेड सार्वजनिक कुंजी मान प्राप्त करता है। |
| [get_EncodedParameters](./get_encodedparameters/)() const | ASN.1‑एन्कोडेड सार्वजनिक कुंजी पैरामीटर प्राप्त करता है। |
| [get_Key](./get_key/)() const | एक [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) या [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/) प्राप्त करता है। |
| [get_Oid](./get_oid/)() const | सार्वजनिक कुंजी का पहचानकर्ता (OID) प्राप्त करता है। |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | निर्माता। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
