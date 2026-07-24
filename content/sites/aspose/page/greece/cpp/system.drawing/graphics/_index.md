---
title: "System::Drawing::Graphics κλάση"
linktitle: "Graphics"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Graphics κλάση. Αντιπροσωπεύει μια επιφάνεια σχεδίασης. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.drawing/graphics/
---
## Graphics class


Αντιπροσωπεύει μια επιφάνεια σχεδίασης. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Graphics : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [BeginContainer](./begincontainer/)() | Αποθηκεύει ένα κοντέινερ με την τρέχουσα κατάσταση αυτού του αντικειμένου, ανοίγει και χρησιμοποιεί ένα νέο κοντέινερ και επιστρέφει το αποθηκευμένο κοντέινερ. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Αποθηκεύει ένα κοντέινερ με την τρέχουσα κατάσταση αυτού του αντικειμένου, ανοίγει και χρησιμοποιεί ένα νέο κοντέινερ και επιστρέφει το αποθηκευμένο κοντέινερ. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Αποθηκεύει ένα κοντέινερ με την τρέχουσα κατάσταση αυτού του αντικειμένου, ανοίγει και χρησιμοποιεί ένα νέο κοντέινερ και επιστρέφει το αποθηκευμένο κοντέινερ. |
| [Clear](./clear/)(Color) | Καθαρίζει την επιφάνεια σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο και την γεμίζει με το καθορισμένο χρώμα. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Dispose](./dispose/)() | Απελευθερώνει όλους τους πόρους του λειτουργικού συστήματος που αποκτήθηκαν από το τρέχον αντικείμενο. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Σχεδιάζει το καθορισμένο τόξο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Σχεδιάζει το καθορισμένο τόξο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Σχεδιάζει το καθορισμένο τόξο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Σχεδιάζει το καθορισμένο τόξο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Σχεδιάζει μια σειρά από καμπύλες Bezier χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Σχεδιάζει μια σειρά από καμπύλες Bezier χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Σχεδιάζει μια κλειστή καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Σχεδιάζει μια κλειστή καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Σχεδιάζει μια καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Σχεδιάζει μια καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Σχεδιάζει μια καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Σχεδιάζει μια καμπύλη χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Σχεδιάζει την καθορισμένη έλλειψη χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Σχεδιάζει την καθορισμένη έλλειψη χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Σχεδιάζει την καθορισμένη έλλειψη χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Σχεδιάζει την καθορισμένη έλλειψη χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Σχεδιάζει την καθορισμένη εικόνα στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Σχεδιάζει την καθορισμένη εικόνα στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Σχεδιάζει την καθορισμένη εικόνα στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στο καθορισμένο ορθογώνιο. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Σχεδιάζει την καθορισμένη περιοχή της καθορισμένης εικόνας στην καθορισμένη θέση. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Σχεδιάζει την καθορισμένη εικόνα χρησιμοποιώντας το αρχικό φυσικό της μέγεθος στην καθορισμένη θέση. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Σχεδιάζει μια καθορισμένη εικόνα χρησιμοποιώντας το αρχικό φυσικό της μέγεθος σε μια καθορισμένη θέση. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Σχεδιάζει μια καθορισμένη εικόνα χρησιμοποιώντας το αρχικό φυσικό της μέγεθος σε μια καθορισμένη θέση. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Σχεδιάζει μια καθορισμένη εικόνα χρησιμοποιώντας το αρχικό φυσικό της μέγεθος σε μια καθορισμένη θέση. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Σχεδιάζει τη καθορισμένη γραμμή χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Σχεδιάζει τη καθορισμένη γραμμή χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Σχεδιάζει τη καθορισμένη γραμμή χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Σχεδιάζει τη καθορισμένη γραμμή χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Σχεδιάζει μια σειρά από τμήματα γραμμής χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Σχεδιάζει μια σειρά από τμήματα γραμμής χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Σχεδιάζει τη καθορισμένη διαδρομή χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Σχεδιάζει το καθορισμένο τμήμα πίτας χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Σχεδιάζει το καθορισμένο τμήμα πίτας χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Σχεδιάζει το καθορισμένο τμήμα πίτας χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Σχεδιάζει το καθορισμένο τμήμα πίτας χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Σχεδιάζει ένα πολύγωνο χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Σχεδιάζει ένα πολύγωνο χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Σχεδιάζει το καθορισμένο ορθογώνιο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Σχεδιάζει το καθορισμένο ορθογώνιο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Σχεδιάζει το καθορισμένο ορθογώνιο χρησιμοποιώντας το καθορισμένο στυλό στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Σχεδιάζει μια σειρά από ορθογώνια χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Σχεδιάζει μια σειρά από ορθογώνια χρησιμοποιώντας το καθορισμένο στυλό. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Σχεδιάζει το καθορισμένο κείμενο στην καθορισμένη θέση χρησιμοποιώντας τη καθορισμένη γραμματοσειρά και το πινέλο. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Σχεδιάζει τη συγκεκριμένη συμβολοσειρά στο συγκεκριμένο ορθογώνιο χρησιμοποιώντας τη συγκεκριμένη γραμματοσειρά και πινέλο. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Σχεδιάζει το καθορισμένο κείμενο στην καθορισμένη θέση χρησιμοποιώντας τη καθορισμένη γραμματοσειρά και το πινέλο. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Κλείνει το τρέχον κοντέινερ και επαναφέρει την κατάσταση αυτού του αντικειμένου από την κατάσταση του αποθηκευμένου κοντέινερ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ExcludeClip](./excludeclip/)(Rectangle) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Σχεδιάζει μια κλειστή καμπύλη spline χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Σχεδιάζει μια κλειστή καμπύλη spline χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Γεμίζει το εσωτερικό του έλλειψα που καθορίζεται από το περιβάλλον ορθογώνιο χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Γεμίζει το εσωτερικό του έλλειψα που καθορίζεται από το περιβάλλον ορθογώνιο χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Γεμίζει το εσωτερικό του έλλειψα που καθορίζεται από το περιβάλλον ορθογώνιο χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Γεμίζει το εσωτερικό του έλλειψα που καθορίζεται από το περιβάλλον ορθογώνιο χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Γεμίζει τα εσωτερικά του συγκεκριμένου μονοπατιού χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Γεμίζει το συγκεκριμένο τμήμα πίτας χρησιμοποιώντας το συγκεκριμένο πινέλο στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Γεμίζει το συγκεκριμένο τμήμα πίτας χρησιμοποιώντας το συγκεκριμένο πινέλο στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Γεμίζει το συγκεκριμένο τμήμα πίτας χρησιμοποιώντας το συγκεκριμένο πινέλο στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Γεμίζει τα εσωτερικά του συγκεκριμένου πολυγώνου χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Γεμίζει τα εσωτερικά του συγκεκριμένου πολυγώνου χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Γεμίζει το συγκεκριμένο ορθογώνιο με το συγκεκριμένο πινέλο. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Γεμίζει το συγκεκριμένο ορθογώνιο με το συγκεκριμένο πινέλο. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Γεμίζει το συγκεκριμένο ορθογώνιο με το συγκεκριμένο πινέλο. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Γεμίζει το συγκεκριμένο ορθογώνιο με το συγκεκριμένο πινέλο. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Γεμίζει μια σειρά από ορθογώνια χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Γεμίζει μια σειρά από ορθογώνια χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Γεμίζει τα εσωτερικά της συγκεκριμένης περιοχής χρησιμοποιώντας το συγκεκριμένο πινέλο. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Ενεργοποιεί την άμεση εκτέλεση όλων των εκκρεμών λειτουργιών σχεδίασης. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Δημιουργεί ένα νέο αντικείμενο [Graphics](./) από την συγκεκριμένη εικόνα. |
| [get_Clip](./get_clip/)() | Επιστρέφει ένα αντικείμενο [Region](../region/) που αντιπροσωπεύει μια περιοχή που περιορίζει την περιοχή σχεδίασης της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο [Graphics](./). |
| [get_ClipBounds](./get_clipbounds/)() const | Επιστρέφει ένα ορθογώνιο που περιορίζει την περιοχή αποκοπής της επιφάνειας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_CompositingMode](./get_compositingmode/)() | Επιστρέφει μια τιμή που υποδεικνύει πώς οι σύνθετες εικόνες σχεδιάζονται στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_CompositingQuality](./get_compositingquality/)() | Επιστρέφει μια τιμή που υποδεικνύει το επίπεδο ποιότητας που χρησιμοποιείται κατά τη σύνθεση εικόνων. |
| [get_DpiX](./get_dpix/)() | Επιστρέφει την οριζόντια ανάλυση. |
| [get_DpiY](./get_dpiy/)() | Επιστρέφει την κάθετη ανάλυση. |
| [get_InterpolationMode](./get_interpolationmode/)() | Επιστρέφει μια τιμή που υποδεικνύει τη λειτουργία παρεμβολής που σχετίζεται με το τρέχον αντικείμενο. |
| [get_IsClipEmpty](./get_isclipempty/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_PageScale](./get_pagescale/)() const | Επιστρέφει την κλίμακα μεταξύ μονάδων κόσμου και μονάδων σελίδας για το τρέχον αντικείμενο [Graphics](./). |
| [get_PageUnit](./get_pageunit/)() const | Επιστρέφει τις μονάδες μέτρησης που χρησιμοποιούνται για τις συντεταγμένες σελίδας στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Επιστρέφει μια τιμή που υποδεικνύει πώς τα pixel μετατοπίζονται κατά τη απόδοση στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Επιστρέφει ένα αντικείμενο [Point](../point/) που αντιπροσωπεύει την αρχή απόδοσης του τρέχοντος αντικειμένου [Graphics](./) για dithering και για πινέλα hatch. |
| [get_SmoothingMode](./get_smoothingmode/)() | Επιστρέφει μια τιμή που υποδεικνύει μια ήρεμη λειτουργία που χρησιμοποιείται κατά τη διάρκεια της απόδοσης στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_TextContrast](./get_textcontrast/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Επιστρέφει μια τιμή που υποδεικνύει την ποιότητα της απόδοσης κειμένου. |
| [get_Transform](./get_transform/)() | Επιστρέφει τον γεωμετρικό μετασχηματισμό του κόσμου για το τρέχον αντικείμενο [Graphics](./). |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Επιστρέφει το αντικείμενο [RectangleF](../rectanglef/) που αντιπροσωπεύει ένα περιοριστικό ορθογώνιο της ορατής περιοχής αποκοπής του τρέχοντος αντικειμένου [Graphics](./). |
| [GetHdc](./gethdc/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetNearestColor](./getnearestcolor/)(Color) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Ενημερώνει την περιοχή αποκοπής αυτού του αντικειμένου στην τομή της τρέχουσας περιοχής αποκοπής και της καθορισμένης περιοχής αποκοπής. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Ενημερώνει την περιοχή αποκοπής αυτού του αντικειμένου στην τομή της τρέχουσας περιοχής αποκοπής και της καθορισμένης περιοχής αποκοπής. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Ενημερώνει την περιοχή αποκοπής αυτού του αντικειμένου στην τομή της τρέχουσας περιοχής αποκοπής και της καθορισμένης περιοχής αποκοπής. |
| [IsVisible](./isvisible/)(Point) | Καθορίζει εάν το καθορισμένο σημείο περιέχεται εντός της ορατής περιοχής αποκοπής του τρέχοντος αντικειμένου [Graphics](./). |
| [IsVisible](./isvisible/)(PointF) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(Rectangle) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(RectangleF) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(float, float, float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Επιστρέφει έναν πίνακα περιοχών, καθεμία από τις οποίες περιορίζει τις θέσεις χαρακτήρων στην καθορισμένη συμβολοσειρά. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Επιστρέφει το μέγεθος της καθορισμένης συμβολοσειράς όταν σχεδιάζεται με τη καθορισμένη γραμματοσειρά στην καθορισμένη μορφή. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Πολλαπλασιάζει τον πίνακα μετασχηματισμού του κόσμου του τρέχοντος αντικειμένου [Graphics](./) με τον καθορισμένο πίνακα. |
| [ReleaseHdc](./releasehdc/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [ResetClip](./resetclip/)() | Επαναφέρει την περιοχή αποκοπής για αυτό το γραφικό σε μια άπειρη περιοχή. |
| [ResetTransform](./resettransform/)() | Επαναφέρει τον πίνακα μετασχηματισμού του κόσμου του τρέχοντος αντικειμένου ώστε να γίνει πίνακας ταυτότητας. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Αποκαθιστά την κατάσταση αυτού του αντικειμένου από την αποθηκευμένη κατάσταση. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Εφαρμόζει την καθορισμένη περιστροφή στον πίνακα μετασχηματισμού του κόσμου του τρέχοντος αντικειμένου [Graphics](./) με τη καθορισμένη σειρά. |
| [Save](./save/)() | Αποθηκεύει την τρέχουσα κατάσταση αυτού του αντικειμένου και επιστρέφει την αποθηκευμένη κατάσταση. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας στον πίνακα μετασχηματισμού του κόσμου του τρέχοντος αντικειμένου. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Ορίζει μια περιοχή που περιορίζει την περιοχή σχεδίασης της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Ορίζει μια τιμή που καθορίζει πώς σχεδιάζονται οι συνδυασμένες εικόνες στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Ορίζει μια τιμή που καθορίζει το επίπεδο ποιότητας που θα χρησιμοποιηθεί κατά τη σύνθεση εικόνων. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Ορίζει μια τιμή που υποδεικνύει τη λειτουργία παρεμβολής που σχετίζεται με το τρέχον αντικείμενο. |
| [set_PageScale](./set_pagescale/)(float) | Ορίζει την κλίμακα μεταξύ των μονάδων του κόσμου και των μονάδων σελίδας για το τρέχον αντικείμενο [Graphics](./). |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Ορίζει τις μονάδες μέτρησης που χρησιμοποιούνται για τις συντεταγμένες σελίδας στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Ορίζει μια τιμή που καθορίζει πώς θα πρέπει να μετατοπίζονται τα pixel κατά την απόδοση στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Ορίζει ένα αντικείμενο [Point](../point/) που καθορίζει την αρχή απόδοσης του τρέχοντος αντικειμένου [Graphics](./) για τη διακριτοποίηση και για τα πινέλα γραμμών. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Ορίζει μια τιμή που καθορίζει μια λειτουργία ηρεμίας που χρησιμοποιείται κατά την απόδοση στην επιφάνεια που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Ορίζει μια τιμή που καθορίζει την ποιότητα της απόδοσης κειμένου. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Ορίζει τον γεωμετρικό μετασχηματισμό του κόσμου για το τρέχον αντικείμενο [Graphics](./). |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Ορίζει την περιοχή αποκοπής της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο [Graphics](./) στο αποτέλεσμα της καθορισμένης λειτουργίας που συνδυάζει την τρέχουσα περιοχή αποκοπής και την καθορισμένη περιοχή. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Ορίζει την περιοχή αποκοπής της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο [Graphics](./) στο αποτέλεσμα της καθορισμένης λειτουργίας που συνδυάζει την τρέχουσα περιοχή αποκοπής και την καθορισμένη περιοχή. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Ορίζει την περιοχή αποκοπής της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο [Graphics](./) στο αποτέλεσμα της καθορισμένης λειτουργίας που συνδυάζει την τρέχουσα περιοχή αποκοπής και την καθορισμένη περιοχή. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Ορίζει την περιοχή αποκοπής της επιφάνειας σχεδίασης που αντιπροσωπεύεται από το τρέχον αντικείμενο [Graphics](./) στο αποτέλεσμα της καθορισμένης λειτουργίας που συνδυάζει την τρέχουσα περιοχή αποκοπής και την περιοχή που καθορίζεται από μια διαδρομή γραφικών. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TranslateClip](./translateclip/)(int, int) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TranslateClip](./translateclip/)(float, float) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης στον πίνακα μετασχηματισμού του κόσμου του τρέχοντος αντικειμένου [Graphics](./). |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Ο τύπος ενός αντικειμένου συνάρτησης επιστροφής κλήσης που χρησιμοποιείται ως όρισμα για τη μέθοδο DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Ο τύπος ενός αντικειμένου συνάρτησης επιστροφής κλήσης που χρησιμοποιείται ως όρισμα για τη μέθοδο EnumerateMetafile. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
