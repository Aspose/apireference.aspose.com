---
title: Map.Extent
second_title: Αναφορά Aspose.GIS για .NET API
description: Map ιδιοκτησία. Καθορίζει τα όρια του χάρτη προς απόδοση. Εάν έχει οριστεί σεnull  η έκταση υπολογίζεται κατά την απόδοση για να περιλαμβάνει όλες τις γεωμετρίες σε όλα τα επίπεδα.
type: docs
weight: 40
url: /el/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Καθορίζει τα όρια του χάρτη προς απόδοση. Εάν έχει οριστεί σε`null` , η έκταση υπολογίζεται κατά την απόδοση για να περιλαμβάνει όλες τις γεωμετρίες σε όλα τα επίπεδα.

```csharp
public Extent Extent { get; set; }
```

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) είναι`false`.[`Width`](../../../aspose.gis/extent/width/) είναι μικρότερο ή ίσο με μηδέν.[`Height`](../../../aspose.gis/extent/height/) είναι μικρότερο ή ίσο με μηδέν.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) είναι`null`. |

### Παρατηρήσεις

Εάν το χωρικό σύστημα αναφοράς της έκτασης δεν είναι ίσο με το χωρικό σύστημα αναφοράς του χάρτη, η έκταση μετατρέπεται στο σύστημα χωρικής αναφοράς στόχου κατά την απόδοση.

### Δείτε επίσης

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* χώρος ονομάτων [Aspose.Gis.Rendering](../../map/)
* συνέλευση [Aspose.GIS](../../../)


