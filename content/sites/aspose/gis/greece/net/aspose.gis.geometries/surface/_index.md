---
title: Class Surface
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Geometries.Surface τάξη. ΑSurface είναι ένα δισδιάστατο γεωμετρικό αντικείμενο.
type: docs
weight: 1210
url: /el/net/aspose.gis.geometries/surface/
---
## Surface class

Α`Surface` είναι ένα δισδιάστατο γεωμετρικό αντικείμενο.

```csharp
public abstract class Surface : Geometry, ISurface
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Λαμβάνει τον αριθμό των διαστάσεων συντεταγμένων για αυτό[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | Λαμβάνει την τοπολογική διάσταση αυτού[`Geometry`](../geometry/) . |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Παίρνει τον τύπο της γεωμετρίας. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η γεωμετρία είναι ή περιέχει καμπύλη (όχι γραμμική) γεωμετρία. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία έχει συντεταγμένες M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία έχει συντεταγμένες Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι κενή. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι απλή από την άποψη SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι έγκυρη. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Παίρνει το SpatialReferenceSystem αυτής της παρουσίας. Αυτή η ιδιότητα μπορεί να είναι`null` , είναι άγνωστο το SpatialReferenceSystem. Η εκχώρηση νέου SpatialReferenceSystem δεν θα εκτελέσει μετασχηματισμό συντεταγμένων, αλλά μόνο η αναφορά. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Μεταφράζει αυτή τη γεωμετρία στη γνωστή δυαδική αναπαράστασή της. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή δυαδική αναπαράστασή της. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Κλωνοποιεί αυτήν την παρουσία. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία καλύπτεται από μια καθορισμένη γεωμετρία. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία καλύπτει μια καθορισμένη γεωμετρία. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία διασταυρώνονται. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Αφαιρεί μια καθορισμένη γεωμετρία από αυτήν τη γεωμετρία. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Προσδιορίζει εάν αυτή η γεωμετρία δεν χωρίζει από μια καθορισμένη γεωμετρία. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Υπολογίζει το εμβαδόν αυτής της γεωμετρίας. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Υπολογίζει το κέντρο αυτής της γεωμετρίας. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Υπολογίζει το κυρτό κύτος αυτής της γεωμετρίας. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Υπολογίζει την ελάχιστη απόσταση μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Υπολογίζει και επιστρέφει μια οριοθέτηση αυτής της γεωμετρίας. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Υπολογίζει το μήκος αυτής της γεωμετρίας. |
| abstract [GetPointOnSurface](../../aspose.gis.geometries/surface/getpointonsurface/)() | Βρίσκει ένα σημείο που είναι εγγυημένο ότι βρίσκεται σε αυτήν την επιφάνεια. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Δημιουργεί μια τομή μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Καθορίζει εάν αυτή η γεωμετρία τέμνει μια καθορισμένη έκταση. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Καθορίζει αν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία τέμνονται. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία επικαλύπτεται με μια καθορισμένη γεωμετρία. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Καθορίζει εάν ο πίνακας τομής DE-9IM αυτής της γεωμετρίας και μια καθορισμένη γεωμετρία ταιριάζει με το παρεχόμενο μοτίβο. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Λαμβάνει τα πολύγωνα που αντιπροσωπεύονται ως γραμμές αυτής της γεωμετρίας. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Στρογγυλοποιεί τη συντεταγμένη M σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Στρογγυλές συντεταγμένες X και Y σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Στρογγυλές συντεταγμένες Z σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Το κάνει αυτό[`Geometry`](../geometry/) κενό. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία περιέχει χωρικά μια καθορισμένη γεωμετρία. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία χωρικά ίση με μια καθορισμένη γεωμετρία. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Δημιουργεί μια συμμετρική διαφορά μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [ToEditable](../../aspose.gis.geometries/surface/toeditable/#toeditable_1)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/#tolineargeometry_2)() | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/#tolineargeometry_3)(double) | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία αγγίζουν. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Ενώνει αυτήν τη γεωμετρία και μια καθορισμένη γεωμετρία. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός καθορισμένης έκτασης. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός μιας καθορισμένης γεωμετρίας. |

### Δείτε επίσης

* class [Geometry](../geometry/)
* interface [ISurface](../isurface/)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* συνέλευση [Aspose.GIS](../../)


