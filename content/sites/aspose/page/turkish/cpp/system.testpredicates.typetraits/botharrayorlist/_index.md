---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page için C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. İki tip argümanının da dizi veya liste olup olmadığını denetler. Eğer öyleyse, değer üyesi true olarak ayarlanır, aksi takdirde C++'ta false olur."
type: docs
weight: 300
url: /tr/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Her iki tür argümanının da dizi veya liste olup olmadığını kontrol eder. Eğer öyleyse, değer üyesi true olarak ayarlanır, aksi takdirde false olur.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Ayrıca Bakınız

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
