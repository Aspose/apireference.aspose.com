---
title: 枚举属性
linktitle: 枚举属性
second_title: Aspose.Words for .NET API 参考
description: 使用 Aspose.Words for .NET 枚举文档属性的分步指南。
type: docs
weight: 10
url: /zh/net/programming-with-document-properties/enumerate-properties/
---

在本教程中，我们将引导您通过 C# 源代码使用 Aspose.Words for .NET 枚举文档属性。此功能允许您访问文档的内置和自定义属性。

## 第 1 步：项目设置

首先，在您喜欢的 IDE 中创建一个新的 C# 项目。确保在您的项目中引用了 Aspose.Words for .NET 库。

## 第 2 步：装入文档

在此步骤中，我们将加载要列出其属性的 Word 文档。使用以下代码加载文档：

```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document(dataDir + "Properties.docx");
```

代替`"YOUR DOCUMENTS DIRECTORY"`使用文档所在目录的实际路径。

## 第 3 步：枚举属性

现在让我们列出文档属性，包括内置属性和自定义属性。使用以下代码：

```csharp
Console.WriteLine("1. Document name: {0}", doc.OriginalFileName);
Console.WriteLine("2. Built-in Properties");

foreach(DocumentProperty prop in doc.BuiltInDocumentProperties)
Console.WriteLine("{0}:{1}", prop.Name, prop.Value);

Console.WriteLine("3. Custom Properties");

foreach(DocumentProperty prop in doc.CustomDocumentProperties)
Console.WriteLine("{0}:{1}", prop.Name, prop.Value);
```

此代码显示文档名称，然后列出显示其名称和值的内置和自定义属性。

### 使用 Aspose.Words for .NET 枚举属性的示例源代码

```csharp

	//文档目录的路径。
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Properties.docx");
	
	Console.WriteLine("1. Document name: {0}", doc.OriginalFileName);
	Console.WriteLine("2. Built-in Properties");
	
	foreach (DocumentProperty prop in doc.BuiltInDocumentProperties)
		Console.WriteLine("{0} : {1}", prop.Name, prop.Value);

	Console.WriteLine("3. Custom Properties");
	
	foreach (DocumentProperty prop in doc.CustomDocumentProperties)
		Console.WriteLine("{0} : {1}", prop.Name, prop.Value);
		
```

请务必在`dataDir`多变的。

您现在已经学习了如何使用 Aspose.Words for .NET 枚举文档属性。按照本教程中提供的分步指南，您可以轻松访问和查看自己文档的属性。

