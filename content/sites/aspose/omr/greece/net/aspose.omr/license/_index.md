---
title: Class License
second_title: Aspose.OMR για Αναφορά API .NET
description: Aspose.OMR.License τάξη. Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.
type: docs
weight: 770
url: /el/net/aspose.omr/license/
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

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Ο αριθμός άδειας προστέθηκε ως ενσωματωμένος πόρος. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Παρέχει άδεια χρήσης του στοιχείου. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Παρέχει άδεια χρήσης του στοιχείου. |

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να βρεθεί ένα αρχείο άδειας με το όνομα MyLicense.lic στο φάκελο που περιέχει το στοιχείο, στο φάκελο που περιέχει τη συγκρότηση κλήσης, στο φάκελο της συγκροτήματος καταχώρησης και στη συνέχεια στην ενσωματωμένη πόροι της καλούσας συνέλευσης.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OMR](../../aspose.omr/)
* συνέλευση [Aspose.OMR](../../)


