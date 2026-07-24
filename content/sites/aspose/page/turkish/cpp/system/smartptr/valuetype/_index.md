---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page için C++"
description: "System::SmartPtr::ValueType typedef. İşaret edilen dizinin depolama türü. Yalnızca T, C++'da System::Array'nin bir özelleştirmesi ise anlamlıdır."
type: docs
weight: 4100
url: /tr/cpp/system/smartptr/valuetype/
---
## ValueType typedef


İşaret edilen dizinin depolama türü. Yalnızca T, [System::Array](../../array/)nin bir özelleştirmesi ise anlamlıdır.

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
