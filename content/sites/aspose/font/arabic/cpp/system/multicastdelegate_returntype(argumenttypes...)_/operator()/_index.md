---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() طريقة"
linktitle: "operator()"
second_title: "Aspose.Font لـ C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() طريقة. يستدعي جميع المفوضين الموجودين حاليًا في مجموعة المفوضين. يتم استدعاء المفوضين بنفس الترتيب الذي أضيفوا به إلى المجموعة. العملية تحجب التنفيذ بينما يتم تنفيذ المفوضين في C++."
type: docs
weight: 1500
url: /ar/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


ينفذ جميع المفوضين الموجودين حاليًا في مجموعة المفوضين. يتم تنفيذ المفوضين بنفس الترتيب الذي أضيفوا به إلى المجموعة. يمنع المشغل التنفيذ أثناء تنفيذ المفوضين.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| args | ArgumentTypes... | الوسائط لتمريرها إلى المفوضين الذين سيتم استدعاؤهم |

### ReturnValue

قيمة الإرجاع للمفوض الأخير المستدعى

## انظر أيضًا

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
