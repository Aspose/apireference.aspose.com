---
title: 使用 Dot Net Regex 搜索文本
linktitle: 使用 Dot Net Regex 搜索文本
second_title: Aspose.PDF for .NET API 参考
description: 了解如何使用 Aspose.PDF for .NET 在 PDF 文档中使用 .NET 正则表达式搜索文本。
type: docs
weight: 480
url: /zh/net/programming-with-text/search-text-with-dot-net-regex/
---

本教程介绍如何使用 Aspose.PDF for .NET 在 PDF 文档中使用 .NET 正则表达式搜索文本。提供的 C# 源代码逐步演示了该过程。

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
```

## 第三步：设置文档目录路径

使用以下命令设置文档目录的路径`dataDir`多变的：

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

代替`"YOUR DOCUMENT DIRECTORY"`与文档目录的实际路径。

## 步骤 4：创建 .NET Regex 对象

创建一个`.NET Regex`定义搜索模式的对象：

```csharp
System.Text.RegularExpressions.Regex regex = new System.Text.RegularExpressions.Regex(@"[\S]+");
```

代替`@"[\S]+"`与您想要的正则表达式模式。

## 第 5 步：加载 PDF 文档

使用加载 PDF 文档`Document`班级：

```csharp
Aspose.Pdf.Document document = new Aspose.Pdf.Document(dataDir + "SearchTextRegex.pdf");
```

代替`"SearchTextRegex.pdf"`与您的 PDF 文件的实际名称。

## 第6步：获取特定页面

获取文档所需的页面：

```csharp
Page page = document.Pages[1];
```

代替`1`与所需的页码（从 1 开始的索引）。

## 第7步：创建一个TextFragmentAbsorber

创建一个`TextFragmentAbsorber`对象查找输入正则表达式的所有实例：

```csharp
TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber(regex);
textFragmentAbsorber.TextSearchOptions.IsRegularExpressionUsed = true;
```

## 第 8 步：接受页面的吸收器

接受页面的吸收器：

```csharp
page.Accept(textFragmentAbsorber);
```

## 步骤9：检索提取的文本片段

使用以下命令获取提取的文本片段`TextFragments`的财产`TextFragmentAbsorber`目的：

```csharp
TextFragmentCollection textFragmentCollection = textFragmentAbsorber.TextFragments;
```

## 第 10 步：循环遍历文本片段

循环检索到的文本片段并执行所需的操作：

```csharp
foreach (TextFragment textFragment in textFragmentCollection)
{
	Console.WriteLine(textFragment.Text);
}
```

如果需要，修改循环内的代码以对每个文本片段执行进一步的操作。

### 使用 Aspose.PDF for .NET 使用 Dot Net Regex 搜索文本的示例源代码 
```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
//创建 Regex 对象来查找所有单词
System.Text.RegularExpressions.Regex regex = new System.Text.RegularExpressions.Regex(@"[\S]+");
//打开文档
Aspose.Pdf.Document document = new Aspose.Pdf.Document(dataDir + "SearchTextRegex.pdf");
//获取特定页面
Page page = document.Pages[1];
//创建 TextAbsorber 对象以查找输入正则表达式的所有实例
TextFragmentAbsorber textFragmentAbsorber = new TextFragmentAbsorber(regex);
textFragmentAbsorber.TextSearchOptions.IsRegularExpressionUsed = true;
//接受页面的吸收器
page.Accept(textFragmentAbsorber);
//获取提取的文本片段
TextFragmentCollection textFragmentCollection = textFragmentAbsorber.TextFragments;
//循环遍历片段
foreach (TextFragment textFragment in textFragmentCollection)
{
	Console.WriteLine(textFragment.Text);
}
```

## 结论

恭喜！您已成功学习如何使用 Aspose.PDF for .NET 在 PDF 文档中使用 .NET 正则表达式搜索文本。本教程提供了从设置项目到访问提取的文本片段的分步指南。现在，您可以将此代码合并到您自己的 C# 项目中，以在 PDF 文件中执行高级文本搜索。