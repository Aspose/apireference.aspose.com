---
title: 删除分页符
linktitle: 删除分页符
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words Library for .NET 删除文档中的分页符。按照我们的分步指南进行无缝布局。
type: docs
weight: 10
url: /zh/net/remove-content/remove-page-breaks/
---
在本教程中，我们将探讨如何使用 Aspose.Words for .NET 库从文档中删除分页符。分页符有时会干扰文档的格式和布局，可能需要以编程方式删除它们。我们将提供分步指南，帮助您了解该过程并将其实施到您自己的 C# 项目中。

## 要求

在我们开始之前，请确保您拥有以下内容：

- C#编程语言的基础知识
- 安装了 Aspose.Words for .NET 库
- Visual Studio 或任何其他 C# 开发环境设置

## 第 1 步：设置环境

首先，在您首选的开发环境中创建一个新的 C# 项目。确保在您的项目中正确引用了 Aspose.Words for .NET 库。

## 第 2 步：装入文档

要从文档中删除分页符，我们首先需要将文档加载到内存中。以下代码演示了如何从特定目录加载文档：

```csharp
//文档目录的路径
string dataDir = "YOUR DOCUMENT DIRECTORY";

//装入文档
Document doc = new Document(dataDir + "your-document.docx");
```

代替`"YOUR DOCUMENT DIRECTORY"`使用文档的实际路径。

## 第 3 步：删除分页符

加载文档后，我们可以开始删除分页符。下面的代码片段演示了如何遍历文档中的所有段落、检查分页符并删除它们：

```csharp
NodeCollection paragraphs = doc.GetChildNodes(NodeType.Paragraph, true);

foreach (Paragraph para in paragraphs)
{
     //如果段落之前有分页符，则清除它
     if (para.ParagraphFormat.PageBreakBefore)
         para.ParagraphFormat.PageBreakBefore = false;

     //检查段落中的所有运行是否有分页符并将其删除
     foreach(Run run in para.Runs)
     {
         if (run.Text.Contains(ControlChar.PageBreak))
             run.Text = run.Text.Replace(ControlChar.PageBreak, string.Empty);
     }
}
```

上面的代码片段遍历文档中的所有段落，并检查每个段落之前是否有分页符。如果检测到分页符，则将其清除。然后，它检查段落中的每个运行是否有分页符并将其删除。

## 第 4 步：保存修改后的文档

去掉分页符后，我们需要保存修改后的文档。以下代码演示了如何将修改后的文档保存到特定位置：

```csharp
doc.Save(dataDir + "modified-document.docx", SaveFormat.Docx);
```

代替`"modified-document.docx"`使用您修改后的文档所需的名称。

### 使用 Aspose.Words for .NET 删除分页符的示例源代码 
```csharp

//文档目录的路径
string dataDir = "YOUR DOCUMENT DIRECTORY"; 
 
//装入文档
Document doc = new Document(dataDir + "your-document.docx");

NodeCollection paragraphs = doc.GetChildNodes(NodeType.Paragraph, true);

foreach (Paragraph para in paragraphs)
{
	//如果段落在设置之前有分页符，则将其清除。
	if (para.ParagraphFormat.PageBreakBefore)
		para.ParagraphFormat.PageBreakBefore = false;

	//检查段落中的所有运行是否有分页符并将其删除。
	foreach (Run run in para.Runs)
	{
		if (run.Text.Contains(ControlChar.PageBreak))
			run.Text = run.Text.Replace(ControlChar.PageBreak, string.Empty);
	}
}

doc.Save(dataDir + "modified-document.docx", SaveFormat.Docx);        

```

## 结论

在本教程中，我们学习了如何使用 Aspose.Words for .NET 库从文档中删除分页符。按照分步指南，您现在应该能够在自己的 C# 项目中实现此功能。删除分页符可以帮助您在文档中保持一致的布局和格式。
