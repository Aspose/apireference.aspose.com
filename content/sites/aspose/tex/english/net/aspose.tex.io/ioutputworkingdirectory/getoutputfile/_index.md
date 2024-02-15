---
title: IOutputWorkingDirectory.GetOutputFile
second_title: Aspose.TeX for .NET API Reference
description: IOutputWorkingDirectory method. Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned it MUST return a NamedStream object with a null Stream property value instead
type: docs
weight: 10
url: /net/aspose.tex.io/ioutputworkingdirectory/getoutputfile/
---
## IOutputWorkingDirectory.GetOutputFile method

Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead.

```csharp
public NamedStream GetOutputFile(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The file name. |

### Return Value

The named stream.

### See Also

* class [NamedStream](../../namedstream/)
* interface [IOutputWorkingDirectory](../)
* namespace [Aspose.TeX.IO](../../ioutputworkingdirectory/)
* assembly [Aspose.TeX](../../../)


