---
title: Docx 转 PDF
linktitle: Docx 转 PDF
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 将 Word 文档从 Docx 转换为 PDF。带示例源代码的分步教程。
type: docs
weight: 10
url: /zh/net/basic-conversions/docx-to-pdf/
---

在这个循序渐进的教程中，我们将指导您如何使用 Aspose.Words for .NET 将 Docx 格式的 Word 文档转换为 PDF。我们将解释提供的 C# 源代码，并向您展示如何在您自己的项目中实现它。

要开始，请确保您已在开发环境中安装和设置 Aspose.Words for .NET。如果您还没有这样做，请从官方网站下载并安装该库。

## 第 1 步：初始化文档对象

首先，初始化`Document`带有 Docx 格式源文档路径的对象：

```csharp
Document doc = new Document(MyDir + "Document.docx");
```

## 第 2 步：将文档保存为 PDF 格式

接下来，通过调用`Save`上的方法`Document`对象并提供输出 PDF 文档的路径和文件名：

```csharp
doc.Save(MyDir + "BaseConversions.DocxToPdf.pdf");
```

就是这样！您已经使用 Aspose.Words for .NET 成功地将 Docx 格式的 Word 文档转换为 PDF。

### 使用 Aspose.Words for .NET 的 Docx To Pdf 示例源代码

```csharp

	Document doc = new Document(MyDir + "Document.docx");

	doc.Save(MyDir + "BaseConversions.DocxToPdf.pdf");
	
```

随意在您自己的项目中使用此代码，并根据您的特定要求对其进行修改。
