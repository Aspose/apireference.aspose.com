---
title: IFile Interface
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.IO.IFile interface. A File object is a Blob object with a name attribute which is a string it can be created within the web application via a constructor or is a reference to a byte sequence from a file from the underlying OS file system
type: docs
weight: 3950
url: /net/aspose.html.io/ifile/
---
## IFile interface

A File object is a Blob object with a name attribute, which is a string; it can be created within the web application via a constructor, or is a reference to a byte sequence from a file from the underlying (OS) file system.

```csharp
public interface IFile : IBlob
```

## Members
## Properties

| Name | Description |
| --- | --- |
| [LastModified](../../aspose.html.io/ifile/lastmodified/) { get; } | The last modified date of the file. On getting, if user agents can make this information available, this must return a long long set to the time the file was last modified as the number of milliseconds since the Unix Epoch. |
| [Name](../../aspose.html.io/ifile/name/) { get; } | The name of the file. On getting, this must return the name of the file as a string. |

### See Also

* interface [IBlob](../iblob/)
* namespace [Aspose.Html.IO](../../aspose.html.io/)
* assembly [Aspose.HTML](../../)
