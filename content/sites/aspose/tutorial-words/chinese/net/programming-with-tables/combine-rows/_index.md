---
title: 合并行
linktitle: 合并行
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 合并 Word 文档中的表格行。
type: docs
weight: 10
url: /zh/net/programming-with-tables/combine-rows/
---

在本教程中，我们将学习如何使用 Aspose.Words for .NET 来组合 Word 文档中的表格行。我们将按照逐步指南来理解代码并实现此功能。在本教程结束时，您将能够以编程方式操作和合并 Word 文档中的表格行。

## 第 1 步：项目设置
1. 启动 Visual Studio 并创建一个新的 C# 项目。
2. 添加对 Aspose.Words for .NET 库的引用。

## 第 2 步：加载文档并访问表格
要开始使用表，我们需要加载包含它们的文档并访问它们。按着这些次序：

```csharp
//文档目录的路径
string dataDir = "YOUR DOCUMENTS DIRECTORY";

//装入文档
Document doc = new Document(dataDir + "Tables.docx");

//访问表
Table firstTable = (Table)doc.GetChild(NodeType.Table, 0, true);
Table secondTable = (Table)doc.GetChild(NodeType.Table, 1, true);
```

请务必将“您的文档目录”替换为您的文档目录的实际路径。

## 第 3 步：合并表行
接下来，我们将第二个表的行合并到第一个表的末尾。使用以下代码：

```csharp
//表格行的组合
while (secondTable.HasChildNodes)
     firstTable.Rows.Add(secondTable.FirstRow);
secondTable.Remove();
```

这里我们使用一个`while`循环遍历第二个数组的所有行，并使用`Add`方法。接下来，我们使用`Remove`方法。

## 第 4 步：保存修改后的文档
最后，我们需要将修改后的文档与合并的表格行一起保存。使用以下代码：

```csharp
//保存修改后的文件
doc.Save(dataDir + "WorkingWithTables.CombineRows.docx");
```

请务必为输出文档指定正确的路径和文件名。

### 使用 Aspose.Words for .NET 合并行的示例源代码 

```csharp
	//文档目录的路径
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Tables.docx");
	//第二个表中的行将附加到第一个表的末尾。
	Table firstTable = (Table) doc.GetChild(NodeType.Table, 0, true);
	Table secondTable = (Table) doc.GetChild(NodeType.Table, 1, true);
	//将当前表中的所有行附加到下一个表
	//可以将具有不同单元格数和宽度的单元格合并到一个表中。
	while (secondTable.HasChildNodes)
		firstTable.Rows.Add(secondTable.FirstRow);
	secondTable.Remove();
	doc.Save(dataDir + "WorkingWithTables.CombineRows.docx");
```

## 结论
在本教程中，我们学习了如何使用 Aspose.Words for .NET 合并 Word 文档中的表格行。通过遵循此分步指南并实施提供的 C# 代码，您可以以编程方式操作 Word 文档中的表格行。此功能允许您有效地将数据合并和组织到表格中。