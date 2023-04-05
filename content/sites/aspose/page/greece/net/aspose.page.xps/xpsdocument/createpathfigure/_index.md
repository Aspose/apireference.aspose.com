---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page για Αναφορά API .NET
description: XpsDocument μέθοδος. Δημιουργεί ένα νέο σχήμα διαδρομής.
type: docs
weight: 280
url: /el/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Δημιουργεί ένα νέο σχήμα διαδρομής.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | PointF | Το σημείο εκκίνησης για το πρώτο τμήμα του σχήματος διαδρομής. |
| isClosed | Boolean | Καθορίζει εάν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, η διαδρομή είναι drawn "closed", δηλαδή, το τελευταίο σημείο στο τελευταίο τμήμα του σχήματος διαδρομής συνδέεται με το σημείο που καθορίζεται στο χαρακτηριστικό StartPoint, διαφορετικά η διαδρομή σχεδιάζεται "open" και η τελευταία το σημείο δεν είναι συνδεδεμένο με το σημείο εκκίνησης. Ισχύει μόνο εάν το σχήμα διαδρομής είναι που χρησιμοποιείται σε ένα στοιχείο {Path} που καθορίζει μια διαδρομή. |

### Επιστρεφόμενη Αξία

Νέα φιγούρα διαδρομής.

### Δείτε επίσης

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* χώρος ονομάτων [Aspose.Page.XPS](../../xpsdocument/)
* συνέλευση [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Δημιουργεί ένα νέο σχήμα διαδρομής.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | PointF | Το σημείο εκκίνησης για το πρώτο τμήμα του σχήματος διαδρομής. |
| segments | List`1 | Λίστα τμημάτων διαδρομής. |
| isClosed | Boolean | Καθορίζει εάν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, η διαδρομή είναι drawn "closed", δηλαδή, το τελευταίο σημείο στο τελευταίο τμήμα του σχήματος διαδρομής συνδέεται με το σημείο που καθορίζεται στο χαρακτηριστικό StartPoint, διαφορετικά η διαδρομή σχεδιάζεται "open" και η τελευταία το σημείο δεν είναι συνδεδεμένο με το σημείο εκκίνησης. Ισχύει μόνο εάν το σχήμα διαδρομής είναι που χρησιμοποιείται σε ένα στοιχείο {Path} που καθορίζει μια διαδρομή. |

### Επιστρεφόμενη Αξία

Νέα φιγούρα διαδρομής.

### Δείτε επίσης

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* χώρος ονομάτων [Aspose.Page.XPS](../../xpsdocument/)
* συνέλευση [Aspose.Page](../../../)


