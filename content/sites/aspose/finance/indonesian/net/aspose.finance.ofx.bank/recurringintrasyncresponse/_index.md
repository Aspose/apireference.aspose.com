---
title: Class RecurringIntraSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Bank.RecurringIntraSyncResponse kelas. Kelas respons sinkronisasi transaksi intrabank berulang.
type: docs
weight: 600
url: /id/net/aspose.finance.ofx.bank/recurringintrasyncresponse/
---
## RecurringIntraSyncResponse class

Kelas respons sinkronisasi transaksi intrabank berulang.

```csharp
public class RecurringIntraSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [RecurringIntraSyncResponse](recurringintrasyncresponse/)() | Menginisialisasi instance baru dari`RecurringIntraSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncresponse/accountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) atau[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) atau[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [RecurringIntraTransactionResponses](../../aspose.finance.ofx.bank/recurringintrasyncresponse/recurringintratransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`RecurringIntraTransactionResponse`](../recurringintratransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* perakitan [Aspose.Finance](../../)


