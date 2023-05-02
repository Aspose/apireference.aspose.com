---
title: GraphicsPathIterator.NextSubpath
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator μέθοδος. Μετακινεί τοGraphicsPathIterator στο επόμενο δευτερεύον μονοπάτι στη διαδρομή. Ο δείκτης έναρξης και ο δείκτης τέλους της επόμενης υποδιαδρομής περιέχονται στις παραμέτρους out.
type: docs
weight: 100
url: /el/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

Μετακινεί το[`GraphicsPathIterator`](../) στο επόμενο δευτερεύον μονοπάτι στη διαδρομή. Ο δείκτης έναρξης και ο δείκτης τέλους της επόμενης υποδιαδρομής περιέχονται στις παραμέτρους [out].

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startIndex | Int32& | [έξω] Λαμβάνει το αρχικό ευρετήριο της επόμενης υποδιαδρομής. |
| endIndex | Int32& | [έξω] Λαμβάνει το τελικό ευρετήριο της επόμενης υποδιαδρομής. |
| isClosed | Boolean& | [out] Υποδεικνύει εάν η δευτερεύουσα διαδρομή είναι κλειστή. |

### Επιστρεφόμενη Αξία

Ο αριθμός των σημείων δεδομένων στο ανακτηθέν σχήμα (υποδιαδρομή). Εάν δεν υπάρχουν άλλοι αριθμοί για ανάκτηση, επιστρέφεται το μηδέν.

### Δείτε επίσης

* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

Παίρνει το επόμενο σχήμα (υποδιαδρομή) από τη σχετική διαδρομή αυτού[`GraphicsPathIterator`](../) .

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | GraphicsPath | ΕΝΑ[`GraphicsPath`](../../graphicspath/) δηλαδή να έχει τα σημεία δεδομένων του ρυθμισμένα ώστε να ταιριάζουν με τα σημεία δεδομένων του ανακτηθέντος σχήματος (υποδιαδρομή) για αυτόν τον επαναλήπτη. |
| isClosed | Boolean& | [out] Υποδεικνύει εάν η τρέχουσα υποδιαδρομή είναι κλειστή. Είναι αληθές εάν το εάν το σχήμα είναι κλειστό, διαφορετικά είναι ψευδές. |

### Επιστρεφόμενη Αξία

Ο αριθμός των σημείων δεδομένων στο ανακτηθέν σχήμα (υποδιαδρομή). Εάν δεν υπάρχουν άλλοι αριθμοί για ανάκτηση, επιστρέφεται το μηδέν.

### Δείτε επίσης

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspathiterator/)
* συνέλευση [Aspose.Drawing](../../../)


