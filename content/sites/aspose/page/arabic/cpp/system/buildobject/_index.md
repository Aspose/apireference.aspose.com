---
title: "System::BuildObject method"
linktitle: "BuildObject"
second_title: "Aspose.Page لـ C++"
description: "System::BuildObject method. أنشئ كائنًا بملكية مشتركة في C++."
type: docs
weight: 15200
url: /ar/cpp/system/buildobject/
---
## System::BuildObject method


أنشئ كائنًا بملكية مشتركة.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم بناؤه |
| المعلمات | أنواع الوسائط لإنشاء الكائن |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | Args\&&... | الوسائط التي سيتم تمريرها إلى مُنشئ الكائن |

### ReturnValue

ObjectBuilder مُكوَّن لإنشاء مؤشر مشترك
## ملاحظات



ينشئ [SharedPtr<T>](../sharedptr/) ويعيد مُنشئًا له
[Object](../object/) construction must be finished with [Get()](../get/) call 

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
