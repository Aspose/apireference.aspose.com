---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Font لـ C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. يتحقق من أن T1 عدد حسابي و T2 عدد عائم، أو العكس. إذا كان الأمر كذلك، يتم تعيين عضو القيمة إلى true، وإلا يكون false في C++."
type: docs
weight: 200
url: /ar/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


يتحقق من أن **T1** عدد حسابي و**T2** عدد عائم، أو العكس. إذا كان كذلك، يتم تعيين عضو القيمة إلى true، وإلا يكون false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## انظر أيضًا

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
