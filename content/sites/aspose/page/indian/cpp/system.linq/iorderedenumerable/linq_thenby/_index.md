---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy मेथड"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Linq::IOrderedEnumerable क्लास के LINQ_ThenBy मेथड का उपयोग कैसे करें।"
type: docs
weight: 300
url: /hi/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


एक कुंजी के अनुसार अनुक्रम में तत्वों को आरोही क्रम में आगे क्रमबद्ध करता है।

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| पैरामीटर | विवरण |
| --- | --- |
| कुंजी | keySelector द्वारा लौटाए गए कुंजी का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | प्रत्येक तत्व से कुंजी निकालने के लिए एक फ़ंक्शन। |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
