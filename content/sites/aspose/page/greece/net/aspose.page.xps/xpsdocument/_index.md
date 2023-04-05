---
title: Class XpsDocument
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsDocument τάξη. Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου XPS που παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο XPS.
type: docs
weight: 470
url: /el/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου XPS που παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Δημιουργεί κενό έγγραφο XPS με προεπιλεγμένο μέγεθος σελίδας. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Ανοίγει ένα υπάρχον έγγραφο XPS που βρίσκεται στο*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Φορτώνει ένα υπάρχον έγγραφο που είναι αποθηκευμένο στο*stream* ως έγγραφο XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Ανοίγει ένα υπάρχον έγγραφο που βρίσκεται στο*path* ως έγγραφο XPS. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Λαμβάνει τον αριθμό ενεργού εγγράφου. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Λαμβάνει τον αριθμό της ενεργής σελίδας μέσα στο ενεργό έγγραφο. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Επιστρέφει τον αριθμό των εγγράφων μέσα στο πακέτο XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Επιστρέφει/ορίζει την εργασία του εγγράφου εκτύπωση ticket |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Επιστρέφει ένα[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) παράδειγμα για ενεργή σελίδα. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Επιστρέφει τον συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο XPS. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Προσθέτει ένα στοιχείο περιεχομένου (καμβάς, διαδρομή ή γλύφες) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Προσθέτει έναν νέο καμβά στην ενεργή σελίδα. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Προσθέτει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Προσθέτει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας *width* και*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Προσθέτει νέα γλυφά στην ενεργή σελίδα. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Προσθέτει νέα γλυφά στην ενεργή σελίδα. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Προσθέτει μια καταχώρηση περίγραμμα στο έγγραφο. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Προσθέτει μια σελίδα στο έγγραφο. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένο *width* και*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Προσθέτει μια νέα διαδρομή στην ενεργή σελίδα. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Δημιουργεί ένα νέο τμήμα ελλειπτικού τόξου. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Δημιουργεί έναν νέο καμβά. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Δημιουργεί νέο χρώμα. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο βάσει ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο βάσει ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Δημιουργεί ένα νέο χρώμα στον χρωματικό χώρο sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType εκτός ροής. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Δημιουργεί νέα γλυφά. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Δημιουργεί νέα γλυφά. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Δημιουργεί μια νέα στάση διαβάθμισης. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Δημιουργεί μια νέα στάση διαβάθμισης. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Δημιουργεί έναν νέο πόρο προφίλ ICC από*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Δημιουργεί έναν νέο πόρο προφίλ ICC από το αρχείο προφίλ ICC που βρίσκεται στο *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Δημιουργεί έναν νέο πόρο εικόνας από*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Δημιουργεί έναν νέο πόρο εικόνας από αρχείο εικόνας που βρίσκεται στο*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Δημιουργεί ένα νέο πινέλο γραμμικής διαβάθμισης. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Δημιουργεί ένα νέο πινέλο γραμμικής διαβάθμισης. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Δημιουργεί μια νέα μήτρα μετασχηματισμού συγγενών. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Δημιουργεί μια νέα διαδρομή. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Δημιουργεί ένα νέο σχήμα διαδρομής. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Δημιουργεί ένα νέο σχήμα διαδρομής. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Δημιουργεί μια νέα γεωμετρία διαδρομής. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Δημιουργεί μια νέα γεωμετρία διαδρομής με καθορισμένη λίστα σχημάτων διαδρομής. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Δημιουργεί μια νέα γεωμετρία διαδρομής που καθορίζεται με συντομευμένη μορφή. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Δημιουργεί ένα νέο σύνολο κυβικών καμπυλών Bézier. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Δημιουργεί ένα νέο πολυγωνικό σχέδιο που περιέχει έναν αυθαίρετο αριθμό μεμονωμένων κορυφών. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών Bézier από το προηγούμενο σημείο στο σχήμα διαδρομής μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Δημιουργεί ένα νέο μονόχρωμο πινέλο. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Δημιουργεί ένα νέο μονόχρωμο πινέλο. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Δημιουργεί ένα νέο οπτικό πινέλο. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Διαθέτει την παρουσία. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Επιστρέφει το εισιτήριο εκτύπωσης του εγγράφου που έχει ευρετηριαστεί από*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Επιστρέφει το εισιτήριο εκτύπωσης της σελίδας που έχει ευρετηριαστεί από*pageIndex* στο έγγραφο που ευρετηριάζεται από*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Εισάγει ένα στοιχείο (καμβάς, διαδρομή ή γλυφές) στην ενεργή σελίδα στο*index* θέση. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Εισάγει έναν νέο καμβά στην ενεργή σελίδα στο*index* θέση. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στο*index* θέση. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας *width* και*height* στο*index* θέση. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Εισάγει νέα γλυφά στην ενεργή σελίδα στο*index* θέση. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Εισάγει νέα γλυφά στην ενεργή σελίδα στο*index* θέση. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στο*index* θέση. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Εισάγει μια σελίδα στο έγγραφο στο*index* θέση. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένο *width* και*height* στο*index* θέση. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Εισάγει μια νέα διαδρομή προς την ενεργή σελίδα στο*index* θέση. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Συγχώνευση πολλών αρχείων XPS σε ένα έγγραφο XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Συγχώνευση εγγράφων XPS σε PDF χρησιμοποιώντας το[`Device`](../../aspose.page/device/) παράδειγμα. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Αφαιρεί ένα στοιχείο από την ενεργή σελίδα. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Αφαιρεί ένα στοιχείο στο*index* θέση από την ενεργή σελίδα. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Αφαιρεί ένα έγγραφο στο*index* θέση. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Αφαιρεί μια σελίδα από το έγγραφο. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Αφαιρεί μια σελίδα από το έγγραφο στο*index* θέση. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Αποθηκεύει έγγραφο XPS σε ροή. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Αποθηκεύει το έγγραφο XPS σε αρχείο XPS που βρίσκεται στο*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Αποθηκεύει το έγγραφο χρησιμοποιώντας το[`Device`](../../aspose.page/device/) παράδειγμα. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Επιλέγει ένα ενεργό έγγραφο για επεξεργασία. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Επιλέγει μια ενεργή σελίδα εγγράφου για επεξεργασία. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Συνδέει το*printTicket* στο έγγραφο που ευρετηριάζεται από*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Συνδέει το*printTicket* στη σελίδα που έχει ευρετηριαστεί από*pageIndex* στο έγγραφο που ευρετηριάζεται από*documentIndex* . |

### Δείτε επίσης

* class [Document](../../aspose.page/document/)
* χώρος ονομάτων [Aspose.Page.XPS](../../aspose.page.xps/)
* συνέλευση [Aspose.Page](../../)


