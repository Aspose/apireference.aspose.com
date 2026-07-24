---
title: "System::ComponentModel::TypeConverter वर्ग"
linktitle: "TypeConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::TypeConverter वर्ग. घटक मॉडल में प्रकार रूपांतरण को संभालने वाला वर्ग. इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें."
type: docs
weight: 1400
url: /hi/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


घटक मॉडल में प्रकार रूपांतरण को संभालने वाला वर्ग. इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के तर्क के रूप में पास करें.

```cpp
class TypeConverter : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | वस्तुओं को परिवर्तित करता है। |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | वस्तुओं को परिवर्तित करता है। |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | स्ट्रिंग को वस्तु में परिवर्तित करता है। |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | इनवेरिएंट स्ट्रिंग को ऑब्जेक्ट में परिवर्तित करता है. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | इनवेरिएंट स्ट्रिंग को ऑब्जेक्ट में परिवर्तित करता है. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | स्ट्रिंग को वस्तु में परिवर्तित करता है। |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | स्ट्रिंग को वस्तु में परिवर्तित करता है। |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | स्ट्रिंग को वस्तु में परिवर्तित करता है। |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | वस्तु को विशिष्ट प्रकार में परिवर्तित करता है। |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | वस्तु को विशिष्ट प्रकार में परिवर्तित करता है। |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट को इनवेरिएंट स्ट्रिंग में परिवर्तित करता है. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट को इनवेरिएंट स्ट्रिंग में परिवर्तित करता है. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है. |
| [TypeConverter](./typeconverter/)() | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
