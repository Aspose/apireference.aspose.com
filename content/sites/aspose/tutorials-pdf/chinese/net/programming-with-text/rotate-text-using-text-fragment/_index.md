---
title: 使用文本片段旋转文本
linktitle: 使用文本片段旋转文本
second_title: Aspose.PDF for .NET API 参考
description: 了解如何使用 Aspose.PDF for .NET 在 PDF 文档中使用文本片段旋转文本。
type: docs
weight: 390
url: /zh/net/programming-with-text/rotate-text-using-text-fragment/
---

本教程介绍如何使用 Aspose.PDF for .NET 通过文本片段旋转文本。提供的 C# 源代码逐步演示了该过程。

## 先决条件

在继续学习本教程之前，请确保您具备以下条件：

- C# 编程语言的基础知识。
- 安装了 Aspose.PDF for .NET 库。您可以从 Aspose 网站获取它或使用 NuGet 将其安装到您的项目中。

## 第 1 步：设置项目

首先在您首选的集成开发环境 (IDE) 中创建一个新的 C# 项目，并添加对 Aspose.PDF for .NET 库的引用。

## 第2步：导入必要的命名空间

在 C# 文件的开头添加以下 using 指令以导入所需的命名空间：

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Text;
using Aspose.Pdf.Text.TextBuilder;
```

## 步骤 3：创建 PDF 文档

初始化`Document`对象创建一个新的 PDF 文档：

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document pdfDocument = new Document();
```

确保更换`"YOUR DOCUMENT DIRECTORY"`与文档目录的实际路径。

## 第 4 步：添加页面

使用以下命令从文档中获取特定页面`Pages.Add()`方法：

```csharp
Page pdfPage = (Page)pdfDocument.Pages.Add();
```

## 第 5 步：创建文本片段

创建多个`TextFragment`对象，设置它们的文本和属性，并指定它们在页面上的位置：

```csharp
TextFragment textFragment1 = new TextFragment("main text");
textFragment1.Position = new Position(100, 600);
textFragment1.TextState.FontSize = 12;
textFragment1.TextState.Font = FontRepository.FindFont("TimesNewRoman");

TextFragment textFragment2 = new TextFragment("rotated text");
textFragment2.Position = new Position(200, 600);
textFragment2.TextState.FontSize = 12;
textFragment2.TextState.Font = FontRepository.FindFont("TimesNewRoman");
textFragment2.TextState.Rotation = 45;

TextFragment textFragment3 = new TextFragment("rotated text");
textFragment3.Position = new Position(300, 600);
textFragment3.TextState.FontSize = 12;
textFragment3.TextState.Font = FontRepository.FindFont("TimesNewRoman");
textFragment3.TextState.Rotation = 90;
```

根据需要调整文本、位置和其他属性。

## 第 6 步：创建 TextBuilder 并附加文本片段

创建一个`TextBuilder`对象使用`pdfPage`并将文本片段附加到 PDF 页面：

```csharp
TextBuilder textBuilder = new TextBuilder(pdfPage);
textBuilder.AppendText(textFragment1);
textBuilder.AppendText(textFragment2);
textBuilder.AppendText(textFragment3);
```

## 步骤7：保存PDF文档

使用以下命令将修改后的 PDF 文档保存到文件中`Save`方法：

```csharp
pdfDocument.Save(dataDir + "TextFragmentTests_Rotated1_out.pdf");
```

确保更换`"TextFragmentTests_Rotated1_out.pdf"`与所需的输出文件名。

### 使用 Aspose.PDF for .NET 使用文本片段旋转文本的示例源代码 
```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
//初始化文档对象
Document pdfDocument = new Document();
//获取特定页面
Page pdfPage = (Page)pdfDocument.Pages.Add();
//创建文本片段
TextFragment textFragment1 = new TextFragment("main text");
textFragment1.Position = new Position(100, 600);
//设置文本属性
textFragment1.TextState.FontSize = 12;
textFragment1.TextState.Font = FontRepository.FindFont("TimesNewRoman");
//创建旋转的文本片段
TextFragment textFragment2 = new TextFragment("rotated text");
textFragment2.Position = new Position(200, 600);
//设置文本属性
textFragment2.TextState.FontSize = 12;
textFragment2.TextState.Font = FontRepository.FindFont("TimesNewRoman");
textFragment2.TextState.Rotation = 45;
//创建旋转的文本片段
TextFragment textFragment3 = new TextFragment("rotated text");
textFragment3.Position = new Position(300, 600);
//设置文本属性
textFragment3.TextState.FontSize = 12;
textFragment3.TextState.Font = FontRepository.FindFont("TimesNewRoman");
textFragment3.TextState.Rotation = 90;
//创建 TextBuilder 对象
TextBuilder textBuilder = new TextBuilder(pdfPage);
//将文本片段附加到 PDF 页面
textBuilder.AppendText(textFragment1);
textBuilder.AppendText(textFragment2);
textBuilder.AppendText(textFragment3);
//保存文档
pdfDocument.Save(dataDir + "TextFragmentTests_Rotated1_out.pdf");
```

## 结论

恭喜！您已成功学习如何使用 Aspose.PDF for .NET 在 PDF 文档中使用文本片段来旋转文本。本教程提供了从创建文档到保存修改版本的分步指南。现在，您可以将此代码合并到您自己的 C# 项目中，以操作 PDF 文件中的文本旋转。