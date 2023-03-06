---
title: Dataset.Open
second_title: Αναφορά Aspose.GIS για .NET API
description: Dataset μέθοδος. Ανοίγει το σύνολο δεδομένων.
type: docs
weight: 20
url: /el/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Ανοίγει το σύνολο δεδομένων.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το σύνολο δεδομένων. |
| driver | FileDriver | Πρόγραμμα οδήγησης προς χρήση. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Ανοίγει το σύνολο δεδομένων.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το σύνολο δεδομένων. |
| driver | FileDriver | Πρόγραμμα οδήγησης προς χρήση. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Ανοίγει το σύνολο δεδομένων.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το σύνολο δεδομένων. |
| driver | FileDriver | Πρόγραμμα οδήγησης προς χρήση. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Ανοίγει το σύνολο δεδομένων.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το σύνολο δεδομένων. |
| driver | FileDriver | Πρόγραμμα οδήγησης προς χρήση. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Ανοίγει το σύνολο δεδομένων.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| connection | IDbConnection | Άνοιξε σύνδεση με τη βάση δεδομένων. |
| driver | DatabaseDriver | Πρόγραμμα οδήγησης προς χρήση. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)


