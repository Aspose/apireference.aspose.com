---
title: "System::Drawing::Drawing2D::CustomLineCap κλάση"
linktitle: "CustomLineCap"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Drawing2D::CustomLineCap κλάση. Αντιπροσωπεύει μια γραμμή άκρου ορισμένη από τον χρήστη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Αντιπροσωπεύει μια γραμμή άκρου ορισμένη από τον χρήστη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class CustomLineCap : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Clone](./clone/)() | Επιστρέφει ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [CustomLineCap](./) που αντιπροσωπεύει μια γραμμή άκρου ορισμένη από τον χρήστη με τις καθορισμένες ιδιότητες. |
| [Dispose](./dispose/)() | Απελευθερώνει όλους τους πόρους του λειτουργικού συστήματος που αποκτήθηκαν από το τρέχον αντικείμενο. |
| [get_BaseCap](./get_basecap/)() const | Επιστρέφει το βασικό line cap από το οποίο δημιουργείται αυτό το custom cap. |
| [get_BaseInset](./get_baseinset/)() const | Επιστρέφει την απόσταση μεταξύ της γραμμής και του cap. |
| [get_StrokeJoin](./get_strokejoin/)() const | Επιστρέφει την τιμή [LineJoin](../linejoin/) που καθορίζει πώς ενώνεται οι γραμμές αυτού του custom cap. |
| [get_WidthScale](./get_widthscale/)() const | Επιστρέφει την κλίμακα αυτού του custom cap. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Αποκτά τα αρχικά και τελικά line caps του custom cap που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_BaseCap](./set_basecap/)(LineCap) | Ορίζει την τιμή του βασικού line cap για αυτό το custom cap. |
| [set_BaseInset](./set_baseinset/)(float) | Ορίζει την απόσταση μεταξύ της γραμμής και του cap. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Ορίζει την τιμή [LineJoin](../linejoin/) που καθορίζει πώς ενώνεται οι γραμμές αυτού του custom cap. |
| [set_WidthScale](./set_widthscale/)(float) | Ορίζει την τιμή κλίμακας αυτού του custom cap. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Ορίζει τα αρχικά και τελικά line caps του custom cap που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
