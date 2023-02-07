---
title: Camera
second_title: Aspose.3D για Αναφορά API .NET
description: Η κάμερα περιγράφει την οπτική γωνία του θεατή που κοιτάζει τη σκηνή.
type: docs
weight: 250
url: /el/net/aspose.threed.entities/camera/
---
## Camera class

Η κάμερα περιγράφει την οπτική γωνία του θεατή που κοιτάζει τη σκηνή.

```csharp
public class Camera : Frustum
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Camera](camera/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Camera` τάξη. |
| [Camera](camera/#constructor_1)(ProjectionType) | Αρχικοποιεί μια νέα παρουσία του`Camera` τάξη. |
| [Camera](camera/#constructor_2)(string) | Αρχικοποιεί μια νέα παρουσία του`Camera` τάξη. |
| [Camera](camera/#constructor_3)(string, ProjectionType) | Αρχικοποιεί μια νέα παρουσία του`Camera` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode/) { get; set; } | Λαμβάνει ή ρυθμίζει τη λειτουργία διαφράγματος της κάμερας |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Λαμβάνει ή ορίζει την αναλογία διαστάσεων του frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio/) { get; set; } | Λαμβάνει ή ορίζει την αναλογία διαστάσεων επιπέδου προβολής. |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Λαμβάνει ή ορίζει την κατεύθυνση προς την οποία κοιτάζει η κάμερα. Οι αλλαγές σε αυτήν την ιδιότητα θα επηρεάσουν επίσης την[`LookAt`](../frustum/lookat/) και[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Λαμβάνει ή ορίζει εάν θα εξαιρεθεί αυτή η οντότητα κατά την εξαγωγή. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Λαμβάνει ή καθορίζει το μακρινό επίπεδο απόστασης του frustum. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview/) { get; set; } | Λαμβάνει ή ρυθμίζει το οπτικό πεδίο της κάμερας σε μοίρες, αυτή η ιδιότητα χρησιμοποιείται μόνο όταν το ApertureMode είναιHorizontal ήVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx/) { get; set; } | Λαμβάνει ή ρυθμίζει το οριζόντιο οπτικό πεδίο της κάμερας σε μοίρες, αυτή η ιδιότητα χρησιμοποιείται μόνο όταν το ApertureMode είναιHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy/) { get; set; } | Λαμβάνει ή ρυθμίζει το κατακόρυφο οπτικό πεδίο της κάμερας σε μοίρες, αυτή η ιδιότητα χρησιμοποιείται μόνο όταν το ApertureMode είναιHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height/) { get; set; } | Λαμβάνει ή ορίζει το ύψος του επιπέδου προβολής μετρημένο σε ίντσες |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Λαμβάνει ή ορίζει την ενδιαφέρουσα θέση που κοιτάζει η κάμερα. |
| [Magnification](../../aspose.threed.entities/camera/magnification/) { get; set; } | Λαμβάνει ή ρυθμίζει τη μεγέθυνση που χρησιμοποιείται στην ορθογραφική κάμερα |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Λαμβάνει ή ρυθμίζει την κοντινή απόσταση του frustum. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Λαμβάνει ή ρυθμίζει το ύψος όταν το frustum στην ορθογραφική προβολή. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Λαμβάνει ή ορίζει τον πρώτο γονικό κόμβο, εάν οριστεί ο πρώτος γονικός κόμβος, αυτή η οντότητα θα αποσπαστεί από άλλους γονικούς κόμβους. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Λαμβάνει όλους τους γονικούς κόμβους, μια οντότητα μπορεί να προσαρτηθεί σε πολλούς γονικούς κόμβους για γεωμετρία instancing |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype/) { get; set; } | Λαμβάνει ή ορίζει τον τύπο προβολής της κάμερας. Από προεπιλογή χρησιμοποιείται η προοπτική προβολή. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Λαμβάνει ή ορίζει τη λειτουργία προσανατολισμού του frustum Αυτή η ιδιότητα λειτουργεί μόνο όταν[`Target`](../frustum/target/) είναι null. Εάν η τιμή είναιFixedTarget , η κατεύθυνση υπολογίζεται πάντα από το ακίνητο[`LookAt`](../frustum/lookat/) Διαφορετικά το[`LookAt`](../frustum/lookat/)υπολογίζεται πάντα από το[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Λαμβάνει ή ορίζει τον στόχο που κοιτάζει η κάμερα. Εάν ο χρήστης υποστηρίζει αυτήν την ιδιότητα, θα πρέπει να είναι πριν από[`LookAt`](../frustum/lookat/) ιδιοκτησία. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Λαμβάνει ή ρυθμίζει την κατεύθυνση επάνω της κάμερας |
| [Width](../../aspose.threed.entities/camera/width/) { get; set; } | Λαμβάνει ή ορίζει το πλάτος του επιπέδου προβολής μετρημένο σε ίντσες |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Λαμβάνει το πλαίσιο οριοθέτησης της τρέχουσας οντότητας στο σύστημα συντεταγμένων του χώρου αντικειμένου. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Παίρνει το κλειδί του προγράμματος απόδοσης οντοτήτων που είναι καταχωρημένο στο πρόγραμμα απόδοσης |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [MoveForward](../../aspose.threed.entities/camera/moveforward/)(double) | Μετακινήστε την κάμερα προς τα εμπρός προς την κατεύθυνση ή τον στόχο της. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |

### Δείτε επίσης

* class [Frustum](../frustum/)
* χώρος ονομάτων [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
