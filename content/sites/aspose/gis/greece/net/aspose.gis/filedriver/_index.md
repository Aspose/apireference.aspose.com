---
title: Class FileDriver
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.FileDriver τάξη. Ένα πρόγραμμα οδήγησης για μια συγκεκριμένη μορφή που βασίζεται σε αρχείο.
type: docs
weight: 180
url: /el/net/aspose.gis/filedriver/
---
## FileDriver class

Ένα πρόγραμμα οδήγησης για μια συγκεκριμένη μορφή που βασίζεται σε αρχείο.

```csharp
public abstract class FileDriver : Driver
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει σύνολα δεδομένων. |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει διανυσματικά επίπεδα. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει σύνολα δεδομένων. |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει διανυσματικά επίπεδα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | Δημιουργεί ένα σύνολο δεδομένων. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | Ανοίγει το σύνολο δεδομένων. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | Ανοίγει το επίπεδο για ανάγνωση. |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | Ανοίγει το επίπεδο για ανάγνωση. |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Καθορίζει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης. |

### Δείτε επίσης

* class [Driver](../driver/)
* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


