---
title: TopoJsonOptions.DefaultObjectName
second_title: Αναφορά Aspose.GIS για .NET API
description: TopoJsonOptions ιδιοκτησία. Όνομα του αντικειμένου όπου τα χαρακτηριστικά τοποθετούνται από προεπιλογή.
type: docs
weight: 20
url: /el/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Όνομα του αντικειμένου όπου τα χαρακτηριστικά τοποθετούνται από προεπιλογή.

```csharp
public string DefaultObjectName { get; set; }
```

### Παρατηρήσεις

Αυτή είναι η επιλογή εγγραφής - δεν επηρεάζει την ανάγνωση. Το TopoJSON μπορεί να περιέχει οποιονδήποτε αριθμό ονομαζόμενων αντικειμένων. Κάθε τέτοιο αντικείμενο μπορεί να περιέχει πολλαπλά χαρακτηριστικά. Για να καθορίσετε σε ποιο αντικείμενο θα τοποθετήσετε το χαρακτηριστικό σας, use [`ObjectNameAttribute`](../objectnameattribute/) ιδιότητα. Αν χαρακτηριστικό με όνομα[`ObjectNameAttribute`](../objectnameattribute/) είναι`null`ή καταργήστε τη ρύθμιση για κάποια δυνατότητα, αυτή η δυνατότητα προστίθεται στο αντικείμενο με το όνομα`DefaultObjectName` . Αν χαρακτηριστικό με όνομα[`ObjectNameAttribute`](../objectnameattribute/) δεν υπάρχει σε[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) συλλογή , όλα τα χαρακτηριστικά τοποθετούνται σε αντικείμενο με όνομα[`ObjectNameAttribute`](../objectnameattribute/) . Η προεπιλεγμένη τιμή είναι "unnamed".

### Δείτε επίσης

* class [TopoJsonOptions](../)
* χώρος ονομάτων [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* συνέλευση [Aspose.GIS](../../../)


