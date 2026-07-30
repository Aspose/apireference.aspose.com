---
title: "Пространство имён System::Xml"
linktitle: "System::Xml"
second_title: "Aspose.Font для C++"
description: "Как использовать пространство имён System::Xml в C++."
type: docs
weight: 7800
url: /ru/cpp/system.xml/
---



## Классы

| Класс | Описание |
| --- | --- |
| [IApplicationResourceStreamResolver](./iapplicationresourcestreamresolver/) | Представляет разрешитель потоков ресурсов приложения. |
| [IHasXmlNode](./ihasxmlnode/) | Позволяет классу возвращать [XmlNode](./xmlnode/) из текущего контекста или позиции. |
| [IXmlLineInfo](./ixmllineinfo/) | Предоставляет интерфейс, позволяющий классу возвращать информацию о строке и позиции. |
| [IXmlNamespaceResolver](./ixmlnamespaceresolver/) | Обеспечивает доступ только для чтения к набору сопоставлений префиксов и пространств имён. |
| [NameTable](./nametable/) | Реализует однопоточную [XmlNameTable](./xmlnametable/). |
| [XmlAttribute](./xmlattribute/) | Представляет атрибут. Допустимые и значения по умолчанию для атрибута определены в определении типа документа (DTD) или схеме. |
| [XmlAttributeCollection](./xmlattributecollection/) | Представляет коллекцию атрибутов, к которой можно получить доступ по имени или индексу. |
| [XmlCDataSection](./xmlcdatasection/) | Представляет секцию CDATA. |
| [XmlCharacterData](./xmlcharacterdata/) | Предоставляет методы манипуляции текстом, используемые несколькими классами. |
| [XmlCharType](./xmlchartype/) | Для внутренних целей. Не используйте этот класс напрямую. |
| [XmlComment](./xmlcomment/) | Представляет содержимое XML‑комментария. |
| [XmlConvert](./xmlconvert/) | Кодирует и декодирует имена XML, а также предоставляет методы для преобразования между типами во время выполнения и типами языка определения XML [Schema](../system.xml.schema/) (XSD). При преобразовании типов данных возвращаемые значения не зависят от локали. |
| [XmlDeclaration](./xmldeclaration/) | Представляет узел объявления XML **<?xml version='1.0'...?>**. |
| [XmlDocument](./xmldocument/) | Представляет XML‑документ. Вы можете использовать этот класс для загрузки, проверки, редактирования, добавления и позиционирования XML в документе. |
| [XmlDocumentFragment](./xmldocumentfragment/) | Представляет лёгкий объект, полезный для операций вставки в дерево. |
| [XmlDocumentType](./xmldocumenttype/) | Представляет объявление типа документа. |
| [XmlElement](./xmlelement/) | Представляет элемент. |
| [XmlEntity](./xmlentity/) | Представляет объявление сущности, например **<!ENTITY... >**. |
| [XmlEntityReference](./xmlentityreference/) | Представляет узел ссылки на сущность. |
| [XmlImplementation](./xmlimplementation/) | Определяет контекст для набора объектов [XmlDocument](./xmldocument/). |
| [XmlLinkedNode](./xmllinkednode/) | Возвращает узел, непосредственно предшествующий или следующий за этим узлом. |
| [XmlNamedNodeMap](./xmlnamednodemap/) | Представляет коллекцию узлов, к которой можно обращаться по имени или индексу. |
| [XmlNamespaceManager](./xmlnamespacemanager/) | Разрешает, добавляет и удаляет пространства имён в коллекции и обеспечивает управление их областью видимости. |
| [XmlNameTable](./xmlnametable/) | Таблица атомизированных строковых объектов. |
| [XmlNode](./xmlnode/) | Представляет отдельный узел в XML‑документе. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/) | Предоставляет данные для событий **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** и **XmlDocument::NodeRemoving**. |
| [XmlNodeList](./xmlnodelist/) | Представляет упорядоченную коллекцию узлов. |
| [XmlNodeReader](./xmlnodereader/) | Представляет считыватель, обеспечивающий быстрый, некешированный последовательный доступ только вперёд к XML‑данным в объекте [XmlNode](./xmlnode/). |
| [XmlNotation](./xmlnotation/) | Представляет объявление нотации, например **<!NOTATION... >**. |
| [XmlParserContext](./xmlparsercontext/) | Предоставляет всю контекстную информацию, необходимую [XmlReader](./xmlreader/) для разбора XML‑фрагмента. |
| [XmlProcessingInstruction](./xmlprocessinginstruction/) | Представляет инструкцию обработки, которую XML определяет для сохранения специфической для процессора информации в тексте документа. |
| [XmlQualifiedName](./xmlqualifiedname/) | Представляет квалифицированное имя XML. |
| [XmlReader](./xmlreader/) | Представляет считыватель, обеспечивающий быстрый, некешированный последовательный доступ только вперёд к XML‑данным. |
| [XmlReaderSettings](./xmlreadersettings/) | Указывает набор функций, поддерживаемых объектом [XmlReader](./xmlreader/), созданным методом [XmlReader::Create](./xmlreader/create/). |
| [XmlResolver](./xmlresolver/) | Разрешает внешние XML‑ресурсы, указанные унифицированным идентификатором ресурса (URI). |
| [XmlSecureResolver](./xmlsecureresolver/) | Помогает обеспечить безопасность другой реализации [XmlResolver](./xmlresolver/), оборачивая объект [XmlResolver](./xmlresolver/) и ограничивая ресурсы, к которым имеет доступ базовый [XmlResolver](./xmlresolver/). |
| [XmlSignificantWhitespace](./xmlsignificantwhitespace/) | Представляет пробельные символы между разметкой в узле смешанного содержимого или пробелы внутри области **xml:space='preserve'**. Это также называется значимыми пробельными символами. |
| [XmlText](./xmltext/) | Представляет текстовое содержимое элемента или атрибута. |
| [XmlTextReader](./xmltextreader/) | Представляет считыватель, обеспечивающий быстрый, некешированный последовательный доступ только вперёд к XML‑данным. |
| [XmlTextWriter](./xmltextwriter/) | Представляет записывающий объект, обеспечивающий быстрый, некешированный последовательный способ генерации потоков или файлов, содержащих XML‑данные, соответствующие рекомендациям W3C Extensible Markup Language (XML) 1.0 и Namespaces in XML. |
| [XmlUrlResolver](./xmlurlresolver/) | Разрешает внешние XML‑ресурсы, указанные унифицированным идентификатором ресурса (URI). |
| [XmlValidatingReader](./xmlvalidatingreader/) | Представляет считыватель, обеспечивающий проверку по определению типа документа (DTD), схеме XML-Data Reduced (XDR) и языку определения схем XML [Schema](../system.xml.schema/) (XSD). |
| [XmlWhitespace](./xmlwhitespace/) | Представляет пробельные символы в содержимом элемента. |
| [XmlWriter](./xmlwriter/) | Представляет писатель, который обеспечивает быстрый, некешированный, только‑вперёд способ создания потоков или файлов, содержащих XML‑данные. |
| [XmlWriterSettings](./xmlwritersettings/) | Указывает набор функций, поддерживаемых объектом [XmlWriter](./xmlwriter/), созданным методом [XmlWriter::Create](./xmlwriter/create/). |
## Enums

| Перечисление | Описание |
| --- | --- |
| [ConformanceLevel](./conformancelevel/) | Указывает степень проверки ввода или вывода, которую выполняют объекты [XmlReader](./xmlreader/) и [XmlWriter](./xmlwriter/). |
| [DtdProcessing](./dtdprocessing/) | Указывает параметры обработки DTD. Перечисление [DtdProcessing](./dtdprocessing/) используется классом [XmlReaderSettings](./xmlreadersettings/). |
| [EntityHandling](./entityhandling/) | Указывает, как [XmlTextReader](./xmltextreader/) или [XmlValidatingReader](./xmlvalidatingreader/) обрабатывают сущности. |
| [ExceptionType](./exceptiontype/) |  |
| [Formatting](./formatting/) | Указывает параметры форматирования для [XmlTextWriter](./xmltextwriter/). |
| [NamespaceHandling](./namespacehandling/) | Указывает, следует ли удалять дублирующие объявления пространств имён в [XmlWriter](./xmlwriter/). |
| [NewLineHandling](./newlinehandling/) | Указывает, как обрабатывать разрывы строк. |
| [ReadState](./readstate/) | Указывает состояние считывателя. |
| [TriState](./tristate/) |  |
| [ValidationType](./validationtype/) | Указывает тип выполняемой проверки. |
| [WhitespaceHandling](./whitespacehandling/) | Указывает, как обрабатываются пробельные символы. |
| [WriteState](./writestate/) | Указывает состояние [XmlWriter](./xmlwriter/). |
| [XmlDateTimeSerializationMode](./xmldatetimeserializationmode/) | Указывает, как обрабатывать значение времени при преобразовании между строкой и [DateTime](../system/datetime/). |
| [XmlNamespaceScope](./xmlnamespacescope/) | Определяет область действия пространства имён. |
| [XmlNodeChangedAction](./xmlnodechangedaction/) | Указывает тип изменения узла. |
| [XmlNodeOrder](./xmlnodeorder/) | Описывает порядок узлов в документе относительно второго узла. |
| [XmlNodeType](./xmlnodetype/) | Указывает тип узла. |
| [XmlOutputMethod](./xmloutputmethod/) | Указывает метод, используемый для сериализации вывода [XmlWriter](./xmlwriter/). |
| [XmlSpace](./xmlspace/) | Указывает текущую область **xml:space**. |
| [XmlStandalone](./xmlstandalone/) |  |
| [XmlTokenizedType](./xmltokenizedtype/) | Представляет XML‑тип для строки. Это позволяет читать строку как определённый XML‑тип, например тип секции CDATA. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [XmlException](./xmlexception/) |  |
| [XmlNodeChangedEventHandler](./xmlnodechangedeventhandler/) | Представляет метод, который обрабатывает события **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** и **XmlDocument::NodeRemoving**. |
## Functions

| Функция | Описание |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
