---
title: "System::Xml::XmlReader класс"
linktitle: "XmlReader"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlReader класс. Представляет читатель, который обеспечивает быстрый, некешированный, последовательный доступ к XML‑данным в C++."
type: docs
weight: 3300
url: /ru/cpp/system.xml/xmlreader/
---
## XmlReader class


Представляет считыватель, обеспечивающий быстрый, некешированный последовательный доступ только вперёд к XML‑данным.

```cpp
class XmlReader : public System::IDisposable
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Close](./close/)() | При переопределении в производном классе изменяет [XmlReader::get_ReadState](./get_readstate/) на [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Создаёт новый экземпляр [XmlReader](./) с указанным URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанные URI и параметры. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанные URI, параметры и контекстную информацию для разбора. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный поток с настройками по умолчанию. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Создаёт новый экземпляр [XmlReader](./) с указанным потоком и параметрами. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный поток, базовый URI и параметры. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный поток, параметры и контекстную информацию для разбора. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный текстовый читатель. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный текстовый читатель и параметры. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный текстовый читатель, параметры и базовый URI. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Создаёт новый экземпляр [XmlReader](./), используя указанный текстовый читатель, параметры и контекстную информацию для разбора. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Создаёт новый экземпляр [XmlReader](./), используя указанный XML‑читатель и параметры. |
| [Dispose](./dispose/)() override | Освобождает все ресурсы, используемые текущим экземпляром класса [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | При переопределении в производном классе получает количество атрибутов текущего узла. |
| virtual [get_BaseURI](./get_baseuri/)() | При переопределении в производном классе получает базовый URI текущего узла. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Возвращает значение, указывающее, реализует ли [XmlReader](./) методы чтения двоичного содержимого. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Возвращает значение, указывающее, реализует ли [XmlReader](./) метод [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Возвращает значение, указывающее, может ли этот читатель разбирать и разрешать сущности. |
| virtual [get_Depth](./get_depth/)() | При переопределении в производном классе получает глубину текущего узла в XML‑документе. |
| virtual [get_EOF](./get_eof/)() | При переопределении в производном классе получает значение, указывающее, находится ли считыватель в конце потока. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Возвращает значение, указывающее, имеет ли текущий узел какие-либо атрибуты. |
| virtual [get_HasValue](./get_hasvalue/)() | При переопределении в производном классе получает значение, указывающее, может ли текущий узел иметь значение [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | При переопределении в производном классе получает значение, указывающее, является ли текущий узел атрибутом, сгенерированным из значения по умолчанию, определённого в DTD или схеме. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | При переопределении в производном классе получает значение, указывающее, является ли текущий узел пустым элементом (например, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | При переопределении в производном классе получает локальное имя текущего узла. |
| virtual [get_Name](./get_name/)() | При переопределении в производном классе получает квалифицированное имя текущего узла. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | При переопределении в производном классе получает URI пространства имён (как определено в спецификации W3C Namespace) узла, на котором находится считыватель. |
| virtual [get_NameTable](./get_nametable/)() | При переопределении в производном классе получает [XmlNameTable](../xmlnametable/), связанную с этой реализацией. |
| virtual [get_NodeType](./get_nodetype/)() | При переопределении в производном классе получает тип текущего узла. |
| virtual [get_Prefix](./get_prefix/)() | При переопределении в производном классе получает префикс пространства имён, связанный с текущим узлом. |
| virtual [get_QuoteChar](./get_quotechar/)() | При переопределении в производном классе получает символ кавычки, используемый для заключения значения узла‑атрибута. |
| virtual [get_ReadState](./get_readstate/)() | При переопределении в производном классе получает состояние считывателя. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Возвращает информацию схемы, назначенную текущему узлу в результате проверки схемы. |
| virtual [get_Settings](./get_settings/)() | Возвращает объект [XmlReaderSettings](../xmlreadersettings/), используемый для создания этого экземпляра [XmlReader](./). |
| virtual [get_Value](./get_value/)() | При переопределении в производном классе получает текстовое значение текущего узла. |
| virtual [get_ValueType](./get_valuetype/)() | Возвращает тип текущего узла. |
| virtual [get_XmlLang](./get_xmllang/)() | При переопределении в производном классе получает текущую область действия **xml:lang**. |
| virtual [get_XmlSpace](./get_xmlspace/)() | При переопределении в производном классе получает текущую область действия **xml:space**. |
| virtual [GetAttribute](./getattribute/)(String) | При переопределении в производном классе получает значение атрибута с указанным значением [XmlReader::get_Name](./get_name/). |
| virtual [GetAttribute](./getattribute/)(String, String) | При переопределении в производном классе получает значение атрибута с указанными значениями [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [GetAttribute](./getattribute/)(int32_t) | При переопределении в производном классе получает значение атрибута с указанным индексом. |
| virtual [idx_get](./idx_get/)(int32_t) | При переопределении в производном классе получает значение атрибута с указанным индексом. |
| virtual [idx_get](./idx_get/)(String) | При переопределении в производном классе получает значение атрибута с указанным значением [XmlReader::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | При переопределении в производном классе получает значение атрибута с указанными значениями [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| static [IsName](./isname/)(const String\&) | Возвращает значение, указывающее, является ли строковый аргумент допустимым именем XML. |
| static [IsNameToken](./isnametoken/)(const String\&) | Возвращает значение, указывающее, является ли строковый аргумент допустимым токеном имени XML. |
| virtual [IsStartElement](./isstartelement/)() | Вызывает [XmlReader::MoveToContent](./movetocontent/) и проверяет, является ли текущий узел содержимого стартовым тегом или тегом пустого элемента. |
| virtual [IsStartElement](./isstartelement/)(String) | Вызывает [XmlReader::MoveToContent](./movetocontent/) и проверяет, является ли текущий узел содержимого стартовым тегом или тегом пустого элемента, а также совпадает ли значение [XmlReader::get_Name](./get_name/) найденного элемента с переданным аргументом. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Вызывает [XmlReader::MoveToContent](./movetocontent/) и проверяет, является ли текущий узел содержимого стартовым тегом или тегом пустого элемента, а также совпадают ли значения [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/) найденного элемента с заданными строками. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | При переопределении в производном классе разрешает префикс пространства имён в области действия текущего элемента. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | При переопределении в производном классе переходит к атрибуту с указанным значением [XmlReader::get_Name](./get_name/). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | При переопределении в производном классе переходит к атрибуту с указанными значениями [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | При переопределении в производном классе переходит к атрибуту с указанным индексом. |
| virtual [MoveToContent](./movetocontent/)() | Проверяет, является ли текущий узел узлом содержимого (текст без пробелов, **CDATA**, **Element**, **EndElement**, **EntityReference** или **EndEntity**). Если узел не является узлом содержимого, читатель пропускает его до следующего узла содержимого или до конца файла. Он пропускает узлы следующих типов: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** или **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | При переопределении в производном классе переходит к элементу, содержащему текущий узел атрибута. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | При переопределении в производном классе переходит к первому атрибуту. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | При переопределении в производном классе переходит к следующему атрибуту. |
| virtual [Read](./read/)() | При переопределении в производном классе считывает следующий узел из потока. |
| virtual [ReadAttributeValue](./readattributevalue/)() | При переопределении в производном классе разбирает значение атрибута в один или несколько узлов **[Text](../../system.text/)**, **EntityReference** или **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Считывает содержимое как объект указанного типа. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Читает содержимое и возвращает бинарные байты, декодированные из Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Считывает содержимое и возвращает декодированные из **BinHex** двоичные байты. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Считывает текстовое содержимое в текущей позиции как [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Считывает текстовое содержимое в текущей позиции как объект [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Считывает текстовое содержимое в текущей позиции как объект [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Считывает текстовое содержимое в текущей позиции как объект [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Считывает текстовое содержимое в текущей позиции как число двойной точности с плавающей запятой. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Считывает текстовое содержимое в текущей позиции как число одинарной точности с плавающей запятой. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Считывает текстовое содержимое в текущей позиции как 32-битное знаковое целое число. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Считывает текстовое содержимое в текущей позиции как 64-битное знаковое целое число. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Считывает текстовое содержимое в текущей позиции как [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Считывает текстовое содержимое в текущей позиции как объект [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Считывает содержимое элемента как запрошенный тип. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает содержимое элемента как запрошенный тип. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Считывает элемент и декодирует содержимое **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Считывает элемент и декодирует содержимое **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Считывает текущий элемент и возвращает содержимое как объект [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как объект [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Считывает текущий элемент и возвращает содержимое как объект [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как объект [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Считывает текущий элемент и возвращает содержимое как объект [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как объект [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Считывает текущий элемент и возвращает содержимое как число двойной точности с плавающей запятой. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как число двойной точности с плавающей запятой. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Считывает текущий элемент и возвращает содержимое как число одинарной точности с плавающей запятой. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как число одинарной точности с плавающей запятой. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Считывает текущий элемент и возвращает содержимое как 32‑битное знаковое целое число. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как 32‑битное знаковое целое число. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Считывает текущий элемент и возвращает содержимое как 64‑битное знаковое целое число. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как 64‑битное знаковое целое число. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Считывает текущий элемент и возвращает содержимое как объект [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как объект [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Считывает текущий элемент и возвращает содержимое как объект [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Проверяет, что указанные локальное имя и URI пространства имён соответствуют текущему элементу, затем считывает текущий элемент и возвращает содержимое как объект [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | Считывает элемент, содержащий только текст. Однако рекомендуется использовать метод [XmlReader::ReadElementContentAsString](./readelementcontentasstring/), так как он предоставляет более простой способ выполнения этой операции. |
| virtual [ReadElementString](./readelementstring/)(String) | Проверяет, что значение [XmlReader::get_Name](./get_name/) найденного элемента соответствует заданной строке перед считыванием элемента, содержащего только текст. Однако рекомендуется использовать метод [XmlReader::ReadElementContentAsString](./readelementcontentasstring/), так как он предоставляет более простой способ выполнения этой операции. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Проверяет, что значения [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/) найденного элемента соответствуют заданным строкам перед считыванием элемента, содержащего только текст. Однако рекомендуется использовать метод [XmlReader::ReadElementContentAsString](./readelementcontentasstring/), так как он предоставляет более простой способ выполнения этой операции. |
| virtual [ReadEndElement](./readendelement/)() | Проверяет, что текущий узел содержимого является закрывающим тегом, и перемещает читатель к следующему узлу. |
| virtual [ReadInnerXml](./readinnerxml/)() | При переопределении в производном классе читает всё содержимое, включая разметку, как строку. |
| virtual [ReadOuterXml](./readouterxml/)() | При переопределении в производном классе читает содержимое, включая разметку, представляющее этот узел и всех его потомков. |
| virtual [ReadStartElement](./readstartelement/)() | Проверяет, что текущий узел является элементом, и перемещает читатель к следующему узлу. |
| virtual [ReadStartElement](./readstartelement/)(String) | Проверяет, что текущий узел содержимого является элементом с заданным значением [XmlReader::get_Name](./get_name/), и перемещает читатель к следующему узлу. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Проверяет, что текущий узел содержимого является элементом с заданными значениями [XmlReader::get_LocalName](./get_localname/) и [XmlReader::get_NamespaceURI](./get_namespaceuri/), и перемещает читатель к следующему узлу. |
| virtual [ReadString](./readstring/)() | При переопределении в производном классе читает содержимое элемента или текстового узла как строку. Однако рекомендуется использовать метод [XmlReader::ReadElementContentAsString](./readelementcontentasstring/), поскольку он предоставляет более простой способ выполнения этой операции. |
| virtual [ReadSubtree](./readsubtree/)() | Возвращает новый экземпляр [XmlReader](./), который можно использовать для чтения текущего узла и всех его потомков. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Перемещает [XmlReader](./) к следующему дочернему элементу с указанным квалифицированным именем. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Перемещает [XmlReader](./) к следующему дочернему элементу с указанным локальным именем и URI пространства имён. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Читает до тех пор, пока не будет найден элемент с указанным квалифицированным именем. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Читает до тех пор, пока не будет найден элемент с указанным локальным именем и URI пространства имён. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Перемещает [XmlReader](./) к следующему соседнему элементу с указанным квалифицированным именем. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Перемещает [XmlReader](./) к следующему соседнему элементу с указанным локальным именем и URI пространства имён. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Читает большие потоки текста, встроенные в XML‑документ. |
| virtual [ResolveEntity](./resolveentity/)() | При переопределении в производном классе разрешает ссылку на сущность для узлов **EntityReference**. |
| virtual [Skip](./skip/)() | Пропускает дочерние узлы текущего узла. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## См. также

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
