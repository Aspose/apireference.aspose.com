---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Font per C++"
description: "System::SmartPtr::ValueType typedef. Tipo di memorizzazione dell'array puntato. Ha senso solo se T è una specializzazione di System::Array in C++."
type: docs
weight: 4100
url: /it/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Tipo di memorizzazione dell'array puntato. Ha senso solo se T è una specializzazione di [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Vedi anche

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
