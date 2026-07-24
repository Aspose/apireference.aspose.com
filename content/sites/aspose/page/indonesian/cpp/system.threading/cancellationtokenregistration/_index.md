---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::CancellationTokenRegistration class. Mewakili pendaftaran untuk callback token pembatalan di C++."
type: docs
weight: 300
url: /id/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Mewakili pendaftaran untuk callback token pembatalan.

```cpp
class CancellationTokenRegistration
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() | Membuang pendaftaran dan menghapus callback dari [CancellationTokenSource](../cancellationtokensource/) yang terkait. Setelah memanggil metode ini, callback yang terdaftar tidak akan lagi dipanggil ketika [CancellationTokenSource](../cancellationtokensource/) yang terkait dibatalkan. |
## Catatan


Kelas ini memungkinkan deregistrasi callback dari token pembatalan. Saat dibuang, ia menghapus callback dari [CancellationTokenSource](../cancellationtokensource/) yang terkait.
Kelas ini tidak boleh dibuat secara langsung - ia dikembalikan oleh metode pendaftaran [CancellationToken](../cancellationtoken/).

## Lihat Juga

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
