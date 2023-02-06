---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D για Αναφορά API .NET
description: Όλη η γεωμετρία και οι οντότητες ορίζονται σε αυτό το namespace
type: docs
weight: 40
url: /el/net/aspose.threed.entities/
---
Όλη η γεωμετρία και οι οντότητες ορίζονται σε αυτό το namespace

## Τάξεις

| Τάξη | Περιγραφή |
| --- | --- |
| [Box](./box/) | Κουτί. |
| [Camera](./camera/) | Η κάμερα περιγράφει την οπτική γωνία του θεατή που κοιτάζει τη σκηνή. |
| [Circle](./circle/) | Α[`Circle`](../aspose.threed.entities/circle/) η καμπύλη αποτελείται από ένα σύνολο σημείων στην άκρη του σχήματος κύκλου. |
| [CompositeCurve](./compositecurve/) | Α[`CompositeCurve`](../aspose.threed.entities/compositecurve/) αποτελείται από πολλά τμήματα καμπύλης. |
| [Curve](./curve/) | Η βασική κλάση όλων των υλοποιήσεων καμπύλης. |
| [Cylinder](./cylinder/) | Παραμετροποιημένος κύλινδρος. Μπορεί επίσης να χρησιμοποιηθεί για την αναπαράσταση του κώνου όταν ένα από τα radiusTop/radiusBottom είναι μηδέν. |
| [Dish](./dish/) | Παραμετροποιημένο πιάτο. |
| [Ellipse](./ellipse/) | Αν[`Ellipse`](../aspose.threed.entities/ellipse/)ορίζει ένα σύνολο σημείων που σχηματίζουν το σχήμα έλλειψης. |
| [Frustum](./frustum/) | Η βασική κλάση του[`Camera`](../aspose.threed.entities/camera/) και[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | Η βασική κλάση όλων των γεωμετρικών αντικειμένων με δυνατότητα απόδοσης (όπως[`Mesh`](../aspose.threed.entities/mesh/) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ,[`Patch`](../aspose.threed.entities/patch/) κ.λπ.). |
| [Light](./light/) | Το φως φωτίζει τη σκηνή. |
| [Line](./line/) | Μια πολύγραμμη είναι μια διαδρομή που ορίζεται από ένα σύνολο σημείων με[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) , και συνδέεται με[`Segments`](../aspose.threed.entities/line/segments/) , που σημαίνει ότι μπορεί επίσης να είναι ένα σύνολο συνδεδεμένων τμημάτων γραμμής. Η γραμμή είναι συνήθως ένα γραμμικό αντικείμενο, που σημαίνει ότι δεν μπορεί να χρησιμοποιηθεί για να αναπαραστήσει μια καμπύλη, για να αναπαραστήσει μια καμπύλη, χρησιμοποιεί[`NurbsCurve`](../aspose.threed.entities/nurbscurve/) . |
| [LinearExtrusion](./linearextrusion/) | Η γραμμική εξώθηση παίρνει ένα σχήμα 2D ως είσοδο και επεκτείνει το σχήμα στην 3η διάσταση. |
| [Mesh](./mesh/) | Ένα πλέγμα αποτελείται από πολλά πολύγωνα n-πλευρών. |
| [NurbsCurve](./nurbscurve/) | [Καμπύλη NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) είναι μια καμπύλη που αντιπροσωπεύεται από NURBS (μη ομοιόμορφη ορθολογική βάση spline), Μια καμπύλη NURBS ορίζεται από[`Order`](../aspose.threed.entities/nurbscurve/order/) , ένα σύνολο σταθμισμένων[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) και ένα[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου, όποιο κι αν είναι αυτόTwoDimensional ήThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | Ένα 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) έχει δύο κατευθύνσεις, το[`U`](../aspose.threed.entities/nurbssurface/u/) και[`V`](../aspose.threed.entities/nurbssurface/v/) , ο[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/) ορίζει δεδομένα για κάθε κατεύθυνση. Μια κατεύθυνση είναι στην πραγματικότητα μια καμπύλη NURBS, που σημαίνει ότι ορίζεται επίσης από την[`Order`](../aspose.threed.entities/nurbsdirection/order/) , ένα[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) και ένα σύνολο σταθμισμένων σημείων ελέγχου (που ορίζονται στο[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ). |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/) είναι μια επιφάνεια που αντιπροσωπεύεται από[NURBS (Μη ομοιόμορφη ορθολογική βάση)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), Α[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ορίζεται από δύο[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/) και[`V`](../aspose.threed.entities/nurbssurface/v/) . Το στοιχείο w στο σημείο ελέγχου χρησιμοποιείται ως βάρος του σημείου ελέγχου ανεξάρτητα από τον τύπο της κατεύθυνσηςTwoDimensional ήThreeDimensional |
| [Patch](./patch/) | Α[`Patch`](../aspose.threed.entities/patch/) είναι μια παραμετρική επιφάνεια μοντελοποίησης, παρόμοια με[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) , ορίζεται επίσης από δύο [`PatchDirection`](../aspose.threed.entities/patchdirection/) , ο[`U`](../aspose.threed.entities/patch/u/) και[`V`](../aspose.threed.entities/patch/v/) . Αλλά διαφορά μεταξύ[`Patch`](../aspose.threed.entities/patch/) και[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) είναι ότι το[`PatchDirection`](../aspose.threed.entities/patchdirection/) Η καμπύλη μπορεί να είναι μία από τιςBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline καιLinear |
| [PatchDirection](./patchdirection/) | Κατεύθυνση U και V του Patch. |
| [Plane](./plane/) | Παραμετροποιημένο επίπεδο. |
| [PointCloud](./pointcloud/) | Το νέφος σημείων δεν περιέχει πληροφορίες τοπολογίας αλλά μόνο τα σημεία ελέγχου και τα στοιχεία κορυφής. |
| [PolygonBuilder](./polygonbuilder/) | Μια βοηθητική κλάση για τη δημιουργία πολυγώνου[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | Βοηθητικά προγράμματα για την τροποποίηση πολυγώνων |
| [Primitive](./primitive/) | Βασική κλάση για όλα τα primitives |
| [Pyramid](./pyramid/) | Παραμετροποιημένη πυραμίδα. |
| [RectangularTorus](./rectangulartorus/) | Παραμετροποιημένος ορθογώνιος τόρος. |
| [RevolvedAreaSolid](./revolvedareasolid/) | Αυτή η κλάση αντιπροσωπεύει ένα συμπαγές μοντέλο περιστρέφοντας μια διατομή που παρέχεται από ένα προφίλ γύρω από έναν άξονα. |
| [Shape](./shape/) | Το σχήμα περιγράφει την παραμόρφωση σε ένα σύνολο σημείων ελέγχου, η οποία είναι παρόμοια με τον παραμορφωτή συστάδας στη Μάγια. Για παράδειγμα, μπορούμε να προσθέσουμε ένα σχήμα σε μια δημιουργημένη γεωμετρία. Και το σχήμα και η γεωμετρία έχουν τις ίδιες τοπολογικές πληροφορίες αλλά διαφορετική θέση των σημείων ελέγχου. Με ποικίλα ποσά επιρροής, η γεωμετρία εκτελεί ένα φαινόμενο παραμόρφωσης. |
| [Skeleton](./skeleton/) | Το[`Skeleton`](../aspose.threed.entities/skeleton/)χρησιμοποιείται κυρίως από το λογισμικό CAD για να βοηθήσει τον σχεδιαστή να χειριστεί τον μετασχηματισμό της σκελετικής δομής, είναι συνήθως άχρηστο έξω από τα λογισμικά CAD. Για να γίνει η ιεραρχία του σκελετού να λειτουργεί σαν ένα αντικείμενο στο λογισμικό CAD, είναι απαραίτητο να σημειωθεί η κορυφή[`Skeleton`](../aspose.threed.entities/skeleton/) κόμβος ως ρίζα με τη ρύθμιση[`Type`](../aspose.threed.entities/skeleton/type/) προς τηνSkeleton , και όλα τα παιδιά ρυθμίστηκαν σεBone |
| [Sphere](./sphere/) | Παραμετροποιημένη σφαίρα. |
| [SweptAreaSolid](./sweptareasolid/) | Α[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/) κατασκευάζει μια γεωμετρία σαρώνοντας ένα προφίλ κατά μήκος μιας κατεύθυνσης. |
| [Torus](./torus/) | Παραμετροποιημένος τόρος. |
| [TransformedCurve](./transformedcurve/) | Α[`TransformedCurve`](../aspose.threed.entities/transformedcurve/) δίνει σε μια καμπύλη μια τοποθέτηση χρησιμοποιώντας έναν πίνακα μετασχηματισμού. Αυτό επιτρέπει την εκτέλεση ενός μετασχηματισμού μέσα σε ένα[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/) ή[`CompositeCurve`](../aspose.threed.entities/compositecurve/) . |
| [TriMesh](./trimesh/) | Ένα TriMesh περιέχει ακατέργαστα δεδομένα που μπορούν να χρησιμοποιηθούν απευθείας από την GPU. Αυτή η κλάση είναι ένα βοηθητικό πρόγραμμα που βοηθά στη δημιουργία ενός πλέγματος που περιέχει μόνο δεδομένα ανά κορυφή. |
| [TriMesh&lt;T&gt;](./trimesh-1/) | Γενική έκδοση του[`TriMesh`](../aspose.threed.entities/trimesh/) για στατικά καθορισμένη κορυφή του χρήστη type |
| [TrimmedCurve](./trimmedcurve/) | Μια οριοθετημένη καμπύλη που έκοψε τη βασική καμπύλη και στα δύο άκρα. |
| [VertexElement](./vertexelement/) | Βασική κλάση στοιχείων κορυφής. Ένας τύπος στοιχείου κορυφής προσδιορίζεται από το VertexElementType. Ένα VertexElement περιγράφει πώς το στοιχείο κορυφής αντιστοιχίζεται σε μια γεωμετρική επιφάνεια και πώς είναι διατεταγμένες οι πληροφορίες χαρτογράφησης στη μνήμη. Ένα VertexElement περιέχει Normals, UV ή άλλου είδους πληροφορίες. |
| [VertexElementBinormal](./vertexelementbinormal/) | Καθορίζει τα δικανονικά διανύσματα για καθορισμένα στοιχεία. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | Μια βοηθητική κλάση για τον ορισμό του σκυροδέματος[`VertexElement`](../aspose.threed.entities/vertexelement/) υλοποιήσεις. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | Καθορίζει την πτυχή της άκρης για καθορισμένα στοιχεία |
| [VertexElementHole](./vertexelementhole/) | Ορίζει εάν το καθορισμένο πολύγωνο είναι hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | Μια βοηθητική κλάση για τον ορισμό του σκυροδέματος[`VertexElement`](../aspose.threed.entities/vertexelement/) υλοποιήσεις. |
| [VertexElementMaterial](./vertexelementmaterial/) | Καθορίζει δείκτη υλικού για συγκεκριμένα στοιχεία. Ένας κόμβος μπορεί να έχει πολλά υλικά, το[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/) χρησιμοποιείται για την απόδοση διαφορετικού μέρους της γεωμετρίας σε διαφορετικά υλικά. |
| [VertexElementNormal](./vertexelementnormal/) | Ορίζει κανονικά διανύσματα για καθορισμένα στοιχεία. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | Ορίζει ομάδα πολυγώνων για καθορισμένα στοιχεία για να ομαδοποιήσει τα σχετικά πολύγωνα μαζί. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | Μια ομάδα εξομάλυνσης είναι μια ομάδα πολυγώνων σε ένα πλέγμα πολυγώνων που θα πρέπει να φαίνεται να σχηματίζει μια λεία επιφάνεια. Κάποια πρώιμα λογισμικά τρισδιάστατης μοντελοποίησης όπως το 3D studio max για DOS χρησιμοποίησαν ομάδα εξομάλυνσης για να ακυρώσουν την αποθήκευση κανονικού διανύσματος για κάθε κορυφή πλέγματος. |
| [VertexElementSpecular](./vertexelementspecular/) | Καθορίζει κατοπτρικό χρώμα για καθορισμένα στοιχεία. |
| [VertexElementTangent](./vertexelementtangent/) | Ορίζει εφαπτομενικά διανύσματα για καθορισμένα στοιχεία. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | Μια βοηθητική κλάση για τον ορισμό του σκυροδέματος[`VertexElement`](../aspose.threed.entities/vertexelement/) υλοποιήσεις. |
| [VertexElementUserData](./vertexelementuserdata/) | Καθορίζει προσαρμοσμένα δεδομένα χρήστη για καθορισμένα στοιχεία. Συνήθως είναι δεδομένα συγκεκριμένης εφαρμογής για ειδικό σκοπό. |
| [VertexElementUV](./vertexelementuv/) | Καθορίζει τις συντεταγμένες UV για καθορισμένα στοιχεία. Μια γεωμετρία μπορεί να έχει πολλαπλές[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) στοιχεία, και το καθένα έχει διαφορετικά[`TextureMapping`](../aspose.threed.entities/texturemapping/) s. |
| [VertexElementVector4](./vertexelementvector4/) | Μια βοηθητική κλάση για τον ορισμό του σκυροδέματος[`VertexElement`](../aspose.threed.entities/vertexelement/) υλοποιήσεις. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | Καθορίζει το χρώμα κορυφής για καθορισμένα στοιχεία |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | Καθορίζει την πτυχή κορυφής για καθορισμένα στοιχεία |
| [VertexElementVisibility](./vertexelementvisibility/) | Καθορίζει εάν τα καθορισμένα στοιχεία είναι ορατά |
| [VertexElementWeight](./vertexelementweight/) | Καθορίζει το βάρος ανάμειξης για καθορισμένα εξαρτήματα. |
## Δομές

| Δομή | Περιγραφή |
| --- | --- |
| [EndPoint](./endpoint/) | Το τελικό σημείο για την περικοπή της καμπύλης, μπορεί να είναι μια τιμή παραμέτρου ή ένα καρτεσιανό σημείο. |
## Διεπαφές

| Διεπαφή | Περιγραφή |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | VertexElement με δεδομένα δεικτών. |
| [IMeshConvertible](./imeshconvertible/) | Οι οντότητες που υλοποίησαν αυτήν τη διεπαφή μπορούν να μετατραπούν σε[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | Οι Orientable οντότητες θα υλοποιήσουν αυτήν τη διεπαφή. |
## Απαρίθμηση

| Απαρίθμηση | Περιγραφή |
| --- | --- |
| [ApertureMode](./aperturemode/) | Λειτουργίες διαφράγματος κάμερας. Η λειτουργία διαφράγματος καθορίζει ποιες τιμές οδηγούν το διάφραγμα της κάμερας. Εάν η λειτουργία διαφράγματος είναι HorizAndVert, Horizontal ή Vertical, τότε χρησιμοποιείται το οπτικό πεδίο. Εάν η λειτουργία διαφράγματος είναι FocalLength, τότε χρησιμοποιείται η εστιακή απόσταση. |
| [CurveDimension](./curvedimension/) | Η διάσταση των καμπυλών. |
| [LightType](./lighttype/) | Τύποι φωτός. |
| [MappingMode](./mappingmode/) | Καθορίζει τον τρόπο με τον οποίο το στοιχείο αντιστοιχίζεται σε μια επιφάνεια. Το[`MappingMode`](../aspose.threed.entities/mappingmode/) όρισε πώς[`VertexElement`](../aspose.threed.entities/vertexelement/) χαρτογραφείται στην επιφάνεια της γεωμετρίας. |
| [NurbsType](./nurbstype/) | Τύποι NURBS. |
| [PatchDirectionType](./patchdirectiontype/) | Τύποι κατεύθυνσης ενημέρωσης κώδικα. |
| [ProjectionType](./projectiontype/) | Τύποι προβολής κάμερας. |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) ορίζει πώς αποθηκεύονται και αναφέρονται οι πληροφορίες χαρτογράφησης από. |
| [RotationMode](./rotationmode/) | Τρόπος περιστροφής του frustum |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) s τύποι. |
| [SplitMeshPolicy](./splitmeshpolicy/) | Κοινή χρήση δεδομένων κορυφής/σημείου ελέγχου μεταξύ δευτερευόντων ματιών ή κάθε δευτερεύον πλέγμα έχει τα δικά του συμπιεσμένα δεδομένα. |
| [TextureMapping](./texturemapping/) | Ο τύπος αντιστοίχισης υφής για[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) Περιγράφει ποιο είδος χαρτογράφησης υφής χρησιμοποιείται. |
| [VertexElementType](./vertexelementtype/) | Ο τύπος του στοιχείου κορυφής, που καθορίζεται πώς θα χρησιμοποιηθεί στη μοντελοποίηση. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
