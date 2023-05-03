---
title: Delegate Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing for .NET API Reference
description: Παρέχει μια μέθοδο επανάκλησης για τοEnumerateMetafile μέθοδος.
type: docs
weight: 550
url: /el/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

Παρέχει μια μέθοδο επανάκλησης για το[`EnumerateMetafile`](../graphics/enumeratemetafile/) μέθοδος.

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| recordType | EmfPlusRecordType | Μέλος του[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/) απαρίθμηση που καθορίζει τον τύπο της εγγραφής μετα-αρχείου. |
| flags | Int32 | Σύνολο σημαιών που καθορίζουν χαρακτηριστικά της εγγραφής. |
| dataSize | Int32 | Αριθμός byte στα δεδομένα εγγραφής. |
| data | IntPtr | Δείκτης σε ένα buffer που περιέχει τα δεδομένα εγγραφής. |
| callbackData | PlayRecordCallback | Το επιχείρημα δεν χρησιμοποιείται. |

### Επιστρεφόμενη Αξία

Επιστρέψτε true εάν θέλετε να συνεχίσετε την απαρίθμηση εγγραφών. διαφορετικά, ψευδής.

### Δείτε επίσης

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


