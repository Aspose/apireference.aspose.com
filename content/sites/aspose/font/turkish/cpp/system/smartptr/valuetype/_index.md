---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Font için C++"
description: "System::SmartPtr::ValueType typedef. İşaret edilen dizinin depolama tipi. Yalnızca T, C++'ta System::Array'nin bir özelleştirmesi ise anlamlıdır."
type: docs
weight: 4100
url: /tr/cpp/system/smartptr/valuetype/
---
## ValueType typedef


İşaret edilen dizinin depolama tipi. Yalnızca T, [System::Array](../../array/) öğesinin bir özelleştirmesi ise anlamlıdır.

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
