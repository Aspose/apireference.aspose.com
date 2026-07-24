---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page για C++"
description: "System::SmartPtr::ValueType typedef. Τύπος αποθήκευσης του δείκτη σε πίνακα. Έχει νόημα μόνο εάν το T είναι εξειδίκευση του System::Array σε C++."
type: docs
weight: 4100
url: /el/cpp/system/smartptr/valuetype/
---
## ValueType typedef


Τύπος αποθήκευσης του δείκτη σε πίνακα. Έχει νόημα μόνο εάν το T είναι εξειδίκευση του [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## Δείτε επίσης

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
