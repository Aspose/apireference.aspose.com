---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Page voor C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. Controleert of T1 rekenkundig is en T2 een floating‑point, of omgekeerd. Indien ja, wordt het waarde‑lid op true gezet, anders is het false in C++."
type: docs
weight: 200
url: /nl/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Controleert of **T1** rekenkundig is en **T2** een zwevend‑kommagetal, of omgekeerd. Indien ja, wordt het waarde‑lid op true gezet, anders is het false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Zie ook

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
