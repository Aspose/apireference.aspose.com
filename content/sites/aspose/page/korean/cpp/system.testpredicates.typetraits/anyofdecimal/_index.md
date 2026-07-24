---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "C++용 Aspose.Page"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. 타입 인수 중 최소 하나가 System::Decimal인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 C++에서 false로 설정합니다."
type: docs
weight: 100
url: /ko/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


타입 인수 중 최소 하나가 [System::Decimal](../../system/decimal/)인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 false로 설정합니다.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## 또 보기

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
