---
title: AbstractPath.Open
second_title: Αναφορά Aspose.GIS για .NET API
description: AbstractPath μέθοδος. Ανοίγει αυτόAbstractPathως αρχείο.
type: docs
weight: 120
url: /el/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Ανοίγει αυτό`AbstractPath`ως αρχείο.

```csharp
public abstract Stream Open(FileAccess access)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| access | FileAccess | Καθορίζει ένα υποσύνολο λειτουργιών που μπορούν να εκτελεστούν σε αStream. |

### Επιστρεφόμενη Αξία

ΕΝΑStream άνοιξε με το καθορισμένοFileAccess .

### Παρατηρήσεις

Αν*access* έχει τη σημαίαWrite set, και το αρχείο δεν υπάρχει, ένας κληρονόμος πρέπει να το δημιουργήσει. Αν`AbstractPath` μπορεί να ανοίξει πολλές φορές από`Aspose.GIS` . Αυτό απαιτείται για να διαβάσετε ένα αρχείο ανεξάρτητα με πολλαπλές ροές. Δεν πρέπει να αποθηκεύσετε το αποτέλεσμα αλλά να επιστρέψετε νέοStream κάθε φορά καλείται αυτή η μέθοδος.

### Δείτε επίσης

* class [AbstractPath](../)
* χώρος ονομάτων [Aspose.Gis](../../abstractpath/)
* συνέλευση [Aspose.GIS](../../../)


