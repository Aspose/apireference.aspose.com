---
title: Class GraphicsPath
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.GraphicsPath τάξη. Αντιπροσωπεύει μια σειρά από συνδεδεμένες γραμμές και καμπύλες.
type: docs
weight: 260
url: /el/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Αντιπροσωπεύει μια σειρά από συνδεδεμένες γραμμές και καμπύλες.

```csharp
public class GraphicsPath : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Αρχικοποιεί μια νέα παρουσία της κλάσης GraphicsPath με τιμή FillMode Alternate. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPath`κλάση με το specified FillMode απαρίθμηση. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPath` τάξη με τα καθορισμένα[`PathPointType`](../pathpointtype/) καιPointF πίνακες. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPath` τάξη με τα καθορισμένα[`PathPointType`](../pathpointtype/) καιPoint πίνακες. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPath` τάξη με τα καθορισμέναPathPointType καιPointF πίνακες και με τα καθορισμέναFillMode στοιχείο απαρίθμησης.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | Αρχικοποιεί μια νέα παρουσία του`GraphicsPath` τάξη με τα καθορισμέναPathPointType καιPoint πίνακες και με τα καθορισμέναFillMode στοιχείο απαρίθμησης.. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | Λαμβάνει ή ορίζει μια απαρίθμηση FillMode που καθορίζει πώς γεμίζονται οι εσωτερικοί χώροι των σχημάτων σε αυτό το GraphicsPath. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | Παίρνει έναPathData που ενσωματώνει πίνακες σημείων και τύπων για αυτόGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | Παίρνει τα σημεία στη διαδρομή. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | Παίρνει τους τύπους των αντίστοιχων σημείων στοPathPoints πίνακας. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | Παίρνει τον αριθμό των στοιχείων στοPathPoints ή τοPathTypes πίνακας. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | Προσθέτει ένα ελλειπτικό τόξο στο τρέχον σχήμα. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | Προσθέτει ένα ελλειπτικό τόξο στο τρέχον σχήμα. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | Προσθέτει μια κυβική καμπύλη Bézier στο τρέχον σχήμα. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | Προσθέτει μια κυβική καμπύλη Bézier στο τρέχον σχήμα. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | Προσθέτει μια ακολουθία συνδεδεμένων κυβικών καμπυλών Bézier στο τρέχον σχήμα. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | Προσθέτει μια ακολουθία συνδεδεμένων κυβικών καμπυλών Bézier στο τρέχον σχήμα. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | Προσθέτει μια κλειστή καμπύλη σε αυτή τη διαδρομή. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | Προσθέτει μια κλειστή καμπύλη σε αυτό το μονοπάτι. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | Προσθέτει μια έλλειψη στην τρέχουσα διαδρομή. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | Προσθέτει μια έλλειψη στην τρέχουσα διαδρομή. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | Προσθέτει ένα τμήμα γραμμής σε αυτό το GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | Προσθέτει ένα τμήμα γραμμής σε αυτό το GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | Προσθέτει μια σειρά από συνδεδεμένα τμήματα γραμμής στο τέλος αυτούGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | Προσθέτει μια σειρά από συνδεδεμένα τμήματα γραμμής στο τέλος αυτούGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | Προσθέτει το καθορισμένο GraphicsPath σε αυτήν τη διαδρομή. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | Προσθέτει το περίγραμμα ενός σχήματος πίτας σε αυτό το μονοπάτι. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | Προσθέτει το περίγραμμα ενός σχήματος πίτας σε αυτό το μονοπάτι. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | Προσθέτει ένα πολύγωνο σε αυτό το μονοπάτι. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | Προσθέτει ένα πολύγωνο σε αυτό το μονοπάτι. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | Προσθέτει ένα ορθογώνιο σε αυτό το μονοπάτι. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | Προσθέτει ένα ορθογώνιο σε αυτό το μονοπάτι. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | Προσθέτει μια σειρά από ορθογώνια σε αυτό το μονοπάτι. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | Προσθέτει μια σειρά από ορθογώνια σε αυτό το μονοπάτι. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | Προσθέτει μια συμβολοσειρά κειμένου σε αυτήν τη διαδρομή. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Προσθέτει μια συμβολοσειρά κειμένου σε αυτήν τη διαδρομή. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Προσθέτει μια συμβολοσειρά κειμένου σε αυτήν τη διαδρομή. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Προσθέτει μια συμβολοσειρά κειμένου σε αυτήν τη διαδρομή. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | Δημιουργήστε ένα αντίγραφο του αντικειμένου της τρέχουσας διαδρομής. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | Κλείνει όλα τα ανοιχτά σχήματα σε αυτήν τη διαδρομή και ξεκινά ένα νέο σχήμα. Κλείνει κάθε ανοιχτό σχήμα συνδέοντας μια γραμμή από το τελικό σημείο στο σημείο εκκίνησης. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | Κλείνει την τρέχουσα εικόνα και ξεκινά μια νέα εικόνα. Εάν το τρέχον σχήμα περιέχει μια ακολουθία συνδεδεμένων γραμμών και καμπυλών, η μέθοδος κλείνει τον βρόχο συνδέοντας μια γραμμή από το τελικό σημείο στο σημείο εκκίνησης. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτό το GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | Μετατρέπει κάθε καμπύλη σε αυτή τη διαδρομή σε μια ακολουθία συνδεδεμένων τμημάτων γραμμής. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | Εφαρμόζει τον καθορισμένο μετασχηματισμό και στη συνέχεια μετατρέπει κάθε καμπύλη σε αυτόGraphicsPath . |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | Μετατρέπει κάθε καμπύλη σε αυτόGraphicsPath σε μια ακολουθία συνδεδεμένων τμημάτων γραμμής. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | Επιστρέφει ένα ορθογώνιο που το οριοθετείGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | Επιστρέφει ένα ορθογώνιο που το οριοθετείGraphicsPath όταν αυτή η διαδρομή είναι μετασχηματίζεται από το καθορισμένοMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | Επιστρέφει ένα ορθογώνιο που το οριοθετείGraphicsPath όταν η τρέχουσα διαδρομή είναι μετασχηματίζεται από το καθορισμένοMatrix και σχεδιάζονται με το καθορισμένοPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | Λαμβάνει το τελευταίο σημείο στον πίνακα PathPoints αυτού`GraphicsPath` . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | Υποδεικνύει εάν το καθορισμένο σημείο περιέχεται (κάτω από) το περίγραμμα αυτούGraphicsPath όταν τραβηχτεί με το καθορισμένοPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | Υποδεικνύει εάν το καθορισμένο σημείο περιέχεται σε αυτόGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | Αδειάζει το[`PathPoints`](./pathpoints/) και[`PathTypes`](./pathtypes/) arrays και ορίζει το[`FillMode`](../fillmode/) προς τηνAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | Αντιστρέφει τη σειρά των σημείων στο[`PathPoints`](./pathpoints/)συστοιχία αυτού`GraphicsPath` . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | Ορίζει έναν δείκτη σε αυτό`GraphicsPath` . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | Ξεκινά ένα νέο σχήμα χωρίς να κλείνει το τρέχον σχήμα. Όλα τα επόμενα σημεία που προστίθενται στη διαδρομή προστίθενται σε αυτό το νέο σχήμα. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | Εφαρμόζει έναν πίνακα μετασχηματισμού σε αυτό το GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | Εφαρμόζει έναν μετασχηματισμό στημόνι, που ορίζεται από ένα ορθογώνιο και ένα παραλληλόγραμμο, σε αυτό`GraphicsPath` . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | Εφαρμόζει έναν μετασχηματισμό στημόνι, που ορίζεται από ένα ορθογώνιο και ένα παραλληλόγραμμο, σε αυτό`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Εφαρμόζει έναν μετασχηματισμό στημόνι, που ορίζεται από ένα ορθογώνιο και ένα παραλληλόγραμμο, σε αυτό`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Εφαρμόζει έναν μετασχηματισμό στημόνι, που ορίζεται από ένα ορθογώνιο και ένα παραλληλόγραμμο, σε αυτό`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | Προσθέτει ένα επιπλέον περίγραμμα στη διαδρομή. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | Προσθέτει ένα επιπλέον περίγραμμα στοGraphicsPath . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | Αντικαθιστά αυτόGraphicsPath με καμπύλες που περικλείουν την περιοχή που γεμίζει όταν αυτή η διαδρομή χαράσσεται από την καθορισμένη πένα. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* συνέλευση [Aspose.Drawing](../../)


