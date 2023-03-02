---
title: TopoJsonOptions.DefaultObjectName
second_title: Справочник по Aspose.GIS for .NET API
description: TopoJsonOptions свойство. Имя объекта в который по умолчанию помещаются функции.
type: docs
weight: 20
url: /ru/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Имя объекта, в который по умолчанию помещаются функции.

```csharp
public string DefaultObjectName { get; set; }
```

### Примечания

Это опция записи - не влияет на чтение. TopoJSON может содержать любое количество именованных объектов. Каждый такой объект может содержать несколько функций. Чтобы указать, в какой объект поместить вашу функцию, используйте [`ObjectNameAttribute`](../objectnameattribute/) property. Если атрибут с именем[`ObjectNameAttribute`](../objectnameattribute/) является`null`или отключить для какую-либо функцию, эта функция добавляется к объекту с именем`DefaultObjectName` . Если атрибут с именем[`ObjectNameAttribute`](../objectnameattribute/) нет в[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) Коллекция , все функции помещаются в объект с именем[`ObjectNameAttribute`](../objectnameattribute/) . Значение по умолчанию — "безымянный".

### Смотрите также

* class [TopoJsonOptions](../)
* пространство имен [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* сборка [Aspose.GIS](../../../)


