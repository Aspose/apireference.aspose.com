---
title: Delegate Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing for .NET API Reference
description: Provides a callback method for the EnumerateMetafile method
type: docs
weight: 520
url: /net/aspose.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

Provides a callback method for the [`EnumerateMetafile`](../graphics/enumeratemetafile/) method.

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| Parameter | Type | Description |
| --- | --- | --- |
| recordType | EmfPlusRecordType | Member of the [`EmfPlusRecordType`](../../aspose.drawing.imaging/emfplusrecordtype/) enumeration that specifies the type of metafile record. |
| flags | Int32 | Set of flags that specify attributes of the record. |
| dataSize | Int32 | Number of bytes in the record data. |
| data | IntPtr | Pointer to a buffer that contains the record data. |
| callbackData | PlayRecordCallback | The argument is not used. |

### Return Value

Return true if you want to continue enumerating records; otherwise, false.

### See Also

* enum [EmfPlusRecordType](../../aspose.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../aspose.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


