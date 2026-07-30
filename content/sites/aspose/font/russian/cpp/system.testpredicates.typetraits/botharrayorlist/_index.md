---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Font для C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Проверяет, являются ли оба аргумента типа массивами или списками. Если да, член value устанавливается в true, иначе — в false в C++."
type: docs
weight: 300
url: /ru/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Проверяет, являются ли оба типовых аргумента массивами или списками. Если да, член value устанавливается в true, иначе — false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## См. также

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
