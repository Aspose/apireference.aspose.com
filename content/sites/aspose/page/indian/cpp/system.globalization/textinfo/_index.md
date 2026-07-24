---
title: "System::Globalization::TextInfo क्लास"
linktitle: "TextInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::TextInfo क्लास। स्थानीय-विशिष्ट पाठ गुणों को परिभाषित करता है। सेट्टर ऑपरेशन्स केवल गैर-रीड-ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2800
url: /hi/cpp/system.globalization/textinfo/
---
## TextInfo class


स्थानीय-विशिष्ट पाठ गुणों को परिभाषित करता है। सेट्टर ऑपरेशन्स केवल गैर-रीड-ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class TextInfo : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | ANSI कोडपेज प्राप्त करता है। |
| [get_CultureName](./get_culturename/)() const | संस्कृति नाम प्राप्त करता है। |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | EBCDIC कोडपेज प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि क्या स्वरूप केवल-पढ़ने योग्य है। |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | जाँचता है कि पाठ बाएँ से दाएँ लिखा गया है या नहीं। |
| [get_LCID](./get_lcid/)() const | लोकैल आईडी प्राप्त करता है। |
| virtual [get_ListSeparator](./get_listseparator/)() const | सूची विभाजक प्राप्त करता है। |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Macintosh कोडपेज प्राप्त करता है। |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | OEM कोडपेज प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | संस्कृति का केवल-पढ़ने योग्य संस्करण प्राप्त करता है। |
| virtual [set_ListSeparator](./set_listseparator/)(String) | सूची विभाजक सेट करता है। |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI जानकारी। |
| virtual [ToLower](./tolower/)(char_t) const | अक्षर को लोअर केस में बदलता है। |
| virtual [ToLower](./tolower/)(String) const | स्ट्रिंग को लोअर केस में बदलता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| [ToTitleCase](./totitlecase/)(String) const | स्ट्रिंग को टाइटल केस में बदलता है (पहले से अपर केस में मौजूद संक्षिप्ताक्षरों को छोड़कर)। |
| virtual [ToUpper](./toupper/)(char_t) const | अक्षर को अपर केस में बदलता है। |
| virtual [ToUpper](./toupper/)(String) const | स्ट्रिंग को अपर केस में बदलता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
