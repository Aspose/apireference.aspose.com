---
title: RichText.Tags
second_title: Aspose.Note for .NET API Reference
description: RichText property. Gets the list of all tags of a paragraph
type: docs
weight: 120
url: /net/aspose.note/richtext/tags/
---
## RichText.Tags property

Gets the list of all tags of a paragraph.

```csharp
public List<ITag> Tags { get; }
```

## Examples

Shows how to access details of outlook's tasks.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tasks();

// Load the document into Aspose.Note.
Document oneFile = new Document(dataDir + "Aspose.one");

// Get all RichText nodes
IList<RichText> nodes = oneFile.GetChildNodes<RichText>();

// Iterate through each node
foreach (RichText richText in nodes)
{
    var tasks = richText.Tags.OfType<NoteTask>();
    if (tasks.Any())
    {
        Console.WriteLine($"Task: {richText.Text}");
        foreach (var noteTask in tasks)
        {
            // Retrieve properties
            Console.WriteLine($"    Completed Time: {noteTask.CompletedTime}");
            Console.WriteLine($"    Create Time: {noteTask.CreationTime}");
            Console.WriteLine($"    Due Date: {noteTask.DueDate}");
            Console.WriteLine($"    Status: {noteTask.Status}");
            Console.WriteLine($"    Icon: {noteTask.Icon}");
        }
    }
}
```

### See Also

* interface [ITag](../../itag/)
* class [RichText](../)
* namespace [Aspose.Note](../../richtext/)
* assembly [Aspose.Note](../../../)


