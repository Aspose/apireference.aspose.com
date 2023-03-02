---
title: FileDriver.EditLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Ανοίγει ένα επίπεδο για επεξεργασία.
type: docs
weight: 70
url: /el/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Ανοίγει ένα επίπεδο για επεξεργασία.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Ανοίγει ένα επίπεδο για επεξεργασία.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να επεξεργαστεί επίπεδα. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Παρατηρήσεις

Το πρόγραμμα οδήγησης δημιουργεί ένα εσωτερικό επίπεδο με όλα τα χαρακτηριστικά. Αλλά έχουμε την επιλογή να χρησιμοποιήσουμε χώρο στο δίσκο αντί της RAM. Υπάρχουν προγράμματα οδήγησης για πιο βέλτιστη χρήση των πόρων (δείτε τη συγκεκριμένη τεκμηρίωση του προγράμματος οδήγησης). Επίσης το πρόγραμμα οδήγησης μπορεί να επεξεργαστεί ένα επίπεδο, εάν μπορεί να δημιουργήσει και να ανοίξει τα επίπεδα.

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


