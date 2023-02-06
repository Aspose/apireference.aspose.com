---
title: TriMeshT
second_title: Aspose.3D για Αναφορά API .NET
description: Γενική έκδοση τουTriMesh./trimesh/ για στατικά καθορισμένη κορυφή του χρήστη type
type: docs
weight: 740
url: /el/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Γενική έκδοση του[`TriMesh`](../trimesh/) για στατικά καθορισμένη κορυφή του χρήστη type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| T |  |

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [TriMesh](trimesh/)(string) | Αρχικοποίηση μιας παρουσίας του[`TriMesh`](../trimesh/) |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | Η χωρητικότητα των προκατανεμημένων κορυφών. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | Το πλήθος των δεικτών σε αυτό[`TriMesh`](../trimesh/) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | Το πλήθος των μη συγχωνευμένων κορυφών που πέρασαν[`BeginVertex`](../trimesh/beginvertex/) και[`EndVertex`](../trimesh/endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | Η διάταξη κορυφής του[`TriMesh`](../trimesh/) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | Το πλήθος των κορυφών σε αυτό[`TriMesh`](../trimesh/) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | Το συνολικό μέγεθος όλων των κορυφών σε bytes |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh-1/frommesh/)(Mesh) | Δημιουργήστε ένα TriMesh από δεδομένο αντικείμενο mesh με διάταξη κορυφής που δημιουργείται αυτόματα. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | Αρχίστε να προσθέτετε vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | Τέλος προσθήκης vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | Πάρτε τον απαριθμητή για απαρίθμηση[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | Φόρτωση κορυφών από byte, το μήκος των byte πρέπει να είναι ακέραιο πολλαπλάσιο του μεγέθους κορυφής. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | Διαβάστε το διπλό πεδίο |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | Διαβάστε το πεδίο float |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | Διαβάστε το πεδίο του διανύσματος2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | Διαβάστε το πεδίο του διανύσματος3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | Διαβάστε το πεδίο vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | Διαβάστε το πεδίο του διανύσματος2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | Διαβάστε το πεδίο του διανύσματος3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | Διαβάστε το πεδίο vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | Λαμβάνει την παράσταση συμβολοσειράς του[`TriMesh`](../trimesh/) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | Μετατροπή των δεδομένων κορυφών σε byte array |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh-1/verticestotypedarray/)() | Μετατροπή των δεδομένων κορυφών σε πληκτρολογημένο πίνακα |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | Γράψτε τα δεδομένα των δεικτών ως ακέραιο αριθμό 16 bit στη ροή |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | Γράψτε τα δεδομένα των δεικτών ως ακέραιος αριθμός 32 bit στη ροή |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | Εγγραφή δεδομένων κορυφών στην καθορισμένη ροή |

### Δείτε επίσης

* class [TriMesh](../trimesh/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
