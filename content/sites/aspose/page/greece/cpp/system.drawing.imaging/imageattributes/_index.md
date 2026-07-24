---
title: "System::Drawing::Imaging::ImageAttributes κλάση"
linktitle: "ImageAttributes"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Imaging::ImageAttributes κλάση. Παριστά πληροφορίες σχετικά με το πώς οι χρώματα της εικόνας τροποποιούνται κατά την απόδοση. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Παριστά πληροφορίες σχετικά με το πώς οι χρώματα της εικόνας τροποποιούνται κατά την απόδοση. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ImageAttributes : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [Dispose](./dispose/)() | Απελευθερώνει όλους τους πόρους του λειτουργικού συστήματος που αποκτήθηκαν από το τρέχον αντικείμενο. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ImageAttributes](./imageattributes/)() | Προεπιλεγμένος κατασκευαστής. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Ορίζει τον πίνακα ρύθμισης χρώματος. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Ορίζει τη λειτουργία περιτύλιξης και το χρώμα που χρησιμοποιείται για να αποφασίσει πώς θα τοποθετηθεί μια υφή πάνω σε ένα σχήμα ή στα όρια του σχήματος. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
