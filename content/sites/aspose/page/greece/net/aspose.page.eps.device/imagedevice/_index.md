---
title: Class ImageDevice
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.EPS.Device.ImageDevice τάξη. Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε εικόνα.
type: docs
weight: 40
url: /el/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε εικόνα.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Αρχικοποιεί νέα παρουσία του`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | Αρχικοποιεί νέα παρουσία του`ImageDevice` με καθορισμένη μορφή εικόνας. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | Αρχικοποιεί νέα παρουσία του`ImageDevice` με καθορισμένο μέγεθος σελίδας. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | Αρχικοποιεί νέα παρουσία του`ImageDevice` με καθορισμένο μέγεθος σελίδας και μορφή εικόνας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | Υποδεικνύει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | Επιστρέφει ή καθορίζει τον τρέχοντα μετασχηματισμό χαρακτήρων. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | Επιστρέφει ή καθορίζει τον δημιουργό της προκύπτουσας εξόδου συσκευής. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | Τρέχων αριθμός σελίδας. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα γραμματοσειρά. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | Μορφή εικόνας. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | Επιστρέφει τις προκύπτουσες εικόνες σε byte, έναν πίνακα byte για μία σελίδα. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | Υποδεικνύει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Υποδεικνύει εάν αυτή η παρουσία της βιβλιοθήκης Aspose.Page έχει άδεια χρήσης. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον φόντο της σελίδας. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα μάσκα αδιαφάνειας. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα βαφή. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Ιδιότητες συσκευής συμπεριλαμβανομένων των μεταδεδομένων. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | Επιλογές για τη διαχείριση της διαδικασίας απόδοσης. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | Επιστρέφει ή καθορίζει ένα μέγεθος της σελίδας. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα διαδρομή. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα λειτουργία απόδοσης κειμένου. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον πλάτος διαδρομής κειμένου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | Κάνει την απαραίτητη προετοιμασία της συσκευής μετά την απόδοση της σελίδας. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | Δημιουργεί ένα αντίγραφο αυτής της συσκευής. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | Απορρίπτει τη συσκευή. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | Σχεδιάζει μια διαδρομή. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Σχεδιάζει τόξο. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | Σχεδιάζει μια εικόνα με αντιστοιχισμένο μετασχηματισμό και φόντο. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Σχεδιάζει ένα ευθύγραμμο τμήμα. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Σχεδιάζει ένα οβάλ. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Σχεδιάζει ένα ορθογώνιο. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Σχεδιάζει ένα στρογγυλό ορθογώνιο. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | Σχεδιάζει μια συμβολοσειρά σε δεδομένο σημείο. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | Πραγματοποιεί την απαραίτητη προετοιμασία της συσκευής μετά την απόδοση του εγγράφου. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | Γεμίζει μια διαδρομή. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Γεμίζει ένα τόξο. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Γεμίζει ένα οβάλ. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Γεμίζει ένα ορθογώνιο. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Γεμίζει ένα στρογγυλό ορθογώνιο. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | Λαμβάνει μια τιμή της ιδιότητας συμβολοσειράς. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | Λαμβάνει μια τιμή της ιδιότητας χρώματος. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | Παίρνει μια τιμή διπλής ιδιότητας. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | Παίρνει μια τιμή ακέραιας ιδιότητας. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | Λαμβάνει μια ιδιότητα τιμής περιθωρίων. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | Λαμβάνει μια τιμή της ιδιότητας ορθογωνίου. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | Λαμβάνει μια τιμή ιδιότητας μεγέθους. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | Λαμβάνει τον τρέχοντα μετασχηματισμό. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | Αρχικοποιεί ένα κλιπ της συσκευής. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | Αρχικοποιεί αριθμούς σελίδων προς έξοδο. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | Λαμβάνει μια τιμή της ιδιότητας boolean. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από κάθε απόδοση σελίδας. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | Επαναφορά της συσκευής στην αρχική κατάσταση για ολόκληρο το έγγραφο. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | Επαναφέρετε τη συσκευή στην αρχική κατάσταση για μια σελίδα. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού πάνω από τον άξονα Z. Καλεί writeTransform(Transform). Περιστροφή με θετική γωνία θήτα περιστρέφει σημεία στον θετικό άξονα x προς τον θετικό άξονα y. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | Σχήμα κλιπ. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | Καθορίζει τον τρέχοντα μετασχηματισμό. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | Κερδίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν ξεκινήσει η απόδοση του εγγράφου. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | Επιστρέφει το όνομα του τύπου συσκευής. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | Μεταφράζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | Ενημερώνει τις παραμέτρους σελίδας από άλλη πολυσέλιδη συσκευή. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | Γράφει ένα σχόλιο. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | Κλειδί ιδιοκτησίας "Φόντο". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | Κλειδί ιδιότητας "Χρώμα φόντου". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | Κλειδί ιδιότητας "Ενσωμάτωση γραμματοσειράς στο έγγραφο". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | Τιμή ιδιότητας "Εκτέλεση σφαλμάτων". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | Αξία ακινήτου "Εμφάνιση προειδοποιήσεων". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | Κλειδί ιδιότητας "Προσαρμογή περιεχομένου στη σελίδα". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | Κλειδί ιδιότητας "Προσανατολισμός". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | Κλειδί ιδιότητας "Περιθώρια σελίδας". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | Κλειδί ιδιότητας "Μέγεθος σελίδας". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | Αξία ακινήτου «Παραγωγός». |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | Κλειδί ιδιοκτησίας "Διαφανές". |

### Δείτε επίσης

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* χώρος ονομάτων [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* συνέλευση [Aspose.Page](../../)


