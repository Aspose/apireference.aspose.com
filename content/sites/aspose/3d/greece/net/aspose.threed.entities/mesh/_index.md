---
title: Mesh
second_title: Aspose.3D για Αναφορά API .NET
description: Ένα πλέγμα αποτελείται από πολλά πολύγωνα nπλευρών.
type: docs
weight: 450
url: /el/net/aspose.threed.entities/mesh/
---
## Mesh class

Ένα πλέγμα αποτελείται από πολλά πολύγωνα n-πλευρών.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Mesh](mesh/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Mesh` τάξη. |
| [Mesh](mesh/#constructor_1)(Bitmap) | Κατασκευάστε ένα πλέγμα χρησιμοποιώντας καθορισμένο χάρτη ύψους, εάν η μορφή pixel του χάρτη ύψους περιέχει πολλά στοιχεία, το πρώτο (συνήθως το κόκκινο) στοιχείο θα χρησιμοποιηθεί ως τιμή ύψους(z) Τα στοιχεία x και y του σημείου ελέγχου είναι κανονικοποιημένες συντεταγμένες pixel . |
| [Mesh](mesh/#constructor_4)(string) | Αρχικοποιεί μια νέα παρουσία του`Mesh` τάξη. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | Κατασκευάστε ένα πλέγμα χρησιμοποιώντας καθορισμένο χάρτη ύψους, εάν η μορφή pixel του χάρτη ύψους περιέχει πολλά στοιχεία, το πρώτο (συνήθως το κόκκινο) στοιχείο θα χρησιμοποιηθεί ως τιμή ύψους(z) Τα στοιχεία x και y του σημείου ελέγχου είναι κανονικοποιημένες συντεταγμένες pixel . |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | Κατασκευάστε ένα πλέγμα χρησιμοποιώντας καθορισμένο χάρτη ύψους, εάν η μορφή pixel του χάρτη ύψους περιέχει πολλά στοιχεία, το πρώτο (συνήθως το κόκκινο) στοιχείο θα χρησιμοποιηθεί ως τιμή ύψους(z) Τα στοιχεία x και y του σημείου ελέγχου είναι κανονικοποιημένες συντεταγμένες pixel . |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να δημιουργήσει σκιά |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Λαμβάνει όλα τα σημεία ελέγχου |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Λαμβάνει όλους τους παραμορφωτές που σχετίζονται με αυτήν τη γεωμετρία. |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | Παίρνει τις άκρες του Mesh. Το Edge είναι προαιρετικό σε mesh, επομένως μπορεί να είναι κενό. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | Λαμβάνει τον αριθμό των πολυγώνων |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | Λαμβάνει τον ορισμό των πολυγώνων του πλέγματος |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να λάβει σκιά. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | Δημιουργεί ένα νέο πολύγωνο με όλες τις κορυφές που ορίζονται σε*indices* . Για να δημιουργήσετε κορυφή πολυγώνου προς κορυφή, χρησιμοποιήστε[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | Δημιουργήστε ένα πολύγωνο με 3 κορυφές(τρίγωνο) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | Δημιουργεί ένα νέο πολύγωνο με όλες τις κορυφές που ορίζονται σε*indices* . Για να δημιουργήσετε κορυφή πολυγώνου προς κορυφή, χρησιμοποιήστε[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | Δημιουργήστε ένα πολύγωνο με 4 κορυφές (τετράγωνη) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Λαμβάνει ένα στοιχείο κορυφής με καθορισμένο τύπο |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | Παίρνει τον απαριθμητή για κάθε εσωτερικό πολύγωνο. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | Λαμβάνει τον αριθμό κορυφών του καθορισμένου πολυγώνου. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Παίρνει ένα[`VertexElementUV`](../vertexelementuv/) παράδειγμα με δεδομένο τύπο αντιστοίχισης υφής |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | Λαμβάνει την παρουσία Mesh από την τρέχουσα οντότητα. |

### Παραδείγματα

Για να προσθέσετε ένα πολύγωνο σε πλέγμα: Ταξίδι σε όλα τα πολύγωνα σε πλέγμα:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //ασχολείται με το πολύγωνο
}
```

### Δείτε επίσης

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
