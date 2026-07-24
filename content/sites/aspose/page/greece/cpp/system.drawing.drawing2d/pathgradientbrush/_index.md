---
title: "System::Drawing::Drawing2D::PathGradientBrush κλάση"
linktitle: "PathGradientBrush"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Drawing2D::PathGradientBrush κλάση. Αντιπροσωπεύει ένα πινέλο που γεμίζει το εσωτερικό ενός αντικειμένου GraphicsPath με μια διαβάθμιση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Αντιπροσωπεύει ένα πινέλο που γεμίζει το εσωτερικό ενός αντικειμένου [GraphicsPath](../graphicspath/) με μια διαβάθμιση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [get_Blend](./get_blend/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_CenterColor](./get_centercolor/)() const | Επιστρέφει ένα χρώμα που βρίσκεται στο κέντρο της διαδρομής που γεμίζει το τρέχον αντικείμενο. |
| [get_CenterPoint](./get_centerpoint/)() const | Λαμβάνει το κεντρικό σημείο της διαβάθμισης. |
| [get_FocusScales](./get_focusscales/)() const | Λαμβάνει το σημείο εστίασης για τη μείωση της διαβάθμισης. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Επιστρέφει μια τιμή που ορίζει μια πολυχρωματική γραμμική διαβάθμιση. |
| [get_Rectangle](./get_rectangle/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_SurroundColors](./get_surroundcolors/)() const | Επιστρέφει χρώματα που αντιστοιχούν στα σημεία της διαδρομής που γεμίζει αυτό το [PathGradientBrush](./). |
| [get_Transform](./get_transform/)() const | Επιστρέφει ένα αντίγραφο ενός αντικειμένου [Matrix](../matrix/) που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_WrapMode](./get_wrapmode/)() const | Επιστρέφει τη λειτουργία περιτύλιξης. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Πολλαπλασιάζει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου με τον καθορισμένο πίνακα. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | Πληροφορίες RTTI. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [PathGradientBrush](./). |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [PathGradientBrush](./). |
| [ResetTransform](./resettransform/)() | Επαναφέρει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου ώστε να γίνει μοναδιαίος πίνακας. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό κατά την καθορισμένη γωνία με την καθορισμένη σειρά. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό με τους καθορισμένους παράγοντες με την καθορισμένη σειρά. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Ορίζει ένα blend που καθορίζει τους παράγοντες και τις θέσεις των βασικών χρωμάτων για αυτό το πινέλο. |
| [set_CenterColor](./set_centercolor/)(Color) | Ορίζει ένα χρώμα που βρίσκεται στο κέντρο της διαδρομής που γεμίζει το τρέχον αντικείμενο. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Ορίζει το κεντρικό σημείο της διαβάθμισης. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Ορίζει το σημείο εστίασης για τη μείωση της διαβάθμισης. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Ορίζει μια τιμή που ορίζει μια πολυχρωματική γραμμική διαβάθμιση. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Ορίζει χρώματα που αντιστοιχούν στα σημεία της διαδρομής που γεμίζει αυτό το [PathGradientBrush](./). |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Ορίζει ένα αντικείμενο [Matrix](../matrix/) που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Ορίζει τη λειτουργία περιτύλιξης. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Μετατοπίζει τον τοπικό γεωμετρικό μετασχηματισμό κατά τις καθορισμένες διαστάσεις με την καθορισμένη σειρά. |
## Δείτε επίσης

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
