---
title: Text
second_title: Справочник по Aspose.SVG для .NET API
description: Интерфейс Text наследуется от CharacterData и представляет текстовое содержимое называемое символьными данными в XML элемента или атрибута.
type: docs
weight: 1210
url: /ru/net/aspose.svg.dom/text/
---
## Text class

Интерфейс Text наследуется от CharacterData и представляет текстовое содержимое (называемое символьными данными в XML) элемента или атрибута.

```csharp
public class Text : CharacterData
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | NamedNodeMap, содержащий атрибуты этого узла (если это элемент) или null в противном случае. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | Абсолютный базовый URI этого узла или ноль, если реализация не смогла получить абсолютный URI. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | NodeList, содержащий все дочерние элементы этого узла. Если дочерних элементов нет, это NodeList, не содержащий узлов. |
| virtual [Data](../../aspose.svg.dom/characterdata/data) { get; set; } | Символьные данные узла, реализующего этот интерфейс. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Первый потомок этого узла. Если такого узла нет, возвращается null. |
| [IsElementContentWhitespace](../../aspose.svg.dom/text/iselementcontentwhitespace) { get; } | Возвращает, содержит ли этот текстовый узел пробелы содержимого элемента, часто оскорбительно называемые «игнорируемыми пробелами». |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Последний дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [Length](../../aspose.svg.dom/characterdata/length) { get; } | Количество 16-битных единиц, доступных через данные и метод substringData ниже. Это может иметь нулевое значение, т. е. узлы CharacterData могут быть пустыми. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Возвращает локальную часть полного имени этого узла. Для узлов любого типа, кроме ELEMENT_NODE и ATTRIBUTE_NODE, и узлов, созданных с помощью метода DOM уровня 1, например Document.createElement(), всегда равно null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | URI пространства имен этого узла или нуль, если он не указан. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Узел, следующий непосредственно за этим узлом. Если такого узла нет, возвращается null. |
| override [NodeName](../../aspose.svg.dom/text/nodename) { get; } | Имя этого узла в зависимости от его типа. |
| override [NodeType](../../aspose.svg.dom/text/nodetype) { get; } | Код, представляющий тип базового объекта. |
| override [NodeValue](../../aspose.svg.dom/text/nodevalue) { get; set; } | Значение этого узла в зависимости от его типа. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | Объект Document, связанный с этим узлом. Это также объект Document, используемый для создания новых узлов. Когда этот узел является документом или типом документа, который еще не используется ни с одним документом, это значение равно null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Получает родителя[`Element`](../element)этого узла. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Родитель этого узла. Все узлы, кроме Attr, Document, DocumentFragment, Entity и Notation, могут иметь родителя. Однако, если узел был только что создан и еще не добавлен в дерево, или если он был удален из дерева, это значение равно null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Префикс пространства имен этого узла или нуль, если он не указан. Когда он определен как нуль, его установка не имеет никакого эффекта |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Узел, непосредственно предшествующий этому узлу. Если такого узла нет, возвращается null. |
| override [TextContent](../../aspose.svg.dom/text/textcontent) { get; set; } | Этот атрибут возвращает текстовое содержимое этого узла и его потомков. Когда он определен как null, его установка не имеет никакого эффекта. При настройке любые возможные дочерние элементы, которые может иметь этот узел, удаляются и, если новая строка не является пустой или нулевой, заменяются одним текстовым узлом, содержащим строку, на которую установлен этот атрибут. |
| [WholeText](../../aspose.svg.dom/text/wholetext) { get; } | Возвращает весь текст текстовых узлов, логически смежных с этим узлом, объединенных в порядке документа. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Этот метод позволяет регистрировать прослушиватели событий на цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет регистрировать прослушиватели событий на цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Этот метод позволяет регистрировать прослушиватели событий на цели события. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Добавляет узел newChild в конец списка дочерних элементов этого узла. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| virtual [AppendData](../../aspose.svg.dom/characterdata/appenddata)(string) | Добавляет строку в конец символьных данных узла. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Возвращает дубликат этого узла, т.е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Возвращает дубликат этого узла, т.е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| virtual [DeleteData](../../aspose.svg.dom/characterdata/deletedata)(int, int) | Удалить из узла диапазон 16-битных блоков. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Этот метод позволяет отправлять события в модель событий реализации. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Выполняет определяемые приложением задачи, связанные с освобождением, освобождением или сбросом неуправляемых ресурсов. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScriptType. |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Возвращает, имеет ли этот узел (если это элемент) какие-либо атрибуты |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Возвращает, есть ли у этого узла дочерние элементы. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Вставляет узел перед существующим дочерним узлом. Если дочерний элемент равен нулю, вставьте узел в конец списка дочерних элементов. Если дочерний элемент является объектом DocumentFragment, все его дочерние элементы вставляются в том же порядке перед дочерним. Если дочерний элемент уже находится в дереве, он сначала удаляется. |
| virtual [InsertData](../../aspose.svg.dom/characterdata/insertdata)(int, string) | Вставить строку с указанным 16-битным смещением. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Этот метод проверяет, является ли указанный namespaceURI пространством имен по умолчанию или нет. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Проверяет, равны ли два узла. Этот метод проверяет равенство узлов, а не одинаковость (т. е. являются ли два узла ссылками на один и тот же объект), что можно проверить с помощью Node.isSameNode(). Все одинаковые узлы также будут равными, хотя обратное может быть неверным. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Возвращает, является ли этот узел тем же узлом, что и заданный. Этот метод позволяет определить, относятся ли две ссылки Node, возвращаемые реализацией, к одному и тому же объекту. Когда две ссылки Node являются ссылками на один и тот же объект, даже через прокси, ссылки могут использоваться полностью взаимозаменяемо, так что все атрибуты имеют одинаковые значения и вызов одного и того же метода DOM для любой ссылки всегда имеет точно такой же эффект. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Найдите URI пространства имен, связанный с данным префиксом, начиная с этого узла. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Найдите префикс, связанный с данным URI пространства имен, начиная с этого узла. Объявления пространств имен по умолчанию игнорируются этим методом. Подробную информацию об алгоритме, используемом этим методом, см. в разделе Поиск префикса пространства имен. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Помещает все узлы Text на всю глубину поддерева под этим узлом, включая узлы атрибутов, в «нормальную» форму, где только структура (например, элементы, комментарии, инструкции по обработке , разделы CDATA и ссылки на сущности) разделяет узлы Text, т. е. нет ни смежных узлов Text, ни пустых узлов Text. Это можно использовать для обеспечения того, чтобы DOM-представление документа было таким же, как если бы он был сохранен и повторно загружен, и полезно, когда операции (такие как поиск XPointer [XPointer]), которые зависят от конкретной древовидной структуры документа, должны выполняться. использоваться. Если параметр «normalize-characters» объекта DOMConfiguration, прикрепленного к Node.ownerDocument, имеет значение true, этот метод также полностью нормализует символы узлов Text. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Удаляет дочерний узел, указанный oldChild, из списка дочерних, и возвращает его. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)удаляется из[`EventTarget`](../eventtarget)во время обработки события, это не будет вызвано текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)удаляется из[`EventTarget`](../eventtarget)во время обработки события, это не будет вызвано текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)удаляется из[`EventTarget`](../eventtarget)во время обработки события, это не будет вызвано текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Заменяет дочерний узел oldChild на newChild в списке дочерних элементов и возвращает узел oldChild. Если newChild является объектом DocumentFragment, то oldChild заменяется всеми дочерними объектами DocumentFragment, которые вставляются в том же порядке. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| virtual [ReplaceData](../../aspose.svg.dom/characterdata/replacedata)(int, int, string) | Заменить символы, начинающиеся с указанного 16-битного смещения, указанной строкой. |
| [ReplaceWholeText](../../aspose.svg.dom/text/replacewholetext)(string) | Заменяет текст текущего узла и всех логически смежных текстовых узлов указанным текстом. Все логически смежные текстовые узлы удаляются, включая текущий узел, если только он не был получателем замещающего текста. |
| [SplitText](../../aspose.svg.dom/text/splittext)(int) | Разбивает этот узел на два узла по указанному смещению, сохраняя оба в дереве как одноуровневые узлы. |
| virtual [SubstringData](../../aspose.svg.dom/characterdata/substringdata)(int, int) | Извлекает диапазон данных из узла. |
| override [ToString](../../aspose.svg.dom/characterdata/tostring)() | ВозвращаетString, представляющий этот экземпляр. |

### Смотрите также

* class [CharacterData](../characterdata)
* пространство имен [Aspose.Svg.Dom](../../aspose.svg.dom)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
