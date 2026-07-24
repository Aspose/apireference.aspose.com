---
title: "System::Collections::Generic::IList क्लास"
linktitle: "IList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IList क्लास। तत्वों के अनुक्रमित कंटेनर का इंटरफ़ेस। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2600
url: /hi/cpp/system.collections.generic/ilist/
---
## IList class


तत्वों के अनुक्रमित कंटेनर का इंटरफ़ेस। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | जाँचता है कि संग्रह स्थिर आकार का है या नहीं। |
| virtual [idx_get](./idx_get/)(int) const | निर्दिष्ट इंडेक्स पर तत्व प्राप्त करता है। |
| virtual [idx_set](./idx_set/)(int, T) | निर्दिष्ट इंडेक्स पर तत्व सेट करता है। |
| virtual [IndexOf](./indexof/)(const T\&) const | कंटेनर में आइटम की पहली उपस्थिति का इंडेक्स प्राप्त करता है। |
| virtual [Insert](./insert/)(int, const T\&) | निर्दिष्ट स्थिति में तत्व डालता है, अन्य तत्वों को शिफ्ट करता है। |
| virtual [RemoveAt](./removeat/)(int) | निर्दिष्ट इंडेक्स पर तत्व हटाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | RTTI जानकारी। |
| [ThisType](./thistype/) | यह प्रकार। |
| [ValueType](./valuetype/) | वैल्यू टाइप। |

## संबंधित देखें

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
