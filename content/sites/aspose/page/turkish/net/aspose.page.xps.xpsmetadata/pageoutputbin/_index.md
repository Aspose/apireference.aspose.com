---
title: Class PageOutputBin
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin sınıf. Cihaz için desteklenen bölmelerin tam listesini açıklar. Çıkış bölmesinin sayfa bazında belirtilmesine izin verir. JobOutputBin DocumentOutputBin VePageOutputBin anahtar kelimeler are birbirini dışlayan yalnızca bir tanesi PrintTicket veya Print Capabilities belgesinde belirtilmelidir. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2330
url: /tr/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Cihaz için desteklenen bölmelerin tam listesini açıklar. Çıkış bölmesinin sayfa bazında belirtilmesine izin verir. [`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) Ve`PageOutputBin` anahtar kelimeler are birbirini dışlayan yalnızca bir tanesi PrintTicket veya Print Capabilities belgesinde belirtilmelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Yeni bir örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Öğe adını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Bu özelliğin öğe listesinin sonuna bir öğe listesi ekler. Her biri bir olmalıdır[`Feature`](../feature/) , BİR[`Option`](../option/) veya bir[`Property`](../property/) örnek. |

### Ayrıca bakınız

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


