---
title: GraphicsPath.Widen
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPath μέθοδος. Προσθέτει ένα επιπλέον περίγραμμα στη διαδρομή.
type: docs
weight: 360
url: /el/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

Προσθέτει ένα επιπλέον περίγραμμα στη διαδρομή.

```csharp
public void Widen(Pen pen)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pen | Pen | ΕΝΑPen που καθορίζει το πλάτος μεταξύ του αρχικού περιγράμματος της διαδρομής και του νέου περιγράμματος που δημιουργεί αυτή η μέθοδος. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotImplementedException | Η μέθοδος δεν εφαρμόστηκε. |

### Δείτε επίσης

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

Προσθέτει ένα επιπλέον περίγραμμα στοGraphicsPath .

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pen | Pen | ΕΝΑPen που καθορίζει το πλάτος μεταξύ του αρχικού περιγράμματος της διαδρομής και του νέου περιγράμματος που δημιουργεί αυτή η μέθοδος. |
| matrix | Matrix | ΕΝΑMatrix που καθορίζει έναν μετασχηματισμό που θα εφαρμοστεί στη διαδρομή πριν από τη διεύρυνση. |

### Δείτε επίσης

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

Αντικαθιστά αυτόGraphicsPath με καμπύλες που περικλείουν την περιοχή που γεμίζει όταν αυτή η διαδρομή χαράσσεται από την καθορισμένη πένα.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pen | Pen | ΕΝΑPen που καθορίζει το πλάτος μεταξύ του αρχικού περιγράμματος της διαδρομής και του νέου περιγράμματος που δημιουργεί αυτή η μέθοδος. |
| matrix | Matrix | ΕΝΑMatrix που καθορίζει έναν μετασχηματισμό που θα εφαρμοστεί στη διαδρομή πριν από τη διεύρυνση. |
| flatness | Single | Μια τιμή που καθορίζει την επιπεδότητα για τις καμπύλες. |

### Παρατηρήσεις

MS System. Η υλοποίηση σχεδίασης καλεί την Flatten() μέσα στην Widen() ή χρησιμοποιεί τον ίδιο αλγόριθμο. Η εφαρμογή Aspose.Drawing χρησιμοποιεί τον αλγόριθμο Skia χωρίς να αντικαθιστά τις καμπύλες σε τμήματα γραμμής. Αγνοεί το`ομαλότητα` παράμετρος.

### Δείτε επίσης

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)


