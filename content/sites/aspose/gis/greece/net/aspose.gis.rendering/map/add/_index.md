---
title: Map.Add
second_title: Αναφορά Aspose.GIS για .NET API
description: Map μέθοδος. Δημιουργεί έναVectorMapLayer με προεπιλεγμένο σύμβολο και τον προσθέτει στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.
type: docs
weight: 110
url: /el/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Δημιουργεί ένα[`VectorMapLayer`](../../vectormaplayer/) με προεπιλεγμένο σύμβολο και τον προσθέτει στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Ένα διανυσματικό επίπεδο για αναπαράσταση με[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` για να αφήσετε το διανυσματικό στρώμα ανοιχτό μετά το[`Map`](../) το αντικείμενο είναι απόρριψη; `false` για να απορρίψετε το στρώμα. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Ένα διανυσματικό επίπεδο για αναπαράσταση με[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |
| keepOpen | Boolean | `true` για να αφήσετε το διανυσματικό στρώμα ανοιχτό μετά το[`Map`](../) το αντικείμενο είναι απόρριψη; `false` για να απορρίψετε το στρώμα. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | VectorLayer | Ένα διανυσματικό επίπεδο για αναπαράσταση με[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |
| labeling | Labeling | Ετικέτα για χρήση για την επισήμανση χαρακτηριστικών σε επίπεδο. Αν`null` , Προκαθορισμένο[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) θα χρησιμοποιηθεί. |
| keepOpen | Boolean | `true` για να αφήσετε το στρώμα ανοιχτό μετά το[`Map`](../) Το αντικείμενο διατίθεται. σε διαφορετική περίπτωση,`false` . |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Μια ακολουθία χαρακτηριστικών προς αναπαράσταση[`VectorMapLayer`](../../vectormaplayer/). |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Η ακολουθία χαρακτηριστικών είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Μια ακολουθία χαρακτηριστικών προς αναπαράσταση[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Η ακολουθία χαρακτηριστικών είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Μια ακολουθία χαρακτηριστικών προς αναπαράσταση[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. |
| labeling | Labeling | Ετικέτα για χρήση για την επισήμανση χαρακτηριστικών σε επίπεδο. Αν`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) θα χρησιμοποιηθεί. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Η ακολουθία χαρακτηριστικών είναι`null`. |

### Δείτε επίσης

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Προσθέτει ένα επίπεδο στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά.

```csharp
public void Add(MapLayer mapLayer)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| mapLayer | MapLayer | Το στρώμα που θα προστεθεί. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [MapLayer](../../maplayer/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Δημιουργεί ένα[`RasterMapLayer`](../../rastermaplayer/) με προεπιλεγμένο χρωματιστή και τον προσθέτει στον χάρτη.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| layer | RasterLayer | Ένα διανυσματικό επίπεδο για αναπαράσταση με[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | Ένας χρωματιστής που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος χρωματιστής. |
| keepOpen | Boolean | `true` για να αφήσετε το επίπεδο ράστερ ανοιχτό μετά το[`Map`](../) το αντικείμενο είναι απόρριψη; `false` για να απορρίψετε το στρώμα. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το στρώμα είναι`null`. |

### Δείτε επίσης

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)


