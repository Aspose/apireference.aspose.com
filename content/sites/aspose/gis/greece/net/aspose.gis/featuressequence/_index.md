---
title: Class FeaturesSequence
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.FeaturesSequence τάξη. FeaturesSequence αντιπροσωπεύει ένα σύνολο διανυσματικών χαρακτηριστικών.
type: docs
weight: 170
url: /el/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` αντιπροσωπεύει ένα σύνολο διανυσματικών χαρακτηριστικών.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Λαμβάνει τη συλλογή προσαρμοσμένων χαρακτηριστικών για λειτουργίες σε αυτό[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Λαμβάνει σύστημα χωρικής αναφοράς αυτής της ακολουθίας χαρακτηριστικών. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Επιστρέφει έναν απαριθμητή που επαναλαμβάνει τη συλλογή. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Λαμβάνει μια χωρική έκταση αυτού του στρώματος. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Διαχωρίστε τα χαρακτηριστικά ανά τύπο γεωμετρίας. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού ίση με την παρεχόμενη τιμή. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μεγαλύτερη από την παρεχόμενη τιμή. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μεγαλύτερη ή ίση με την παρεχόμενη τιμή. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Φιλτράρει τις λειτουργίες με βάση την έκταση. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Φιλτράρει χαρακτηριστικά με βάση την ένωση όλων των γεωμετριών σε ακολουθία άλλων χαρακτηριστικών. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Φιλτράρει χαρακτηριστικά με βάση την παρεχόμενη γεωμετρία. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού όχι ίση με την παρεχόμενη τιμή. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Επιλέγει χαρακτηριστικά με χαρακτηριστικό όχι ίσο με null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Επιλέγει χαρακτηριστικά με χαρακτηριστικό ίσο με null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Επιλέγει χαρακτηριστικά με σύνολο χαρακτηριστικών. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μικρότερη από την παρεχόμενη τιμή. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μικρότερη ή ίση με την παρεχόμενη τιμή. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Επιλέγει λειτουργίες όπου δεν έχει οριστεί το καθορισμένο χαρακτηριστικό. |

### Δείτε επίσης

* class [Feature](../feature/)
* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


