---
title: "System::Security::Cryptography::Oid class"
linktitle: "Oid"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::Oid क्लास। क्रिप्टोग्राफिक ऑब्जेक्ट आइडेंटिफायर। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.security.cryptography/oid/
---
## Oid class


क्रिप्टोग्राफिक ऑब्जेक्ट आइडेंटिफायर। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Oid : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | निर्दिष्ट OID फ्रेंडली नाम से OID ऑब्जेक्ट बनाएं। |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | निर्दिष्ट OID मान से OID ऑब्जेक्ट बनाएं। |
| [get_FriendlyName](./get_friendlyname/)() const | ऑब्जेक्ट का उपयोगकर्ता‑मित्र नाम प्राप्त करता है। |
| [get_Value](./get_value/)() const | ऑब्जेक्ट आइडेंटिफायर स्ट्रिंग प्राप्त करता है। |
| [Oid](./oid/)() | RTTI जानकारी। |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | कॉपी कंस्ट्रक्टर। |
| [Oid](./oid/)(const String\&) | निर्माता। |
| [Oid](./oid/)(const String\&, const String\&) | निर्माता। |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | ऑब्जेक्ट का उपयोगकर्ता‑मित्र नाम सेट करता है। |
| [set_Value](./set_value/)(const String\&) | ऑब्जेक्ट आइडेंटिफायर स्ट्रिंग सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
