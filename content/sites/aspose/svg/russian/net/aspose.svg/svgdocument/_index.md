---
title: Class SVGDocument
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.SVGDocument сорт. АнSVGдокументявляется корнем иерархии SVG и содержит все содержимое. Помимо предоставления доступа к иерархии он также предоставляет некоторые удобные методы для доступа к определенным наборам информации из документа. Когда элемент svg встроен как компонент документа из другого пространства имен например когда элемент встроен в документ XHTML XHTML тогда объект SVGDocument не будет существовать вместо этого корневым объектом в иерархии объектов документа будет объект Document другого типа например объект HTMLDocument. Однако объект SVGDocument действительно будет существовать если корневым элементом иерархии документов XML является элемент svg  например при просмотре автономного файла SVG т. е. файла с типом MIME image/svgxml. В этом случае объект SVGDocument будет корневым объектом иерархии объектной модели документа.
type: docs
weight: 3190
url: /ru/net/aspose.svg/svgdocument/
---
## SVGDocument class

Ан`SVG-документ`является корнем иерархии SVG и содержит все содержимое. Помимо предоставления доступа к иерархии, он также предоставляет некоторые удобные методы для доступа к определенным наборам информации из документа. Когда элемент «svg» встроен как компонент документа из другого пространства имен, например, когда элемент встроен в документ XHTML [XHTML], тогда объект SVGDocument не будет существовать; вместо этого корневым объектом в иерархии объектов документа будет объект Document другого типа, например объект HTMLDocument. Однако объект SVGDocument действительно будет существовать, если корневым элементом иерархии документов XML является элемент 'svg' , например, при просмотре автономного файла SVG (т. е. файла с типом MIME «image/svg+xml»). В этом случае объект SVGDocument будет корневым объектом иерархии объектной модели документа.

```csharp
public class SVGDocument : Document, IDocumentCSS
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [SVGDocument](svgdocument/#constructor)() | Инициализирует новый экземпляр`SVGDocument` класс. |
| [SVGDocument](svgdocument/#constructor_1)(Configuration) | Инициализирует новый экземпляр`SVGDocument` класс. |
| [SVGDocument](svgdocument/#constructor_2)(RequestMessage) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_10)(string) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_4)(Url) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_3)(RequestMessage, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_8)(Stream, string) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . Загрузка документа начинается с текущей позиции в потоке. |
| [SVGDocument](svgdocument/#constructor_6)(Stream, Url) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . Загрузка документа начинается с текущей позиции в потоке. |
| [SVGDocument](svgdocument/#constructor_11)(string, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_14)(string, string) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_12)(string, Url) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_5)(Url, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_9)(Stream, string, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . Загрузка документа начинается с текущей позиции в потоке. |
| [SVGDocument](svgdocument/#constructor_7)(Stream, Url, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . Загрузка документа начинается с текущей позиции в потоке. |
| [SVGDocument](svgdocument/#constructor_15)(string, string, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |
| [SVGDocument](svgdocument/#constructor_13)(string, Url, Configuration) | Инициализирует новый экземпляр`SVGDocument`сорт. Конструктор работает синхронно, он ожидает загрузки всех внешних ресурсов (изображений, скриптов и т.д.). Для асинхронной загрузки документа используйте метод[`Navigate`](../../aspose.svg.dom/document/navigate/) или его перегрузки. Либо можно отключить загрузку некоторых внешних ресурсов, установив соответствующие флаги в[`Security`](../../aspose.svg.dom/ibrowsingcontext/security/) . |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | NamedNodeMap, содержащий атрибуты этого узла (если это элемент) или null в противном случае. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | Абсолютный базовый URI этого узла или ноль, если реализация не смогла получить абсолютный URI. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Получает кодировку документа. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Получает кодировку документа. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Возвращает текущее количество узлов элемента, которые являются дочерними элементами этого элемента. 0, если у этого элемента нет дочерних узлов с nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | NodeList, содержащий все дочерние элементы этого узла. Если нет детей, это NodeList, не содержащий узлов.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Возвращает дочерние элементы. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Получает тип содержимого документа. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Получает текущий контекст просмотра. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | IDL-атрибут defaultView интерфейса Document при получении должен возвращать объект WindowProxy контекста просмотра этого документа, , если этот документ имеет связанный контекст просмотра, или null в противном случае. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | Объявление типа документа, связанное с этим документом. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | Это удобный атрибут, который обеспечивает прямой доступ к дочернему узлу, который является элементом документа документа. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | Расположение документа или null, если он не определен или документ был создан с использованием DOMImplementation.createDocument. |
| [Domain](../../aspose.svg/svgdocument/domain/) { get; } | Доменное имя сервера, который обслуживал документ, или пустая строка, если сервер не может быть идентифицирован по доменному имени. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Первый дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Возвращает первый узел дочернего элемента этого элемента. null, если у этого элемента нет дочерних элементов. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | Объект DOMImplementation, который обрабатывает этот документ. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Получает кодировку документа. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Последний дочерний элемент этого узла. Если такого узла нет, возвращается null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Возвращает последний узел дочернего элемента этого элемента. null, если у этого элемента нет дочерних элементов. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Возвращает локальную часть полного имени этого узла. Для узлов любого типа, кроме ELEMENT_NODE и ATTRIBUTE_NODE, и узлов, созданных с помощью метода DOM уровня 1, такого как Document.createElement(), всегда равно null. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | Расположение документа. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | URI пространства имен этого узла или null, если он не указан. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Возвращает следующий узел одноуровневого элемента этого элемента. null, если у этого элемента нет узлов-сестер, следующих за этим в дереве документа. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Узел, следующий непосредственно за этим узлом. Если такого узла нет, возвращается null. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | Имя этого узла в зависимости от его типа. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | Код, представляющий тип базового объекта. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Значение этого узла в зависимости от его типа. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Получает источник документа. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Получает документ владельца. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Получает родителя[`Element`](../../aspose.svg.dom/element/) этого узла. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Родитель этого узла. Все узлы, кроме Attr, Document, DocumentFragment, Entity и Notation, могут иметь родителя. Однако, если узел был только что создан и еще не добавлен в дерево, или если он был удален из дерева, это значение null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Префикс пространства имен этого узла или нуль, если он не указан. Когда он определен как нуль, его установка не имеет никакого эффекта |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Возвращает предыдущий узел родственного элемента этого элемента. null, если этот элемент не имеет родственных узлов, предшествующих ему в дереве документа. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Узел, непосредственно предшествующий этому узлу. Если такого узла нет, возвращается null. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Возвращает готовность документа. «Загрузка» во время загрузки документа, «интерактивная» после завершения синтаксического анализа, но по-прежнему загружающая подресурсы, и «завершение» после загрузки. |
| [Referrer](../../aspose.svg/svgdocument/referrer/) { get; } | Возвращает URI страницы, которая ссылается на эту страницу. Значение представляет собой пустую строку, если пользователь перешел на страницу напрямую (не по ссылке, а, например, через закладку). |
| [RootElement](../../aspose.svg/svgdocument/rootelement/) { get; } | Корень 'svg' в иерархии документов. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | Атрибут, указывающий, применяется ли проверка ошибок или нет. Если установлено значение false, реализация может не тестировать каждый возможный случай ошибки, обычно определенный для операций DOM, и не вызывать никаких исключений DOMException для операций DOM или сообщать об ошибках при использовании Document.normalizeDocument(). В случае ошибки поведение не определено. Этот атрибут по умолчанию имеет значение true. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | Список, содержащий все таблицы стилей, явно связанные с документом или встроенные в него. Для HTML-документов сюда входят внешние таблицы стилей, включаемые через HTML-элемент LINK, и встроенные элементы STYLE. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Этот атрибут возвращает текстовое содержимое этого узла и его потомков. Когда он определен как null, его установка не имеет никакого эффекта. При настройке любые возможные дочерние элементы, которые может иметь этот узел, удаляются и, если новая строка не является пустой или нулевой, заменяются одним текстовым узлом, содержащим строку, на которую установлен этот атрибут. |
| [Title](../../aspose.svg/svgdocument/title/) { get; } | Заголовок документа, указанный в подэлементе title корневого элемента svg (т. е.Вот название... ) |
| [URL](../../aspose.svg/svgdocument/url/) { get; } | Полный URI документа. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | Атрибут, указывающий, как часть объявления XML, является ли этот документ автономным. Это неверно, если не указано. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | Атрибут, указывающий, как часть объявления XML, номер версии этого документа. Если объявления нет и если этот документ поддерживает функцию «XML», значение равно «1,0». Если этот документ не поддерживает функцию «XML», значение всегда равно null. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Добавляет узел newChild в конец списка дочерних элементов этого узла. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Возвращает дубликат этого узла, т. е. служит универсальным конструктором копирования для узлов. Дублирующий узел не имеет родителя (parentNode имеет значение null) и пользовательских данных. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | Создает атрибут с заданным именем. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | Создает атрибут с заданным полным именем и URI пространства имен. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | Создает узел CDATASection, значением которого является указанная строка. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | Создает узел Comment с заданной строкой. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Создает пустой объект DocumentFragment. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | Создает узел DocumentType. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | Создает элемент указанного типа. Обратите внимание, что возвращаемый экземпляр реализует интерфейс Element, поэтому атрибуты можно указывать непосредственно в возвращаемом объекте. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | Создает элемент с заданным полным именем и URI пространства имен. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | Создает объект EntityReference. Кроме того, если объект, на который делается ссылка, известен, дочерний список узла EntityReference делается таким же, как список соответствующего узла Entity. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | Создает[`Event`](../../aspose.svg.dom.events/event/) типа, поддерживаемого реализацией. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | Создает проанализированное выражение XPath с разрешенными пространствами имен. Это полезно , когда выражение будет повторно использоваться в приложении, поскольку позволяет скомпилировать строку выражения в более эффективную внутреннюю форму и предварительно разрешить все префиксы пространства имен, которые встречаются в выражении. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/)(Node) | Создать новый NodeIterator поверх поддерева с корнем в указанном узле . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/)(Node, long) | Создать новый NodeIterator поверх поддерева с корнем в указанном узле . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/)(Node, long, INodeFilter) | Создать новый NodeIterator поверх поддерева с корнем в указанном узле . |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | Адаптирует любой узел DOM для разрешения пространств имен, чтобы выражение XPath можно было легко оценить относительно контекста узла, в котором оно появилось в документе. Этот адаптер работает как метод DOM Level 3.`lookupNamespaceURI` на узлах при разрешении namespaceURI из заданного префикса, используя текущую информацию, доступную в иерархии узла в момент вызова time lookupNamespaceURI, также правильно разрешая неявный префикс xml. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | Создает узел ProcessingInstruction с заданным именем и строками данных. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | Создает узел Text с заданной строкой. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/)(Node) | Создать новый TreeWalker поверх поддерева с корнем в указанном узле . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/)(Node, long) | Создать новый TreeWalker поверх поддерева с корнем в указанном узле . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/)(Node, long, INodeFilter) | Создать новый TreeWalker поверх поддерева с корнем в указанном узле . |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Этот метод позволяет отправлять события в модель событий реализации. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Выполняет определяемые приложением задачи, связанные с освобождением, высвобождением или сбросом неуправляемых ресурсов. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | Вычисляет строку выражения XPath и возвращает результат указанного типа, если это возможно. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | Возвращает элемент, который имеет атрибут ID с заданным значением. Если такого элемента не существует, возвращается null. Если более чем один элемент имеет атрибут ID с таким значением, возвращается значение undefined. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | Возвращает активный объект NodeList, содержащий все элементы документа, имеющие все классы, указанные в аргументе. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | Возвращает NodeList всех элементов в порядке документа с заданным именем тега и содержится в документе. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | Возвращает NodeList всех элементов с заданным локальным именем и URI пространства имен в порядке документа. |
| [GetOverrideStyle](../../aspose.svg/svgdocument/getoverridestyle/)(Element, string) | Этот метод используется для получения объявления стиля переопределения для указанного элемента и указанного псевдоэлемента. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Этот метод используется для получения объекта ECMAScript.Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Возвращает, имеет ли этот узел (если это элемент) какие-либо атрибуты |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Возвращает, есть ли у этого узла дочерние элементы. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | Импортирует узел из другого документа в этот документ, не изменяя и не удаляя исходный узел из исходного документа; этот метод создает новую копию исходного узла. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Вставляет узел перед существующим дочерним узлом. Если дочерний элемент имеет значение null, вставьте узел в конец списка дочерних элементов. Если дочерний элемент является объектом DocumentFragment, все его дочерние элементы вставляются в том же порядке перед дочерним элементом. Если дочерний элемент уже есть в дереве, он сначала удаляется. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Этот метод проверяет, является ли указанный namespaceURI пространством имен по умолчанию или нет. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Проверяет, равны ли два узла. Этот метод проверяет равенство узлов, а не одинаковость (т. е. являются ли два узла ссылками на один и тот же объект), что можно проверить с помощью Node.isSameNode(). Все одинаковые узлы также будут равными, хотя обратное может быть неверным. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Возвращает, является ли этот узел тем же узлом, что и заданный. Этот метод позволяет определить, ссылаются ли две ссылки Node, возвращаемые реализацией, на один и тот же объект. Когда две ссылки Node являются ссылками на один и тот же объект, даже через прокси, ссылки могут использоваться полностью взаимозаменяемо, так что все атрибуты имеют одинаковые значения и вызов одного и того же метода DOM для любой ссылки всегда имеет одинаковый эффект. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Найдите URI пространства имен, связанный с данным префиксом, начиная с этого узла. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Найдите префикс, связанный с данным URI пространства имен, начиная с этого узла. Объявления пространств имен по умолчанию игнорируются этим методом. Подробнее об алгоритме, используемом этим методом, см. в разделе Поиск префикса пространства имен. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(RequestMessage) | Загружает документ на основе указанного объекта запроса, заменяя предыдущее содержимое. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(string) | Загружает документ по указанному универсальному указателю ресурсов (URL) в текущий экземпляр, заменяя предыдущее содержимое. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(Url) | Загружает документ по указанному универсальному указателю ресурсов (URL) в текущий экземпляр, заменяя предыдущее содержимое. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(Stream, string) | Загружает документ из указанного содержимого и использует baseUri для разрешения относительных ресурсов, заменяя предыдущее содержимое. Загрузка документа начинается с текущей позиции в потоке. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(Stream, Url) | Загружает документ из указанного содержимого и использует baseUri для разрешения относительных ресурсов, заменяя предыдущее содержимое. Загрузка документа начинается с текущей позиции в потоке. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(string, string) | Загружает документ из указанного содержимого и использует baseUri для разрешения относительных ресурсов, заменяя предыдущее содержимое. |
| [Navigate](../../aspose.svg.dom/document/navigate/)(string, Url) | Загружает документ из указанного содержимого и использует baseUri для разрешения относительных ресурсов, заменяя предыдущее содержимое. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Помещает все узлы Text на всю глубину поддерева под этим узлом, включая узлы атрибутов, в «нормальную» форму, где только структура (например, элементы, комментарии, инструкции по обработке, разделы CDATA и ссылки на сущности) разделяет текст узлов, т. е. нет ни смежных узлов Text, ни пустых узлов Text. Это можно использовать для обеспечения того, чтобы DOM-представление документа было таким же, как если бы он был сохранен и повторно загружен, и полезно, когда операции (такие как поиск XPointer [XPointer]), которые зависят от конкретной древовидной структуры документа, должны выполняться. использоваться. Если параметр «normalize-characters» объекта DOMConfiguration, прикрепленного к Node.ownerDocument, имеет значение true, этот метод также полностью нормализует символы узлов Text. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | Возвращает первый элемент в документе, соответствующий selector |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | Возвращает NodeList всех элементов в документе, которые соответствуют selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Удаляет дочерний узел, указанный oldChild, из списка дочерних элементов и возвращает его. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../../aspose.svg.dom/eventtarget/) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| override [RenderTo](../../aspose.svg/svgdocument/renderto/)(IDevice) | Этот метод используется для печати содержимого текущего документа на указанное устройство. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Заменяет дочерний узел oldChild на newChild в списке дочерних элементов и возвращает узел oldChild. Если newChild является объектом DocumentFragment, то oldChild заменяется всеми дочерними элементами DocumentFragment, которые вставляются в том же порядке. Если новый дочерний элемент уже находится в дереве, он сначала удаляется. |
| [Save](../../aspose.svg/svgdocument/save/#save)(IOutputStorage) | Сохраняет содержимое и ресурсы документа в выходное хранилище. |
| [Save](../../aspose.svg/svgdocument/save/#save_6)(string) | Сохраняет документ в локальный файл, указанный`путь` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| [Save](../../aspose.svg/svgdocument/save/#save_3)(Url) | Сохраняет документ в локальный файл, указанный`URL` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| [Save](../../aspose.svg/svgdocument/save/#save_1)(IOutputStorage, SVGSaveFormat) | Сохраняет содержимое и ресурсы документа в выходное хранилище. |
| [Save](../../aspose.svg/svgdocument/save/#save_2)(IOutputStorage, SVGSaveOptions) | Сохраняет содержимое и ресурсы документа в выходное хранилище. |
| [Save](../../aspose.svg/svgdocument/save/#save_7)(string, SVGSaveFormat) | Сохраняет документ в локальный файл, указанный`путь` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| [Save](../../aspose.svg/svgdocument/save/#save_8)(string, SVGSaveOptions) | Сохраняет документ в локальный файл, указанный`путь` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| [Save](../../aspose.svg/svgdocument/save/#save_4)(Url, SVGSaveFormat) | Сохраняет документ в локальный файл, указанный`URL` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| [Save](../../aspose.svg/svgdocument/save/#save_5)(Url, SVGSaveOptions) | Сохраняет документ в локальный файл, указанный`URL` . Все ресурсы, используемые в этом документе, будут сохранены в в соседней папке, имя которой будет построено как: output_file_name + "_files". |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | ВозвращаетString который представляет этот экземпляр. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | Записать строку текста в поток документов, открытый с помощью open(). Обратите внимание, что функция создаст документ , который не обязательно управляется DTD и поэтому может быть выдавать недопустимый результат в контексте документа. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | Запишите строку текста, за которой следует символ новой строки, в поток document , открытый функцией open(). Обратите внимание, что функция будет создавать документ, который не обязательно управляется DTD, и поэтому может давать недопустимый результат в контексте document |

## События

| Имя | Описание |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | Получает или задает обработчик события OnAbort. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | Получает или задает обработчик события OnBlur. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | Получает или задает обработчик события OnCancel. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | Получает или задает обработчик события OnCanplay. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | Получает или задает обработчик события OnCanPlayThrough. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | Получает или задает обработчик события OnChange. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | Получает или задает обработчик события OnClick. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | Получает или задает обработчик события OnCueChange. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | Получает или задает обработчик события OnDblClick. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | Получает или задает обработчик события OnDurationChange. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | Получает или задает обработчик события OnEmptied. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | Получает или задает обработчик события OnEnded. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | Получает или задает обработчик события OnError. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | Получает или задает обработчик события OnFocus. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | Получает или задает обработчик события OnInput. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | Получает или задает обработчик события OnInvalid. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | Получает или задает обработчик события OnKeyDown. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | Получает или задает обработчик события OnKeyPress. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | Получает или задает обработчик события OnKeyUp. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | Получает или задает обработчик события OnLoad. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | Получает или задает обработчик события OnLoadedData. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | Получает или задает обработчик события OnLoadedMetadata. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | Получает или задает обработчик события OnLoadStart. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | Получает или задает обработчик события OnMouseDown. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | Получает или задает обработчик события OnMouseEnter. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | Получает или задает обработчик события OnMouseLeave. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | Получает или задает обработчик события OnMouseMove. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | Получает или задает обработчик события OnMouseOut. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | Получает или задает обработчик события OnMouseOver. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | Получает или задает обработчик события OnMouseUp. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | Получает или задает обработчик события OnMouseWheel. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | Получает или задает обработчик события OnPause. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | Получает или задает обработчик события OnPlay. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | Получает или задает обработчик события OnPlaying. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | Получает или задает обработчик события OnProgress. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | Получает или задает обработчик события OnRateChange. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | Получает или задает обработчик события OnReadyStateChange. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | Получает или задает обработчик события OnReset. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | Получает или задает обработчик события OnResize. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | Получает или задает обработчик события OnScroll. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | Получает или задает обработчик события OnSeeked. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | Получает или задает обработчик события OnSeeking. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | Получает или задает обработчик события OnSelect. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | Получает или задает обработчик события OnShow. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | Получает или задает обработчик события OnStalled. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | Получает или задает обработчик события OnSubmit. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | Получает или задает обработчик события OnSuspend. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | Получает или задает обработчик события OnTimeUpdate. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | Получает или задает обработчик события OnToggle. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | Получает или задает обработчик события OnVolumeChange. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | Получает или задает обработчик события OnWaiting. |

### Смотрите также

* class [Document](../../aspose.svg.dom/document/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss/)
* пространство имен [Aspose.Svg](../../aspose.svg/)
* сборка [Aspose.SVG](../../)


