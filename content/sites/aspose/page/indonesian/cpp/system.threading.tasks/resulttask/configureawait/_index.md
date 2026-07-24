---
title: "Metode System::Threading::Tasks::ResultTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Threading::Tasks::ResultTask::ConfigureAwait. Mengonfigurasi bagaimana await pada tugas hasil ini harus berperilaku terkait penangkapan konteks di C++."
type: docs
weight: 200
url: /id/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Mengonfigurasi bagaimana await pada task hasil ini harus berperilaku terkait penangkapan konteks.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| continueOnCapturedContext | bool | Apakah melanjutkan pada konteks yang ditangkap |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Catatan



Ini memungkinkan kontrol yang halus atas aliran konteks untuk pola async/await

## Lihat Juga

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
