---
title: "طريقة System::Threading::Tasks::ResultTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Tasks::ResultTask::ConfigureAwait. تُكوّن كيفية تصرف عمليات الانتظار على مهمة النتيجة هذه فيما يتعلق بالتقاط السياق في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


يضبط كيفية تصرف عمليات الانتظار على مهمة النتيجة هذه فيما يتعلق بالتقاط السياق.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| continueOnCapturedContext | bool | ما إذا كان يجب المتابعة على السياق الملتقط |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## ملاحظات



هذا يُتيح تحكمًا دقيقًا في تدفق السياق لأنماط async/await

## انظر أيضًا

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
