---
title: VectorLayer.UseSpatialIndex
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorLayer μέθοδος. Φορτώνει χωρικό ευρετήριο για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπωςWhereIntersects καιNearestTo. Εάν δεν υπάρχει ευρετήριο το δημιουργεί πρώτα. ΧρήσηforceRebuild για αναγκαστική δημιουργία ευρετηρίου.
type: docs
weight: 190
url: /el/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Φορτώνει χωρικό ευρετήριο για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereIntersects`](../../featuressequence/whereintersects/) και[`NearestTo`](../nearestto/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| indexPath | String | Διαδρομή προς το αρχείο ευρετηρίου. |
| forceRebuild | Boolean | Αν θα αναδημιουργηθεί ευρετήριο ακόμα κι αν υπάρχει ήδη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| InvalidOperationException | Το χωρικό ευρετήριο έχει ήδη φορτωθεί για αυτό το επίπεδο. |
| [GisException](../../gisexception/) | Το αρχείο υπάρχει και δεν είναι αρχείο χωρικού ευρετηρίου που δημιουργήθηκε από το Aspose.GIS. |

### Δείτε επίσης

* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Φορτώνει χωρικό ευρετήριο για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereIntersects`](../../featuressequence/whereintersects/) και[`NearestTo`](../nearestto/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| indexPath | AbstractPath | Διαδρομή προς το αρχείο ευρετηρίου. |
| forceRebuild | Boolean | Αν θα αναδημιουργηθεί ευρετήριο ακόμα κι αν υπάρχει ήδη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| InvalidOperationException | Το χωρικό ευρετήριο έχει ήδη φορτωθεί για αυτό το επίπεδο. |
| [GisException](../../gisexception/) | Το αρχείο υπάρχει και δεν είναι αρχείο χωρικού ευρετηρίου που δημιουργήθηκε από το Aspose.GIS. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)


