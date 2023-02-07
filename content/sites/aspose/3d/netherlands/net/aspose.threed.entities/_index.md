---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D voor .NET API-referentie
description: Alle geometrie en entiteiten zijn gedefinieerd in deze naamruimte
type: docs
weight: 40
url: /nl/net/aspose.threed.entities/
---
Alle geometrie en entiteiten zijn gedefinieerd in deze naamruimte

## Klassen

| Klas | Beschrijving |
| --- | --- |
| [Box](./box/) | Doos. |
| [Camera](./camera/) | De camera beschrijft het gezichtspunt van de kijker die naar de scène kijkt. |
| [Circle](./circle/) | EEN[`Circle`](../aspose.threed.entities/circle/) curve bestaat uit een reeks punten in de rand van de cirkelvorm. |
| [CompositeCurve](./compositecurve/) | EEN[`CompositeCurve`](../aspose.threed.entities/compositecurve/) bestaat uit meerdere curvesegmenten. |
| [Curve](./curve/) | De basisklasse van alle curve-implementaties. |
| [Cylinder](./cylinder/) | Geparametriseerde cilinder. Het kan ook worden gebruikt om de kegel weer te geven wanneer een van radiusTop/radiusBottom nul is. |
| [Dish](./dish/) | Geparametriseerde schotel. |
| [Ellipse](./ellipse/) | Een[`Ellipse`](../aspose.threed.entities/ellipse/)definieert een reeks punten die de vorm van een ellips vormen. |
| [Frustum](./frustum/) | De basisklasse van[`Camera`](../aspose.threed.entities/camera/) En[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | De basisklasse van alle renderbare geometrische objecten (zoals[`Mesh`](../aspose.threed.entities/mesh/) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ,[`Patch`](../aspose.threed.entities/patch/) en etc.). |
| [Light](./light/) | Het licht verlicht de scène. |
| [Line](./line/) | Een polylijn is een pad gedefinieerd door een set punten met[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) , en verbonden door[`Segments`](../aspose.threed.entities/line/segments/) , wat betekent dat het ook een set van verbonden lijnsegmenten kan zijn. De lijn is meestal een lineair object, wat betekent dat het niet kan worden gebruikt om een curve weer te geven, om een curve weer te geven, gebruikt[`NurbsCurve`](../aspose.threed.entities/nurbscurve/) . |
| [LinearExtrusion](./linearextrusion/) | Lineaire extrusie neemt een 2D-vorm als invoer en breidt de vorm uit in de 3e dimensie. |
| [Mesh](./mesh/) | Een mesh is gemaakt van vele n-zijdige polygonen. |
| [NurbsCurve](./nurbscurve/) | [NURBS-curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) is een curve voorgesteld door NURBS(Non-uniform rational basis spline), Een NURBS-curve wordt gedefinieerd door zijn[`Order`](../aspose.threed.entities/nurbscurve/order/) , een set van gewogen[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) en een[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) De w-component in het controlepunt wordt gebruikt als het gewicht van het controlepunt, wat het ook isTwoDimensional ofThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | Een 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) heeft twee richtingen, de[`U`](../aspose.threed.entities/nurbssurface/u/) En[`V`](../aspose.threed.entities/nurbssurface/v/) , de[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/) definieert gegevens voor elke richting. Een richting is eigenlijk een NURBS-curve, wat betekent dat deze ook wordt gedefinieerd door zijn[`Order`](../aspose.threed.entities/nurbsdirection/order/) , A[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) , en een reeks gewogen controlepunten (gedefinieerd in[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ). |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/) is een oppervlak vertegenwoordigd door[NURBS (niet-uniforme rationele basisspline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), Een[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) wordt gedefinieerd door twee[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/) En[`V`](../aspose.threed.entities/nurbssurface/v/) . De w-component in het controlepunt wordt gebruikt als het gewicht van het controlepunt, ongeacht het richtingstype.TwoDimensional ofThreeDimensional |
| [Patch](./patch/) | EEN[`Patch`](../aspose.threed.entities/patch/) is een parametrisch modelleringsoppervlak, vergelijkbaar met[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) , wordt het ook gedefinieerd door twee [`PatchDirection`](../aspose.threed.entities/patchdirection/) , de[`U`](../aspose.threed.entities/patch/u/) En[`V`](../aspose.threed.entities/patch/v/) . Maar verschil tussen[`Patch`](../aspose.threed.entities/patch/) En[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) is dat de[`PatchDirection`](../aspose.threed.entities/patchdirection/) curve kan er een van zijnBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline EnLinear |
| [PatchDirection](./patchdirection/) | Patch's U- en V-richting. |
| [Plane](./plane/) | Geparametriseerd vlak. |
| [PointCloud](./pointcloud/) | De puntenwolk bevat geen topologie-informatie, maar alleen de controlepunten en de vertex-elementen. |
| [PolygonBuilder](./polygonbuilder/) | Een hulpklasse om polygoon voor te bouwen[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | Hulpprogramma's om polygonen te wijzigen |
| [Primitive](./primitive/) | Basisklasse voor alle primitieven |
| [Pyramid](./pyramid/) | Geparametriseerde piramide. |
| [RectangularTorus](./rectangulartorus/) | Geparametriseerde rechthoekige torus. |
| [RevolvedAreaSolid](./revolvedareasolid/) | Deze klasse vertegenwoordigt een solide model door een dwarsdoorsnede van een profiel om een as te draaien. |
| [Shape](./shape/) | De vorm beschrijft de vervorming op een reeks controlepunten, vergelijkbaar met de clustervervormer in Maya. We kunnen bijvoorbeeld een vorm toevoegen aan een gecreëerde geometrie. En de vorm en de geometrie hebben dezelfde topologische informatie maar verschillende positie van de controlepunten. Met verschillende mate van invloed voert de geometrie een vervormingseffect uit. |
| [Skeleton](./skeleton/) | De[`Skeleton`](../aspose.threed.entities/skeleton/)wordt voornamelijk gebruikt door CAD-software om ontwerpers te helpen bij het manipuleren van de transformatie van skeletstructuur, het is meestal nutteloos buiten de CAD-software. Om de skelethiërarchie als één object in CAD-software te laten werken, is het nodig om de top te markeren[`Skeleton`](../aspose.threed.entities/skeleton/) node als de root door instelling[`Type`](../aspose.threed.entities/skeleton/type/) naarSkeleton , en alle kinderen ingesteld opBone |
| [Sphere](./sphere/) | Geparametriseerde bol. |
| [SweptAreaSolid](./sweptareasolid/) | EEN[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/) construeert een geometrie door een profiel langs een richtlijn te vegen. |
| [Torus](./torus/) | Geparametriseerde torus. |
| [TransformedCurve](./transformedcurve/) | EEN[`TransformedCurve`](../aspose.threed.entities/transformedcurve/) geeft een curve een plaatsing door een transformatiematrix te gebruiken. Hiermee kan een transformatie binnen a worden uitgevoerd[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/) of[`CompositeCurve`](../aspose.threed.entities/compositecurve/) . |
| [TriMesh](./trimesh/) | Een TriMesh bevat onbewerkte gegevens die rechtstreeks door de GPU kunnen worden gebruikt. Deze klasse is een hulpprogramma om te helpen bij het construeren van een mesh die alleen gegevens per hoekpunt bevat. |
| [TriMesh&lt;T&gt;](./trimesh-1/) | Algemene versie van[`TriMesh`](../aspose.threed.entities/trimesh/) voor het statisch gedefinieerde hoekpunt van de gebruiker type |
| [TrimmedCurve](./trimmedcurve/) | Een begrensde curve die de basiscurve aan beide uiteinden bijsnijdt. |
| [VertexElement](./vertexelement/) | Basisklasse van hoekpuntelementen. Een hoekpuntelementtype wordt geïdentificeerd door VertexElementType. Een VertexElement beschrijft hoe het vertex-element wordt afgebeeld op een geometrisch oppervlak en hoe de mapping-informatie wordt gerangschikt in het geheugen. Een VertexElement bevat Normals, UV's of andere informatie. |
| [VertexElementBinormal](./vertexelementbinormal/) | Definieert de binnormale vectoren voor gespecificeerde componenten. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | Een hulpklasse voor het definiëren van beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementaties. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | Definieert de randvouw voor gespecificeerde componenten |
| [VertexElementHole](./vertexelementhole/) | Definieert of gespecificeerde polygoon hole is |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | Een hulpklasse voor het definiëren van beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementaties. |
| [VertexElementMaterial](./vertexelementmaterial/) | Definieert materiaalindex voor gespecificeerde componenten. Een knoop kan meerdere materialen hebben, de[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/) wordt gebruikt om verschillende delen van de geometrie in verschillende materialen weer te geven. |
| [VertexElementNormal](./vertexelementnormal/) | Definieert normaalvectoren voor gespecificeerde componenten. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | Definieert polygoongroep voor gespecificeerde componenten om gerelateerde polygonen samen te groeperen. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | Een afvlakkingsgroep is een groep polygonen in een veelhoekmaas die een glad oppervlak zou moeten lijken te vormen. Sommige vroege 3D-modelleringssoftware zoals 3D studio max voor DOS gebruikte afvlakkingsgroep om de opslag van normale vectoren voor elk hoekpunt van het net ongeldig te maken. |
| [VertexElementSpecular](./vertexelementspecular/) | Definieert spiegelende kleur voor gespecificeerde componenten. |
| [VertexElementTangent](./vertexelementtangent/) | Definieert raakvectoren voor gespecificeerde componenten. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | Een hulpklasse voor het definiëren van beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementaties. |
| [VertexElementUserData](./vertexelementuserdata/) | Definieert aangepaste gebruikersgegevens voor gespecificeerde componenten. Meestal zijn het toepassingsspecifieke gegevens voor speciale doeleinden. |
| [VertexElementUV](./vertexelementuv/) | Definieert de UV-coördinaten voor gespecificeerde componenten. Een geometrie kan meerdere[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) elementen, en elk heeft verschillende[`TextureMapping`](../aspose.threed.entities/texturemapping/) s. |
| [VertexElementVector4](./vertexelementvector4/) | Een hulpklasse voor het definiëren van beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementaties. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | Definieert de hoekpuntkleur voor gespecificeerde componenten |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | Definieert de hoekpuntvouw voor gespecificeerde componenten |
| [VertexElementVisibility](./vertexelementvisibility/) | Definieert of gespecificeerde componenten zichtbaar zijn |
| [VertexElementWeight](./vertexelementweight/) | Definieert het mengselgewicht voor gespecificeerde componenten. |
## Structuren

| Structuur | Beschrijving |
| --- | --- |
| [EndPoint](./endpoint/) | Het eindpunt voor het trimmen van de curve kan een parameterwaarde of een Cartesiaans punt zijn. |
## Interfaces

| Koppel | Beschrijving |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | VertexElement met indexgegevens. |
| [IMeshConvertible](./imeshconvertible/) | Entiteiten die deze interface hebben geïmplementeerd, kunnen worden geconverteerd naar[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | Richtbare entiteiten zullen deze interface implementeren. |
## Opsomming

| Opsomming | Beschrijving |
| --- | --- |
| [ApertureMode](./aperturemode/) | Camera-diafragmamodi. De diafragma-modus bepaalt welke waarden het camera-diafragma bepalen. Als de diafragmamodus HorizAndVert, Horizontaal of Verticaal is, wordt het gezichtsveld gebruikt. Als de diafragmamodus FocalLength is, wordt de brandpuntsafstand gebruikt. |
| [CurveDimension](./curvedimension/) | De afmeting van de bochten. |
| [LightType](./lighttype/) | Lichtsoorten. |
| [MappingMode](./mappingmode/) | Bepaalt hoe het element wordt toegewezen aan een oppervlak. De[`MappingMode`](../aspose.threed.entities/mappingmode/) gedefinieerd hoe[`VertexElement`](../aspose.threed.entities/vertexelement/) wordt toegewezen aan het oppervlak van de geometrie. |
| [NurbsType](./nurbstype/) | NURBS-typen. |
| [PatchDirectionType](./patchdirectiontype/) | Typen patchrichtingen. |
| [ProjectionType](./projectiontype/) | Projectietypes camera's. |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) definieert hoe kaartinformatie wordt opgeslagen en waarnaar wordt verwezen door. |
| [RotationMode](./rotationmode/) | De rotatiemodus van de afgeknotte kegel |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) s typen. |
| [SplitMeshPolicy](./splitmeshpolicy/) | Vertex-/controlepuntgegevens delen tussen sub-meshs of elk sub-mesh heeft zijn eigen gecomprimeerde data. |
| [TextureMapping](./texturemapping/) | Het textuurtoewijzingstype voor[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) Beschrijft welk type texture mapping wordt gebruikt. |
| [VertexElementType](./vertexelementtype/) | Het type van het vertex-element, gedefinieerd hoe het zal worden gebruikt in modellering. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
