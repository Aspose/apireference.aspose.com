---
title: "طريقة System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::MakeScopeGuard. دالة مصنع تنشئ مثيلات من فئة ScopedGuard في C++."
type: docs
weight: 24700
url: /ar/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


دالة مصنع تنشئ مثيلات من فئة ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | الوصف |
| --- | --- |
| ال | نوع كائن الدالة الذي سيتم استدعاؤه بواسطة كائن ScopedGuard المُنشأ |

| Parameter | Type | الوصف |
| --- | --- | --- |
| f | F | كائن الدالة لتمريره إلى مُنشئ فئة ScopedGuard. |

### ReturnValue

مثيل جديد من فئة ScopedGuard

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
