---
title: Class Metafile
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.Metafile τάξη. Ορίζει ένα μετααρχείο γραφικών. Ένα μετααρχείο περιέχει εγγραφές που περιγράφουν μια ακολουθία γραφικών πράξεων που μπορούν να εγγραφούν δημιουργηθούν και να αναπαραχθούν εμφανίζονται. Αυτή η κλάση δεν είναι κληρονομήσιμη.
type: docs
weight: 800
url: /el/net/system.drawing.imaging/metafile/
---
## Metafile class

Ορίζει ένα μετααρχείο γραφικών. Ένα μετααρχείο περιέχει εγγραφές που περιγράφουν μια ακολουθία γραφικών πράξεων που μπορούν να εγγραφούν (δημιουργηθούν) και να αναπαραχθούν (εμφανίζονται). Αυτή η κλάση δεν είναι κληρονομήσιμη.

```csharp
public sealed class Metafile : Image
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από την καθορισμένη ροή δεδομένων. |
| [Metafile](metafile/#constructor_6)(string) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από το καθορισμένο όνομα αρχείου. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από την καθορισμένη λαβή. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από την καθορισμένη λαβή σε περιβάλλον συσκευής και anEmfTypeαπαρίθμηση που καθορίζει τη μορφή τουMetafile . |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από τη ροή δεδομένων specified και μια λαβή των Windows σε ένα περιβάλλον συσκευής. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από το καθορισμένο όνομα αρχείου. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από τη ροή δεδομένων specified , μια λαβή των Windows σε ένα περιβάλλον συσκευής καιEmfType enumeration που καθορίζει τη μορφή τουMetafile . |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Αρχικοποιεί μια νέα παρουσία του`Metafile` κλάση από τη ροή δεδομένων specified , μια λαβή των Windows σε ένα περιβάλλον συσκευής καιEmfType enumeration που καθορίζει τη μορφή τουMetafile . |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Παίρνει τον ακέραιο που αντιπροσωπεύει έναν συνδυασμό bitwise του[`ImageFlags`](../imageflags/) για αυτήν την εικόνα. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | Λαμβάνει μια σειρά από GUID που αντιπροσωπεύουν τις διαστάσεις των πλαισίων σε αυτόImage . |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | Λαμβάνει το ύψος αυτού, σε pixelMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Λαμβάνει την οριζόντια ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | Λαμβάνει ή ορίζει την παλέτα χρωμάτων που χρησιμοποιείται για αυτόImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Λαμβάνει το πλάτος και το ύψος αυτής της εικόνας. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | Λαμβάνει τη μορφή pixel για αυτόImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | Λαμβάνει αναγνωριστικά των στοιχείων ιδιοκτησίας που είναι αποθηκευμένα σε αυτόImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | Λαμβάνει όλα τα στοιχεία ιδιοκτησίας (τμήματα μεταδεδομένων) που είναι αποθηκευμένα σε αυτόImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | Λαμβάνει τη μορφή αρχείου αυτούImage . |
| [Size](../../system.drawing/image/size/) { get; } | Λαμβάνει το πλάτος και το ύψος, σε pixel, αυτής της εικόνας. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Λαμβάνει ή ορίζει ένα αντικείμενο που παρέχει πρόσθετα δεδομένα για την εικόνα. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Λαμβάνει την κατακόρυφη ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | Λαμβάνει το πλάτος, σε pixel, αυτούMetafile . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτήν την εικόνα. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Λαμβάνει τα όρια της εικόνας στην καθορισμένη μονάδα. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Επιστρέφει τον αριθμό των καρέ της καθορισμένης διάστασης. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Επιστρέφει μια λαβή των Windows σε βελτιωμένηMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | Επιστρέφει τοMetafileHeader συνδέονται με αυτόMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | Λαμβάνει το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Επιστρέφει μια μικρογραφία για αυτόImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | Παίζει μια μεμονωμένη εγγραφή μετα-αρχείου. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | Καταργεί το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | Αυτή η μέθοδος περιστρέφει, αναστρέφει ή περιστρέφει και αναστρέφει τοImage . |
| [Save](../../system.drawing/image/save/)(string) | Αποθηκεύει αυτόImageστο καθορισμένο αρχείο ή ροή. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτήν των μεθόδων Image.Save(...). Χρησιμοποιήστε αυτήν τη μέθοδο για να αποθηκεύσετε επιλεγμένα καρέ από μια εικόνα πολλαπλών καρέ σε μια άλλη εικόνα πολλαπλών καρέ. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτή των μεθόδων Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Επιλέγει το πλαίσιο που καθορίζεται από τη διάσταση και το ευρετήριο. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | Αποθηκεύει ένα στοιχείο ιδιότητας (κομμάτι μεταδεδομένων) σε αυτόImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | Επιστρέφει τοMetafileHeader που σχετίζονται με το καθορισμένοMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | Επιστρέφει τοMetafileHeader που σχετίζονται με το καθορισμένοMetafile . |

### Δείτε επίσης

* class [Image](../../system.drawing/image/)
* χώρος ονομάτων [System.Drawing.Imaging](../../system.drawing.imaging/)
* συνέλευση [Aspose.Drawing](../../)


