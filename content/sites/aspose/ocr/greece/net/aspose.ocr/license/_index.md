---
title: Class License
second_title: Aspose.OCR για Αναφορά API .NET
description: Aspose.OCR.License τάξη. Παρέχει μεθόδους για την άδεια χρήσης του στοιχείου.
type: docs
weight: 120
url: /el/net/aspose.ocr/license/
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
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν το προϊόν έχει άδεια χρήσης. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Παρέχει άδεια χρήσης του στοιχείου. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Παρέχει άδεια χρήσης του στοιχείου. |

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να βρεθεί ένα αρχείο άδειας χρήσης με το όνομα MyLicense.lic στο φάκελο που περιέχει το στοιχείο, στο φάκελο που περιέχει τη συγκρότηση κλήσης, στο φάκελο της συναρμολόγησης και μετά στη συναρμολόγηση οι ενσωματωμένοι πόροι της καλούσας συγκρότησης.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OCR](../../aspose.ocr/)
* συνέλευση [Aspose.OCR](../../)


