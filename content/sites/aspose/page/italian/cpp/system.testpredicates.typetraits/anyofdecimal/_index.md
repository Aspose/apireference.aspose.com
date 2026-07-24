---
title: "typedef System::TestPredicates::TypeTraits::AnyOfDecimal"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Page per C++"
description: "typedef System::TestPredicates::TypeTraits::AnyOfDecimal. Verifica che almeno uno degli argomenti di tipo sia System::Decimal. In tal caso, imposta il membro value su true, altrimenti è false in C++."
type: docs
weight: 100
url: /it/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


Verifica che almeno uno degli argomenti di tipo sia [System::Decimal](../../system/decimal/). In tal caso, imposta il membro value su true, altrimenti è false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
