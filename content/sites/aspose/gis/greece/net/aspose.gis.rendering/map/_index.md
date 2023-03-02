---
title: Class Map
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Rendering.Map τάξη. Ο χάρτης είναι μια συλλογή επιπέδων που μπορούν να αποδοθούν το ένα πάνω στο άλλο μέσωRenderer .
type: docs
weight: 1720
url: /el/net/aspose.gis.rendering/map/
---
## Map class

Ο χάρτης είναι μια συλλογή επιπέδων που μπορούν να αποδοθούν το ένα πάνω στο άλλο μέσω[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Δημιουργεί νέα παρουσία του`Χάρτης` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Χρώμα φόντου του χάρτη. Προεπιλογές σεTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Λαμβάνει τον αριθμό των επιπέδων στον χάρτη. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Καθορίζει τα όρια του χάρτη προς απόδοση. Εάν έχει οριστεί σε`null` , η έκταση υπολογίζεται κατά την απόδοση για να περιλαμβάνει όλες τις γεωμετρίες σε όλα τα επίπεδα. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Οπτικό ύψος του χάρτη. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Λαμβάνει το επίπεδο στο καθορισμένο ευρετήριο. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Καθορίζει την προσθήκη για προσθήκη στην έκταση. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Ανάλυση που θα χρησιμοποιηθεί για την απόδοση αυτού του χάρτη και για τη μετατροπή μεταξύ[`Measurement`](../measurement/) . Προεπιλογή στο 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) του χάρτη. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Οπτικό πλάτος του χάρτη. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Προσθέτει ένα επίπεδο στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Δημιουργεί ένα[`VectorMapLayer`](../vectormaplayer/) με προεπιλεγμένο σύμβολο και τον προσθέτει στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Δημιουργεί ένα[`RasterMapLayer`](../rastermaplayer/) με προεπιλεγμένο χρωματιστή και τον προσθέτει στον χάρτη. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Δημιουργεί και προσθέτει ένα[`VectorMapLayer`](../vectormaplayer/) στον χάρτη. Τα επίπεδα αποδίδονται με πρόσθετη σειρά. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Διαθέτει πόρους. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Επιστρέφει έναν απαριθμητή που επαναλαμβάνει τα επίπεδα του χάρτη. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Αποδίδει χάρτη σε αρχείο. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Αποδίδει χάρτη σε αρχείο. |

### Δείτε επίσης

* class [MapLayer](../maplayer/)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* συνέλευση [Aspose.GIS](../../)


