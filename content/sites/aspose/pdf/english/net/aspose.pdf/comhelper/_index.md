---
title: Class ComHelper
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.ComHelper class. Provides methods for COM clients to load a document into Aspose.Pdf
type: docs
weight: 3240
url: /net/aspose.pdf/comhelper/
---
## ComHelper class

Provides methods for COM clients to load a document into Aspose.Pdf.

```csharp
public class ComHelper
```

## Constructors

| Name | Description |
| --- | --- |
| [ComHelper](comhelper/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [OpenFile](../../aspose.pdf/comhelper/openfile/#openfile)(string) | Just create and return Document using *filename*. The same as [`Document`](../document/document/). |
| [OpenFile](../../aspose.pdf/comhelper/openfile/#openfile_1)(string, LoadOptions) | Open an existing document from a file providing necessary converting oprions to get pdf document. |
| [OpenFile](../../aspose.pdf/comhelper/openfile/#openfile_2)(string, string) | Initialize and return new instance of the [`Document`](../document/) class for working with encrypted document. |
| [OpenFile](../../aspose.pdf/comhelper/openfile/#openfile_3)(string, string, bool) | Initialize new instance of the [`Document`](../document/) class for working with encrypted document. |
| [OpenStream](../../aspose.pdf/comhelper/openstream/#openstream)(Stream) | Initialize and return new Document instance from the *input* stream. |
| [OpenStream](../../aspose.pdf/comhelper/openstream/#openstream_2)(Stream, bool) | Initialize and return new Document instance from the *input* stream. |
| [OpenStream](../../aspose.pdf/comhelper/openstream/#openstream_1)(Stream, LoadOptions) | Open and return an existing document from a stream providing necessary converting to get pdf document. |
| [OpenStream](../../aspose.pdf/comhelper/openstream/#openstream_3)(Stream, string) | Initialize and return new Document instance from the *input* stream. |
| [OpenStream](../../aspose.pdf/comhelper/openstream/#openstream_4)(Stream, string, bool) | Initialize and return new Document instance from the *input* stream. |

## Remarks

Use the ComHelper class to load a document from a file or stream into a Document object in a COM application. The Document class provides a default constructor to create a new document and also provides overloaded constructors to load a document from a file or stream. If you are using Aspose.Words from a .NET application, you can use all of the Document constructors directly, but if you are using Aspose.Pdf from a COM application, only the default Document constructor is available.

### See Also

* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


