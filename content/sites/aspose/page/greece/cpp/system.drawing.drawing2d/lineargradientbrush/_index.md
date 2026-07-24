---
title: "System::Drawing::Drawing2D::LinearGradientBrush κλάση"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush κλάση. Αντιπροσωπεύει μια πινέλο γραμμικού διαβάθμισης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Αντιπροσωπεύει μια πινέλο γραμμικού διαβάθμισης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [get_Blend](./get_blend/)() const | Επιστρέφει ένα blend που καθορίζει τους παράγοντες και τις θέσεις των βασικών χρωμάτων για αυτό το πινέλο. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Επιστρέφει μια τιμή που υποδεικνύει ότι η διόρθωση γάμμα είναι ενεργοποιημένη για αυτό το πινέλο. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Επιστρέφει ένα αντικείμενο [ColorBlend](../colorblend/) που ορίζει μια πολύχρωμη γραμμική διαβάθμιση. |
| [get_LinearColors](./get_linearcolors/)() const | Επιστρέφει τα αρχικά και τελικά χρώματα αυτής της διαβάθμισης. |
| [get_Rectangle](./get_rectangle/)() | Επιστρέφει ένα ορθογώνιο περιορισμού. |
| [get_Transform](./get_transform/)() const | Επιστρέφει ένα αντίγραφο ενός αντικειμένου [Matrix](../matrix/) που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_WrapMode](./get_wrapmode/)() const | Επιστρέφει τη λειτουργία περιτύλιξης. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | Πληροφορίες RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Δημιουργεί μια νέα παρουσία του [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Δημιουργεί μια νέα παρουσία του [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Δημιουργεί μια νέα παρουσία του [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Δημιουργεί μια νέα παρουσία του [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Δημιουργεί μια νέα παρουσία του [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Πολλαπλασιάζει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου με τον καθορισμένο πίνακα. |
| [ResetTransform](./resettransform/)() | Επαναφέρει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Περιστρέφει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Κλιμακώνει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Ορίζει ένα blend που καθορίζει τους παράγοντες και τις θέσεις των βασικών χρωμάτων για αυτό το πινέλο. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Ορίζει την κατάσταση διόρθωσης γάμμα για αυτό το πινέλο. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Ορίζει ένα αντικείμενο [ColorBlend](../colorblend/) που ορίζει μια πολύχρωμη γραμμική διαβάθμιση. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Ορίζει τα αρχικά και τελικά χρώματα αυτής της διαβάθμισης. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Ορίζει ένα αντικείμενο [Matrix](../matrix/) που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Ορίζει τη λειτουργία περιτύλιξης. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Μετακινεί τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου. |
## Δείτε επίσης

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
