---
title: FeatureAttributeCollection.Item
second_title: Αναφορά Aspose.GIS για .NET API
description: FeatureAttributeCollection ιδιοκτησία. Λαμβάνει ή ορίζει τοFeatureAttribute στον καθορισμένο δείκτη.
type: docs
weight: 30
url: /el/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Λαμβάνει ή ορίζει το[`FeatureAttribute`](../../featureattribute/) στον καθορισμένο δείκτη.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| index | Ο μηδενικός δείκτης του χαρακτηριστικού προς λήψη ή ορισμό. |

### Επιστρεφόμενη Αξία

Το χαρακτηριστικό στο καθορισμένο ευρετήριο.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο δείκτης είναι εκτός εύρους. |
| InvalidOperationException | Προσπαθήστε να τροποποιήσετε μια κλειδωμένη συλλογή. |

### Δείτε επίσης

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* χώρος ονομάτων [Aspose.Gis](../../featureattributecollection/)
* συνέλευση [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Λαμβάνει ή ορίζει το[`FeatureAttribute`](../../featureattribute/) με καθορισμένο όνομα.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| name | Όνομα των χαρακτηριστικών. |

### Επιστρεφόμενη Αξία

Το χαρακτηριστικό με το καθορισμένο όνομα ή`null` αν δεν βρεθεί.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το όνομα του χαρακτηριστικού είναι`null`. |

### Δείτε επίσης

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* χώρος ονομάτων [Aspose.Gis](../../featureattributecollection/)
* συνέλευση [Aspose.GIS](../../../)


