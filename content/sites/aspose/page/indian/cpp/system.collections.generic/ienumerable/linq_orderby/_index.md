---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास की LINQ_OrderBy मेथड का उपयोग कैसे करें।"
type: docs
weight: 2300
url: /hi/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


keySelector द्वारा चुनी गई कुंजी मानों के अनुसार अनुक्रम के तत्वों को आरोही क्रम में सॉर्ट करता है।

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| पैरामीटर | विवरण |
| --- | --- |
| keySelector | एक फ़ंक्शन जो किसी तत्व से कुंजी निकालता है। |

### ReturnValue

एक IOrderedEnumerable जिसका तत्व एक कुंजी के अनुसार क्रमबद्ध होते हैं

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
