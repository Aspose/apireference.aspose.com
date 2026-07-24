---
title: "System::Threading::CancellationToken::Register metode"
linktitle: "Register"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::CancellationToken::Register metode. Mendaftarkan callback yang akan dipanggil ketika pembatalan diminta dalam C++."
type: docs
weight: 400
url: /id/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Mendaftarkan callback yang akan dipanggil ketika pembatalan diminta.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | const Action<>\& | [Action<>](../../../system/action/) untuk dijalankan ketika pembatalan diminta. |

### ReturnValue

Sebuah objek [CancellationTokenRegistration](../../cancellationtokenregistration/) yang dapat digunakan untuk membatalkan pendaftaran callback.
## Catatan



Jika pembatalan sudah diminta, callback akan dipanggil segera.

## Lihat Juga

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
