---
title: Class JobErrorSheet
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet sınıf. Hata sayfası çıktısını açıklar. Tüm işin tek bir hata sayfası olacaktır. Hata sayfası varsayılan olarak çıkarılmalıdır.PageMediaSize ve varsayılanı kullanarakPageMediaType . Hata sayfası işin geri kalanından izole edilmelidir. Bu herhangi bir bitirme or işleme seçeneğinin örneğin   veya  hata sayfasını içermemelidir. Hata sayfası işin son sayfası olarak görünmelidir. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1300
url: /tr/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Hata sayfası çıktısını açıklar. Tüm işin tek bir hata sayfası olacaktır. Hata sayfası varsayılan olarak çıkarılmalıdır.[`PageMediaSize`](../pagemediasize/) ve varsayılanı kullanarak[`PageMediaType`](../pagemediatype/) . Hata sayfası işin geri kalanından izole edilmelidir. Bu, herhangi bir bitirme or işleme seçeneğinin (örneğin , , veya ) hata sayfasını içermemelidir. Hata sayfası, işin son sayfası olarak görünmelidir. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Yeni bir örnek oluşturur. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | `JobErrorSheet` özellik seçenekleri. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | içini tanımlar özellik. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Herhangi birinin arayüzü`JobErrorSheet` özellik öğesi. |

### Ayrıca bakınız

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


