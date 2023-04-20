---
title: Class SVGTransform
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.DataTypes.SVGTransform τάξη. Το SVGTransform είναι η διεπαφή για έναν από τους μετασχηματισμούς στοιχείων σε μια SVGTransformList. Έτσι ένα αντικείμενο SVGTransform αντιστοιχεί σε ένα μεμονωμένο στοιχείο π.χ. scale ή matrix εντός μιας προδιαγραφής χαρακτηριστικών transform.
type: docs
weight: 320
url: /el/net/aspose.svg.datatypes/svgtransform/
---
## SVGTransform class

Το SVGTransform είναι η διεπαφή για έναν από τους μετασχηματισμούς στοιχείων σε μια SVGTransformList. Έτσι, ένα αντικείμενο SVGTransform αντιστοιχεί σε ένα μεμονωμένο στοιχείο (π.χ. «scale(…)» ή «matrix(…)») εντός μιας προδιαγραφής χαρακτηριστικών «transform».

```csharp
public class SVGTransform : SVGValueType
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Angle](../../aspose.svg.datatypes/svgtransform/angle/) { get; } | Ένα χαρακτηριστικό ευκολίας για τα SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX και SVG_TRANSFORM_SKEWY. Διατηρεί τη γωνία που καθορίστηκε. Για SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE και SVG_TRANSFORM_SCALE, η γωνία θα είναι μηδέν. |
| [Matrix](../../aspose.svg.datatypes/svgtransform/matrix/) { get; } | Ο πίνακας που αντιπροσωπεύει αυτόν τον μετασχηματισμό. Το αντικείμενο μήτρας είναι ζωντανό, πράγμα που σημαίνει ότι τυχόν αλλαγές που γίνονται στο αντικείμενο SVGTransform αντικατοπτρίζονται αμέσως στο αντικείμενο μήτρας και αντίστροφα. Σε περίπτωση που το αντικείμενο του πίνακα αλλάζει απευθείας (δηλαδή, χωρίς τη χρήση των μεθόδων στην ίδια τη διεπαφή SVGTransform), τότε ο τύπος του SVGTransform αλλάζει σε SVG_TRANSFORM_MATRIX. Για SVG_TRANSFORM_MATRIX, ο πίνακας περιέχει τα a, b, c, d, e, f Οι τιμές που παρέχονται από τον χρήστη. Για SVG_TRANSFORM_TRANSLATE, τα e και f αντιπροσωπεύουν τα ποσά μετάφρασης(a= 1, b= 0, c= 0 και d = 1). Για SVG_TRANSFORM_SCALE, τα a και d αντιπροσωπεύουν τα ποσά της κλίμακας(b=0 , c= 0, e= 0 και f = 0). Για SVG_TRANSFORM_SKEWX και SVG_TRANSFORM_SKEWY, τα a, b, c και d αντιπροσωπεύουν τον πίνακα που θα έχει ως αποτέλεσμα τη δεδομένη λοξή(e= 0 και f = 0). Για SVG_TRANSFORM_ROT_ , a, b, c, d, e και f μαζί αντιπροσωπεύουν τον πίνακα που θα έχει ως αποτέλεσμα τη δεδομένη περιστροφή. Όταν η περιστροφή είναι γύρω από το κεντρικό σημείο (0, 0), τα e και f θα είναι μηδέν. |
| [Type](../../aspose.svg.datatypes/svgtransform/type/) { get; } | Ο τύπος της τιμής όπως καθορίζεται από μία από τις σταθερές SVG_TRANSFORM_* που ορίζονται σε αυτήν τη διεπαφή. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Απελευθερώνει μη διαχειριζόμενους και - προαιρετικά - διαχειριζόμενους πόρους. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| [SetMatrix](../../aspose.svg.datatypes/svgtransform/setmatrix/)(SVGMatrix) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_MATRIX, με τον πίνακα παραμέτρων να ορίζει τον νέο μετασχηματισμό. Οι τιμές από τον πίνακα παραμέτρων αντιγράφονται, η παράμετρος του πίνακα δεν αντικαθιστά το SVGTransform::matrix. |
| [SetRotate](../../aspose.svg.datatypes/svgtransform/setrotate/)(float, float, float) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_ROTATE, με τη γωνία παραμέτρου να ορίζει τη γωνία περιστροφής και τις παραμέτρους cx και cy να ορίζουν το προαιρετικό κέντρο περιστροφής. |
| [SetScale](../../aspose.svg.datatypes/svgtransform/setscale/)(float, float) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_SCALE, με τις παραμέτρους sx και sy να ορίζουν τα ποσά της κλίμακας. |
| [SetSkewX](../../aspose.svg.datatypes/svgtransform/setskewx/)(float) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_SKEWX, με γωνία παραμέτρου που καθορίζει το μέγεθος της λοξής. |
| [SetSkewY](../../aspose.svg.datatypes/svgtransform/setskewy/)(float) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_SKEWY, με γωνία παραμέτρου που καθορίζει το μέγεθος της λοξής. |
| [SetTranslate](../../aspose.svg.datatypes/svgtransform/settranslate/)(float, float) | Ορίζει τον τύπο μετασχηματισμού σε SVG_TRANSFORM_TRANSLATE, με τις παραμέτρους tx και ty να ορίζουν τα ποσά μετάφρασης. |
| override [ToString](../../aspose.svg.datatypes/svgtransform/tostring/)() | Επιστρέφει αString που αντιπροσωπεύει αυτήν την περίπτωση. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [SVG_TRANSFORM_MATRIX](../../aspose.svg.datatypes/svgtransform/svg_transform_matrix/) | Ένας μετασχηματισμός «matrix(…)». |
| const [SVG_TRANSFORM_ROTATE](../../aspose.svg.datatypes/svgtransform/svg_transform_rotate/) | Ένας μετασχηματισμός 'rotate(…)'. |
| const [SVG_TRANSFORM_SCALE](../../aspose.svg.datatypes/svgtransform/svg_transform_scale/) | Ένας μετασχηματισμός «κλίμακα(…)». |
| const [SVG_TRANSFORM_SKEWX](../../aspose.svg.datatypes/svgtransform/svg_transform_skewx/) | Ένας μετασχηματισμός 'skewX(…)'. |
| const [SVG_TRANSFORM_SKEWY](../../aspose.svg.datatypes/svgtransform/svg_transform_skewy/) | Ένας μετασχηματισμός 'skewY(…)'. |
| const [SVG_TRANSFORM_TRANSLATE](../../aspose.svg.datatypes/svgtransform/svg_transform_translate/) | Ένας μετασχηματισμός 'translate(…)'. |
| const [SVG_TRANSFORM_UNKNOWN](../../aspose.svg.datatypes/svgtransform/svg_transform_unknown/) | Ο τύπος μονάδας δεν είναι ένας από τους προκαθορισμένους τύπους. Δεν είναι έγκυρο να επιχειρήσετε να ορίσετε μια νέα τιμή αυτού του τύπου ή να προσπαθήσετε να αλλάξετε μια υπάρχουσα τιμή σε αυτόν τον τύπο. |

### Δείτε επίσης

* class [SVGValueType](../svgvaluetype/)
* χώρος ονομάτων [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* συνέλευση [Aspose.SVG](../../)


