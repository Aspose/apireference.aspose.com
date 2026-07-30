---
title: "System::BuildObject method"
linktitle: "BuildObject"
second_title: "Aspose.Font لـ C++"
description: "System::BuildObject method. أنشئ كائنًا بملكية مشتركة في C++."
type: docs
weight: 15300
url: /ar/cpp/system/buildobject/
---
## System::BuildObject method


أنشئ كائنًا بملكية مشتركة.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم إنشاؤه |
| المعاملات | أنواع الوسائط لإنشاء الكائن |

| معامل | نوع | الوصف |
| --- | --- | --- |
| args | Args\\&&... | الوسائط التي سيتم تمريرها إلى منشئ الكائن |

### ReturnValue

ObjectBuilder مُكوَّن لإنشاء مؤشرات مشتركة
## ملاحظات



ينشئ [SharedPtr<T>](../sharedptr/) ويعيد مُنشئًا له
[Object](../object/) construction must be finished with [Get()](../get/) call 

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
