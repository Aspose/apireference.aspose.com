---
title: Interface IDevice
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Rendering.IDevice διεπαφή. Καθορίζει μεθόδους και ιδιότητες που υποστηρίζουν προσαρμοσμένη απόδοση των στοιχείων γραφικών όπως διαδρομές κείμενο και εικόνες.
type: docs
weight: 2810
url: /el/net/aspose.svg.rendering/idevice/
---
## IDevice interface

Καθορίζει μεθόδους και ιδιότητες που υποστηρίζουν προσαρμοσμένη απόδοση των στοιχείων γραφικών όπως διαδρομές, κείμενο και εικόνες.

```csharp
public interface IDevice : IDisposable
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | Λαμβάνει το γραφικό πλαίσιο. |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | Λαμβάνει επιλογές απόδοσης. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | Προσθέτει ένα ορθογώνιο στην τρέχουσα διαδρομή ως πλήρη υποδιαδρομή. |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | Ξεκινά η απόδοση του εγγράφου. |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | Ξεκινά την απόδοση του στοιχείου. |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | Ξεκινά η απόδοση της νέας σελίδας. |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | Τροποποιεί την τρέχουσα διαδρομή αποκοπής τέμνοντάς την με την τρέχουσα διαδρομή, χρησιμοποιώντας τον κανόνα FillMode για να καθορίσει την περιοχή που θα γεμίσει. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | Κλείνει την τρέχουσα υποδιαδρομή προσθέτοντας ένα ευθύγραμμο τμήμα από το τρέχον σημείο στο σημείο εκκίνησης της υποδιαδρομής. Εάν η τρέχουσα υποδιαδρομή είναι ήδη κλειστή, το "ClosePath" δεν κάνει τίποτα. Αυτός ο τελεστής τερματίζει την τρέχουσα υποδιαδρομή. Η προσθήκη ενός άλλου τμήματος στην τρέχουσα διαδρομή ξεκινά μια νέα υποδιαδρομή, ακόμα κι αν το νέο τμήμα ξεκινά στο τελικό σημείο στο οποίο φτάνει η μέθοδος "ClosePath". |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | Προσθέτει μια κυβική καμπύλη Bézier στην τρέχουσα διαδρομή. Η καμπύλη εκτείνεται από το τρέχον σημείο μέχρι το σημείο pt3, χρησιμοποιώντας τα pt1 και pt2 ως σημεία ελέγχου του Bézier. Το νέο τρέχον σημείο είναι pt3. |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | Σχεδιάζει την καθορισμένη εικόνα. |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | Τερματίζει την απόδοση του εγγράφου. |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | Τερματίζει την απόδοση του στοιχείου. |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | Τερματίζει την απόδοση της τρέχουσας σελίδας. |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | Γεμίζει ολόκληρη την περιοχή που περικλείεται από την τρέχουσα διαδρομή. Εάν η διαδρομή αποτελείται από πολλές αποσυνδεδεμένες υποδιαδρομές, γεμίζει το εσωτερικό όλων των υπομονοπατιών, το εξεταζόμενο μαζί. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | Γεμίζει την καθορισμένη συμβολοσειρά κειμένου στην καθορισμένη θέση. |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | Ξεπλύνει όλα τα δεδομένα για έξοδο ροής. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | Προσθέτει ένα ευθύγραμμο τμήμα από το τρέχον σημείο στο σημείο (pt). Το νέο τρέχον σημείο είναι pt. |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | Ξεκινά μια νέα υποδιαδρομή μετακινώντας το τρέχον σημείο στις συντεταγμένες της παραμέτρου pt, παραλείποντας οποιοδήποτε τμήμα γραμμής σύνδεσης. Εάν η προηγούμενη μέθοδος κατασκευής διαδρομής στην τρέχουσα διαδρομή ήταν επίσης "MoveTo", η νέα "MoveTo" την αντικαθιστά. κανένα ίχνος της προηγούμενης λειτουργίας "MoveTo" δεν παραμένει στη διαδρομή. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | Επαναφέρει ολόκληρο το περιβάλλον γραφικών στην προηγούμενη τιμή του βγάζοντάς το από τη στοίβα. |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | Σπρώχνει ένα αντίγραφο ολόκληρου του περιβάλλοντος γραφικών στη στοίβα. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | Διαγράφει μια γραμμή κατά μήκος της τρέχουσας διαδρομής. Η διαγραμμισμένη γραμμή ακολουθεί κάθε ευθύ ή καμπύλο τμήμα της διαδρομής, με κέντρο το τμήμα με πλευρές παράλληλες προς αυτό. Κάθε ένα από τα υπομονοπάτια της διαδρομής αντιμετωπίζεται ξεχωριστά. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | Περιγράφει και γεμίζει την τρέχουσα διαδρομή. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | Χαρακτηρίζει την καθορισμένη συμβολοσειρά κειμένου στην καθορισμένη θέση. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* συνέλευση [Aspose.SVG](../../)


