---
title: IInputWorkingDirectory.GetFile
second_title: Aspose.TeX for .NET API Reference
description: IInputWorkingDirectory method. Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned it MUST return a NamedStream object with a null Stream property value instead
type: docs
weight: 10
url: /net/aspose.tex.io/iinputworkingdirectory/getfile/
---
## IInputWorkingDirectory.GetFile method

Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead.

```csharp
public NamedStream GetFile(string fileName, bool searchSubdirectories = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The file name. |
| searchSubdirectories | Boolean | Indicates whether to look for a file in subdirectories. |

### Return Value

The named stream.

### See Also

* class [NamedStream](../../namedstream/)
* interface [IInputWorkingDirectory](../)
* namespace [Aspose.TeX.IO](../../iinputworkingdirectory/)
* assembly [Aspose.TeX](../../../)


