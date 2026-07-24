---
title: "طريقة System::DateTime::SpecifyKind"
linktitle: "SpecifyKind"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DateTime::SpecifyKind. تُنشئ كائناً جديداً من الفئة DateTime يمثل نفس عدد الـ ticks كما في كائن DateTime المحدد وتمثّل الوقت المحلي أو وقت UTC أو لا شيء حسب ما يُحدده الوسيط kind في C++."
type: docs
weight: 6800
url: /ar/cpp/system/datetime/specifykind/
---
## DateTime::SpecifyKind method


تنشئ كائناً جديداً من الفئة [DateTime](../) يمثل نفس عدد الـ ticks كما في كائن [DateTime](../) المحدد وتمثّل الوقت المحلي أو وقت UTC أو لا شيء حسب ما يُحدده الوسيط **kind**.

```cpp
static DateTime System::DateTime::SpecifyKind(DateTime value, DateTimeKind kind)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTime | كائن [DateTime](../) الذي سيُنسخ منه عدد الـ ticks |
| نوع | DateTimeKind | يحدد ما إذا كان الكائن الجديد يجب أن يمثل الوقت المحلي أو وقت UTC أو لا شيء. |

### ReturnValue

كائن جديد من الفئة [DateTime](../) يمثل نفس عدد الـ ticks كما في **value** و قيمة [DateTimeKind](../../datetimekind/) المحددة بواسطة **kind**.

## انظر أيضًا

* Class [DateTime](../)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
