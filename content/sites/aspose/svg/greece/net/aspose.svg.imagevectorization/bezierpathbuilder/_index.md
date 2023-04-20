---
title: Class BezierPathBuilder
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.ImageVectorization.BezierPathBuilder τάξη. ΤοSplinePathBuilder Η κλάση είναι υπεύθυνη για τη δημιουργία τμημάτων διαδρομήςSVGPathSeg από τη λίστα των σημείων ίχνους. Αυτό το εργαλείο δημιουργίας διαδρομής βασίζεται στη χρήση της μεθόδου ελαχίστων τετραγώνων για την εύρεση σημείων ελέγχου Bezier για ίχνος σημείων.
type: docs
weight: 2080
url: /el/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Το[`SplinePathBuilder`](../splinepathbuilder/) Η κλάση είναι υπεύθυνη για τη δημιουργία τμημάτων διαδρομής[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) από τη λίστα των σημείων ίχνους. Αυτό το εργαλείο δημιουργίας διαδρομής βασίζεται στη χρήση της μεθόδου ελαχίστων τετραγώνων για την εύρεση σημείων ελέγχου Bezier για ίχνος σημείων.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Αρχικοποιεί μια νέα παρουσία του`BezierPathBuilder` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Λαμβάνει ή ορίζει το όριο σφάλματος. Αυτή η παράμετρος ορίζει τη μέγιστη απόκλιση των σημείων στην προσαρμοσμένη καμπύλη. Από προεπιλογή είναι 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Λαμβάνει ή ορίζει το όριο σφάλματος. Αυτή η παράμετρος ορίζει τον αριθμό των επαναλήψεων για τη μέθοδο προσέγγισης ελαχίστων τετραγώνων. Από προεπιλογή είναι 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Αποκτά ή ρυθμίζει το ίχνος πιο ομαλό. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Δημιουργεί τμήματα διαδρομής από τη λίστα των σημείων ίχνους. |

### Δείτε επίσης

* interface [IPathBuilder](../ipathbuilder/)
* χώρος ονομάτων [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* συνέλευση [Aspose.SVG](../../)


