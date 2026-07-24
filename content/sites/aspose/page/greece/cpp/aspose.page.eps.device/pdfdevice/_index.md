---
title: "Aspose::Page::EPS::Device::PdfDevice κλάση"
linktitle: "PdfDevice"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::Device::PdfDevice κλάση. Αυτή η κλάση περιλαμβάνει την απόδοση του εγγράφου σε PDF σε C++."
type: docs
weight: 300
url: /el/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" τιμή ιδιότητας. |
| static [BACKGROUND](./background/)() | "Background" κλειδί ιδιότητας. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" κλειδί ιδιότητας. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Κόβει χρησιμοποιώντας το δοσμένο σχήμα. Κατευθύνει στην writeClip(Rectangle), writeClip(RectangleF) ή writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Κόβει ορθογώνιο. Καλεί τη clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Κάνει τις απαραίτητες προετοιμασίες της συσκευής μετά την απόδοση της σελίδας. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" κλειδί ιδιότητας. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Δημιουργεί ένα αντίγραφο αυτής της συσκευής. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Αποδεσμεύει το γραφικό περιβάλλον. Εάν κατά τη δημιουργία το restoreOnDispose ήταν αληθές, θα κληθεί η writeGraphicsRestore(). |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Σχεδιάζει μια διαδρομή. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Σχεδιάζει μια εικόνα με την καθορισμένη μετασχηματισμό και φόντο. |
| [DrawString](./drawstring/)(System::String, double, double) override | Σχεδιάζει μια συμβολοσειρά στο δοσμένο σημείο. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" κλειδί ιδιότητας. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" κλειδί ιδιότητας. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" τιμή ιδιότητας. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" τιμή ιδιότητας. |
| [EndDocument](./enddocument/)() override | Κάνει τις απαραίτητες προετοιμασίες της συσκευής μετά την απόδοση του εγγράφου. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Γεμίζει μια διαδρομή. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" κλειδί ιδιότητας. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Τρέχων αριθμός σελίδας. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Σχεδιάζει πλαίσιο και λογότυπο γύρω από μια συμβολοσειρά. Η μέθοδος υπολογίζει και επιστρέφει το σημείο στο οποίο πρέπει να τοποθετηθεί ο κέρσορας κειμένου πριν από τη σχεδίαση της συμβολοσειράς. |
| [get_OutputStream](./get_outputstream/)() override | Καθορίζει ή επιστρέφει μια ροή εξόδου. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Λαμβάνει τον τρέχοντα μετασχηματισμό. |
| [InitClip](./initclip/)() override | Αρχικοποιεί το κλιπ της συσκευής. |
| [InitPageNumbers](./initpagenumbers/)() override | Αρχικοποιεί τον αριθμό των σελίδων για έξοδο. |
| static [KEYWORDS](./keywords/)() | "Keywords" τιμή ιδιότητας. |
| [OpenPage](./openpage/)(System::String) override | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας. |
| [OpenPage](./openpage/)(float, float) override | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση κάθε σελίδας. |
| static [ORIENTATION](./orientation/)() | "Orientation" κλειδί ιδιότητας. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" κλειδί ιδιότητας. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" κλειδί ιδιότητας. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Αρχικοποιεί νέο στιγμιότυπο του [PdfDevice](./) με ροή εξόδου. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Αρχικοποιεί νέο στιγμιότυπο του [PdfDevice](./) με ροή εξόδου και καθορισμένο μέγεθος σελίδας. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Κατασκευαστής κλωνοποίησης. Αρχικοποιεί νέο στιγμιότυπο του [PdfDevice](./) με υπάρχουσα συσκευή. |
| [ReNew](./renew/)() override | Επαναφέρει τη συσκευή στην αρχική κατάσταση για ολόκληρο το έγγραφο. Χρησιμοποιείται για την επαναφορά της ροής εξόδου. |
| [ReNewForMerge](./renewformerge/)(bool) override | Επαναφέρει τη συσκευή στην αρχική κατάσταση για ολόκληρο το έγγραφο κατά τη συγχώνευση πολλαπλών εγγράφων. Χρησιμοποιείται για την επαναφορά της ροής εξόδου. |
| [Reset](./reset/)() override | Εάν οριστούν οι παράμετροι της συσκευής σελίδας, αυτή η μέθοδος επιτρέπει την επιστροφή της ροής εγγραφής στην αρχή της σελίδας. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Περιστρέφει τον τρέχοντα μετασχηματισμό γύρω από τον άξονα Z. Καλεί τη writeTransform(Transform). Η περιστροφή με θετική γωνία θ περιστρέφει τα σημεία στον θετικό άξονα x προς τον θετικό άξονα y. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Καθορίζει την τρέχουσα γραμματοσειρά. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Καθορίζει ή επιστρέφει μια ροή εξόδου. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Επιστρέφει ή καθορίζει το τρέχον χρώμα. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Επιστρέφει ή καθορίζει την τρέχουσα γραμμή. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Καθορίζει το κλιπ της συσκευής. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Καθορίζει τον τρέχοντα μετασχηματισμό. Δεδομένου ότι οι περισσότερες μορφές εξόδου δεν υλοποιούν αυτή τη λειτουργία, υπολογίζεται ο αντίστροφος μετασχηματισμός του currentTransform και πολλαπλασιάζεται με τον μετασχηματισμό που θα οριστεί. Το αποτέλεσμα προωθείται στη συνέχεια με κλήση της writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Κλίνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την έναρξη απόδοσης του εγγράφου. |
| static [SUBJECT](./subject/)() | "Subject" τιμή ιδιότητας. |
| static [TITLE](./title/)() | "Title" τιμή ιδιότητας. |
| [ToString](./tostring/)() const override | Επιστρέφει το όνομα του τύπου συσκευής. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη μέθοδο writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Μετακινεί τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη μέθοδο writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | Κλειδί ιδιότητας "Transparent". |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Ενημερώνει τις παραμέτρους σελίδας από άλλη συσκευή πολλαπλών σελίδων. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | Κλειδί ιδιότητας "Format of images". |
| [WriteBackground](./writebackground/)() override | Γράφει το τρέχον φόντο. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Γράφει το άκρο (cap) της γραμμής. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Γράφει ένα σχόλιο. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Γράφει τη διακεκομμένη γραμμή (dash) της γραμμής. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Γράφει τον κατάλογο, το docinfo, τις προτιμήσεις και (καθώς χρησιμοποιούμε μόνο εξαγωγή μιας σελίδας) το δέντρο σελίδων. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Γράφει τη σύνδεση (join) της γραμμής. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Γράφει το τελευταίο γραμμένο χρώμα. Είναι χρήσιμο σε περιπτώσεις όπου μετά το γράψιμο του χρώματος πραγματοποιήθηκε επαναφορά γραφικών ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Γράφει το όριο μύτης (miter limit) της γραμμής. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Γράφει το χρώμα ως το δοσμένο χρώμα. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Γράφει το χρώμα ως το δοσμένο gradient. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Γράφει το χρώμα ως την δοσμένη υφή. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Γράφει το χρώμα. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Γράφει τη συμβολοσειρά με την καθορισμένη γραμματοσειρά. |
| [WriteTrailer](./writetrailer/)() | Γράφει το trailer του εγγράφου PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Γράψτε τον δοσμένο πίνακα μετασχηματισμού στο αρχείο. |
| [WriteWarning](./writewarning/)(System::String) override | Γράφει μια προειδοποίηση, προεπιλογή στο System.err. |
| [WriteWidth](./writewidth/)(float) override | Γράφει το πλάτος της γραμμής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [VERSION](./version/) | Κλειδί ιδιότητας "Version". |
| static [VERSION5](./version5/) | Τιμή ιδιότητας "Version of Adobe Acrobat Reader". |

## Deprecated
Η κλάση PdfDevice είναι παρωχημένη από την έκδοση 24.3. Παρακαλώ χρησιμοποιήστε τη μέθοδο SaveAsPdf στην κλάση PsDocument αντ' αυτού. Στην έκδοση 24.6 αυτή η κλάση θα κρυφτεί εντελώς.

## Δείτε επίσης

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
