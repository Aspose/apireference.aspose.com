---
title: Class MailSyncResponse
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Email.MailSyncResponse kelas. Kelas respons sinkronisasi email.
type: docs
weight: 2190
url: /id/net/aspose.finance.ofx.email/mailsyncresponse/
---
## MailSyncResponse class

Kelas respons sinkronisasi email.

```csharp
public class MailSyncResponse : AbstractSyncResponse
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [MailSyncResponse](mailsyncresponse/)() | Menginisialisasi instance baru dari`MailSyncResponse` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ya jika token dalam permintaan sinkronisasi lebih tua dari entri paling awal di tabel riwayat server. Dalam hal ini, beberapa respons telah hilang. Tidak jika token dalam permintaan sinkronisasi lebih baru atau cocok dengan token di server tabel sejarah. |
| [MailTransactionResponses](../../aspose.finance.ofx.email/mailsyncresponse/mailtransactionresponses/) { get; set; } | Mendapat atau menyetel koleksi dari[`MailTransactionResponse`](../mailtransactionresponse/) . |
| [OfxExtension](../../aspose.finance.ofx.email/mailsyncresponse/ofxextension/) { get; set; } | Mendapat atau menyetel[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Mendapat atau menyetel token sinkronisasi baru. |

### Lihat juga

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* ruang nama [Aspose.Finance.Ofx.Email](../../aspose.finance.ofx.email/)
* perakitan [Aspose.Finance](../../)


