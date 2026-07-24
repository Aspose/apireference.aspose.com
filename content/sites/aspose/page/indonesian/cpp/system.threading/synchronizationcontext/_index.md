---
title: "System::Threading::SynchronizationContext class"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::SynchronizationContext class. Menyediakan fungsionalitas dasar untuk menyebarkan konteks sinkronisasi di seluruh berbagai operasi sinkronisasi dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Menyediakan fungsi dasar untuk menyebarkan konteks sinkronisasi di berbagai operasi sinkronisasi.

```cpp
class SynchronizationContext : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [get_Current](./get_current/)() | Mendapatkan konteks sinkronisasi untuk thread saat ini. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Menetapkan konteks sinkronisasi untuk thread saat ini. |
| [SynchronizationContext](./synchronizationcontext/)() | Informasi RTTI. |
## Catatan


Kelas ini memungkinkan penyebaran konteks sinkronisasi antar thread dan digunakan untuk mengatur callback atau pemanggilan ke thread atau konteks sinkronisasi yang tepat.
Implementasi tiruan.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
