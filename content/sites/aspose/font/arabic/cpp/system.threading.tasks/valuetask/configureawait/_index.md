---
title: "طريقة System::Threading::Tasks::ValueTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::ValueTask::ConfigureAwait. تُكوّن مُنتظرًا (awaiter) لهذه المهمة في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


يضبط مُنتظر لهذه المهمة.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| continueOnCapturedContext | bool | true لمحاولة نقل الاستمرار مرة أخرى إلى السياق الأصلي المُلتقط؛ وإلا، false. |

### ReturnValue

ConfiguredValueTaskAwaitable كائن يُكوّن طريقة سلوك المُنتظرين (awaiters) لهذه المهمة.

## انظر أيضًا

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
