---
title: "System::Threading::CancellationTokenSource kelas"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::CancellationTokenSource kelas. Sebuah sumber token pembatalan yang dapat digunakan untuk memicu notifikasi pembatalan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Sumber token pembatalan yang dapat digunakan untuk memicu notifikasi pembatalan.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Cancel](./cancel/)() | Menyampaikan permintaan pembatalan. |
| [CancellationTokenSource](./cancellationtokensource/)() | Membuat [CancellationTokenSource](./) baru. |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Membuat sumber token tertaut yang dibatalkan ketika salah satu token yang diberikan dibatalkan. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Mendapatkan apakah pembatalan telah diminta. |
| [get_Token](./get_token/)() const | Mendapatkan token pembatalan yang terkait dengan sumber ini. |
## Catatan


Menyediakan mekanisme untuk membuat dan mengendalikan token pembatalan untuk pembatalan operasi secara kooperatif.
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
