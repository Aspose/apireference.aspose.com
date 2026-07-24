---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix κλάση"
linktitle: "XpsMatrix"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix κλάση. Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου ιδιότητας MatrixTransform. Αυτό το στοιχείο ορίζει μια αυθαίρετη αφινική μετατροπή μήτρας που χρησιμοποιείται για τη διαχείριση των συστημάτων συντεταγμένων των στοιχείων σε C++."
type: docs
weight: 2600
url: /el/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Κλάση που ενσωματώνει χαρακτηριστικά του στοιχείου ιδιότητας MatrixTransform. Αυτό το στοιχείο ορίζει έναν αυθαίρετο αφινικό μετασχηματισμό πίνακα που χρησιμοποιείται για τη διαχείριση των συστημάτων συντεταγμένων των στοιχείων.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Κλωνοποιεί αυτή τη μετασχηματιστική μήτρα. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Καθορίζει εάν το καθορισμένο [System::Object](../../system/object/) είναι ίσο με αυτήν την παρουσία. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Η πραγματική υλοποίηση. |
| [get_IsIdentity](./get_isidentity/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι μήτρα ταυτότητας. |
| [get_M11](./get_m11/)() | Λαμβάνει το στοιχείο M11. |
| [get_M12](./get_m12/)() | Λαμβάνει το στοιχείο M12. |
| [get_M21](./get_m21/)() | Λαμβάνει το στοιχείο M21. |
| [get_M22](./get_m22/)() | Λαμβάνει το στοιχείο M22. |
| [get_M31](./get_m31/)() | Λαμβάνει το στοιχείο M31. |
| [get_M32](./get_m32/)() | Λαμβάνει το στοιχείο M32. |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει έναν κωδικό κατακερματισμού για αυτήν την παρουσία. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Πολλαπλασιάζει αυτή τη μήτρα με τη μήτρα που καθορίζεται από το *matrix* με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Πολλαπλασιάζει αυτή τη μήτρα με τη μήτρα που καθορίζεται από το *matrix* στην προεπιλεγμένη (Prepend) σειρά. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Πολλαπλασιάζει αυτή τη μήτρα με τη μήτρα που καθορίζεται από το *matrix* με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Πολλαπλασιάζει αυτή τη μήτρα με τη μήτρα που καθορίζεται από το *matrix* στην προεπιλεγμένη (Prepend) σειρά. |
| [Reset](./reset/)() | Επαναφέρει αυτή τη Μήτρα στην μοναδιαία μήτρα. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή κατά *angle* σε αυτή τη Μήτρα με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [Rotate](./rotate/)(float) | Εφαρμόζει δεξιόστροφη περιστροφή κατά *angle* σε αυτή τη Μήτρα στην προεπιλεγμένη (Prepend) σειρά. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Εφαρμόζει δεξιόστροφη περιστροφή κατά *angle* γύρω από το *pivot* σε αυτή τη Μήτρα με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Εφαρμόζει δεξιόστροφη περιστροφή κατά *angle* γύρω από το *pivot* σε αυτή τη Μήτρα στην προεπιλεγμένη (Prepend) σειρά. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτή τη Μήτρα με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [Scale](./scale/)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας (scaleX και scaleY) σε αυτή τη Μήτρα στην προεπιλεγμένη (Prepend) σειρά. |
| [Skew](./skew/)(double, double) | Εφαρμόζει την καθορισμένη παραμόρφωση skew σε αυτή τη Μήτρα. |
| [ToString](./tostring/)() const override | Επιστρέφει την αναπαράσταση κειμένου αυτού του αντικειμένου [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | Εφαρμόζει τη γραμμική (affine) μετασχηματισμό που αντιπροσωπεύεται από αυτή τη Μήτρα σε ένα καθορισμένο ορθογώνιο. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Εφαρμόζει τη γραμμική (affine) μετασχηματισμό που αντιπροσωπεύεται από αυτή τη Μήτρα σε ένα καθορισμένο σημείο. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Εφαρμόζει τη γραμμική (affine) μετασχηματισμό που αντιπροσωπεύεται από αυτή τη Μήτρα σε ένα καθορισμένο τμήμα του πίνακα σημείων. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Εφαρμόζει τη γραμμική (affine) μετασχηματισμό που αντιπροσωπεύεται από αυτή τη Μήτρα σε έναν καθορισμένο πίνακα σημείων. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτή τη Μήτρα με τη σειρά που καθορίζεται από το *matrixOrder*. |
| [Translate](./translate/)(float, float) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης σε αυτή τη Μήτρα. |
## Δείτε επίσης

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
