---
title: "System::Globalization::TextElementEnumerator क्लास"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::TextElementEnumerator क्लास। स्ट्रिंग तत्वों (अक्षरों) के माध्यम से इटररेट करने के लिए एनेमरेटर। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें C++ में।"
type: docs
weight: 2700
url: /hi/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


स्ट्रिंग तत्वों (अक्षरों) के माध्यम से इटररेट करने के लिए एनेमरेटर। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class TextElementEnumerator : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Current](./get_current/)() const | वर्तमान टेक्स्ट तत्व प्राप्त करता है। |
| [get_ElementIndex](./get_elementindex/)() const | वर्तमान टेक्स्ट तत्व का इंडेक्स प्राप्त करता है। |
| [GetTextElement](./gettextelement/)() const | वर्तमान तत्व प्राप्त करता है। |
| [MoveNext](./movenext/)() | अगले तत्व पर जाता है। |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | एनेमरेटर को प्रारंभिक स्थिति पर सेट करता है। |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
