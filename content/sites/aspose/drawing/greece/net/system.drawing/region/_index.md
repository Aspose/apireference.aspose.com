---
title: Class Region
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Region τάξη. Περιγράφει το εσωτερικό ενός σχήματος γραφικών που αποτελείται από ορθογώνια και μονοπάτια. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 1060
url: /el/net/system.drawing/region/
---
## Region class

Περιγράφει το εσωτερικό ενός σχήματος γραφικών που αποτελείται από ορθογώνια και μονοπάτια. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class Region : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Region](region/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`Region` τάξη. |
| [Region](region/#constructor_1)(GraphicsPath) | Αρχικοποιεί μια νέα παρουσία του`Region` τάξη με τα καθορισμέναGraphicsPath . |
| [Region](region/#constructor_3)(Rectangle) | Αρχικοποιεί μια νέα παρουσία του`Region` τάξη από την καθορισμένηRectangle δομή. |
| [Region](region/#constructor_4)(RectangleF) | Αρχικοποιεί μια νέα παρουσία του`Region` τάξη από την καθορισμένηRectangleF δομή. |
| [Region](region/#constructor_2)(RegionData) | Αρχικοποιεί μια νέα παρουσία του`Region` κλάση από τα καθορισμένα δεδομένα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούRegion . |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | Ενημερώνει αυτόRegion να περιέχει το τμήμα του καθορισμένουGraphicsPath που το δεν τέμνεται με αυτόRegion . |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | Ενημερώνει αυτόRegion να περιέχει το τμήμα του καθορισμένουRectangle δομή που δεν τέμνεται με αυτόRegion . |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | Ενημερώνει αυτόRegion να περιέχει το τμήμα του καθορισμένουRectangleF δομή που δεν τέμνεται με αυτόRegion . |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | Ενημερώνει αυτόRegion να περιέχει το τμήμα του καθορισμένουRegionπου δεν τέμνεται με αυτόRegion . |
| [Dispose](../../system.drawing/region/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτόRegion . |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | Ελέγχει εάν το καθορισμένοRegion είναι πανομοιότυπο με αυτόRegion στην καθορισμένη επιφάνεια σχεδίασης. |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | Ενημερώνει αυτόRegion να περιέχει μόνο το τμήμα του εσωτερικού του που δεν τέμνεται με το που έχει καθοριστείGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | Ενημερώνει αυτόRegion να περιέχει μόνο το τμήμα του εσωτερικού του που δεν τέμνεται με το καθορισμένοRectangle δομή. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | Ενημερώνει αυτόRegion να περιέχει μόνο το τμήμα του εσωτερικού του που δεν τέμνεται με το που έχει καθοριστείRectangleF δομή. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | Ενημερώνει αυτόRegion να περιέχει μόνο το τμήμα του εσωτερικού του που δεν τέμνεται με το καθορισμένοRegion . |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | Παίρνει έναRectangleF δομή που αντιπροσωπεύει ένα ορθογώνιο που το οριοθετείRegion στην επιφάνεια σχεδίασης του αGraphics αντικείμενο. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | Επιστρέφει αRegionData που αντιπροσωπεύει τις πληροφορίες που το περιγράφουνRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | Επιστρέφει έναν πίνακα απόRectangleF δομές που προσεγγίζουν αυτόRegion μετά την εφαρμογή του καθορισμένου μετασχηματισμού πίνακα. |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | Ενημερώνει αυτόRegion στη διασταύρωση του εαυτού του με το καθορισμένοGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | Ενημερώνει αυτόRegion στη διασταύρωση του εαυτού του με το καθορισμένοRectangle δομή. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | Ενημερώνει αυτόRegion στη διασταύρωση του εαυτού του με το specified RectangleF δομή. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | Ενημερώνει αυτόRegion στη διασταύρωση του εαυτού του με το καθορισμένοRegion . |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | Ελέγχει εάν αυτόRegion έχει ένα άδειο εσωτερικό στην καθορισμένη επιφάνεια σχεδίασης. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | Ελέγχει εάν αυτόRegion έχει ένα άπειρο εσωτερικό στην καθορισμένη επιφάνεια σχεδίασης. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | Ελέγχει εάν το καθορισμένοPoint δομή περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | Ελέγχει εάν το καθορισμένοPointF δομή περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | Ελέγχει εάν κάποιο τμήμα του καθορισμένουRectangle η δομή περιέχεται σε this Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | Ελέγχει εάν κάποιο τμήμα του καθορισμένουRectangleF η δομή περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | Ελέγχει εάν το καθορισμένο σημείο περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | Ελέγχει εάν το καθορισμένοPoint δομή περιέχεται σε αυτόRegion όταν σχεδιάζεται χρησιμοποιώντας το καθορισμένοGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | Ελέγχει εάν το καθορισμένοPointF δομή περιέχεται σε αυτόRegion όταν σχεδιάζεται χρησιμοποιώντας το καθορισμένοGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | Ελέγχει εάν κάποιο τμήμα του καθορισμένουRectangle η δομή περιέχεται σε αυτόRegion όταν σχεδιάζονται χρησιμοποιώντας το καθορισμένοGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | Ελέγχει εάν κάποιο τμήμα του καθορισμένουRectangleF η δομή περιέχεται σε αυτόRegion όταν σχεδιάζονται χρησιμοποιώντας το καθορισμένοGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | Ελέγχει εάν το καθορισμένο σημείο περιέχεται σε αυτόRegion όταν σχεδιάζονται χρησιμοποιώντας το καθορισμένοGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | Ελέγχει εάν το καθορισμένο σημείο περιέχεται σε αυτόRegion αντικείμενο όταν σχεδιάζεται χρησιμοποιώντας το καθορισμένοGraphics αντικείμενο. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | Ελέγχει εάν κάποιο τμήμα του καθορισμένου ορθογωνίου περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | Ελέγχει εάν κάποιο τμήμα του καθορισμένου ορθογωνίου περιέχεται σε αυτόRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | Ελέγχει εάν κάποιο τμήμα του καθορισμένου ορθογωνίου περιέχεται σε αυτόRegion όταν σχεδιάζεται χρησιμοποιώντας το καθορισμένοGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | Ελέγχει εάν κάποιο τμήμα του καθορισμένου ορθογωνίου περιέχεται σε αυτόRegion όταν σχεδιάζεται χρησιμοποιώντας το καθορισμένοGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | Το Αρχικοποιεί αυτόRegion σε ένα άδειο εσωτερικό. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | Το Αρχικοποιεί αυτόRegion αντικείμενο σε ένα άπειρο εσωτερικό. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | Μεταμορφώνει αυτόRegion από τα καθορισμέναMatrix . |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | Μετατοπίζει τις συντεταγμένες αυτούRegion κατά το καθορισμένο ποσό. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | Μετατοπίζει τις συντεταγμένες αυτούRegion κατά το καθορισμένο ποσό. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | Ενημερώνει αυτόRegion στην ένωση του εαυτού του και του καθορισμένουGraphicsPath . |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | Ενημερώνει αυτόRegion στην ένωση του εαυτού του και του καθορισμένουRectangle δομή. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | Ενημερώνει αυτόRegion στην ένωση του εαυτού του και του καθορισμένουRectangleF δομή. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | Ενημερώνει αυτόRegion στην ένωση του εαυτού του και του καθορισμένουRegion . |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | Ενημερώνει αυτόRegion στην ένωση μείον την τομή του εαυτού του με το που έχει καθοριστείGraphicsPath . |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | Ενημερώνει αυτόRegion στην ένωση μείον την τομή του εαυτού του με το που έχει καθοριστείRectangle δομή. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | Ενημερώνει αυτόRegion στην ένωση μείον την τομή του εαυτού του με το καθορισμένοRectangleF δομή. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | Ενημερώνει αυτόRegion στην ένωση μείον την τομή του εαυτού του με το που έχει καθοριστείRegion . |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


