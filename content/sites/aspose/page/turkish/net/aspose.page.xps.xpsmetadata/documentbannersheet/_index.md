---
title: Class DocumentBannerSheet
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet sınıf. Belirli bir belge için çıktısı alınacak başlık sayfasını tanımlar. Afiş sayfası default üzerinde çıkarılmalıdır.PageMediaSize ve varsayılanı kullanarakPageMediaType . Afiş sayfası da işin geri kalanından izole edilmelidir . Bu tüm bitirme veya işleme seçeneklerinin as gibiDocumentDuplex DocumentStaple  veyaDocumentBinding başlık sayfasını içermemelidir. Başlık sayfası işin geri kalanından izole edilebilir veya edilmeyebilir. Bu herhangi bir iş bitirme veya işleme seçeneğinin belge başlık sayfasını içerebileceği anlamına gelir. Başlık sayfası belgenin ilk sayfası olarak görünmelidir. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /tr/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Belirli bir belge için çıktısı alınacak başlık sayfasını tanımlar. Afiş sayfası default üzerinde çıkarılmalıdır.[`PageMediaSize`](../pagemediasize/) ve varsayılanı kullanarak[`PageMediaType`](../pagemediatype/) . Afiş sayfası da işin geri kalanından izole edilmelidir . Bu, tüm bitirme veya işleme seçeneklerinin (as gibi)[`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , veya[`DocumentBinding`](../documentbinding/)) başlık sayfasını içermemelidir. Başlık sayfası işin geri kalanından izole edilebilir veya edilmeyebilir. Bu, herhangi bir iş bitirme veya işleme seçeneğinin belge başlık sayfasını içerebileceği anlamına gelir. Başlık sayfası, belgenin ilk sayfası olarak görünmelidir. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Yeni bir örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Öğe adını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Bu özelliğin öğe listesinin sonuna bir öğe listesi ekler. Her biri bir olmalıdır[`Feature`](../feature/) , BİR[`Option`](../option/) veya bir[`Property`](../property/) örnek. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Şunun seçeneklerini temsil eder:`DocumentBannerSheet` özellik. |

### Ayrıca bakınız

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


