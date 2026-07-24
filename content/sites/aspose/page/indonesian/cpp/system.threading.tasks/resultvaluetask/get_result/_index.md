---
title: "System::Threading::Tasks::ResultValueTask::get_Result metode"
linktitle: "get_Result"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result metode. Mendapatkan hasil dari task yang selesai dalam C++."
type: docs
weight: 900
url: /id/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Mendapatkan hasil dari tugas yang selesai.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T Nilai hasil.
## Catatan



Jika task didukung oleh [ResultTask<T>](../../resulttask/), metode ini akan menunggu hasil dan menyimpannya dalam cache. Panggilan berikutnya akan mengembalikan nilai yang di-cache tanpa menunggu.

## Lihat Juga

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
