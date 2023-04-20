---
title: Class NamedNodeMap
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Collections.NamedNodeMap сорт. Представляет коллекции атрибутов доступ к которым можно получить по имени.
type: docs
weight: 30
url: /ru/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

Представляет коллекции атрибутов, доступ к которым можно получить по имени.

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | Возвращает индексный элемент на карте. Если индекс больше или равен количеству узлов на этой карте, возвращается null. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | Количество узлов на этой карте. |

## Методы

| Имя | Описание |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | Возвращает перечислитель, который выполняет итерацию по коллекции. |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | Извлекает узел, указанный по имени. |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | Извлекает узел, указанный локальным именем и URI пространства имен. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Этот метод используется для получения объекта ECMAScript.Type . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | Удаляет узел, указанный по имени. |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | Удаляет узел, указанный локальным именем и URI пространства имен. |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | Добавляет узел, используя его атрибут nodeName. Если узел с таким именем уже присутствует на этой карте, он заменяется новым. Замена узла сама по себе не имеет никакого эффекта. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | Добавляет узел, используя его namespaceURI и localName. Если узел с этим URI пространства имен и этим локальным именем уже присутствует на этой карте, он заменяется новым. Замена узла сама по себе не имеет никакого эффекта. |

### Смотрите также

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* пространство имен [Aspose.Svg.Collections](../../aspose.svg.collections/)
* сборка [Aspose.SVG](../../)


