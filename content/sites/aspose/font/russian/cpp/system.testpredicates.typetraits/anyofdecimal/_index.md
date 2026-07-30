---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Font для C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. Проверяет, что хотя бы один из аргументов типа является System::Decimal. Если да, член value устанавливается в true, иначе — в false в C++."
type: docs
weight: 100
url: /ru/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


Проверяет, что хотя бы один из аргументов типа является [System::Decimal](../../system/decimal/). Если да, член value устанавливается в true, иначе — в false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## См. также

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
