---
title: Class Matrix
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.Matrix τάξη. Ενθυλακώνει έναν συγγενικό πίνακα 3 επί 3 που αντιπροσωπεύει έναν γεωμετρικό μετασχηματισμό. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 360
url: /el/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Ενθυλακώνει έναν συγγενικό πίνακα 3 επί 3 που αντιπροσωπεύει έναν γεωμετρικό μετασχηματισμό. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class Matrix : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Matrix](matrix/#constructor)() | Αρχικοποιεί μια νέα παρουσία της κλάσης Matrix ως μήτρα ταυτότητας. |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | Αρχικοποιεί μια νέα παρουσία του`Matrix` κλάση στον γεωμετρικό μετασχηματισμό που ορίζεται από το καθορισμένο ορθογώνιο και τον πίνακα σημείων. |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | Αρχικοποιεί μια νέα παρουσία του`Matrix` κλάση στον γεωμετρικό μετασχηματισμό που ορίζεται από το καθορισμένο ορθογώνιο και τον πίνακα σημείων. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | Αρχικοποιεί μια νέα παρουσία της κλάσης Matrix με τα καθορισμένα στοιχεία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | Λαμβάνει έναν πίνακα τιμών κινητής υποδιαστολής που αντιπροσωπεύει τα στοιχεία αυτού του Matrix. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο πίνακας είναι ο πίνακας ταυτότητας. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο πίνακας είναι αντιστρέψιμος. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | Λαμβάνει την τιμή μετάφρασης x (την τιμή dx ή το στοιχείο στην τρίτη σειρά και την πρώτη στήλη) αυτού του πίνακα. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | Λαμβάνει την τιμή μετάφρασης y (το`dy` τιμή ή το στοιχείο στην τρίτη γραμμή και τη δεύτερη στήλη) αυτού του Matrix. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτού του Matrix. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτό το Matrix. |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | Αντιστρέφει αυτόν τον πίνακα, εάν είναι αναστρέψιμος. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | Πολλαπλασιάζει αυτόMatrix από τον πίνακα που καθορίζεται στο*matrix* παράμετρος, προσαρτώντας το καθορισμένοMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | Πολλαπλασιάζει αυτόMatrix από τον πίνακα που καθορίζεται στο*matrix* παράμετρος, και με τη σειρά που καθορίζεται στο*order* παράμετρος. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | Επαναφέρει αυτόMatrix να έχουμε τα στοιχεία του πίνακα ταυτότητας. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | Prepend σε αυτόMatrix δεξιόστροφη περιστροφή, γύρω από την αρχή και κατά την καθορισμένη γωνία. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή ενός ποσού που καθορίζεται στην παράμετρο γωνίας, γύρω από την αρχή (μηδέν συντεταγμένες x και y) για αυτόMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | Εφαρμόζει δεξιόστροφη περιστροφή σε αυτόν τον Πίνακα γύρω από το σημείο που καθορίζεται στην παράμετρο σημείου, και με την προετοιμασία της περιστροφής. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή γύρω από το καθορισμένο σημείο σε αυτόν τον πίνακα με την καθορισμένη σειρά. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας σε αυτόν τον πίνακα προσαρτώντας το διάνυσμα κλίμακας. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον πίνακα χρησιμοποιώντας την καθορισμένη σειρά. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα διάτμησης σε αυτόν τον Πίνακα προσαρτώντας τον μετασχηματισμό διάτμησης. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα διάτμησης σε αυτόν τον πίνακα με την καθορισμένη σειρά. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | Εφαρμόζει τον γεωμετρικό μετασχηματισμό που αντιπροσωπεύεται από αυτόMatrix σε μια καθορισμένη σειρά σημείων. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | Εφαρμόζει τον γεωμετρικό μετασχηματισμό που αντιπροσωπεύεται από αυτόMatrix σε μια καθορισμένη σειρά σημείων. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | Πολλαπλασιάζει κάθε διάνυσμα σε έναν πίνακα με τον πίνακα. Τα στοιχεία μετάφρασης αυτού του πίνακα (τρίτη σειρά) αγνοούνται. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης (offsetX και offsetY) σε αυτόν τον πίνακα προσαρτώντας το διάνυσμα μετάφρασης. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον πίνακα με την καθορισμένη σειρά. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* συνέλευση [Aspose.Drawing](../../)


