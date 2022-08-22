---
title: Aspose.ThreeD.Entities
second_title: Referencia de API de Aspose.3D para .NET
description: Toda la geometría y las entidades están definidas en este espacio de nombres
type: docs
weight: 40
url: /es/net/aspose.threed.entities/
---
Toda la geometría y las entidades están definidas en este espacio de nombres

## Clases

| Clase | Descripción |
| --- | --- |
| [Box](./box) | Caja. |
| [Camera](./camera) | La cámara describe el punto de vista del espectador que mira la escena. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) la curva consta de un conjunto de puntos en el borde de la forma del círculo. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) consta de varios segmentos de curva. |
| [Curve](./curve) | La clase base de todas las implementaciones de curvas. |
| [Cylinder](./cylinder) | Cilindro parametrizado. También se puede utilizar para representar el cono cuando uno de radiusTop/radiusBottom es cero. |
| [Dish](./dish) | Plato parametrizado. |
| [Ellipse](./ellipse) | Un[`Ellipse`](../aspose.threed.entities/ellipse)define un conjunto de puntos que forman la forma de elipse. |
| [Frustum](./frustum) | La clase base de[`Camera`](../aspose.threed.entities/camera) y[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | La clase base de todos los objetos geométricos renderizables (como[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) y etc.). |
| [Light](./light) | La luz ilumina la escena. |
| [Line](./line) | Una polilínea es un camino definido por un conjunto de puntos con[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , y conectado por[`Segments`](../aspose.threed.entities/line/segments) , lo que significa que también puede ser un conjunto de segmentos de línea conectados. La línea suele ser un objeto lineal, lo que significa que no se puede usar para representar una curva, para representar una curva, usa[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | La extrusión lineal toma una forma 2D como entrada y extiende la forma en la tercera dimensión. |
| [Mesh](./mesh) | Una malla está formada por muchos polígonos de n lados. |
| [NurbsCurve](./nurbscurve) | [Curva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) es una curva representada por NURBS (spline de base racional no uniforme), Una curva NURBS se define por su[`Order`](../aspose.threed.entities/nurbscurve/order) , un conjunto de pesos[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) y un[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) El componente w en el punto de control se usa como peso del punto de control, cualquiera que sea unTwoDimensional oThreeDimensional |
| [NurbsDirection](./nurbsdirection) | Un 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) tiene dos direcciones, la[`U`](../aspose.threed.entities/nurbssurface/u) y[`V`](../aspose.threed.entities/nurbssurface/v) , la[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) define datos para cada dirección. Una dirección es en realidad una curva NURBS, eso significa que también está definida por su[`Order`](../aspose.threed.entities/nurbsdirection/order) , a[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , y un conjunto de puntos de control ponderados (definidos en[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) es una superficie representada por[NURBS (spline de base racional no uniforme)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) se define por dos[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) y[`V`](../aspose.threed.entities/nurbssurface/v) . El componente w en el punto de control se usa como peso del punto de control cualquiera que sea el tipo de dirección que seaTwoDimensional oThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) es una superficie de modelado paramétrico, similar a[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , también está definido por dos [`PatchDirection`](../aspose.threed.entities/patchdirection) , la[`U`](../aspose.threed.entities/patch/u) y[`V`](../aspose.threed.entities/patch/v) . Pero diferencia entre[`Patch`](../aspose.threed.entities/patch) y[`NurbsSurface`](../aspose.threed.entities/nurbssurface) es que el[`PatchDirection`](../aspose.threed.entities/patchdirection) la curva puede ser una deBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline yLinear |
| [PatchDirection](./patchdirection) | Dirección U y V del parche. |
| [Plane](./plane) | Plano parametrizado. |
| [PointCloud](./pointcloud) | La nube de puntos no contiene información de topología, solo los puntos de control y los elementos de vértice. |
| [PolygonBuilder](./polygonbuilder) | Una clase auxiliar para construir polígonos para[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Utilidades para modificar polígonos |
| [Primitive](./primitive) | Clase base para todas las primitivas |
| [Pyramid](./pyramid) | Pirámide parametrizada. |
| [RectangularTorus](./rectangulartorus) | Toro rectangular parametrizado. |
| [RevolvedAreaSolid](./revolvedareasolid) | Esta clase representa un modelo sólido girando una sección transversal proporcionada por un perfil alrededor de un eje. |
| [Shape](./shape) | La forma describe la deformación en un conjunto de puntos de control, que es similar al deformador de clúster en Maya. Por ejemplo, podemos agregar una forma a una geometría creada. Y la forma y la geometría tienen la misma información topológica pero diferente posición de los puntos de control. Con cantidades variables de influencia, la geometría realiza un efecto de deformación. |
| [Skeleton](./skeleton) | El[`Skeleton`](../aspose.threed.entities/skeleton)es utilizado principalmente por el software CAD para ayudar al diseñador a manipular la transformación de la estructura del esqueleto, generalmente es inútil fuera de los softwares CAD. Para hacer que la jerarquía del esqueleto actúe como un objeto en el software CAD, es necesario marcar la parte superior[`Skeleton`](../aspose.threed.entities/skeleton) nodo como el raíz estableciendo[`Type`](../aspose.threed.entities/skeleton/type) aSkeleton , y todos los hijos establecidos enBone |
| [Sphere](./sphere) | Esfera parametrizada. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) construye una geometría mediante el barrido de un perfil a lo largo de una directriz. |
| [Torus](./torus) | Toro parametrizado. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) le da a una curva una ubicación usando una matriz de transformación. Esto permite realizar una transformación dentro de una[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) o[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | Un TriMesh contiene datos sin procesar que la GPU puede usar directamente. Esta clase es una utilidad para ayudar a construir una malla que solo contiene datos por vértice. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Versión genérica de[`TriMesh`](../aspose.threed.entities/trimesh) para el vértice definido estático del usuario type |
| [TrimmedCurve](./trimmedcurve) | Una curva acotada que recortó la curva base en ambos extremos. |
| [VertexElement](./vertexelement) | Clase base de elementos de vértice. Un tipo de elemento de vértice se identifica mediante VertexElementType. Un VertexElement describe cómo se asigna el elemento de vértice a una superficie geométrica y cómo se organiza la información de asignación en la memoria. Un VertexElement contiene Normales, UV u otro tipo de información. |
| [VertexElementBinormal](./vertexelementbinormal) | Define los vectores binormales para componentes especificados. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Una clase auxiliar para definir hormigón[`VertexElement`](../aspose.threed.entities/vertexelement) implementaciones. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Define el pliegue del borde para componentes especificados |
| [VertexElementHole](./vertexelementhole) | Define si el polígono especificado es hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Una clase auxiliar para definir hormigón[`VertexElement`](../aspose.threed.entities/vertexelement) implementaciones. |
| [VertexElementMaterial](./vertexelementmaterial) | Define el índice de material para componentes específicos. Un nodo puede tener múltiples materiales, el[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) se utiliza para renderizar diferentes partes de la geometría en diferentes materiales. |
| [VertexElementNormal](./vertexelementnormal) | Define vectores normales para componentes especificados. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Define un grupo de polígonos para componentes específicos para agrupar polígonos relacionados. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Un grupo de suavizado es un grupo de polígonos en una malla poligonal que debería parecer formar una superficie suave. Algunos de los primeros software de modelado 3D, como 3D Studio Max para DOS, usaban el grupo de suavizado para anular el almacenamiento de vectores normales para cada vértice de malla. |
| [VertexElementSpecular](./vertexelementspecular) | Define el color especular para componentes específicos. |
| [VertexElementTangent](./vertexelementtangent) | Define vectores tangentes para componentes especificados. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Una clase auxiliar para definir hormigón[`VertexElement`](../aspose.threed.entities/vertexelement) implementaciones. |
| [VertexElementUserData](./vertexelementuserdata) | Define datos de usuario personalizados para componentes específicos. Por lo general, son datos específicos de la aplicación para fines especiales. |
| [VertexElementUV](./vertexelementuv) | Define las coordenadas UV para componentes específicos. Una geometría puede tener múltiples[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) elementos, y cada uno tiene diferentes[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | Una clase auxiliar para definir hormigón[`VertexElement`](../aspose.threed.entities/vertexelement) implementaciones. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Define el color del vértice para componentes especificados |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Define el pliegue del vértice para componentes especificados |
| [VertexElementVisibility](./vertexelementvisibility) | Define si los componentes especificados son visibles |
| [VertexElementWeight](./vertexelementweight) | Define el peso de mezcla para componentes específicos. |
## Interfaces

| Interfaz | Descripción |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement con datos de índices. |
| [IMeshConvertible](./imeshconvertible) | Las entidades que implementaron esta interfaz se pueden convertir a[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Las entidades orientables implementarán esta interfaz. |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [ApertureMode](./aperturemode) | Modos de apertura de la cámara. El modo de apertura determina qué valores controlan la apertura de la cámara. Si el modo de apertura es HorizAndVert, Horizontal o Vertical, se utiliza el campo de visión. Si el modo de apertura es FocalLength, entonces se usa la distancia focal. |
| [CurveDimension](./curvedimension) | La dimensión de las curvas. |
| [LightType](./lighttype) | Tipos de luz. |
| [MappingMode](./mappingmode) | Determina cómo se asigna el elemento a una superficie. El[`MappingMode`](../aspose.threed.entities/mappingmode) definió cómo[`VertexElement`](../aspose.threed.entities/vertexelement) se asigna a la superficie de geometría. |
| [NurbsType](./nurbstype) | Tipos NURBS. |
| [PatchDirectionType](./patchdirectiontype) | Tipos de dirección de parche. |
| [ProjectionType](./projectiontype) | Tipos de proyección de la cámara. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) define cómo la información de mapeo es almacenada y referenciada por. |
| [RotationMode](./rotationmode) | Modo de rotación del tronco |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s tipos. |
| [SplitMeshPolicy](./splitmeshpolicy) | Compartir datos de vértices/puntos de control entre submallas o cada submalla tiene sus propios datos compactados. |
| [TextureMapping](./texturemapping) | El tipo de mapeo de textura para[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Describe qué tipo de mapeo de textura se usa. |
| [VertexElementType](./vertexelementtype) | El tipo del elemento de vértice, definido cómo se utilizará en el modelado. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
