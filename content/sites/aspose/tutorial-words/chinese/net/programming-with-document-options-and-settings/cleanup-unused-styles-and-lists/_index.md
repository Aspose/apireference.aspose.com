---
title: 清理未使用的样式和列表
linktitle: 清理未使用的样式和列表
second_title: Aspose.Words for .NET API 参考
description: 使用 Aspose.Words for .NET 清理文档中未使用的样式和列表的分步指南。
type: docs
weight: 10
url: /zh/net/programming-with-document-options-and-settings/cleanup-unused-styles-and-lists/
---

在本教程中，我们将引导您通过 C# 源代码使用 Aspose.Words for .NET 清理未使用的样式和列表。此功能允许您删除文档中未使用的样式和列表。

## 第 1 步：项目设置

首先，在您喜欢的 IDE 中创建一个新的 C# 项目。确保在您的项目中引用了 Aspose.Words for .NET 库。

## 第 2 步：装入文档

在此步骤中，我们将加载包含我们要清理的未使用样式和列表的 Word 文档。使用以下代码加载文档：

```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document(dataDir + "Unused styles.docx");
```

代替`"YOUR DOCUMENTS DIRECTORY"`使用文档所在目录的实际路径。

## 第 3 步：清理前统计样式和列表

在清理之前，我们将计算文档中存在的样式和列表的数量。使用以下代码显示计数器：

```csharp
Console.WriteLine($"Number of styles before cleaning: {doc.Styles.Count}\n" +
$"Number of lists before cleaning: {doc.Lists.Count}");
```

这些说明显示清洁前文档中存在的样式和列表的数量。

## 第 4 步：清理未使用的样式和列表

现在让我们从文档中清除未使用的样式和列表。使用以下代码执行清理：

```csharp
CleanupOptions cleanupOptions = new CleanupOptions { UnusedLists = false, UnusedStyles = true };
doc. Cleanup(cleanupOptions);
```

此代码使用指定的选项从文档中清除未使用的样式和列表。在这个例子中，我们启用了`UnusedStyles`选项删除未使用的样式并禁用`UnusedLists`保留列表的选项，即使它们不被使用。

## 第 5 步：清理后统计样式和列表

完成清理后，我们将再次计算样式和列表以检查它们是否已折叠。使用以下代码显示新计数器：

```csharp
Console.WriteLine($"Count of styles after Cleanup was decreased: {doc.Styles.Count}\n" +
				  $"Count of lists after Cleanup is the same: {doc.Lists.Count}");

doc.Save(dataDir + "WorkingWithDocumentOptionsAndSettings.CleanupUnusedStylesAndLists.docx");
```

这些说明显示清洁后剩余的款式和清单数量。

### 使用 Aspose.Words for .NET 清理未使用的样式和列表的示例源代码

```csharp

	//文档目录的路径。
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Unused styles.docx");

	//结合内置样式，文档现在有八种样式。
	//当文档中有任何文本时，自定义样式被标记为“已使用”
	//以那种风格格式化。这意味着我们添加的 4 个样式当前未使用。
	Console.WriteLine($"Count of styles before Cleanup: {doc.Styles.Count}\n" +
					  $"Count of lists before Cleanup: {doc.Lists.Count}");

	//根据给定的 CleanupOptions 从文档中清除未使用的样式和列表。
	CleanupOptions cleanupOptions = new CleanupOptions { UnusedLists = false, UnusedStyles = true };
	doc.Cleanup(cleanupOptions);

	Console.WriteLine($"Count of styles after Cleanup was decreased: {doc.Styles.Count}\n" +
					  $"Count of lists after Cleanup is the same: {doc.Lists.Count}");

	doc.Save(dataDir + "WorkingWithDocumentOptionsAndSettings.CleanupUnusedStylesAndLists.docx");
    
```

请务必在`dataDir`多变的。

您现在已经了解了如何使用 Aspose.Words for .NET 从文档中清除未使用的样式和列表。按照本教程中提供的分步指南，您可以轻松地将此功能应用到您自己的文档中。

