---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters сорт. Параметры для создания проекции SRS. Некоторые параметры имеют значения по умолчанию. Некоторые параметры имеют разумные значения по умолчанию поэтому вам не нужно назначать только их. Если вы назначаетеnull для этих параметров будет использоваться значение по умолчанию. ProjectionMethodName иBase не имеют значений по умолчанию  вам нужно назначить некоторые неnull значение этого свойства.
type: docs
weight: 2230
url: /ru/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Параметры для создания проекции SRS. Некоторые параметры имеют значения по умолчанию. Некоторые параметры имеют разумные значения по умолчанию, поэтому вам не нужно назначать только их. Если вы назначаете`null` для этих параметров будет использоваться значение по умолчанию. [`ProjectionMethodName`](./projectionmethodname/) и[`Base`](./base/) не имеют значений по умолчанию - вам нужно назначить некоторые не`null` значение этого свойства.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Порядок осей. По умолчаниюXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Базовая географическая SRS (SRS, к которой применяется проекция). Вы ДОЛЖНЫ установить для этого свойства значение not`null` значение для создания действительной SRS, это свойство не имеет значения по умолчанию. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Единицы, которые будут использоваться в этой SRS. По умолчанию[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Имя проектируемого SRS. По умолчанию "Безымянный". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Идентификатор метода проецирования. Значение по умолчанию отсутствует, вы можете установить этот параметр не`null` value, если вы хотите прикрепить идентификатор к проекции. Если вы это сделаете, вы должны убедиться, что идентификатор в проекции согласован с именем method (имя метода проекции не изменится, когда вы установите это свойство). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Имя метода проецирования. Нет значения по умолчанию, и вы ДОЛЖНЫ установить этот параметр на не`null` значение, поскольку проекция SRS без имени проекции бесполезна. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Ось, описывающая размер X (горизонтальный). По умолчанию используется ось с восточным направлением. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Ось, описывающая размер Y (вертикальный). По умолчанию используется ось с северным направлением. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Добавляет параметр проекции к этому SRS. Если параметр с таким именем уже был добавлен - обновите его. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Получает параметр проекции с указанным именем. |

### Смотрите также

* пространство имен [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* сборка [Aspose.GIS](../../)


