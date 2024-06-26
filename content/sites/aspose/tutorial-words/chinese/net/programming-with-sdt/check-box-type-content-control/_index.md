---
title: 复选框类型内容控件
linktitle: 复选框类型内容控件
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 在 Word 文档中创建复选框类型内容控件。
type: docs
weight: 10
url: /zh/net/programming-with-sdt/check-box-type-content-control/
---

本教程介绍如何使用 Aspose.Words for .NET 在 Word 文档中创建复选框类型内容控件。复选框内容控件允许用户选择或清除文档中的复选框。

## 先决条件
要学习本教程，您需要具备以下条件：

- 安装了 Aspose.Words for .NET 库。
- C# 的基本知识和使用 Word 文档。

## 第 1 步：设置文档目录
首先设置文档目录的路径。代替`"YOUR DOCUMENT DIRECTORY"`使用要保存文档的目录的实际路径。

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## 第 2 步：创建文档和 DocumentBuilder
创建一个新的实例`Document`类和一个`DocumentBuilder`构建文档的内容。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## 第 3 步：添加复选框类型内容控件
创建一个`StructuredDocumentTag`和`SdtType.Checkbox`表示复选框内容控件。指定`MarkupLevel.Inline`将其放在文本中。

```csharp
StructuredDocumentTag sdtCheckBox = new StructuredDocumentTag(doc, SdtType.Checkbox, MarkupLevel.Inline);
builder.InsertNode(sdtCheckBox);
```

## 第 4 步：保存文档
使用 将文档保存到指定目录`Save`方法。提供具有适当文件扩展名的所需文件名。在此示例中，我们将文档保存为“WorkingWithSdt.CheckBoxTypeContentControl.docx”。

```csharp
doc.Save(dataDir + "WorkingWithSdt.CheckBoxTypeContentControl.docx", SaveFormat.Docx);
```

### 使用 Aspose.Words for .NET 的复选框类型内容控件的示例源代码 

```csharp
	//文档目录的路径
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	StructuredDocumentTag sdtCheckBox = new StructuredDocumentTag(doc, SdtType.Checkbox, MarkupLevel.Inline);
	builder.InsertNode(sdtCheckBox);
	doc.Save(dataDir + "WorkingWithSdt.CheckBoxTypeContentControl.docx", SaveFormat.Docx);
```

就是这样！您已经使用 Aspose.Words for .NET 在您的 Word 文档中成功创建了一个复选框类型内容控件。