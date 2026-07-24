---
title: "System::TestPredicates::TypeTraits::IsList typedef"
linktitle: "IsList"
second_title: "C++용 Aspose.Page"
description: "System::TestPredicates::TypeTraits::IsList typedef. 타입이 System::Collections::Generic::List 특수화인지 확인합니다. 그렇다면 value 멤버가 true로 설정되고, 그렇지 않으면 C++에서 false로 설정됩니다."
type: docs
weight: 600
url: /ko/cpp/system.testpredicates.typetraits/islist/
---
## IsList typedef


타입이 [System::Collections::Generic::List](../../system.collections.generic/list/) 특수화인지 확인합니다. 그렇다면 value 멤버가 true로 설정되고, 그렇지 않으면 false로 설정됩니다.

```cpp
using System::TestPredicates::TypeTraits::IsList =  std::is_same<T, System::Collections::Generic::List<typename T::ValueType>>
```


## 또 보기

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
