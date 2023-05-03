---
title: Bitmap.Clone
second_title: Aspose.Drawing for .NET API Reference
description: Bitmap μέθοδος. Δημιουργεί ένα αντίγραφο της ενότητας αυτήςBitmap ορίζεται απόRectangle structure και με ένα καθορισμένοPixelFormat απαρίθμηση.
type: docs
weight: 100
url: /el/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

Δημιουργεί ένα αντίγραφο της ενότητας αυτήςBitmap ορίζεται απόRectangle structure και με ένα καθορισμένοPixelFormat απαρίθμηση.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | Rectangle | Ορίζει το μέρος αυτούBitmap για αντιγραφή. Οι συντεταγμένες είναι σχετικές με αυτόBitmap. |
| format | PixelFormat | Καθορίζει τοPixelFormat απαρίθμηση για τον προορισμόBitmap. |

### Επιστρεφόμενη Αξία

Το νέοBitmap που δημιουργεί αυτή η μέθοδος.

### Δείτε επίσης

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

Δημιουργεί ένα αντίγραφο της ενότητας αυτήςBitmap ορίζεται με ένα καθορισμένοPixelFormat απαρίθμηση.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | RectangleF | Ορίζει το μέρος αυτούBitmap να αντιγράψω. |
| format | PixelFormat | Καθορίζει τοPixelFormat απαρίθμηση για τον προορισμόBitmap. |

### Επιστρεφόμενη Αξία

οBitmap που δημιουργεί αυτή η μέθοδος.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| OutOfMemoryException | *rect* είναι εκτός των ορίων του bitmap πηγής. |
| ArgumentException | Το ύψος ή το πλάτος του*rect* είναι 0. |

### Δείτε επίσης

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* χώρος ονομάτων [System.Drawing](../../bitmap/)
* συνέλευση [Aspose.Drawing](../../../)


