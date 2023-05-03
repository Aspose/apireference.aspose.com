---
title: GraphicsPathIterator.CopyData
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator μέθοδος. Αντιγράφει την ιδιότητα GraphicsPath.PathPoints και την ιδιότητα GraphicsPath.PathTypes arrays των συσχετισμένωνGraphicsPath στους δύο καθορισμένους πίνακες.
type: docs
weight: 40
url: /el/net/system.drawing.drawing2d/graphicspathiterator/copydata/
---
## GraphicsPathIterator.CopyData method

Αντιγράφει την ιδιότητα GraphicsPath.PathPoints και την ιδιότητα GraphicsPath.PathTypes arrays των συσχετισμένων[`GraphicsPath`](../../graphicspath/) στους δύο καθορισμένους πίνακες.

```csharp
public int CopyData(ref PointF[] points, ref byte[] types, int startIndex, int endIndex)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | PointF[]& | Κατά την επιστροφή, περιέχει έναν πίνακα δομών System.Drawing.PointF που αντιπροσωπεύει τα σημεία στη διαδρομή. |
| types | Byte[]& | Κατά την επιστροφή, περιέχει έναν πίνακα byte που αντιπροσωπεύει τους τύπους σημείων στη διαδρομή. |
| startIndex | Int32 | Καθορίζει τον αρχικό δείκτη των πινάκων. |
| endIndex | Int32 | Καθορίζει τον τελικό δείκτη των πινάκων. |

### Επιστρεφόμενη Αξία

Ο αριθμός των σημείων που αντιγράφηκαν.

### Δείτε επίσης

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)


