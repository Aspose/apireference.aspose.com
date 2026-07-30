---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Font لـ C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. يتحقق من أن أحد معاملات النوع على الأقل هو System::Decimal. إذا كان الأمر كذلك، يتم تعيين عضو القيمة إلى true، وإلا يكون false في C++."
type: docs
weight: 100
url: /ar/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


يتحقق من أن أحد معاملات النوع على الأقل هو [System::Decimal](../../system/decimal/). إذا كان الأمر كذلك، يتم تعيين عضو القيمة إلى true، وإلا يكون false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## انظر أيضًا

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
