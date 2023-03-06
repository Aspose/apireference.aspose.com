---
title: Class VectorLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.VectorLayer τάξη. Αντιπροσωπεύει ένα διανυσματικό επίπεδο. Ένα διανυσματικό επίπεδο είναι μια συλλογή από γεωγραφικά χαρακτηριστικά αποθηκευμένα σε ένα αρχείο.
type: docs
weight: 2320
url: /el/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Αντιπροσωπεύει ένα διανυσματικό επίπεδο. Ένα διανυσματικό επίπεδο είναι μια συλλογή από γεωγραφικά χαρακτηριστικά, αποθηκευμένα σε ένα αρχείο.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Λαμβάνει τη συλλογή προσαρμοσμένων χαρακτηριστικών για λειτουργίες σε αυτό`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Λαμβάνει τον αριθμό των χαρακτηριστικών σε αυτό το επίπεδο. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Λαμβάνει το[`Driver`](./driver/) που δημιούργησε αυτό το επίπεδο. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Παίρνει τον τύπο της γεωμετρίας για το στρώμα. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Λαμβάνει το[`Feature`](../feature/) στον καθορισμένο δείκτη. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Λαμβάνει σύστημα χωρικής αναφοράς αυτής της ακολουθίας χαρακτηριστικών. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Δημιουργεί το επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Δημιουργεί το επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Δημιουργεί το επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Ανοίξτε το επίπεδο για ανάγνωση. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Ανοίξτε το επίπεδο για ανάγνωση. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Ανοίξτε το επίπεδο για ανάγνωση. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Ανοίξτε το επίπεδο για ανάγνωση. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Προσθέτει μια νέα δυνατότητα στο επίπεδο, εάν υποστηρίζεται από το`VectorLayer` μικρό[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Προσθέτει μια νέα δυνατότητα με το καθορισμένο στυλ στο επίπεδο, εάν υποστηρίζεται από το`VectorLayer` μικρό[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Δημιουργήστε ένα κλώνο στρώματος ως μορφή InMemory. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Δημιουργεί (αλλά δεν προσθέτει στο επίπεδο) μια νέα δυνατότητα με χαρακτηριστικά που ταιριάζουν με τη συλλογή χαρακτηριστικών αυτού του επιπέδου. Όταν τελειώσετε με τη ρύθμιση δεδομένων για το χαρακτηριστικό, χρησιμοποιήστε[`Add`](./add/) για να προσθέσετε το χαρακτηριστικό στο επίπεδο. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Αντιγράφει χαρακτηριστικά άλλων`VectorLayer` σε αυτό. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Αντιγράφει χαρακτηριστικά άλλων`VectorLayer` σε αυτό. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Απελευθερώνει τους πόρους που χρησιμοποιούνται από το`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Καθορίζει εάν το καθορισμένο αντικείμενο είναι ίσο με το τρέχον αντικείμενο. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Επιστρέφει έναν απαριθμητή που επαναλαμβάνει τη συλλογή. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Λαμβάνει μια χωρική έκταση αυτού του στρώματος. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Ενώνει ένα επίπεδο στο τρέχον επίπεδο. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Λαμβάνει το πλησιέστερο χαρακτηριστικό στο παρεχόμενο σημείο. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Λαμβάνει το πλησιέστερο χαρακτηριστικό στην παρεχόμενη συντεταγμένη. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Αφαιρέστε το[`Feature`](../feature/) στον καθορισμένο δείκτη. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Αντικαταστήστε το[`Feature`](../feature/) στον καθορισμένο δείκτη. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Διαχωρίστε τα χαρακτηριστικά ανά τύπο γεωμετρίας. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Φορτώνει το ευρετήριο χαρακτηριστικών για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereGreater`](../featuressequence/wheregreater/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Φορτώνει το ευρετήριο χαρακτηριστικών για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereGreater`](../featuressequence/wheregreater/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Φορτώνει χωρικό ευρετήριο για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereIntersects`](../featuressequence/whereintersects/) και[`NearestTo`](./nearestto/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Φορτώνει χωρικό ευρετήριο για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereIntersects`](../featuressequence/whereintersects/) και[`NearestTo`](./nearestto/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού ίση με την παρεχόμενη τιμή. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μεγαλύτερη από την παρεχόμενη τιμή. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μεγαλύτερη ή ίση με την παρεχόμενη τιμή. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Φιλτράρει τις λειτουργίες με βάση την έκταση. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Φιλτράρει χαρακτηριστικά με βάση την ένωση όλων των γεωμετριών σε ακολουθία άλλων χαρακτηριστικών. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Φιλτράρει χαρακτηριστικά με βάση την παρεχόμενη γεωμετρία. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού όχι ίση με την παρεχόμενη τιμή. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Επιλέγει χαρακτηριστικά με χαρακτηριστικό όχι ίσο με null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Επιλέγει χαρακτηριστικά με χαρακτηριστικό ίσο με null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Επιλέγει χαρακτηριστικά με σύνολο χαρακτηριστικών. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μικρότερη από την παρεχόμενη τιμή. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Επιλέγει χαρακτηριστικά με τιμή χαρακτηριστικού μικρότερη ή ίση με την παρεχόμενη τιμή. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Επιλέγει λειτουργίες όπου δεν έχει οριστεί το καθορισμένο χαρακτηριστικό. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Μετατροπή ενός επιπέδου σε διαφορετική μορφή. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Μετατροπή ενός επιπέδου σε διαφορετική μορφή. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Μετατροπή ενός επιπέδου σε διαφορετική μορφή. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Μετατροπή ενός επιπέδου σε διαφορετική μορφή. |

### Δείτε επίσης

* class [FeaturesSequence](../featuressequence/)
* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


