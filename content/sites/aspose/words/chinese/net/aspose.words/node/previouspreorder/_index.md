---
title: Node.PreviousPreOrder
linktitle: PreviousPreOrder
articleTitle: PreviousPreOrder
second_title: 用于 .NET 的 Aspose.Words
description: Node PreviousPreOrder 方法. 根据先序树遍历算法获取前一个节点 在 C#.
type: docs
weight: 140
url: /zh/net/aspose.words/node/previouspreorder/
---
## Node.PreviousPreOrder method

根据先序树遍历算法获取前一个节点。

```csharp
public Node PreviousPreOrder(Node rootNode)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rootNode | Node | 遍历的顶节点（极限）。 |

### 返回值

预订顺序中的前一个节点。如果达到则为空*rootNode*。

## 例子

演示如何使用前序遍历算法遍历文档的节点树，并删除遇到的任何图像形状。

```csharp
Document doc = new Document(MyDir + "Images.docx");

Assert.AreEqual(9, 
    doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().Count(s => s.HasImage));

Node curNode = doc;
while (curNode != null)
{
    Node nextNode = curNode.NextPreOrder(doc);

    if (curNode.PreviousPreOrder(doc) != null && nextNode != null)
        Assert.AreEqual(curNode, nextNode.PreviousPreOrder(doc));

    if (curNode.NodeType == NodeType.Shape && ((Shape)curNode).HasImage)
        curNode.Remove();

    curNode = nextNode;
}

Assert.AreEqual(0,
    doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().Count(s => s.HasImage));
```

### 也可以看看

* class [Node](../)
* 命名空间 [Aspose.Words](../../../aspose.words/)
* 部件 [Aspose.Words](../../../)
