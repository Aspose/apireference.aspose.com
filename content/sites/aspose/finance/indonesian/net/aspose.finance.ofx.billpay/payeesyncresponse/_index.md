---
title: Class PayeeSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillPay.PayeeSyncResponse kelas. Kelas respons sinkronisasi daftar penerima pembayaran.
type: docs
weight: 1020
url: /id/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

Kelas respons sinkronisasi daftar penerima pembayaran.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse/)() | Menginisialisasi instance baru dari`PayeeSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`PayeeTransactionResponse`](../payeetransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* perakitan [Aspose.Finance](../../)


