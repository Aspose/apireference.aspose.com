---
title: Class PathGradientBrush
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.PathGradientBrush τάξη. Ενθυλακώνει αBrush αντικείμενο που γεμίζει το εσωτερικό του αGraphicsPath αντικείμενο με κλίση. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 400
url: /el/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Ενθυλακώνει αBrush αντικείμενο που γεμίζει το εσωτερικό του αGraphicsPath αντικείμενο με κλίση. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class PathGradientBrush : Brush
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | Αρχικοποιεί μια νέα παρουσία του`PathGradientBrush` κλάση με την καθορισμένη διαδρομή. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | Αρχικοποιεί μια νέα παρουσία του`PathGradientBrush` τάξη με τα καθορισμένα σημεία. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | Αρχικοποιεί μια νέα παρουσία του`PathGradientBrush` τάξη με τα καθορισμένα σημεία. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | Αρχικοποιεί μια νέα παρουσία του`PathGradientBrush` τάξη με τα καθορισμένα σημεία και τη λειτουργία αναδίπλωσης. |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | Αρχικοποιεί μια νέα παρουσία του`PathGradientBrush` τάξη με τα καθορισμένα σημεία και τη λειτουργία αναδίπλωσης. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | Λαμβάνει ή ορίζει αBlend που καθορίζει θέσεις και παράγοντες που ορίζουν μια προσαρμοσμένη πτώση για την κλίση. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | Λαμβάνει ή ορίζει το χρώμα στο κέντρο της κλίσης της διαδρομής. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | Λαμβάνει ή ορίζει το κεντρικό σημείο της κλίσης διαδρομής. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | Λαμβάνει ή ορίζει το σημείο εστίασης για την πτώση της κλίσης. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | Λαμβάνει ή ορίζει αColorBlendπου ορίζει μια πολύχρωμη γραμμική κλίση. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | Παίρνει ένα οριοθετημένο ορθογώνιο για αυτόPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | Λαμβάνει ή ορίζει έναν πίνακα χρωμάτων που αντιστοιχούν στα σημεία στη διαδρομή αυτόPathGradientBrush γεμίζει. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | Λαμβάνει ή ορίζει ένα αντίγραφο τουMatrix που ορίζει έναν τοπικό γεωμετρικό μετασχηματισμό για αυτόPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | Λαμβάνει ή ορίζει αWrapMode που υποδεικνύει τη λειτουργία αναδίπλωσης για αυτόPathGradientBrush . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτό το αντικείμενο Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | Ενημερώνει τον πίνακα μετασχηματισμού του πινέλου με το γινόμενο του matrix μετασχηματισμού του brush πολλαπλασιασμένο με έναν άλλο πίνακα. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Ενημερώνει τον πίνακα μετασχηματισμού του πινέλου με το γινόμενο του matrix μετασχηματισμού του πινέλου πολλαπλασιασμένο με έναν άλλο πίνακα. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | Επαναφέρει τοTransform ιδιοκτησία στην ταυτότητα. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό κατά το καθορισμένο ποσό. Αυτή η μέθοδος προϋποθέτει την περιστροφή στον μετασχηματισμό. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό κατά το καθορισμένο ποσό με την καθορισμένη σειρά. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό με τα καθορισμένα ποσά. Αυτή η μέθοδος προϋποθέτει τον πίνακα κλιμάκωσης στον μετασχηματισμό. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό κατά τα καθορισμένα ποσά με την καθορισμένη σειρά. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Δημιουργεί μια διαβάθμιση με κεντρικό χρώμα και γραμμική πτώση σε ένα περιβάλλον χρώμα. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Δημιουργεί μια κλίση με ένα κεντρικό χρώμα και μια γραμμική πτώση σε κάθε περιβάλλον χρώμα. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Δημιουργεί ένα πινέλο ντεγκραντέ που αλλάζει χρώμα ξεκινώντας από το κέντρο της διαδρομής προς τα έξω μέχρι το όριο της διαδρομής. Η μετάβαση από το ένα χρώμα στο άλλο βασίζεται σε μια καμπύλη σε σχήμα καμπάνας. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Δημιουργεί ένα πινέλο ντεγκραντέ που αλλάζει χρώμα ξεκινώντας από το κέντρο της διαδρομής προς τα έξω μέχρι το όριο της διαδρομής. Η μετάβαση από το ένα χρώμα στο άλλο βασίζεται σε μια καμπύλη σε σχήμα καμπάνας. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | Εφαρμόζει την καθορισμένη μετάφραση στον τοπικό γεωμετρικό μετασχηματισμό. Αυτή η μέθοδος προϋποθέτει τη μετάφραση στον μετασχηματισμό. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Εφαρμόζει την καθορισμένη μετάφραση στον τοπικό γεωμετρικό μετασχηματισμό με την καθορισμένη σειρά. |

### Δείτε επίσης

* class [Brush](../../system.drawing/brush/)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* συνέλευση [Aspose.Drawing](../../)


