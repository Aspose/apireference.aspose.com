---
title: NurbsCurve
second_title: Aspose.3D για Αναφορά API .NET
description: Καμπύλη NURBShttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline είναι μια καμπύλη που αντιπροσωπεύεται από NURBS μη ομοιόμορφη ορθολογική βάση spline Μια καμπύλη NURBS ορίζεται απόOrder./nurbscurve/order/  ένα σύνολο σταθμισμένωνControlPoints./geometry/controlpoints/ και έναKnotVectors./nurbscurve/knotvectors/ Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου όποιο κι αν είναι αυτόTwoDimensional ήThreeDimensional
type: docs
weight: 460
url: /el/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[Καμπύλη NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) είναι μια καμπύλη που αντιπροσωπεύεται από NURBS (μη ομοιόμορφη ορθολογική βάση spline), Μια καμπύλη NURBS ορίζεται από[`Order`](./order/) , ένα σύνολο σταθμισμένων[`ControlPoints`](../geometry/controlpoints/) και ένα[`KnotVectors`](./knotvectors/) Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου, όποιο κι αν είναι αυτόTwoDimensional ήThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [NurbsCurve](nurbscurve/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`NurbsCurve` τάξη. |
| [NurbsCurve](nurbscurve/#constructor_1)(string) | Αρχικοποιεί μια νέα παρουσία του`NurbsCurve` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Λαμβάνει ή ορίζει το χρώμα της γραμμής, η προεπιλεγμένη τιμή είναι λευκό(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints/) { get; } | Λαμβάνει όλα τα σημεία ελέγχου |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype/) { get; set; } | Λαμβάνει ή ορίζει τον τύπο της καμπύλης. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension/) { get; set; } | Λαμβάνει ή ορίζει τη διάσταση της καμπύλης. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors/) { get; } | Λαμβάνει το διάνυσμα του κόμβου, είναι μια ακολουθία τιμών παραμέτρων που καθορίζει πού και πώς τα σημεία ελέγχου επηρεάζουν την καμπύλη NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity/) { get; } | Παίρνει την πολλαπλότητα. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [Order](../../aspose.threed.entities/nurbscurve/order/) { get; set; } | Λαμβάνει ή ορίζει τη σειρά μιας καμπύλης NURBS, καθορίζει τον αριθμό των κοντινών σημείων ελέγχου που επηρεάζουν οποιοδήποτε δεδομένο σημείο της καμπύλης. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational/) { get; set; } | Λαμβάνει ή ορίζει εάν είναι ορθολογικό, αυτή η τιμή υποδεικνύει εάν αυτό`NurbsCurve` είναι ορθολογικό spline ή μη ορθολογικό spline. Non-rational B-spline είναι μια ειδική περίπτωση ορθολογικών B-spline. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate/)(int) | Αξιολογήστε την καμπύλη NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat/)(double) | Αξιολογήστε το σημείο της καμπύλης στην καθορισμένη θέση |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |

### Δείτε επίσης

* class [Curve](../curve/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
