---
title: 全部提取文本
linktitle: 全部提取文本
second_title: Aspose.PDF for .NET API 参考
description: 了解如何使用 Aspose.PDF for .NET 从 PDF 文档中提取所有文本。
type: docs
weight: 180
url: /zh/net/programming-with-text/extract-text-all/
---

本教程将指导您完成使用 Aspose.PDF for .NET 从 PDF 文档中提取所有文本的过程。提供的 C# 源代码演示了必要的步骤。

## 要求
在开始之前，请确保您具备以下条件：

- Visual Studio 或计算机上安装的任何其他 C# 编译器。
- Aspose.PDF for .NET 库。您可以从 Aspose 官方网站下载它或使用 NuGet 等包管理器来安装它。

## 第 1 步：设置项目
1. 在您首选的开发环境中创建一个新的 C# 项目。
2. 添加对 Aspose.PDF for .NET 库的引用。

## 第2步：导入所需的命名空间
在要提取文本的代码文件中，在文件顶部添加以下 using 指令：

```csharp
using Aspose.Pdf;
using System.IO;
```

## 第三步：设置文档目录
在代码中，找到显示以下内容的行`string dataDir = "YOUR DOCUMENT DIRECTORY";`并替换`"YOUR DOCUMENT DIRECTORY"`以及存储文档的目录的路径。

## 步骤 4：打开 PDF 文档
使用以下命令打开现有 PDF 文档`Document`构造函数并将路径传递给输入 PDF 文件。

```csharp
Document pdfDocument = new Document(dataDir + "ExtractTextAll.pdf");
```

## 第 5 步：提取所有文本
创建一个`TextAbsorber`对象从文档中提取文本。然后，接受所有页面的吸收器。

```csharp
TextAbsorber textAbsorber = new TextAbsorber();
pdfDocument.Pages.Accept(textAbsorber);
```

## 第6步：获取提取的文本
访问提取的文本`TextAbsorber`目的。

```csharp
string extractedText = textAbsorber.Text;
```

## 第7步：保存提取的文本
创建一个`TextWriter`并打开要保存提取文本的文件。将提取的文本写入文件并关闭流。

```csharp
TextWriter tw = new StreamWriter(dataDir + "extracted-text.txt");
tw.WriteLine(extractedText);
tw. Close();
```

### 使用 Aspose.PDF for .NET 提取全部文本的示例源代码 
```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENT DIRECTORY";
//打开文档
Document pdfDocument = new Document(dataDir + "ExtractTextAll.pdf");
//创建 TextAbsorber 对象来提取文本
TextAbsorber textAbsorber = new TextAbsorber();
//接受所有页面的吸收器
pdfDocument.Pages.Accept(textAbsorber);
//获取提取的文本
string extractedText = textAbsorber.Text;
//创建编写器并打开文件
TextWriter tw = new StreamWriter(dataDir + "extracted-text.txt");
//将一行文本写入文件
tw.WriteLine(extractedText);
//关闭流
tw.Close();
```

## 结论
您已使用 Aspose.PDF for .NET 成功从 PDF 文档中提取了所有文本。提取的文本已保存到指定的输出文件中。