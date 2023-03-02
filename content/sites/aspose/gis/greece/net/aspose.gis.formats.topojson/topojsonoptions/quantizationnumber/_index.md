---
title: TopoJsonOptions.QuantizationNumber
second_title: Αναφορά Aspose.GIS για .NET API
description: TopoJsonOptions ιδιοκτησία. Καθορίζει τον αριθμό κβαντισμού που θα χρησιμοποιηθεί για τον κβαντισμό των συντεταγμένων και των τόξων κωδικοποίησης δέλτα στην έξοδο TopoJSON.
type: docs
weight: 50
url: /el/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Καθορίζει τον αριθμό κβαντισμού που θα χρησιμοποιηθεί για τον κβαντισμό των συντεταγμένων και των τόξων κωδικοποίησης δέλτα στην έξοδο TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Το όρισμα είναι μικρότερο από δύο. |

### Παρατηρήσεις

Αυτή είναι η επιλογή γραφής - δεν επηρεάζει την ανάγνωση. Αυτή η επιλογή είναι αμοιβαία αποκλειόμενη με[`Transform`](../transform/) - μόνο μία από αυτές τις δύο επιλογές μπορεί να μην είναι`null` . Εάν αυτό δεν είναι`null` - Οι συντεταγμένες TopoJSON εξόδου είναι κβαντισμένες και τα τόξα κωδικοποιούνται με δέλτα με τον καθορισμένο αριθμό κβαντισμού . Ο αριθμός κβαντοποίησης καθορίζει τον μέγιστο αριθμό εκφραζόμενων τιμών ανά διάσταση στις κβαντισμένες συντεταγμένες που προκύπτουν. τυπικά επιλέγεται η ισχύς του δέκα. Προεπιλογή σε`null` .

### Δείτε επίσης

* class [TopoJsonOptions](../)
* χώρος ονομάτων [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* συνέλευση [Aspose.GIS](../../../)


