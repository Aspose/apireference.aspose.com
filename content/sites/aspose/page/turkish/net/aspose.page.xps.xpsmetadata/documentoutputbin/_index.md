---
title: Class DocumentOutputBin
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin sınıf. Cihaz için desteklenen bölmelerin tam listesini açıklar. Her belge için output bölmesinin belirtilmesine izin verir. buJobOutputBin DocumentOutputBin and PageOutputBin anahtar sözcükler birbirini dışlar yalnızca bir tanesi bir PrintTicket veya Print Capabilities belgesinde belirtilmelidir. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 760
url: /tr/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Cihaz için desteklenen bölmelerin tam listesini açıklar. Her belge için output bölmesinin belirtilmesine izin verir. bu[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` and [`PageOutputBin`](../pageoutputbin/) anahtar sözcükler birbirini dışlar, yalnızca bir tanesi bir PrintTicket veya Print Capabilities belgesinde belirtilmelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Yeni bir örnek oluşturur. |

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
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


