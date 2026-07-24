---
title: "System::Reflection::MemberInfo class"
linktitle: "MemberInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::MemberInfo class. सदस्यों पर रिफ्लेक्शन जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 700
url: /hi/cpp/system.reflection/memberinfo/
---
## MemberInfo class


सदस्यों पर रिफ्लेक्शन जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | संग्रह में विशेषता जोड़ता है। |
| [get_DeclaringType](./get_declaringtype/)() const | घोषित प्रकार प्राप्त करता है। |
| [get_FullName](./get_fullname/)() const | सदस्य का पूर्ण नाम प्राप्त करता है। मैन्युअल रूप से लागू भागों में यह अलग हो सकता है। |
| virtual [get_MemberType](./get_membertype/)() const | एक [System::Reflection::MemberTypes](../membertypes/) मान प्राप्त करता है जो सदस्य के प्रकार को दर्शाता है - मेथड, कंस्ट्रक्टर, इवेंट, आदि। |
| [get_Name](./get_name/)() const | सदस्य का नाम प्राप्त करता है। |
| [get_ReflectedType](./get_reflectedtype/)() const | परावर्तित प्रकार प्राप्त करता है। |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | एक एरे लौटाता है जिसमें वे ऑब्जेक्ट्स होते हैं जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार पर लागू सभी कस्टम एट्रिब्यूट्स को दर्शाते हैं। |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | एक एरे लौटाता है जिसमें वे ऑब्जेक्ट्स होते हैं जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार पर लागू सभी कस्टम एट्रिब्यूट्स को दर्शाते हैं। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ObjectPtr](./objectptr/) | [Object](../../system/object/) के लिए साझा पॉइंटर का उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
