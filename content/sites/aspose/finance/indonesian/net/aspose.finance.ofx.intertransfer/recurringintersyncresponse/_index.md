---
title: Class RecurringInterSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.InterTransfer.RecurringInterSyncResponse kelas. Kelas respons sinkronisasi transaksi antar bank berulang.
type: docs
weight: 2570
url: /id/net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
---
## RecurringInterSyncResponse class

Kelas respons sinkronisasi transaksi antar bank berulang.

```csharp
public class RecurringInterSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [RecurringInterSyncResponse](recurringintersyncresponse/)() | Menginisialisasi instance baru dari`RecurringInterSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/accountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) atau[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) atau[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringInterTransactionResponses](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurringintertransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`RecurringInterTransactionResponse`](../recurringintertransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* perakitan [Aspose.Finance](../../)


