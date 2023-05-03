---
title: Bitmap.Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: Bitmap κατασκευαστής. Αρχικοποιεί μια νέα παρουσία τουBitmap τάξη με το καθορισμένο μέγεθος.
type: docs
weight: 10
url: /el/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) τάξη με το καθορισμένο μέγεθος.

```csharp
public Bitmap(int width, int height)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | Int32 | Το πλάτος, σε pixel, του νέου Bitmap. |
| height | Int32 | Το ύψος, σε pixels, του νέου Bitmap. |

### Παρατηρήσεις

Η μόνη υποστηριζόμενη εσωτερική μορφή bitmap αυτή τη στιγμή είναι ισοδύναμη με`PixelFormat.Format32bppPARgb` .

### Δείτε επίσης

* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από το καθορισμένο αρχείο.

```csharp
public Bitmap(string filename)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filename | String | Το όνομα του αρχείου bitmap. |

### Δείτε επίσης

* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από το καθορισμένο αρχείο.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filename | String | Το όνομα του αρχείου bitmap. |
| useIcm | Boolean | Είναι αλήθεια ότι χρησιμοποιείται διόρθωση χρώματος για αυτόBitmap; αλλιώς, ψευδής. |

### Δείτε επίσης

* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από την καθορισμένη ροή δεδομένων.

```csharp
public Bitmap(Stream stream)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | Stream | Η ροή δεδομένων που χρησιμοποιείται για τη φόρτωση της εικόνας. |

### Δείτε επίσης

* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από την καθορισμένη ροή δεδομένων.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | Stream | Η ροή δεδομένων που χρησιμοποιείται για τη φόρτωση της εικόνας. |
| useIcm | Boolean | `αληθής` για να χρησιμοποιήσετε διόρθωση χρώματος για αυτόBitmap ; σε διαφορετική περίπτωση,`ψευδής`. |

### Δείτε επίσης

* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) τάξη με το καθορισμένο μέγεθος και μορφή.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | Int32 | Το πλάτος, σε pixel, του νέουBitmap. |
| height | Int32 | Το ύψος, σε pixels, του νέουBitmap. |
| format | PixelFormat | οPixelFormat απαρίθμηση για το νέοBitmap. |

### Δείτε επίσης

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση με το καθορισμένο μέγεθος και δεδομένα pixel.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | Int32 | Το πλάτος, σε pixel, του νέουBitmap. |
| height | Int32 | Το ύψος, σε pixels, του νέουBitmap. |
| stride | Int32 | Η μετατόπιση byte μεταξύ της αρχής μιας γραμμής σάρωσης και της επόμενης, πρέπει να είναι πολλαπλάσιο των τεσσάρων. |
| format | PixelFormat | οPixelFormat απαρίθμηση για το νέοBitmap. |
| data | Int32[] | Τα δεδομένα pixel. |

### Δείτε επίσης

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από την καθορισμένη υπάρχουσα εικόνα.

```csharp
public Bitmap(Image original)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| original | Image | οImage από το οποίο να δημιουργηθεί το νέοBitmap. |

### Δείτε επίσης

* class [Image](../../image/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../)κλάση από την καθορισμένη υπάρχουσα εικόνα, με κλίμακα στο καθορισμένο μέγεθος.

```csharp
public Bitmap(Image original, Size newSize)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| original | Image | οImage από το οποίο να δημιουργηθεί το νέοBitmap |
| newSize | Size | οSize δομή που αντιπροσωπεύει το μέγεθος του νέουBitmap. |

### Δείτε επίσης

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Αρχικοποιεί μια νέα παρουσία του[`Bitmap`](../) κλάση από την καθορισμένη υπάρχουσα εικόνα, σε κλίμακα στο καθορισμένο μέγεθος.

```csharp
public Bitmap(Image original, int width, int height)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| original | Image | οImage από το οποίο να δημιουργηθεί το νέοBitmap. |
| width | Int32 | Το πλάτος, σε pixel, του νέουBitmap. |
| height | Int32 | Το ύψος, σε pixels, του νέουBitmap. |

### Δείτε επίσης

* class [Image](../../image/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)


