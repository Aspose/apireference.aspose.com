---
title: "طريقة System::DateTime::SpecifyKind"
linktitle: "SpecifyKind"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::DateTime::SpecifyKind. تُنشئ كائن DateTime جديد يمثل نفس عدد الـ ticks كما في كائن DateTime المحدد وتمثل الوقت المحلي أو توقيت UTC أو لا شيء حسب ما يُحدده الوسيط kind في C++."
type: docs
weight: 6800
url: /ar/cpp/system/datetime/specifykind/
---
## DateTime::SpecifyKind method


ينشئ كائنًا جديدًا من نوع [DateTime](../) يمثل نفس عدد الـ ticks كما في كائن [DateTime](../) المحدد ويمثل الوقت المحلي أو توقيت UTC أو لا شيء حسب ما يُحدده الوسيط **kind**.

```cpp
static DateTime System::DateTime::SpecifyKind(DateTime value, DateTimeKind kind)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | DateTime | كائن [DateTime](../) لنسخ عدد الـ ticks منه |
| النوع | DateTimeKind | يحدد ما إذا كان الكائن الجديد يجب أن يمثل الوقت المحلي أو توقيت UTC أو لا شيء. |

### ReturnValue

كائن [DateTime](../) جديد يمثل نفس عدد الـ ticks كما في **value** وقيمة [DateTimeKind](../../datetimekind/) المحددة بواسطة **kind**.

## انظر أيضًا

* Class [DateTime](../)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
