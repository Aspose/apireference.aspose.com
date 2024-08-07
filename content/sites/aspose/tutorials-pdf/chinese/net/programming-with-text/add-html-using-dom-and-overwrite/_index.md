---
title: 使用 DOM 添加 HTML 并覆盖
linktitle: 使用 DOM 添加 HTML 并覆盖
second_title: Aspose.PDF for .NET API 参考
description: 了解如何在 Aspose.PDF for .NET 中使用 DOM 添加 HTML 内容。
type: docs
weight: 50
url: /zh/net/programming-with-text/add-html-using-dom-and-overwrite/
---

本教程将指导您完成在 Aspose.PDF for .NET 中使用 DOM（文档对象模型）添加 HTML 内容的过程。此外，您还将了解如何覆盖 HTML 内容的样式。提供的 C# 源代码演示了必要的步骤。

## 要求
在开始之前，请确保您具备以下条件：

- Visual Studio 或计算机上安装的任何其他 C# 编译器。
- Aspose.PDF for .NET 库。您可以从 Aspose 官方网站下载它或使用 NuGet 等包管理器来安装它。

## 第 1 步：设置项目
1. 在您首选的开发环境中创建一个新的 C# 项目。
2. 添加对 Aspose.PDF for .NET 库的引用。

## 第2步：导入所需的命名空间
在要添加 HTML 内容的代码文件中，在文件顶部添加以下 using 指令：

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Text;
```

## 第三步：设置文档目录和输出文件路径
在代码中，找到显示以下内容的行`string dataDir = "YOUR DOCUMENT DIRECTORY";`并替换`"YOUR DOCUMENT DIRECTORY"`以及存储文档的目录的路径。

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## 步骤 4：创建一个新的 Document 对象
实例化一个新的`Document`对象，添加以下代码行：

```csharp
Document doc = new Document();
```

## 步骤 5：向文档添加页面
使用以下命令将新页面添加到文档中`Add`的方法`Pages`收藏。在提供的代码中，新页面被分配给变量`page`.

```csharp
Page page = doc.Pages.Add();
```

## 第 6 步：使用 HTML 内容创建 HtmlFragment
实例化一个`HtmlFragment`对象并提供所需的 HTML 内容。在提供的代码中，HTML 内容被分配给变量`title`。您可以根据需要修改 HTML 内容。

```csharp
HtmlFragment title = new HtmlFragment("<p style='font-family: Verdana'><b><i>Table contains text</i></b></p>");
```

## 步骤 7：覆盖 HTML 内容的样式
要覆盖 HTML 内容的样式，您可以修改`TextState`的属性`HtmlFragment`目的。在提供的代码中，字体系列更改为“Arial”，字体大小设置为 20。

```csharp
title. TextState = new TextState("Arial");
title.TextState.FontSize = 20;
```

## 步骤8：设置保证金信息
如有必要，调整 HTML 片段的底部和顶部边距。在提供的代码中，底部边距设置为 10，顶部边距设置为 400。

```csharp
title. Margin. Bottom = 10;
title. Margin. Top = 400;
```

## 第9步：将HtmlFragment添加到页面
添加`HtmlFragment`对象页面的段落集合。

```csharp
page.Paragraphs.Add(title);
```

## 第10步：保存PDF文档
使用以下命令保存 PDF 文档`Save`的方法`Document`目的。指定您在步骤 3 中设置的输出文件路径。

```csharp
dataDir = dataDir + "AddHTMLUsingDOMAndOverwrite_out.pdf";
doc.Save(dataDir);
```

### 使用 DOM 添加 HTML 并使用 Aspose.PDF for .NET 覆盖的示例源代码 
```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENT DIRECTORY";
//实例化文档对象
Document doc = new Document();
//将页面添加到 PDF 文件的页面集合中
Page page = doc.Pages.Add();
//使用 HTML 内容实例化 HtmlFragment
HtmlFragment title = new HtmlFragment("<p style='font-family: Verdana'><b><i>Table contains text</i></b></p>");
//“Verdana”的字体系列将重置为“Arial”
title.TextState = new TextState("Arial");
title.TextState.FontSize = 20;
//设置下边距信息
title.Margin.Bottom = 10;
//设置上边距信息
title.Margin.Top = 400;
//将 HTML 片段添加到页面的段落集合中
page.Paragraphs.Add(title);
//保存 PDF 文件
dataDir = dataDir + "AddHTMLUsingDOMAndOverwrite_out.pdf";
//保存 PDF 文件
doc.Save(dataDir);
```

## 结论
您已在 Aspose.PDF for .NET 中使用 DOM 成功添加 HTML 内容并覆盖 HTML 内容的样式。现在可以在指定的输出文件路径中找到生成的 PDF 文件。