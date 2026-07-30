---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Font per C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Verifica se entrambi gli argomenti di tipo sono array o liste. In tal caso, il membro value è impostato a true, altrimenti è impostato a false in C++."
type: docs
weight: 300
url: /it/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Verifica se entrambi gli argomenti di tipo sono array o liste. In tal caso, il membro value è impostato su true, altrimenti è impostato su false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
