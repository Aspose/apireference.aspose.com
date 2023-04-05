---
title: Class PageInputBin
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.PageInputBin sınıf. Bir aygıtta kurulu giriş bölmesini veya bir aygıt için desteklenen bölmelerin tam listesini açıklar. Giriş bölmesinin sayfa bazında belirtilmesine izin verir. buJobInputBin DocumentInputBin and PageInputBin anahtar kelimeler birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir . https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /tr/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Bir aygıtta kurulu giriş bölmesini veya bir aygıt için desteklenen bölmelerin tam listesini açıklar. Giriş bölmesinin sayfa bazında belirtilmesine izin verir. bu[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) and `PageInputBin` anahtar kelimeler birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir . https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Yeni bir örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Öğe adını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Bu özelliğin öğe listesinin sonuna bir öğe listesi ekler. Her biri bir olmalıdır[`Feature`](../feature/) , BİR[`Option`](../option/) veya bir[`Property`](../property/) örnek. |

### Ayrıca bakınız

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


