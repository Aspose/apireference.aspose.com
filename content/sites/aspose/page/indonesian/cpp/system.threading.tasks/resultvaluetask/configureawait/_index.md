---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait metode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait metode. Mengonfigurasi awaiter untuk task ini dalam C++."
type: docs
weight: 300
url: /id/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Mengonfigurasi awaiter untuk tugas ini.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| continueOnCapturedContext | bool | true untuk mencoba memindahkan kelanjutan kembali ke konteks asli yang ditangkap; jika tidak, false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Sebuah objek yang mengonfigurasi cara awaiter berperilaku untuk task ini.

## Lihat Juga

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
