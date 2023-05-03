---
title: Class GraphicsPathIterator
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.GraphicsPathIterator τάξη. Παρέχει τη δυνατότητα επανάληψης μέσω υποδιαδρομών στο aGraphicsPath και δοκιμάστε τους τύπους σχημάτων που περιέχονται σε κάθε υποδιαδρομή. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 270
url: /el/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

Παρέχει τη δυνατότητα επανάληψης μέσω υποδιαδρομών στο aGraphicsPath και δοκιμάστε τους τύπους σχημάτων που περιέχονται σε κάθε υποδιαδρομή. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPathIterator` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | Λαμβάνει τον αριθμό των σημείων στη διαδρομή. |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | Λαμβάνει τον αριθμό των δευτερευουσών διαδρομών στη διαδρομή. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | Αντιγράφει την ιδιότητα GraphicsPath.PathPoints και την ιδιότητα GraphicsPath.PathTypes arrays των συσχετισμένων[`GraphicsPath`](../graphicspath/) στους δύο καθορισμένους πίνακες. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | Εκτελεί εργασίες που καθορίζονται από την εφαρμογή που σχετίζονται με την απελευθέρωση, την απελευθέρωση ή την επαναφορά μη διαχειριζόμενων πόρων. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | Αντιγράφει την ιδιότητα GraphicsPath.PathPoints και την ιδιότητα GraphicsPath.PathTypes arrays των συσχετισμένων[`GraphicsPath`](../graphicspath/) στους δύο καθορισμένους πίνακες. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | Υποδεικνύει εάν η διαδρομή σχετίζεται με αυτό`GraphicsPathIterator` περιέχει μια καμπύλη. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | Αυτό`GraphicsPathIterator` αντικείμενο έχει α[`GraphicsPath`](../graphicspath/) αντικείμενο που σχετίζεται με αυτό. Αυτή η μέθοδος αυξάνει το συσχετισμένο[`GraphicsPath`](../graphicspath/) στον επόμενο δείκτη στο path και αντιγράφει όλα τα σημεία που περιέχονται μεταξύ του τρέχοντος δείκτη και του επόμενου δείκτη (ή στο τέλος της διαδρομής) σε ένα δευτερόλεπτο[`GraphicsPath`](../graphicspath/) αντικείμενο μεταβιβάστηκε στην παράμετρο. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | Αυξάνει το`GraphicsPathIterator`στον επόμενο δείκτη στο path και επιστρέφει τους δείκτες start και stop μέσω των παραμέτρων [out]. |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | Λαμβάνει τον αρχικό και τον τελικό δείκτη της επόμενης ομάδας σημείων δεδομένων που έχουν όλα τον ίδιο τύπο. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | Παίρνει το επόμενο σχήμα (υποδιαδρομή) από τη σχετική διαδρομή αυτού`GraphicsPathIterator` . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | Μετακινεί το`GraphicsPathIterator` στο επόμενο δευτερεύον μονοπάτι στη διαδρομή. Ο δείκτης έναρξης και ο δείκτης τέλους της επόμενης υποδιαδρομής περιέχονται στις παραμέτρους [out]. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | Επαναφέρει αυτό`GraphicsPathIterator` στην αρχή της σχετικής διαδρομής του. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* συνέλευση [Aspose.Drawing](../../)


