---
title: "System::Security::Cryptography::Pkcs::SignedCms क्लास"
linktitle: "SignedCms"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::Pkcs::SignedCms क्लास। CMS/PKCS #7 मानक के अनुसार कंटेंट पर हस्ताक्षर करता है। लागू नहीं है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


CMS/PKCS #7 मानक के अनुसार कंटेंट पर हस्ताक्षर करता है। लागू नहीं है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SignedCms : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | हस्ताक्षर बनाता है। |
| [Encode](./encode/)() | CMS/PKCS #7 संदेश को एन्कोड करता है। |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | निर्माता। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
