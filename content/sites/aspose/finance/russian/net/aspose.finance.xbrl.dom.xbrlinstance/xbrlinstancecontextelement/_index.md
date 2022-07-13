---
title: XbrlInstanceContextElement
second_title: Справочник по API Aspose.Finance для .NET
description: 
type: docs
weight: 7470
url: /ru/net/aspose.finance.xbrl.dom.xbrlinstance/xbrlinstancecontextelement/
---
## XbrlInstanceContextElement class

```csharp
public class XbrlInstanceContextElement : XbrlInstanceElement
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes) { get; } | Получает атрибуты элемента. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Получает абсолютный базовый URI этого узла или null, если реализация не смогла получить абсолютный URI. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements) { get; } | Получает дочерние элементы элемента. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Получает дочерние узлы. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Получает первый потомок этого узла. Если такого узла нет, возвращается null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Получает, есть ли у этого узла дочерние узлы. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Получает последний потомок этого узла. Если такого узла нет, возвращается null. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname) { get; } | Получает локальное имя элемента. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri) { get; } | Получает URI пространства имен элемента. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Получает узел, следующий сразу за этим узлом. Если такого узла нет, возвращается null. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename) { get; } | Получает имя узла элемента. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Получает тип узла. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Получает или задает значение данного узла в зависимости от его типа. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Получает объект документа, связанный с этим узлом. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement) { get; } | Получает родительский элемент элемента. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Получает родительский узел. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix) { get; } | Получает префикс элемента. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Получает узел, непосредственно предшествующий этому узлу. Если такого узла нет, возвращается null. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent) { get; set; } | Получает текстовое содержимое элемента. |

## Методы

| Имя | Описание |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Добавляет узел newChild в конец списка дочерних элементов этого узла. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute)(string) | Получает значение атрибута по имени. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens)(string, string) | Получает значение атрибута по локальному имени и URI пространства имен. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute)(string) | Возвращает true, если атрибут с заданным именем указан в этом элементе или имеет значение по умолчанию, иначе false. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens)(string, string) | Возвращает значение true, если атрибут с заданным локальным именем и URI пространства имен указан в этом элементе или имеет значение по умолчанию, в противном случае — значение false. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute)(string) | Удаляет атрибут по имени. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens)(string, string) | Удаляет атрибут по локальному имени и URI пространства имен. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Удаляет дочерний узел, указанный старым дочерним, из списка дочерних. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Заменяет дочерний узел old child новым дочерним в списке дочерних узлов и возвращает старый дочерний узел. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute)(string, string) | Добавляет новый атрибут. Если атрибут с таким именем уже присутствует в элементе, его значение изменяется на значение параметра value. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens)(string, string, string) | Добавляет новый атрибут. Если атрибут с тем же локальным именем и URI пространства имен уже присутствует в элементе, его префикс заменяется префиксной частью квалифицированного имени, а его значение заменяется параметром value. |

### Смотрите также

* class [XbrlInstanceElement](../xbrlinstanceelement)
* пространство имен [Aspose.Finance.Xbrl.Dom.XbrlInstance](../../aspose.finance.xbrl.dom.xbrlinstance)
* сборка [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
