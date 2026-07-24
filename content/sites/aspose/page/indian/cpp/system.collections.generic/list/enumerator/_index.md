---
title: "System::Collections::Generic::List::Enumerator class"
linktitle: "एन्यूमरेटर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::List::Enumerator class. सूची के तत्वों पर इटररेट करने के लिए एन्यूमरेटर। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। कभी भी इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 6100
url: /hi/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | विशिष्ट सूची के माध्यम से इटररेट करने वाला एन्यूमरेटर बनाता है। |
## संबंधित देखें

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
