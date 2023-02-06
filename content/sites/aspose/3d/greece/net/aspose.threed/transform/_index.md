---
title: Transform
second_title: Aspose.3D για Αναφορά API .NET
description: Ένας μετασχηματισμός περιέχει πληροφορίες που επιτρέπουν την πρόσβαση στη μήτρα μετάφρασης/κλίμακας/περιστροφής ή μετασχηματισμού αντικειμένου με ελάχιστο κόστος Αυτό χρησιμοποιείται από τον τοπικό μετασχηματισμό.
type: docs
weight: 2400
url: /el/net/aspose.threed/transform/
---
## Transform class

Ένας μετασχηματισμός περιέχει πληροφορίες που επιτρέπουν την πρόσβαση στη μήτρα μετάφρασης/κλίμακας/περιστροφής ή μετασχηματισμού αντικειμένου με ελάχιστο κόστος Αυτό χρησιμοποιείται από τον τοπικό μετασχηματισμό.

```csharp
public class Transform : A3DObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles/) { get; set; } | Λαμβάνει ή ορίζει την περιστροφή που αντιπροσωπεύεται σε γωνίες Euler, μετρημένη σε μοίρες |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation/) { get; set; } | Λαμβάνει ή ορίζει τη γεωμετρική περιστροφή του Euler (μετρούμενη σε μοίρες). Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling/) { get; set; } | Λαμβάνει ή ορίζει τη γεωμετρική κλίμακα. Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation/) { get; set; } | Λαμβάνει ή ορίζει τη γεωμετρική μετάφραση. Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Παίρνει ή ορίζει το όνομα. |
| [PostRotation](../../aspose.threed/transform/postrotation/) { get; set; } | Λαμβάνει ή ορίζει τη μετα-περιστροφή που αντιπροσωπεύεται σε βαθμό |
| [PreRotation](../../aspose.threed/transform/prerotation/) { get; set; } | Λαμβάνει ή ορίζει την προ-περιστροφή που αντιπροσωπεύεται σε βαθμό |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Λαμβάνει τη συλλογή όλων των ιδιοτήτων. |
| [Rotation](../../aspose.threed/transform/rotation/) { get; set; } | Λαμβάνει ή ορίζει την περιστροφή που αντιπροσωπεύεται στο τεταρτοταγές. |
| [Scale](../../aspose.threed/transform/scale/) { get; set; } | Λαμβάνει ή ορίζει την κλίμακα |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix/) { get; set; } | Λαμβάνει ή ορίζει τον πίνακα μετασχηματισμού. |
| [Translation](../../aspose.threed/transform/translation/) { get; set; } | Λαμβάνει ή ορίζει τη μετάφραση |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Βρίσκει την ιδιότητα. Μπορεί να είναι μια δυναμική ιδιότητα (Δημιουργήθηκε από CreateDynamicProperty/SetProperty) ή εγγενής ιδιότητα (Αναγνωρίζεται από το όνομά της) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Λάβετε την τιμή της καθορισμένης ιδιότητας |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Καταργεί μια δυναμική ιδιότητα. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Καταργήστε την καθορισμένη ιδιότητα που προσδιορίζεται με όνομα |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles/)(double, double, double) | Ορίζει τις γωνίες Euler σε μοίρες μετασχηματισμού ρεύματος. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation/)(double, double, double) | Ορίζει τη γεωμετρική περιστροφή του Euler (μετρούμενη σε μοίρες). Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling/)(double, double, double) | Ορίζει τη γεωμετρική κλίμακα. Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation/)(double, double, double) | Ορίζει τη γεωμετρική μετάφραση. Ο γεωμετρικός μετασχηματισμός επηρεάζει μόνο τις συνημμένες οντότητες και αφήνει ανεπηρέαστους τους θυγατρικούς κόμβους. Θα συγχωνευθεί ως τοπικός μετασχηματισμός όταν εξάγετε τον γεωμετρικό μετασχηματισμό σε τύπους αρχείων που δεν τον υποστηρίζουν. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation/)(double, double, double) | Ορίζει τη μετα-περιστροφή που αντιπροσωπεύεται σε βαθμό |
| [SetPreRotation](../../aspose.threed/transform/setprerotation/)(double, double, double) | Ορίζει την προ-περιστροφή που αντιπροσωπεύεται σε βαθμό |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Ορίζει την τιμή της καθορισμένης ιδιότητας |
| [SetRotation](../../aspose.threed/transform/setrotation/)(double, double, double, double) | Ορίζει την περιστροφή (ως συνιστώσες τεταρτοταγούς) του μετασχηματισμού ρεύματος. |
| [SetScale](../../aspose.threed/transform/setscale/)(double, double, double) | Ορίζει την κλίμακα του τρέχοντος μετασχηματισμού. |
| [SetTranslation](../../aspose.threed/transform/settranslation/)(double, double, double) | Ορίζει τη μετάφραση του τρέχοντος μετασχηματισμού. |

### Δείτε επίσης

* class [A3DObject](../a3dobject/)
* χώρος ονομάτων [Aspose.ThreeD](../../aspose.threed/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
