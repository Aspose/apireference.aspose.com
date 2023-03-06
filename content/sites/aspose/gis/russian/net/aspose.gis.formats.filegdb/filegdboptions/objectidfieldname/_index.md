---
title: FileGdbOptions.ObjectIdFieldName
second_title: Справочник по Aspose.GIS for .NET API
description: FileGdbOptions свойство. Имя поля идентификатора объекта.
type: docs
weight: 60
url: /ru/net/aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/
---
## FileGdbOptions.ObjectIdFieldName property

Имя поля идентификатора объекта.

```csharp
public string ObjectIdFieldName { get; set; }
```

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Значение не является допустимым именем поля. Допустимое имя поля должно быть:  Будь не`null` и не пустойНачинайте с латинской буквы или символа подчеркиванияСодержат только латинские буквы, цифры или символы подчеркивания |

### Примечания

Это параметр создания, и он не влияет на чтение. Определяет имя поля идентификатора объекта (столбца). По умолчанию "OBJECTID". Если какой-либо атрибут в[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) имеет имя, равное значению этого свойства, то этот атрибут переименовывается.

### Смотрите также

* class [FileGdbOptions](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* сборка [Aspose.GIS](../../../)


