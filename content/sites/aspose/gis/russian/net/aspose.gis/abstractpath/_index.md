---
title: Class AbstractPath
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.AbstractPath сорт. АнАннотацияПуть является базовым классом для классов указывающих уникальное местоположение в среде похожей на файловую систему  например на локальную файловую систему удаленное файловое хранилище или ZIPархив и т. д.
type: docs
weight: 10
url: /ru/net/aspose.gis/abstractpath/
---
## AbstractPath class

Ан`АннотацияПуть` является базовым классом для классов, указывающих уникальное местоположение в среде, похожей на файловую систему, , например, на локальную файловую систему, удаленное файловое хранилище или ZIP-архив и т. д.

```csharp
public abstract class AbstractPath
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Получает строковое представление местоположения этого`АннотацияПуть` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Получает символ-разделитель, используемый для разделения уровней каталогов[`Location`](./location/) нить. |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Создает`AbstractPath` который представляет местоположение в локальной файловой системе. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Создает`AbstractPath` изStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Объединяет это`AbstractPath` с указанными компонентами пути. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Удаляет файл, на который указывает этот путь. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Возвращает расширение этого`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Возвращает имя файла и расширение этого`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Возвращает имя файла этого`AbstractPath` без расширения. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Получает значение, указывающее, указывает ли этот путь на существующий файл, который можно открыть для чтения. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Возвращает пути, расположенные внутри этого`АннотацияПуть` , если это каталог. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Открывает это`АннотацияПуть`в виде файла. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Возвращает новый`AbstractPath` с расширением файла, измененным на указанное значение. |

### Примечания

Ан`АннотацияПуть` может указать расположение в локальной файловой системе, расположение в удаленной файловой системе или во внешнем хранилище, таком как хранилище BLOB-объектов Azure, и т. д. Расположение может указывать на существующие или не существующие объекты, подобные файлам, объекты, подобные каталогам, или иметь любое другое значение, подходящее для среды, к которой оно принадлежит. Например,`АннотацияПуть` Наследник, который представляет расположение в локальной файловой системе, может указывать на существующий файл , каталог или место в файловой системе, которое еще не было создано. Чтобы сделать новое хранилище, подобное файловой системе, доступным для`Aspose.ГИС` нужно наследовать этот class и реализовать его абстрактные методы.

### Смотрите также

* пространство имен [Aspose.Gis](../../aspose.gis/)
* сборка [Aspose.GIS](../../)


