---
title: Class SVGAngle
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.DataTypes.SVGAngle τάξη. Η διεπαφή SVGAngle αντιστοιχεί στον βασικό τύπο δεδομένων γωνίας.
type: docs
weight: 80
url: /el/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

Η διεπαφή SVGAngle αντιστοιχεί στον βασικό τύπο δεδομένων γωνίας.

```csharp
public class SVGAngle : SVGValueType
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | Ο τύπος της τιμής όπως καθορίζεται από μία από τις σταθερές SVG_ANGLETYPE_* που ορίζονται σε αυτήν τη διεπαφή. |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | Η τιμή της γωνίας ως τιμή κινητής υποδιαστολής, σε μοίρες. Η ρύθμιση αυτού του χαρακτηριστικού θα προκαλέσει την αυτόματη ενημέρωση των valueInSpecifiedUnits και valueAsString ώστε να αντικατοπτρίζει αυτήν τη ρύθμιση. |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | Η τιμή της γωνίας ως τιμή συμβολοσειράς, στις μονάδες που εκφράζονται με unitType. Η ρύθμιση αυτού του χαρακτηριστικού θα προκαλέσει την αυτόματη ενημέρωση των τιμών, valueInSpecifiedUnits και unitType ώστε να αντικατοπτρίζει αυτήν τη ρύθμιση. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | Η τιμή της γωνίας ως τιμή κινητής υποδιαστολής, στις μονάδες που εκφράζονται με unitType. Η ρύθμιση αυτού του χαρακτηριστικού θα προκαλέσει την αυτόματη ενημέρωση της τιμής και του valueAsString ώστε να αντικατοπτρίζει αυτήν τη ρύθμιση. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | Διατηρήστε την ίδια υποκείμενη αποθηκευμένη τιμή, αλλά επαναφέρετε το αναγνωριστικό αποθηκευμένης μονάδας στο δεδομένο unitType. Χαρακτηριστικά αντικειμένου unitType, valueInSpecifiedUnits και valueAsString ενδέχεται να τροποποιηθούν ως αποτέλεσμα αυτής της μεθόδου. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Απελευθερώνει μη διαχειριζόμενους και - προαιρετικά - διαχειριζόμενους πόρους. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | Επαναφέρετε την τιμή ως αριθμό με ένα συσχετισμένο unitType, αντικαθιστώντας έτσι τις τιμές για όλα τα χαρακτηριστικά του αντικειμένου. |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | Επιστρέφει αString που αντιπροσωπεύει αυτήν την περίπτωση. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | Ο τύπος μονάδας ορίστηκε ρητά σε μοίρες. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | Ο τύπος μονάδας είναι ακτίνια. |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | Ο τύπος μονάδας είναι ακτίνια. |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | Ο τύπος μονάδας δεν είναι ένας από τους προκαθορισμένους τύπους μονάδας. Δεν είναι έγκυρο να επιχειρήσετε να ορίσετε μια νέα τιμή αυτού του τύπου ή να προσπαθήσετε να αλλάξετε μια υπάρχουσα τιμή σε αυτόν τον τύπο. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | Δεν δόθηκε τύπος μονάδας (δηλαδή, καθορίστηκε τιμή χωρίς μονάδα). Για γωνίες, μια τιμή χωρίς μονάδα αντιμετωπίζεται με τον ίδιο τρόπο όπως αν είχαν καθοριστεί μοίρες. |

### Δείτε επίσης

* class [SVGValueType](../svgvaluetype/)
* χώρος ονομάτων [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* συνέλευση [Aspose.SVG](../../)


