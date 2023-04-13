---
title: Class PaymentMailSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillPay.PaymentMailSyncResponse kelas. Kelas respons sinkronisasi surat pembayaran.
type: docs
weight: 1150
url: /id/net/aspose.finance.ofx.billpay/paymentmailsyncresponse/
---
## PaymentMailSyncResponse class

Kelas respons sinkronisasi surat pembayaran.

```csharp
public class PaymentMailSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PaymentMailSyncResponse](paymentmailsyncresponse/)() | Menginisialisasi instance baru dari`PaymentMailSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentmailsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PaymentMailTransactionResponses](../../aspose.finance.ofx.billpay/paymentmailsyncresponse/paymentmailtransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`PaymentMailTransactionResponse`](../paymentmailtransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* perakitan [Aspose.Finance](../../)


