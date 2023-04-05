---
title: Class DocumentNUp
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp sınıf. Birden çok mantıksal sayfanın çıktısını ve biçimini tek bir fiziksel sayfaya açıklar. Her belge ayrı ayrı derlenir. VeJobNUpAllDocumentsContiguously birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama işlemeyi belirlemek sürücüye bağlıdır. https//docs.Microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 740
url: /tr/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Birden çok mantıksal sayfanın çıktısını ve biçimini tek bir fiziksel sayfaya açıklar. Her belge ayrı ayrı derlenir. Ve[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) birbirini dışlar. Bu anahtar kelimeler arasındaki kısıtlama işlemeyi belirlemek sürücüye bağlıdır. https://docs.Microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Yeni bir örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Öğe adını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Bu özelliğin öğe listesinin sonuna bir öğe listesi ekler. Her biri bir olmalıdır[`Feature`](../feature/) , BİR[`Option`](../option/) veya bir[`Property`](../property/) örnek. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | ile ekler ve seçenek puanlanan özellik değeri. Fiziksel sayfa başına mantıksal sayfa sayısını belirtir. |

### Ayrıca bakınız

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


