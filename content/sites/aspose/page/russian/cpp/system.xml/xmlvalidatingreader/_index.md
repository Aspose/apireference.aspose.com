---
title: "Класс System::Xml::XmlValidatingReader"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page для C++"
description: "Класс System::Xml::XmlValidatingReader. Представляет читатель, который обеспечивает проверку определения типа документа (DTD), схемы XML-Data Reduced (XDR) и языка определения схем XML (XSD) в C++."
type: docs
weight: 4200
url: /ru/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Представляет читатель, который обеспечивает проверку определения типа документа (DTD), схемы XML-Data Reduced (XDR) и языка определения [Schema](../../system.xml.schema/) XML (XSD).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Методы

| Метод | Описание |
| --- | --- |
| [Close](./close/)() override | Изменяет [XmlReader::get_ReadState](../xmlreader/get_readstate/) на Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Возвращает количество атрибутов в текущем узле. |
| [get_BaseURI](./get_baseuri/)() override | Возвращает базовый URI текущего узла. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Возвращает значение, указывающее, реализует ли [XmlValidatingReader](./) методы чтения двоичного содержимого. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Возвращает значение, указывающее, может ли этот читатель разбирать и разрешать сущности. |
| [get_Depth](./get_depth/)() override | Возвращает глубину текущего узла в XML‑документе. |
| [get_Encoding](./get_encoding/)() | Возвращает атрибут кодировки для документа. |
| [get_EntityHandling](./get_entityhandling/)() | Возвращает значение, определяющее, как читатель обрабатывает сущности. |
| [get_EOF](./get_eof/)() override | Возвращает значение, указывающее, находится ли считыватель в конце потока. |
| [get_HasValue](./get_hasvalue/)() override | Возвращает значение, указывающее, может ли текущий узел иметь [XmlValidatingReader::get_Value](./get_value/) отличное от [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Возвращает значение, указывающее, является ли текущий узел атрибутом, сгенерированным из значения по умолчанию, определённого в DTD или схеме. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Возвращает значение, указывающее, является ли текущий узел пустым элементом (например, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Возвращает текущий номер строки. |
| [get_LinePosition](./get_lineposition/)() override | Возвращает текущую позицию в строке. |
| [get_LocalName](./get_localname/)() override | Возвращает локальное имя текущего узла. |
| [get_Name](./get_name/)() override | Возвращает квалифицированное имя текущего узла. |
| [get_Namespaces](./get_namespaces/)() | Возвращает значение, указывающее, следует ли поддерживать пространства имён. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Возвращает URI пространства имён (Uniform Resource Identifier) (как определено в спецификации пространств имён World Wide [Web](../../system.web/) Consortium (W3C)) узла, на котором находится читатель. |
| [get_NameTable](./get_nametable/)() override | Возвращает [XmlNameTable](../xmlnametable/), связанный с этой реализацией. |
| [get_NodeType](./get_nodetype/)() override | Возвращает тип текущего узла. |
| [get_Prefix](./get_prefix/)() override | Возвращает префикс пространства имён, связанный с текущим узлом. |
| [get_QuoteChar](./get_quotechar/)() override | Возвращает символ кавычки, используемый для заключения значения узла атрибута. |
| [get_Reader](./get_reader/)() | Возвращает [XmlReader](../xmlreader/), использованный для создания этого [XmlValidatingReader](./). |
| [get_ReadState](./get_readstate/)() override | Возвращает состояние считывателя. |
| [get_Schemas](./get_schemas/)() | Возвращает XmlSchemaCollection для использования при проверке. |
| [get_SchemaType](./get_schematype/)() | Возвращает объект типа схемы. |
| [get_ValidationType](./get_validationtype/)() | Возвращает значение, указывающее тип проверки, которую следует выполнить. |
| [get_Value](./get_value/)() override | Возвращает текстовое значение текущего узла. |
| [get_XmlLang](./get_xmllang/)() override | Возвращает текущую область **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Возвращает текущую область действия **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Возвращает значение атрибута с указанным именем. |
| [GetAttribute](./getattribute/)(String, String) override | Возвращает значение атрибута с указанным локальным именем и URI пространства имён (Uniform Resource Identifier). |
| [GetAttribute](./getattribute/)(int32_t) override | Возвращает значение атрибута с указанным индексом. |
| [HasLineInfo](./haslineinfo/)() override | Возвращает значение, указывающее, может ли класс возвращать информацию о строках. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Разрешает префикс пространства имён в области действия текущего элемента. |
| [MoveToAttribute](./movetoattribute/)(String) override | Переходит к атрибуту с указанным именем. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Переходит к атрибуту с указанным локальным именем и URI пространства имён (Uniform Resource Identifier). |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Переходит к атрибуту с указанным индексом. |
| [MoveToElement](./movetoelement/)() override | Переходит к элементу, содержащему текущий узел атрибута. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Переходит к первому атрибуту. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Переходит к следующему атрибуту. |
| [Read](./read/)() override | Считывает следующий узел из потока. |
| [ReadAttributeValue](./readattributevalue/)() override | Разбирает значение атрибута в один или несколько **[Text](../../system.text/)**, **EntityReference**, или **EndEntity** узлов. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Читает содержимое и возвращает двоичные байты, декодированные из Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Читает содержимое и возвращает двоичные байты, декодированные из BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Читает элемент и декодирует содержимое Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Читает элемент и декодирует содержимое BinHex. |
| [ReadString](./readstring/)() override | Читает содержимое элемента или текстового узла как строку. |
| [ReadTypedValue](./readtypedvalue/)() | Возвращает тип времени выполнения для указанного XML [Schema](../../system.xml.schema/) языка определения (XSD). |
| [ResolveEntity](./resolveentity/)() override | Разрешает ссылку на сущность для узлов **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Устанавливает значение, которое определяет, как читатель обрабатывает сущности. |
| [set_Namespaces](./set_namespaces/)(bool) | Устанавливает значение, указывающее, следует ли выполнять поддержку пространств имён. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Устанавливает значение, указывающее тип выполняемой проверки. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Устанавливает [XmlResolver](../xmlresolver/), используемый для разрешения внешних определений типа документа (DTD) и ссылок на расположение схемы. [XmlResolver](../xmlresolver/) также используется для обработки любых элементов import или include, найденных в XML [Schema](../../system.xml.schema/) языке определения (XSD) схем. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Добавляет обработчик событий для получения информации об ошибках проверки определений типа документа (DTD), схемы XML-Data Reduced (XDR) и схемы XML [Schema](../../system.xml.schema/) языка определения (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Удаляет обработчик событий для получения информации об ошибках проверки определений типа документа (DTD), схемы XML-Data Reduced (XDR) и схемы XML [Schema](../../system.xml.schema/) языка определения (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Инициализирует новый экземпляр класса [XmlValidatingReader](./), который проверяет содержимое, возвращаемое указанным [XmlReader](../xmlreader/). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Инициализирует новый экземпляр класса [XmlValidatingReader](./) с указанными значениями. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Инициализирует новый экземпляр класса [XmlValidatingReader](./) с указанными значениями. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания


## Deprecated
Этот класс устарел. Рекомендуется использовать класс XmlReaderSettings и метод XmlReader::Create для создания проверяющего XML‑чтения.

Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
