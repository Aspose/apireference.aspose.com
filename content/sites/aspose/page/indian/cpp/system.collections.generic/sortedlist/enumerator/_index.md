---
title: "System::Collections::Generic::SortedList::Enumerator क्लास"
linktitle: "एन्यूमरेटर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SortedList::Enumerator क्लास। सूची के माध्यम से इटररेट करने के लिए Enumerator क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 2600
url: /hi/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | विशिष्ट डिक्शनरी के माध्यम से इटररेट करने वाला एनेमरेटर बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) टाइप एलियास। |
## संबंधित देखें

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
