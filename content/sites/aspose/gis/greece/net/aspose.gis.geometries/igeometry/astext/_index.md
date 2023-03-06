---
title: IGeometry.AsText
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.
type: docs
weight: 120
url: /el/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου.

```csharp
public string AsText()
```

### Επιστρεφόμενη Αξία

Γνωστή Αναπαράσταση κειμένου αυτής της γεωμετρίας.

### Παρατηρήσεις

Η έξοδος αυτής της μεθόδου είναι μέσαIso Παραλλαγή WKT.

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
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
| NotSupportedException | Η γεωμετρία δεν υποστηρίζεται από την παραλλαγή WKT που ζητήθηκε. Οι ακόλουθες γεωμετρίες υποστηρίζονται μόνο απόIsoΠαραλλαγή WKT: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Όλες οι άλλες γεωμετρίες υποστηρίζονται από οποιαδήποτε παραλλαγή WKT. |
| ArgumentOutOfRangeException | *variant* δεν είναι έγκυρο[`WktVariant`](../../wktvariant/). |

### Δείτε επίσης

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
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
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


