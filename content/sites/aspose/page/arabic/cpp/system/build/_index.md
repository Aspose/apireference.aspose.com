---
title: "دالة System::Build"
linktitle: "Build"
second_title: "Aspose.Page لـ C++"
description: "دالة System::Build. تُنشئ كائنًا بملكية مباشرة في C++."
type: docs
weight: 15000
url: /ar/cpp/system/build/
---
## System::Build method


أنشئ كائنًا بملكية مباشرة.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم بناؤه |
| المعلمات | أنواع الوسائط لإنشاء الكائن |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | Args\&&... | الوسائط التي سيتم تمريرها إلى مُنشئ الكائن |

### ReturnValue

ObjectBuilder مُكوَّن لإنشاء الكائن مباشرةً
## ملاحظات



[Object](../object/) construction must be finished with [Get()](../get/) call 

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
