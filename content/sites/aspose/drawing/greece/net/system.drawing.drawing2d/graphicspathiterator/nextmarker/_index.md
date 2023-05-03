---
title: GraphicsPathIterator.NextMarker
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator μέθοδος. Αυξάνει τοGraphicsPathIteratorστον επόμενο δείκτη στο path και επιστρέφει τους δείκτες start και stop μέσω των παραμέτρων out.
type: docs
weight: 80
url: /el/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

Αυξάνει το[`GraphicsPathIterator`](../)στον επόμενο δείκτη στο path και επιστρέφει τους δείκτες start και stop μέσω των παραμέτρων [out].

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startIndex | Int32& | [out] Η ακέραια αναφορά που παρέχεται σε αυτήν την παράμετρο λαμβάνει τον δείκτη του σημείου που ξεκινά μια υποδιαδρομή. |
| endIndex | Int32& | [έξω] Η ακέραια αναφορά που παρέχεται σε αυτήν την παράμετρο λαμβάνει τον δείκτη του σημείου που τελειώνει την υποδιαδρομή στην οποία οδηγεί το startIndex. |

### Επιστρεφόμενη Αξία

Ο αριθμός των σημείων μεταξύ αυτού του δείκτη και του επόμενου.

### Δείτε επίσης

* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

Αυτό[`GraphicsPathIterator`](../) αντικείμενο έχει α[`GraphicsPath`](../../graphicspath/) αντικείμενο που σχετίζεται με αυτό. Αυτή η μέθοδος αυξάνει το συσχετισμένο[`GraphicsPath`](../../graphicspath/) στον επόμενο δείκτη στο path και αντιγράφει όλα τα σημεία που περιέχονται μεταξύ του τρέχοντος δείκτη και του επόμενου δείκτη (ή στο τέλος της διαδρομής) σε ένα δευτερόλεπτο[`GraphicsPath`](../../graphicspath/) αντικείμενο μεταβιβάστηκε στην παράμετρο.

```csharp
public int NextMarker(GraphicsPath path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | GraphicsPath | ο[`GraphicsPath`](../../graphicspath/) αντικείμενο στο οποίο θα αντιγραφούν τα σημεία. |

### Επιστρεφόμενη Αξία

Ο αριθμός των σημείων μεταξύ αυτού του δείκτη και του επόμενου.

### Δείτε επίσης

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)


