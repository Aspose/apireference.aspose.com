---
title: Class TextureBrush
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.TextureBrush τάξη. Κάθε ιδιότητα της κλάσης TextureBrush είναι ένα αντικείμενο Brush που χρησιμοποιεί μια εικόνα για να γεμίσει το εσωτερικό ενός σχήματος. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 1260
url: /el/net/system.drawing/texturebrush/
---
## TextureBrush class

Κάθε ιδιότητα της κλάσης TextureBrush είναι ένα αντικείμενο Brush που χρησιμοποιεί μια εικόνα για να γεμίσει το εσωτερικό ενός σχήματος. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class TextureBrush : Brush
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | Αρχικοποιεί μια νέα παρουσία του`TextureBrush` κλάση που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | Αρχικοποιεί μια νέα παρουσία του`TextureBrush` κλάση που χρησιμοποιεί την καθορισμένη εικόνα και οριοθέτηση ορθογωνίου. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | Αρχικοποιεί μια νέα παρουσία του`TextureBrush` κλάση που χρησιμοποιεί την καθορισμένη λειτουργία εικόνας και αναδίπλωσης. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | Αρχικοποιεί μια νέα παρουσία του`TextureBrush` κλάση που χρησιμοποιεί τα χαρακτηριστικά εικόνας, οριοθέτησης ορθογωνίου και εικόνας. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | Αρχικοποιεί μια νέα παρουσία του`TextureBrush` κλάση που χρησιμοποιεί την καθορισμένη εικόνα, τη λειτουργία αναδίπλωσης και το οριοθετημένο ορθογώνιο. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | Λαμβάνει το αντικείμενο εικόνας που σχετίζεται με αυτό το αντικείμενο TextureBrush. |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | Λαμβάνει ή ορίζει ένα αντίγραφο του αντικειμένου Matrix που ορίζει έναν τοπικό γεωμετρικό μετασχηματισμό για το image που σχετίζεται με αυτό το αντικείμενο TextureBrush. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | Λαμβάνει ή ορίζει μια απαρίθμηση WrapMode που υποδεικνύει τη λειτουργία αναδίπλωσης για αυτό το αντικείμενο TextureBrush. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούTextureBrush αντικείμενο. |
| [Dispose](../../system.drawing/brush/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτό το αντικείμενο Brush. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | Πολλαπλασιάζει τοMatrix αντικείμενο που αντιπροσωπεύει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο από το καθορισμένοMatrix αντικείμενο με prepending το καθορισμένοMatrix αντικείμενο. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Πολλαπλασιάζει τοMatrix αντικείμενο που αντιπροσωπεύει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο από το καθορισμένοMatrix αντικείμενο με την καθορισμένη σειρά. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | Επαναφέρει την ιδιότητα Transform αυτούTextureBrush αντικείμενο στην ταυτότητα. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο με την καθορισμένη ποσότητα. Αυτή η μέθοδος προϋποθέτει την περιστροφή στον μετασχηματισμό. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο με το καθορισμένο ποσό με την καθορισμένη σειρά. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο με τα καθορισμένα ποσά. Αυτή η μέθοδος προϋποθέτει τον πίνακα κλιμάκωσης στον μετασχηματισμό. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο με τα καθορισμένα ποσά με την καθορισμένη σειρά. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | Μεταφράζει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrushαντικείμενο με τις καθορισμένες διαστάσεις. Αυτή η μέθοδος προϋποθέτει τη μετάφραση στον μετασχηματισμό. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Μεταφράζει τον τοπικό γεωμετρικό μετασχηματισμό αυτούTextureBrush αντικείμενο με τις καθορισμένες διαστάσεις με την καθορισμένη σειρά. |

### Δείτε επίσης

* class [Brush](../brush/)
* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


