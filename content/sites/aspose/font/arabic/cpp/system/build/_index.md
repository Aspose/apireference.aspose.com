---
title: "طريقة System::Build"
linktitle: "Build"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Build. أنشئ كائنًا بملكية مباشرة في C++."
type: docs
weight: 15100
url: /ar/cpp/system/build/
---
## System::Build method


أنشئ كائنًا بملكية مباشرة.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم إنشاؤه |
| المعاملات | أنواع الوسائط لإنشاء الكائن |

| معامل | نوع | الوصف |
| --- | --- | --- |
| args | Args\\&&... | الوسائط التي سيتم تمريرها إلى منشئ الكائن |

### ReturnValue

ObjectBuilder مكوَّن لإنشاء الكائن مباشرةً
## ملاحظات



[Object](../object/) construction must be finished with [Get()](../get/) call 

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
