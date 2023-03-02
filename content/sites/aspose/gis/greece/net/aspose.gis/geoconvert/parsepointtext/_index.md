---
title: GeoConvert.ParsePointText
second_title: Αναφορά Aspose.GIS για .NET API
description: GeoConvert μέθοδος. Μετατρέπει τη συμβολοσειρά που περιέχει τις συντεταγμένες σε αντικείμενο IPoint.
type: docs
weight: 20
url: /el/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Μετατρέπει τη συμβολοσειρά που περιέχει τις συντεταγμένες σε αντικείμενο IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| text | String | Μια συμβολοσειρά που περιέχει συντεταγμένες προς μετατροπή. Η συμβολοσειρά πρέπει να περιέχει και γεωγραφικό πλάτος και μήκος συντεταγμένων. Οι συντεταγμένες πρέπει να διαχωρίζονται με κενό διάστημα, με κόμμα ή με ερωτηματικό. |

### Επιστρεφόμενη Αξία

Σημειώστε αντικείμενο IP με συντεταγμένες που είναι ισοδύναμες με τη συμβολοσειρά εισόδου.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Παρατηρήσεις

Παραδείγματα: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "W4053d".

### Δείτε επίσης

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* χώρος ονομάτων [Aspose.Gis](../../geoconvert/)
* συνέλευση [Aspose.GIS](../../../)


