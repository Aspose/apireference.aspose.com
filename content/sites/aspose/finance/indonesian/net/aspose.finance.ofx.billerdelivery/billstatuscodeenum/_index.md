---
title: Enum BillStatusCodeEnum
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillerDelivery.BillStatusCodeEnum enum. Enum kode status tagihan.
type: docs
weight: 1470
url: /id/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

Enum kode status tagihan.

```csharp
public enum BillStatusCodeEnum
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| WITHDRAWN | `0` | Penagih atau penerbit tidak lagi ingin tagihan ini ditampilkan. |
| UNDELIVERABLE | `1` | Upaya untuk mengirimkan tagihan ini kepada konsumen secara tepat waktu telah gagal. Status ini biasanya tidak digunakan saat menunjukkan tagihan kepada konsumen. Namun, notifikasi yang menggunakan status ini mencakup banyak kasus berguna. |
| NEW | `2` | Server belum mengirim tagihan ke klien atau proxy klien. Ini adalah kode status awal tagihan. |
| DELIVERED | `3` | Server telah mengirim tagihan ke klien atau proxy klien. |
| VIEWED | `4` | Pelanggan telah melihat tagihan. Menyiratkan status sebelumnya DELIVERED. |
| RETIRED | `5` | Pelanggan tidak lagi ingin melihat tagihan ini. Menyiratkan status sebelumnya DELIVERED. |

### Lihat juga

* ruang nama [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* perakitan [Aspose.Finance](../../)


