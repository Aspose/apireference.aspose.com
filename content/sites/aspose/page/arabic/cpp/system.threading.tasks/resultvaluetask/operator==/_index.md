---
title: "طريقة System::Threading::Tasks::ResultValueTask::operator=="
linktitle: "operator=="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Tasks::ResultValueTask::operator==. عامل المساواة لـ ResultValueTask في C++."
type: docs
weight: 1200
url: /ar/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


عامل المساواة لـ [ResultValueTask](../).

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const ResultValueTask\& | الآخر [ResultValueTask](../) للمقارنة مع هذه الحالة. |

### ReturnValue

bool صحيح إذا كانت كلتا المهمتين لها نفس قيمة النتيجة أو تشير إلى نفس المهمة الأساسية؛ وإلا، خطأ.
## ملاحظات



إذا كان أي من المثيلين يحتوي على قيمة نتيجة مباشرة، يقارن النتائج مباشرة. وإلا، يقارن مؤشرات المهمة الأساسية.
## انظر أيضًا

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
