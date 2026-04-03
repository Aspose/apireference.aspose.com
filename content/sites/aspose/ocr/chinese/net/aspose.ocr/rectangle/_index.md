---
title: Rectangle
second_title: Aspose.OCR 适用于 .NET API 参考
description: 存储一组四个整数，表示矩形的位置和大小。
type: docs
weight: 430
url: /zh/net/aspose.ocr/rectangle/
---
## Rectangle structure

存储一组四个整数，表示矩形的位置和大小。

```csharp
public struct Rectangle
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Rectangle](rectangle)(int, int, int, int) | 使用指定的位置和大小初始化 [`Rectangle`](../rectangle) 结构的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| static [Empty](../../aspose.ocr/rectangle/empty) { get; } | 获取一个新的 [`Rectangle`](../rectangle) 结构实例，其 [`X`](./x)、[`Y`](./y)、[`Width`](./width) 和 [`Height`](./height) 值均为零。 |
| [Bottom](../../aspose.ocr/rectangle/bottom) { get; set; } | 获取或设置此 [`Rectangle`](../rectangle) 结构的 y 坐标，该坐标为 [`Y`](./y) 与 [`Height`](./height) 属性值之和。 |
| [IsEmpty](../../aspose.ocr/rectangle/isempty) { get; } | 获取一个值，指示此 [`Rectangle`](../rectangle) 的所有数值属性是否为零。 |
| [Left](../../aspose.ocr/rectangle/left) { get; set; } | 获取或设置此 !:Aspose.OCR..Rectangle 结构左边缘的 x 坐标。 |
| [Right](../../aspose.ocr/rectangle/right) { get; set; } | 获取或设置此 [`Rectangle`](../rectangle) 结构的 x 坐标，该坐标为 [`X`](./x) 与 [`Width`](./width) 属性值之和。 |
| [Top](../../aspose.ocr/rectangle/top) { get; set; } | 获取或设置此 [`Rectangle`](../rectangle) 结构顶部边缘的 y 坐标。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [Contains](../../aspose.ocr/rectangle/contains)(int, int) | 确定指定的点是否位于此 [`Rectangle`](../rectangle) 结构内部。 |
| override [Equals](../../aspose.ocr/rectangle/equals)(object) | 测试 *obj* 是否为具有与此 [`Rectangle`](../rectangle) 结构相同位置和大小的 [`Rectangle`](../rectangle) 结构。 |
| override [GetHashCode](../../aspose.ocr/rectangle/gethashcode)() | 返回此 [`Rectangle`](../rectangle) 结构的哈希码。 |
| override [ToString](../../aspose.ocr/rectangle/tostring)() | 将此 [`Rectangle`](../rectangle) 的属性转换为可读的字符串。 |
| [operator ==](../../aspose.ocr/rectangle/op_equality) | 测试两个 [`Rectangle`](../rectangle) 结构的位置和大小是否相等。 |
| [operator !=](../../aspose.ocr/rectangle/op_inequality) | 测试两个 [`Rectangle`](../rectangle) 结构的位置或大小是否不同。 |

## 字段

| 名称 | 描述 |
| --- | --- |
| [Height](../../aspose.ocr/rectangle/height) | 矩形的宽度。 |
| [Width](../../aspose.ocr/rectangle/width) | 矩形的高度。 |
| [X](../../aspose.ocr/rectangle/x) | 矩形的 x 位置。 |
| [Y](../../aspose.ocr/rectangle/y) | 矩形的 y 位置。 |

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
