---
title: "System::Security::Cryptography::Rfc2898DeriveBytes class"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::Rfc2898DeriveBytes क्लास। पासवर्ड-आधारित कुंजी व्युत्पत्ति, PBKDF2 को लागू करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2900
url: /hi/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


पासवर्ड-आधारित कुंजी व्युत्पत्ति, PBKDF2 को लागू करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | मौजूदा एरे तत्वों को स्यूडो-रैंडम कुंजी बाइट्स से भरता है। |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | RTTI जानकारी। |
## संबंधित देखें

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
