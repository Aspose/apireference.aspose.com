---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI κλάση"
linktitle: "PageAPI"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI κλάση. Το API τροποποίησης στοιχείου Page σε C++."
type: docs
weight: 500
url: /el/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


Το **[Page](../../aspose.page/)** API τροποποίησης στοιχείου.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(T) | Προσθέτει ένα στοιχείο περιεχομένου (Canvas, Path ή Glyphs). |
| [AddCanvas](./addcanvas/)() | Προσθέτει ένα νέο καμβά στη σελίδα. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Προσθέτει νέα glyphs στη σελίδα. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Προσθέτει νέα glyphs στη σελίδα. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Προσθέτει ένα νέο path στη σελίδα. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Δημιουργεί ένα νέο τμήμα ελλειπτικού τόξου. |
| [CreateCanvas](./createcanvas/)() | Δημιουργεί ένα νέο καμβά. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Δημιουργεί ένα νέο χρώμα. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο σε ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο σε ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Δημιουργεί νέα glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Δημιουργεί νέα glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
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
| [get_Height](./get_height/)() | Επιστρέφει/ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [get_PageCount](./get_pagecount/)() | Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο. |
| [get_TotalPageCount](./get_totalpagecount/)() | Επιστρέφει το συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Λαμβάνει το αντικείμενο που παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API διαχείρισης [XPS](../../aspose.page.xps/). |
| [get_Width](./get_width/)() | Επιστρέφει/ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [Insert](./insert/)(int32_t, T) | Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη σελίδα στη θέση *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Εισάγει ένα νέο καμβά στη σελίδα στη θέση *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Εισάγει νέα glyphs στη σελίδα στη θέση *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Εισάγει νέα glyphs στη σελίδα στη θέση *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Εισάγει ένα νέο μονοπάτι στη σελίδα στη θέση *index*. |
| [Remove](./remove/)(T) | Αφαιρεί ένα στοιχείο από τη σελίδα. |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί ένα στοιχείο στη θέση *index* από τη σελίδα. |
| [set_Height](./set_height/)(float) | Επιστρέφει/ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
| [set_Width](./set_width/)(float) | Επιστρέφει/ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού χώρου συντεταγμένων. |
## Δείτε επίσης

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
