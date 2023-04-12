---
title: Class PaymentSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillPay.PaymentSyncResponse kelas. Kelas respons sinkronisasi pembayaran.
type: docs
weight: 1250
url: /id/net/aspose.finance.ofx.billpay/paymentsyncresponse/
---
## PaymentSyncResponse class

Kelas respons sinkronisasi pembayaran.

```csharp
public class PaymentSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PaymentSyncResponse](paymentsyncresponse/)() | Menginisialisasi instance baru dari`PaymentSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/paymentsyncresponse/bankaccountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PaymentTransactionResponses](../../aspose.finance.ofx.billpay/paymentsyncresponse/paymenttransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`PaymentTransactionResponse`](../paymenttransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* perakitan [Aspose.Finance](../../)


