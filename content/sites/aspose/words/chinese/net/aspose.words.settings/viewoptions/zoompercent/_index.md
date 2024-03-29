---
title: ViewOptions.ZoomPercent
linktitle: ZoomPercent
articleTitle: ZoomPercent
second_title: 用于 .NET 的 Aspose.Words
description: ViewOptions ZoomPercent 财产. 获取或设置您想要查看文档的百分比10 到 500 之间 在 C#.
type: docs
weight: 50
url: /zh/net/aspose.words.settings/viewoptions/zoompercent/
---
## ViewOptions.ZoomPercent property

获取或设置您想要查看文档的百分比（10 到 500 之间）。

```csharp
public int ZoomPercent { get; set; }
```

## 评论

如果值为 0，则此属性使用 100，否则如果值小于 10 或大于 大于 500，则此属性将抛出异常。

尽管 Aspose.Words 能够读取和写入此选项，但其用法是特定于应用程序的。 例如，MS Word 2013 不尊重此选项的值。

## 例子

演示如何设置自定义缩放系数，旧版本的 Microsoft Word 将在加载时应用于文档。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world!");

doc.ViewOptions.ViewType = ViewType.PageLayout;
doc.ViewOptions.ZoomPercent = 50;

Assert.AreEqual(ZoomType.Custom, doc.ViewOptions.ZoomType);
Assert.AreEqual(ZoomType.None, doc.ViewOptions.ZoomType);

doc.Save(ArtifactsDir + "ViewOptions.SetZoomPercentage.doc");
```

### 也可以看看

* class [ViewOptions](../)
* 命名空间 [Aspose.Words.Settings](../../../aspose.words.settings/)
* 部件 [Aspose.Words](../../../)
