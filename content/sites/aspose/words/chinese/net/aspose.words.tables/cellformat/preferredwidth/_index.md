---
title: CellFormat.PreferredWidth
linktitle: PreferredWidth
articleTitle: PreferredWidth
second_title: 用于 .NET 的 Aspose.Words
description: CellFormat PreferredWidth 财产. 返回或设置单元格的首选宽度 在 C#.
type: docs
weight: 70
url: /zh/net/aspose.words.tables/cellformat/preferredwidth/
---
## CellFormat.PreferredWidth property

返回或设置单元格的首选宽度。

```csharp
public PreferredWidth PreferredWidth { get; set; }
```

## 评论

首选宽度（以及表格的自动调整选项）确定表格布局算法如何计算单元格的实际 宽度。表格布局可以由 Aspose.Words 在保存文档时执行，或由 Microsoft Word 在显示文档时执行。

首选宽度可以用点或百分比来指定。首选 width 也可以指定为“auto”，这意味着不指定首选宽度。

默认值为[`Auto`](../../preferredwidth/auto/)。

## 例子

演示如何设置表格单元格的首选宽度。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
Table table = builder.StartTable();

// 有两种方法将“PreferredWidth”类应用于表格单元格。
// 1 - 根据点设置绝对首选宽度：
builder.InsertCell();
builder.CellFormat.PreferredWidth = PreferredWidth.FromPoints(40);
builder.CellFormat.Shading.BackgroundPatternColor = Color.LightYellow;
builder.Writeln($"Cell with a width of {builder.CellFormat.PreferredWidth}.");

// 2 - 根据表格宽度的百分比设置相对首选宽度：
builder.InsertCell();
builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(20);
builder.CellFormat.Shading.BackgroundPatternColor = Color.LightBlue;
builder.Writeln($"Cell with a width of {builder.CellFormat.PreferredWidth}.");

builder.InsertCell();

// 未指定首选宽度的单元格将占用剩余的可用空间。
builder.CellFormat.PreferredWidth = PreferredWidth.Auto;

// “PreferredWidth”属性的每个配置都会创建一个新对象。
Assert.AreNotEqual(table.FirstRow.Cells[1].CellFormat.PreferredWidth.GetHashCode(),
    builder.CellFormat.PreferredWidth.GetHashCode());

builder.CellFormat.Shading.BackgroundPatternColor = Color.LightGreen;
builder.Writeln("Automatically sized cell.");

doc.Save(ArtifactsDir + "DocumentBuilder.InsertCellsWithPreferredWidths.docx");
```

### 也可以看看

* class [PreferredWidth](../../preferredwidth/)
* class [CellFormat](../)
* 命名空间 [Aspose.Words.Tables](../../../aspose.words.tables/)
* 部件 [Aspose.Words](../../../)
