---
title: Scene
second_title: Aspose.3D για Αναφορά API .NET
description: Μια σκηνή είναι ένα αντικείμενο ανώτατου επιπέδου που περιέχει τους κόμβους τις γεωμετρίες τα υλικά τις υφές τα κινούμενα σχέδια τις πόζες τις δευτερεύουσες σκηνές κ.λπ. Η /fbx ιεραρχία κόμβων είναι προσβάσιμη μέσωRootNode./scene/rootnode/Library./scene/library/ χρησιμοποιείται για τη διατήρηση μιας αναφοράς μη συνδεδεμένων αντικειμένων κατά τη σειριοποίηση όπως μεταδεδομένα ή προσαρμοσμένα αντικείμενα ώστε να μπορεί να χρησιμοποιηθεί ως βιβλιοθήκη.
type: docs
weight: 2250
url: /el/net/aspose.threed/scene/
---
## Scene class

Μια σκηνή είναι ένα αντικείμενο ανώτατου επιπέδου που περιέχει τους κόμβους, τις γεωμετρίες, τα υλικά, τις υφές, τα κινούμενα σχέδια, τις πόζες, τις δευτερεύουσες σκηνές κ.λπ. Η /fbx ιεραρχία κόμβων είναι προσβάσιμη μέσω[`RootNode`](./rootnode/)[`Library`](./library/) χρησιμοποιείται για τη διατήρηση μιας αναφοράς μη συνδεδεμένων αντικειμένων κατά τη σειριοποίηση (όπως μεταδεδομένα ή προσαρμοσμένα αντικείμενα), ώστε να μπορεί να χρησιμοποιηθεί ως βιβλιοθήκη.

```csharp
public class Scene : SceneObject
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Scene](scene/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Scene` τάξη. |
| [Scene](scene/#constructor_1)(Entity) | Αρχικοποιεί μια νέα παρουσία του`Scene` κλάση με μια οντότητα συνδεδεμένη σε έναν νέο κόμβο. |
| [Scene](scene/#constructor_2)(Scene, string) | Αρχικοποιεί μια νέα παρουσία του`Scene`τάξη ως δευτερεύουσα σκηνή. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | Λαμβάνει όλα[`AnimationClip`](../../aspose.threed.animation/animationclip/) ορίζεται στη σκηνή. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | Λαμβάνει ή ορίζει τις πληροφορίες στοιχείων ανώτατου επιπέδου |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | Λαμβάνει ή ορίζει το ενεργό[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | Αντικείμενα που δεν χρησιμοποιούνται απευθείας στην ιεραρχία σκηνών μπορούν να οριστούν στη Βιβλιοθήκη. Αυτό είναι χρήσιμο όταν χρησιμοποιείτε δευτερεύουσες σκηνές και τοποθετείτε επαναχρησιμοποιήσιμα στοιχεία κάτω από υποσκηνές. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [Poses](../../aspose.threed/scene/poses/) { get; } | Λαμβάνει όλα[`Pose`](../pose/) χρησιμοποιείται σε αυτή τη σκηνή. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | Λαμβάνει τον ριζικό κόμβο της σκηνής. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Λαμβάνει τη σκηνή ότι αυτό το αντικείμενο ανήκει στο |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | Λαμβάνει όλες τις δευτερεύουσες σκηνές |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή χρησιμοποιώντας καθορισμένη διαμόρφωση IO. |
| [Clear](../../aspose.threed/scene/clear/)() | Διαγράφει το περιεχόμενο της σκηνής και επαναφέρει τις προεπιλεγμένες ρυθμίσεις. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | Μια συνάρτηση στενογραφίας για τη δημιουργία και την καταχώρηση του[`AnimationClip`](../../aspose.threed.animation/animationclip/) Το πρώτο[`AnimationClip`](../../aspose.threed.animation/animationclip/) θα ανατεθεί στο[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | Παίρνει ένα όνομα[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | Ανοίγει τη σκηνή από τη δεδομένη ροή |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη ροή χρησιμοποιώντας καθορισμένη διαμόρφωση IO. |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | Ανοίγει τη σκηνή από τη δεδομένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | Αποδώστε τη σκηνή σε bitmap από την οπτική γωνία της συγκεκριμένης κάμερας. |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | Αποδώστε τη σκηνή σε εξωτερικό αρχείο από την οπτική γωνία της συγκεκριμένης κάμερας. Το προεπιλεγμένο μέγεθος εξόδου είναι 1024x768 και η μορφή εξόδου είναι png |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | Αποδώστε τη σκηνή σε bitmap από την οπτική γωνία της συγκεκριμένης κάμερας. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | Αποδώστε τη σκηνή σε εξωτερικό αρχείο από την οπτική γωνία της συγκεκριμένης κάμερας. |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Αποδώστε τη σκηνή σε εξωτερικό αρχείο από την οπτική γωνία της συγκεκριμένης κάμερας. |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | Αποθηκεύει τη σκηνή σε καθορισμένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | Αποθηκεύει τη σκηνή σε ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | Αποθηκεύει τη σκηνή σε ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | Αποθηκεύει τη σκηνή σε καθορισμένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | Αποθηκεύει τη σκηνή σε καθορισμένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | Αποθηκεύει τη σκηνή σε ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | Αποθηκεύει τη σκηνή σε ροή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | Αποθηκεύει τη σκηνή σε καθορισμένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | Αποθηκεύει τη σκηνή σε καθορισμένη διαδρομή χρησιμοποιώντας καθορισμένη μορφή αρχείου. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |

### Δείτε επίσης

* class [SceneObject](../sceneobject/)
* χώρος ονομάτων [Aspose.ThreeD](../../aspose.threed/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
