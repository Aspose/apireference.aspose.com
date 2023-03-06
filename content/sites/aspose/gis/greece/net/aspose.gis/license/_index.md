---
title: Class License
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.License τάξη. Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.
type: docs
weight: 1270
url: /el/net/aspose.gis/license/
---
## License class

Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.

```csharp
public class License
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [License](license/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Παρέχει άδεια χρήσης του στοιχείου. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Παρέχει άδεια χρήσης του στοιχείου. |

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να βρεθεί ένα αρχείο άδειας με το όνομα MyLicense.lic στο φάκελο που περιέχει το στοιχείο, στο φάκελο που περιέχει τη συγκρότηση κλήσης, στο φάκελο της συναρμολόγησης και μετά στη συναρμολόγηση ενσωματωμένοι πόροι της συγκρότησης κλήσης.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


