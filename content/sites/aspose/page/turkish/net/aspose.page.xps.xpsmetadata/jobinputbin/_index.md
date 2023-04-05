---
title: Class JobInputBin
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.JobInputBin sınıf. Bir aygıtta takılı olan giriş bölmesini veya bir aygıt için desteklenen bölmelerin tam listesini açıklar. İş bazında giriş bölmesinin belirtilmesine izin verir. buJobInputBin DocumentInputBin  vePageInputBin anahtar kelimeler birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. https//docs.microsoft.com/enus/windows/win32/printdocs/jobinputbin
type: docs
weight: 1370
url: /tr/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

Bir aygıtta takılı olan giriş bölmesini veya bir aygıt için desteklenen bölmelerin tam listesini açıklar. İş bazında giriş bölmesinin belirtilmesine izin verir. bu`JobInputBin` ,[`DocumentInputBin`](../documentinputbin/) , ve[`PageInputBin`](../pageinputbin/) anahtar kelimeler birbirini dışlar. Her ikisi de bir PrintTicket veya Print Capabilities belgesinde aynı anda belirtilmemelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | Yeni bir örnek oluşturur. |

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
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


