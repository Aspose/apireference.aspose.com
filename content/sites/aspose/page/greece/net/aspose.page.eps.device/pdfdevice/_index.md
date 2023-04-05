---
title: Class PdfDevice
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.EPS.Device.PdfDevice τάξη. Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε PDF.
type: docs
weight: 60
url: /el/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Αρχικοποιεί νέα παρουσία του`PdfDevice` με ροή εξόδου. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Αρχικοποιεί νέα παρουσία του`PdfDevice`με ροή εξόδου και καθορισμένο μέγεθος σελίδας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον φόντο της σελίδας. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Επιστρέφει ή καθορίζει τον τρέχοντα μετασχηματισμό χαρακτήρων. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Επιστρέφει ή καθορίζει τον δημιουργό της προκύπτουσας εξόδου συσκευής. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Τρέχων αριθμός σελίδας. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Καθορίζει την τρέχουσα γραμματοσειρά. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Υποδεικνύει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Υποδεικνύει εάν αυτή η παρουσία της βιβλιοθήκης Aspose.Page έχει άδεια χρήσης. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα αδιαφάνεια. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα μάσκα αδιαφάνειας. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Καθορίζει ή επιστρέφει μια ροή εξόδου. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Επιστρέφει ή καθορίζει την τρέχουσα βαφή. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Ιδιότητες συσκευής συμπεριλαμβανομένων των μεταδεδομένων. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Επιλογές για τη διαχείριση της διαδικασίας απόδοσης. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Επιστρέφει ή καθορίζει ένα μέγεθος της σελίδας. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Επιστρέφει ή καθορίζει την τρέχουσα διαδρομή. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα λειτουργία απόδοσης κειμένου. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον πλάτος διαδρομής κειμένου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Κάνει την απαραίτητη προετοιμασία της συσκευής μετά την απόδοση της σελίδας. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Δημιουργεί ένα αντίγραφο αυτής της συσκευής. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Διαθέτει το περιβάλλον γραφικών. Εάν κατά τη δημιουργία το restoreOnDispose ήταν true, θα κληθεί η writeGraphicsRestore(). |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Σχεδιάζει μια διαδρομή. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Σχεδιάζει τόξο. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Σχεδιάζει μια εικόνα με αντιστοιχισμένο μετασχηματισμό και φόντο. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Σχεδιάζει ένα ευθύγραμμο τμήμα. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Σχεδιάζει ένα οβάλ. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Σχεδιάζει ένα ορθογώνιο. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Σχεδιάζει ένα στρογγυλό ορθογώνιο. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Σχεδιάζει μια συμβολοσειρά σε δεδομένο σημείο. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Πραγματοποιεί την απαραίτητη προετοιμασία της συσκευής μετά την απόδοση του εγγράφου. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Γεμίζει μια διαδρομή. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Γεμίζει ένα τόξο. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Γεμίζει ένα οβάλ. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Γεμίζει ένα ορθογώνιο. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Γεμίζει ένα στρογγυλό ορθογώνιο. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Λαμβάνει μια τιμή της ιδιότητας συμβολοσειράς. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Λαμβάνει μια τιμή της ιδιότητας χρώματος. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Παίρνει μια τιμή διπλής ιδιότητας. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Παίρνει μια τιμή ακέραιας ιδιότητας. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Λαμβάνει μια τιμή ιδιότητας περιθωρίου. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Λαμβάνει μια τιμή της ιδιότητας ορθογωνίου. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Λαμβάνει μια τιμή ιδιότητας μεγέθους. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Λαμβάνει τον τρέχοντα μετασχηματισμό. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Αρχικοποιεί το κλιπ της συσκευής. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Αρχικοποιεί αριθμούς σελίδων προς έξοδο. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Λαμβάνει μια τιμή της ιδιότητας boolean. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από κάθε απόδοση σελίδας. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Επαναφορά της συσκευής στην αρχική κατάσταση για ολόκληρο το έγγραφο. Χρησιμοποιείται για την επαναφορά της ροής εξόδου. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Εάν οριστούν οι παράμετροι της συσκευής σελίδας, αυτή η μέθοδος επιτρέπει την επιστροφή της ροής εγγραφής στην αρχή της σελίδας. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Περιστρέψτε τον τρέχοντα μετασχηματισμό πάνω από τον άξονα Z. Καλεί writeTransform(Transform). Περιστροφή με θετική γωνία θήτα περιστρέφει σημεία στον θετικό άξονα x προς τον θετικό άξονα y. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Καθορίζει το κλιπ της συσκευής. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Καθορίζει τον τρέχοντα μετασχηματισμό. Δεδομένου ότι οι περισσότερες μορφές εξόδου δεν υλοποιούν αυτήν τη λειτουργία, ο αντίστροφος μετασχηματισμός του currentTransform υπολογίζεται και πολλαπλασιάζεται με τον μετασχηματισμό που πρόκειται να οριστεί. Το αποτέλεσμα στη συνέχεια προωθείται με ένα call στο writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Κερδίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν ξεκινήσει η απόδοση του εγγράφου. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Επιστρέφει το όνομα του τύπου συσκευής. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Μεταφράζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Ενημερώνει τις παραμέτρους σελίδας από άλλη πολυσέλιδη συσκευή. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Γράφει ένα σχόλιο. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Αξία ακινήτου "Συντάκτης". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Κλειδί ιδιοκτησίας "Φόντο". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Κλειδί ιδιότητας "Χρώμα φόντου". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Κλειδί ιδιότητας "Συμπίεση". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Κλειδί ιδιότητας "Ενσωμάτωση γραμματοσειράς στο έγγραφο". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Κλειδί ιδιότητας "Τι τύπος γραμματοσειράς χρησιμοποιείται για την ενσωμάτωση". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Τιμή ιδιότητας "Εκτέλεση σφαλμάτων". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Αξία ακινήτου "Εμφάνιση προειδοποιήσεων". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Κλειδί ιδιότητας "Προσαρμογή περιεχομένου στη σελίδα". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Αξία ιδιότητας "Λέξεις-κλειδιά". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Κλειδί ιδιότητας "Προσανατολισμός". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Κλειδί ιδιότητας "Περιθώρια σελίδας". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Κλειδί ιδιότητας "Μέγεθος σελίδας". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Αξία ακινήτου "Θέμα". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Αξία ακινήτου "Τίτλος". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Κλειδί ιδιοκτησίας "Διαφανές". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Κλειδί ιδιοκτησίας "Έκδοση". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Αξία ιδιότητας "Έκδοση του Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Κλειδί ιδιότητας "Μορφή εικόνων". |

### Δείτε επίσης

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* χώρος ονομάτων [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* συνέλευση [Aspose.Page](../../)


