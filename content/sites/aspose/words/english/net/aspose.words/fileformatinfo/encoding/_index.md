---
title: FileFormatInfo.Encoding
linktitle: Encoding
articleTitle: Encoding
second_title: Aspose.Words for .NET
description: Discover the FileFormatInfo Encoding property to identify document encoding effortlessly. Currently supports HTML formats for accurate results.
type: docs
weight: 10
url: /net/aspose.words/fileformatinfo/encoding/
---
## FileFormatInfo.Encoding property

Gets the detected encoding if applicable to the current document format. At the moment detects encoding only for HTML documents.

```csharp
public Encoding Encoding { get; }
```

## Examples

Shows how to detect encoding in an html file.

```csharp
FileFormatInfo info = FileFormatUtil.DetectFileFormat(MyDir + "Document.html");

Assert.AreEqual(LoadFormat.Html, info.LoadFormat);

// The Encoding property is used only when we create a FileFormatInfo object for an html document.
Assert.AreEqual("Western European (Windows)", info.Encoding.EncodingName);
Assert.AreEqual(1252, info.Encoding.CodePage);
```

### See Also

* class [FileFormatInfo](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
