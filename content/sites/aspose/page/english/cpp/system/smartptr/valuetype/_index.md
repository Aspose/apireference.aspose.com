---
title: System::SmartPtr::ValueType typedef
linktitle: ValueType
second_title: Aspose.Page for C++
description: 'System::SmartPtr::ValueType typedef. Storage type of pointed array. Only meaningful if T is a specialization of System::Array in C++.'
type: docs
weight: 4100
url: /cpp/system/smartptr/valuetype/
---
## ValueType typedef


Storage type of pointed array. Only meaningful if T is a specialization of [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## See Also

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
