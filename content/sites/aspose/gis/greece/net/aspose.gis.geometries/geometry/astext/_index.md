---
title: Geometry.AsText
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.
type: docs
weight: 130
url: /el/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.

```csharp
public string AsText()
```

### Επιστρεφόμενη Αξία

Γνωστή Αναπαράσταση κειμένου αυτής της γεωμετρίας.

### Παρατηρήσεις

Η έξοδος αυτής της μεθόδου είναι inIso Παραλλαγή WKT. Η προεπιλεγμένη αριθμητική μορφή είναι[`General`](../../../aspose.gis/numericformat/general/) (με ακρίβεια "0").

### Δείτε επίσης

* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.

```csharp
public string AsText(WktVariant variant)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| variant | WktVariant | Γνωστή παραλλαγή κειμένου προς χρήση. |

### Επιστρεφόμενη Αξία

Γνωστή Αναπαράσταση κειμένου αυτής της γεωμετρίας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Η γεωμετρία δεν μπορεί να αναπαρασταθεί στην παραλλαγή WKT που ζητήθηκε. Προς το παρόν αυτό συμβαίνει όταν [`HasCurveGeometry`](../hascurvegeometry/) της γεωμετρίας είναι`true` και η παραλλαγή WKT είναι SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* δεν είναι έγκυρο[`WktVariant`](../../wktvariant/). |

### Παρατηρήσεις

Η προεπιλεγμένη αριθμητική μορφή είναι[`General`](../../../aspose.gis/numericformat/general/) (με ακρίβεια "0").

### Δείτε επίσης

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| variant | WktVariant | Γνωστή παραλλαγή κειμένου προς χρήση. |
| format | NumericFormat | Μορφή συντεταγμένων για μετατροπή σε συμβολοσειρά. Δείτε το[`NumericFormat`](../../../aspose.gis/numericformat/) να το πάρεις. |

### Επιστρεφόμενη Αξία

Γνωστή Αναπαράσταση κειμένου αυτής της γεωμετρίας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Η γεωμετρία δεν μπορεί να αναπαρασταθεί στην παραλλαγή WKT που ζητήθηκε. Προς το παρόν αυτό συμβαίνει όταν [`HasCurveGeometry`](../hascurvegeometry/) της γεωμετρίας είναι`true` και η παραλλαγή WKT είναι SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* δεν είναι έγκυρο[`WktVariant`](../../wktvariant/). |

### Δείτε επίσης

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


