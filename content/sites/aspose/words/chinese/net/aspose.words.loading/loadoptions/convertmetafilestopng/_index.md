---
title: LoadOptions.ConvertMetafilesToPng
linktitle: ConvertMetafilesToPng
articleTitle: ConvertMetafilesToPng
second_title: 用于 .NET 的 Aspose.Words
description: LoadOptions ConvertMetafilesToPng 财产. 获取或设置是否转换元文件Wmf或者Emf  图像到Png图像格式 在 C#.
type: docs
weight: 30
url: /zh/net/aspose.words.loading/loadoptions/convertmetafilestopng/
---
## LoadOptions.ConvertMetafilesToPng property

获取或设置是否转换元文件（Wmf或者Emf ) 图像到Png图像格式.

```csharp
public bool ConvertMetafilesToPng { get; set; }
```

## 评论

图元文件 (Wmf或者Emf ) 是一种未压缩的图像格式，有时需要大量 RAM 来保存和处理文档。 此选项允许将所有图元文件图像转换为Png文档加载时。 请注意 - 将矢量图形转换为光栅会降低图像质量。

## 例子

演示如何在加载文档期间将 WMF/EMF 转换为 PNG。

```csharp
Document doc = new Document();

            Shape shape = new Shape(doc, ShapeType.Image);
            shape.ImageData.SetImage(ImageDir + "Windows MetaFile.wmf");
            shape.Width = 100;
            shape.Height = 100;

            doc.FirstSection.Body.FirstParagraph.AppendChild(shape);

            doc.Save(ArtifactsDir + "Image.CreateImageDirectly.docx");

            shape = (Shape)doc.GetChild(NodeType.Shape, 0, true);

            TestUtil.VerifyImageInShape(1600, 1600, ImageType.Wmf, shape);

            LoadOptions loadOptions = new LoadOptions();
            loadOptions.ConvertMetafilesToPng = true;

            doc = new Document(ArtifactsDir + "Image.CreateImageDirectly.docx", loadOptions);
            shape = (Shape)doc.GetChild(NodeType.Shape, 0, true);

#if NET48
            TestUtil.VerifyImageInShape(1666, 1666, ImageType.Png, shape);
#elif NET5_0_OR_GREATER
            TestUtil.VerifyImageInShape(1666, 1666, ImageType.Png, shape);
#endif
```

### 也可以看看

* class [LoadOptions](../)
* 命名空间 [Aspose.Words.Loading](../../../aspose.words.loading/)
* 部件 [Aspose.Words](../../../)
