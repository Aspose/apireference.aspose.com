---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR for .NET API 参考
description: OmrEngine 方法. 基于 MemoryStream 创建模板 .omr 和模板图像
type: docs
weight: 40
url: /zh/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

基于 MemoryStream 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含标记行的流 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 而不是文件系统的图像 |
| encoding | Encoding | 标记行编码，默认使用UTF-8 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

基于 MemoryStream 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含标记行的流 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 而不是文件系统的图像 |
| encoding | Encoding | 标记行编码，默认使用UTF-8 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

基于标记行 的数组创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupLines | String[] | 标记行数组 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 而不是文件系统的图像 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

基于标记行 的数组创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupLines | String[] | 标记行数组 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 而不是文件系统的图像 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

创建模板 (.omr) 和基于文本标记的模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |
| encoding | Encoding | 标记文件编码，默认使用UTF-8 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

创建模板 (.omr) 和基于文本标记的模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |
| encoding | Encoding | 标记文件编码，默认使用UTF-8 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

创建模板 (.omr) 和基于文本标记的模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |
| imagesPaths | String[] | 生成中使用的图像的完整路径 |
| encoding | Encoding | 标记文件编码，默认使用UTF-8 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

根据模板对象 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| config | TemplateConfig | 表示所有元素的模板对象 |
| settings | GlobalPageSettings | 所有模板生成中使用的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 而不是文件系统的图像 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 命名空间 [Aspose.OMR.Api](../../omrengine/)
* 部件 [Aspose.OMR](../../../)


