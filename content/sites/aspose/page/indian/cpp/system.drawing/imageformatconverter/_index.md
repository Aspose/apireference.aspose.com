---
title: "System::Drawing::ImageFormatConverter वर्ग"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::ImageFormatConverter वर्ग। ImageFormat वस्तुओं को एक डेटा प्रकार से दूसरे में परिवर्तित करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 1400
url: /hi/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


एक डेटा प्रकार से दूसरे डेटा प्रकार में ImageFormat ऑब्जेक्ट्स को परिवर्तित करता है। इस क्लास के ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | वस्तुओं को परिवर्तित करता है। |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | वस्तुओं को परिवर्तित करता है। |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | वस्तुओं को परिवर्तित करता है। |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | स्ट्रिंग को वस्तु में परिवर्तित करता है। |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | वस्तु को विशिष्ट प्रकार में परिवर्तित करता है। |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | वस्तु को विशिष्ट प्रकार में परिवर्तित करता है। |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | वस्तु को विशिष्ट प्रकार में परिवर्तित करता है। |
| [ImageFormatConverter](./imageformatconverter/)() | एक नया इंस्टेंस [ImageFormatConverter](./) का निर्माण करता है। |
## संबंधित देखें

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
