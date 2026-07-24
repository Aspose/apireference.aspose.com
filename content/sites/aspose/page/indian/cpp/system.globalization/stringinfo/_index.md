---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::StringInfo क्लास। स्ट्रिंग भागों के माध्यम से इटररेट करने के लिए Splitter। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2400
url: /hi/cpp/system.globalization/stringinfo/
---
## StringInfo class


स्ट्रिंग भागों के माध्यम से इटररेट करने के लिए Splitter। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringInfo : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | [StringInfo](./) ऑब्जेक्ट में टेक्स्ट आइटम्स की संख्या प्राप्त करता है। |
| [get_String](./get_string/)() const | [StringInfo](./) ऑब्जेक्ट का मान प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | निर्दिष्ट स्ट्रिंग में पहला तत्व प्राप्त करता है। |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | निर्दिष्ट स्ट्रिंग के निर्दिष्ट इंडेक्स पर तत्व प्राप्त करता है। |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | स्ट्रिंग के अक्षरों के माध्यम से इटररेट करने के लिए एन्यूमरेटर बनाता है। |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | निर्दिष्ट इंडेक्स से शुरू करके स्ट्रिंग के अक्षरों के माध्यम से इटररेट करने के लिए एन्यूमरेटर बनाता है। |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | बेस कैरेक्टर्स, हाई सरोगेट्स और कंट्रोल कैरेक्टर्स के इंडेक्स प्राप्त करता है। |
| [set_String](./set_string/)(const String\&) | [StringInfo](./) ऑब्जेक्ट का मान सेट करता है। |
| [StringInfo](./stringinfo/)() | RTTI जानकारी। |
| [StringInfo](./stringinfo/)(const String\&) | निर्माता। |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | निर्दिष्ट टेक्स्ट एलिमेंट से लेकर अंतिम टेक्स्ट एलिमेंट तक टेक्स्ट एलिमेंट्स का सबस्ट्रिंग प्राप्त करता है। |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | निर्दिष्ट टेक्स्ट एलिमेंट से लेकर निर्दिष्ट संख्या के टेक्स्ट एलिमेंट्स तक टेक्स्ट एलिमेंट्स का सबस्ट्रिंग प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
