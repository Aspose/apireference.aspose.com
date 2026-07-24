---
title: "System::Globalization::IdnMapping क्लास"
linktitle: "IdnMapping"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::IdnMapping क्लास। IdnMapping नामों को Punycode में मैप करने के लिए उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1300
url: /hi/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | दो [IdnMapping](./) ऑब्जेक्ट्स की तुलना करता है। |
| [get_AllowUnassigned](./get_allowunassigned/)() const | ऑपरेशन्स में उपयोग किए गए अनअसाइन्ड कोड पॉइंट्स को दर्शाने वाला फ़्लैग प्राप्त करता है। |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | ऑपरेशन्स में उपयोग किए गए मानक नामकरण नियमों को दर्शाने वाला फ़्लैग प्राप्त करता है। |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) यूनिकोड डोमेन नाम को ASCII समकक्ष में बदलता है। |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) यूनिकोड डोमेन नाम को ASCII समकक्ष में बदलता है। |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) यूनिकोड डोमेन नाम को ASCII समकक्ष में बदलता है। |
| [GetHashCode](./gethashcode/)() const override | वर्तमान [IdnMapping](./) ऑब्जेक्ट के लिए हैश कोड प्राप्त करता है। |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ASCII डोमेन नाम को यूनिकोड समकक्ष में बदलता है। |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ASCII डोमेन नाम को यूनिकोड समकक्ष में बदलता है। |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ASCII डोमेन नाम को यूनिकोड समकक्ष में बदलता है। |
| [IdnMapping](./idnmapping/)() | RTTI जानकारी। |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | ऑपरेशनों में उपयोग किए गए असाइन न किए गए कोड पॉइंट्स को दर्शाने वाला फ़्लैग सेट करता है। |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | ऑपरेशनों में उपयोग किए गए मानक नामकरण सम्मेलनों को दर्शाने वाला फ़्लैग सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
