---
title: Class Metered
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Metered τάξη. Παρέχει μεθόδους για τον ορισμό μετρημένου κλειδιού.
type: docs
weight: 2200
url: /el/net/aspose.svg/metered/
---
## Metered class

Παρέχει μεθόδους για τον ορισμό μετρημένου κλειδιού.

```csharp
public class Metered
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Metered](metered/)() | Αρχικοποιεί μια νέα παρουσία αυτής της κλάσης. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [SetMeteredKey](../../aspose.svg/metered/setmeteredkey/)(string, string) | Ορίζει το μετρημένο δημόσιο και ιδιωτικό κλειδί. Εάν αγοράσετε μετρημένη άδεια, κατά την έναρξη της εφαρμογής, αυτό το API θα πρέπει να καλείται, κανονικά, αυτό είναι αρκετό. Ωστόσο, εάν πάντα αποτυγχάνει η αποστολή δεδομένων κατανάλωσης και υπερβαίνει τις 24 ώρες, η άδεια θα οριστεί σε κατάσταση αξιολόγησης, για να αποφευχθεί τέτοια περίπτωση, θα πρέπει να ελέγχετε τακτικά την κατάσταση της άδειας, εάν είναι κατάσταση αξιολόγησης, καλέστε ξανά αυτό το API. |
| static [GetConsumptionCredit](../../aspose.svg/metered/getconsumptioncredit/)() | Λαμβάνει πίστωση κατανάλωσης |
| static [GetConsumptionQuantity](../../aspose.svg/metered/getconsumptionquantity/)() | Λαμβάνει μέγεθος αρχείου κατανάλωσης |

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να οριστεί το μετρημένο δημόσιο και ιδιωτικό κλειδί

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

το αρχείο jar του στοιχείου:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg](../../aspose.svg/)
* συνέλευση [Aspose.SVG](../../)


