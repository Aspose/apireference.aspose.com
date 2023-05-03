---
title: Class Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Bitmap τάξη. Ενσωματώνει ένα bitmap το οποίο αποτελείται από τα δεδομένα pixel για μια εικόνα γραφικών και τα χαρακτηριστικά της. ABitmap είναι ένα αντικείμενο που χρησιμοποιείται για εργασία με εικόνες που ορίζονται από δεδομένα pixel.
type: docs
weight: 40
url: /el/net/system.drawing/bitmap/
---
## Bitmap class

Ενσωματώνει ένα bitmap, το οποίο αποτελείται από τα δεδομένα pixel για μια εικόνα γραφικών και τα χαρακτηριστικά της. A`Bitmap` είναι ένα αντικείμενο που χρησιμοποιείται για εργασία με εικόνες που ορίζονται από δεδομένα pixel.

```csharp
public class Bitmap : Image
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από την καθορισμένη υπάρχουσα εικόνα. |
| [Bitmap](bitmap/#constructor_6)(Stream) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από την καθορισμένη ροή δεδομένων. |
| [Bitmap](bitmap/#constructor_8)(string) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από το καθορισμένο αρχείο. |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | Αρχικοποιεί μια νέα παρουσία του`Bitmap`κλάση από την καθορισμένη υπάρχουσα εικόνα, με κλίμακα στο καθορισμένο μέγεθος. |
| [Bitmap](bitmap/#constructor)(int, int) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` τάξη με το καθορισμένο μέγεθος. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από την καθορισμένη ροή δεδομένων. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από το καθορισμένο αρχείο. |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση από την καθορισμένη υπάρχουσα εικόνα, σε κλίμακα στο καθορισμένο μέγεθος. |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` τάξη με το καθορισμένο μέγεθος και μορφή. |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | Αρχικοποιεί μια νέα παρουσία του`Bitmap` κλάση με το καθορισμένο μέγεθος και δεδομένα pixel. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Παίρνει τον ακέραιο που αντιπροσωπεύει έναν συνδυασμό bitwise του[`ImageFlags`](../../system.drawing.imaging/imageflags/) για αυτήν την εικόνα. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | Λαμβάνει μια σειρά από GUID που αντιπροσωπεύουν τις διαστάσεις των πλαισίων σε αυτόImage . |
| override [Height](../../system.drawing/bitmap/height/) { get; } | Λαμβάνει το ύψος, σε pixel, αυτού του Bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Λαμβάνει την οριζόντια ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | Λαμβάνει ή ορίζει την παλέτα χρωμάτων που χρησιμοποιείται για αυτόImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Λαμβάνει το πλάτος και το ύψος αυτής της εικόνας. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | Λαμβάνει τη μορφή pixel για αυτόImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | Λαμβάνει αναγνωριστικά των στοιχείων ιδιοκτησίας που είναι αποθηκευμένα σε αυτόImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | Λαμβάνει όλα τα στοιχεία ιδιοκτησίας (τμήματα μεταδεδομένων) που είναι αποθηκευμένα σε αυτόImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | Λαμβάνει τη μορφή αρχείου αυτούImage . |
| [Size](../../system.drawing/image/size/) { get; } | Λαμβάνει το πλάτος και το ύψος, σε pixel, αυτής της εικόνας. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Λαμβάνει ή ορίζει ένα αντικείμενο που παρέχει πρόσθετα δεδομένα για την εικόνα. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Λαμβάνει την κατακόρυφη ανάλυση, σε pixel ανά ίντσα, αυτήςImage . |
| override [Width](../../system.drawing/bitmap/width/) { get; } | Λαμβάνει το πλάτος, σε pixel, αυτού του Bitmap. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούImage . |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | Δημιουργεί ένα αντίγραφο της ενότητας αυτήςBitmap ορίζεται απόRectangle structure και με ένα καθορισμένοPixelFormat απαρίθμηση. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | Δημιουργεί ένα αντίγραφο της ενότητας αυτήςBitmap ορίζεται με ένα καθορισμένοPixelFormat απαρίθμηση. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτήν την εικόνα. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Λαμβάνει τα όρια της εικόνας στην καθορισμένη μονάδα. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Επιστρέφει τον αριθμό των καρέ της καθορισμένης διάστασης. |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | Παίρνει το χρώμα του καθορισμένου pixel σε αυτόBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | Λαμβάνει το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Επιστρέφει μια μικρογραφία για αυτόImage . |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | Κλειδαριές αBitmap στη μνήμη συστήματος. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | Κάνει το καθορισμένο χρώμα διαφανές για αυτόBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | Κάνει το καθορισμένο χρώμα διαφανές για αυτόBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | Διαβάζει pixel bitmap σε μορφή ARGB32 σε δεδομένο πίνακα. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | Καταργεί το καθορισμένο στοιχείο ιδιότητας από αυτόImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | Αυτή η μέθοδος περιστρέφει, αναστρέφει ή περιστρέφει και αναστρέφει τοImage . |
| [Save](../../system.drawing/image/save/)(string) | Αποθηκεύει αυτόImageστο καθορισμένο αρχείο ή ροή. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο στην καθορισμένη μορφή. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτήν την εικόνα στην καθορισμένη ροή, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Αποθηκεύει αυτόImage στο καθορισμένο αρχείο, με τις καθορισμένες παραμέτρους κωδικοποιητή και κωδικοποιητή εικόνας. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτήν των μεθόδων Image.Save(...). Χρησιμοποιήστε αυτήν τη μέθοδο για να αποθηκεύσετε επιλεγμένα καρέ από μια εικόνα πολλαπλών καρέ σε μια άλλη εικόνα πολλαπλών καρέ. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Προσθέτει ένα πλαίσιο στο αρχείο ή τη ροή που καθορίστηκε σε προηγούμενη κλήση σε αυτή των μεθόδων Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Επιλέγει το πλαίσιο που καθορίζεται από τη διάσταση και το ευρετήριο. |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | Ορίζει το χρώμα του καθορισμένου pixel σε αυτόBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | Αποθηκεύει ένα στοιχείο ιδιότητας (κομμάτι μεταδεδομένων) σε αυτόImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | Ορίζει την ανάλυση για αυτόBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | Ξεκλειδώνει αυτόBitmap από τη μνήμη συστήματος. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | Γράφει pixel στο bitmap. |

### Δείτε επίσης

* class [Image](../image/)
* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


