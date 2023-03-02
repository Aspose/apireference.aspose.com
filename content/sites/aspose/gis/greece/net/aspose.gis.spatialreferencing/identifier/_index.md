---
title: Class Identifier
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.Identifier τάξη. Αντιπροσωπεύει ένα αναγνωριστικό  μια αναφορά σε εξωτερική περιγραφή ενός αντικειμένου. Εάν δημιουργήσετε ένα SRS από το WKTIdentifier αντιστοιχεί στη λέξηκλειδί AUTHORITY.
type: docs
weight: 2160
url: /el/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Αντιπροσωπεύει ένα αναγνωριστικό - μια αναφορά σε εξωτερική περιγραφή ενός αντικειμένου. Εάν δημιουργήσετε ένα SRS από το WKT,`Identifier` αντιστοιχεί στη λέξη-κλειδί "AUTHORITY".

```csharp
public class Identifier : IEquatable<Identifier>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Identifier](identifier/)(string, string) | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Ένα όνομα αρχής, το οποίο έδωσε ένα[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | Ένας μοναδικός τρόπος για να αναπαραστήσετε ένα αντικείμενο μέσα σε ένα[`AuthorityName`](./authorityname/) . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Δημιουργεί νέο αναγνωριστικό που αντιπροσωπεύει το αναγνωριστικό EPSG με κωδικό*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Υποδεικνύει εάν το τρέχον αντικείμενο είναι ίσο με άλλο αντικείμενο του ίδιου τύπου. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Καθορίζει εάν το καθορισμένο αντικείμενο είναι ίσο με το τρέχον αντικείμενο. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Εάν αυτό το αντικείμενο αντιπροσωπεύει ένα έγκυρο αναγνωριστικό EPSG (π.χ. - το όνομα αρχής είναι "EPSG" και το μοναδικό αναγνωριστικό αρχής είναι ακέραιος) - επιστρέψτε το. Διαφορετικά - επιστροφή -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Λειτουργεί ως η προεπιλεγμένη συνάρτηση κατακερματισμού. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Υλοποιεί τον τελεστή ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Υλοποιεί τον τελεστή !=. |

### Παραδείγματα

Το χωρικό σύστημα αναφοράς WGS 84 έχει κωδικό EPSG 4326, επομένως μπορεί να περιέχει αναγνωριστικό: WGS 84 Ellipsoid έχει κωδικό EPSG 7030 και μπορεί να περιέχει αναγνωριστικό:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


