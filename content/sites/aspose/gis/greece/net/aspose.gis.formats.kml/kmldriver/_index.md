---
title: Class KmlDriver
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.Kml.KmlDriver τάξη. Ένα πρόγραμμα οδήγησης για τη μορφή KML
type: docs
weight: 400
url: /el/net/aspose.gis.formats.kml/kmldriver/
---
## KmlDriver class

Ένα πρόγραμμα οδήγησης για τη μορφή KML

```csharp
public class KmlDriver : FileDriver
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.kml/kmldriver/cancreatedatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει σύνολα δεδομένων. |
| override [CanCreateLayers](../../aspose.gis.formats.kml/kmldriver/cancreatelayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει διανυσματικά επίπεδα. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει σύνολα δεδομένων. |
| override [CanOpenLayers](../../aspose.gis.formats.kml/kmldriver/canopenlayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει διανυσματικά επίπεδα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Δημιουργεί ένα σύνολο δεδομένων. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Δημιουργεί ένα σύνολο δεδομένων. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis.formats.kml/kmldriver/createlayer/#createlayer_3)(AbstractPath, KmlOptions) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis.formats.kml/kmldriver/createlayer/#createlayer_9)(string, KmlOptions) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| override [CreateLayer](../../aspose.gis.formats.kml/kmldriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis.formats.kml/kmldriver/createlayer/#createlayer_4)(AbstractPath, KmlOptions, SpatialReferenceSystem) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Ανοίγει το σύνολο δεδομένων. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Ανοίγει το επίπεδο για ανάγνωση. |
| override [OpenLayer](../../aspose.gis.formats.kml/kmldriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis.formats.kml/kmldriver/openlayer/#openlayer_2)(AbstractPath, KmlOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis.formats.kml/kmldriver/openlayer/#openlayer_5)(string, KmlOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.kml/kmldriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Καθορίζει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης. |

### Δείτε επίσης

* class [FileDriver](../../aspose.gis/filedriver/)
* χώρος ονομάτων [Aspose.Gis.Formats.Kml](../../aspose.gis.formats.kml/)
* συνέλευση [Aspose.GIS](../../)


