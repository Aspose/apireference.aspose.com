---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font için C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. İki tip argümanının da IEnumerable olup olmadığını denetler. Eğer öyleyse, value üyesi true olarak ayarlanır, aksi takdirde C++'ta false olarak ayarlanır."
type: docs
weight: 400
url: /tr/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Her iki tip argümanının da IEnumerable olup olmadığını kontrol eder. Eğer öyleyse, value üyesi true olarak ayarlanır, aksi takdirde false olur.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## Ayrıca Bakınız

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
