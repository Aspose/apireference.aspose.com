---
title: Enum WarningType
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.WarningType enum. Enum represented warning type
type: docs
weight: 11440
url: /net/aspose.pdf/warningtype/
---
## WarningType enumeration

Enum represented warning type.

```csharp
public enum WarningType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| SourceFileCorruption | `0` | The file is corrupted. |
| DataLoss | `1` | Text/chart/image or other data is completely missing from either the documet tree following load, or the created document following save. |
| MajorFormattingLoss | `2` | Major formatting losses compared to the original document. This is for occasions when the formatting loss is substantial but the data is still there. |
| MinorFormattingLoss | `3` | Minor formatting losses compared to the original document. This is for minor losses of fidelity. |
| CompatibilityIssue | `4` | Known issue that will prevent the document being opened by certain user agents, or previous versions of user agents. |
| InvalidInputStreamType | `5` | Invalid input stream type |
| UnexpectedContent | `99` | The file has unexpected content. |

### See Also

* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


