---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Font için C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. T1'in aritmetik ve T2'nin kayan nokta olduğunu, ya da tersini kontrol eder. Eğer öyleyse, value üyesini true olarak ayarlar, aksi takdirde C++'ta false olur."
type: docs
weight: 200
url: /tr/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


**T1**'in aritmetik ve **T2**'nin kayan nokta olduğunu, ya da tersini kontrol eder. Eğer öyleyse, value üyesini true olarak ayarlar, aksi takdirde false olur.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Ayrıca Bakınız

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
