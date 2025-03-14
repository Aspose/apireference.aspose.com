---
title: Class RevisionSummary
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.RevisionSummary class. Represents a summary for nodes revision
type: docs
weight: 600
url: /net/aspose.note/revisionsummary/
---
## RevisionSummary class

Represents a summary for node's revision.

```csharp
public class RevisionSummary
```

## Constructors

| Name | Description |
| --- | --- |
| [RevisionSummary](revisionsummary/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [AuthorMostRecent](../../aspose.note/revisionsummary/authormostrecent/) { get; set; } | Gets or sets the most recent author. |
| [LastModifiedTime](../../aspose.note/revisionsummary/lastmodifiedtime/) { get; set; } | Gets or sets the last modified time. |

## Examples

Shows how to edit page's meta information.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Pages();

// Load OneNote document and get first child           
Document document = new Document(dataDir + "Aspose.one");
Page page = document.FirstChild;

// Reading Content Revision Summary for this page
var pageRevisionInfo = page.PageContentRevisionSummary;

Console.WriteLine(string.Format(
    "Author:\t{0}\nModified:\t{1}",
    pageRevisionInfo.AuthorMostRecent,
    pageRevisionInfo.LastModifiedTime.ToString("dd.MM.yyyy HH:mm:ss")));

// Update Page Revision Summary for this page
pageRevisionInfo.AuthorMostRecent = "New Author";
pageRevisionInfo.LastModifiedTime = DateTime.Now;

document.Save(dataDir + "WorkingWithPageRevisions_out.one");
```

Shows how to check if a page is a conflict page(i.e. it has changes that OneNote couldn't automatically merge).

```csharp
string dataDir = RunExamples.GetDataDir_Pages();

// Load OneNote document
Document doc = new Document(dataDir + "Aspose.one", new LoadOptions { LoadHistory = true });

var history = doc.GetPageHistory(doc.FirstChild);
for (int i = 0; i < history.Count; i++)
{
    var historyPage = history[i];
    Console.Write("    {0}. Author: {1}, {2:dd.MM.yyyy hh.mm.ss}",
                    i,
                    historyPage.PageContentRevisionSummary.AuthorMostRecent,
                    historyPage.PageContentRevisionSummary.LastModifiedTime);
    Console.WriteLine(historyPage.IsConflictPage ? ", IsConflict: true" : string.Empty);

    // By default conflict pages are just skipped on saving.
    // If mark it as non-conflict then it will be saved as usual one in the history.
    if (historyPage.IsConflictPage)
        historyPage.IsConflictPage = false;
}

doc.Save(dataDir + "ConflictPageManipulation_out.one", SaveFormat.One);
```

### See Also

* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


