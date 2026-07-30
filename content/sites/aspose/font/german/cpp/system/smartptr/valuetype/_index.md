---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Font für C++"
description: "System::SmartPtr::ValueType typedef. Speichertyp des referenzierten Arrays. Nur sinnvoll, wenn T eine Spezialisierung von System::Array in C++ ist."
type: docs
weight: 4100
url: /de/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Speichertyp des referenzierten Arrays. Nur sinnvoll, wenn T eine Spezialisierung von [System::Array](../../array/) ist.

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Siehe auch

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
