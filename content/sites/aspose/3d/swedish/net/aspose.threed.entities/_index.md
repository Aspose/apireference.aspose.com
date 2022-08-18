---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D för .NET API-referens
description: All geometri och entiteter definieras i detta namnutrymme
type: docs
weight: 40
url: /sv/net/aspose.threed.entities/
---
All geometri och entiteter definieras i detta namnutrymme

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [Box](./box) | Box. |
| [Camera](./camera) | Kameran beskriver ögonpunkten för betraktaren som tittar på scenen. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) kurvan består av en uppsättning punkter i kanten av cirkelformen. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) består av flera kurvsegment. |
| [Curve](./curve) | Basklassen för alla kurvimplementationer. |
| [Cylinder](./cylinder) | Parameterized Cylinder. Den kan också användas för att representera konen när en av radiusTop/radiusBottom är noll. |
| [Dish](./dish) | Parameteriserad skål. |
| [Ellipse](./ellipse) | An[`Ellipse`](../aspose.threed.entities/ellipse)definierar en uppsättning punkter som bildar formen av ellips. |
| [Frustum](./frustum) | Basklassen för[`Camera`](../aspose.threed.entities/camera) och[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | Basklassen för alla renderbara geometriska objekt (som[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) och etc.). |
| [Light](./light) | Ljuset lyser upp scenen. |
| [Line](./line) | En polylinje är en bana som definieras av en uppsättning punkter med[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , och ansluten av[`Segments`](../aspose.threed.entities/line/segments) , vilket betyder att det också kan vara en uppsättning anslutna linjesegment. Linjen är vanligtvis ett linjärt objekt, vilket betyder att den inte kan användas för att representera en kurva, för att representera en kurva, använder[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | Linjär extrudering tar en 2D-form som indata och utökar formen i den tredje dimensionen. |
| [Mesh](./mesh) | Ett nät består av många n-sidiga polygoner. |
| [NurbsCurve](./nurbscurve) | [NURBS-kurva](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) är en kurva representerad av NURBS(Non-uniform rational basis spline), En NURBS-kurva definieras av dess[`Order`](../aspose.threed.entities/nurbscurve/order) , en uppsättning av viktade[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) och a[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) W-komponenten i kontrollpunkten används som kontrollpunktens vikt, oavsett vad det är enTwoDimensional ellerThreeDimensional |
| [NurbsDirection](./nurbsdirection) | En 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) har två riktningar, den[`U`](../aspose.threed.entities/nurbssurface/u) och[`V`](../aspose.threed.entities/nurbssurface/v) , den[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) definierar data för varje riktning. En riktning är faktiskt en NURBS-kurva, det betyder att den också definieras av dess[`Order`](../aspose.threed.entities/nurbsdirection/order) , a[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , och en uppsättning viktade kontrollpunkter (definierad i[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) är en yta representerad av[NURBS(Icke-enhetlig rationell grundspline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) definieras av två[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) och[`V`](../aspose.threed.entities/nurbssurface/v) . W-komponenten i kontrollpunkten används som kontrollpunktens vikt oavsett riktningens typ är enTwoDimensional ellerThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) är en parametrisk modelleringsyta, liknande[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , det definieras också av två [`PatchDirection`](../aspose.threed.entities/patchdirection) , den[`U`](../aspose.threed.entities/patch/u) och[`V`](../aspose.threed.entities/patch/v) . Men skillnad mellan[`Patch`](../aspose.threed.entities/patch) och[`NurbsSurface`](../aspose.threed.entities/nurbssurface) är det[`PatchDirection`](../aspose.threed.entities/patchdirection) kurvan kan vara en avBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline ochLinear |
| [PatchDirection](./patchdirection) | Patchs U- och V-riktning. |
| [Plane](./plane) | Parameteriserat plan. |
| [PointCloud](./pointcloud) | Punktmolnet innehåller ingen topologiinformation utan bara kontrollpunkterna och vertexelementen. |
| [PolygonBuilder](./polygonbuilder) | En hjälpklass att bygga polygon för[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Verktyg för att ändra polygoner |
| [Primitive](./primitive) | Basklass för alla primitiver |
| [Pyramid](./pyramid) | Parameteriserad pyramid. |
| [RectangularTorus](./rectangulartorus) | Parameteriserad rektangulär torus. |
| [RevolvedAreaSolid](./revolvedareasolid) | Denna klass representerar en solid modell genom att vrida ett tvärsnitt som tillhandahålls av en profil runt en axel. |
| [Shape](./shape) | Formen beskriver deformationen på en uppsättning kontrollpunkter, som liknar klusterdeformeraren i Maya. Till exempel kan vi lägga till en form till en skapad geometri. Och formen och geometrin har samma topologiska information men olika position för kontrollpunkterna. Med varierande påverkan utför geometrin en deformationseffekt. |
| [Skeleton](./skeleton) | Den[`Skeleton`](../aspose.threed.entities/skeleton)används huvudsakligen av CAD-mjukvara för att hjälpa designern att manipulera omvandlingen av skelettstrukturen, den är vanligtvis värdelös utanför CAD-mjukvaran. För att få skeletthierarkin att fungera som ett objekt i CAD-programvaran är det nödvändigt att markera toppen[`Skeleton`](../aspose.threed.entities/skeleton) nod som roten genom inställning[`Type`](../aspose.threed.entities/skeleton/type) tillSkeleton , och alla barn inställda påBone |
| [Sphere](./sphere) | Parameteriserad sfär. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) konstruerar en geometri genom att svepa en profil längs en riktlinje. |
| [Torus](./torus) | Parameteriserad torus. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) ger en kurva en placering genom att använda en transformationsmatris. Detta gör det möjligt att utföra en transformation inuti en[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) eller[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | En TriMesh innehåller rådata som kan användas av GPU direkt. Den här klassen är ett verktyg för att hjälpa till att konstruera ett nät som bara innehåller per-vertex-data. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Generisk version av[`TriMesh`](../aspose.threed.entities/trimesh) för användarens statiskt definierade vertex type |
| [TrimmedCurve](./trimmedcurve) | En avgränsad kurva som trimmade baskurvan i båda ändar. |
| [VertexElement](./vertexelement) | Basklass av vertexelement. En vertexelementtyp identifieras av VertexElementType. Ett VertexElement beskriver hur vertexelementet mappas till en geometriyta och hur kartläggningsinformationen är ordnad i minnet. Ett VertexElement innehåller normala, UV eller annan typ av information. |
| [VertexElementBinormal](./vertexelementbinormal) | Definierar de binormala vektorerna för specificerade komponenter. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | En hjälpklass för att definiera betong[`VertexElement`](../aspose.threed.entities/vertexelement) implementeringar. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Definierar kantvecket för specificerade komponenter |
| [VertexElementHole](./vertexelementhole) | Definierar om specificerad polygon är hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | En hjälpklass för att definiera betong[`VertexElement`](../aspose.threed.entities/vertexelement) implementeringar. |
| [VertexElementMaterial](./vertexelementmaterial) | Definierar materialindex för specificerade komponenter. En nod kan ha flera material,[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) används för att återge olika delar av geometrin i olika material. |
| [VertexElementNormal](./vertexelementnormal) | Definierar normala vektorer för specificerade komponenter. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Definierar polygongrupp för specificerade komponenter för att gruppera relaterade polygoner tillsammans. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | En utjämningsgrupp är en grupp av polygoner i ett polygonnät som ska verka bilda en slät yta. Vissa tidiga 3d-modelleringsprogram som 3D studio max för DOS använde utjämningsgrupp för att ogiltigförklara lagring av normalvektor för varje nätvertex. |
| [VertexElementSpecular](./vertexelementspecular) | Definierar spegelfärg för specificerade komponenter. |
| [VertexElementTangent](./vertexelementtangent) | Definierar tangentvektorer för specificerade komponenter. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | En hjälpklass för att definiera betong[`VertexElement`](../aspose.threed.entities/vertexelement) implementeringar. |
| [VertexElementUserData](./vertexelementuserdata) | Definierar anpassade användardata för specificerade komponenter. Vanligtvis är det applikationsspecifika data för speciella ändamål. |
| [VertexElementUV](./vertexelementuv) | Definierar UV-koordinaterna för specificerade komponenter. En geometri kan ha flera[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) element, och var och en har olika[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | En hjälpklass för att definiera betong[`VertexElement`](../aspose.threed.entities/vertexelement) implementeringar. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Definierar vertexfärgen för specificerade komponenter |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Definierar vertexvecket för specificerade komponenter |
| [VertexElementVisibility](./vertexelementvisibility) | Definierar om specificerade komponenter är synliga |
| [VertexElementWeight](./vertexelementweight) | Definierar blandningsvikt för specificerade komponenter. |
## Gränssnitt

| Gränssnitt | Beskrivning |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement med indexdata. |
| [IMeshConvertible](./imeshconvertible) | Enheter som implementerade detta gränssnitt kan konverteras till[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Orienterbara enheter ska implementera detta gränssnitt. |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [ApertureMode](./aperturemode) | Kamerabländarlägen. Bländarläget bestämmer vilka värden som driver kamerans bländare. Om bländarläget är HorizAndVert, Horizontal eller Vertical, används synfältet. Om bländarläget är FocalLength, används brännvidden. |
| [CurveDimension](./curvedimension) | Måtten på kurvorna. |
| [LightType](./lighttype) | Ljustyper. |
| [MappingMode](./mappingmode) | Bestämmer hur elementet mappas till en yta. Den[`MappingMode`](../aspose.threed.entities/mappingmode) definierat hur[`VertexElement`](../aspose.threed.entities/vertexelement) är mappad till ytan av geometri. |
| [NurbsType](./nurbstype) | NURBS-typer. |
| [PatchDirectionType](./patchdirectiontype) | Patchriktningstyper. |
| [ProjectionType](./projectiontype) | Kamerans projektionstyper. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) definierar hur kartinformation lagras och refereras av. |
| [RotationMode](./rotationmode) | Frustums rotationsläge |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s typer. |
| [SplitMeshPolicy](./splitmeshpolicy) | Dela vertex-/kontrollpunktsdata mellan sub-mesh eller varje sub-mesh har sina egna komprimerade data. |
| [TextureMapping](./texturemapping) | Texturmappningstypen för[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Beskriver vilken typ av texturmappning som används. |
| [VertexElementType](./vertexelementtype) | Typen av vertexelement, definierade hur det kommer att användas i modellering. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
