---
title: Aspose.ThreeD.Entities
second_title: Référence de l'API Aspose.3D pour .NET
description: Toutes les géométries et entités sont définies dans cet espace de noms
type: docs
weight: 40
url: /fr/net/aspose.threed.entities/
---
Toutes les géométries et entités sont définies dans cet espace de noms

## Des classes

| Classer | La description |
| --- | --- |
| [Box](./box) | Boîte. |
| [Camera](./camera) | La caméra décrit le point de vue du spectateur regardant la scène. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) courbe se compose d'un ensemble de points dans le bord de la forme du cercle. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) se compose de plusieurs segments de courbe. |
| [Curve](./curve) | La classe de base de toutes les implémentations de courbes. |
| [Cylinder](./cylinder) | Cylindre paramétré. Il peut également être utilisé pour représenter le cône lorsque l'un de radiusTop/radiusBottom est égal à zéro. |
| [Dish](./dish) | Parabole paramétrée. |
| [Ellipse](./ellipse) | Un[`Ellipse`](../aspose.threed.entities/ellipse)définit un ensemble de points qui forment la forme d'ellipse. |
| [Frustum](./frustum) | La classe de base de[`Camera`](../aspose.threed.entities/camera) et[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | La classe de base de tous les objets géométriques rendus (comme[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) et etc.). |
| [Light](./light) | La lumière éclaire la scène. |
| [Line](./line) | Une polyligne est un chemin défini par un ensemble de points avec[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , et relié par[`Segments`](../aspose.threed.entities/line/segments) , ce qui signifie qu'il peut également s'agir d'un ensemble de segments de ligne connectés. La ligne est généralement un objet linéaire, ce qui signifie qu'elle ne peut pas être utilisée pour représenter une courbe, afin de représenter une courbe, utilise[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | L'extrusion linéaire prend une forme 2D en entrée et étend la forme dans la 3ème dimension. |
| [Mesh](./mesh) | Un maillage est constitué de nombreux polygones à n côtés. |
| [NurbsCurve](./nurbscurve) | [Courbe NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) est une courbe représentée par NURBS(Non-uniform rational based spline), Une courbe NURBS est définie par sa[`Order`](../aspose.threed.entities/nurbscurve/order) , un ensemble de pondérations[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) et un[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) La composante w du point de contrôle est utilisée comme poids du point de contrôle, quel qu'il soitTwoDimensional ouThreeDimensional |
| [NurbsDirection](./nurbsdirection) | Une 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) a deux sens, le[`U`](../aspose.threed.entities/nurbssurface/u) et[`V`](../aspose.threed.entities/nurbssurface/v) , la[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) définit les données pour chaque direction. Une direction est en fait une courbe NURBS, cela signifie qu'elle est également définie par sa[`Order`](../aspose.threed.entities/nurbsdirection/order) , un[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , et un ensemble de points de contrôle pondérés (définis dans[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) est une surface représentée par[NURBS (spline de base rationnelle non uniforme)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) est défini par deux[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) et[`V`](../aspose.threed.entities/nurbssurface/v) . La composante w du point de contrôle est utilisée comme poids du point de contrôle quel que soit le type de directionTwoDimensional ouThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) est une surface de modélisation paramétrique, similaire à[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , il est également défini par deux [`PatchDirection`](../aspose.threed.entities/patchdirection) , la[`U`](../aspose.threed.entities/patch/u) et[`V`](../aspose.threed.entities/patch/v) . Mais différence entre[`Patch`](../aspose.threed.entities/patch) et[`NurbsSurface`](../aspose.threed.entities/nurbssurface) est-ce le[`PatchDirection`](../aspose.threed.entities/patchdirection) la courbe peut être l'une desBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline etLinear |
| [PatchDirection](./patchdirection) | Direction U et V du patch. |
| [Plane](./plane) | Plan paramétré. |
| [PointCloud](./pointcloud) | Le nuage de points ne contient aucune information de topologie mais uniquement les points de contrôle et les éléments de sommet. |
| [PolygonBuilder](./polygonbuilder) | Une classe d'assistance pour construire un polygone pour[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Utilitaires pour modifier les polygones |
| [Primitive](./primitive) | Classe de base pour toutes les primitives |
| [Pyramid](./pyramid) | Pyramide paramétrée. |
| [RectangularTorus](./rectangulartorus) | Tore rectangulaire paramétré. |
| [RevolvedAreaSolid](./revolvedareasolid) | Cette classe représente un modèle solide en faisant tourner une section transversale fournie par un profil autour d'un axe. |
| [Shape](./shape) | La forme décrit la déformation sur un ensemble de points de contrôle, ce qui est similaire au déformateur de cluster dans Maya. Par exemple, nous pouvons ajouter une forme à une géométrie créée. Et la forme et la géométrie ont la même information topologique mais une position différente des points de contrôle. Avec des quantités variables d'influence, la géométrie effectue un effet de déformation. |
| [Skeleton](./skeleton) | Le[`Skeleton`](../aspose.threed.entities/skeleton)est principalement utilisé par les logiciels de CAO pour aider le concepteur à manipuler la transformation de la structure du squelette, il est généralement inutile en dehors des logiciels de CAO. Pour que la hiérarchie du squelette agisse comme un seul objet dans le logiciel de CAO, il est nécessaire de marquer le haut[`Skeleton`](../aspose.threed.entities/skeleton) nœud comme racine en définissant[`Type`](../aspose.threed.entities/skeleton/type) àSkeleton , et tous les enfants définis surBone |
| [Sphere](./sphere) | Sphère paramétrée. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) construit une géométrie en balayant un profil le long d'une directrice. |
| [Torus](./torus) | Tore paramétré. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) donne à une courbe un placement en utilisant une matrice de transformation. Cela permet d'effectuer une transformation à l'intérieur d'un[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) ou[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | Un TriMesh contient des données brutes qui peuvent être utilisées directement par le GPU. Cette classe est un utilitaire pour aider à construire un maillage qui ne contient que des données par sommet. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Version générique de[`TriMesh`](../aspose.threed.entities/trimesh) pour le type de sommet défini statiquement de l'utilisateur |
| [TrimmedCurve](./trimmedcurve) | Une courbe bornée qui a coupé la courbe de base aux deux extrémités. |
| [VertexElement](./vertexelement) | Classe de base des éléments de sommet. Un type d'élément de sommet est identifié par VertexElementType. Un VertexElement décrit comment l'élément de sommet est mappé sur une surface géométrique et comment les informations de mappage sont organisées en mémoire. Un VertexElement contient des normales, des UV ou d'autres types d'informations. |
| [VertexElementBinormal](./vertexelementbinormal) | Définit les vecteurs binormaux pour les composants spécifiés. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Une classe d'assistance pour définir le béton[`VertexElement`](../aspose.threed.entities/vertexelement) implémentations. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Définit le pli de bord pour les composants spécifiés |
| [VertexElementHole](./vertexelementhole) | Définit si le polygone spécifié est trou |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Une classe d'assistance pour définir le béton[`VertexElement`](../aspose.threed.entities/vertexelement) implémentations. |
| [VertexElementMaterial](./vertexelementmaterial) | Définit l'indice de matériau pour les composants spécifiés. Un nœud peut avoir plusieurs matériaux, le[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) est utilisé pour rendre différentes parties de la géométrie dans différents matériaux. |
| [VertexElementNormal](./vertexelementnormal) | Définit les vecteurs normaux pour les composants spécifiés. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Définit le groupe de polygones pour les composants spécifiés afin de regrouper les polygones associés. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Un groupe de lissage est un groupe de polygones dans un maillage de polygone qui devrait apparaître pour former une surface lisse. Certains premiers logiciels de modélisation 3D comme 3D studio max pour DOS utilisaient un groupe de lissage pour éviter de stocker le vecteur normal pour chaque sommet de maillage. |
| [VertexElementSpecular](./vertexelementspecular) | Définit la couleur spéculaire pour les composants spécifiés. |
| [VertexElementTangent](./vertexelementtangent) | Définit les vecteurs tangents pour les composants spécifiés. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Une classe d'assistance pour définir le béton[`VertexElement`](../aspose.threed.entities/vertexelement) implémentations. |
| [VertexElementUserData](./vertexelementuserdata) | Définit les données utilisateur personnalisées pour les composants spécifiés. Il s'agit généralement de données spécifiques à l'application à des fins particulières. |
| [VertexElementUV](./vertexelementuv) | Définit les coordonnées UV des composants spécifiés. Une géométrie peut avoir plusieurs[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) éléments, et chacun a différents[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | Une classe d'assistance pour définir le béton[`VertexElement`](../aspose.threed.entities/vertexelement) implémentations. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Définit la couleur du sommet pour les composants spécifiés |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Définit le pli du sommet pour les composants spécifiés |
| [VertexElementVisibility](./vertexelementvisibility) | Définit si les composants spécifiés sont visibles |
| [VertexElementWeight](./vertexelementweight) | Définit le poids du mélange pour les composants spécifiés. |
## Interfaces

| Interface | La description |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement avec données d'index. |
| [IMeshConvertible](./imeshconvertible) | Les entités qui ont implémenté cette interface peuvent être converties en[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Les entités orientables doivent implémenter cette interface. |
## Énumération

| Énumération | La description |
| --- | --- |
| [ApertureMode](./aperturemode) | Modes d'ouverture de l'appareil photo. Le mode d'ouverture détermine les valeurs qui déterminent l'ouverture de l'appareil photo. Si le mode d'ouverture est HorizAndVert, Horizontal ou Vertical, le champ de vision est utilisé. Si le mode d'ouverture est FocalLength, alors la distance focale est utilisée. |
| [CurveDimension](./curvedimension) | La dimension des courbes. |
| [LightType](./lighttype) | Types de lumière. |
| [MappingMode](./mappingmode) | Détermine comment l'élément est mappé sur une surface. Le[`MappingMode`](../aspose.threed.entities/mappingmode) défini comment[`VertexElement`](../aspose.threed.entities/vertexelement) est mappé à la surface de la géométrie. |
| [NurbsType](./nurbstype) | types NURBS. |
| [PatchDirectionType](./patchdirectiontype) | Types de sens de patch. |
| [ProjectionType](./projectiontype) | Types de projection de la caméra. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) définit comment les informations de mappage sont stockées et référencées par. |
| [RotationMode](./rotationmode) | Le mode de rotation du tronc |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s types. |
| [SplitMeshPolicy](./splitmeshpolicy) | Partagez les données des sommets/points de contrôle entre les sous-maillages ou chaque sous-maillage a ses propres données compactées. |
| [TextureMapping](./texturemapping) | Le type de mappage de texture pour[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Décrit le type de mappage de texture utilisé. |
| [VertexElementType](./vertexelementtype) | Le type de l'élément sommet, défini comment il sera utilisé dans la modélisation. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
