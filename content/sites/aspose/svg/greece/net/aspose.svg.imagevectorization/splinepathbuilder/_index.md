---
title: Class SplinePathBuilder
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.ImageVectorization.SplinePathBuilder τάξη. ΤοSplinePathBuilder Η κλάση είναι υπεύθυνη για τη δημιουργία τμημάτων διαδρομήςSVGPathSeg από τη λίστα των σημείων ίχνους. Αυτό το πρόγραμμα δημιουργίας μονοπατιών βασίζεται στην εφαρμογή μιας σειράς CatmullRoma σε ένα σύνολο σημείων εξομάλυνσης και μειωμένης διαδρομής..
type: docs
weight: 2160
url: /el/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Το`SplinePathBuilder` Η κλάση είναι υπεύθυνη για τη δημιουργία τμημάτων διαδρομής[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) από τη λίστα των σημείων ίχνους. Αυτό το πρόγραμμα δημιουργίας μονοπατιών βασίζεται στην εφαρμογή μιας σειράς Catmull-Roma σε ένα σύνολο σημείων εξομάλυνσης και μειωμένης διαδρομής..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`SplinePathBuilder` τάξη. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Αρχικοποιεί μια νέα παρουσία του`SplinePathBuilder` τάξη. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Αρχικοποιεί μια νέα παρουσία του`SplinePathBuilder` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Η τιμή των τάσεων επηρεάζει την απότομη κάμψη της καμπύλης στα (παρεμβαλλόμενα) σημεία ελέγχου. Πρέπει να είναι στην περιοχή από 0 έως 1. Οποιεσδήποτε υψηλότερες ή χαμηλότερες τιμές θα ευθυγραμμιστούν με τις ελάχιστες και μέγιστες τιμές αυτού του εύρους, αναλόγως. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Λαμβάνει ή ορίζει τον απλοποιητή ίχνους. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Αποκτά ή ρυθμίζει το ίχνος πιο ομαλό. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Δημιουργεί τμήματα διαδρομής από τη λίστα των σημείων ίχνους. |

### Δείτε επίσης

* interface [IPathBuilder](../ipathbuilder/)
* χώρος ονομάτων [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* συνέλευση [Aspose.SVG](../../)


