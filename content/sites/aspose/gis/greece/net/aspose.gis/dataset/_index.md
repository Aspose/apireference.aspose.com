---
title: Class Dataset
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Dataset τάξη. Ένα σύνολο δεδομένων είναι η συλλογή τουVectorLayer περιπτώσεις.
type: docs
weight: 80
url: /el/net/aspose.gis/dataset/
---
## Dataset class

Ένα σύνολο δεδομένων είναι η συλλογή του[`VectorLayer`](../vectorlayer/) περιπτώσεις.

```csharp
public abstract class Dataset : IDisposable
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το σύνολο δεδομένων μπορεί να δημιουργήσει διανυσματικά επίπεδα. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το σύνολο δεδομένων μπορεί να αφαιρέσει διανυσματικά επίπεδα. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Λαμβάνει το[`Driver`](./driver/) που δημιούργησε αυτό το σύνολο δεδομένων. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Λαμβάνει τον αριθμό των επιπέδων σε αυτό το σύνολο δεδομένων. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Δημιουργεί ένα σύνολο δεδομένων. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Δημιουργεί ένα σύνολο δεδομένων. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Ανοίγει το σύνολο δεδομένων. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Ανοίγει το σύνολο δεδομένων. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Ανοίγει το σύνολο δεδομένων. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Δημιουργεί ένα νέο διανυσματικό επίπεδο με καθορισμένο όνομα και το ανοίγει για προσάρτηση. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Δημιουργεί ένα νέο διανυσματικό επίπεδο με καθορισμένο όνομα και το ανοίγει για προσάρτηση. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Απελευθερώνει τους πόρους που χρησιμοποιούνται από το`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Ανοίγει το επίπεδο με καθορισμένο όνομα για επεξεργασία. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Λαμβάνει το όνομα του επιπέδου στο καθορισμένο ευρετήριο. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Ανοίγει το επίπεδο με καθορισμένο όνομα για ανάγνωση. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Ανοίγει το επίπεδο σε καθορισμένο ευρετήριο για ανάγνωση. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Καταργεί το διανυσματικό επίπεδο με καθορισμένο όνομα. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Αφαιρεί το διανυσματικό επίπεδο σε καθορισμένο ευρετήριο. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


