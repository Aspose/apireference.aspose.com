---
title: "System::IterateOver मेथड"
linktitle: "परिचालनकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IterateOver मेथड। यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए डिफ़ॉल्ट टार्गेट टाइप के साथ C++ में।"
type: docs
weight: 23100
url: /hi/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए डिफ़ॉल्ट टार्गेट टाइप के साथ।

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए बिना begin(), end() मेथड्स के टार्गेट टाइप आर्ग्यूमेंट के साथ (auto& value : IterateOver<SomeType>(enumerable)) के लिए।

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | टार्गेट टाइप, जिसे इटररेटर से लौटाया जाना चाहिए |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए बिना begin(), end() मेथड्स के टार्गेट टाइप आर्ग्यूमेंट के साथ (auto& value : IterateOver<SomeType>(enumerable)) के लिए।

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | टार्गेट टाइप, जिसे इटररेटर से लौटाया जाना चाहिए |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए बिना begin(), end() मेथड्स के डिफ़ॉल्ट टार्गेट टाइप आर्ग्यूमेंट के साथ (auto& value : IterateOver(enumerable)) के लिए, जो निम्नलिखित C# कोड foreach (var value in enumerable) के समान है।

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए begin(), end() मेथड्स के साथ डिफ़ॉल्ट टार्गेट टाइप आर्ग्यूमेंट के लिए (auto& value : IterateOver(enumerable))।

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए begin(), end() मेथड्स के साथ टार्गेट टाइप को इटररेटर के मूल value_type के समान रखता है।

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |
| T | टार्गेट टाइप जिसे इटररेटर से लौटाया जाना चाहिए |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


यह फ़ंक्शन प्रॉपर्टी enumerable (या iterable) ऑब्जेक्ट को रैप करती है ताकि इसे रेंज-आधारित for लूप के साथ उपयोग किया जा सके। यह ओवरलोड Enumerable के लिए begin(), end() मेथड्स के साथ अलग टार्गेट टाइप और इटररेटर के मूल value_type के साथ।

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| Enumerable | रैप किए गए ऑब्जेक्ट का प्रकार |
| T | टार्गेट टाइप जिसे इटररेटर से लौटाया जाना चाहिए |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
