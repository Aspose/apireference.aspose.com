---
title: 忽略字段内的文本
linktitle: 忽略字段内的文本
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 的“忽略字段内的文本”功能。
type: docs
weight: 10
url: /zh/net/find-and-replace-text/ignore-text-inside-fields/
---
在本文中，我们将探索上面的 C# 源代码，以了解如何使用 Aspose.Words for .NET 库中的忽略字段内的文本功能。当我们想在操作文档时忽略字段内的文本时，此功能很有用。

## 先决条件

- C# 语言的基础知识。
- 安装了 Aspose.Words 库的 .NET 开发环境。

## 第 1 步：创建新文档

在开始操作字段内的文本之前，我们需要使用 Aspose.Words for .NET 创建一个新文档。这可以通过实例化一个`Document`目的：

```csharp
Document doc = new Document();
```

## 第 2 步：插入一个包含文本的字段

一旦我们有了一个文档，我们就可以在其中插入一个包含文本的字段，使用`DocumentBuilder`目的。例如，要插入带有文本“Text in field”的“INCLUDETEXT”字段，我们可以使用`InsertField`方法：

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.InsertField("INCLUDETEXT", "Text in field");
```

## 第 3 步：使用忽略字段内的文本功能

要在后续操作中忽略字段内的文本，我们可以使用`FindReplaceOptions`对象并设置`IgnoreFields`财产给`true`:

```csharp
FindReplaceOptions options = new FindReplaceOptions { IgnoreFields = true };
```

## 第 4 步：使用正则表达式进行搜索和替换

要对文档的文本执行搜索和替换操作，我们将使用正则表达式。在我们的示例中，我们将搜索所有出现的字母“e”并将它们替换为星号“*“。我们将使用 .NET 的`Regex`为此类：

```csharp
Regex regex = new Regex("e");
doc.Range.Replace(regex, "*", options);
```

## 第 5 步：查看修改后的文档输出

应用搜索和替换后，我们可以使用`GetText`方法：

```csharp
Console.WriteLine(doc.GetText());
```

## 第 6 步：更改选项以包含字段

我们在输出结果中包含字段内的文本，我们可以更改选项以不忽略这些字段。为此，我们将设置`IgnoreFields`财产给`false`:

```csharp
options.IgnoreFields = false;
```

## 第 7 步：显示包含字段的修改后的文档

更改选项后，我们可以再次执行搜索和替换以获得包含字段内文本的结果：

```csharp
doc.Range.Replace(regex, "*", options);
Console.WriteLine(doc.GetText());
```

### 使用 Aspose.Words for .NET 忽略字段内文本的示例源代码

下面是完整的示例源代码，用于演示在 Aspose.Words for .NET 中使用忽略字段内的文本功能：

```csharp
    
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	//插入带有文本的字段。
	builder.InsertField("INCLUDETEXT", "Text in field");
	
	FindReplaceOptions options = new FindReplaceOptions { IgnoreFields = true };
	
	Regex regex = new Regex("e");
	doc.Range.Replace(regex, "*", options);
	
	Console.WriteLine(doc.GetText());

	options.IgnoreFields = false;
	doc.Range.Replace(regex, "*", options);
	
	Console.WriteLine(doc.GetText());
  
```

## 结论

在本文中，我们探索了 C# 源代码以了解如何在 Aspose.Words for .NET 中使用忽略字段内的文本功能。我们按照一步一步的指南创建了一个文档，插入一个里面有文本的字段，使用忽略字段内的文本功能，用正则表达式执行搜索和替换操作，并显示修改后的文档。
