---
title: Class License
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.License τάξη. Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.
type: docs
weight: 270
url: /el/net/aspose.page/license/
---
## License class

Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.

```csharp
public class License
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [License](license/)() | Αρχικοποιεί μια νέα παρουσία αυτής της κλάσης. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | Ο αριθμός άδειας προστέθηκε ως ενσωματωμένος πόρος. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | Παρέχει άδεια χρήσης του στοιχείου. |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | Παρέχει άδεια χρήσης του στοιχείου. |

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να βρεθεί ένα αρχείο άδειας με το όνομα MyLicense.lic στο φάκελο που περιέχει  το στοιχείο, στο φάκελο που περιέχει τη συγκρότηση κλήσης, στο φάκελο της διάταξης καταχώρησης και, στη συνέχεια, στους ενσωματωμένους πόρους της συγκρότησης κλήσης.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

το αρχείο jar του στοιχείου:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Page](../../aspose.page/)
* συνέλευση [Aspose.Page](../../)


