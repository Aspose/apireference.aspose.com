---
title: "System::Collections::Generic::SortedDictionary::Enumerator क्लास"
linktitle: "एन्यूमरेटर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SortedDictionary::Enumerator क्लास. शब्दकोश के माध्यम से इटररेट करने के लिए एन्यूमरेटर प्रकार। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | विशिष्ट शब्दकोश पर एन्यूमरेटर बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) टाइप एलियास। |
## संबंधित देखें

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
