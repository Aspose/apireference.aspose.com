---
title: Class PageWatermark
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.PageWatermark sınıf. Çıktının filigran ayarını ve filigran özelliklerini açıklar. Filigranlar fiziksel sayfaya değil mantıksal sayfaya uygulanır . Örneğin eğerDocumentDuplex etkinleştirildiğinde her birinde bir filigran görünecektir her sayfadaki sayfa. EğerDocumentDuplex  2 o zaman her sayfada 2 filigran olacaktır. https//docs.Microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /tr/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Çıktının filigran ayarını ve filigran özelliklerini açıklar. Filigranlar, fiziksel sayfaya değil, mantıksal sayfaya uygulanır . Örneğin, eğer[`DocumentDuplex`](../documentduplex/) etkinleştirildiğinde, her birinde bir filigran görünecektir her sayfadaki sayfa. Eğer[`DocumentDuplex`](../documentduplex/) , =2, o zaman her sayfada 2 filigran olacaktır. https://docs.Microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Yeni bir örnek oluşturur. |

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
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | Herhangi birinin arayüzü`PageWatermark` özellik öğesi. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | Herhangi birinin arayüzü[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) öğe. |
| class [Layering](pagewatermark.layering/) | içini tanımlar özellik. Filigranın katmanlama davranışını tanımlar. |
| class [LayeringOption](pagewatermark.layeringoption/) | [`Layering`](../pagewatermark.layering/) özellik seçenekleri. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | `PageWatermark` özellik seçenekleri. |

### Ayrıca bakınız

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


