---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font pour C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. Vérifie si les deux arguments de type sont IEnumerable. Le cas échéant, le membre value est défini sur true, sinon il est défini sur false en C++."
type: docs
weight: 400
url: /fr/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Vérifie si les deux arguments de type sont IEnumerable. Le cas échéant, le membre value est mis à true, sinon il est mis à false.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## Voir aussi

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
