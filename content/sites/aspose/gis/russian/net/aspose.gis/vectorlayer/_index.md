---
title: VectorLayer
second_title: Справочник по Aspose.GIS for .NET API
description: Представляет векторный слой. Векторный слой представляет собой набор географических объектов хранящихся в файле.
type: docs
weight: 2210
url: /ru/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Представляет векторный слой. Векторный слой представляет собой набор географических объектов, хранящихся в файле.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes) { get; } | Получает набор пользовательских атрибутов для объектов в этом[`VectorLayer`](../vectorlayer). |
| virtual [Count](../../aspose.gis/vectorlayer/count) { get; } | Получает количество объектов в этом слое. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver) { get; } | Получает[`Driver`](./driver), который создал этот слой. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype) { get; } | Получает тип геометрии слоя. |
| virtual [Item](../../aspose.gis/vectorlayer/item) { get; } | Получает[`Feature`](../feature)по указанному индексу. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem) { get; } | Получает систему пространственной привязки этой последовательности объектов. |

## Методы

| Имя | Описание |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create#create)(AbstractPath, FileDriver) | Создает слой и открывает его для добавления новых объектов. |
| static [Create](../../aspose.gis/vectorlayer/create#create_4)(string, FileDriver) | Создает слой и открывает его для добавления новых объектов. |
| static [Create](../../aspose.gis/vectorlayer/create#create_1)(AbstractPath, FileDriver, DriverOptions) | Создает слой и открывает его для добавления новых объектов. |
| static [Create](../../aspose.gis/vectorlayer/create#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| static [Create](../../aspose.gis/vectorlayer/create#create_5)(string, FileDriver, DriverOptions) | Создает слой и открывает его для добавления новых объектов. |
| static [Create](../../aspose.gis/vectorlayer/create#create_7)(string, FileDriver, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| static [Create](../../aspose.gis/vectorlayer/create#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| static [Create](../../aspose.gis/vectorlayer/create#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| static [Open](../../aspose.gis/vectorlayer/open#open)(AbstractPath, FileDriver) | Открыть слой для чтения. |
| static [Open](../../aspose.gis/vectorlayer/open#open_2)(string, FileDriver) | Открыть слой для чтения. |
| static [Open](../../aspose.gis/vectorlayer/open#open_1)(AbstractPath, FileDriver, DriverOptions) | Открыть слой для чтения. |
| static [Open](../../aspose.gis/vectorlayer/open#open_3)(string, FileDriver, DriverOptions) | Открыть слой для чтения. |
| [Add](../../aspose.gis/vectorlayer/add#add)(Feature) | Добавляет новый объект в слой, если поддерживается[`VectorLayer`](../vectorlayer)'s[`Driver`](./driver). |
| virtual [Add](../../aspose.gis/vectorlayer/add#add_1)(Feature, IFeatureStyle) | Добавляет в слой новый объект с указанным стилем, если поддерживается[`VectorLayer`](../vectorlayer)'s[`Driver`](./driver). |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature)() | Создает (но не добавляет к слою) новый объект с атрибутами, совпадающими с набором атрибутов этого слоя. Закончив настройку данных для объекта, используйте[`Add`](./add), чтобы добавить объект в слой. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes)(FeaturesSequence) | Копирует атрибуты другого[`VectorLayer`](../vectorlayer)в этот. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Копирует атрибуты другого[`VectorLayer`](../vectorlayer)в этот. |
| [Dispose](../../aspose.gis/vectorlayer/dispose)() | Освобождает ресурсы, используемые[`VectorLayer`](../vectorlayer). |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator)() | Возвращает перечислитель, который перебирает коллекцию. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent)() | Получает пространственный экстент этого слоя. |
| [Join](../../aspose.gis/vectorlayer/join)(VectorLayer, JoinOptions) | Присоединяет слой к текущему слою. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto)(IPoint) | Получает ближайший объект к указанной точке. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto_1)(double, double) | Получает ближайший объект к предоставленным координатам. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat)(int) | Удалить[`Feature`](../feature)по указанному индексу. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat)(int, Feature) | Заменить[`Feature`](../feature)по указанному индексу. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver) | Сохраняет последовательность объектов в слой. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver) | Сохраняет последовательность объектов в слой. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver, SavingOptions) | Сохраняет последовательность объектов в слой. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver, SavingOptions) | Сохраняет последовательность объектов в слой. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex)(AbstractPath, string, bool) | Загружает индекс атрибута для ускорения фильтрации по значению атрибута в методах фильтрации, таких как[`WhereGreater`](../featuressequence/wheregreater). Если индекс не существует, сначала создает его. Используйте*forceRebuild*для принудительного восстановления индекса. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex_1)(string, string, bool) | Загружает индекс атрибута для ускорения фильтрации по значению атрибута в методах фильтрации, таких как[`WhereGreater`](../featuressequence/wheregreater). Если индекс не существует, сначала создает его. Используйте*forceRebuild*для принудительного восстановления индекса. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex)(AbstractPath, bool) | Загружает пространственный индекс для ускорения фильтрации по значению атрибута в методах фильтрации, таких как[`WhereIntersects`](../featuressequence/whereintersects) и[`NearestTo`](./nearestto). Если индекс не существует, сначала создает его. Используйте*forceRebuild*для принудительного восстановления индекса. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex_1)(string, bool) | Загружает пространственный индекс для ускорения фильтрации по значению атрибута в методах фильтрации, таких как[`WhereIntersects`](../featuressequence/whereintersects) и[`NearestTo`](./nearestto). Если индекс не существует, сначала создает его. Используйте*forceRebuild*для принудительного восстановления индекса. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal)(string, T) | Выбирает объекты со значением атрибута, равным предоставленному значению. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater)(string, T) | Выбирает объекты со значением атрибута, превышающим предоставленное значение. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal)(string, T) | Выбирает объекты со значением атрибута, большим или равным указанному значению. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(Extent) | Фильтрует объекты по экстенту. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(FeaturesSequence) | Фильтрация объектов на основе объединения всех геометрий в другой последовательности объектов. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(IGeometry) | Фильтрует объекты на основе предоставленной геометрии. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal)(string, T) | Выбирает объекты со значением атрибута, не равным предоставленному значению. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull)(string) | Выбирает объекты с атрибутом, не равным нулю. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull)(string) | Выбирает объекты с нулевым атрибутом. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset)(string) | Выбирает объекты с установленным атрибутом. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller)(string, T) | Выбирает объекты со значением атрибута меньше заданного значения. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal)(string, T) | Выбирает объекты со значением атрибута, меньшим или равным заданному значению. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset)(string) | Выбирает объекты, для которых указанный атрибут не установлен. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Преобразование слоя в другой формат. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_2)(string, FileDriver, string, FileDriver) | Преобразование слоя в другой формат. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Преобразование слоя в другой формат. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Преобразование слоя в другой формат. |

### Смотрите также

* class [FeaturesSequence](../featuressequence)
* пространство имен [Aspose.Gis](../../aspose.gis)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
