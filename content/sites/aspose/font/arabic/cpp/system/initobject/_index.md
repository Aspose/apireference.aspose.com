---
title: "الطريقة System::InitObject"
linktitle: "تهيئة الكائن"
second_title: "Aspose.Font لـ C++"
description: "الطريقة System::InitObject. تبدأ تهيئة كائن بملكية مشتركة في C++."
type: docs
weight: 21900
url: /ar/cpp/system/initobject/
---
## System::InitObject method


تبدأ تهيئة كائن بملكية مشتركة.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم تهيئته |

| معامل | نوع | الوصف |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) للتهيئة |

### ReturnValue

ObjectBuilder مُكوَّن لإنشاء مؤشرات مشتركة
## ملاحظات



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
