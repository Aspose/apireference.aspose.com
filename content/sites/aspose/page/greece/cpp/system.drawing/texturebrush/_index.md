---
title: "Κλάση System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Drawing::TextureBrush. Αντιπροσωπεύει ένα πινέλο που χρησιμοποιεί μια εικόνα για να γεμίσει το εσωτερικό ενός σχήματος. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Αντιπροσωπεύει ένα πινέλο που χρησιμοποιεί μια εικόνα για να γεμίσει το εσωτερικό ενός σχήματος. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [get_Image](./get_image/)() | Επιστρέφει μια εικόνα που χρησιμοποιείται από το τρέχον αντικείμενο [TextureBrush](./). |
| [get_Transform](./get_transform/)() | Επιστρέφει ένα αντίγραφο ενός αντικειμένου Matrix που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_WrapMode](./get_wrapmode/)() | Επιστρέφει μια τιμή που καθορίζει πώς το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο τοποθετείται σε μοτίβο. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Πολλαπλασιάζει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου με τον καθορισμένο πίνακα. |
| [ResetTransform](./resettransform/)() | Επαναφέρει τον πίνακα μετασχηματισμού του τρέχοντος αντικειμένου ώστε να γίνει μοναδιαίος πίνακας. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Περιστρέφει τον τοπικό γεωμετρικό μετασχηματισμό κατά την καθορισμένη γωνία με την καθορισμένη σειρά. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Κλιμακώνει τον τοπικό γεωμετρικό μετασχηματισμό με τους καθορισμένους παράγοντες με την καθορισμένη σειρά. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Ορίζει ένα αντικείμενο Matrix που καθορίζει τις γεωμετρικές μετασχηματισμούς για το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Ορίζει μια τιμή που καθορίζει πώς το πινέλο που αντιπροσωπεύεται από το τρέχον αντικείμενο τοποθετείται σε μοτίβο. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Δημιουργεί μια νέα παρουσία της κλάσης [TextureBrush](./) που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Δημιουργεί μια νέα παρουσία της κλάσης [TextureBrush](./) που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Δημιουργεί μια νέα παρουσία της κλάσης [TextureBrush](./) που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Δημιουργεί μια νέα παρουσία της κλάσης [TextureBrush](./) που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Δημιουργεί μια νέα παρουσία της κλάσης [TextureBrush](./) που χρησιμοποιεί την καθορισμένη εικόνα. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Μετατοπίζει τον τοπικό γεωμετρικό μετασχηματισμό κατά τις καθορισμένες διαστάσεις με την καθορισμένη σειρά. |
| virtual [~TextureBrush](./~texturebrush/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
