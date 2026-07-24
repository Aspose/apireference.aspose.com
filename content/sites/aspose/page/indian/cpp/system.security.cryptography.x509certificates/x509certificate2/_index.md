---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 class"
linktitle: "X509Certificate2"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 class. X509 प्रमाणपत्र का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


X509 प्रमाणपत्र का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Archived](./get_archived/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रमाणपत्र संग्रहित है। |
| [get_Extensions](./get_extensions/)() const | प्रमाणपत्र से जुड़े एक्सटेंशन ऑब्जेक्ट्स का संग्रह प्राप्त करता है। |
| [get_FriendlyName](./get_friendlyname/)() const | प्रमाणपत्र का फ्रेंडली नाम प्राप्त करता है। |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | जाँचता है कि क्या प्रमाणपत्र के पास प्राइवेट की है। |
| [get_IssuerName](./get_issuername/)() const | प्रमाणपत्र जारी करने वाली पार्टी का नाम प्राप्त करता है। |
| [get_NotAfter](./get_notafter/)() const | स्थानीय तिथि और समय प्राप्त करता है जिसके बाद प्रमाणपत्र वैध नहीं रहता। |
| [get_NotBefore](./get_notbefore/)() const | स्थानीय तिथि और समय प्राप्त करता है जिस पर प्रमाणपत्र वैध हो जाता है। |
| [get_PrivateKey](./get_privatekey/)() const | प्रमाणपत्र से जुड़ी प्राइवेट की प्राप्त करता है। |
| [get_PublicKey](./get_publickey/)() const | एक प्रमाणपत्र [PublicKey](../publickey/) ऑब्जेक्ट प्राप्त करता है। |
| [get_RawData](./get_rawdata/)() const | प्रमाणपत्र का कच्चा डेटा प्राप्त करता है। |
| [get_SerialNumber](./get_serialnumber/)() const | प्रमाणपत्र का सीरियल नंबर प्राप्त करता है। |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | प्रमाणपत्र के हस्ताक्षर बनाने के लिए उपयोग किए जाने वाले एल्गोरिद्म को प्राप्त करता है। |
| [get_SubjectName](./get_subjectname/)() const | प्रमाणपत्र से विषय नाम प्राप्त करता है। |
| [get_Thumbprint](./get_thumbprint/)() const | प्रमाणपत्र की थंबप्रिंट प्राप्त करता है। |
| [get_Version](./get_version/)() const | प्रमाणपत्र फ़ॉर्मेट संस्करण प्राप्त करता है। |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | निर्दिष्ट बाइट एरे में मौजूद प्रमाणपत्र के प्रकार को प्राप्त करता है। |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | निर्दिष्ट फ़ाइल में मौजूद प्रमाणपत्र के प्रकार को प्राप्त करता है। |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) निजी कुंजी;। |
| [GetDSAPublicKey](./getdsapublickey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) सार्वजनिक कुंजी। |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) निजी कुंजी;। |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) सार्वजनिक कुंजी। |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | प्रमाणपत्र से विषय या जारीकर्ता नाम प्राप्त करता है। |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) निजी कुंजी;। |
| [GetRSAPublicKey](./getrsapublickey/)() const | प्राप्त करता है [RSA](../../system.security.cryptography/rsa/) सार्वजनिक कुंजी। |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। |
| [Import](./import/)(const String\&) override | निर्दिष्ट प्रमाणपत्र फ़ाइल से जानकारी आयात करता है। |
| [Import](./import/)(const ByteArrayPtr\&) override | निर्दिष्ट प्रमाणपत्र डेटा से जानकारी आयात करता है। |
| [Reset](./reset/)() override | प्रमाणपत्र की स्थिति को रीसेट करता है। |
| [set_Archived](./set_archived/)(bool) const | एक मान सेट करता है जो दर्शाता है कि प्रमाणपत्र संग्रहीत है। |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | प्रमाणपत्र का फ्रेंडली नाम सेट करता है। |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | प्रमाणपत्र से जुड़ी निजी कुंजी को सेट या साफ़ करता है। |
| [ToString](./tostring/)(bool) const override | प्रमाणपत्र की जानकारी को टेक्स्ट प्रारूप में लौटाता है। |
| [ToString](./tostring/)() const override | प्रमाणपत्र की जानकारी को टेक्स्ट प्रारूप में लौटाता है। |
| [Verify](./verify/)() const | प्रमाणपत्र श्रृंखला को सत्यापित करता है। |
| [X509Certificate2](./x509certificate2/)() | खाली [X509Certificate2](./) बनाता है। |
| [X509Certificate2](./x509certificate2/)(const String\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | निर्माता। |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | निर्माता। |
## संबंधित देखें

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
