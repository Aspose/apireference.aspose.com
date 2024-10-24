---
title: 指定行距
linktitle: 指定行距
second_title: Aspose.PDF for .NET API 参考
description: 了解如何使用 Aspose.PDF for .NET 在 PDF 文档中指定行距。
type: docs
weight: 510
url: /zh/net/programming-with-text/specify-line-spacing/
---

本教程介绍如何使用 Aspose.PDF for .NET 在 PDF 文档中指定行距。提供的 C# 源代码逐步演示了该过程。

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
using System.IO;
```

## 第三步：设置文档目录路径

使用以下命令设置文档目录的路径`dataDir`多变的：

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

代替`"YOUR DOCUMENT DIRECTORY"`与文档目录的实际路径。

## 第 4 步：加载输入的 PDF 文件

使用以下命令加载输入 PDF 文件`Document`班级：

```csharp
Document doc = new Document();
```

## 第 5 步：创建 TextFormattingOptions

创建一个`TextFormattingOptions`对象并将行距模式设置为`FullSize`:

```csharp
TextFormattingOptions formattingOptions = new TextFormattingOptions();
formattingOptions.LineSpacing = TextFormattingOptions.LineSpacingMode.FullSize;
```

## 第 6 步：创建一个 TextFragment

创建一个`TextFragment`对象并指定文本内容：

```csharp
TextFragment textFragment = new TextFragment("Hello world");
```

## 第7步：加载字体文件（可选）

如果要在文本中使用特定字体，请将 TrueType 字体文件加载到`FileStream`目的：

```csharp
string fontFile = dataDir + "HPSimplified.TTF";
using (FileStream fontStream = File.OpenRead(fontFile))
{
    textFragment.TextState.Font = FontRepository.OpenFont(fontStream, FontTypes.TTF);
}
```

代替`"HPSimplified.TTF"`与实际的字体文件名。

## 第8步：指定文本位置和行距

设置文本片段的位置并分配`TextFormattingOptions`到`TextState.FormattingOptions`财产：

```csharp
textFragment.Position = new Position(100, 600);
textFragment.TextState.FormattingOptions = formattingOptions;
```

## 步骤 9：将文本添加到文档中

将文本片段添加到文档中，方法是将其附加到`TextBuilder`或直接到页面`Paragraphs`收藏：

```csharp
var page = doc.Pages.Add();
page.Paragraphs.Add(textFragment);
```

## 第10步：保存生成的PDF文档

保存修改后的PDF文档：

```csharp
dataDir = dataDir + "SpecifyLineSpacing_out.pdf";
doc.Save(dataDir);
```

确保更换`"SpecifyLineSpacing_out.pdf"`与所需的输出文件名。

### 使用 Aspose.PDF for .NET 指定行距的示例源代码 
```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENT DIRECTORY";
string fontFile = dataDir + "HPSimplified.TTF";
//加载输入 PDF 文件
Document doc = new Document();
//使用 LineSpacingMode.FullSize 创建 TextFormattingOptions
TextFormattingOptions formattingOptions = new TextFormattingOptions();
formattingOptions.LineSpacing = TextFormattingOptions.LineSpacingMode.FullSize;
//为文档第一页创建文本生成器对象
//TextBuilder textBuilder = new TextBuilder(doc.Pages[1]);
//使用示例字符串创建文本片段
TextFragment textFragment = new TextFragment("Hello world");
if (fontFile != "")
{
	//将 TrueType 字体加载到流对象中
	using (FileStream fontStream = System.IO.File.OpenRead(fontFile))
	{
		//设置文本字符串的字体名称
		textFragment.TextState.Font = FontRepository.OpenFont(fontStream, FontTypes.TTF);
		//指定文本片段的位置
		textFragment.Position = new Position(100, 600);
		//将当前片段的 TextFormattingOptions 设置为预定义（指向 LineSpacingMode.FullSize）
		textFragment.TextState.FormattingOptions = formattingOptions;
		//将文本添加到 TextBuilder，以便可以将其放置在 PDF 文件上
		//textBuilder.AppendText(textFragment);
		var page = doc.Pages.Add();
		page.Paragraphs.Add(textFragment);
	}
	dataDir = dataDir + "SpecifyLineSpacing_out.pdf";
	//保存生成的 PDF 文档
	doc.Save(dataDir);
}
```

## 结论

恭喜！您已成功学习如何使用 Aspose.PDF for .NET 在 PDF 文档中指定行距。本教程提供了从设置项目到保存修改后的文档的分步指南。现在，您可以将此代码合并到您自己的 C# 项目中，以自定义 PDF 文件中文本的行距。