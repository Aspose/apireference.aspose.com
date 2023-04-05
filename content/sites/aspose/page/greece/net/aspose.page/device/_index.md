---
title: Class Device
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.Device τάξη. Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε μια αφηρημένη συσκευή. Η απόδοση του εγγράφου πραγματοποιείται σελίδα προς σελίδα.
type: docs
weight: 20
url: /el/net/aspose.page/device/
---
## Device class

Αυτή η κλάση ενσωματώνει την απόδοση του εγγράφου σε μια αφηρημένη συσκευή. Η απόδοση του εγγράφου πραγματοποιείται σελίδα προς σελίδα.

```csharp
public abstract class Device
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Device](device/)(Size) | Αρχικοποιεί`Device` με μέγεθος σελίδας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον φόντο της σελίδας. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Επιστρέφει ή καθορίζει τον τρέχοντα μετασχηματισμό χαρακτήρων. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Επιστρέφει ή καθορίζει τον δημιουργό της προκύπτουσας εξόδου συσκευής. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα γραμματοσειρά. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Υποδεικνύει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Υποδεικνύει εάν αυτή η παρουσία της βιβλιοθήκης Aspose.Page έχει άδεια χρήσης. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα αδιαφάνεια. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα μάσκα αδιαφάνειας. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα βαφή. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Ιδιότητες συσκευής συμπεριλαμβανομένων των μεταδεδομένων. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Επιλογές για τη διαχείριση της διαδικασίας απόδοσης. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Επιστρέφει ή καθορίζει ένα μέγεθος της σελίδας. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα διαδρομή. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Επιστρέφει ή καθορίζει την τρέχουσα λειτουργία απόδοσης κειμένου. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Επιστρέφει ή καθορίζει το τρέχον πλάτος διαδρομής κειμένου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Δημιουργεί ένα αντίγραφο αυτής της συσκευής. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Απορρίπτει τη συσκευή. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Σχεδιάζει μια διαδρομή. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Σχεδιάζει τόξο. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Σχεδιάζει μια εικόνα με αντιστοιχισμένο μετασχηματισμό και φόντο. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Σχεδιάζει ένα ευθύγραμμο τμήμα. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Σχεδιάζει ένα οβάλ. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Σχεδιάζει ένα πολύγωνο. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Σχεδιάζει μια πολύγραμμη. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Σχεδιάζει ένα ορθογώνιο. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Σχεδιάζει ένα στρογγυλό ορθογώνιο. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Σχεδιάζει μια συμβολοσειρά σε δεδομένο σημείο. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Πραγματοποιεί την απαραίτητη προετοιμασία της συσκευής μετά την απόδοση του εγγράφου. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Γεμίζει μια διαδρομή. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Γεμίζει ένα τόξο. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Γεμίζει ένα οβάλ. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Γεμίζει ένα πολύγωνο. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Γεμίζει ένα ορθογώνιο. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Γεμίζει ένα στρογγυλό ορθογώνιο. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Λαμβάνει μια τιμή της ιδιότητας συμβολοσειράς. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Λαμβάνει μια τιμή της ιδιότητας χρώματος. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Παίρνει μια τιμή διπλής ιδιότητας. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Παίρνει μια τιμή ακέραιας ιδιότητας. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Λαμβάνει μια τιμή ιδιότητας περιθωρίου. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Λαμβάνει μια τιμή της ιδιότητας ορθογωνίου. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Λαμβάνει μια τιμή ιδιότητας μεγέθους. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Λαμβάνει τον τρέχοντα μετασχηματισμό. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Αρχικοποιεί το κλιπ της συσκευής. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Λαμβάνει μια τιμή της ιδιότητας boolean. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Επαναφορά της συσκευής στην αρχική κατάσταση για ολόκληρο το έγγραφο. Χρησιμοποιείται για την επαναφορά της ροής εξόδου. |
| virtual [Reset](../../aspose.page/device/reset/)() | Επαναφέρετε τη συσκευή στην αρχική κατάσταση για μια σελίδα. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). Περιστροφή με θετική γωνία θήτα περιστρέφει σημεία στον θετικό άξονα x προς τον θετικό άξονα y. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Καθορίζει το κλιπ της συσκευής. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Καθορίζει τον τρέχοντα μετασχηματισμό. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Κερδίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Κάνει την απαραίτητη προετοιμασία της συσκευής πριν ξεκινήσει η απόδοση του εγγράφου. |
| override [ToString](../../aspose.page/device/tostring/)() | Επιστρέφει το όνομα του τύπου συσκευής. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Μεταφράζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Γράφει ένα σχόλιο. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Τρέχουσα έκδοση συσκευής. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Page](../../aspose.page/)
* συνέλευση [Aspose.Page](../../)


