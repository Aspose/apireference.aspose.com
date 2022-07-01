---
title: Aspose.ThreeD.Entities
second_title: Справочник по Aspose.3D для .NET API
description: Вся геометрия и объекты определены в этом пространстве имен
type: docs
weight: 40
url: /ru/net/aspose.threed.entities/
---
Вся геометрия и объекты определены в этом пространстве имен

## Классы

| Учебный класс | Описание |
| --- | --- |
| [Box](./box) | Коробка. |
| [Camera](./camera) | Камера описывает точку зрения зрителя, смотрящего на сцену. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle)кривая состоит из набора точек на краю формы круга. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve)состоит из нескольких сегментов кривой. |
| [Curve](./curve) | Базовый класс всех реализаций кривых. |
| [Cylinder](./cylinder) | Цилиндр с параметрами. Его также можно использовать для представления конуса, когда одно из значений radiusTop/radiusBottom равно нулю. |
| [Dish](./dish) | Параметризованная тарелка. |
| [Ellipse](./ellipse) | An[`Ellipse`](../aspose.threed.entities/ellipse)определяет набор точек, формирующих форму эллипса. |
| [Frustum](./frustum) | Базовый класс[`Camera`](../aspose.threed.entities/camera)иСвет |
| [Geometry](./geometry) | Базовый класс всех визуализируемых геометрических объектов (таких как[`Mesh`](../aspose.threed.entities/mesh),[`NurbsSurface`](../aspose.threed.entities/nurbssurface),[`Patch`](../aspose.threed.entities/patch)и т. д.). |
| [Light](./light) | Свет освещает сцену. |
| [Line](./line) | Ломаная линия — это путь, определяемый набором точек с[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints)и соединенный[`Segments`](../aspose.threed.entities/line/segments), что означает, что это также может быть набор соединенных отрезков. Линия обычно представляет собой линейный объект, что означает, что ее нельзя использовать для представления кривой, для представления кривой используется[`NurbsCurve`](../aspose.threed.entities/nurbscurve). |
| [LinearExtrusion](./linearextrusion) | Линейное выдавливание принимает 2D-форму в качестве входных данных и расширяет форму в 3-м измерении. |
| [Mesh](./mesh) | Сетка состоит из множества n-сторонних полигонов. |
| [NurbsCurve](./nurbscurve) | [Кривая NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) — это кривая, представленная NURBS( Неравномерный рациональный базисный сплайн), Кривая NURBS определяется ее[`Order`](../aspose.threed.entities/nurbscurve/order), набором взвешенных[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints)и[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) Компонент w в контрольной точке используется как вес контрольной точки, что бы это ни былоTwoDimensionalилиThreeDimensional |
| [NurbsDirection](./nurbsdirection) | A 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface)имеет два направления,[`U`](../aspose.threed.entities/nurbssurface/u)и[`V`](../aspose.threed.entities/nurbssurface/v),[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)определяет данные для каждое направление. Направление на самом деле является NURBS-кривой, что означает, что оно также определяется его[`Order`](../aspose.threed.entities/nurbsdirection/order), a[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors)и набор взвешенных контрольных точек (определенных в[`NurbsSurface`](../aspose.threed.entities/nurbssurface)). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface)— поверхность, представленная[NURBS(Неоднородный рациональный базисный сплайн)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) , A[`NurbsSurface`](../aspose.threed.entities/nurbssurface)определен двумя[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u)иV. Компонент w в контрольной точке используется как вес контрольной точки независимо от типа направления:TwoDimensionalилиThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch)— это поверхность параметрического моделирования, похожая на[`NurbsSurface`](../aspose.threed.entities/nurbssurface), он также определяется двумя [`PatchDirection`](../aspose.threed.entities/patchdirection),[`U`](../aspose.threed.entities/patch/u)и[`V`](../aspose.threed.entities/patch/v). Но разница между[`Patch`](../aspose.threed.entities/patch)и[`NurbsSurface`](../aspose.threed.entities/nurbssurface)это то, что[`PatchDirection`](../aspose.threed.entities/patchdirection)curve может быть одним изBezier,QuadraticBezier,BasisSpline,CardinalSplineиLinear |
| [PatchDirection](./patchdirection) | Направление патча U и V. |
| [Plane](./plane) | Параметризованная плоскость. |
| [PointCloud](./pointcloud) | Облако точек не содержит информации о топологии, а содержит только контрольные точки и элементы вершин. |
| [PolygonBuilder](./polygonbuilder) | Вспомогательный класс для построения полигона для[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Утилиты для модификации полигонов |
| [Primitive](./primitive) | Базовый класс для всех примитивов |
| [Pyramid](./pyramid) | Параметризованная пирамида. |
| [RectangularTorus](./rectangulartorus) | Параметризованный прямоугольный тор. |
| [RevolvedAreaSolid](./revolvedareasolid) | Этот класс представляет твердотельную модель путем вращения поперечного сечения профиля вокруг оси. |
| [Shape](./shape) | Форма описывает деформацию на наборе контрольных точек, аналогичную кластерному деформатору в Maya. Например, мы можем добавить форму к созданной геометрии. И форма, и геометрия имеют одинаковую топологическую информацию, но разное положение контрольных точек. При различной степени влияния геометрия выполняет эффект деформации. |
| [Skeleton](./skeleton) | [`Skeleton`](../aspose.threed.entities/skeleton)в основном используется программным обеспечением САПР, чтобы помочь дизайнеру манипулировать преобразованием скелетной структуры, обычно это бесполезно вне программного обеспечения САПР. Чтобы иерархия скелета действовала как один объект в САПР, необходимо пометить верхний узел[`Skeleton`](../aspose.threed.entities/skeleton)как корневой, установив[`Type`](../aspose.threed.entities/skeleton/type)toSkeleton, и все дочерние элементы установить вBone |
| [Sphere](./sphere) | Параметризованная сфера. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid)строит геометрию, проводя профиль вдоль направляющей. |
| [Torus](./torus) | Параметризованный тор. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve)задает положение кривой с помощью матрицы преобразования. Это позволяет выполнять преобразование внутри[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve)или[`CompositeCurve`](../aspose.threed.entities/compositecurve). |
| [TriMesh](./trimesh) | TriMesh содержит необработанные данные, которые могут напрямую использоваться графическим процессором. Этот класс представляет собой утилиту, помогающую построить сетку, содержащую только данные для каждой вершины. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Общая версия[`TriMesh`](../aspose.threed.entities/trimesh)для пользовательского статического типа вершин |
| [TrimmedCurve](./trimmedcurve) | Ограниченная кривая, обрезающая базисную кривую с обоих концов. |
| [VertexElement](./vertexelement) | Базовый класс вершинных элементов. Тип элемента вершины идентифицируется VertexElementType. VertexElement описывает, как элемент вершины отображается на геометрическую поверхность и как информация об отображении размещается в памяти. VertexElement содержит нормали, UV и другую информацию. |
| [VertexElementBinormal](./vertexelementbinormal) | Определяет векторы бинормалей для указанных компонентов. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Вспомогательный класс для определения конкретных реализаций[`VertexElement`](../aspose.threed.entities/vertexelement). |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Определяет изгиб края для указанных компонентов |
| [VertexElementHole](./vertexelementhole) | Определяет, является ли указанный полигон дырой |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Вспомогательный класс для определения конкретных реализаций[`VertexElement`](../aspose.threed.entities/vertexelement). |
| [VertexElementMaterial](./vertexelementmaterial) | Определяет индекс материала для указанных компонентов. У узла может быть несколько материалов,[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial)используется для рендеринга разных частей геометрии в разных материалы. |
| [VertexElementNormal](./vertexelementnormal) | Определяет векторы нормалей для указанных компонентов. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Определяет группу полигонов для указанных компонентов, чтобы сгруппировать связанные полигоны вместе. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Группа сглаживания — это группа полигонов в полигональной сетке, которая должна формировать гладкую поверхность. Некоторое раннее программное обеспечение для 3D-моделирования, такое как 3D studio max для DOS, использовало группу сглаживания, чтобы исключить сохранение вектора нормали для каждой вершины сетки. |
| [VertexElementSpecular](./vertexelementspecular) | Определяет цвет отражения для указанных компонентов. |
| [VertexElementTangent](./vertexelementtangent) | Определяет касательные векторы для указанных компонентов. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Вспомогательный класс для определения конкретных реализаций[`VertexElement`](../aspose.threed.entities/vertexelement). |
| [VertexElementUserData](./vertexelementuserdata) | Определяет пользовательские данные для указанных компонентов. Обычно это специфичные для приложения данные специального назначения. |
| [VertexElementUV](./vertexelementuv) | Определяет UV-координаты для указанных компонентов. Геометрия может иметь несколько[`VertexElementUV`](../aspose.threed.entities/vertexelementuv)элементов, и каждый из них имеет разные[`TextureMapping`](../aspose.threed.entities/texturemapping)с. |
| [VertexElementVector4](./vertexelementvector4) | Вспомогательный класс для определения конкретных реализаций[`VertexElement`](../aspose.threed.entities/vertexelement). |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Определяет цвет вершин для указанных компонентов |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Определяет складку вершины для указанных компонентов |
| [VertexElementVisibility](./vertexelementvisibility) | Определяет видимость указанных компонентов |
| [VertexElementWeight](./vertexelementweight) | Определяет вес смеси для указанных компонентов. |
## Интерфейсы

| Интерфейс | Описание |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement с данными индексов. |
| [IMeshConvertible](./imeshconvertible) | Сущности, реализующие этот интерфейс, могут быть преобразованы в[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Ориентируемые объекты должны реализовать этот интерфейс. |
## перечисление

| перечисление | Описание |
| --- | --- |
| [ApertureMode](./aperturemode) | Режимы диафрагмы камеры. Режим апертуры определяет, какие значения управляют апертурой камеры. Если установлен режим апертуры HorizAndVert, Horizontal или Vertical, то используется поле зрения. Если установлен режим диафрагмы FocalLength, то используется фокусное расстояние. |
| [CurveDimension](./curvedimension) | Размер кривых. |
| [LightType](./lighttype) | Типы света. |
| [MappingMode](./mappingmode) | Определяет, как элемент отображается на поверхность. [`MappingMode`](../aspose.threed.entities/mappingmode)определяет, как[`VertexElement`](../aspose.threed.entities/vertexelement)отображается на поверхность геометрия. |
| [NurbsType](./nurbstype) | NURBS-типы. |
| [PatchDirectionType](./patchdirectiontype) | Типы направлений патчей. |
| [ProjectionType](./projectiontype) | Типы проекции камеры. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode)определяет, как информация о сопоставлении хранится и используется. |
| [RotationMode](./rotationmode) | Режим вращения пирамиды |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton)типы. |
| [SplitMeshPolicy](./splitmeshpolicy) | Разделяйте данные вершин/контрольных точек между подсетками или каждая подсетка имеет свои собственные уплотненные данные. |
| [TextureMapping](./texturemapping) | Тип наложения текстуры для[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Описывает тип наложения текстуры используется. |
| [VertexElementType](./vertexelementtype) | Тип вершинного элемента, определяющий, как он будет использоваться в моделировании. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
