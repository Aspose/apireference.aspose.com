---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::CancellationToken class. Menyebarkan notifikasi bahwa operasi harus dibatalkan. Kelas ini menyediakan mekanisme pembatalan kooperatif antar thread, memungkinkan satu thread memberi tahu thread lain bahwa operasi harus dibatalkan dalam C++."
type: docs
weight: 200
url: /id/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Menyebarkan notifikasi bahwa operasi harus dibatalkan. Kelas ini menyediakan mekanisme pembatalan kooperatif antar thread, memungkinkan satu thread memberi tahu thread lain bahwa sebuah operasi harus dibatalkan.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Konstruktor default. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Mendapatkan apakah token ini dapat berada dalam keadaan dibatalkan. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Mendapatkan apakah pembatalan telah diminta untuk token ini. |
| static [get_None](./get_none/)() | Mengembalikan nilai [System::Threading::CancellationToken](./) yang kosong. |
| [Register](./register/)(const Action<>\&) const | Mendaftarkan callback yang akan dipanggil ketika pembatalan diminta. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Melempar OperationCanceledException jika pembatalan telah diminta. |
## Catatan



Sebuah [CancellationToken](./) hanya dapat dibatalkan melalui [CancellationTokenSource](../cancellationtokensource/) yang terkait.

## Lihat Juga

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
