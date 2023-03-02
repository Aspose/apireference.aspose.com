---
title: VectorLayer.UseAttributesIndex
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorLayer μέθοδος. Φορτώνει το ευρετήριο χαρακτηριστικών για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπωςWhereGreater. Εάν δεν υπάρχει ευρετήριο το δημιουργεί πρώτα. ΧρήσηforceRebuild για αναγκαστική δημιουργία ευρετηρίου.
type: docs
weight: 180
url: /el/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

Φορτώνει το ευρετήριο χαρακτηριστικών για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereGreater`](../../featuressequence/wheregreater/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| indexPath | String | Διαδρομή προς το αρχείο ευρετηρίου. |
| attributeName | String | Όνομα του χαρακτηριστικού για τη δημιουργία ευρετηρίου. |
| forceRebuild | Boolean | Αν θα αναδημιουργηθεί ευρετήριο ακόμα κι αν υπάρχει ήδη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Χαρακτηριστικό με τέτοιο όνομα δεν υπάρχει στο επίπεδο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| InvalidOperationException | Ευρετήριο για το καθορισμένο χαρακτηριστικό που έχει ήδη φορτωθεί για αυτό το επίπεδο. |
| [GisException](../../gisexception/) | Το αρχείο υπάρχει και δεν είναι αρχείο ευρετηρίου χαρακτηριστικών που δημιουργήθηκε από το Aspose.GIS. |

### Δείτε επίσης

* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

Φορτώνει το ευρετήριο χαρακτηριστικών για να επιταχύνει το φιλτράρισμα κατά τιμή χαρακτηριστικών σε μεθόδους φιλτραρίσματος όπως[`WhereGreater`](../../featuressequence/wheregreater/). Εάν δεν υπάρχει ευρετήριο, το δημιουργεί πρώτα. Χρήση*forceRebuild* για αναγκαστική δημιουργία ευρετηρίου.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| indexPath | AbstractPath | Διαδρομή προς το αρχείο ευρετηρίου. |
| attributeName | String | Όνομα του χαρακτηριστικού για τη δημιουργία ευρετηρίου. |
| forceRebuild | Boolean | Αν θα αναδημιουργηθεί ευρετήριο ακόμα κι αν υπάρχει ήδη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Χαρακτηριστικό με τέτοιο όνομα δεν υπάρχει στο επίπεδο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| InvalidOperationException | Ευρετήριο για το καθορισμένο χαρακτηριστικό που έχει ήδη φορτωθεί για αυτό το επίπεδο. |
| [GisException](../../gisexception/) | Το αρχείο υπάρχει και δεν είναι αρχείο ευρετηρίου χαρακτηριστικών που δημιουργήθηκε από το Aspose.GIS. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)


