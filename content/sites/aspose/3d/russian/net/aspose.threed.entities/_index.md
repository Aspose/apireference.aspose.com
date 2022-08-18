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
| [Circle](./circle) | А[`Circle`](../aspose.threed.entities/circle) кривая состоит из набора точек на краю формы круга. |
| [CompositeCurve](./compositecurve) | А[`CompositeCurve`](../aspose.threed.entities/compositecurve) состоит из нескольких сегментов кривой. |
| [Curve](./curve) | Базовый класс всех реализаций кривых. |
| [Cylinder](./cylinder) | Цилиндр с параметрами. Его также можно использовать для представления конуса, когда одно из значений radiusTop/radiusBottom равно нулю. |
| [Dish](./dish) | Параметризированная тарелка. |
| [Ellipse](./ellipse) | Ан[`Ellipse`](../aspose.threed.entities/ellipse)определяет набор точек, образующих форму эллипса. |
| [Frustum](./frustum) | Базовый класс[`Camera`](../aspose.threed.entities/camera) а также[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | Базовый класс всех визуализируемых геометрических объектов (например,[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) и др.). |
| [Light](./light) | Свет освещает сцену. |
| [Line](./line) | Полилиния — это путь, определяемый набором точек с[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , и связано с[`Segments`](../aspose.threed.entities/line/segments) , что означает, что она также может быть набором соединенных отрезков линии. Линия обычно представляет собой линейный объект, что означает, что ее нельзя использовать для представления кривой, для представления кривой используется[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | Линейное выдавливание принимает 2D-форму в качестве входных данных и расширяет форму в 3-м измерении. |
| [Mesh](./mesh) | Сетка состоит из множества многоугольников с n сторонами. |
| [NurbsCurve](./nurbscurve) | [кривая NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) представляет собой кривую, представленную NURBS (неоднородный рациональный базисный сплайн), Кривая NURBS определяется ее[`Order`](../aspose.threed.entities/nurbscurve/order) , набор взвешенных[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) и[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) Компонент w в контрольной точке используется как вес контрольной точки, какой бы она ни былаTwoDimensional или жеThreeDimensional |
| [NurbsDirection](./nurbsdirection) | 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) имеет два направления, т.[`U`](../aspose.threed.entities/nurbssurface/u) а также[`V`](../aspose.threed.entities/nurbssurface/v) ,[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) определяет данные для каждого направления. Направление на самом деле является NURBS-кривой, что означает, что оно также определяется[`Order`](../aspose.threed.entities/nurbsdirection/order) , а[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , и набор взвешенных контрольных точек (определенных в[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) представляет собой поверхность, представленную[NURBS (неоднородный рациональный базисный сплайн)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), А[`NurbsSurface`](../aspose.threed.entities/nurbssurface) определяется двумя[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) а также[`V`](../aspose.threed.entities/nurbssurface/v) . Компонент w в контрольной точке используется как вес контрольной точки независимо от типа направления.TwoDimensional или жеThreeDimensional |
| [Patch](./patch) | А[`Patch`](../aspose.threed.entities/patch) представляет собой параметрическую модельную поверхность, похожую на[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , он также определяется двумя [`PatchDirection`](../aspose.threed.entities/patchdirection) ,[`U`](../aspose.threed.entities/patch/u) а также[`V`](../aspose.threed.entities/patch/v) . Но разница между[`Patch`](../aspose.threed.entities/patch) а также[`NurbsSurface`](../aspose.threed.entities/nurbssurface) это что[`PatchDirection`](../aspose.threed.entities/patchdirection) кривая может быть одной изBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline а такжеLinear |
| [PatchDirection](./patchdirection) | Направление U и V патча. |
| [Plane](./plane) | Плоскость с параметрами. |
| [PointCloud](./pointcloud) | Облако точек не содержит информации о топологии, а содержит только контрольные точки и элементы вершин. |
| [PolygonBuilder](./polygonbuilder) | Вспомогательный класс для построения многоугольника.[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Утилиты для модификации полигонов |
| [Primitive](./primitive) | Базовый класс для всех примитивов |
| [Pyramid](./pyramid) | Пирамида с параметрами. |
| [RectangularTorus](./rectangulartorus) | Параметризованный прямоугольный тор. |
| [RevolvedAreaSolid](./revolvedareasolid) | Этот класс представляет твердотельную модель путем вращения поперечного сечения профиля вокруг оси. |
| [Shape](./shape) | Форма описывает деформацию на наборе контрольных точек, что аналогично деформатору кластера в Maya. Например, мы можем добавить форму к созданной геометрии. И форма, и геометрия имеют одинаковую топологическую информацию, но разное положение контрольных точек. При различной степени влияния геометрия выполняет эффект деформации. |
| [Skeleton](./skeleton) | [`Skeleton`](../aspose.threed.entities/skeleton)в основном используется программным обеспечением САПР, чтобы помочь дизайнеру манипулировать преобразованием структуры скелета, обычно это бесполезно вне программного обеспечения САПР. Чтобы иерархия скелета действовала как один объект в программном обеспечении САПР, необходимо отметить верхнюю часть[`Skeleton`](../aspose.threed.entities/skeleton) узел как корневой, установив[`Type`](../aspose.threed.entities/skeleton/type) кSkeleton , и все дочерние элементы установлены наBone |
| [Sphere](./sphere) | Параметризованная сфера. |
| [SweptAreaSolid](./sweptareasolid) | А[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) строит геометрию, проводя профиль по направляющей. |
| [Torus](./torus) | Параметризованный тор. |
| [TransformedCurve](./transformedcurve) | А[`TransformedCurve`](../aspose.threed.entities/transformedcurve) дает кривой размещение с помощью матрицы преобразования. Это позволяет выполнять преобразование внутри[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) или же[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | TriMesh содержит необработанные данные, которые могут использоваться GPU напрямую. Этот класс представляет собой утилиту, помогающую построить сетку, содержащую только данные для каждой вершины. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Общая версия[`TriMesh`](../aspose.threed.entities/trimesh) для пользовательской статической вершины type |
| [TrimmedCurve](./trimmedcurve) | Ограниченная кривая, обрезающая базисную кривую с обоих концов. |
| [VertexElement](./vertexelement) | Базовый класс вершинных элементов. Тип вершинных элементов идентифицируется VertexElementType. VertexElement описывает, как элемент вершины отображается на геометрическую поверхность и как информация об отображении размещается в памяти. VertexElement содержит нормали, UV и другую информацию. |
| [VertexElementBinormal](./vertexelementbinormal) | Определяет векторы бинормалей для указанных компонентов. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Вспомогательный класс для определения бетона[`VertexElement`](../aspose.threed.entities/vertexelement) реализации. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Определяет складку края для указанных компонентов |
| [VertexElementHole](./vertexelementhole) | Определяет, является ли указанный полигон отверстием |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Вспомогательный класс для определения бетона[`VertexElement`](../aspose.threed.entities/vertexelement) реализации. |
| [VertexElementMaterial](./vertexelementmaterial) | Определяет индекс материала для указанных компонентов. У узла может быть несколько материалов,[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) используется для визуализации различных частей геометрии в разных материалах. |
| [VertexElementNormal](./vertexelementnormal) | Определяет векторы нормалей для указанных компонентов. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Определяет группу полигонов для указанных компонентов, чтобы сгруппировать связанные полигоны вместе. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Группа сглаживания — это группа полигонов в полигональной сетке, которая должна формировать гладкую поверхность. Некоторые ранние программы для трехмерного моделирования, такие как 3D studio max для DOS, использовали группу сглаживания, чтобы исключить сохранение вектора нормали для каждой вершины сетки. |
| [VertexElementSpecular](./vertexelementspecular) | Определяет зеркальный цвет для указанных компонентов. |
| [VertexElementTangent](./vertexelementtangent) | Определяет касательные векторы для указанных компонентов. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Вспомогательный класс для определения бетона[`VertexElement`](../aspose.threed.entities/vertexelement) реализации. |
| [VertexElementUserData](./vertexelementuserdata) | Определяет пользовательские данные для указанных компонентов. Обычно это специфические для приложения данные специального назначения. |
| [VertexElementUV](./vertexelementuv) | Определяет координаты UV для указанных компонентов. Геометрия может иметь несколько[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) элементы, и каждый из них отличается[`TextureMapping`](../aspose.threed.entities/texturemapping) с. |
| [VertexElementVector4](./vertexelementvector4) | Вспомогательный класс для определения бетона[`VertexElement`](../aspose.threed.entities/vertexelement) реализации. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Определяет цвет вершин для указанных компонентов |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Определяет складку вершины для указанных компонентов |
| [VertexElementVisibility](./vertexelementvisibility) | Определяет, видны ли указанные компоненты |
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
| [ApertureMode](./aperturemode) | Режимы апертуры камеры. Режим апертуры определяет, какие значения управляют апертурой камеры. Если установлен режим апертуры HorizAndVert, Horizontal или Vertical, то используется поле зрения. Если режим диафрагмы FocalLength, то используется фокусное расстояние. |
| [CurveDimension](./curvedimension) | Размер кривых. |
| [LightType](./lighttype) | Типы света. |
| [MappingMode](./mappingmode) | Определяет способ сопоставления элемента с поверхностью. [`MappingMode`](../aspose.threed.entities/mappingmode) определил, как[`VertexElement`](../aspose.threed.entities/vertexelement) сопоставляется с поверхностью геометрии. |
| [NurbsType](./nurbstype) | NURBS-типы. |
| [PatchDirectionType](./patchdirectiontype) | Типы направлений патчей. |
| [ProjectionType](./projectiontype) | Типы проекции камеры. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) определяет, как информация о сопоставлении хранится и на которую ссылается. |
| [RotationMode](./rotationmode) | Режим вращения усеченного конуса |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s типы. |
| [SplitMeshPolicy](./splitmeshpolicy) | Совместное использование данных вершин/контрольных точек между подсетками или каждая подсетка имеет свои собственные сжатые данные. |
| [TextureMapping](./texturemapping) | Тип наложения текстуры для[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Описывает, какой тип наложения текстуры используется. |
| [VertexElementType](./vertexelementtype) | Тип вершинного элемента, определяющий, как он будет использоваться в моделировании. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
