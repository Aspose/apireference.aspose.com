---
title: "System::Drawing::FontFamily क्लास"
linktitle: "FontFamily"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::FontFamily क्लास। समान मूल डिजाइन साझा करने वाले टाइप फ़ेसेस के समूह का प्रतिनिधित्व करता है। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.drawing/fontfamily/
---
## FontFamily class


समान मूल डिजाइन साझा करने वाले टाइप फ़ेसेस के समूह का प्रतिनिधित्व करता है। इस क्लास के ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class FontFamily : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | वर्तमान [FontFamily](./) ऑब्जेक्ट की एक कॉपी लौटाता है। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त सभी ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | निर्धारित करता है कि वर्तमान और निर्दिष्ट ऑब्जेक्ट समान हैं या नहीं। |
| [FontFamily](./fontfamily/)(const String\&) | निर्दिष्ट नाम के साथ एक फ़ॉन्ट फ़ैमिली का प्रतिनिधित्व करने वाली [FontFamily](./) क्लास की नई इंस्टेंस बनाता है। |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | निर्दिष्ट फ़ॉन्ट कलेक्शन में निर्दिष्ट नाम के साथ [FontFamily](./) की नई इंस्टेंस बनाता है। |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | निर्दिष्ट सामान्य फ़ॉन्ट फ़ैमिली से [FontFamily](./) की नई इंस्टेंस बनाता है। |
| static [get_Families](./get_families/)() | वर्तमान ग्राफ़िक्स कॉन्टेक्स्ट से जुड़े सभी [FontFamily](./) ऑब्जेक्ट्स को शामिल करने वाला एक एरे लौटाता है। |
| static [get_GenericMonospace](./get_genericmonospace/)() | एक [FontFamily](./) ऑब्जेक्ट लौटाता है जो एक सामान्य मोनोस्पेस फ़ॉन्ट फ़ैमिली का प्रतिनिधित्व करता है। |
| static [get_GenericSansSerif](./get_genericsansserif/)() | एक [FontFamily](./) ऑब्जेक्ट लौटाता है जो एक सामान्य सैंस-सेरिफ़ फ़ॉन्ट फ़ैमिली का प्रतिनिधित्व करता है। |
| static [get_GenericSerif](./get_genericserif/)() | एक [FontFamily](./) ऑब्जेक्ट लौटाता है जो एक सामान्य सेरिफ़ फ़ॉन्ट फ़ैमिली का प्रतिनिधित्व करता है। |
| [get_Name](./get_name/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ॉन्ट फ़ैमिली का नाम लौटाता है। |
| [GetCellAscent](./getcellascent/)(FontStyle) | निर्दिष्ट फ़ॉन्ट शैली के लिए वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ॉन्ट फ़ैमिली का सेल एसेन्ट लौटाता है। |
| [GetCellDescent](./getcelldescent/)(FontStyle) | निर्दिष्ट फ़ॉन्ट शैली के लिए वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ॉन्ट फ़ैमिली का सेल डिसेंट लौटाता है। |
| [GetEmHeight](./getemheight/)(FontStyle) | निर्दिष्ट शैली के लिए फ़ॉन्ट डिज़ाइन यूनिट्स में एम स्क्वायर की ऊँचाई लौटाता है। |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | निर्दिष्ट फ़ॉन्ट शैली के लिए वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ॉन्ट फ़ैमिली की लाइन स्पेसिंग लौटाता है। |
| [GetName](./getname/)(int) const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ॉन्ट फ़ैमिली का नाम लौटाता है। |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | निर्धारित करता है कि निर्दिष्ट फ़ॉन्ट शैली उपलब्ध है या नहीं। |
| virtual [~FontFamily](./~fontfamily/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
