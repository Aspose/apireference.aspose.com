---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page для C++"
description: "System::SmartPtr::ValueType typedef. Тип хранения указательного массива. Имеет смысл только если T является специализацией System::Array в C++."
type: docs
weight: 4100
url: /ru/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Тип хранения указательного массива. Имеет смысл только если T является специализацией [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## См. также

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
