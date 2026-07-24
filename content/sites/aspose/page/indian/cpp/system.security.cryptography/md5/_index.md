---
title: "System::Security::Cryptography::MD5 क्लास"
linktitle: "MD5"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::MD5 क्लास। MD5 हैशिंग एल्गोरिद्म। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 2300
url: /hi/cpp/system.security.cryptography/md5/
---
## MD5 class


[MD5](./) hashing algorithm. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class MD5 : public System::Security::Cryptography::HashAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | बनाता है [MD5](./) एल्गोरिद्म। |
| static [Create](./create/)(const String\&) | बनाता है [MD5](./) एल्गोरिद्म। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ptr](./ptr/) | RTTI जानकारी। |
## संबंधित देखें

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
