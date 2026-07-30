---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Font pour C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. Vérifie que T1 est arithmétique et que T2 est à virgule flottante, ou inversement. Si c’est le cas, le membre value est mis à true, sinon il est false en C++."
type: docs
weight: 200
url: /fr/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Vérifie que **T1** est arithmétique et que **T2** est à virgule flottante, ou inversement. Le cas échéant, le membre value est mis à true, sinon il est false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Voir aussi

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
