---
title: CompositeCurve
second_title: Aspose.3D για Αναφορά API .NET
description: ΑCompositeCurve./compositecurve/ αποτελείται από πολλά τμήματα καμπύλης.
type: docs
weight: 270
url: /el/net/aspose.threed.entities/compositecurve/
---
## CompositeCurve class

Α`CompositeCurve` αποτελείται από πολλά τμήματα καμπύλης.

```csharp
public class CompositeCurve : Curve
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [CompositeCurve](compositecurve/)() | Κατασκευαστής του`CompositeCurve` |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Λαμβάνει ή ορίζει το χρώμα της γραμμής, η προεπιλεγμένη τιμή είναι λευκό(1, 1, 1) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [Segments](../../aspose.threed.entities/compositecurve/segments/) { get; } | Τα τμήματα της καμπύλης. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddSegment](../../aspose.threed.entities/compositecurve/addsegment/)(Curve, bool) | Το |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |

## Άλλα Μέλη

| Ονομα | Περιγραφή |
| --- | --- |
| class [Segment](compositecurve.segment/) |  |

### Δείτε επίσης

* class [Curve](../curve/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
