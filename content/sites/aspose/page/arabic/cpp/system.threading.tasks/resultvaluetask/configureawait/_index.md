---
title: "طريقة System::Threading::Tasks::ResultValueTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Tasks::ResultValueTask::ConfigureAwait. يضبط مُنتظرًا لهذه المهمة في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


يضبط مُنتظرًا لهذه المهمة.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| continueOnCapturedContext | bool | صحيح لمحاولة نقل الاستمرار مرة أخرى إلى السياق الأصلي الملتقط؛ وإلا، خطأ. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> كائن يضبط سلوك المُنتظرين لهذه المهمة.

## انظر أيضًا

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
