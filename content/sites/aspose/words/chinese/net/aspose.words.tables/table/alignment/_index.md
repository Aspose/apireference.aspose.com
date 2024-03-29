---
title: Table.Alignment
linktitle: Alignment
articleTitle: Alignment
second_title: 用于 .NET 的 Aspose.Words
description: Table Alignment 财产. 指定内联表在文档中的对齐方式 在 C#.
type: docs
weight: 40
url: /zh/net/aspose.words.tables/table/alignment/
---
## Table.Alignment property

指定内联表在文档中的对齐方式。

```csharp
public TableAlignment Alignment { get; set; }
```

## 评论

默认值为Left。

## 例子

演示如何将轮廓边框应用到表格。

```csharp
Document doc = new Document(MyDir + "Tables.docx");
Table table = doc.FirstSection.Body.Tables[0];

// 将表格与页面中心对齐。
table.Alignment = TableAlignment.Center;

// 清除表格中任何现有的边框和阴影。
table.ClearBorders();
table.ClearShading();

// 将绿色边框添加到表格的轮廓。
table.SetBorder(BorderType.Left, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Right, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Top, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Bottom, LineStyle.Single, 1.5, Color.Green, true);

// 用浅绿色纯色填充单元格。
table.SetShading(TextureIndex.TextureSolid, Color.LightGreen, Color.Empty);

doc.Save(ArtifactsDir + "Table.SetOutlineBorders.docx");
```

### 也可以看看

* enum [TableAlignment](../../tablealignment/)
* class [Table](../)
* 命名空间 [Aspose.Words.Tables](../../../aspose.words.tables/)
* 部件 [Aspose.Words](../../../)
