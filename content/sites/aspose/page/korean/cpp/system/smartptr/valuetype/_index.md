---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::ValueType typedef. 가리키는 배열의 저장 타입입니다. T가 C++에서 System::Array의 특수화인 경우에만 의미가 있습니다."
type: docs
weight: 4100
url: /ko/cpp/system/smartptr/valuetype/
---
## ValueType typedef


가리키는 배열의 저장 타입입니다. T가 [System::Array](../../array/)의 특수화인 경우에만 의미가 있습니다.

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## 또 보기

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
