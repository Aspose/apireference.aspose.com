---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page pour C++"
description: "System::SmartPtr::ValueType typedef. Type de stockage du tableau pointé. Significatif uniquement si T est une spécialisation de System::Array en C++."
type: docs
weight: 4100
url: /fr/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Type de stockage du tableau pointé. Significatif uniquement si T est une spécialisation de [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Voir aussi

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
