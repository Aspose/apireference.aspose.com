---
title: FeaturesSequence.SaveTo
second_title: Αναφορά Aspose.GIS για .NET API
description: FeaturesSequence μέθοδος. Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο.
type: docs
weight: 50
url: /el/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| destinationPath | String | Διαδρομή προς το επίπεδο εξόδου. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο εξόδου. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε επιχείρημα είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* χώρος ονομάτων [Aspose.Gis](../../featuressequence/)
* συνέλευση [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| destinationPath | AbstractPath | Διαδρομή προς το επίπεδο εξόδου. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο εξόδου. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* χώρος ονομάτων [Aspose.Gis](../../featuressequence/)
* συνέλευση [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| destinationPath | String | Διαδρομή προς το επίπεδο εξόδου. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο εξόδου. |
| options | SavingOptions | Επιλογές για τη διαδικασία αποθήκευσης. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |
| NotSupportedException | Χωρικό σύστημα αναφοράς που καθορίζεται στο*options* δεν υποστηρίζεται από*destinationDriver* . |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* χώρος ονομάτων [Aspose.Gis](../../featuressequence/)
* συνέλευση [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Αποθηκεύει τις λειτουργίες από ακολουθία σε επίπεδο.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| destinationPath | AbstractPath | Διαδρομή προς το επίπεδο εξόδου. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο εξόδου. |
| options | SavingOptions | Επιλογές για τη διαδικασία αποθήκευσης. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |
| NotSupportedException | Χωρικό σύστημα αναφοράς που καθορίζεται στο*options* δεν υποστηρίζεται από*destinationDriver* . |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* χώρος ονομάτων [Aspose.Gis](../../featuressequence/)
* συνέλευση [Aspose.GIS](../../../)


