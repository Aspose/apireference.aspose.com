---
title: "System::Collections::Generic::SortedSet क्लास"
linktitle: "सॉर्टेडसेट"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SortedSet क्लास। C++ में SortedSet क्लास की फॉरवर्ड डिक्लेरेशन।"
type: docs
weight: 4400
url: /hi/cpp/system.collections.generic/sortedset/
---
## SortedSet class


फॉरवर्ड डिक्लेरेशन ऑफ [SortedSet](./) क्लास।

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Max](./get_max/)() const | [SortedSet](./) में अधिकतम मान प्राप्त करता है। |
| [SortedSet](./sortedset/)() | RTTI जानकारी। |
| [SortedSet](./sortedset/)(int) | निर्दिष्ट क्षमता के साथ खाली सेट बनाता है। |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | निर्दिष्ट समानता तुलनाकर्ता का उपयोग करने वाला खाली सेट बनाता है। |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | एन्यूमेरेबल मानों के आधार पर [SortedSet](./) बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | वेस प्रकार। |
| [ThisPtr](./thisptr/) | पॉइंटर प्रकार। |
| [ThisType](./thistype/) | स्व प्रकार। |
## टिप्पणियाँ


एक क्रमबद्ध वस्तुओं का सेट लागू करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का कोई उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
