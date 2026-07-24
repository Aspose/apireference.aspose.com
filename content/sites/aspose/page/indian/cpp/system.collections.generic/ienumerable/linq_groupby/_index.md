---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy method"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास के LINQ_GroupBy method का उपयोग कैसे करें।"
type: docs
weight: 1700
url: /hi/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


अनुक्रम के तत्वों को समूहित करता है।

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| पैरामीटर | विवरण |
| --- | --- |
| कुंजी | keyPredicate द्वारा लौटाए गए कुंजी का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| keyPredicate | System::Func\\<T, Key\\> | प्रत्येक तत्व के लिए कुंजी निकालने का एक फ़ंक्शन। |

### ReturnValue

एक [IEnumerable](../) जो वस्तुओं की क्रम और एक कुंजी सम्मिलित करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
