---
title: CabEntry.Open
second_title: Aspose.ZIP for .NET API Reference
description: CabEntry method. Opens the entry for extraction and provides a stream with entry content
type: docs
weight: 50
url: /net/aspose.zip.cab/cabentry/open/
---
## CabEntry.Open method

Opens the entry for extraction and provides a stream with entry content.

```csharp
public Stream Open()
```

### Return Value

The stream that represents the contents of the entry.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Stream initialization failed due to wrong data. |
| InvalidDataException | The archive is corrupted. |

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

* class [CabEntry](../)
* namespace [Aspose.Zip.Cab](../../cabentry/)
* assembly [Aspose.Zip](../../../)


