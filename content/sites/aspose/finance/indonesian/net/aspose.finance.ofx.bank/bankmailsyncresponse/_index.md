---
title: Class BankMailSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Bank.BankMailSyncResponse kelas. Kelas respons sinkronisasi email bank.
type: docs
weight: 340
url: /id/net/aspose.finance.ofx.bank/bankmailsyncresponse/
---
## BankMailSyncResponse class

Kelas respons sinkronisasi email bank.

```csharp
public class BankMailSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [BankMailSyncResponse](bankmailsyncresponse/)() | Menginisialisasi instance baru dari`BankMailSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/bankmailsyncresponse/accountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) atau[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) . |
| [BankMailTransactionResponses](../../aspose.finance.ofx.bank/bankmailsyncresponse/bankmailtransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`BankMailTransactionResponse`](../bankmailtransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.bank/bankmailsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* perakitan [Aspose.Finance](../../)


