---
title: Row.IsLastRow
linktitle: IsLastRow
articleTitle: IsLastRow
second_title: 用于 .NET 的 Aspose.Words
description: Row IsLastRow 财产. 如果这是表中的最后一行则为 True否则为假 在 C#.
type: docs
weight: 50
url: /zh/net/aspose.words.tables/row/islastrow/
---
## Row.IsLastRow property

如果这是表中的最后一行，则为 True；否则为假。

```csharp
public bool IsLastRow { get; }
```

## 例子

展示如何将表格设置为在同一页面上保持在一起。

```csharp
Document doc = new Document(MyDir + "Table spanning two pages.docx");
Table table = doc.FirstSection.Body.Tables[0];

// 对表中的每个段落启用 KeepWithNext，除了
// 最后一行中的最后一个将防止表格拆分为多个页面。
foreach (Cell cell in table.GetChildNodes(NodeType.Cell, true).OfType<Cell>())
    foreach (Paragraph para in cell.Paragraphs.OfType<Paragraph>())
    {
        Assert.True(para.IsInCell);

        if (!(cell.ParentRow.IsLastRow && para.IsEndOfCell))
            para.ParagraphFormat.KeepWithNext = true;
    }

doc.Save(ArtifactsDir + "Table.KeepTableTogether.docx");
```

### 也可以看看

* class [Row](../)
* 命名空间 [Aspose.Words.Tables](../../../aspose.words.tables/)
* 部件 [Aspose.Words](../../../)
