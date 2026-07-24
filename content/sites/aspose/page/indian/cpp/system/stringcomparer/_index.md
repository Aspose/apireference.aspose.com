---
title: "System::StringComparer class"
linktitle: "StringComparer"
second_title: "Aspose.Page C++ के लिए"
description: "System::StringComparer class. विभिन्न तुलना मोड्स का उपयोग करके स्ट्रिंग्स की तुलना करता है। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 5900
url: /hi/cpp/system/stringcomparer/
---
## StringComparer class


विभिन्न तुलना मोड का उपयोग करके स्ट्रिंग्स की तुलना करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | वर्तमान सेटिंग्स का उपयोग करके दो स्ट्रिंग्स की तुलना करता है। |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | संस्कृति-विशिष्ट तुलना करने वाला बनाता है। |
| [Equals](./equals/)(String, String) const override | वर्तमान सेटिंग्स का उपयोग करके दो स्ट्रिंग्स बराबर हैं या नहीं, जांचता है। |
| static [get_CurrentCulture](./get_currentculture/)() | वर्तमान संस्कृति तुलना करने वाला सिंगलटन। |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | वर्तमान संस्कृति केस-नज़रअंदाज़ करने वाला तुलना करने वाला सिंगलटन। |
| static [get_InvariantCulture](./get_invariantculture/)() | इनवेरिएंट संस्कृति तुलना करने वाला सिंगलटन। |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | इनवेरिएंट संस्कृति केस-नज़रअंदाज़ करने वाला तुलना करने वाला सिंगलटन। |
| static [get_Ordinal](./get_ordinal/)() | ऑर्डिनल तुलना करने वाला सिंगलटन। |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | ऑर्डिनल केस-नज़रअंदाज़ करने वाला तुलना करने वाला सिंगलटन। |
| [GetHashCode](./gethashcode/)(String) const override | स्ट्रिंग का हैश कोड प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [args_type](./args_type/) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
