---
title: "typedef System::TestPredicates::TypeTraits::AreFPandArithmetic"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Page per C++"
description: "typedef System::TestPredicates::TypeTraits::AreFPandArithmetic. Verifica che T1 sia aritmetico e T2 sia a virgola mobile, o viceversa. In tal caso, imposta il membro value su true, altrimenti è false in C++."
type: docs
weight: 200
url: /it/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Verifica che **T1** sia aritmetico e **T2** sia a virgola mobile, o viceversa. In tal caso, imposta il membro valore su true, altrimenti è false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Vedi anche

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
