---
title: Aspose.Gis.SpatialReferencing
second_title: Справочник по Aspose.GIS for .NET API
description:  Aspose.Gis.SpatialReferencing namespace предоставляет классы для работы с пространственными привязками системами координат.
type: docs
weight: 330
url: /ru/net/aspose.gis.spatialreferencing/
---
` Aspose.Gis.SpatialReferencing` namespace предоставляет классы для работы с пространственными привязками (системами координат).

## Классы

| Учебный класс | Описание |
| --- | --- |
| [Axis](./axis) | Ось описывает одно измерение SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Класс, содержащий параметры формулы Бурсы-Вольфа для преобразования в другую датум. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Составной SRS объединяет два базовых SRS, ни один из которых не может быть составным. |
| [Ellipsoid](./ellipsoid) | Эллипсоид представляет собой эллипсоид, приближающийся к Земле. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Геоцентрическая SRS представляет собой трехмерную декартову SRS с началом в центре Земли. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Параметры для создания геоцентрической SRS. Параметры имеют разумные значения по умолчанию, поэтому вам придется назначить только некоторые из них. Если вы присвоите`null`любому параметру, будет использоваться значение по умолчанию. |
| [GeographicDatum](./geographicdatum) | Географические данные связывают долготу и широту с конкретным местом на земле. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Географическая SRS — это SRS, основанная на долготе и широте. Географическая SRS может быть двухмерной или трехмерной. Если географическая SRS является трехмерной, то на самом деле это составная SRS двумерной SRS и вертикальной SRS. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Параметры для создания географической SRS. Параметры имеют разумные значения по умолчанию, поэтому вам придется назначить только некоторые из них. Если вы присвоите`null`любому параметру, будет использоваться значение по умолчанию. |
| [IdentifiableObject](./identifiableobject) | Представляет объект, который может иметь код и имя EPSG. |
| [Identifier](./identifier) | Представляет идентификатор - ссылку на внешнее описание объекта. Если вы создаете SRS из WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier)соответствует ключевому слову "AUTHORITY". |
| [LocalDatum](./localdatum) | Указывает метод, используемый для измерений в локальной системе пространственной привязки. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Локальные координаты SRS, относящиеся к какому-то объекту, а не земле. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian представляет меридиан, долгота которого равна 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Прогнозируемая СКР является результатом применения проекции к географической СКР. Спроецированная SRS может быть двумерной или трехмерной. Если спроецированная СКР трехмерна, то на самом деле это составная СКР двумерной спроецированной СКР и одномерной вертикальной ССО. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Параметры для создания проекции SRS. Некоторые параметры имеют значения по умолчанию. Некоторые параметры имеют разумные значения по умолчанию, поэтому вам не нужно назначать только их. Если вы присвоите`null`этим параметрам, будет использоваться значение по умолчанию. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname)и[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base)не имеют значения по умолчанию - вы должны присвоить этим свойствам некоторые значения, отличные от`null`. |
| [Projection](./projection) | Представляет метод проекции с параметрами, который преобразует (долготу, широту) в (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | Пространственная система отсчета отображает координаты мест на Земле. Существуют различные типы SRS, см.[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type). Более того, если тип SRSGeographicили Projected, SRS может быть составным или одинарным, см.[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound). |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | Преобразование пространственной системы отсчета преобразует геометрию из исходной системы пространственной привязки в целевую систему пространственной привязки. |
| [TransformationException](./transformationexception) | Исключение преобразования выдается, когда возникает ошибка во время преобразования координаты или при создании преобразования. |
| [Unit](./unit) | Представляет единицу измерения. |
| [VerticalDatum](./verticaldatum) | Указывает метод, используемый для вертикальных измерений. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Вертикальная SRS — это одномерная SRS, описывающая координаты высоты. |
## перечисление

| перечисление | Описание |
| --- | --- |
| [AxisDirection](./axisdirection) | Направление оси определяет направление, на которое указывает ось. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Представляет порядок осей в геоцентрической SRS. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Представляет порядок осей в географической SRS. |
| [ParameterType](./parametertype) | Определяет тип параметра в[`Projection`](../aspose.gis.spatialreferencing/projection). |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Представляет порядок осей в географической SRS. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Представляет тип системы пространственной привязки. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
