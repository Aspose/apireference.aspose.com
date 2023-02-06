---
title: NurbsSurface
second_title: Aspose.3D για Αναφορά API .NET
description: NurbsSurface./nurbssurface/ είναι μια επιφάνεια που αντιπροσωπεύεται απόNURBS Μη ομοιόμορφη ορθολογική βάσηhttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline ΑNurbsSurface./nurbssurface/ ορίζεται από δύοNurbsDirection./nurbsdirection/U./nurbssurface/u/ καιV./nurbssurface/v/ . Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου ανεξάρτητα από τον τύπο της κατεύθυνσηςTwoDimensional ήThreeDimensional
type: docs
weight: 480
url: /el/net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

`NurbsSurface` είναι μια επιφάνεια που αντιπροσωπεύεται από[NURBS (Μη ομοιόμορφη ορθολογική βάση)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), Α`NurbsSurface` ορίζεται από δύο[`NurbsDirection`](../nurbsdirection/)[`U`](./u/) και[`V`](./v/) . Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου ανεξάρτητα από τον τύπο της κατεύθυνσηςTwoDimensional ήThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [NurbsSurface](nurbssurface/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`NurbsSurface` τάξη. |
| [NurbsSurface](nurbssurface/#constructor_1)(string) | Αρχικοποιεί μια νέα παρουσία του`NurbsSurface` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να δημιουργήσει σκιά |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Λαμβάνει όλα τα σημεία ελέγχου |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Λαμβάνει όλους τους παραμορφωτές που σχετίζονται με αυτήν τη γεωμετρία. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να λάβει σκιά. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [U](../../aspose.threed.entities/nurbssurface/u/) { get; } | Λαμβάνει την κατεύθυνση U της επιφάνειας NURBS |
| [V](../../aspose.threed.entities/nurbssurface/v/) { get; } | Λαμβάνει την κατεύθυνση V της επιφάνειας NURBS |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Λαμβάνει όλα τα στοιχεία κορυφής |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Λαμβάνει ή ορίζει εάν η γεωμετρία είναι ορατή |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Προσθέτει ένα υπάρχον στοιχείο κορυφής στην τρέχουσα γεωμετρία |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Δημιουργεί ένα στοιχείο κορυφής με καθορισμένο τύπο και το προσθέτει στη γεωμετρία. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Δημιουργεί ένα στοιχείο κορυφής με καθορισμένο τύπο και το προσθέτει στη γεωμετρία. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Δημιουργεί ένα[`VertexElementUV`](../vertexelementuv/) με δεδομένο τύπο χαρτογράφησης υφής. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Δημιουργεί ένα[`VertexElementUV`](../vertexelementuv/) με δεδομένο τύπο χαρτογράφησης υφής. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Λαμβάνει ένα στοιχείο κορυφής με καθορισμένο τύπο |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Παίρνει ένα[`VertexElementUV`](../vertexelementuv/) παράδειγμα με δεδομένο τύπο αντιστοίχισης υφής |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh/)() | Μετατρέψτε την επιφάνεια NURBS στο mesh |

### Δείτε επίσης

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
