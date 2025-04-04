---
title: Class NoteTask
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.NoteTask class. Represents a note task
type: docs
weight: 470
url: /net/aspose.note/notetask/
---
## NoteTask class

Represents a note task.

```csharp
public sealed class NoteTask : CheckBox, IEquatable<NoteTask>
```

## Properties

| Name | Description |
| --- | --- |
| [Checked](../../aspose.note/checkbox/checked/) { get; } | Gets a value indicating whether the CheckBox is in the checked state. |
| [CompletedTime](../../aspose.note/checkbox/completedtime/) { get; } | Gets or sets the completed time. |
| [CreationTime](../../aspose.note/checkbox/creationtime/) { get; set; } | Gets or sets the creation time. |
| [DueDate](../../aspose.note/notetask/duedate/) { get; set; } | Gets or sets the due date. |
| override [Icon](../../aspose.note/notetask/icon/) { get; } | Gets or sets the icon. |
| [Label](../../aspose.note/checkbox/label/) { get; } | Gets the label text. |
| [Status](../../aspose.note/checkbox/status/) { get; } | Gets or sets the status. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateCustomFollowUpDate](../../aspose.note/notetask/createcustomfollowupdate/)(DateTime) | Creates a new note task with NoFollowUpDateFlag icon and specified due date. |
| static [CreateFollowUpNextWeek](../../aspose.note/notetask/createfollowupnextweek/)() | Creates a new note task with FollowUpNextWeekFlag icon. |
| static [CreateFollowUpThisWeek](../../aspose.note/notetask/createfollowupthisweek/)() | Creates a new note task with FollowUpThisWeekFlag icon. |
| static [CreateFollowUpToday](../../aspose.note/notetask/createfollowuptoday/)() | Creates a new note task with FollowUpTodayFlag icon. |
| static [CreateFollowUpTomorrow](../../aspose.note/notetask/createfollowuptomorrow/)() | Creates a new note task with FollowUpTomorrowFlag icon. |
| static [CreateNoFollowUpDate](../../aspose.note/notetask/createnofollowupdate/)() | Creates a new note task with NoFollowUpDateFlag icon. |
| [Equals](../../aspose.note/notetask/equals/#equals)(NoteTask) | Determines whether the specified object is equal to the current object. |
| override [Equals](../../aspose.note/notetask/equals/#equals_1)(object) | Determines whether the specified object is equal to the current object. |
| override [GetHashCode](../../aspose.note/notetask/gethashcode/)() | Serves as a hash function for the type. |
| [SetCompleted](../../aspose.note/checkbox/setcompleted/)() | Sets the tag to completed state using current time as completed time. |
| [SetCompleted](../../aspose.note/checkbox/setcompleted/)(DateTime) | Sets the tag to completed state. |
| override [SetOpen](../../aspose.note/notetask/setopen/)() | Sets the tag to open state. |

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

* class [CheckBox](../checkbox/)
* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


