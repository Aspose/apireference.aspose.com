---
title: "typedef System::TestPredicates::TypeTraits::BothArrayOrList"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page per C++"
description: "typedef System::TestPredicates::TypeTraits::BothArrayOrList. Verifica se entrambi gli argomenti di tipo sono array o liste. In tal caso, il membro value è impostato su true, altrimenti è impostato su false in C++."
type: docs
weight: 300
url: /it/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Verifica se entrambi gli argomenti di tipo sono array o liste. In tal caso, il membro valore è impostato su true, altrimenti è impostato su false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
