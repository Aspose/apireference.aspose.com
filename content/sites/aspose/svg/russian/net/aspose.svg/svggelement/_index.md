---
title: SVGGElement
second_title: Справочник по Aspose.SVG для .NET API
description: Интерфейс SVGGElement соответствует элементу g.
type: docs
weight: 3210
url: /ru/net/aspose.svg/svggelement/
---
## SVGGElement class

Интерфейс SVGGElement соответствует элементу 'g'.

```csharp
public class SVGGElement : SVGGraphicsElement
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes) { get; } | NamedNodeMap, содержащий атрибуты этого узла (если это элемент) или null в противном случае. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | Абсолютный базовый URI этого узла или ноль, если реализация не смогла получить абсолютный URI. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount) { get; } | Возвращает текущее количество узлов элемента, которые являются дочерними элементами этого элемента. 0, если у этого элемента нет дочерних узлов с nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | NodeList, содержащий все дочерние элементы этого узла. Если нет детей, это NodeList, не содержащий узлов.. |
| [Children](../../aspose.svg.dom/element/children) { get; } | Возвращает дочерние элементы текущего элемента. |
| [ClassList](../../aspose.svg.dom/element/classlist) { get; } | Возвращает активный DOMTokenList, который содержит токены, полученные в результате разбора атрибута "класс". |
| [ClassName](../../aspose.svg/svgelement/classname) { get; } | Соответствует атрибуту «класс» данного элемента. |
| [ClassName](../../aspose.svg.dom/element/classname) { get; set; } | Атрибут класса элемента. Этот атрибут был переименован due из-за конфликта с ключевым словом class во многих языках. См. определение атрибута класса в HTML 4.01. |
| [FarthestViewportElement](../../aspose.svg/svggraphicselement/farthestviewportelement) { get; } | Самый дальний предок элемента 'svg'. Null, если текущий элемент является самым внешним элементом svg. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Первый дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild) { get; } | Возвращает первый узел дочернего элемента этого элемента. null, если у этого элемента нет дочерних элементов. |
| [Id](../../aspose.svg/svgelement/id) { get; set; } | Значение атрибута 'id' для данного элемента или пустая строка, если 'id' отсутствует. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml) { get; set; } | Возвращает фрагмент HTML или XML, представляющий содержимое элемента. Можно установить, чтобы заменить содержимое элемента узлами, проанализированными из заданной строки. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Последний дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild) { get; } | Возвращает последний узел дочернего элемента этого элемента. null, если у этого элемента нет дочерних элементов. |
| override [LocalName](../../aspose.svg.dom/element/localname) { get; } | Возвращает локальную часть полного имени этого узла. Для узлов любого типа, кроме ELEMENT_NODE и ATTRIBUTE_NODE, и узлов, созданных с помощью метода DOM уровня 1, такого как Document.createElement(), всегда равно null. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri) { get; } | URI пространства имен этого узла или null, если он не указан. |
| [NearestViewportElement](../../aspose.svg/svggraphicselement/nearestviewportelement) { get; } | Элемент, который устанавливает текущее окно просмотра. Часто ближайший предок элемент 'svg'. Null, если текущий элемент является самым внешним элементом svg. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling) { get; } | Возвращает следующий узел одноуровневого элемента этого элемента. null, если у этого элемента нет узлов-сестер, следующих за этим в дереве документа. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Узел, следующий непосредственно за этим узлом. Если такого узла нет, возвращается null. |
| override [NodeName](../../aspose.svg.dom/element/nodename) { get; } | Имя этого узла в зависимости от его типа. |
| override [NodeType](../../aspose.svg.dom/element/nodetype) { get; } | Код, представляющий тип базового объекта. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Значение этого узла в зависимости от его типа. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml) { get; set; } | Возвращает фрагмент HTML или XML, представляющий элемент и его содержимое. Может быть установлено, чтобы заменить элемент узлами, проанализированными из заданной строки. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | Объект документа, связанный с этим узлом. Это также объект Document, используемый для создания новых узлов. Когда этот узел является документом или типом документа, который еще не используется ни с одним документом, это значение равно null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement) { get; } | Ближайший элемент-предок 'svg'. Null, если данный элемент является самым внешним элементом svg. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Получает родителя[`Element`](../../aspose.svg.dom/element) этого узла. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Родитель этого узла. Все узлы, кроме Attr, Document, DocumentFragment, Entity и Notation, могут иметь родителя. Однако, если узел был только что создан и еще не добавлен в дерево, или если он был удален из дерева, это значение null. |
| override [Prefix](../../aspose.svg.dom/element/prefix) { get; } | Префикс пространства имен этого узла или нуль, если он не указан. Когда он определен как нуль, его установка не имеет никакого эффекта |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling) { get; } | Возвращает предыдущий узел родственного элемента этого элемента. null, если этот элемент не имеет родственных узлов, предшествующих ему в дереве документа. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Узел, непосредственно предшествующий этому узлу. Если такого узла нет, возвращается null. |
| [RequiredExtensions](../../aspose.svg/svggraphicselement/requiredextensions) { get; } | Соответствует атрибуту «requiredExtensions» данного элемента. |
| [RequiredFeatures](../../aspose.svg/svggraphicselement/requiredfeatures) { get; } | Соответствует атрибуту «requiredFeatures» данного элемента. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo) { get; } | Информация о типе, связанная с этим элементом. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot) { get; } | Возвращает shadowRoot, хранящийся в этом элементе, или null, если он закрыт. |
| [Style](../../aspose.svg/svgelement/style) { get; } | Соответствует атрибуту «стиль» данного элемента. Если пользовательский агент не поддерживает стилизацию с помощью CSS, этот атрибут всегда должен иметь значение null. |
| [SystemLanguage](../../aspose.svg/svggraphicselement/systemlanguage) { get; } | Соответствует атрибуту systemLanguage данного элемента. |
| [TagName](../../aspose.svg.dom/element/tagname) { get; } | Имя элемента. |
| override [TextContent](../../aspose.svg.dom/element/textcontent) { get; set; } | Этот атрибут возвращает текстовое содержимое этого узла и его потомков. Когда он определен как null, его установка не имеет никакого эффекта. При настройке любые возможные дочерние элементы, которые может иметь этот узел, удаляются и, если новая строка не является пустой или нулевой, заменяются одним текстовым узлом, содержащим строку, на которую установлен этот атрибут. |
| [Transform](../../aspose.svg/svggraphicselement/transform) { get; } | Соответствует атрибуту «преобразование» данного элемента. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement) { get; } | Элемент, который устанавливает текущее окно просмотра. Часто ближайший предок элемент 'svg'. Null, если данный элемент является самым внешним элементом svg. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Добавляет узел newChild в конец списка дочерних элементов этого узла. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow)(ShadowRootMode) | Создает теневой корень и прикрепляет его к текущему элементу. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Этот метод позволяет отправлять события в модель событий реализации. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Выполняет определяемые приложением задачи, связанные с освобождением, высвобождением или сбросом неуправляемых ресурсов. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute)(string) | Извлекает значение атрибута по имени. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode)(string) | Извлекает узел атрибута по имени. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens)(string, string) | Извлекает узел Attr по локальному имени и URI пространства имен. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens)(string, string) | Извлекает значение атрибута по локальному имени и URI пространства имен. |
| [GetBBox](../../aspose.svg/svggraphicselement/getbbox)() | Возвращает тесную ограничивающую рамку в текущем пользовательском пространстве (т. е. после применения атрибута «преобразования», если таковой имеется) к геометрии всех содержащихся графических элементов, за исключением обводки, обрезки, маскирования и эффектов фильтрации). Обратите внимание, что getBBox должен возвращать фактическую ограничивающую рамку во время вызова метода, даже если элемент еще не был отрендерен. |
| [GetCTM](../../aspose.svg/svggraphicselement/getctm)() | Возвращает матрицу преобразования из текущих пользовательских единиц измерения (т. е. после применения атрибута «преобразование», если таковой имеется) в систему координат окна просмотра для ближайшего элемента ViewportElement. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname)(string) | Возвращает активный объект NodeList, содержащий все элементы документа, имеющие все классы, указанные в аргументе. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname)(string) | Возвращает NodeList всех элементов-потомков с заданным именем тега в порядке документа. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens)(string, string) | Возвращает NodeList всех элементов-потомков с заданным локальным именем и URI пространства имен в порядке документа. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScript.Type . |
| [GetScreenCTM](../../aspose.svg/svggraphicselement/getscreenctm)() | Возвращает матрицу преобразования из текущих пользовательских единиц (т. е. после применения атрибута «преобразования», если таковой имеется) в уведомление родительского пользовательского агента о «пикселе». Для устройств отображения в идеале это представляет собой физический пиксель экрана. Для других устройств или сред, где физические размеры пикселей неизвестны, вместо этого можно использовать алгоритм, аналогичный определению «пикселя» в CSS2. Обратите внимание, что null возвращается, если этот элемент не подключен к дереву документа. Этот метод можно было бы назвать более подходящим как getClientCTM, но имя getScreenCTM сохранено по историческим причинам. |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute)(string) | Возвращает значение true, если атрибут с заданным именем указан в этом элементе или имеет значение по умолчанию, в противном случае — значение false. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens)(string, string) | Возвращает значение true, если атрибут с заданным локальным именем и URI пространства имен указан в этом элементе или имеет значение по умолчанию, в противном случае — значение false. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes)() | Возвращает, имеет ли этот узел (если это элемент) какие-либо атрибуты |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Возвращает, есть ли у этого узла дочерние элементы. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Вставляет узел перед существующим дочерним узлом. Если дочерний элемент имеет значение null, вставьте узел в конец списка дочерних элементов. Если дочерний элемент является объектом DocumentFragment, все его дочерние элементы вставляются в том же порядке перед дочерним элементом. Если дочерний элемент уже есть в дереве, он сначала удаляется. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Этот метод проверяет, является ли указанный namespaceURI пространством имен по умолчанию или нет. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Проверяет, равны ли два узла. Этот метод проверяет равенство узлов, а не одинаковость (т. е. являются ли два узла ссылками на один и тот же объект), что можно проверить с помощью Node.isSameNode(). Все одинаковые узлы также будут равными, хотя обратное может быть неверным. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Возвращает, является ли этот узел тем же узлом, что и заданный. Этот метод позволяет определить, ссылаются ли две ссылки Node, возвращаемые реализацией, на один и тот же объект. Когда две ссылки Node являются ссылками на один и тот же объект, даже через прокси, ссылки могут использоваться полностью взаимозаменяемо, так что все атрибуты имеют одинаковые значения и вызов одного и того же метода DOM для любой ссылки всегда имеет одинаковый эффект. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Найдите URI пространства имен, связанный с данным префиксом, начиная с этого узла. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Найдите префикс, связанный с данным URI пространства имен, начиная с этого узла. Объявления пространств имен по умолчанию игнорируются этим методом. Подробнее об алгоритме, используемом этим методом, см. в разделе Поиск префикса пространства имен. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Помещает все узлы Text на всю глубину поддерева под этим узлом, включая узлы атрибутов, в «нормальную» форму, где только структура (например, элементы, комментарии, инструкции по обработке, разделы CDATA и ссылки на сущности) разделяет текст узлов, т. е. нет ни смежных узлов Text, ни пустых узлов Text. Это можно использовать для обеспечения того, чтобы DOM-представление документа было таким же, как если бы он был сохранен и повторно загружен, и полезно, когда операции (такие как поиск XPointer [XPointer]), которые зависят от конкретной древовидной структуры документа, должны выполняться. использоваться. Если параметр «normalize-characters» объекта DOMConfiguration, прикрепленного к Node.ownerDocument, имеет значение true, этот метод также полностью нормализует символы узлов Text. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector)(string) | Возвращает первый элемент в документе, соответствующий selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall)(string) | Возвращает NodeList всех элементов в документе, которые соответствуют selector |
| [Remove](../../aspose.svg.dom/element/remove)() | Удаляет этот экземпляр. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute)(string) | Удаляет атрибут по имени. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode)(Attr) | Удаляет указанный узел атрибута. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens)(string, string) | Удаляет атрибут по локальному имени и URI пространства имен. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Удаляет дочерний узел, указанный oldChild, из списка дочерних элементов и возвращает его. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Заменяет дочерний узел oldChild на newChild в списке дочерних элементов и возвращает узел oldChild. Если newChild является объектом DocumentFragment, то oldChild заменяется всеми дочерними элементами DocumentFragment, которые вставляются в том же порядке. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute)(string, string) | Добавляет новый атрибут. Если атрибут с таким именем уже присутствует в элементе, его значение изменяется на значение параметра . |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode)(Attr) | Добавляет новый узел атрибута. Если атрибут с таким именем (nodeName) уже присутствует в элементе, он заменяется новым. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens)(Attr) | Добавляет новый атрибут. Если атрибут с таким локальным именем и этим URI пространства имен уже присутствует в элементе, он заменяется новым. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens)(string, string, string) | Добавляет новый атрибут. Если атрибут с тем же локальным именем и URI пространства имен уже присутствует в элементе, его префикс изменяется на префиксную часть квалифицированного имени, а его значение изменяется на параметр значения. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute)(string, bool) | Если параметр isId имеет значение true, этот метод объявляет указанный атрибут как определяемый пользователем атрибут ID. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode)(Attr, bool) | Если параметр isId имеет значение true, этот метод объявляет указанный атрибут как определяемый пользователем атрибут ID. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens)(string, string, bool) | Если параметр isId имеет значение true, этот метод объявляет указанный атрибут как определяемый пользователем атрибут ID. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | ВозвращаетString который представляет этот экземпляр. |

### Смотрите также

* class [SVGGraphicsElement](../svggraphicselement)
* пространство имен [Aspose.Svg](../../aspose.svg)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
