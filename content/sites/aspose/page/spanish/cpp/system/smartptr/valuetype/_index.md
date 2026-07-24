---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page para C++"
description: "System::SmartPtr::ValueType typedef. Tipo de almacenamiento del arreglo apuntado. Solo tiene sentido si T es una especialización de System::Array en C++."
type: docs
weight: 4100
url: /es/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Tipo de almacenamiento del arreglo apuntado. Solo tiene sentido si T es una especialización de [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Ver también

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
