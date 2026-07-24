---
title: "System::Collections::Generic::BaseSet::Enumerator क्लास"
linktitle: "एन्यूमरेटर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::BaseSet::Enumerator क्लास। Enumerator क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2800
url: /hi/cpp/system.collections.generic/baseset/enumerator/
---
## Enumerator class


[Enumerator](./) class. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<set_t>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | **set** ऑब्जेक्ट के माध्यम से इटरिट करने वाला एन्यूमरेटर बनाता है। |
## संबंधित देखें

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [BaseSet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
