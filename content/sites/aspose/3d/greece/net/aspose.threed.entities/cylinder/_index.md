---
title: Cylinder
second_title: Aspose.3D για Αναφορά API .NET
description: Παραμετροποιημένος κύλινδρος. Μπορεί επίσης να χρησιμοποιηθεί για την αναπαράσταση του κώνου όταν ένα από τα radiusTop/radiusBottom είναι μηδέν.
type: docs
weight: 310
url: /el/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Παραμετροποιημένος κύλινδρος. Μπορεί επίσης να χρησιμοποιηθεί για την αναπαράσταση του κώνου όταν ένα από τα radiusTop/radiusBottom είναι μηδέν.

```csharp
public class Cylinder : Primitive
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Cylinder](cylinder/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Cylinder` τάξη. |
| [Cylinder](cylinder/#constructor_1)(double, double) | Αρχικοποιεί μια νέα παρουσία του`Cylinder` τάξη. |
| [Cylinder](cylinder/#constructor_2)(double, double, double) | Αρχικοποιεί μια νέα παρουσία του`Cylinder` τάξη. |
| [Cylinder](cylinder/#constructor_3)(double, double, double, int, int, bool) | Αρχικοποιεί μια νέα παρουσία του`Cylinder` τάξη. |
| [Cylinder](cylinder/#constructor_4)(string, double, double, double, int, int, bool, double, double) | Αρχικοποιεί μια νέα παρουσία του`Cylinder` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να δημιουργήσει σκιά |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder/) { get; set; } | Λαμβάνει ή ρυθμίζει εάν θα δημιουργηθεί ο κύλινδρος τύπου ανεμιστήρα όταν το ThetaLength είναι μικρότερο από 2*PI, διαφορετικά το μοντέλο δεν θα κοπεί. |
| [Height](../../aspose.threed.entities/cylinder/height/) { get; set; } | Παίρνει ή ρυθμίζει το ύψος του κυλίνδρου. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments/) { get; set; } | Λαμβάνει ή ορίζει τα τμήματα ύψους. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom/) { get; set; } | Λαμβάνει ή ορίζει τη μετατόπιση μετασχηματισμού κορυφών της κάτω πλευράς. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop/) { get; set; } | Λαμβάνει ή ορίζει τη μετατόπιση μετασχηματισμού κορυφών της επάνω πλευράς. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended/) { get; set; } | Λαμβάνει ή ορίζει μια τιμή που υποδεικνύει εάν αυτό`Cylinder` open ended. Η προεπιλεγμένη τιμή είναι false. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments/) { get; set; } | Λαμβάνει ή ορίζει τα ακτινικά τμήματα. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom/) { get; set; } | Λαμβάνει ή ρυθμίζει την ακτίνα του κάτω καλύμματος του κυλίνδρου. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop/) { get; set; } | Λαμβάνει ή ρυθμίζει την ακτίνα του άνω καλύμματος του κυλίνδρου. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Λαμβάνει ή ορίζει εάν αυτή η γεωμετρία μπορεί να λάβει σκιά. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom/) { get; set; } | Λαμβάνει ή συνθέτει τον μετασχηματισμό διάτμησης της κάτω πλευράς, το διάνυσμα αποθηκεύει την τιμή διάτμησης (άξονας x, άξονας z) που μετράται σε ακτίνιο, η προεπιλεγμένη τιμή είναι (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop/) { get; set; } | Λαμβάνει ή συνθέτει τον μετασχηματισμό διάτμησης της επάνω πλευράς, το διάνυσμα αποθηκεύει την τιμή διάτμησης (άξονας x, άξονας z) που μετράται σε ακτίνιο, η προεπιλεγμένη τιμή είναι (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength/) { get; set; } | Λαμβάνει ή ορίζει το μήκος του θήτα. Η προεπιλεγμένη τιμή είναι 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart/) { get; set; } | Λαμβάνει ή ορίζει την έναρξη θήτα. Η προεπιλεγμένη τιμή είναι 0. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh/)() | Μετατροπή τρέχοντος αντικειμένου σε mesh |

### Δείτε επίσης

* class [Primitive](../primitive/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
