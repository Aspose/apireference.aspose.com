---
title: Enum ImageDeleteAction
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.ImageDeleteAction enum. Action which performed with image object when image is removed from collection. If image object is removed
type: docs
weight: 6000
url: /net/aspose.pdf/imagedeleteaction/
---
## ImageDeleteAction enumeration

Action which performed with image object when image is removed from collection. If image object is removed

```csharp
public enum ImageDeleteAction
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| KeepContents | `0` | Image will be removed from the collection. If page contents contains references to the image they will not be removed. Document may became invalid. |
| None | `1` | Image will be removed from the collection and from page contents, but image object will not be deleted. File size will not be decreased. |
| ForceDelete | `2` | Image will be removed from the collection and image object will be removed from the document. If other references on the same object exist the document may be corrupted. |
| Check | `3` | Image will be removed from the collection and image object will be removed only if no other references to the image from other pages. This may require more time in comparision with ForceDelete option. |

### See Also

* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


