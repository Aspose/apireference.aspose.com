---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::ColorBlend class. कई‑रंग ग्रेडिएंट में रंग मिश्रण को इंटरपोलेट करने के लिए उपयोग किए जाने वाले रंगों और स्थितियों की सरणियाँ शामिल करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


रंग मिश्रण को इंटरपोलेट करने के लिए कई‑रंग ग्रेडिएंट में उपयोग किए जाने वाले रंगों और स्थितियों की सरणियाँ शामिल करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class ColorBlend : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ColorBlend](./colorblend/)() | एक नया उदाहरण बनाता है [ColorBlend](./) वर्ग का। |
| [ColorBlend](./colorblend/)(int) | एक नया उदाहरण बनाता है [Blend](../blend/) वर्ग का। |
| [get_Colors](./get_colors/)() | ग्रेडिएंट के साथ संबंधित स्थितियों पर उपयोग किए जाने वाले रंगों की एक सरणी लौटाता है। |
| [get_Positions](./get_positions/)() | ग्रेडिएंट के साथ मिश्रण स्थितियों की सरणी लौटाता है। |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | ग्रेडिएंट के साथ संबंधित स्थितियों पर उपयोग किए जाने वाले रंगों की एक सरणी सेट करता है। |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | ग्रेडिएंट के साथ मिश्रण स्थितियों की सरणी सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
