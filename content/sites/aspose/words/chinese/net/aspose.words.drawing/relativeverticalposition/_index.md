---
title: RelativeVerticalPosition Enum
linktitle: RelativeVerticalPosition
articleTitle: RelativeVerticalPosition
second_title: 用于 .NET 的 Aspose.Words
description: Aspose.Words.Drawing.RelativeVerticalPosition 枚举. 指定形状或文本框架的垂直位置的相对位置 在 C#.
type: docs
weight: 1210
url: /zh/net/aspose.words.drawing/relativeverticalposition/
---
## RelativeVerticalPosition enumeration

指定形状或文本框架的垂直位置的相对位置。

```csharp
public enum RelativeVerticalPosition
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Margin | `0` | 指定垂直定位应相对于页边距。 |
| Page | `1` | 对象相对于页面的上边缘定位。 |
| Paragraph | `2` | 对象相对于包含锚点的段落顶部定位。 |
| Line | `3` | 无证。 |
| TopMargin | `4` | 指定垂直定位应相对于当前页面的上边距。 |
| BottomMargin | `5` | 指定垂直定位应相对于当前页面的下边距。 |
| InsideMargin | `6` | 指定垂直定位应相对于当前页面的内边距。 |
| OutsideMargin | `7` | 指定垂直定位应相对于当前页面的外边距。 |
| TableDefault | `0` | 默认值为Margin。 |
| TextFrameDefault | `2` | 默认值为Paragraph。 |

## 例子

演示如何将浮动图像插入到页面中央。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// 插入一个浮动图像，该图像将出现在重叠文本后面并将其与页面中心对齐。
Shape shape = builder.InsertImage(ImageDir + "Logo.jpg");
shape.WrapType = WrapType.None;
shape.BehindText = true;
shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;
shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
shape.HorizontalAlignment = HorizontalAlignment.Center;
shape.VerticalAlignment = VerticalAlignment.Center;

doc.Save(ArtifactsDir + "Image.CreateFloatingPageCenter.docx");
```

演示如何插入图像并将其用作水印。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// 将图像插入页眉中，以便它在每个页面上都可见。
Image image = Image.FromFile(ImageDir + "Transparent background logo.png");
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
Shape shape = builder.InsertImage(image);
shape.WrapType = WrapType.None;
shape.BehindText = true;

// 将图像放置在页面的中心。
shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;
shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
shape.Left = (builder.PageSetup.PageWidth - shape.Width) / 2;
shape.Top = (builder.PageSetup.PageHeight - shape.Height) / 2;

doc.Save(ArtifactsDir + "DocumentBuilder.InsertWatermark.docx");
```

演示如何插入图像并将其用作水印 (.NetStandard 2.0)。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// 将图像插入页眉中，以便它在每个页面上都可见。
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);

using (SKBitmap image = SKBitmap.Decode(ImageDir + "Transparent background logo.png"))
{
    builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
    Shape shape = builder.InsertImage(image);
    shape.WrapType = WrapType.None;
    shape.BehindText = true;

    // 将图像放置在页面的中心。
    shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;
    shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
    shape.Left = (builder.PageSetup.PageWidth - shape.Width) / 2;
    shape.Top = (builder.PageSetup.PageHeight - shape.Height) / 2;
}

doc.Save(ArtifactsDir + "DocumentBuilder.InsertWatermarkNetStandard2.docx");
```

### 也可以看看

* property [RelativeVerticalPosition](../shapebase/relativeverticalposition/)
* 命名空间 [Aspose.Words.Drawing](../../aspose.words.drawing/)
* 部件 [Aspose.Words](../../)
