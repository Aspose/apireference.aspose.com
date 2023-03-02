---
title: VectorLayer.UseAttributesIndex
second_title: Справочник по Aspose.GIS for .NET API
description: VectorLayer метод. Загружает индекс атрибута для ускорения фильтрации по значению атрибута в таких методах фильтрации какWhereGreater. Если индекс не существует сначала создает его. ИспользоватьforceRebuild для принудительного восстановления индекса.
type: docs
weight: 180
url: /ru/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

Загружает индекс атрибута для ускорения фильтрации по значению атрибута в таких методах фильтрации, как[`WhereGreater`](../../featuressequence/wheregreater/). Если индекс не существует, сначала создает его. Использовать*forceRebuild* для принудительного восстановления индекса.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| indexPath | String | Путь к индексному файлу. |
| attributeName | String | Имя атрибута для построения индекса. |
| forceRebuild | Boolean | Нужно ли пересоздавать индекс, даже если он уже существует. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Атрибут с таким именем не существует в слое. |
| IOException | Произошла ошибка ввода/вывода. |
| InvalidOperationException | Индекс указанного атрибута уже загружен для этого слоя. |
| [GisException](../../gisexception/) | Файл существует, и это не файл индекса атрибутов, созданный Aspose.GIS. |

### Смотрите также

* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

Загружает индекс атрибута для ускорения фильтрации по значению атрибута в таких методах фильтрации, как[`WhereGreater`](../../featuressequence/wheregreater/). Если индекс не существует, сначала создает его. Использовать*forceRebuild* для принудительного восстановления индекса.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| indexPath | AbstractPath | Путь к индексному файлу. |
| attributeName | String | Имя атрибута для построения индекса. |
| forceRebuild | Boolean | Нужно ли пересоздавать индекс, даже если он уже существует. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Атрибут с таким именем не существует в слое. |
| IOException | Произошла ошибка ввода/вывода. |
| InvalidOperationException | Индекс указанного атрибута уже загружен для этого слоя. |
| [GisException](../../gisexception/) | Файл существует, и это не файл индекса атрибутов, созданный Aspose.GIS. |

### Смотрите также

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)


