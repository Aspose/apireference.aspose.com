---
title: "Aspose::Page::EPS::PsDocument κλάση"
linktitle: "PsDocument"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument κλάση. Αυτή η κλάση περιλαμβάνει έγγραφα PS/EPS σε C++."
type: docs
weight: 700
url: /el/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Αυτή η κλάση ενσωματώνει έγγραφα PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Προσθέτει αποκοπή στην τρέχουσα κατάσταση γραφικών. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Προσθέτει αποκοπή στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή "newpath". Είναι απαραίτητο για την αποφυγή σύγκρουσης αυτής της διαδρομής αποκοπής με κάποιες επόμενες διαδρομές όπως τα γλύφοι που περιγράφονται με τον τελεστή "charpath". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Προσθέτει ορθογώνιο αποκοπής στην τρέχουσα κατάσταση γραφικών. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Προσθέτει αποκοπή από το περίγραμμα του δεδομένου κειμένου σε δεδομένη γραμματοσειρά. |
| [ClosePage](./closepage/)() | Ολοκληρώνει την τρέχουσα σελίδα. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Μετατρέπει τη γραμματοσειρά Type 1 σε **TrueType**. Το όνομα της μετατρεπόμενης γραμματοσειράς TTF θα είναι το ίδιο με τη γραμματοσειρά Type 1 εισόδου με επέκταση ".ttf". Το αρχείο TTF θα αποθηκευτεί στον καθορισμένο φάκελο εξόδου. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Μετατρέπει τη γραμματοσειρά Type 3 σε **TrueType**. Το όνομα της μετατρεπόμενης γραμματοσειράς TTF θα είναι το ίδιο με το αρχείο γραμματοσειράς Type 3 εισόδου με επέκταση ".ttf". Το αρχείο TTF θα αποθηκευτεί στον καθορισμένο φάκελο εξόδου. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Μετατρέπει τη γραμματοσειρά Type 3 σε ροή **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Κόβει το δεδομένο [PsDocument](./) ως αρχείο [EPS](../). Αποθηκεύει το αρχικό αρχείο [EPS](../) με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Κόβει το δεδομένο [PsDocument](./) ως αρχείο [EPS](../). Αποθηκεύει το αρχικό αρχείο [EPS](../) με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Σχεδίασε μια αυθαίρετη διαδρομή. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Σχεδίαζει ένα τόξο. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Σχεδίαζει εικόνα με μάσκα. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Σχεδίαζει εικόνα. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Σχεδίαζει μετασχηματισμένη εικόνα με φόντο. |
| [DrawLine](./drawline/)(double, double, double, double) | Σχεδίαζει ένα τμήμα γραμμής. |
| [DrawOval](./drawoval/)(double, double, double, double) | Σχεδίαζει ένα ωοειδές. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Σχεδιάζει ένα πολύγωνο. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Σχεδιάζει ένα πολυγώνιο. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Σχεδιάζει μια πολυγραμμή. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Σχεδιάζει μια πολυγραμμή. |
| [DrawRect](./drawrect/)(double, double, double, double) | Σχεδιάζει ένα ορθογώνιο. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Σχεδιάζει ένα στρογγυλεμένο ορθογώνιο. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Σχεδιάζει μετασχηματισμένη διαφανή εικόνα. Εάν η εικόνα δεν έχει κανάλι Alpha, θα σχεδιαστεί ως αδιαφανής εικόνα. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Διαβάζει το αρχείο [EPS](../) και εξάγει το πλαίσιο περιορισμού της εικόνας [EPS](../) από το σχόλιο %BoundingBox ή τα όρια του προεπιλεγμένου μεγέθους σελίδας (0, 0, 595, 842) εάν δεν υπάρχει. |
| [ExtractEpsSize](./extractepssize/)() | Διαβάζει το αρχείο [EPS](../) και εξάγει το μέγεθος της εικόνας [EPS](../) από το σχόλιο %BoundingBox ή το προεπιλεγμένο μέγεθος σελίδας (595, 842) εάν δεν υπάρχει. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Εξάγει κείμενο από αρχείο PS. Το κείμενο μπορεί να εξαχθεί μόνο εάν είναι γραμμένο με γραμματοσειρά Type 42 (**TrueType**) ή γραμματοσειρά Type 0 με γραμματοσειρές Type 42 στον Vector Map της. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Γεμίζει ένα αυθαίρετο μονοπάτι. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Γεμίζει ένα τόξο. |
| [FillOval](./filloval/)(double, double, double, double) | Γεμίζει ένα ωοειδές. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Γεμίζει ένα πολυγώνιο. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Γεμίζει ένα πολυγώνιο. |
| [FillRect](./fillrect/)(double, double, double, double) | Γεμίζει ένα ορθογώνιο. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Γεμίζει ένα στρογγυλεμένο ορθογώνιο. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών. |
| [get_InputStream](./get_inputstream/)() | Αρχικοποιεί το [PsDocument](./) με μια ροή και επιλογές φόρτωσης. |
| [get_NumberOfPages](./get_numberofpages/)() const | Επιστρέφει τον αριθμό σελίδων του τελικού εγγράφου PDF. |
| [GetPaint](./getpaint/)() | Λαμβάνει το χρώμα της τρέχουσας κατάστασης γραφικών. |
| [GetStroke](./getstroke/)() | Ορίζει το στυλ γραμμής (stroke) στην τρέχουσα κατάσταση γραφικών. |
| [GetXmpMetadata](./getxmpmetadata/)() | Διαβάζει το αρχείο PS/EPS και εξάγει το XmpMetdata εάν υπάρχει ήδη ή προσθέτει νέο εάν δεν υπάρχει. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [OpenPage](./openpage/)(float, float) | Δημιουργεί νέα σελίδα και την καθιστά τρέχουσα. |
| [OpenPage](./openpage/)(System::String) | Δημιουργεί νέα σελίδα με το μέγεθος του εγγράφου και την καθιστά τρέχουσα. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [PsDocument](./psdocument/)() | Αρχικοποιεί κενό [PsDocument](./). Αυτός ο κατασκευαστής χρησιμοποιείται μόνο για πρόσθετες λειτουργίες που δεν σχετίζονται με αρχεία PostScript, για παράδειγμα, μετατροπή γραμματοσειρών. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Αρχικοποιεί κενό [PsDocument](./) με αρχικοποιημένη σελίδα. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Αρχικοποιεί κενό [PsDocument](./) με αρχικοποιημένη σελίδα. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Αρχικοποιεί κενό [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Αρχικοποιεί κενό [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Αρχικοποιεί κενό [PsDocument](./) όταν ο αριθμός των σελίδων του εγγράφου [Postscript](../../aspose.page.eps.postscript/) είναι γνωστός εκ των προτέρων. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Αρχικοποιεί κενό [PsDocument](./) όταν ο αριθμός των σελίδων του εγγράφου [Postscript](../../aspose.page.eps.postscript/) είναι γνωστός εκ των προτέρων. |
| [PsDocument](./psdocument/)(System::String) | Αρχικοποιεί το [PsDocument](./) με ένα αρχείο εισόδου PS/EPS. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Αρχικοποιεί το [PsDocument](./) με μια ροή αρχείου PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Αλλάζει το μέγεθος του δεδομένου [PsDocument](./) ως αρχείο [EPS](../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους του [EPS](../). Αποθηκεύει το αρχικό αρχείο [EPS](../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. Ο μετασχηματιστικός πίνακας [Page](../../aspose.page/) επίσης θα οριστεί. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Αλλάζει το μέγεθος του δεδομένου [PsDocument](./) ως αρχείο [EPS](../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους του [EPS](../). Αποθηκεύει το αρχικό αρχείο [EPS](../) με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. Ο μετασχηματιστικός πίνακας [Page](../../aspose.page/) επίσης θα οριστεί. |
| [Rotate](./rotate/)(float) | Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχοντος πίνακα). |
| [Rotate](./rotate/)(int32_t) | Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχοντος πίνακα). |
| [Save](./save/)(System::String) | Αποθηκεύει το δεδομένο [PsDocument](./) ως αρχείο [EPS](../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων [XMP](../../aspose.page.eps.xmp/). Αποθηκεύει το αρχικό αρχείο [EPS](../) με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργείται κατά την κλήση της μεθόδου GetMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια [EPS](../). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Αποθηκεύει το δεδομένο [PsDocument](./) στη ροή. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων [XMP](../../aspose.page.eps.xmp/). Αποθηκεύει το αρχικό αρχείο [EPS](../) με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργείται κατά την κλήση της μεθόδου GetMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια [EPS](../). |
| [Save](./save/)() | Αποθηκεύει το δεδομένο [PsDocument](./) ως αρχείο PS ή [EPS](../). Αυτή η μέθοδος χρησιμοποιείται μόνο όταν το [PsDocument](./) δημιουργήθηκε από την αρχή. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με το αρχείο εισόδου PS. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν είναι FileStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με το προεπιλεγμένο πρότυπο ονόματος αρχείου. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Αποθηκεύει το αρχείο PS/EPS σε πίνακες byte εικόνων. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Αποθηκεύει το αρχείο PS/EPS σε ροή PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Αποθηκεύει εικόνα PNG/JPEG/TIFF/BMP/GIF/EMF από την είσοδο ροής σε ροή εξόδου [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Αποθηκεύει εικόνα PNG/JPEG/TIFF/BMP/GIF/EMF από αρχείο σε αρχείο [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Αποθηκεύει το αντικείμενο Bitmap σε αρχείο [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Αποθηκεύει το αντικείμενο Bitmap σε ροή εξόδου [EPS](../). |
| [Scale](./scale/)(float, float) | Προσθέτει κλίμακα στην τρέχουσα κατάσταση γραφικών (κλιμάκωση τρέχοντος πίνακα). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Αρχικοποιεί το [PsDocument](./) με μια ροή και επιλογές φόρτωσης. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Ορίζει παραμέτρους συσκευής σελίδας (δείτε τον τελεστή \"setpagedevice\" στην προδιαγραφή PostScript). Μεταξύ αυτών μπορεί να είναι το μέγεθος σελίδας, το χρώμα κ.λπ. |
| [SetPageSize](./setpagesize/)(float, float) | Ορίζει το μέγεθος σελίδας. Για να δημιουργήσετε σελίδες με διαφορετικά μεγέθη σε ένα έγγραφο, χρησιμοποιήστε τη μέθοδο [SetPageDevice](./setpagedevice/) αμέσως μετά από αυτή τη μέθοδο. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Ορίζει το χρώμα στην τρέχουσα κατάσταση γραφικών. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Ορίζει το στυλ γραμμής (stroke) στην τρέχουσα κατάσταση γραφικών. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ορίστε τον τρέχοντα μετασχηματισμό σε αυτόν. |
| [Shear](./shear/)(float, float) | Περιστρέφει την τρέχουσα κατάσταση γραφικών αριστερόστροφα γύρω από ένα σημείο. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Προσθέτει μετασχηματισμό στην τρέχουσα κατάσταση γραφικών (συνενώνει αυτόν τον πίνακα με τον τρέχοντα). |
| [Translate](./translate/)(float, float) | Προσθέτει μετάφραση στην τρέχουσα κατάσταση γραφικών (μεταφράζει τον τρέχοντα πίνακα). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Γράφει την αποκατάσταση της τρέχουσας κατάστασης γραφικών (Δείτε την προδιαγραφή PostScript για τον τελεστή "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Γράφει την αποθήκευση της τρέχουσας κατάστασης γραφικών (Δείτε την προδιαγραφή PostScript για τον τελεστή "gsave"). |
## Δείτε επίσης

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
