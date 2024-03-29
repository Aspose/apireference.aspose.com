---
title: ImageSaveOptions.Scale
linktitle: Scale
articleTitle: Scale
second_title: 用于 .NET 的 Aspose.Words
description: ImageSaveOptions Scale 财产. 获取或设置生成图像的缩放系数 在 C#.
type: docs
weight: 150
url: /zh/net/aspose.words.saving/imagesaveoptions/scale/
---
## ImageSaveOptions.Scale property

获取或设置生成图像的缩放系数。

```csharp
public float Scale { get; set; }
```

## 评论

默认值为 1.0。该值必须大于 0.

## 例子

演示如何将 Office Math 对象呈现为本地文件系统中的图像文件。

```csharp
Document doc = new Document(MyDir + "Office math.docx");

OfficeMath math = (OfficeMath)doc.GetChild(NodeType.OfficeMath, 0, true);

// 创建一个“ImageSaveOptions”对象传递给节点渲染器的“Save”方法进行修改
// 它如何将 OfficeMath 节点呈现为图像。
ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFormat.Png);

// 将“Scale”属性设置为 5，将对象渲染为其原始大小的五倍。
saveOptions.Scale = 5;

math.GetMathRenderer().Save(ArtifactsDir + "Shape.RenderOfficeMath.png", saveOptions);
```

演示如何在 Aspose.Words 将文档转换为文档时编辑图像。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.ParagraphFormat.Style = doc.Styles["Heading 1"];
builder.Writeln("Hello world!");
builder.InsertImage(ImageDir + "Logo.jpg");

// 当我们将文档保存为图像时，我们可以将 SaveOptions 对象传递给
// 在保存操作渲染图像时编辑图像。
ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png)
{
    // 我们可以调整这些属性来改变图像的亮度和对比度。
    // 两者的等级均为 0-1，默认为 0.5。
    ImageBrightness = 0.3f,
    ImageContrast = 0.7f,

    // 我们可以使用这些属性调整水平和垂直分辨率。
    // 这会影响图像的尺寸。
    // 对于 96dpi 的分辨率，这些属性的默认值为 96.0。
    HorizontalResolution = 72f,
    VerticalResolution = 72f,

    // 我们可以使用这个属性来缩放图像。默认值为 1.0，表示缩放为 100%。
    // 我们可以使用此属性来抵消更改分辨率所导致的图像尺寸的任何变化。
    Scale = 96f / 72f
};

doc.Save(ArtifactsDir + "ImageSaveOptions.EditImage.png", options);
```

### 也可以看看

* class [ImageSaveOptions](../)
* 命名空间 [Aspose.Words.Saving](../../../aspose.words.saving/)
* 部件 [Aspose.Words](../../../)
