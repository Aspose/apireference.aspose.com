---
title: "System::Security::Cryptography::Pkcs::CmsSigner क्लास"
linktitle: "CmsSigner"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::Pkcs::CmsSigner क्लास। CMS का उपयोग करके ऑब्जेक्ट को साइन करने के लिए API प्रदान करता है। यह स्वयं ऑब्जेक्ट को साइन नहीं करता, ऐसा करने के लिए SignedCMS क्लास का उपयोग करें। लागू नहीं किया गया है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


CMS का उपयोग करके ऑब्जेक्ट को साइन करने के लिए API प्रदान करता है। यह स्वयं ऑब्जेक्ट को साइन नहीं करता, ऐसा करने के लिए SignedCMS क्लास का उपयोग करें। लागू नहीं किया गया है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class CmsSigner : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | X509 प्रमाणपत्र के साथ साइनर को प्रारंभ करता है। |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | हैश एल्गोरिद्म को सिग्नेचर के साथ प्राप्त करता है। |
| [get_IncludeOption](./get_includeoption/)() const | जाँचता है कि श्रृंखला में से कौन से प्रमाणपत्र सिग्नेचर में शामिल किए जाएंगे। |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | हैश एल्गोरिद्म को सिग्नेचर के साथ सेट करता है। |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | निर्दिष्ट करता है कि श्रृंखला से कौन से प्रमाणपत्र हस्ताक्षर में शामिल किए जाएंगे। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
