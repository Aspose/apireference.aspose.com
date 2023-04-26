---
title: Class ImageDevice
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.Presentation.Image.ImageDevice τάξη. Συσκευή σύνθεσης εικόνας ενθυλάκωσης κατηγορίας.
type: docs
weight: 360
url: /el/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Συσκευή σύνθεσης εικόνας ενθυλάκωσης κατηγορίας.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Δημιουργεί το νέο στιγμιότυπο. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Δημιουργεί το νέο στιγμιότυπο με καθορισμένο μέγεθος μέσου. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Παίρνει/ορίζει το χρώμα φόντου. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Επιστρέφει ή καθορίζει τον τρέχοντα μετασχηματισμό χαρακτήρων. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Επιστρέφει ή καθορίζει τον δημιουργό της προκύπτουσας εξόδου συσκευής. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Επιστρέφει τον απόλυτο αριθμό της τρέχουσας σελίδας μέσα στο έγγραφο. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Επιστρέφει τον σχετικό αριθμό της τρέχουσας σελίδας στο τρέχον διαμέρισμα. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Λαμβάνει/ορίζει την τρέχουσα γραμματοσειρά. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Υποδεικνύει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Υποδεικνύει εάν αυτή η παρουσία της βιβλιοθήκης Aspose.Page έχει άδεια χρήσης. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Λαμβάνει/ορίζει την αδιαφάνεια. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Παίρνει/ρυθμίζει το πινέλο για τη μάσκα αδιαφάνειας. Η μάσκα εφαρμόζεται σε Paint ή Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Παίρνει/ρυθμίζει το πινέλο για το γέμισμα των διαδρομών. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Ιδιότητες συσκευής συμπεριλαμβανομένων των μεταδεδομένων. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Επιστρέφει τους πίνακες byte εικόνων που προκύπτουν. Η πρώτη διάσταση είναι για τα εσωτερικά έγγραφα και η δεύτερη για τις σελίδες μέσα στα εσωτερικά έγγραφα. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Αρχικοποιεί τις επιλογές αποθήκευσης. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Λήψη/ρυθμίζει το μέγεθος πολυμέσων της συσκευής. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Λαμβάνει/ορίζει το stroke για τη χάραξη μονοπατιών. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα λειτουργία απόδοσης κειμένου. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον πλάτος διαδρομής κειμένου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Ολοκληρώνει τη σελίδα. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Ολοκληρώθηκε το διαμέρισμα εγγράφου. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Δημιουργεί μια νέα παρουσία της συσκευής με βάση αυτήν την παρουσία της συσκευής. Γράφει αυτήν την κατάσταση γραφικών της συσκευής, δηλαδή δημιουργείApsCanvas instance(s) με τις αντίστοιχες ιδιότητες RenderTransform και Clip. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Απορρίπτει αυτήν την παρουσία συσκευής. Ολοκληρώνει αυτήν την κατάσταση γραφικών παρουσίας συσκευής, , δηλαδή αλλάζει το περιβάλλον σύνθεσης APS στοApsCanvas επίπεδο υψηλότερο από την κατάσταση γραφικών της συσκευής this ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Σχεδιάζει την καθορισμένη διαδρομή. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Σχεδιάζει τόξο. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Σχεδιάζει μια εικόνα με αντιστοιχισμένο μετασχηματισμό και φόντο. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Σχεδιάζει ένα ευθύγραμμο τμήμα. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Σχεδιάζει ένα οβάλ. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Σχεδιάζει ένα ορθογώνιο. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Σχεδιάζει ένα στρογγυλό ορθογώνιο. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Σχεδιάζει μια συμβολοσειρά στην καθορισμένη θέση. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Ολοκληρώνει το έγγραφο. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Συμπληρώνει την καθορισμένη διαδρομή. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Επιστρέφει τον τρέχοντα πίνακα μετασχηματισμού. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Αρχικοποιεί το κλιπ της συσκευής. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Αρχικοποιεί αριθμούς σελίδων προς έξοδο. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Λαμβάνει μια τιμή της ιδιότητας boolean. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Ξεκινά μια νέα σελίδα με τον καθορισμένο τίτλο. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Ξεκινά μια νέα σελίδα με το καθορισμένο πλάτος και ύψος. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Ξεκινά ένα νέο διαμέρισμα εγγράφου. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Ρυθμίζει τις συσκευές στην αρχική κατάσταση. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Επαναφέρει τη συσκευή. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Εφαρμόζει δεξιόστροφη περιστροφή γύρω από την αρχή στον τρέχοντα πίνακα μετασχηματισμού. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Εφαρμόζει το καθορισμένο διάνυσμα κλίμακας στον τρέχοντα πίνακα μετασχηματισμού. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Προσθέτει την καθορισμένη διαδρομή στην τρέχουσα διαδρομή κλιπ. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Ορίζει τον τρέχοντα πίνακα μετασχηματισμού. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Εφαρμόζει το καθορισμένο διάνυσμα διάτμησης στον τρέχοντα πίνακα μετασχηματισμού. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Ξεκινά το έγγραφο. |
| override [ToString](../../aspose.page/device/tostring/)() | Επιστρέφει το όνομα του τύπου συσκευής. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Πολλαπλασιάζει τον τρέχοντα πίνακα μετασχηματισμού με το καθορισμένοMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Εφαρμόζει το καθορισμένο διάνυσμα μετάφρασης στον τρέχοντα πίνακα μετασχηματισμού. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Ενημερώνει τις τρέχουσες παραμέτρους σελίδας. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Γράφει ένα σχόλιο. |

### Δείτε επίσης

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* χώρος ονομάτων [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* συνέλευση [Aspose.Page](../../)


