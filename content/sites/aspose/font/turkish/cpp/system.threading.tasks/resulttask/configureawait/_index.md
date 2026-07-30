---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait metodu"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait metodu. C++'ta bu sonuç görevi üzerindeki await'ların bağlam yakalama açısından nasıl davranması gerektiğini yapılandırır."
type: docs
weight: 300
url: /tr/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Bu sonuç görevi üzerindeki await'ların bağlam yakalama açısından nasıl davranması gerektiğini yapılandırır.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
