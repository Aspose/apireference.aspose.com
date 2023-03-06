---
title: Class Feature
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Feature τάξη. Ένα γεωγραφικό χαρακτηριστικό που αποτελείται από μια γεωμετρία και χαρακτηριστικά που καθορίζονται από τον χρήστη.
type: docs
weight: 130
url: /el/net/aspose.gis/feature/
---
## Feature class

Ένα γεωγραφικό χαρακτηριστικό που αποτελείται από μια γεωμετρία και χαρακτηριστικά που καθορίζονται από τον χρήστη.

```csharp
public class Feature
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Λαμβάνει ή ορίζει τη γεωμετρία του χαρακτηριστικού. Δεν μπορεί να`null` , χρήση[`Null`](../../aspose.gis.geometries/geometry/null/) για να υποδείξετε τη γεωμετρία που λείπει. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Αντιγράφει τιμές χαρακτηριστικών από άλλο χαρακτηριστικό. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Παίρνει την τιμή ενός χαρακτηριστικού. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Παίρνει την τιμή ενός χαρακτηριστικού. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Επιστρέφει τις τιμές για όλα τα χαρακτηριστικά ενός πίνακα. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Επιστρέφει τις τιμές για όλα τα χαρακτηριστικά ενός πίνακα. Εξετάστε το ενδεχόμενο να χρησιμοποιήσετε[`GetValues`](./getvalues/) μέθοδος αποφυγής πρόσθετης εκχώρησης μνήμης. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Λαμβάνει τις τιμές μιας ακολουθίας χαρακτηριστικών ως λίστα. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Καθορίζει εάν το καθορισμένο χαρακτηριστικό έχει οριστεί ρητά σε`μηδενικό` τιμή. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Ελέγχει εάν η τιμή του χαρακτηριστικού έχει οριστεί σε αυτό το χαρακτηριστικό. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Ορίζει μια νέα τιμή ενός χαρακτηριστικού. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Ορίζει την τιμή του χαρακτηριστικού σε`μηδενικό` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Ορίζει νέες τιμές για όλα τα χαρακτηριστικά. Επίσης, σκεφτείτε να χρησιμοποιήσετε[`CopyValues`](./copyvalues/) μέθοδος για τον εξορθολογισμό των τιμών των ρυθμίσεων σε μία κλήση. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Καταργεί την τιμή του χαρακτηριστικού από αυτό το χαρακτηριστικό. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


