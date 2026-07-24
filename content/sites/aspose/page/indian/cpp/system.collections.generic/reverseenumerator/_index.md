---
title: "System::Collections::Generic::ReverseEnumerator क्लास"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::ReverseEnumerator क्लास। वह इनेमरेटर जो कंटेनर के माध्यम से उल्टे क्रम में इटरेट करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3800
url: /hi/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| पैरामीटर | विवरण |
| --- | --- |
| कंटेनर | इटररेट करने के लिए कंटेनर। |
| Element | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Current](./get_current/)() const override | 'current' तत्व प्राप्त करता है। |
| [IsValid](./isvalid/)() const | जाँचता है कि क्या [MoveNext()](./movenext/) को कॉल किया गया था और अंत तक नहीं पहुँचा गया। |
| [MoveNext](./movenext/)() override | एन्यूमरेटर-शैली वृद्धि। |
| [Reset](./reset/)() override | तत्वों को पुनः-एन्यूमरेट करने की अनुमति देने के लिए एन्यूमरेटर को रीसेट करता है। |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | इटररेटर को प्रारंभ करता है। |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
