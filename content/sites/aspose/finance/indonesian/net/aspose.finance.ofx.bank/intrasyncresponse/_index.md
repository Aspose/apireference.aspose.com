---
title: Class IntraSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Bank.IntraSyncResponse kelas. Kelas respons sinkronisasi transaksi intrabank.
type: docs
weight: 500
url: /id/net/aspose.finance.ofx.bank/intrasyncresponse/
---
## IntraSyncResponse class

Kelas respons sinkronisasi transaksi intrabank.

```csharp
public class IntraSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [IntraSyncResponse](intrasyncresponse/)() | Menginisialisasi instance baru dari`IntraSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncresponse/accountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) atau[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) atau[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [IntraTransactionResponses](../../aspose.finance.ofx.bank/intrasyncresponse/intratransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`IntraTransactionResponse`](../intratransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* perakitan [Aspose.Finance](../../)


