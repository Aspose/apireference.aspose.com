---
title: "System::ComponentModel::EnumConverter क्लास"
linktitle: "EnumConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::EnumConverter क्लास। EnumConverter-उपयोग करने वाले अनुवादित कोड को संकलित करने के लिए डमी क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


EnumConverter-उपयोग करने वाले अनुवादित कोड को संकलित करने के लिए डमी क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | जाँचता है कि प्रकार परिवर्तनीय हैं या नहीं; लागू नहीं किया गया। |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | जाँचता है कि प्रकार परिवर्तनीय हैं या नहीं; लागू नहीं किया गया। |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | वास्तविक प्रकार रूपांतरण करता है; लागू नहीं किया गया। |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | वास्तविक प्रकार रूपांतरण करता है; लागू नहीं किया गया। |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI जानकारी। |
| [get_EnumType](./get_enumtype/)() | उस enum प्रकार को प्राप्त करता है जिसके साथ [EnumConverter](./) काम कर रहा है; लागू नहीं किया गया। |
## संबंधित देखें

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
