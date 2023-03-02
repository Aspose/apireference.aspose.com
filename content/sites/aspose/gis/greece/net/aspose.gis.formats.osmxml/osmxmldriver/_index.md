---
title: Class OsmXmlDriver
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.OsmXml.OsmXmlDriver τάξη. Ένα πρόγραμμα οδήγησης για τη μορφή OSM XML.
type: docs
weight: 620
url: /el/net/aspose.gis.formats.osmxml/osmxmldriver/
---
## OsmXmlDriver class

Ένα πρόγραμμα οδήγησης για τη μορφή OSM XML.

```csharp
public sealed class OsmXmlDriver : FileDriver
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.osmxml/osmxmldriver/cancreatedatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει σύνολα δεδομένων. |
| override [CanCreateLayers](../../aspose.gis.formats.osmxml/osmxmldriver/cancreatelayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να δημιουργήσει διανυσματικά επίπεδα. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει σύνολα δεδομένων. |
| override [CanOpenLayers](../../aspose.gis.formats.osmxml/osmxmldriver/canopenlayers/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το πρόγραμμα οδήγησης μπορεί να ανοίξει διανυσματικά επίπεδα. |

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
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_7)(string, OsmXmlOptions) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| override [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_8)(string, OsmXmlOptions, SpatialReferenceSystem) | Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Ανοίγει ένα επίπεδο για επεξεργασία. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Ανοίγει το σύνολο δεδομένων. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Ανοίγει το σύνολο δεδομένων. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Ανοίγει το επίπεδο για ανάγνωση. |
| override [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_2)(AbstractPath, OsmXmlOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Ανοίγει το επίπεδο για ανάγνωση. |
| [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_5)(string, OsmXmlOptions) | Ανοίγει ένα επίπεδο για ανάγνωση. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.osmxml/osmxmldriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Καθορίζει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης. |

### Δείτε επίσης

* class [FileDriver](../../aspose.gis/filedriver/)
* χώρος ονομάτων [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* συνέλευση [Aspose.GIS](../../)


