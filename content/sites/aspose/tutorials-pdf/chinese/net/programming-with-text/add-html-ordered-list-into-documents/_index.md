---
title: 将 HTML 有序列表添加到文档中
linktitle: 将 HTMLOrdered 列表添加到文档中
second_title: Aspose.PDF for .NET API 参考
description: 了解如何使用 Aspose.PDF for .NET 将 HTML 有序列表添加到文档中。
type: docs
weight: 30
url: /zh/net/programming-with-text/add-html-ordered-list-into-documents/
---

在本教程中，您将学习如何使用 Aspose.PDF for .NET 库将 HTML 有序列表添加到文档中。提供的代码演示了完成此任务的必要步骤。

## 要求
在开始之前，请确保您具备以下条件：

- Visual Studio 或计算机上安装的任何其他 C# 编译器。
- Aspose.PDF for .NET 库。您可以从 Aspose 官方网站下载它或使用 NuGet 等包管理器来安装它。

## 第 1 步：设置项目
1. 在您首选的开发环境中创建一个新的 C# 项目。
2. 添加对 Aspose.PDF for .NET 库的引用。

## 第2步：导入所需的命名空间
在要添加 HTML 有序列表的代码文件中，在文件顶部添加以下 using 指令：

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Text;
```

## 第三步：设置文档目录和输出文件路径
在代码中，找到显示以下内容的行`string dataDir = "YOUR DOCUMENT DIRECTORY";`并替换`"YOUR DOCUMENT DIRECTORY"`以及存储文档的目录的路径。

接下来，找到显示以下内容的行：`string outFile = dataDir + "AddHTMLOrderedListIntoDocuments_out.pdf";`并替换`"AddHTMLOrderedListIntoDocuments_out.pdf"`以及输出 PDF 文件所需的名称。

## 步骤 4：创建一个新的 Document 对象
实例化一个新的`Document`对象，添加以下代码行：

```csharp
Document doc = new Document();
```

## 第 5 步：使用 HTML 内容创建 HtmlFragment 对象
实例化一个`HtmlFragment`包含要添加到文档中的 HTML 内容的对象。在提供的代码中，HTML 内容被分配给变量`t`。您可以根据需要修改 HTML 内容。

```csharp
HtmlFragment t = new HtmlFragment("`<body style='line-height: 100px;'><ul><li>First</li><li>Second</li><li>Third</li><li >Fourth</li><li>Fifth</li></ul>Text after the list.<br/>Next line<br/>Last line</body>`");
```

## 步骤 6：向文档添加页面
使用以下命令将新页面添加到文档中`Add`的方法`Pages`收藏。在提供的代码中，新页面被分配给变量`page`.

```csharp
Page page = doc.Pages.Add();
```

## 第7步：将HtmlFragment添加到页面
添加`HtmlFragment`通过使用来反对该页面`Add`的方法`Paragraphs`收藏。

```csharp
page.Paragraphs.Add(t);
```

## 步骤8：保存PDF文档
使用以下命令保存生成的 PDF 文件`Save`的方法`Document`目的。指定您在步骤 3 中设置的输出文件路径。

```csharp
doc.Save(outFile);
```

### 使用 Aspose.PDF for .NET 将 HTMLOrdered List 添加到文档中的示例源代码 
```csharp
//文档目录的路径。
string dataDir = "YOUR DOCUMENT DIRECTORY";
//输出文档的路径。
string outFile = dataDir + "AddHTMLOrderedListIntoDocuments_out.pdf";
//实例化文档对象
Document doc = new Document();
//使用相应的 HTML 片段实例化 HtmlFragment 对象
HtmlFragment t = new HtmlFragment("`<body style='line-height: 100px;'><ul><li>First</li><li>Second</li><li>Third</li><li>Fourth</li><li>Fifth</li></ul>Text after the list.<br/>Next line<br/>Last line</body>`");
//在页面集合中添加页面
Page page = doc.Pages.Add();
//在页面内添加HtmlFragment
page.Paragraphs.Add(t);
//保存生成的 PDF 文件
doc.Save(outFile);
```

## 结论
您已使用 Aspose.PDF for .NET 成功将 HTML 有序列表添加到文档中。现在可以在指定的输出文件路径中找到生成的 PDF 文件。

请记住根据您的具体要求自定义 HTML 内容并调整代码。