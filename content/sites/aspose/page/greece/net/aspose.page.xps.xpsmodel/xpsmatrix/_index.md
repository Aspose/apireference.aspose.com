---
title: Class XpsMatrix
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsModel.XpsMatrix τάξη. Χαρακτηριστικά στοιχεία ιδιότητας MatrixTransform που ενσωματώνει κλάση. Αυτό το στοιχείο ορίζει έναν αυθαίρετο μετασχηματισμό συγγενούς πίνακα που χρησιμοποιείται για τον χειρισμό των συστημάτων συντεταγμένων των στοιχείων.
type: docs
weight: 3220
url: /el/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Χαρακτηριστικά στοιχεία ιδιότητας MatrixTransform που ενσωματώνει κλάση. Αυτό το στοιχείο ορίζει έναν αυθαίρετο μετασχηματισμό συγγενούς πίνακα που χρησιμοποιείται για τον χειρισμό των συστημάτων συντεταγμένων των στοιχείων.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι μήτρα ταυτότητας. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Λαμβάνει το στοιχείο M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Παίρνει το στοιχείο M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Λαμβάνει το στοιχείο M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Παίρνει το στοιχείο M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Λαμβάνει το στοιχείο M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Λαμβάνει το στοιχείο M32. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Κλωνοποιεί αυτόν τον πίνακα μετασχηματισμού. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Καθορίζει εάν το καθορισμένοObject ισούται με αυτήν την περίπτωση. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Επιστρέφει έναν κωδικό κατακερματισμού για αυτήν την εμφάνιση. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το*matrix* στην προεπιλεγμένη σειρά (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το*matrix* στην προεπιλεγμένη σειρά (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το*matrix* με τη σειρά που καθορίζεται από*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Πολλαπλασιάζει αυτόν τον πίνακα με τον πίνακα που καθορίζεται από το*matrix* με τη σειρά που καθορίζεται από*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Επαναφέρει αυτόν τον πίνακα σε μήτρα ταυτότητας. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Εφαρμόζει δεξιόστροφη περιστροφή κατά*angle* σε αυτόν τον πίνακα με προεπιλεγμένη σειρά (Prepend). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή κατά*angle* σε αυτόν τον Πίνακα κατά σειρά που καθορίζεται από*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Εφαρμόζει δεξιόστροφη περιστροφή κατά*angle* γύρω από*pivot* σε αυτόν τον πίνακα με προεπιλεγμένη σειρά (Prepend). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή κατά*angle* γύρω από*pivot* σε αυτόν τον Πίνακα με τη σειρά που καθορίζεται από*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον πίνακα με προεπιλεγμένη σειρά (Prepend). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτόν τον πίνακα κατά σειρά που καθορίζεται από*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Εφαρμόζει καθορισμένο λοξό μετασχηματισμό σε αυτόν τον πίνακα. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Επιστρέφει την παράσταση συμβολοσειράς αυτού`XpsMatrix` παράδειγμα. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Εφαρμόζει τον συγγενικό μετασχηματισμό που αντιπροσωπεύεται από αυτόν τον πίνακα σε ένα καθορισμένο ορθογώνιο. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Εφαρμόζει τον συγγενικό μετασχηματισμό που αντιπροσωπεύεται από αυτόν τον πίνακα σε ένα καθορισμένο σημείο. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Εφαρμόζει τον συγγενικό μετασχηματισμό που αντιπροσωπεύεται από αυτόν τον πίνακα σε μια καθορισμένη σειρά σημείων. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Εφαρμόζει τον συγγενικό μετασχηματισμό που αντιπροσωπεύεται από αυτόν τον πίνακα σε ένα καθορισμένο τμήμα του πίνακα σημείων. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον πίνακα. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτόν τον πίνακα με τη σειρά που καθορίζεται από*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Η πραγματική υλοποίηση. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Υλοποιεί τον τελεστή ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Υλοποιεί τον τελεστή !=. |

### Δείτε επίσης

* class [XpsObject](../xpsobject/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* συνέλευση [Aspose.Page](../../)


