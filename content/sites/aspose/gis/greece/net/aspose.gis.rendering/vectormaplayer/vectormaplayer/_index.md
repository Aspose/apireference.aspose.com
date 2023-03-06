---
title: VectorMapLayer.VectorMapLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorMapLayer κατασκευαστής. Δημιουργεί νέα παρουσία με προεπιλεγμένο συμβολοποιητή.
type: docs
weight: 10
url: /el/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

Δημιουργεί νέα παρουσία με προεπιλεγμένο συμβολοποιητή.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Ακολουθία χαρακτηριστικών. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

Δημιουργεί νέα παρουσία με προεπιλεγμένο συμβολοποιητή.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Ακολουθία χαρακτηριστικών. |
| symbolizer | VectorSymbolizer | Συμβολιστής που θα χρησιμοποιηθεί για την απόδοση του επιπέδου. Αν`null`, θα χρησιμοποιηθεί ο προεπιλεγμένος συμβολιστής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

Δημιουργεί νέα παρουσία με προεπιλεγμένο συμβολοποιητή.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Ακολουθία χαρακτηριστικών. |
| symbolizer | VectorSymbolizer | Συμβολιστής που θα χρησιμοποιηθεί για την απόδοση του επιπέδου. Αν`null`, θα χρησιμοποιηθεί ο προεπιλεγμένος συμβολιστής. |
| labeling | Labeling | Ετικέτα για χρήση για την επισήμανση χαρακτηριστικών σε επίπεδο. Αν`null` , Προκαθορισμένο[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) θα χρησιμοποιηθεί. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

Δημιουργεί νέα παρουσία με προεπιλεγμένο συμβολοποιητή.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Διάνυσμα στρώμα. |
| keepOpen | Boolean | `true` για να αφήσετε το στρώμα ανοιχτό μετά το[`VectorMapLayer`](../) Το αντικείμενο διατίθεται. σε διαφορετική περίπτωση,`false` . |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

Δημιουργεί νέα παρουσία.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Διάνυσμα στρώμα. |
| symbolizer | VectorSymbolizer | Συμβολιστής που θα χρησιμοποιηθεί για την απόδοση του επιπέδου. Αν`null`, θα χρησιμοποιηθεί ο προεπιλεγμένος συμβολιστής. |
| keepOpen | Boolean | `true` για να αφήσετε το στρώμα ανοιχτό μετά το[`VectorMapLayer`](../) Το αντικείμενο διατίθεται. σε διαφορετική περίπτωση,`false` . |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

Δημιουργεί νέα παρουσία.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Διάνυσμα στρώμα. |
| symbolizer | VectorSymbolizer | Συμβολιστής που θα χρησιμοποιηθεί για την απόδοση του επιπέδου. Αν`null` θα χρησιμοποιηθεί ο προεπιλεγμένος συμβολιστής. |
| labeling | Labeling | Ετικέτα για χρήση για την επισήμανση χαρακτηριστικών σε επίπεδο. Αν`null` , Προκαθορισμένο[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) θα χρησιμοποιηθεί. |
| keepOpen | Boolean | `true` για να αφήσετε το στρώμα ανοιχτό μετά το[`VectorMapLayer`](../) Το αντικείμενο διατίθεται. σε διαφορετική περίπτωση,`false` . |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../vectormaplayer/)
* συνέλευση [Aspose.GIS](../../../)


