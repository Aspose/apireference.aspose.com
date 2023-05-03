---
title: Class Image
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Image τάξη. Μια αφηρημένη βασική κλάση που παρέχει λειτουργικότητα για τις κατώτερες κλάσεις Bitmap και Metafile.
type: docs
weight: 580
url: /el/net/system.drawing/image/
---
## Image class

Μια αφηρημένη βασική κλάση που παρέχει λειτουργικότητα για τις κατώτερες κλάσεις Bitmap και Metafile.

```csharp
public abstract class Image : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Image](image/)() | Αρχικοποιεί μια νέα παρουσία του`Image` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Παίρνει τον ακέραιο που αντιπροσωπεύει έναν συνδυασμό bitwise του[`ImageFlags`](../../system.drawing.imaging/imageflags/) για αυτήν την εικόνα. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | Λαμβάνει μια σειρά από GUID που αντιπροσωπεύουν τις διαστάσεις των πλαισίων σε αυτόImage . |
| abstract [Height](../../system.drawing/image/height/) { get; } | Λαμβάνει το ύψος αυτού, σε pixelImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Λαμβάνει την οριζόντια ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | Λαμβάνει ή ορίζει την παλέτα χρωμάτων που χρησιμοποιείται για αυτόImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Λαμβάνει το πλάτος και το ύψος αυτής της εικόνας. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | Λαμβάνει τη μορφή pixel για αυτόImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | Λαμβάνει αναγνωριστικά των στοιχείων ιδιοκτησίας που είναι αποθηκευμένα σε αυτόImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | Λαμβάνει όλα τα στοιχεία ιδιοκτησίας (τμήματα μεταδεδομένων) που είναι αποθηκευμένα σε αυτόImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | Λαμβάνει τη μορφή αρχείου αυτούImage . |
| [Size](../../system.drawing/image/size/) { get; } | Λαμβάνει το πλάτος και το ύψος, σε pixel, αυτής της εικόνας. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Λαμβάνει ή ορίζει ένα αντικείμενο που παρέχει πρόσθετα δεδομένα για την εικόνα. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Λαμβάνει την κατακόρυφη ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| abstract [Width](../../system.drawing/image/width/) { get; } | Λαμβάνει το πλάτος, σε pixel, αυτούImage . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | Δημιουργεί έναImage από το καθορισμένο αρχείο. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | Δημιουργεί έναImageαπό την καθορισμένη ροή δεδομένων. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | Δημιουργεί έναImage από την καθορισμένη ροή δεδομένων, προαιρετικά χρησιμοποιώντας πληροφορίες διαχείρισης χρώματος embedded σε αυτήν τη ροή. |
| [Clone](../../system.drawing/image/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτήν την εικόνα. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Λαμβάνει τα όρια της εικόνας στην καθορισμένη μονάδα. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Επιστρέφει τον αριθμό των καρέ της καθορισμένης διάστασης. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | Λαμβάνει το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Επιστρέφει μια μικρογραφία για αυτόImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | Καταργεί το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | Αυτή η μέθοδος περιστρέφει, αναστρέφει ή περιστρέφει και αναστρέφει τοImage . |
| [Save](../../system.drawing/image/save/#save_2)(string) | Αποθηκεύει αυτόImageστο καθορισμένο αρχείο ή ροή. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτήν των μεθόδων Image.Save(...). Χρησιμοποιήστε αυτήν τη μέθοδο για να αποθηκεύσετε επιλεγμένα καρέ από μια εικόνα πολλαπλών καρέ σε μια άλλη εικόνα πολλαπλών καρέ. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτή των μεθόδων Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Επιλέγει το πλαίσιο που καθορίζεται από τη διάσταση και το ευρετήριο. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | Αποθηκεύει ένα στοιχείο ιδιότητας (κομμάτι μεταδεδομένων) σε αυτόImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | Δημιουργεί έναBitmap από μια λαβή σε ένα bitmap GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | Επιστρέφει το βάθος χρώματος, σε αριθμό bit ανά pixel, της καθορισμένης μορφής pixel. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | Επιστρέφει μια τιμή που υποδεικνύει εάν η μορφή pixel για αυτόImage περιέχει πληροφορίες άλφα. |

## Άλλα Μέλη

| Ονομα | Περιγραφή |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | Παρέχει μια μέθοδο επανάκλησης για τον προσδιορισμό του πότε η[`GetThumbnailImage`](./getthumbnailimage/) Η μέθοδος θα πρέπει να ακυρώσει πρόωρα την εκτέλεση. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


