---
title: Class Entity
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.Entity сорт. Представляет известную сущность проанализированную или не проанализированную в XMLдокументе.
type: docs
weight: 850
url: /ru/net/aspose.svg.dom/entity/
---
## Entity class

Представляет известную сущность, проанализированную или не проанализированную, в XML-документе.

```csharp
public class Entity : Node
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | NamedNodeMap, содержащий атрибуты этого узла (если это элемент) или null в противном случае. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Абсолютный базовый URI этого узла или ноль, если реализация не смогла получить абсолютный URI. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | NodeList, содержащий все дочерние элементы этого узла. Если нет детей, это NodeList, не содержащий узлов.. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Первый дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [InputEncoding](../../aspose.svg.dom/entity/inputencoding/) { get; } | Атрибут, указывающий кодировку, используемую для этого объекта во время синтаксического анализа, когда он является внешним анализируемым объектом. Это значение null, если это сущность из внутреннего подмножества или если она неизвестна. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Последний дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Возвращает локальную часть полного имени этого узла. Для узлов любого типа, кроме ELEMENT_NODE и ATTRIBUTE_NODE, и узлов, созданных с помощью метода DOM уровня 1, такого как Document.createElement(), всегда равно null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | URI пространства имен этого узла или null, если он не указан. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Узел, следующий непосредственно за этим узлом. Если такого узла нет, возвращается null. |
| override [NodeName](../../aspose.svg.dom/entity/nodename/) { get; } | Имя этого узла в зависимости от его типа. |
| override [NodeType](../../aspose.svg.dom/entity/nodetype/) { get; } | Код, представляющий тип базового объекта. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Значение этого узла в зависимости от его типа. |
| [NotationName](../../aspose.svg.dom/entity/notationname/) { get; } | Для неразобранных сущностей имя нотации для сущности. Для проанализированных сущностей это null. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Объект документа, связанный с этим узлом. Это также объект Document, используемый для создания новых узлов. Когда этот узел является документом или типом документа, который еще не используется ни с одним документом, это значение равно null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Получает родителя[`Element`](../element/) этого узла. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Родитель этого узла. Все узлы, кроме Attr, Document, DocumentFragment, Entity и Notation, могут иметь родителя. Однако, если узел был только что создан и еще не добавлен в дерево, или если он был удален из дерева, это значение null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Префикс пространства имен этого узла или нуль, если он не указан. Когда он определен как нуль, его установка не имеет никакого эффекта |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Узел, непосредственно предшествующий этому узлу. Если такого узла нет, возвращается null. |
| [PublicId](../../aspose.svg.dom/entity/publicid/) { get; } | Общедоступный идентификатор, связанный с объектом, если он указан, и null в противном случае. |
| [SystemId](../../aspose.svg.dom/entity/systemid/) { get; } | Системный идентификатор, связанный с сущностью, если он указан, и null в противном случае. Это может быть абсолютный URI или нет. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Этот атрибут возвращает текстовое содержимое этого узла и его потомков. Когда он определен как null, его установка не имеет никакого эффекта. При настройке любые возможные дочерние элементы, которые может иметь этот узел, удаляются и, если новая строка не является пустой или нулевой, заменяются одним текстовым узлом, содержащим строку, на которую установлен этот атрибут. |
| [XmlEncoding](../../aspose.svg.dom/entity/xmlencoding/) { get; } | Атрибут, указывающий, как часть текстового объявления, кодировку этого объекта, когда он является внешним анализируемым объектом. В противном случае это null. |
| [XmlVersion](../../aspose.svg.dom/entity/xmlversion/) { get; } | Атрибут, указывающий, как часть текстового объявления, номер версии этого объекта, когда он является внешним анализируемым объектом. В противном случае это null. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Добавляет узел newChild в конец списка дочерних элементов этого узла. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Этот метод позволяет отправлять события в модель событий реализации. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Выполняет определяемые приложением задачи, связанные с освобождением, высвобождением или сбросом неуправляемых ресурсов. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Этот метод используется для получения объекта ECMAScript.Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Возвращает, имеет ли этот узел (если это элемент) какие-либо атрибуты |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Возвращает, есть ли у этого узла дочерние элементы. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Вставляет узел перед существующим дочерним узлом. Если дочерний элемент имеет значение null, вставьте узел в конец списка дочерних элементов. Если дочерний элемент является объектом DocumentFragment, все его дочерние элементы вставляются в том же порядке перед дочерним элементом. Если дочерний элемент уже есть в дереве, он сначала удаляется. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Этот метод проверяет, является ли указанный namespaceURI пространством имен по умолчанию или нет. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Проверяет, равны ли два узла. Этот метод проверяет равенство узлов, а не одинаковость (т. е. являются ли два узла ссылками на один и тот же объект), что можно проверить с помощью Node.isSameNode(). Все одинаковые узлы также будут равными, хотя обратное может быть неверным. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Возвращает, является ли этот узел тем же узлом, что и заданный. Этот метод позволяет определить, ссылаются ли две ссылки Node, возвращаемые реализацией, на один и тот же объект. Когда две ссылки Node являются ссылками на один и тот же объект, даже через прокси, ссылки могут использоваться полностью взаимозаменяемо, так что все атрибуты имеют одинаковые значения и вызов одного и того же метода DOM для любой ссылки всегда имеет одинаковый эффект. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Найдите URI пространства имен, связанный с данным префиксом, начиная с этого узла. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Найдите префикс, связанный с данным URI пространства имен, начиная с этого узла. Объявления пространств имен по умолчанию игнорируются этим методом. Подробнее об алгоритме, используемом этим методом, см. в разделе Поиск префикса пространства имен. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Помещает все узлы Text на всю глубину поддерева под этим узлом, включая узлы атрибутов, в «нормальную» форму, где только структура (например, элементы, комментарии, инструкции по обработке, разделы CDATA и ссылки на сущности) разделяет текст узлов, т. е. нет ни смежных узлов Text, ни пустых узлов Text. Это можно использовать для обеспечения того, чтобы DOM-представление документа было таким же, как если бы он был сохранен и повторно загружен, и полезно, когда операции (такие как поиск XPointer [XPointer]), которые зависят от конкретной древовидной структуры документа, должны выполняться. использоваться. Если параметр «normalize-characters» объекта DOMConfiguration, прикрепленного к Node.ownerDocument, имеет значение true, этот метод также полностью нормализует символы узлов Text. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Удаляет дочерний узел, указанный oldChild, из списка дочерних элементов и возвращает его. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Заменяет дочерний узел oldChild на newChild в списке дочерних элементов и возвращает узел oldChild. Если newChild является объектом DocumentFragment, то oldChild заменяется всеми дочерними элементами DocumentFragment, которые вставляются в том же порядке. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | ВозвращаетString который представляет этот экземпляр. |

### Смотрите также

* class [Node](../node/)
* пространство имен [Aspose.Svg.Dom](../../aspose.svg.dom/)
* сборка [Aspose.SVG](../../)


