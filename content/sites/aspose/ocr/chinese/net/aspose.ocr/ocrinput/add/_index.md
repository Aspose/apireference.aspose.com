---
title: 添加
second_title: Aspose.OCR 适用于 .NET API 参考
description: 添加包含图像的路径或 URI 以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配。
type: docs
weight: 30
url: /zh/net/aspose.ocr/ocrinput/add/
---
## Add(string) {#add_4}

添加包含图像的路径或 URI 以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配。

```csharp
public void Add(string fullPath)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像/文档/文件夹/存档的路径。 |

### 另请参见

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(MemoryStream) {#add_2}

添加包含图像的内存流以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配。

```csharp
public void Add(MemoryStream stream)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 包含图像或文档的内存流。 |

### 另请参见

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(string, int, int) {#add_5}

添加多页图像/文档以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配。

```csharp
public void Add(string fullPath, int startPage, int pagesCount)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像/文档/文件夹/存档的路径。 |
| startPage | Int32 | 用于处理/识别的第一页/图像。适用于文档、压缩文件、文件夹。 |
| pagesCount | Int32 | 用于处理/识别的页面/图像的总数量。适用于文档、压缩文件、文件夹。默认值 = 1。 |

### 另请参见

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(MemoryStream, int, int) {#add_3}

添加包含多页图像的内存流以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配。

```csharp
public void Add(MemoryStream stream, int startPage, int pagesCount)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 包含多页文档的内存流。 |
| startPage | Int32 | 用于处理/识别的第一页/图像。适用于文档。 |
| pagesCount | Int32 | 用于处理/识别的页面/图像的总数量。适用于文档。默认值 = 1。 |

### 另请参见

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(byte[], int, int, PixelType) {#add_1}

将解码后的图像添加到列表中以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配（SingleImage）。

```csharp
public void Add(byte[] arr, int width, int height, PixelType pixelFormat)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | Byte[] | 在 Aspose.Drawing.Color 数组中的解码图像。 |
| width | Int32 | 图像宽度。 |
| 高度 | Int32 | 图像高度。 |
| pixelFormat | PixelType | 支持 byte、rgb、bgr、rgba。 |

### 另请参见

* enum [PixelType](../../pixeltype)
* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

---

## Add(Color[], int, int) {#add}

将解码后的图像添加到列表中以进行识别/处理。图像的类型必须与构造函数中指定的类型相匹配（SingleImage）。

```csharp
public void Add(Color[] imageData, int width, int height)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| imageData | Color[] | 在 Aspose.Drawing.Color 数组中的解码图像。 |
| width | Int32 | 图像宽度。 |
| 高度 | Int32 | 图像高度。 |

### 另请参见

* class [OcrInput](../../ocrinput)
* namespace [Aspose.OCR](../../ocrinput)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
