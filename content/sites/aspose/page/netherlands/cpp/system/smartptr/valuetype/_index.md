---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtr::ValueType typedef. Opslagtype van de gepointeerde array. Alleen zinvol als T een specialisatie is van System::Array in C++."
type: docs
weight: 4100
url: /nl/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Opslagtype van de gepointeerde array. Alleen zinvol als T een specialisatie is van [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Zie ook

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
