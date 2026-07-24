---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait طريقة"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait طريقة. يضبط مُنتظرًا لهذه المهمة في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


يضبط مُنتظرًا لهذه المهمة.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| continueOnCapturedContext | bool | صحيح لمحاولة نقل الاستمرار مرة أخرى إلى السياق الأصلي الملتقط؛ وإلا، خطأ. |

### ReturnValue

ConfiguredValueTaskAwaitable كائن يضبط كيفية تصرف المُنتظرين لهذه المهمة.

## انظر أيضًا

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
