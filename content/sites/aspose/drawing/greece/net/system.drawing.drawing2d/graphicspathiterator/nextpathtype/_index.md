---
title: GraphicsPathIterator.NextPathType
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator μέθοδος. Λαμβάνει τον αρχικό και τον τελικό δείκτη της επόμενης ομάδας σημείων δεδομένων που έχουν όλα τον ίδιο τύπο.
type: docs
weight: 90
url: /el/net/system.drawing.drawing2d/graphicspathiterator/nextpathtype/
---
## GraphicsPathIterator.NextPathType method

Λαμβάνει τον αρχικό και τον τελικό δείκτη της επόμενης ομάδας σημείων δεδομένων που έχουν όλα τον ίδιο τύπο.

```csharp
public int NextPathType(out byte pathType, out int startIndex, out int endIndex)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pathType | Byte& | [έξω] Λαμβάνει τον τύπο πόντων που μοιράζονται όλα τα σημεία της ομάδας. Πιθανοί τύποι μπορούν να ανακτηθούν από τοPathPointType απαρίθμηση. |
| startIndex | Int32& | [έξω] Λαμβάνει τον αρχικό δείκτη της ομάδας πόντων. |
| endIndex | Int32& | [έξω] Λαμβάνει τον τελικό δείκτη της ομάδας πόντων. |

### Επιστρεφόμενη Αξία

Αυτή η μέθοδος επιστρέφει τον αριθμό των σημείων δεδομένων στην ομάδα. Εάν δεν υπάρχουν άλλες ομάδες στη διαδρομή, αυτή η μέθοδος επιστρέφει 0.

### Δείτε επίσης

* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)


