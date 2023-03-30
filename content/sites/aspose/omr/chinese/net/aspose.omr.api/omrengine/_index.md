---
title: Class OmrEngine
second_title: Aspose.OMR for .NET API 参考
description: Aspose.OMR.Api.OmrEngine 班级. OMR 引擎 处理模板和图像处理类以及 GUI 组件的创建
type: docs
weight: 20
url: /zh/net/aspose.omr.api/omrengine/
---
## OmrEngine class

OMR 引擎。 处理模板和图像处理类以及 GUI 组件的创建。

```csharp
public class OmrEngine
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [OmrEngine](omrengine/)() | 默认构造函数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | 基于 .json 标记创建模板 (.omr) 和模板图像 |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | 基于 JSON 标记创建模板 (.omr) 和模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | 创建模板 (.omr) 和基于文本标记的模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | 基于标记行 的数组创建模板 (.omr) 和模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | 基于 MemoryStream 创建模板 (.omr) 和模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | 创建模板 (.omr) 和基于文本标记的模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | 创建模板 (.omr) 和基于文本标记的模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | 基于标记行 的数组创建模板 (.omr) 和模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | 根据模板对象 创建模板 (.omr) 和模板图像 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | 基于 MemoryStream 创建模板 (.omr) 和模板图像 |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | 创建[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/)允许使用 GUI. 使用 OMR API 的实例[`TemplateProcessor`](../templateprocessor/)作为参数，仅适用于使用指定 template 创建的图像 |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | 创建[`TemplateProcessor`](../templateprocessor/)允许使用指定模板的实例. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | 创建[`TemplateProcessor`](../templateprocessor/)允许使用指定模板的实例. |

### 例子

```csharp
// 获取模板处理器
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// 获取校正 GUI 控件
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// 生成模板
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### 也可以看看

* 命名空间 [Aspose.OMR.Api](../../aspose.omr.api/)
* 部件 [Aspose.OMR](../../)


