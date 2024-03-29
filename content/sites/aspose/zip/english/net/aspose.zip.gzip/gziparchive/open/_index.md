---
title: Open
second_title: Aspose.ZIP for .NET API Reference
description: 
type: docs
weight: 60
url: /net/aspose.zip.gzip/gziparchive/open/
---
## GzipArchive.Open method

Opens the archive for extraction and provides a stream with archive content.

```csharp
public Stream Open()
```

### Return Value

The stream that represents the contents of the archive.

### Remarks

Read from the stream to get original content of file. See examples section.

### Examples

Extracts the archive and copies extracted content to file stream.

```csharp
using (var archive = new GzipArchive("archive.gz"))
{
    using (var extracted = File.Create("data.bin"))
    {
        var unpacked = archive.Open();
        byte[] b = new byte[8192];
        int bytesRead;
        while (0 < (bytesRead = unpacked.Read(b, 0, b.Length)))
            extracted.Write(b, 0, bytesRead);
    }            
}
```

You may use Stream.CopyTo method for .NET 4.0 and higher:

```csharp
unpacked.CopyTo(extracted);
```

### See Also

* class [GzipArchive](../../gziparchive)
* namespace [Aspose.Zip.Gzip](../../gziparchive)
* assembly [Aspose.Zip](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.ZIP.dll -->
