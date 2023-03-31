---
title: Class OmrEngine
second_title: Aspose.OMR for .NET API Referansı
description: Aspose.OMR.Api.OmrEngine sınıf. OMR motoru. Şablonun ve görüntü işleme sınıflarının ve GUI bileşenlerinin oluşturulmasını yönetir.
type: docs
weight: 20
url: /tr/net/aspose.omr.api/omrengine/
---
## OmrEngine class

OMR motoru. Şablonun ve görüntü işleme sınıflarının ve GUI bileşenlerinin oluşturulmasını yönetir.

```csharp
public class OmrEngine
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [OmrEngine](omrengine/)() | Default_Constructor |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | .json işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | JSON işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | İşaretleme satırları dizisine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | İşaretleme satırları dizisine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Şablon object tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | [`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) GUI. kullanarak OMR API ile çalışmaya izin veren örnek[`TemplateProcessor`](../templateprocessor/) parametre olarak kullanılır ve yalnızca belirtilen template kullanılarak oluşturulan resimlerle çalışır. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | [`TemplateProcessor`](../templateprocessor/) belirtilen şablonla çalışmaya izin veren örnek. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | [`TemplateProcessor`](../templateprocessor/) belirtilen şablonla çalışmaya izin veren örnek. |

### Örnekler

```csharp
// şablon işlemcisini al
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// düzeltme GUI kontrolünü al
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// şablon oluştur
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Ayrıca bakınız

* ad alanı [Aspose.OMR.Api](../../aspose.omr.api/)
* toplantı [Aspose.OMR](../../)


