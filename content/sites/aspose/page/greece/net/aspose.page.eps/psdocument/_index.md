---
title: Class PsDocument
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.EPS.PsDocument τάξη. Αυτή η τάξη ενσωματώνει έγγραφα PS/EPS.
type: docs
weight: 140
url: /el/net/aspose.page.eps/psdocument/
---
## PsDocument class

Αυτή η τάξη ενσωματώνει έγγραφα PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Αρχικοποιεί`PsDocument` με μια ροή αρχείου PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Αρχικοποιεί κενό`PsDocument` με αρχικοποιημένη σελίδα. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Αρχικοποιεί κενό`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Αρχικοποιεί κενό`PsDocument` όταν ο αριθμός των σελίδων εγγράφου Postscript είναι γνωστός εκ των προτέρων. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Επιστρέφει τον αριθμό των σελίδων στο έγγραφο PDF που προκύπτει. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Προσθέτει κλιπ στην τρέχουσα κατάσταση γραφικών. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Προσθέτει κλιπ στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή "newpath". Είναι απαραίτητο να κάνετε για να διαφύγετε της συμβολής αυτής της διαδρομής αποκοπής και ορισμένων επακόλουθων μονοπατιών, όπως οι γλύφοι που περιγράφονται με τον τελεστή "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Προσθέτει ορθογώνιο αποκοπής στην τρέχουσα κατάσταση γραφικών. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Ολοκληρώστε την τρέχουσα σελίδα. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Σχεδιάστε μια αυθαίρετη διαδρομή. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Σχεδιάστε μια καλυμμένη εικόνα. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Σχεδίαση εικόνας. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Σχεδιάστε μετασχηματισμένη εικόνα με φόντο. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Συμπληρώστε μια αυθαίρετη διαδρομή. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Προσθέτει μια συμβολοσειρά κειμένου συμπληρώνοντας το εσωτερικό των γλυφών και σχεδιάζοντας περιγράμματα γλυφών. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Προσθέτει μια συμβολοσειρά κειμένου συμπληρώνοντας το εσωτερικό των γλυφών και σχεδιάζοντας περιγράμματα γλυφών. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Προσθέτει μια συμβολοσειρά κειμένου συμπληρώνοντας το εσωτερικό των γλυφών. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Προσθέτει μια συμβολοσειρά κειμένου συμπληρώνοντας το εσωτερικό των γλυφών. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Παίρνει χρώμα της τρέχουσας κατάστασης γραφικών. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Παίρνει διαδρομή της τρέχουσας κατάστασης γραφικών. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Διαβάζει αρχείο PS/EPS και εξάγει τα XmpMetdata εάν υπάρχουν ήδη ή προσθέτει νέο εάν δεν υπάρχει. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Δημιουργεί νέα σελίδα και κάνει την τρέχουσα. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας περιγράμματα γλυφών. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Προσθέτει μια συμβολοσειρά κειμένου σχεδιάζοντας περιγράμματα γλυφών. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Προσθέτει περιστροφή στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχοντος πίνακα). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Αποθηκεύσεις δίνονται`PsDocument` ως αρχείο EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο όταν το PsDocument δημιουργήθηκε από την αρχή. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Αποθηκεύσεις δίνονται`PsDocument` ως αρχείο EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων XMP. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένα υπάρχοντα μεταδεδομένα ή ένα νέο που δημιουργήθηκε κατά την κλήση της μεθόδου GetMetadata. Στην τελευταία περίπτωση προστίθενται όλοι οι απαραίτητοι κώδικας PostScript και σχόλια EPS. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Αποθηκεύει το αρχείο PS/EPS σε μια συσκευή. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Προσθέτει κλίμακα στην τρέχουσα κατάσταση γραφικών (κλιμακωτή τρέχουσα μήτρα). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Ορίζει τις παραμέτρους της συσκευής σελίδας (βλ. τελεστή "setpagedevice" PostScript specification). Μεταξύ αυτών μπορεί να είναι το μέγεθος και το χρώμα σελίδας κ.λπ. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Ορίζει το μέγεθος σελίδας. Για να δημιουργήσετε σελίδες με διαφορετικά μεγέθη σε ένα έγγραφο χρησιμοποιήστε[`SetPageDevice`](./setpagedevice/) Μέθοδος αμέσως μετά από αυτήν τη μέθοδο. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Ορίζει τη βαφή στην τρέχουσα κατάσταση γραφικών. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Ορίζει το stroke στην τρέχουσα κατάσταση γραφικών. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Προσθέτει μετασχηματισμό διάτμησης στην τρέχουσα κατάσταση γραφικών (μήτρα διάτμησης ρεύματος). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Προσθέτει μετασχηματισμό στην τρέχουσα κατάσταση γραφικών (συνενώνει αυτόν τον πίνακα με τον τρέχοντα). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Προσθέτει μετάφραση στην τρέχουσα κατάσταση γραφικών (μεταφράζει την τρέχουσα μήτρα). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Γράφει την επαναφορά της τρέχουσας κατάστασης γραφικών (Δείτε την προδιαγραφή PostScript στον τελεστή "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Γράφει αποθήκευση της τρέχουσας κατάστασης γραφικών (Δείτε την προδιαγραφή PostScript στον τελεστή "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Αποθηκεύει το αντικείμενο Bitmap στη ροή εξόδου EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Αποθηκεύει το αντικείμενο Bitmap στο αρχείο EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Αποθηκεύει εικόνα PNG/JPEG/TIFF/BMP/GIF/EMF από ροή εισόδου σε ροή εξόδου EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Αποθηκεύει εικόνα PNG/JPEG/TIFF/BMP/GIF/EMF από αρχείο σε αρχείο EPS. |

### Δείτε επίσης

* class [Document](../../aspose.page/document/)
* χώρος ονομάτων [Aspose.Page.EPS](../../aspose.page.eps/)
* συνέλευση [Aspose.Page](../../)


