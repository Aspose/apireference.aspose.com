---
title: Class RecurringPaymentSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.BillPay.RecurringPaymentSyncResponse kelas. Kelas respons sinkronisasi pembayaran berulang.
type: docs
weight: 1350
url: /id/net/aspose.finance.ofx.billpay/recurringpaymentsyncresponse/
---
## RecurringPaymentSyncResponse class

Kelas respons sinkronisasi pembayaran berulang.

```csharp
public class RecurringPaymentSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [RecurringPaymentSyncResponse](recurringpaymentsyncresponse/)() | Menginisialisasi instance baru dari`RecurringPaymentSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/bankaccountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringPaymentTransactionResponses](../../aspose.finance.ofx.billpay/recurringpaymentsyncresponse/recurringpaymenttransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`RecurringPaymentTransactionResponse`](../recurringpaymenttransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* perakitan [Aspose.Finance](../../)


