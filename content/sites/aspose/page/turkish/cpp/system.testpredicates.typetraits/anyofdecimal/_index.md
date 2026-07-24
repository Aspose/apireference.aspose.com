---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Page için C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. En az bir tip argümanının System::Decimal olup olmadığını denetler. Eğer öyleyse, değer üyesi true olarak ayarlanır, aksi takdirde C++'ta false olur."
type: docs
weight: 100
url: /tr/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


En az bir tip argümanının [System::Decimal](../../system/decimal/) olup olmadığını denetler. Eğer öyleyse, değer üyesi true olarak ayarlanır, aksi takdirde false olur.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## Ayrıca Bakınız

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
