---
title: Class OmrEngine
second_title: Aspose.OMR untuk Referensi .NET API
description: Aspose.OMR.Api.OmrEngine kelas. Mesin OMR. Menangani pembuatan template dan kelas pemrosesan gambar serta komponen GUI.
type: docs
weight: 20
url: /id/net/aspose.omr.api/omrengine/
---
## OmrEngine class

Mesin OMR. Menangani pembuatan template dan kelas pemrosesan gambar serta komponen GUI.

```csharp
public class OmrEngine
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [OmrEngine](omrengine/)() | Konstruktor default. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | Membuat template (.omr) dan gambar template berdasarkan .json markup |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | Membuat template (.omr) dan gambar template berdasarkan markup JSON |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Membuat template (.omr) dan gambar template berdasarkan markup teks |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | Membuat template (.omr) dan gambar template berdasarkan array garis markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | Membuat template (.omr) dan gambar template berdasarkan MemoryStream |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Membuat template (.omr) dan gambar template berdasarkan markup teks |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Membuat template (.omr) dan gambar template berdasarkan markup teks |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | Membuat template (.omr) dan gambar template berdasarkan array garis markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Membuat template (.omr) dan gambar template berdasarkan objek Template |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | Membuat template (.omr) dan gambar template berdasarkan MemoryStream |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | Membuat[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) contoh yang memungkinkan bekerja dengan OMR API menggunakan GUI. Membawa[`TemplateProcessor`](../templateprocessor/) sebagai parameter dan hanya berfungsi dengan gambar yang dibuat menggunakan template tertentu |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | Membuat[`TemplateProcessor`](../templateprocessor/) contoh yang memungkinkan bekerja dengan template yang ditentukan. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | Membuat[`TemplateProcessor`](../templateprocessor/) contoh yang memungkinkan bekerja dengan template yang ditentukan. |

### Contoh

```csharp
// dapatkan prosesor template
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// dapatkan kontrol GUI koreksi
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// menghasilkan templat
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Lihat juga

* ruang nama [Aspose.OMR.Api](../../aspose.omr.api/)
* perakitan [Aspose.OMR](../../)


