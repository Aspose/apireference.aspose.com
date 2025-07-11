---
title: Interface IOperationResult
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Plugins.IOperationResult interface. General operation result interface that defines common methods that concrete plugin operation result should implement
type: docs
weight: 8980
url: /net/aspose.pdf.plugins/ioperationresult/
---
## IOperationResult interface

General operation result interface that defines common methods that concrete plugin operation result should implement.

```csharp
public interface IOperationResult
```

## Properties

| Name | Description |
| --- | --- |
| [Data](../../aspose.pdf.plugins/ioperationresult/data/) { get; } | Gets raw data. |
| [IsFile](../../aspose.pdf.plugins/ioperationresult/isfile/) { get; } | Indicates whether the result is a path to an output file. |
| [IsStream](../../aspose.pdf.plugins/ioperationresult/isstream/) { get; } | Indicates whether the result is an output stream. |
| [IsString](../../aspose.pdf.plugins/ioperationresult/isstring/) { get; } | Indicates whether the result is a text string. |

## Methods

| Name | Description |
| --- | --- |
| [ToFile](../../aspose.pdf.plugins/ioperationresult/tofile/)() | Tries to convert the result to the file. |
| [ToStream](../../aspose.pdf.plugins/ioperationresult/tostream/)() | Tries to convert the result to the stream object. |

### See Also

* namespace [Aspose.Pdf.Plugins](../../aspose.pdf.plugins/)
* assembly [Aspose.PDF](../../)


