---
title: Class CheckBox
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.CheckBox class. The base class for tags that can toggle their state between complete and incomplete
type: docs
weight: 20
url: /net/aspose.note/checkbox/
---
## CheckBox class

The base class for tags that can toggle their state between complete and incomplete.

```csharp
public abstract class CheckBox : ITag
```

## Properties

| Name | Description |
| --- | --- |
| [Checked](../../aspose.note/checkbox/checked/) { get; } | Gets a value indicating whether the CheckBox is in the checked state. |
| [CompletedTime](../../aspose.note/checkbox/completedtime/) { get; } | Gets or sets the completed time. |
| [CreationTime](../../aspose.note/checkbox/creationtime/) { get; set; } | Gets or sets the creation time. |
| abstract [Icon](../../aspose.note/checkbox/icon/) { get; } | Gets or sets the icon. |
| [Label](../../aspose.note/checkbox/label/) { get; } | Gets the label text. |
| [Status](../../aspose.note/checkbox/status/) { get; } | Gets or sets the status. |

## Methods

| Name | Description |
| --- | --- |
| [SetCompleted](../../aspose.note/checkbox/setcompleted/#setcompleted)() | Sets the tag to completed state using current time as completed time. |
| [SetCompleted](../../aspose.note/checkbox/setcompleted/#setcompleted_1)(DateTime) | Sets the tag to completed state. |
| virtual [SetOpen](../../aspose.note/checkbox/setopen/)() | Sets the tag to open state. |

## Examples

Shows how to generate a pdf containing all pages related to 'Project A'.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tags();

// Load the document into Aspose.Note.
var oneFile = new Document(Path.Combine(dataDir, "ProjectNotes.one"));

var report = new Document();
foreach (var page in oneFile)
{
    if (page.GetChildNodes<ITaggable>().Any(e => e.Tags.Any(x => x.Label.Contains("Project A"))))
    {
        report.AppendChildLast(page.Clone());
    }
}

report.Save(Path.Combine(dataDir, "ProjectA_Report.pdf"));
```

Shows how to make completed all checkbox items related to 'Project C'.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tags();

// Load the document into Aspose.Note.
var oneFile = new Document(Path.Combine(dataDir, "ProjectNotes.one"));

foreach (var node in oneFile.GetChildNodes<ITaggable>())
{
    foreach (var checkBox in node.Tags.OfType<CheckBox>())
    {
        if (checkBox.Label.Contains("Project C") && !checkBox.Checked)
        {
            checkBox.SetCompleted();
        }
    }
}

oneFile.Save(Path.Combine(dataDir, ClosedProjectCNotesFileName));
```

Shows how to make open all checkbox items related to 'Project C'.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tags();

// Load the document into Aspose.Note.
var oneFile = new Document(Path.Combine(dataDir, ClosedProjectCNotesFileName));

foreach (var node in oneFile.GetChildNodes<ITaggable>())
{
    foreach (var checkBox in node.Tags.OfType<CheckBox>())
    {
        if (checkBox.Label.Contains("Project C") && checkBox.Checked)
        {
            checkBox.SetOpen();
        }
    }
}

oneFile.Save(Path.Combine(dataDir, "ProjectNoteWithOpenProjectC.one"));
```

Shows how to generate a pdf containing pages with items marked by incomplete checkboxes and created during last week.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tags();

// Load the document into Aspose.Note.
var oneFile = new Document(Path.Combine(dataDir, "TagFile.one"));

var report = new Document();
foreach (var page in oneFile)
{
    if (page.GetChildNodes<ITaggable>().Any(e => e.Tags.OfType<CheckBox>().Any(x => !x.Checked && DateTime.UtcNow.Subtract(TimeSpan.FromDays(7)) <= x.CreationTime)))
    {
        report.AppendChildLast(page.Clone());
    }
}

report.Save(Path.Combine(dataDir, "IncompleteLastWeekReport.pdf"));
```

Shows how to generate a pdf containing pages with Outlook incomplete tasks to complete on this week.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Tags();

// Load the document into Aspose.Note.
var oneFile = new Document(Path.Combine(dataDir, "TagFile.one"));

var report = new Document();
var endOfWeek = DateTime.Today.AddDays(5 - (int)DateTime.Today.DayOfWeek);
foreach (var page in oneFile)
{
    if (page.GetChildNodes<ITaggable>().Any(e => e.Tags.OfType<NoteTask>().Any(x => !x.Checked && DateTime.UtcNow.Subtract(TimeSpan.FromDays(7)) <= x.CreationTime && x.DueDate <= endOfWeek)))
    {
        report.AppendChildLast(page.Clone());
    }
}

report.Save(Path.Combine(dataDir, "IncompleteTasksForThisWeekReport.pdf"));
```

### See Also

* interface [ITag](../itag/)
* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


