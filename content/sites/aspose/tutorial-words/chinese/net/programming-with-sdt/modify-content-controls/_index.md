---
title: 修改内容控件
linktitle: 修改内容控件
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 修改 Word 文档内容控件中的文本、下拉列表和图像。
type: docs
weight: 10
url: /zh/net/programming-with-sdt/modify-content-controls/
---

本教程解释了如何使用 Aspose.Words for .NET 修改 Word 文档中不同类型的内容控件。您可以更新文本、下拉列表的选定值，或替换内容控件中的图像。

## 先决条件
要学习本教程，您需要具备以下条件：

- 安装了 Aspose.Words for .NET 库。
- C# 的基本知识和使用 Word 文档。

## 第 1 步：设置文档目录
首先设置文档目录的路径。代替`"YOUR DOCUMENT DIRECTORY"`使用文档所在目录的实际路径。

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## 第 2 步：加载文档并迭代内容控件
使用`Document`构造函数，将文档的路径作为参数传递。使用 a 遍历文档中的所有结构化文档标签`foreach`环形。

```csharp
Document doc = new Document(dataDir + "Structured document tags.docx");
foreach (StructuredDocumentTag sdt in doc.GetChildNodes(NodeType.StructuredDocumentTag, true))
{
    //根据内容控件的类型执行操作
}
```

## 第三步：修改纯文本内容控件
对于类型的内容控件`SdtType.PlainText`，删除所有现有子项，创建一个新段落，并附加一个包含所需文本的段落。

```csharp
case SdtType.PlainText:
{
    sdt.RemoveAllChildren();
    Paragraph para = sdt.AppendChild(new Paragraph(doc)) as Paragraph;
    Run run = new Run(doc, "new text goes here");
    para.AppendChild(run);
    break;
}
```

## 第四步：修改下拉列表内容控件
对于类型的内容控件`SdtType.DropDownList` 通过将所选值设置为特定值来更新所选值`SdtListItem`.

```csharp
case SdtType.DropDownList:
{
    SdtListItem secondItem = sdt.ListItems[2];
    sdt.ListItems.SelectedValue = secondItem;
    break;
}
```

## 第五步：修改图片内容控件
对于类型的内容控件`SdtType.Picture`检索内容控件中的形状并将其图像替换为新图像。

```csharp
case SdtType.Picture:
{
    Shape shape = (Shape)sdt.GetChild(NodeType.Shape, 0, true);
    if (shape.HasImage)
    {
        shape.ImageData.SetImage(ImagesDir + "Watermark.png");
    }
    break;
}
```

## 第 6 步：保存修改后的文档
使用 将修改后的文档保存到指定目录`Save`方法。提供具有适当文件扩展名的所需文件名。在本例中，我们将文档保存为“WorkingWithSdt.ModifyContentControls.docx”。

```csharp
doc.Save(dataDir + "WorkingWithSdt.ModifyContentControls.docx");
```

### 使用 Aspose.Words for .NET 修改内容控件的示例源代码 

```csharp
	//文档目录的路径
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Structured document tags.docx");
	foreach (StructuredDocumentTag sdt in doc.GetChildNodes(NodeType.StructuredDocumentTag, true))
	{
		switch (sdt.SdtType)
		{
			case SdtType.PlainText:
			{
				sdt.RemoveAllChildren();
				Paragraph para = sdt.AppendChild(new Paragraph(doc)) as Paragraph;
				Run run = new Run(doc, "new text goes here");
				para.AppendChild(run);
				break;
			}
			case SdtType.DropDownList:
			{
				SdtListItem secondItem = sdt.ListItems[2];
				sdt.ListItems.SelectedValue = secondItem;
				break;
			}
			case SdtType.Picture:
			{
				Shape shape = (Shape) sdt.GetChild(NodeType.Shape, 0, true);
				if (shape.HasImage)
				{
					shape.ImageData.SetImage(ImagesDir + "Watermark.png");
				}
				break;
			}
		}
	}
	doc.Save(dataDir + "WorkingWithSdt.ModifyContentControls.docx");

```

就是这样！您已经使用 Aspose.Words for .NET 成功修改了 Word 文档中不同类型的内容控件。