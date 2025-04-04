---
title: Class UnsupportedFileFormatException
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.UnsupportedFileFormatException class. Thrown during document load when the file format is not recognized or not supported by Aspose.Note
type: docs
weight: 1070
url: /net/aspose.note/unsupportedfileformatexception/
---
## UnsupportedFileFormatException class

Thrown during document load, when the file format is not recognized or not supported by Aspose.Note.

```csharp
public class UnsupportedFileFormatException : Exception
```

## Properties

| Name | Description |
| --- | --- |
| [FileFormat](../../aspose.note/unsupportedfileformatexception/fileformat/) { get; } | Gets the file format of passed data if detected. |

## Examples

Shows how to check if a document load is failed because OneNote 2007 format is not supported.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();
string fileName = Path.Combine(dataDir, "OneNote2007.one");

try
{
    new Document(fileName);
}
catch (UnsupportedFileFormatException e)
{
    if (e.FileFormat == FileFormat.OneNote2007)
    {
        Console.WriteLine("It looks like the provided file is in OneNote 2007 format that is not supported.");
    }
    else
        throw;
}
```

### See Also

* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


