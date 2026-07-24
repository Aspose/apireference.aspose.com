---
title: "System::Collections::Generic::BaseEnumerator क्लास"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::BaseEnumerator क्लास। STL-शैली के प्रकारों को C#-शैली के उपयोग के लिए रैप करने की Enumerator परिभाषा। कंटेनर संरचना पर कोई दावे नहीं करता सिवाय क्रमिक इटरेटर की मौजूदगी के। begin() और end() फ़ंक्शनों का उपयोग करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 600
url: /hi/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| पैरामीटर | विवरण |
| --- | --- |
| कंटेनर | STL-शैली का कंटेनर प्रकार। |
| Element | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | इटररेटर को प्रारंभ करता है। |
| [IsValid](./isvalid/)() const | जाँचता है कि क्या [MoveNext()](./movenext/) को कॉल किया गया था और अंत तक नहीं पहुँचा गया। |
| [MoveNext](./movenext/)() override | एन्यूमरेटर-शैली वृद्धि। |
| [Reset](./reset/)() override | तत्वों को पुनः-एन्यूमरेट करने की अनुमति देने के लिए एन्यूमरेटर को रीसेट करता है। |

## संबंधित देखें

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
