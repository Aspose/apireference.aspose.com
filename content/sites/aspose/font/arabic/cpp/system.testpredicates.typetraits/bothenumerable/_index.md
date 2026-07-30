---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font لـ C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. يتحقق مما إذا كان كلا وسيطي النوع هما IEnumerable. إذا كان كذلك، يتم تعيين قيمة العضو إلى true، وإلا يتم تعيينها إلى false في C++."
type: docs
weight: 400
url: /ar/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


يتحقق مما إذا كان كلا معاملَي النوع من IEnumerable. إذا كان كذلك، يتم تعيين عضو القيمة إلى true، وإلا يتم تعيينه إلى false.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## انظر أيضًا

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
