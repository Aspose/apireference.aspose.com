---
title: Class InterSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.InterTransfer.InterSyncResponse kelas. Kelas respons sinkronisasi transaksi antar bank.
type: docs
weight: 2470
url: /id/net/aspose.finance.ofx.intertransfer/intersyncresponse/
---
## InterSyncResponse class

Kelas respons sinkronisasi transaksi antar bank.

```csharp
public class InterSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [InterSyncResponse](intersyncresponse/)() | Menginisialisasi instance baru dari`InterSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/intersyncresponse/accountfrom/) { get; set; } | Mendapat atau mengatur dari[`BankAccount`](../../aspose.finance.ofx/bankaccount/) atau[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/) atau[`LoanAccount`](../../aspose.finance.ofx/loanaccount/) . |
| [InterTransactionResponses](../../aspose.finance.ofx.intertransfer/intersyncresponse/intertransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`InterTransactionResponse`](../intertransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/intersyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* perakitan [Aspose.Finance](../../)


