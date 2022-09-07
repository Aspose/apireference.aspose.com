---
title: GenerateTemplate
second_title: Aspose.OMR for .NET API 参考
description: 基于 MemoryStream 创建模板 .omr 和模板图像
type: docs
weight: 40
url: /zh/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

基于 MemoryStream 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含标记行的流 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 的图像而不是文件系统 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

基于 MemoryStream 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含标记行的流 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 的图像而不是文件系统 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

基于标记线数组创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupLines | String[] | 标记线数组 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 的图像而不是文件系统 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

基于标记线数组创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupLines | String[] | 标记线数组 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 的图像而不是文件系统 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

基于文本标记创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |
| settings | GlobalPageSettings | 适用于所有页面元素的全局设置 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

基于文本标记创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

基于文本标记创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| markupPath | String | 文本标记文件的路径 |
| imagesPaths | String[] | 生成中使用的图像的完整路径 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

基于 Template object 创建模板 (.omr) 和模板图像

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| config | TemplateConfig | 代表所有元素的模板对象 |
| settings | GlobalPageSettings | 所有模板生成中使用的全局设置 |
| userImages | ImageCollection | 可用于模板生成的图像集合。允许使用来自 MemoryStream 的图像而不是文件系统 |

### 返回值

生成结果

### 也可以看看

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* 命名空间 [Aspose.OMR.Api](../../omrengine)
* 部件 [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
