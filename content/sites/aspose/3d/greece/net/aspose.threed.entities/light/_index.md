---
title: Light
second_title: Aspose.3D για Αναφορά API .NET
description: Το φως φωτίζει τη σκηνή.
type: docs
weight: 400
url: /el/net/aspose.threed.entities/light/
---
## Light class

Το φως φωτίζει τη σκηνή.

Ο τύπος για τον υπολογισμό της συνολικής εξασθένησης του φωτός είναι: `A = ConstantAttenuation + (Dist * LinearAttenuation) + ((Dist^2) * QuadraticAttenuation)`

```csharp
public class Light : Frustum
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Light](light/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Light` τάξη. |
| [Light](light/#constructor_1)(string) | Αρχικοποιεί μια νέα παρουσία του`Light` τάξη. |
| [Light](light/#constructor_2)(string, LightType) | Αρχικοποιεί μια νέα παρουσία του`Light` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Λαμβάνει ή ορίζει την αναλογία διαστάσεων του frustum |
| [CastLight](../../aspose.threed.entities/light/castlight/) { get; set; } | Λαμβάνει ή ορίζει εάν η τρέχουσα παρουσία φωτός μπορεί να φωτίσει άλλα αντικείμενα. |
| [CastShadows](../../aspose.threed.entities/light/castshadows/) { get; set; } | Λαμβάνει ή ρυθμίζει εάν το φως μπορεί να ρίξει σκιές σε άλλα αντικείμενα. |
| [Color](../../aspose.threed.entities/light/color/) { get; set; } | Παίρνει ή ρυθμίζει το χρώμα του φωτός |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation/) { get; set; } | Λαμβάνει ή ορίζει τη σταθερή εξασθένηση για να υπολογίσει τη συνολική εξασθένηση του φωτός |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Λαμβάνει ή ορίζει την κατεύθυνση προς την οποία κοιτάζει η κάμερα. Οι αλλαγές σε αυτήν την ιδιότητα θα επηρεάσουν επίσης την[`LookAt`](../frustum/lookat/) και[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| [Falloff](../../aspose.threed.entities/light/falloff/) { get; set; } | Λαμβάνει ή ρυθμίζει τη γωνία του κώνου πτώσης (σε μοίρες). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Λαμβάνει ή καθορίζει το μακρινό επίπεδο απόστασης του frustum. |
| [HotSpot](../../aspose.threed.entities/light/hotspot/) { get; set; } | Λαμβάνει ή ρυθμίζει τη γωνία κώνου του hot spot (σε μοίρες). |
| [Intensity](../../aspose.threed.entities/light/intensity/) { get; set; } | Λαμβάνει ή ρυθμίζει την ένταση του φωτός, η προεπιλεγμένη τιμή είναι 100 |
| [LightType](../../aspose.threed.entities/light/lighttype/) { get; set; } | Λαμβάνει ή ρυθμίζει τον τύπο του φωτός |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation/) { get; set; } | Λαμβάνει ή ορίζει τη γραμμική εξασθένηση για να υπολογίσει τη συνολική εξασθένηση του φωτός |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Λαμβάνει ή ορίζει την ενδιαφέρουσα θέση που κοιτάζει η κάμερα. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Λαμβάνει ή ρυθμίζει την κοντινή απόσταση του frustum. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Λαμβάνει ή ρυθμίζει το ύψος όταν το frustum στην ορθογραφική προβολή. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation/) { get; set; } | Λαμβάνει ή ορίζει την τετραγωνική εξασθένηση για τον υπολογισμό της συνολικής εξασθένησης του φωτός |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Λαμβάνει ή ορίζει τη λειτουργία προσανατολισμού του frustum Αυτή η ιδιότητα λειτουργεί μόνο όταν[`Target`](../frustum/target/) είναι null. Εάν η τιμή είναιFixedTarget , η κατεύθυνση υπολογίζεται πάντα από το ακίνητο[`LookAt`](../frustum/lookat/) Διαφορετικά το[`LookAt`](../frustum/lookat/)υπολογίζεται πάντα από το[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor/) { get; set; } | Παίρνει ή ρυθμίζει το χρώμα της σκιάς. |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Λαμβάνει ή ορίζει τον στόχο που κοιτάζει η κάμερα. Εάν ο χρήστης υποστηρίζει αυτήν την ιδιότητα, θα πρέπει να είναι πριν από[`LookAt`](../frustum/lookat/) ιδιοκτησία. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Λαμβάνει ή ρυθμίζει την κατεύθυνση επάνω της κάμερας |

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

### Δείτε επίσης

* class [Frustum](../frustum/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
