---
title: GraphicsPath.AddCurve
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPath μέθοδος. Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα.
type: docs
weight: 110
url: /el/net/system.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα.

```csharp
public void AddCurve(Point[] points)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | Point[] | Μια σειρά απόPoint δομές που αντιπροσωπεύουν τα σημεία που ορίζουν την καμπύλη. |

### Δείτε επίσης

* struct [Point](../../../system.drawing/point/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)

---

## AddCurve(PointF[]) {#addcurve}

Προσθέτει μια καμπύλη spline στο τρέχον σχήμα. Χρησιμοποιείται μια βασική καμπύλη spline επειδή η καμπύλη διασχίζει κάθε ένα από τα σημεία του πίνακα.

```csharp
public void AddCurve(PointF[] points)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | PointF[] | Μια σειρά απόPointF δομές που αντιπροσωπεύουν τα σημεία που ορίζουν την καμπύλη. |

### Δείτε επίσης

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], float) {#addcurve_2}

Προσθέτει μια καμπύλη spline στο τρέχον σχήμα.

```csharp
public void AddCurve(PointF[] points, float tension)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | PointF[] | Ένας πίνακας δομών PointF που αντιπροσωπεύει τα σημεία που ορίζουν την καμπύλη. |
| tension | Single | Μια τιμή που καθορίζει την ποσότητα που κάμπτεται η καμπύλη μεταξύ των σημείων ελέγχου. Τιμές μεγαλύτερες από 1 παράγουν απρόβλεπτα αποτελέσματα. |

### Δείτε επίσης

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

Προσθέτει μια καμπύλη spline στο τρέχον σχήμα.

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | PointF[] | Μια σειρά απόPointF δομές που αντιπροσωπεύουν τα σημεία που ορίζουν την καμπύλη. |
| offset | Int32 | Ο δείκτης του στοιχείου στο*points* πίνακας που χρησιμοποιείται ως πρώτο σημείο στην καμπύλη. |
| numberOfSegments | Int32 | Ο αριθμός των τμημάτων που χρησιμοποιούνται για τη σχεδίαση της καμπύλης. Ένα τμήμα μπορεί να θεωρηθεί ως μια γραμμή που συνδέει δύο σημεία. |
| tension | Single | Μια τιμή που καθορίζει την ποσότητα που κάμπτεται η καμπύλη μεταξύ των σημείων ελέγχου. Τιμές μεγαλύτερες από 1 παράγουν απρόβλεπτα αποτελέσματα. |

### Δείτε επίσης

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* χώρος ονομάτων [System.Drawing.Drawing2D](../../graphicspath/)
* συνέλευση [Aspose.Drawing](../../../)


