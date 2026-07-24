---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::X509Certificate class. X.509 v.3 प्रमाणपत्र। एन्क्रिप्टेड प्रमाणपत्र समर्थित नहीं हैं। केवल X509KeyStorageFlags::DefaultKeySet फ़्लैग समर्थित है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3 प्रमाणपत्र। एन्क्रिप्टेड प्रमाणपत्र समर्थित नहीं हैं। केवल [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) फ़्लैग समर्थित है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | निर्दिष्ट PKCS7 फ़ाइल से प्रमाणपत्र बनाता है। |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | निर्दिष्ट साइन की गई फ़ाइल से प्रमाणपत्र बनाता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | दो प्रमाणपत्रों की तुलना करता है। |
| virtual [Export](./export/)(X509ContentType) const | वर्तमान वस्तु को निर्दिष्ट स्वरूप का उपयोग करके बाइट एरे में निर्यात करता है। लागू नहीं किया गया। |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | वर्तमान वस्तु को निर्दिष्ट स्वरूप का उपयोग करके बाइट एरे में निर्यात करता है। लागू नहीं किया गया। |
| virtual [Export](./export/)(X509ContentType, const String\&) const | वर्तमान वस्तु को निर्दिष्ट स्वरूप का उपयोग करके बाइट एरे में निर्यात करता है। लागू नहीं किया गया। |
| [get_Handle](./get_handle/)() const | Microsoft Cryptographic API प्रमाणपत्र संदर्भ का हैंडल प्राप्त करता है। |
| [get_Issuer](./get_issuer/)() const | X-509v3 प्रमाणपत्र जारी करने वाले प्रमाणपत्र प्राधिकरण का नाम प्राप्त करता है। |
| [get_Subject](./get_subject/)() const | प्रमाणपत्र से विषय का विशिष्ट नाम प्राप्त करता है। |
| virtual [GetCertHash](./getcerthash/)() const | वर्तमान वस्तु का हैश बाइट एरे के रूप में प्राप्त करता है। |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | वर्तमान वस्तु का हैश बाइट एरे के रूप में प्राप्त करता है। |
| virtual [GetCertHashString](./getcerthashstring/)() const | वर्तमान वस्तु का [SHA1](../../system.security.cryptography/sha1/) हैश हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | वर्तमान वस्तु का [SHA1](../../system.security.cryptography/sha1/) हैश हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | वर्तमान प्रमाणपत्र की प्रभावी तिथि प्राप्त करता है। |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | वर्तमान प्रमाणपत्र की समाप्ति तिथि प्राप्त करता है। |
| virtual [GetFormat](./getformat/)() const | प्रमाणपत्र स्वरूप का नाम प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | प्रमाणपत्र हैश कोड प्राप्त करता है। |
| virtual [GetIssuerName](./getissuername/)() const | वर्तमान प्रमाणपत्र जारी करने वाले प्रमाणन प्राधिकरण का नाम प्राप्त करता है। |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | वर्तमान प्रमाणपत्र की कुंजी जानकारी स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | वर्तमान प्रमाणपत्र की कुंजी जानकारी बाइट एरे के रूप में प्राप्त करता है। |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | वर्तमान प्रमाणपत्र की कुंजी जानकारी हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetName](./getname/)() const | वर्तमान प्रमाणपत्र जिस प्रमुख को जारी किया गया था, उसका नाम प्राप्त करता है। |
| virtual [GetPublicKey](./getpublickey/)() const | प्रमाणपत्र से सार्वजनिक कुंजी को बाइट्स की सरणी के रूप में प्राप्त करता है। |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | प्रमाणपत्र से सार्वजनिक कुंजी को हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetRawCertData](./getrawcertdata/)() const | प्रमाणपत्र से कच्चा डेटा को बाइट्स की सरणी के रूप में प्राप्त करता है। |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | प्रमाणपत्र से कच्चा डेटा को हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [GetSerialNumber](./getserialnumber/)() const | प्रमाणपत्र से क्रमांक (सीरियल नंबर) को बाइट्स की सरणी के रूप में प्राप्त करता है। |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | प्रमाणपत्र से क्रमांक को हेक्साडेसिमल स्ट्रिंग के रूप में प्राप्त करता है। |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। लागू नहीं किया गया। |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। लागू नहीं किया गया। |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। लागू नहीं किया गया। |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। लागू नहीं किया गया। |
| virtual [Import](./import/)(const String\&) | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। लागू नहीं किया गया। |
| virtual [Import](./import/)(const ByteArrayPtr\&) | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। लागू नहीं किया गया। |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | प्रमाणपत्र की स्थिति को रीसेट करता है। |
| virtual [ToString](./tostring/)(bool) const | प्रमाणपत्र की जानकारी को टेक्स्ट प्रारूप में लौटाता है। |
| [ToString](./tostring/)() const override | प्रमाणपत्र की जानकारी को टेक्स्ट प्रारूप में लौटाता है। |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const String\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | निर्माता। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | पॉइंटर प्रकार। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
