---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Font لـ C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. يتحقق مما إذا كان كلا معاملَي النوع مصفوفات أو قوائم. إذا كان الأمر كذلك، يتم تعيين عضو القيمة إلى true، وإلا يكون false في C++."
type: docs
weight: 300
url: /ar/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


يتحقق مما إذا كان كلا معاملَي النوع مصفوفات أو قوائم. إذا كان كذلك، يتم تعيين عضو القيمة إلى true، وإلا يتم تعيينه إلى false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## انظر أيضًا

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
