---
title: "System::InitObject method"
linktitle: "تهيئة الكائن"
second_title: "Aspose.Page لـ C++"
description: "System::InitObject method. يبدأ تهيئة كائن بملكية مشتركة في C++."
type: docs
weight: 21800
url: /ar/cpp/system/initobject/
---
## System::InitObject method


يبدأ تهيئة كائن بملكية مشتركة.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي سيتم تهيئته |

| Parameter | Type | الوصف |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) للتهيئة |

### ReturnValue

ObjectBuilder مُكوَّن لإنشاء مؤشر مشترك
## ملاحظات



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
