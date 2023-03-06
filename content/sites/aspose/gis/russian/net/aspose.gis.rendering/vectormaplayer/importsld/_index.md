---
title: VectorMapLayer.ImportSld
second_title: Справочник по Aspose.GIS for .NET API
description: VectorMapLayer метод. Импортирует стиль из файла описателя стилизованного слоя расположенного по указанному пути.
type: docs
weight: 60
url: /ru/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Импортирует стиль из файла описателя стилизованного слоя, расположенного по указанному пути.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу дескриптора стилизованного слоя. |
| options | SldImportOptions | Параметры импорта. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| XmlException | Произошла ошибка при синтаксическом анализе XML. |
| FormatException | В XML не найден стиль SLD. |

### Примечания

Этот метод перезаписывает значение[`Symbolizer`](../symbolizer/) свойство.

### Смотрите также

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer/)
* сборка [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Импортирует стиль из файла описателя стилизованного слоя, расположенного по указанному пути.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу дескриптора стилизованного слоя. |
| options | SldImportOptions | Параметры импорта. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| XmlException | Произошла ошибка при синтаксическом анализе XML. |
| FormatException | В XML не найден стиль SLD. |

### Примечания

Этот метод перезаписывает значение[`Symbolizer`](../symbolizer/) свойство.

### Смотрите также

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer/)
* сборка [Aspose.GIS](../../../)


