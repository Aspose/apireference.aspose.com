---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters τάξη. Παράμετροι για τη δημιουργία προβαλλόμενου SRS. Ορισμένες από τις παραμέτρους έχουν προεπιλογές. Ορισμένες παράμετροι έχουν λογικές προεπιλογές επομένως δεν χρειάζεται να τις εκχωρήσετε μόνο. Εάν εκχωρήσετεnull σε αυτές τις παραμέτρους θα χρησιμοποιηθεί μια προεπιλεγμένη τιμή. ProjectionMethodName καιBase δεν έχετε προεπιλογές  πρέπει να εκχωρήσετε κάποια μηnull τιμή σε αυτές τις ιδιότητες.
type: docs
weight: 2230
url: /el/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Παράμετροι για τη δημιουργία προβαλλόμενου SRS. Ορισμένες από τις παραμέτρους έχουν προεπιλογές. Ορισμένες παράμετροι έχουν λογικές προεπιλογές, επομένως δεν χρειάζεται να τις εκχωρήσετε μόνο. Εάν εκχωρήσετε`null` σε αυτές τις παραμέτρους, θα χρησιμοποιηθεί μια προεπιλεγμένη τιμή. [`ProjectionMethodName`](./projectionmethodname/) και[`Base`](./base/) δεν έχετε προεπιλογές - πρέπει να εκχωρήσετε κάποια μη`null` τιμή σε αυτές τις ιδιότητες.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Σειρά αξόνων. Προεπιλογές σεXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Βασικό γεωγραφικό SRS (SRS στο οποίο εφαρμόζεται η προβολή). ΠΡΕΠΕΙ να ορίσετε αυτήν την ιδιότητα σε όχι`null` τιμή για να δημιουργηθεί έγκυρο SRS, αυτή η ιδιότητα δεν έχει καμία προεπιλογή. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Μονάδες που θα χρησιμοποιηθούν σε αυτό το SRS. Η προεπιλογή είναι[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Όνομα του προβλεπόμενου SRS. Η προεπιλογή είναι "Unnamed". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Αναγνωριστικό μεθόδου προβολής. Δεν υπάρχει προεπιλεγμένη τιμή, μπορείτε να ορίσετε αυτήν την παράμετρο σε όχι`null` τιμή, εάν θέλετε να επισυνάψετε αναγνωριστικό στην προβολή. Εάν το κάνετε - εξαρτάται από εσάς να διασφαλίσετε ότι το αναγνωριστικό στο όνομα συνεπούς προβολής method (το όνομα της μεθόδου προβολής δεν θα αλλάξει όταν ορίσετε αυτήν την ιδιότητα). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Όνομα της μεθόδου προβολής. Δεν υπάρχει προεπιλογή και ΠΡΕΠΕΙ να ορίσετε αυτήν την παράμετρο σε not`null` τιμή, αφού το προβαλλόμενο SRS χωρίς όνομα προβολής είναι άχρηστο. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Άξονας που περιγράφει Χ (οριζόντια) διάσταση. Προεπιλογή σε άξονα με ανατολική κατεύθυνση. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Άξονας που περιγράφει την Y (κάθετη) διάσταση. Προεπιλογές σε άξονα με βόρεια κατεύθυνση. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Προσθέτει την παράμετρο προβολής σε αυτό το SRS. Εάν έχει ήδη προστεθεί παράμετρος με τέτοιο όνομα - ενημερώστε την. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Λαμβάνει την παράμετρο προβολής με καθορισμένο όνομα. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


