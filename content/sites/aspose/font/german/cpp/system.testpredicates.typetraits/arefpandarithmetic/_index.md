---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Font für C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. Prüft, ob T1 arithmetisch und T2 Fließkomma ist, oder umgekehrt. Falls ja, wird das Member value auf true gesetzt, andernfalls ist es false in C++."
type: docs
weight: 200
url: /de/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Überprüft, ob **T1** arithmetisch und **T2** Fließkomma ist, oder umgekehrt. Wenn ja, wird das Member value auf true gesetzt, andernfalls ist es false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Siehe auch

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
