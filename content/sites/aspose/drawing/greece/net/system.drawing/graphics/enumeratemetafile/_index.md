---
title: Graphics.EnumerateMetafile
second_title: Aspose.Drawing for .NET API Reference
description: Graphics μέθοδος. Στέλνει τις εγγραφές στο καθορισμένοMetafile  ένα κάθε φορά σε μια μέθοδο επιστροφής κλήσης για εμφάνιση σε ένα καθορισμένο σημείο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.
type: docs
weight: 460
url: /el/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επιστροφής κλήσης για εμφάνιση σε ένα καθορισμένο σημείο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) μία κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από ένα S[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | PointF[] | Συστοιχία τριών[`PointF`](../../pointf/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) μία κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | Point | [`Point`](../../point/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) μία κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| unit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Στέλνει τις εγγραφές σε ένα επιλεγμένο ορθογώνιο από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο σημείο.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoint | PointF | [`PointF`](../../pointf/) δομή που καθορίζει τη θέση της επάνω αριστερής γωνίας του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | Δομή System.Drawing.RectangleF που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Στέλνει τις εγγραφές στο καθορισμένο[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο παραλληλόγραμμο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destPoints | Point[] | Συστοιχία τριών[`Point`](../../point/) δομές που ορίζουν ένα παραλληλόγραμμο που καθορίζει το μέγεθος και τη θέση του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Στέλνει τις εγγραφές ενός επιλεγμένου παραλληλογράμμου από α[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) δομή που καθορίζει το τμήμα του μετα-αρχείου, σε σχέση με την επάνω αριστερή γωνία του, προς σχεδίαση. |
| srcUnit | GraphicsUnit | Μέλος του[`GraphicsUnit`](../../graphicsunit/) απαρίθμηση που καθορίζει τη μονάδα μέτρησης που χρησιμοποιείται για τον προσδιορισμό του τμήματος του μετααρχείου που το ορθογώνιο καθορίζεται από το*srcRect* η παράμετρος περιέχει. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Στέλνει τις εγγραφές των καθορισμένων[`Metafile`](../../../system.drawing.imaging/metafile/) , ένα κάθε φορά, σε μια μέθοδο επανάκλησης για εμφάνιση σε ένα καθορισμένο ορθογώνιο χρησιμοποιώντας καθορισμένα χαρακτηριστικά εικόνας.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) να απαριθμήσει. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) δομή που καθορίζει τη θέση και το μέγεθος του σχεδιασμένου μετααρχείου. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) πληρεξούσιο που καθορίζει τη μέθοδο στην οποία αποστέλλονται οι εγγραφές μετα-αρχείου. |
| callbackData | IntPtr | Εσωτερικός δείκτης που απαιτείται, αλλά αγνοήθηκε. Μπορείς να περάσειςZero για αυτήν την παράμετρο. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) που καθορίζει πληροφορίες χαρακτηριστικού εικόνας για τη σχεδιαζόμενη εικόνα. |

### Δείτε επίσης

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* χώρος ονομάτων [System.Drawing](../../graphics/)
* συνέλευση [Aspose.Drawing](../../../)


