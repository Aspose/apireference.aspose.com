---
title: VectorLayer.Add
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorLayer μέθοδος. Προσθέτει μια νέα δυνατότητα στο επίπεδο εάν υποστηρίζεται από τοVectorLayer μικρόDriver .
type: docs
weight: 80
url: /el/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Προσθέτει μια νέα δυνατότητα στο επίπεδο, εάν υποστηρίζεται από το[`VectorLayer`](../) μικρό[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| feature | Feature | Η δυνατότητα προσθήκης. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | ρίχνεται εάν το επίπεδο είναι μόνο για ανάγνωση. |

### Δείτε επίσης

* class [Feature](../../feature/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Προσθέτει μια νέα δυνατότητα με το καθορισμένο στυλ στο επίπεδο, εάν υποστηρίζεται από το[`VectorLayer`](../) μικρό[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| feature | Feature | Η δυνατότητα προσθήκης. |
| style | IFeatureStyle | Το χαρακτηριστικό στυλ. Χρήση`null` για να υποδείξει το στυλ που λείπει. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | ρίχνεται εάν το επίπεδο δεν υποστηρίζει στυλ ή το επίπεδο είναι μόνο για ανάγνωση. |
| InvalidOperationException | εμφανίζεται εάν τα επεξεργάσιμα επίπεδα δεν υποστηρίζουν στυλ. |
| ArgumentException | εκτινάσσεται εάν το στυλ δεν ταιριάζει με τον τύπο του προγράμματος οδήγησης. |

### Δείτε επίσης

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)


