---
title: Interface IOperationResult
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Plugins.IOperationResult interface. General operation result interface that defines common methods that concrete plugin operation result should implement
type: docs
weight: 360
url: /net/aspose.page.plugins/ioperationresult/
---
## IOperationResult interface

General operation result interface that defines common methods that concrete plugin operation result should implement.

```csharp
public interface IOperationResult
```

## Properties

| Name | Description |
| --- | --- |
| [Data](../../aspose.page.plugins/ioperationresult/data/) { get; } | Gets raw data. |
| [IsByteArray](../../aspose.page.plugins/ioperationresult/isbytearray/) { get; } | Indicates whether the result is a byte array. |
| [IsFile](../../aspose.page.plugins/ioperationresult/isfile/) { get; } | Indicates whether the result is a path to an output file. |
| [IsStream](../../aspose.page.plugins/ioperationresult/isstream/) { get; } | Indicates whether the result is an output stream. |
| [IsString](../../aspose.page.plugins/ioperationresult/isstring/) { get; } | Indicates whether the result is a text string. |

## Methods

| Name | Description |
| --- | --- |
| [ToFile](../../aspose.page.plugins/ioperationresult/tofile/)() | Tries to convert the result to the file. |
| [ToStream](../../aspose.page.plugins/ioperationresult/tostream/)() | Tries to convert the result to the stream object. |

### See Also

* namespace [Aspose.Page.Plugins](../../aspose.page.plugins/)
* assembly [Aspose.Page](../../)


