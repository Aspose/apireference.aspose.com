---
title: 建立带边框的表格
linktitle: 建立带边框的表格
second_title: Aspose.Words for .NET API 参考
description: 使用 Aspose.Words for .NET 构建带边框表格的分步指南。
type: docs
weight: 10
url: /zh/net/programming-with-table-styles-and-formatting/build-table-with-borders/
---

在本教程中，我们将逐步引导您使用 Aspose.Words for .NET 构建带边框的表格。我们将解释捆绑的 C# 源代码，并为您提供全面的指南，以帮助您了解并在您自己的项目中实现此功能。在本教程结束时，您将了解如何使用 Aspose.Words for .NET 在 Word 文档中创建带有自定义边框的表格。

## 第一步：定义文档目录
首先，您需要设置文档目录的路径。这是存储 Word 文档的位置。用适当的路径替换“您的文档目录”。

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## 第 2 步：加载现有文档
接下来，您需要将现有的 Word 文档加载到`Document`班级。

```csharp
Document doc = new Document(dataDir + "Tables.docx");
```

## 第 3 步：访问表格并删除现有边框
要开始构建带边框的表格，我们需要导航到文档中的表格并删除现有边框。这`ClearBorders()`方法从表中删除所有边框。

```csharp
Table table = (Table)doc.GetChild(NodeType.Table, 0, true);
table. ClearBorders();
```

## 第 4 步：设置表格边框
现在我们可以使用`SetBorders()`方法。在本例中，我们使用了粗细为 1.5 磅的绿色边框。

```csharp
table.SetBorders(LineStyle.Single, 1.5, Color.Green);
```

## 第五步：保存修改后的文档
最后，我们将修改后的文档保存到一个文件中。您可以为输出文档选择合适的名称和位置。

```csharp
doc.Save(dataDir + "WorkingWithTableStylesAndFormatting.BuildTableWithBorders.docx");
```

恭喜！您现在已经使用 Aspose.Words for .NET 构建了一个带有自定义边框的表格。

### 使用 Aspose.Words for .NET 构建带边框表格的示例源代码 

```csharp
	//文档目录的路径
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Tables.docx");
	Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
	//清除表格中的所有现有边框。
	table.ClearBorders();
	//在表格周围和内部设置绿色边框。
	table.SetBorders(LineStyle.Single, 1.5, Color.Green);
	doc.Save(dataDir + "WorkingWithTableStylesAndFormatting.BuildTableWithBorders.docx");
```

## 结论
在本教程中，我们学习了如何使用 Aspose.Words for .NET 构建带边框的表格。按照此分步指南，您可以轻松地自定义 Word 文档中的表格边框。 Aspose.Words 提供了一个强大而灵活的 API，用于操作和格式化文档中的表格。有了这些知识，您就可以改进 Word 文档的视觉呈现并满足特定需求。