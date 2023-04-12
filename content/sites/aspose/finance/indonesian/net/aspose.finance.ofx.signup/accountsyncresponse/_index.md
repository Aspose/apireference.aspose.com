---
title: Class AccountSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Signup.AccountSyncResponse kelas. Kelas respons sinkronisasi aktivasi layanan.
type: docs
weight: 5540
url: /id/net/aspose.finance.ofx.signup/accountsyncresponse/
---
## AccountSyncResponse class

Kelas respons sinkronisasi aktivasi layanan.

```csharp
public class AccountSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [AccountSyncResponse](accountsyncresponse/)() | Menginisialisasi instance baru dari`AccountSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AccountTransactionResponses](../../aspose.finance.ofx.signup/accountsyncresponse/accounttransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`AccountTransactionResponse`](../accounttransactionresponse/) . |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [OfxExtension](../../aspose.finance.ofx.signup/accountsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.Signup](../../aspose.finance.ofx.signup/)
* perakitan [Aspose.Finance](../../)


