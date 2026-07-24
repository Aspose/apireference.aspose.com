---
title: "Aspose::Page::XPS::XpsDocument κλάση"
linktitle: "XpsDocument"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument κλάση. Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου XPS και παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο XPS σε C++."
type: docs
weight: 400
url: /el/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου [XPS](../) και παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(T) | Προσθέτει ένα στοιχείο περιεχομένου (Canvas, Path ή Glyphs). |
| [AddCanvas](./addcanvas/)() | Προσθέτει ένα νέο καμβά στη ενεργή σελίδα. |
| [AddDocument](./adddocument/)(bool) | Προσθέτει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [AddDocument](./adddocument/)(float, float, bool) | Προσθέτει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας *width* και *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Προσθέτει νέες γλύφες στη ενεργή σελίδα. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Προσθέτει νέες γλύφες στη ενεργή σελίδα. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο. |
| [AddPage](./addpage/)(bool) | Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [AddPage](./addpage/)(float, float, bool) | Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένα *width* και *height*. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Προσθέτει μια σελίδα στο έγγραφο. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Προσθέτει ένα νέο μονοπάτι στη ενεργή σελίδα. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Δημιουργεί ένα νέο τμήμα ελλειπτικού τόξου. |
| [CreateCanvas](./createcanvas/)() | Δημιουργεί ένα νέο καμβά. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Δημιουργεί ένα νέο χρώμα. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο σε ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο σε ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Δημιουργεί έναν νέο πόρο γραμματοσειράς **TrueType**. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Δημιουργεί έναν νέο πόρο γραμματοσειράς **TrueType** από ροή. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Δημιουργεί νέα glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Δημιουργεί νέα glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Δημιουργεί έναν νέο πόρο προφίλ ICC από το αρχείο προφίλ ICC που βρίσκεται στο *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Δημιουργεί έναν νέο πόρο προφίλ ICC από *stream*. |
| [CreateImage](./createimage/)(System::String) | Δημιουργεί έναν νέο πόρο εικόνας από το αρχείο εικόνας που βρίσκεται στο *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Δημιουργεί έναν νέο πόρο εικόνας από *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Δημιουργεί ένα νέο πινέλο γραμμικής διαβάθμισης. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Δημιουργεί ένα νέο πινέλο γραμμικής διαβάθμισης. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Δημιουργεί έναν νέο πίνακα αφινικής μετασχηματισμού. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Δημιουργεί ένα νέο μονοπάτι. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Δημιουργεί μια νέα μορφή μονοπατιού. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Δημιουργεί μια νέα μορφή μονοπατιού. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Δημιουργεί μια νέα γεωμετρία μονοπατιού που καθορίζεται με συντομευμένη μορφή. |
| [CreatePathGeometry](./createpathgeometry/)() | Δημιουργεί μια νέα γεωμετρία μονοπατιού. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Δημιουργεί μια νέα γεωμετρία μονοπατιού με καθορισμένη λίστα μορφών μονοπατιού. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Δημιουργεί ένα νέο σύνολο κυβικών καμπυλών Bézier. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Δημιουργεί ένα νέο πολυγωνικό σχέδιο που περιέχει αυθαίρετο αριθμό μεμονωμένων κορυφών. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών Bézier από το προηγούμενο σημείο στη μορφή μονοπατιού μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Δημιουργεί ένα νέο πινέλο στερεού χρώματος. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Δημιουργεί ένα νέο πινέλο στερεού χρώματος. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Δημιουργεί ένα νέο οπτικό πινέλο. |
| [Dispose](./dispose/)() override | Αποδεσμεύει την παρουσία. |
| [get_ActiveDocument](./get_activedocument/)() | Λαμβάνει τον αριθμό του ενεργού εγγράφου. |
| [get_ActivePage](./get_activepage/)() | Λαμβάνει τον αριθμό της ενεργής σελίδας εντός του ενεργού εγγράφου. |
| [get_DocumentCount](./get_documentcount/)() | Επιστρέφει τον αριθμό των εγγράφων μέσα στο πακέτο [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Επιστρέφει/ορίζει το εισιτήριο εκτύπωσης εργασίας του εγγράφου. |
| [get_Page](./get_page/)() | Επιστρέφει μια παρουσία [XpsPage](../) για τη ενεργή σελίδα. |
| [get_PageCount](./get_pagecount/)() | Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο. |
| [get_TotalPageCount](./get_totalpagecount/)() | Επιστρέφει το συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο [XPS](../). |
| [get_Utils](./get_utils/)() const | Λαμβάνει το αντικείμενο που παρέχει βοηθητικές λειτουργίες πέρα από το επίσημο API χειρισμού [XPS](../). |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Επιστρέφει το εισιτήριο εκτύπωσης του εγγράφου που έχει δείκτη *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Επιστρέφει το εισιτήριο εκτύπωσης της σελίδας που έχει δείκτη *pageIndex* στο έγγραφο που έχει δείκτη *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη ενεργή σελίδα στη θέση *index* . |
| [InsertCanvas](./insertcanvas/)(int32_t) | Εισάγει ένα νέο καμβά στη ενεργή σελίδα στη θέση *index* . |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση *index* . |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας *width* και *height* στη θέση *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Εισάγει νέα glyphs στη ενεργή σελίδα στη θέση *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Εισάγει νέα glyphs στη ενεργή σελίδα στη θέση *index* . |
| [InsertPage](./insertpage/)(int32_t, bool) | Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση *index* . |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένα *width* και *height* στη θέση *index* . |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Εισάγει μια σελίδα στο έγγραφο στη θέση *index* . |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Εισάγει ένα νέο path στη ενεργή σελίδα στη θέση *index* . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Συγχώνευση πολλαπλών αρχείων [XPS](../) σε ένα έγγραφο [XPS](../) . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Συγχώνευση πολλαπλών αρχείων [XPS](../) σε ένα έγγραφο [XPS](../) . |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Συγχώνευση εγγράφων [XPS](../) σε PDF χρησιμοποιώντας το αντικείμενο [Device](../) . |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Συγχώνευση εγγράφων [XPS](../) σε PDF χρησιμοποιώντας το αντικείμενο [Device](../) . |
| [Remove](./remove/)(T) | Αφαιρεί ένα στοιχείο από τη ενεργή σελίδα. |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί ένα στοιχείο στη θέση *index* από τη ενεργή σελίδα. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Αφαιρεί ένα έγγραφο στη θέση *index* . |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Αφαιρεί μια σελίδα από το έγγραφο. |
| [RemovePageAt](./removepageat/)(int32_t) | Αφαιρεί μια σελίδα από το έγγραφο στη θέση *index* . |
| [Save](./save/)(System::String) | Αποθηκεύει το έγγραφο [XPS](../) σε αρχείο [XPS](../) που βρίσκεται στο *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Αποθηκεύει το έγγραφο [XPS](../) σε ροή. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Αποθηκεύει το έγγραφο σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με το αρχείο [XPS](../) εισόδου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν είναι FileStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με προεπιλεγμένο πρότυπο ονόματος αρχείου. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Αποθηκεύει το έγγραφο σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Αποθηκεύει το έγγραφο σε μορφή bitmap εικόνας ως πίνακες byte. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Αποθηκεύει το έγγραφο σε μορφή PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Αποθηκεύει το έγγραφο σε μορφή PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Αποθηκεύει το έγγραφο σε μορφή PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Αποθηκεύει το έγγραφο σε μορφή PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Επιλέγει ένα ενεργό έγγραφο για επεξεργασία. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Επιλέγει μια ενεργή σελίδα εγγράφου για επεξεργασία. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Επιστρέφει/ορίζει το εισιτήριο εκτύπωσης εργασίας του εγγράφου. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Συνδέει το *printTicket* με το έγγραφο που έχει δείκτη *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Συνδέει το *printTicket* με τη σελίδα που έχει δείκτη *pageIndex* στο έγγραφο που έχει δείκτη *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Δημιουργεί κενό έγγραφο [XPS](../) με προεπιλεγμένο μέγεθος σελίδας. |
| [XpsDocument](./xpsdocument/)(System::String) | Ανοίγει ένα υπάρχον έγγραφο [XPS](../) που βρίσκεται στη *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Ανοίγει ένα υπάρχον έγγραφο που βρίσκεται στη *path* ως έγγραφο [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Φορτώνει ένα υπάρχον έγγραφο που αποθηκεύεται στο *stream* ως έγγραφο [XPS](../). |
## Δείτε επίσης

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
