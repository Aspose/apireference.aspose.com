---
title: Cell.EnsureMinimum
linktitle: EnsureMinimum
articleTitle: EnsureMinimum
second_title: 用于 .NET 的 Aspose.Words
description: Cell EnsureMinimum 方法. 如果最后一个子级不是段落则创建并附加一个空段落 在 C#.
type: docs
weight: 140
url: /zh/net/aspose.words.tables/cell/ensureminimum/
---
## Cell.EnsureMinimum method

如果最后一个子级不是段落，则创建并附加一个空段落。

```csharp
public void EnsureMinimum()
```

## 例子

展示如何确保单元节点包含我们开始向其添加内容所需的节点。

```csharp
Document doc = new Document();
Table table = new Table(doc);
doc.FirstSection.Body.AppendChild(table);
Row row = new Row(doc);
table.AppendChild(row);
Cell cell = new Cell(doc);
row.AppendChild(cell);

// 单元格可能包含具有典型元素的段落，例如运行、形状，甚至其他表格。
// 我们的新单元格没有任何段落，在它出现之前我们无法向其中添加诸如运行和形状节点之类的内容。
Assert.AreEqual(0, cell.GetChildNodes(NodeType.Any, true).Count);

// 在单元格上调用“EnsureMinimum”方法将确保
// 该单元格至少有一个空段落，然后我们可以向其中添加内容。
cell.EnsureMinimum();
cell.FirstParagraph.AppendChild(new Run(doc, "Hello world!"));
```

### 也可以看看

* class [Cell](../)
* 命名空间 [Aspose.Words.Tables](../../../aspose.words.tables/)
* 部件 [Aspose.Words](../../../)
