---
title: Aspose.Gis.SpatialReferencing
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.SpatialReferenceing namespace предоставляет классы для работы с пространственными привязками системами координат.
type: docs
weight: 330
url: /ru/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferenceing` namespace предоставляет классы для работы с пространственными привязками (системами координат).

## Классы

| Учебный класс | Описание |
| --- | --- |
| [Axis](./axis) | Ось описывает одно измерение SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Класс, содержащий параметры формулы Бурсы-Вольфа для преобразования в другие данные. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Составная SRS объединяет две базовые SRS, ни одна из которых не может быть составной. |
| [Ellipsoid](./ellipsoid) | Эллипсоид представляет собой эллипсоид, который приближается к Земле. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Геоцентрическая SRS представляет собой трехмерную декартову SRS с началом в центре Земли. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Параметры для создания геоцентрической SRS. Параметры имеют разумные значения по умолчанию, поэтому вам придется назначить только некоторые из них. Если вы назначите`null` для любого параметра будет использоваться значение по умолчанию. |
| [GeographicDatum](./geographicdatum) | Географические данные связывают долготу и широту с конкретным местом на Земле. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Географическая SRS — это SRS, основанная на долготе и широте. Географическая SRS может быть двухмерной или трехмерной. Если географическая SRS является трехмерной, то на самом деле это составная SRS из двухмерной SRS и вертикальной SRS. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Параметры для создания географической SRS. Параметры имеют разумные значения по умолчанию, поэтому вам придется назначить только некоторые из них. Если вы назначите`null` для любого параметра будет использоваться значение по умолчанию. |
| [IdentifiableObject](./identifiableobject) | Представляет объект, который может иметь код и имя EPSG. |
| [Identifier](./identifier) | Представляет идентификатор - ссылку на внешнее описание объекта. Если вы создаете SRS из WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier) соответствует ключевому слову "AUTHORITY". |
| [LocalDatum](./localdatum) | Указывает метод, используемый для измерений в локальной системе пространственной привязки. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Локальные координаты SRS относительно какого-либо объекта, а не земли. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian представляет меридиан, долгота которого определена как 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Спроецированная SRS является результатом применения проекции к географической SRS. Спроецированная SRS может быть двухмерной или трехмерной. Если спроецированная SRS трехмерна, то она на самом деле является составной SRS из двухмерной проекции SRS и одномерной вертикальной SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Параметры для создания проекции SRS. Некоторые параметры имеют значения по умолчанию. Некоторые параметры имеют разумные значения по умолчанию, поэтому вам не нужно назначать только их. Если вы назначаете`null` для этих параметров будет использоваться значение по умолчанию. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) а также[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) не имеют значений по умолчанию - вам нужно назначить некоторые не`null` значение этого свойства. |
| [Projection](./projection) | Представляет метод проекции с параметрами, который преобразует (долготу, широту) в (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | Пространственная система отсчета отображает координаты мест на Земле. Существуют различные типы SRS, см.[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . Более того, если тип SRSGeographic или Projected SRS может быть составным или одинарным, см.[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | Преобразование пространственной системы отсчета преобразует геометрию из исходной системы пространственной привязки в целевую систему пространственной привязки. |
| [TransformationException](./transformationexception) | Исключение преобразования возникает, когда возникает ошибка во время преобразования координат или во время создания преобразования. |
| [Unit](./unit) | Представляет единицу измерения. |
| [VerticalDatum](./verticaldatum) | Указывает метод, используемый для вертикальных измерений. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Вертикальная SRS — это одномерная SRS, описывающая координаты высоты. |
## перечисление

| перечисление | Описание |
| --- | --- |
| [AxisDirection](./axisdirection) | Направление оси определяет направление, на которое указывает ось. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Представляет порядок осей в геоцентрической SRS. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Представляет порядок осей в географической SRS. |
| [ParameterType](./parametertype) | Определяет тип параметра в[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Представляет порядок осей в географической SRS. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Представляет тип системы пространственной привязки. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
