---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::SocketFlags enum. Menyediakan nilai konstan untuk pesan socket dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Menyediakan nilai konstan untuk pesan socket.

```cpp
enum class SocketFlags
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Tidak ada flag yang digunakan untuk panggilan ini. |
| OutOfBand | 1 | Data out-of-band sedang diproses. |
| Peek | 2 | Intip pesan yang masuk. |
| JanganRute | 4 | Kirim pesan tanpa menggunakan tabel routing. |
| Truncated | 256 | Pesan terlalu besar untuk muat ke dalam buffer yang ditentukan. Pesan tersebut telah dipotong. |
| ControlDataTruncated | 512 | Data kontrol lebih besar dari 64 KB dan tidak muat ke dalam buffer internal. Data tersebut telah dipotong. |
| Siaran | 1024 | Paket siaran. |
| Multicast | 2048 | Paket multicast. |
| Partial | 32768 | Pesan yang dikirim atau diterima secara parsial. |

## Lihat Juga

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
