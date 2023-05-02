---
title: Delegate Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing voor .NET API-referentie
description: Biedt een callbackmethode voor deEnumerateMetafile methode.
type: docs
weight: 550
url: /nl/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

Biedt een callback-methode voor de[`EnumerateMetafile`](../graphics/enumeratemetafile/) methode.

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| recordType | EmfPlusRecordType | Lid van de[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/) opsomming die het type metabestandrecord specificeert. |
| flags | Int32 | Set vlaggen die attributen van het record specificeren. |
| dataSize | Int32 | Aantal bytes in de recordgegevens. |
| data | IntPtr | Aanwijzer naar een buffer die de recordgegevens bevat. |
| callbackData | PlayRecordCallback | Het argument wordt niet gebruikt. |

### Winstwaarde

Geef true terug als u wilt doorgaan met het opsommen van records; anders, vals.

### Zie ook

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


