---
title: "System::Collections::Generic::HashSet क्लास"
linktitle: "HashSet"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::HashSet क्लास। C++ में HashSet क्लास की अग्र घोषणा।"
type: docs
weight: 1700
url: /hi/cpp/system.collections.generic/hashset/
---
## HashSet class


[HashSet](./) क्लास की अग्र घोषणा।

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [HashSet](./hashset/)() | RTTI जानकारी। |
| [HashSet](./hashset/)(int) | निर्दिष्ट क्षमता के साथ खाली सेट बनाता है। |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | निर्दिष्ट समानता तुलनाकर्ता का उपयोग करने वाला खाली सेट बनाता है। |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | enumerable मानों के आधार पर हैशसेट बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | बेस प्रकार। |
| [ThisPtr](./thisptr/) | पॉइंटर प्रकार। |
| [ThisType](./thistype/) | स्व प्रकार। |
## टिप्पणियाँ


हैशिंग पर आधारित सेट कार्यान्वयन। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
