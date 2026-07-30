---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Font pour C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. Vérifie qu’au moins un des arguments de type est System::Decimal. Si c’est le cas, le membre value est mis à true, sinon il est false en C++."
type: docs
weight: 100
url: /fr/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


Vérifie qu’au moins un des arguments de type est [System::Decimal](../../system/decimal/). Si c’est le cas, le membre value est mis à true, sinon il est false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## Voir aussi

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
