---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font per C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. Verifica se entrambi gli argomenti di tipo sono IEnumerable. In tal caso, il membro value è impostato su true, altrimenti è impostato su false in C++."
type: docs
weight: 400
url: /it/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Verifica se entrambi gli argomenti di tipo sono IEnumerable. In tal caso, il membro value è impostato su true, altrimenti è impostato su false.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
