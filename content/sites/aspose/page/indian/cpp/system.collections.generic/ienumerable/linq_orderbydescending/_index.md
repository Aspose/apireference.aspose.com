---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending method"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास की LINQ_OrderByDescending मेथड का उपयोग कैसे करें।"
type: docs
weight: 2400
url: /hi/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


keySelector द्वारा चुनी गई कुंजी मानों के अनुसार अनुक्रम के तत्वों को अवरोही क्रम में सॉर्ट करता है।

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| पैरामीटर | विवरण |
| --- | --- |
| keySelector | एक फ़ंक्शन जो किसी तत्व से कुंजी निकालता है। |

### ReturnValue

एक IOrderedEnumerable जिसके तत्व कुंजी के अवरोही क्रम में क्रमबद्ध होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
