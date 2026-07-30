---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Font per C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. Verifica che almeno uno degli argomenti di tipo sia System::Decimal. In tal caso, imposta il membro value a true, altrimenti è false in C++."
type: docs
weight: 100
url: /it/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


Verifica che almeno uno degli argomenti di tipo sia [System::Decimal](../../system/decimal/). In tal caso, imposta il membro value a true, altrimenti è false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
