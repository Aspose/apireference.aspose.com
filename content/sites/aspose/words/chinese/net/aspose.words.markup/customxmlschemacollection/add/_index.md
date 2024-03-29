---
title: CustomXmlSchemaCollection.Add
linktitle: Add
articleTitle: Add
second_title: 用于 .NET 的 Aspose.Words
description: CustomXmlSchemaCollection Add 方法. 将项目添加到集合中 在 C#.
type: docs
weight: 30
url: /zh/net/aspose.words.markup/customxmlschemacollection/add/
---
## CustomXmlSchemaCollection.Add method

将项目添加到集合中。

```csharp
public void Add(string value)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | String | 要添加的项目。 |

## 例子

展示如何使用 XML 架构集合。

```csharp
Document doc = new Document();

string xmlPartId = Guid.NewGuid().ToString("B");
string xmlPartContent = "<root><text>Hello, World!</text></root>";
CustomXmlPart xmlPart = doc.CustomXmlParts.Add(xmlPartId, xmlPartContent);

// 添加 XML 模式关联。
xmlPart.Schemas.Add("http://www.w3.org/2001/XMLSchema");

// 克隆自定义 XML 部分的 XML 模式关联集合，
// 然后将几个新模式添加到克隆中。
CustomXmlSchemaCollection schemas = xmlPart.Schemas.Clone();
schemas.Add("http://www.w3.org/2001/XMLSchema-instance");
schemas.Add("http://schemas.microsoft.com/office/2006/metadata/contentType");

Assert.AreEqual(3, schemas.Count);
Assert.AreEqual(2, schemas.IndexOf("http://schemas.microsoft.com/office/2006/metadata/contentType"));

// 枚举模式并打印每个元素。
using (IEnumerator<string> enumerator = schemas.GetEnumerator())
{
    while (enumerator.MoveNext())
        Console.WriteLine(enumerator.Current);
}

// 以下是从集合中删除模式的三种方法。
// 1 - 按索引删除模式：
schemas.RemoveAt(2);

// 2 - 按值删除模式：
schemas.Remove("http://www.w3.org/2001/XMLSchema");

// 3 - 使用“Clear”方法立即清空集合。
schemas.Clear();

Assert.AreEqual(0, schemas.Count);
```

### 也可以看看

* class [CustomXmlSchemaCollection](../)
* 命名空间 [Aspose.Words.Markup](../../../aspose.words.markup/)
* 部件 [Aspose.Words](../../../)
