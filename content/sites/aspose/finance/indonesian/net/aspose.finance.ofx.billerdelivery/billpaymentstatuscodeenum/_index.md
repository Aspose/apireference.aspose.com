---
title: Enum BillPaymentStatusCodeEnum
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillerDelivery.BillPaymentStatusCodeEnum enum. enum kode status pembayaran tagihan.
type: docs
weight: 1440
url: /id/net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
---
## BillPaymentStatusCodeEnum enumeration

enum kode status pembayaran tagihan.

```csharp
public enum BillPaymentStatusCodeEnum
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| PAIDOUTOFBAND | `0` | Pembayaran telah dilakukan untuk tagihan ini melalui mekanisme yang tidak melaporkan status melalui OFX. Status ini dimaksudkan untuk menunjukkan bahwa pelanggan telah membayar tagihan secara langsung dengan uang tunai atau cek atau telah melakukan pembayaran elektronik melalui mekanisme yang tidak melaporkan status pembayaran melalui OFX. |
| AUTOPAY | `1` | Penagih atau Penyedia Layanan akan melakukan pembayaran berdasarkan pra-otorisasi oleh pelanggan, biasanya berupa instruksi “baik sampai dibatalkan” tanpa tanggal akhir yang ditentukan. Di AS hal ini sering diterapkan menggunakan debit ACH pra-otorisasi berulang, meskipun beberapa Biller menawarkan pembayaran otomatis pra-otorisasi melalui kartu kredit. Contohnya termasuk potongan bulanan untuk membayar hipotek, pembayaran rutin dari rekening giro ke kartu kredit, dan Otomatis Layanan Pembayaran (APS) ditawarkan oleh banyak utilitas.Seperti NONE, ini mungkin status pembayaran awal tagihan. |
| CANCELLED | `2` | Pelanggan membatalkan pembayaran yang telah dijadwalkan sebelumnya. |
| UNPAYABLE | `3` | Tidak ada Instrumen Pembayaran yang diizinkan untuk tagihan ini yang didukung oleh Penyedia Pembayaran. Ini dimaksudkan untuk digunakan di mana tagihan membatasi pembayaran ke subkumpulan Instrumen Pembayaran yang diperbolehkan dalam entri Direktori Penagih. Hal ini dapat terjadi jika Penyedia Pembayaran atau Penagih mengubah jenis instrumen pembayaran yang didukung setelah pendaftaran dan aktivasi akun. |
| NONE | `4` | Tidak ada pembayaran yang dijadwalkan, juga tidak ada yang dilakukan terhadap tagihan ini. Ini mungkin status pembayaran awal tagihan. |
| SCHEDULED | `5` | Pembayaran telah dijadwalkan, tetapi belum diproses untuk tagihan ini. |
| PROCESSED | `6` | Pembayaran telah diproses untuk tagihan ini, dan tidak dapat dibatalkan lagi. |
| POSTED | `7` | Penagih telah memposting pembayaran terhadap tagihan ini. |

### Lihat juga

* ruang nama [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* perakitan [Aspose.Finance](../../)


