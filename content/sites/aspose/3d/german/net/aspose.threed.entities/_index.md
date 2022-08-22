---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D für .NET-API-Referenz
description: Alle Geometrien und Entitäten sind in diesem Namensraum definiert
type: docs
weight: 40
url: /de/net/aspose.threed.entities/
---
Alle Geometrien und Entitäten sind in diesem Namensraum definiert

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Box](./box) | Box. |
| [Camera](./camera) | Die Kamera beschreibt den Blickpunkt des Betrachters, der die Szene betrachtet. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) Kurve besteht aus einer Reihe von Punkten am Rand der Kreisform. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) besteht aus mehreren Kurvensegmenten. |
| [Curve](./curve) | Die Basisklasse aller Kurvenimplementierungen. |
| [Cylinder](./cylinder) | Parametrisierter Zylinder. Kann auch verwendet werden, um den Kegel darzustellen, wenn einer von radiusTop/radiusBottom null ist. |
| [Dish](./dish) | Parametrierte Schüssel. |
| [Ellipse](./ellipse) | Ein[`Ellipse`](../aspose.threed.entities/ellipse)definiert eine Reihe von Punkten, die die Form einer Ellipse bilden. |
| [Frustum](./frustum) | Die Basisklasse von[`Camera`](../aspose.threed.entities/camera) und[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | Die Basisklasse aller darstellbaren geometrischen Objekte (wie[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) usw.). |
| [Light](./light) | Das Licht erhellt die Szene. |
| [Line](./line) | Eine Polylinie ist ein Pfad, der durch eine Reihe von Punkten mit definiert wird[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , und verbunden durch[`Segments`](../aspose.threed.entities/line/segments) , was bedeutet, dass es sich auch um eine Menge verbundener Liniensegmente handeln kann. Die Linie ist normalerweise ein lineares Objekt, was bedeutet, dass sie nicht verwendet werden kann, um eine Kurve darzustellen, um eine Kurve darzustellen, verwendet[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | Die lineare Extrusion nimmt eine 2D-Form als Eingabe und erweitert die Form in der 3. Dimension. |
| [Mesh](./mesh) | Ein Netz besteht aus vielen n-seitigen Polygonen. |
| [NurbsCurve](./nurbscurve) | [NURBS-Kurve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) ist eine Kurve, dargestellt durch NURBS (Non-Uniform Rational Basis Spline), Eine NURBS-Kurve wird durch ihre definiert[`Order`](../aspose.threed.entities/nurbscurve/order) , eine Reihe von gewichteten[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) und ein[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) Die w-Komponente im Kontrollpunkt wird als Gewichtung des Kontrollpunkts verwendet, unabhängig davon, ob es sich um a handeltTwoDimensional oderThreeDimensional |
| [NurbsDirection](./nurbsdirection) | Ein 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) hat zwei Richtung, die[`U`](../aspose.threed.entities/nurbssurface/u) und[`V`](../aspose.threed.entities/nurbssurface/v) , das[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) definiert Daten für jede Richtung. Eine Richtung ist eigentlich eine NURBS-Kurve, das heißt, sie wird auch durch ihre definiert[`Order`](../aspose.threed.entities/nurbsdirection/order) , a[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , und eine Reihe gewichteter Kontrollpunkte (definiert in[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) ist eine Fläche, dargestellt durch[NURBS (Non-uniform rational basis spline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) wird durch zwei definiert[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) und[`V`](../aspose.threed.entities/nurbssurface/v) . Die w-Komponente im Kontrollpunkt wird als Gewichtung des Kontrollpunkts verwendet, unabhängig vom Richtungstyp aTwoDimensional oderThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) ist eine parametrische Modellierungsoberfläche, ähnlich wie[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , es wird auch durch zwei definiert[`PatchDirection`](../aspose.threed.entities/patchdirection) , das[`U`](../aspose.threed.entities/patch/u) und[`V`](../aspose.threed.entities/patch/v) . Aber Unterschied zwischen[`Patch`](../aspose.threed.entities/patch) und[`NurbsSurface`](../aspose.threed.entities/nurbssurface) Ist das das[`PatchDirection`](../aspose.threed.entities/patchdirection) Kurve kann eine davon seinBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline undLinear |
| [PatchDirection](./patchdirection) | U- und V-Richtung des Patches. |
| [Plane](./plane) | Parametrierte Ebene. |
| [PointCloud](./pointcloud) | Die Punktwolke enthält keine Topologieinformationen, sondern nur die Kontrollpunkte und die Vertexelemente. |
| [PolygonBuilder](./polygonbuilder) | Eine Hilfsklasse zum Erstellen von Polygonen[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Dienstprogramme zum Ändern von Polygonen |
| [Primitive](./primitive) | Basisklasse für alle Primitiven |
| [Pyramid](./pyramid) | Parametrisierte Pyramide. |
| [RectangularTorus](./rectangulartorus) | Parametrierter rechteckiger Torus. |
| [RevolvedAreaSolid](./revolvedareasolid) | Diese Klasse stellt ein Volumenkörpermodell dar, indem ein durch ein Profil bereitgestellter Querschnitt um eine Achse gedreht wird. |
| [Shape](./shape) | Die Form beschreibt die Verformung an einer Reihe von Kontrollpunkten, ähnlich dem Cluster-Verformer in Maya. Beispielsweise können wir einer erstellten Geometrie eine Form hinzufügen. Und die Form und die Geometrie haben die gleichen topologischen Informationen, aber unterschiedliche Positionen der Kontrollpunkte. Bei unterschiedlich starker Beeinflussung führt die Geometrie zu einer Deformationswirkung. |
| [Skeleton](./skeleton) | Die[`Skeleton`](../aspose.threed.entities/skeleton)wird hauptsächlich von CAD-Software verwendet, um Designern zu helfen, die Transformation der Skelettstruktur zu manipulieren, es ist normalerweise außerhalb der CAD-Software nutzlos. Damit sich die Skeletthierarchie wie ein Objekt in CAD-Software verhält, ist es notwendig, die Spitze zu markieren[`Skeleton`](../aspose.threed.entities/skeleton) Knoten als Root-Knoten durch Einstellung[`Type`](../aspose.threed.entities/skeleton/type) zuSkeleton , und alle Kinder setzen aufBone |
| [Sphere](./sphere) | parametrisierte Kugel. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) konstruiert eine Geometrie, indem ein Profil entlang einer Leitlinie gezogen wird. |
| [Torus](./torus) | Parametrierter Torus. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) gibt einer Kurve eine Platzierung durch die Verwendung einer Transformationsmatrix. Dies erlaubt es, eine Transformation innerhalb von a durchzuführen[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) oder[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | Ein TriMesh enthält Rohdaten, die von der GPU direkt verwendet werden können. Diese Klasse ist ein Dienstprogramm, das beim Erstellen eines Netzes hilft, das nur Daten pro Scheitelpunkt enthält. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Generische Version von[`TriMesh`](../aspose.threed.entities/trimesh) für den statisch definierten Scheitelpunkt des Benutzers type |
| [TrimmedCurve](./trimmedcurve) | Eine begrenzte Kurve, die die Basiskurve an beiden Enden getrimmt hat. |
| [VertexElement](./vertexelement) | Basisklasse von Scheitelpunktelementen. Ein Scheitelpunktelementtyp wird durch VertexElementType identifiziert. Ein VertexElement beschreibt, wie das Vertexelement auf eine Geometrieoberfläche abgebildet wird und wie die Abbildungsinformationen im Speicher angeordnet sind. Ein VertexElement enthält Normalen, UVs oder andere Informationen. |
| [VertexElementBinormal](./vertexelementbinormal) | Definiert die binormalen Vektoren für bestimmte Komponenten. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Eine Hilfsklasse zum Definieren von Beton[`VertexElement`](../aspose.threed.entities/vertexelement) Implementierungen. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Definiert die Kantenfaltung für bestimmte Komponenten |
| [VertexElementHole](./vertexelementhole) | Definiert, ob das angegebene Polygon hole ist |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Eine Hilfsklasse zum Definieren von Beton[`VertexElement`](../aspose.threed.entities/vertexelement) Implementierungen. |
| [VertexElementMaterial](./vertexelementmaterial) | Definiert den Materialindex für bestimmte Komponenten. Ein Knoten kann mehrere Materialien haben, die[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) wird verwendet, um verschiedene Teile der Geometrie in verschiedenen Materialien zu rendern. |
| [VertexElementNormal](./vertexelementnormal) | Definiert Normalenvektoren für angegebene Komponenten. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Definiert eine Polygongruppe für bestimmte Komponenten, um zusammengehörige Polygone zu gruppieren. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Eine Glättungsgruppe ist eine Gruppe von Polygonen in einem Polygonnetz, die eine glatte Oberfläche zu bilden scheinen sollten. Einige frühe 3D-Modellierungssoftware wie 3D Studio Max für DOS verwendeten eine Glättungsgruppe, um das Speichern von Normalvektoren für jeden Netzscheitelpunkt aufzuheben. |
| [VertexElementSpecular](./vertexelementspecular) | Definiert Glanzfarbe für bestimmte Komponenten. |
| [VertexElementTangent](./vertexelementtangent) | Definiert Tangentenvektoren für angegebene Komponenten. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Eine Hilfsklasse zum Definieren von Beton[`VertexElement`](../aspose.threed.entities/vertexelement) Implementierungen. |
| [VertexElementUserData](./vertexelementuserdata) | Definiert benutzerdefinierte Benutzerdaten für bestimmte Komponenten. Normalerweise sind es anwendungsspezifische Daten für spezielle Zwecke. |
| [VertexElementUV](./vertexelementuv) | Definiert die UV-Koordinaten für bestimmte Komponenten. Eine Geometrie kann mehrere haben[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Elemente, und jeder hat unterschiedliche[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | Eine Hilfsklasse zum Definieren von Beton[`VertexElement`](../aspose.threed.entities/vertexelement) Implementierungen. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Definiert die Scheitelpunktfarbe für angegebene Komponenten |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Definiert die Scheitelfalte für angegebene Komponenten |
| [VertexElementVisibility](./vertexelementvisibility) | Definiert, ob angegebene Komponenten sichtbar sind |
| [VertexElementWeight](./vertexelementweight) | Definiert Mischungsgewicht für bestimmte Komponenten. |
## Schnittstellen

| Schnittstelle | Beschreibung |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement mit Indexdaten. |
| [IMeshConvertible](./imeshconvertible) | Entitäten, die diese Schnittstelle implementiert haben, können konvertiert werden[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Orientierbare Einheiten müssen diese Schnittstelle implementieren. |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [ApertureMode](./aperturemode) | Kamerablendenmodi. Der Blendenmodus bestimmt, welche Werte die Kamerablende steuern. Wenn der Blendenmodus HorizAndVert, Horizontal oder Vertical ist, wird das Sichtfeld verwendet. Wenn der Blendenmodus FocalLength ist, wird die Brennweite verwendet. |
| [CurveDimension](./curvedimension) | Die Dimension der Kurven. |
| [LightType](./lighttype) | Lichtarten. |
| [MappingMode](./mappingmode) | Legt fest, wie das Element auf eine Fläche abgebildet wird. Die[`MappingMode`](../aspose.threed.entities/mappingmode) definiert wie[`VertexElement`](../aspose.threed.entities/vertexelement) wird auf die Oberfläche der Geometrie abgebildet. |
| [NurbsType](./nurbstype) | NURBS-Typen. |
| [PatchDirectionType](./patchdirectiontype) | Patchrichtungstypen. |
| [ProjectionType](./projectiontype) | Projektionstypen der Kamera. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) definiert, wie Zuordnungsinformationen gespeichert und referenziert werden. |
| [RotationMode](./rotationmode) | Rotationsmodus des Kegelstumpfs |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s Typen. |
| [SplitMeshPolicy](./splitmeshpolicy) | Scheitelpunkt-/Kontrollpunktdaten zwischen Submeshs teilen oder jedes Submesh hat seine eigenen komprimierten Daten. |
| [TextureMapping](./texturemapping) | Der Textur-Mapping-Typ für[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Beschreibt, welche Art von Textur-Mapping verwendet wird. |
| [VertexElementType](./vertexelementtype) | Der Typ des Scheitelpunktelements, definiert, wie es bei der Modellierung verwendet wird. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
