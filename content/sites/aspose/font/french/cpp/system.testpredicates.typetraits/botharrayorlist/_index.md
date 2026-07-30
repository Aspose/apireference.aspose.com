---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Font pour C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Vérifie si les deux arguments de type sont des tableaux ou des listes. Si c’est le cas, le membre value est défini sur true, sinon il est défini sur false en C++."
type: docs
weight: 300
url: /fr/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Vérifie si les deux arguments de type sont des tableaux ou des listes. Le cas échéant, le membre value est mis à true, sinon il est mis à false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Voir aussi

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
