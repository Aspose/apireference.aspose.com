---
title: Class LineString
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Geometries.LineString τάξη. Μια γραμμή πολλαπλών κορυφών.
type: docs
weight: 1120
url: /el/net/aspose.gis.geometries/linestring/
---
## LineString class

Μια γραμμή πολλαπλών κορυφών.

```csharp
public class LineString : Curve, ILineString
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [LineString](linestring/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`LineString` τάξη. |
| [LineString](linestring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Αρχικοποιεί μια νέα παρουσία του`LineString` τάξη. |
| [LineString](linestring/#constructor_1)(ILineString) | Αρχικοποιεί μια νέα παρουσία του`LineString` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Λαμβάνει τον αριθμό των διαστάσεων συντεταγμένων για αυτό[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | Παίρνει τον αριθμό των πόντων στο`LineString` . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Λαμβάνει την τοπολογική διάσταση αυτού[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | Επιστρέφει ένα αντίγραφο του τελικού σημείου της καμπύλης. |
| override [GeometryType](../../aspose.gis.geometries/linestring/geometrytype/) { get; } | Παίρνει τον τύπο της γεωμετρίας. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η γεωμετρία είναι ή περιέχει καμπύλη (όχι γραμμική) γεωμετρία. |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία έχει συντεταγμένες M. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία έχει συντεταγμένες Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Λαμβάνει τιμές που υποδεικνύουν εάν μια καμπύλη είναι κλειστή. Μια καμπύλη είναι κλειστή αν το σημείο εκκίνησης της είναι ίσο με το τελικό της σημείο. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι κενή. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι απλή από την άποψη SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η παρουσία είναι έγκυρη. |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | Λαμβάνει ή ορίζει το[`IPoint`](../ipoint/) στον καθορισμένο δείκτη. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | Παίρνει το SpatialReferenceSystem αυτής της παρουσίας. Αυτή η ιδιότητα μπορεί να είναι`null` , εάν το SpatialReferenceSystem δεν έχει οριστεί. Η αντιστοίχιση του νέου SpatialReferenceSystem δεν θα εκτελέσει μετασχηματισμό συντεταγμένων, θα αλλάξει μόνο η αναφορά. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | Επιστρέφει ένα αντίγραφο του σημείου εκκίνησης της καμπύλης. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint)(IPoint) | Προσθέτει ένα σημείο στο τέλος της γραμμής. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_1)(double, double) | Προσθέτει ένα σημείο στο τέλος της γραμμής. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_2)(double, double, double) | Προσθέτει ένα σημείο στο τέλος της γραμμής. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_3)(double, double, double, double) | Προσθέτει ένα σημείο στο τέλος της γραμμής. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Μεταφράζει αυτή τη γεωμετρία στη γνωστή δυαδική αναπαράστασή της. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή δυαδική αναπαράστασή της. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Μεταφράζει αυτή τη γεωμετρία στη γνωστή αναπαράσταση κειμένου. |
| override [Clone](../../aspose.gis.geometries/linestring/clone/)() | Κλωνοποιεί αυτήν την παρουσία. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία καλύπτεται από μια καθορισμένη γεωμετρία. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία καλύπτει μια καθορισμένη γεωμετρία. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία διασταυρώνονται. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Αφαιρεί μια καθορισμένη γεωμετρία από αυτήν τη γεωμετρία. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Προσδιορίζει εάν αυτή η γεωμετρία δεν χωρίζει από μια καθορισμένη γεωμετρία. |
| [Equals](../../aspose.gis.geometries/linestring/equals/#equals)(ILineString) | Υποδεικνύει εάν το τρέχον αντικείμενο είναι ίσο με άλλο αντικείμενο του ίδιου τύπου. |
| override [Equals](../../aspose.gis.geometries/linestring/equals/#equals_1)(object) | Καθορίζει εάν το καθορισμένο αντικείμενο είναι ίσο με το τρέχον αντικείμενο. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Υπολογίζει το εμβαδόν αυτής της γεωμετρίας. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Υπολογίζει το κέντρο αυτής της γεωμετρίας. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Υπολογίζει το κυρτό κύτος αυτής της γεωμετρίας. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Υπολογίζει την ελάχιστη απόσταση μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | Επιστρέφει έναν απαριθμητή που επαναλαμβάνει τη συλλογή. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Υπολογίζει και επιστρέφει μια οριοθέτηση αυτής της γεωμετρίας. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | Λειτουργεί ως η προεπιλεγμένη συνάρτηση κατακερματισμού. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Υπολογίζει το μήκος αυτής της γεωμετρίας. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Δημιουργεί μια τομή μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Καθορίζει εάν αυτή η γεωμετρία τέμνει μια καθορισμένη έκταση. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Καθορίζει αν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία τέμνονται. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία επικαλύπτεται με μια καθορισμένη γεωμετρία. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Καθορίζει εάν ο πίνακας τομής DE-9IM αυτής της γεωμετρίας και μια καθορισμένη γεωμετρία ταιριάζει με το παρεχόμενο μοτίβο. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Λαμβάνει τα πολύγωνα που αντιπροσωπεύονται ως γραμμές αυτής της γεωμετρίας. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | Αντιστρέφει τη σειρά των πόντων σε αυτό`LineString` . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Στρογγυλοποιεί τη συντεταγμένη M σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Στρογγυλές συντεταγμένες X και Y σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Στρογγυλές συντεταγμένες Z σε έναν καθορισμένο αριθμό κλασματικών ψηφίων. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | Το κάνει αυτό[`Geometry`](../geometry/) κενό. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία περιέχει χωρικά μια καθορισμένη γεωμετρία. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία χωρικά ίση με μια καθορισμένη γεωμετρία. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Δημιουργεί μια συμμετρική διαφορά μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας. |
| [ToEditable](../../aspose.gis.geometries/linestring/toeditable/#toeditable_2)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία αγγίζουν. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Ενώνει αυτήν τη γεωμετρία και μια καθορισμένη γεωμετρία. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός καθορισμένης έκτασης. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός μιας καθορισμένης γεωμετρίας. |
| [operator ==](../../aspose.gis.geometries/linestring/op_equality/) | Υλοποιεί τον τελεστή ==. |
| [operator !=](../../aspose.gis.geometries/linestring/op_inequality/) | Υλοποιεί τον τελεστή !=. |

### Δείτε επίσης

* class [Curve](../curve/)
* interface [ILineString](../ilinestring/)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* συνέλευση [Aspose.GIS](../../)


