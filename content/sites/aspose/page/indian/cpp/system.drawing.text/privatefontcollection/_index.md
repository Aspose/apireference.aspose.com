---
title: "System::Drawing::Text::PrivateFontCollection क्लास"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Text::PrivateFontCollection क्लास। क्लाइंट एप्लिकेशन द्वारा प्रदान किए गए फ़ॉन्ट परिवारों का संग्रह दर्शाती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


क्लाइंट एप्लिकेशन द्वारा प्रदान किए गए फ़ॉन्ट परिवारों का संग्रह दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट फ़ॉन्ट को संग्रह में जोड़ता है। |
| [AddFontFile](./addfontfile/)(const String\&) | निर्दिष्ट फ़ाइल से फ़ॉन्ट को संग्रह में जोड़ता है। |
| [get_Families](./get_families/)() override | वर्तमान वस्तु द्वारा दर्शाए गए फ़ॉन्ट संग्रह से जुड़े [FontFamily](../../system.drawing/fontfamily/) वस्तुओं की एक सरणी लौटाता है। |
## संबंधित देखें

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
