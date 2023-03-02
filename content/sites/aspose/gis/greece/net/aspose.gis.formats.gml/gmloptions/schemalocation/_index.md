---
title: GmlOptions.SchemaLocation
second_title: Αναφορά Aspose.GIS για .NET API
description: GmlOptions ιδιοκτησία. Λίστα ζευγών URI χωρισμένη στο διάστημα. Το πρώτο URI σε κάθε ζεύγος είναι ένα URI του χώρου ονομάτων το δεύτερο URI είναι ένα σχήμα διαδρομής προς XML του χώρου ονομάτων. Εάν οριστεί σεnull GmlDriver θα προσπαθήσει να διαβάσει το schemaLocation από το ριζικό στοιχείο του εγγράφου. Η προεπιλογή είναιnull .
type: docs
weight: 50
url: /el/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Λίστα ζευγών URI χωρισμένη στο διάστημα. Το πρώτο URI σε κάθε ζεύγος είναι ένα URI του χώρου ονομάτων, το δεύτερο URI είναι ένα σχήμα διαδρομής προς XML του χώρου ονομάτων. Εάν οριστεί σε`null` ,[`GmlDriver`](../../gmldriver/) θα προσπαθήσει να διαβάσει το schemaLocation από το ριζικό στοιχείο του εγγράφου. Η προεπιλογή είναι`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Παρατηρήσεις

Το Aspose.GIS χρησιμοποιεί σχήμα XML του αρχείου GML για να δημιουργήσει[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Με προεπιλογή, η τοποθεσία σχήματος εξάγεται από το χαρακτηριστικό schemaLocation. Εάν δεν υπάρχει τέτοιο χαρακτηριστικό ή δείχνει σε μη έγκυρη τοποθεσία, το Aspose.GIS θα αποτύχει να διαβάσει το αρχείο GML. Σε αυτήν την περίπτωση - ορίστε αυτήν την επιλογή, ώστε το Aspose.GIS να μπορεί να φορτώσει το σχήμα.

### Παραδείγματα

"http://site.com/namespace http://site.com/schema.xsd"

### Δείτε επίσης

* class [GmlOptions](../)
* χώρος ονομάτων [Aspose.Gis.Formats.Gml](../../gmloptions/)
* συνέλευση [Aspose.GIS](../../../)


