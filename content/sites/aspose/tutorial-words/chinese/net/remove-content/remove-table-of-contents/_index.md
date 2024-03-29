---
title: 删除目录
linktitle: 删除目录
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 从 Word 文档中删除目录。
type: docs
weight: 10
url: /zh/net/remove-content/remove-table-of-contents/
---

在本教程中，我们将向您介绍如何使用 .NET 的 Aspose.Words 库从 Word 文档中删除目录。目录有时可能是多余的或不必要的，这段代码将帮助您有效地删除它。我们将提供分步指南，帮助您理解和实现您自己的 .NET 项目中的代码。

## 先决条件
在开始之前，请确保您拥有以下物品：
- C# 编程语言的应用知识
- 项目中安装的 .NET 的 Aspose.Words 库
- 包含要删除的目录的 Word 文档

## 第一步：定义文档目录
首先，您需要将目录路径设置为您的 Word 文档所在的位置。代替`"YOUR DOCUMENT DIRECTORY"`在具有适当路径的代码中。

```csharp
//文档目录的路径
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## 第二步：上传文件
接下来，我们将把 Word 文档加载到`Document`类使用`Load`方法。

```csharp
//装入文档
Document doc = new Document(dataDir + "your-document.docx");
```

## 第 3 步：删除目录
要删除目录，我们将遍历 TOC（目录）类型`FieldStart`文档中的节点。我们将存储这些节点，以便我们可以快速访问它们并创建要删除的节点列表。

```csharp
//将 TOC 字段的 FieldStart 节点存储在文档中，以便快速访问。
List<FieldStart> fieldStarts = new List<FieldStart>();
//这是一个列表，用于存储在指定目录中找到的节点。它们将在此方法结束时被删除。
List<Node> nodeList = new List<Node>();

foreach(FieldStart start in doc.GetChildNodes(NodeType.FieldStart, true))
{
     if (start.FieldType == FieldType.FieldTOC)
     {
         fieldStarts.Add(start);
     }
}

//检查指定的 TOC 索引是否存在。
if (index > fieldStarts.Count - 1)
     throw new ArgumentOutOfRangeException("TOC index is out of range");

bool isRemoving = true;

Node currentNode = fieldStarts[index];
while (isRemoving)
{
     //存储这些节点并在最后将它们全部删除会更安全。
     nodeList.Add(currentNode);
     currentNode = currentNode.NextPreOrder(doc);

     //当我们遇到 FieldTOC 类型的 FieldEnd 节点时，
     //我们知道我们在当前 TOC 的末尾，我们就到此为止。
     if (currentNode.NodeType == NodeType.FieldEnd)
     {
         FieldEnd fieldEnd = (FieldEnd)currentNode;
         if (fieldEnd.FieldType == FieldType.FieldTOC)


             isRemoving = false;
     }
}

foreach(Node node in nodeList)
{
     node. Remove();
}

doc.Save(dataDir + "modified-document.docx", SaveFormat.Docx);
```


### 使用 Aspose.Words for .NET 删除目录的示例源代码 
```csharp

//文档目录的路径
string dataDir = "YOUR DOCUMENT DIRECTORY"; 
 
//装入文档
Document doc = new Document(dataDir + "your-document.docx");

//将 TOC 字段的 FieldStart 节点存储在文档中以便快速访问。
List<FieldStart> fieldStarts = new List<FieldStart>();
//这是一个列表，用于存储在指定目录中找到的节点。它们将在此方法结束时被删除。
List<Node> nodeList = new List<Node>();

foreach (FieldStart start in doc.GetChildNodes(NodeType.FieldStart, true))
{
	if (start.FieldType == FieldType.FieldTOC)
	{
		fieldStarts.Add(start);
	}
}

//确保传递的索引指定的 TOC 存在。
if (index > fieldStarts.Count - 1)
	throw new ArgumentOutOfRangeException("TOC index is out of range");

bool isRemoving = true;

Node currentNode = fieldStarts[index];
while (isRemoving)
{
	//将这些节点存储起来，以后一次性全部删除比较安全。
	nodeList.Add(currentNode);
	currentNode = currentNode.NextPreOrder(doc);

	//一旦我们遇到 FieldTOC 类型的 FieldEnd 节点，
	//我们知道我们在当前目录的末尾并在这里停止。
	if (currentNode.NodeType == NodeType.FieldEnd)
	{
		FieldEnd fieldEnd = (FieldEnd) currentNode;
		if (fieldEnd.FieldType == FieldType.FieldTOC)
			isRemoving = false;
	}
}

foreach (Node node in nodeList)
{
	node.Remove();
}

doc.Save(dataDir + "modified-document.docx", SaveFormat.Docx);
        
```

## 结论
在本教程中，我们介绍了使用 .NET 的 Aspose.Words 库从 Word 文档中删除目录的分步指南。按照提供的代码和说明，您可以轻松地删除目录并改进文档的布局。请记住调整目录路径和文件名以满足您的特定需求。