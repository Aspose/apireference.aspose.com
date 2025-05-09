---
title: ArchiveEntry.Open
second_title: Aspose.ZIP for .NET API Reference
description: ArchiveEntry method. Opens the entry for extraction and provides a stream with decompressed entry content
type: docs
weight: 120
url: /net/aspose.zip/archiveentry/open/
---
## ArchiveEntry.Open method

Opens the entry for extraction and provides a stream with decompressed entry content.

```csharp
public Stream Open(string password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| password | String | Optional password for decryption. |

### Return Value

The stream that represents the contents of the entry.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The archive is in an incorrect state. |

## Remarks

Read from the stream to get the original content of a file. See examples section.

## Examples

Usage:

```csharp
Stream decompressed = entry.Open();
```

.NET 4.0 and higher - use Stream.CopyTo method:

```csharp
decompressed.CopyTo(httpResponse.OutputStream)
```

.NET 3.5 and before - copy bytes manually:

```csharp
byte[] buffer = new byte[8192];
int bytesRead;
while (0 < (bytesRead = decompressed.Read(buffer, 0, buffer.Length)))
 fileStream.Write(buffer, 0, bytesRead);
```

### See Also

* class [ArchiveEntry](../)
* namespace [Aspose.Zip](../../archiveentry/)
* assembly [Aspose.Zip](../../../)


