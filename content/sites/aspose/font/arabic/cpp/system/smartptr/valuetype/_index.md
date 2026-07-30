---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Font لـ C++"
description: "System::SmartPtr::ValueType typedef. نوع التخزين للمصفوفة المشار إليها. لا يكون ذا معنى إلا إذا كان T تخصصًا لـ System::Array في C++."
type: docs
weight: 4100
url: /ar/cpp/system/smartptr/valuetype/
---
## ValueType typedef


نوع التخزين للمصفوفة المشار إليها. لا يكون ذا معنى إلا إذا كان T تخصصًا لـ [System::Array](../../array/).

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## انظر أيضًا

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
