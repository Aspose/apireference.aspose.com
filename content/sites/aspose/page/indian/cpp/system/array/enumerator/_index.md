---
title: "System::Array::Enumerator क्लास"
linktitle: "एन्यूमरेटर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::Enumerator क्लास। यह IEnumerator इंटरफ़ेस को लागू करता है जो एक Array ऑब्जेक्ट के तत्वों की गिनती सक्षम करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 6800
url: /hi/cpp/system/array/enumerator/
---
## Enumerator class


IEnumerator इंटरफ़ेस को लागू करता है जो एक [Array](../) ऑब्जेक्ट के तत्वों की गिनती सक्षम करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | निर्दिष्ट एरे का प्रतिनिधित्व करने वाला नया [Enumerator](./) ऑब्जेक्ट बनाता है। |
| [get_Current](./get_current/)() const override | वर्तमान तत्व की एक कॉपी लौटाता है। |
| [MoveNext](./movenext/)() override | जाँचता है कि क्या वर्तमान तत्व का इंडेक्स एरे में अंतिम तत्व की ओर संकेत नहीं करता और यदि नहीं करता तो इसे आगे बढ़ाता है। |
| [Reset](./reset/)() override | वर्तमान तत्व का इंडेक्स रीसेट करता है। |
| virtual [~Enumerator](./~enumerator/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
