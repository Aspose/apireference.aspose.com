---
title: "System::Reflection::MethodBase क्लास"
linktitle: "MethodBase"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::MethodBase क्लास। मेथड के बारे में मूल जानकारी। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 800
url: /hi/cpp/system.reflection/methodbase/
---
## MethodBase class


मेथड के बारे में मूल जानकारी। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | सदस्य के प्रकार को दर्शाना - मेथड, कंस्ट्रक्टर, इवेंट, आदि। |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | यह मेथड वर्तमान मेथड का नाम प्राप्त करने की अनुमति देता है। ट्रांसलेटर स्वचालित रूप से पैरामीटर के रूप में ASPOSE_CURRENT_FUNCTION को प्रतिस्थापित करता है। |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | [MethodBase](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## संबंधित देखें

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
