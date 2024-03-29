---
title: CompositeNode1.GetChildNodes
second_title: Aspose.Note for .NET API Reference
description: CompositeNode method. Get all child nodes by the node type
type: docs
weight: 70
url: /net/aspose.note/compositenode-1/getchildnodes/
---
## CompositeNode&lt;T&gt;.GetChildNodes&lt;T1&gt; method

Get all child nodes by the node type.

```csharp
public override List<T1> GetChildNodes<T1>()
    where T1 : class, INode
```

| Parameter | Description |
| --- | --- |
| T1 | The type of elements in the returned list. |

### Return Value

A list of child nodes.

## Examples

Shows how to get an image from a document.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Images();

// Load the document into Aspose.Note.
Document oneFile = new Document(dataDir + "Aspose.one");

// Get all Image nodes
IList<Aspose.Note.Image> nodes = oneFile.GetChildNodes<Aspose.Note.Image>();

foreach (Aspose.Note.Image image in nodes)
{
    using (MemoryStream stream = new MemoryStream(image.Bytes))
    {
        using (Bitmap bitMap = new Bitmap(stream))
        {
            // Save image bytes to a file
            bitMap.Save(String.Format(dataDir + "{0}", Path.GetFileName(image.FileName)));
        }
    }
}
```

Shows how to get image's meta information.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Images();

// Load the document into Aspose.Note.
Document oneFile = new Document(dataDir + "Aspose.one");

// Get all Image nodes
IList<Aspose.Note.Image> images = oneFile.GetChildNodes<Aspose.Note.Image>();

foreach (Aspose.Note.Image image in images)
{
    Console.WriteLine("Width: {0}", image.Width);
    Console.WriteLine("Height: {0}", image.Height);
    Console.WriteLine("OriginalWidth: {0}", image.OriginalWidth);
    Console.WriteLine("OriginalHeight: {0}", image.OriginalHeight);
    Console.WriteLine("FileName: {0}", image.FileName);
    Console.WriteLine("LastModifiedTime: {0}", image.LastModifiedTime);
    Console.WriteLine();
}
```

### See Also

* interface [INode](../../inode/)
* class [CompositeNode&lt;T&gt;](../)
* namespace [Aspose.Note](../../compositenode-1/)
* assembly [Aspose.Note](../../../)


