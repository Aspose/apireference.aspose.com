---
title: VectorLayer.Convert
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorLayer μέθοδος. Μετατροπή ενός επιπέδου σε διαφορετική μορφή.
type: docs
weight: 200
url: /el/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Μετατροπή ενός επιπέδου σε διαφορετική μορφή.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| sourcePath | String | Διαδρομή προς το επίπεδο που θα μετατραπεί. |
| sourceDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο πηγής. |
| destinationPath | String | Διαδρομή προς το επίπεδο που θα δημιουργηθεί ως αποτέλεσμα της μετατροπής. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο προορισμού. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε από τα μονοπάτια είναι`null`. |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Μετατροπή ενός επιπέδου σε διαφορετική μορφή.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| sourcePath | AbstractPath | Διαδρομή προς το επίπεδο που θα μετατραπεί. |
| sourceDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο πηγής. |
| destinationPath | AbstractPath | Διαδρομή προς το επίπεδο που θα δημιουργηθεί ως αποτέλεσμα της μετατροπής. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο προορισμού. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε από τα μονοπάτια είναι`null`. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Μετατροπή ενός επιπέδου σε διαφορετική μορφή.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| sourcePath | String | Διαδρομή προς το επίπεδο που θα μετατραπεί. |
| sourceDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο πηγής. |
| destinationPath | String | Διαδρομή προς το επίπεδο που θα δημιουργηθεί ως αποτέλεσμα της μετατροπής. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο προορισμού. |
| options | ConversionOptions | Επιλογές για τη διαδικασία μετατροπής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε από τα μονοπάτια είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Χωρικό σύστημα αναφοράς που καθορίζεται στο*options* δεν υποστηρίζεται από*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |

### Δείτε επίσης

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Μετατροπή ενός επιπέδου σε διαφορετική μορφή.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| sourcePath | AbstractPath | Διαδρομή προς το επίπεδο που θα μετατραπεί. |
| sourceDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο πηγής. |
| destinationPath | AbstractPath | Διαδρομή προς το επίπεδο που θα δημιουργηθεί ως αποτέλεσμα της μετατροπής. |
| destinationDriver | FileDriver | Το πρόγραμμα οδήγησης μορφής για το επίπεδο προορισμού. |
| options | ConversionOptions | Επιλογές για τη διαδικασία μετατροπής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε από τα μονοπάτια είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση ή την εγγραφή της δυνατότητας προς/από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Χωρικό σύστημα αναφοράς που καθορίζεται στο*options* δεν υποστηρίζεται από*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός της γεωμετρίας των χαρακτηριστικών από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου απέτυχε. |

### Δείτε επίσης

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)


