---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait yöntemi"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait yöntemi. Bu sonuç görevinde beklemelerin bağlam yakalama açısından nasıl davranması gerektiğini C++'ta yapılandırır."
type: docs
weight: 200
url: /tr/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Bu sonuç görevi üzerindeki await'ların bağlam yakalama ile ilgili nasıl davranacağını yapılandırır.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| continueOnCapturedContext | bool | Yakalanan bağlamda devam edip edilmeyeceği |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Açıklamalar



Bu, async/await desenleri için bağlam akışı üzerinde ayrıntılı kontrol sağlar

## Ayrıca Bakınız

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
