---
title: NumericFormat.Flat
second_title: Αναφορά Aspose.GIS για .NET API
description: NumericFormat μέθοδος. Μετατρέπει έναν αριθμό σε κείμενο σταθερού σημείου χωρίς επιστημονική σημείωση.
type: docs
weight: 20
url: /el/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Μετατρέπει έναν αριθμό σε κείμενο σταθερού σημείου χωρίς επιστημονική σημείωση.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| significantDigits | Int32 | Αριθμός σημαντικών ψηφίων. Η μέγιστη διαθέσιμη ακρίβεια είναι "308" |

### Επιστρεφόμενη Αξία

Ο προσδιοριστής ακριβείας στρογγυλοποίησης.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των σημαντικών ψηφίων είναι μικρότερος από 0 ή μεγαλύτερος από 308. |

### Παρατηρήσεις

Ο εσωτερικός κώδικας δημιουργεί αριθμητικές συμβολοσειρές για το WKT μέσω: απόφαση συντονισμού.ToString("0.##..", CultureInfo.InvariantCulture).

### Δείτε επίσης

* class [NumericFormat](../)
* χώρος ονομάτων [Aspose.Gis](../../numericformat/)
* συνέλευση [Aspose.GIS](../../../)


