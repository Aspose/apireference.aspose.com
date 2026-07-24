---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page untuk C++"
description: "Enum System::Net::WebExceptionStatus. Mendaftarkan kode status kelas WebException dalam C++."
type: docs
weight: 4900
url: /id/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Mendaftarkan kode status kelas [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Success | 0 | Tidak ada kesalahan yang terjadi. |
| NameResolutionFailure | 1 | Layanan pemecah nama tidak dapat menyelesaikan nama host. |
| ConnectFailure | 2 | Titik layanan remote tidak dapat dihubungi pada tingkat transport. |
| ReceiveFailure | 3 | Respons lengkap tidak diterima dari server remote. |
| SendFailure | 4 | Permintaan lengkap tidak dapat dikirim ke server remote. |
| PipelineFailure | 5 | Permintaan tersebut adalah permintaan berpipeline dan koneksi ditutup sebelum respons diterima. |
| RequestCanceled | 6 | Permintaan dibatalkan atau terjadi kesalahan yang tidak dapat diklasifikasikan. |
| ProtocolError | 7 | Respons yang diterima dari server lengkap tetapi menunjukkan kesalahan pada tingkat protokol. |
| ConnectionClosed | 8 | Koneksi ditutup terlalu dini. |
| TrustFailure | 9 | Sertifikat server tidak dapat divalidasi. |
| SecureChannelFailure | 10 | Terjadi kesalahan saat membangun koneksi menggunakan SSL. |
| ServerProtocolViolation | 11 | Respons server bukan respons HTTP yang valid. |
| KeepAliveFailure | 12 | Koneksi untuk permintaan yang menyertakan header 'Keep-Alive' ditutup secara tak terduga. |
| Pending | 13 | Permintaan asinkron internal sedang menunggu. |
| Batas Waktu | 14 | Tidak ada respons yang diterima selama periode batas waktu untuk sebuah permintaan. |
| ProxyNameResolutionFailure | 15 | Layanan resolver nama tidak dapat menyelesaikan nama host proxy. |
| UnknownError | 16 | Terjadi pengecualian dengan tipe yang tidak diketahui. |
| MessageLengthLimitExceeded | 17 | Sebuah pesan yang melebihi batas yang ditentukan telah diterima. |
| CacheEntryNotFound | 18 | Entri cache yang ditentukan tidak ditemukan. |
| RequestProhibitedByCachePolicy | 19 | Permintaan tidak diizinkan oleh kebijakan cache. |
| RequestProhibitedByProxy | 20 | Permintaan ini tidak diizinkan oleh proxy. |

## Lihat Juga

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
