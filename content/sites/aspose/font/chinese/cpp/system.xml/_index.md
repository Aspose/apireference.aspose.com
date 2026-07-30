---
title: "System::Xml 命名空间"
linktitle: "System::Xml"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Xml 命名空间。"
type: docs
weight: 7800
url: /zh/cpp/system.xml/
---



## 类

| 类 | 描述 |
| --- | --- |
| [IApplicationResourceStreamResolver](./iapplicationresourcestreamresolver/) | 表示应用程序资源流解析器。 |
| [IHasXmlNode](./ihasxmlnode/) | 使类能够从当前上下文或位置返回一个 [XmlNode](./xmlnode/)。 |
| [IXmlLineInfo](./ixmllineinfo/) | 提供一个接口，使类能够返回行号和位置信息。 |
| [IXmlNamespaceResolver](./ixmlnamespaceresolver/) | 提供对一组前缀和命名空间映射的只读访问。 |
| [NameTable](./nametable/) | 实现单线程的 [XmlNameTable](./xmlnametable/)。 |
| [XmlAttribute](./xmlattribute/) | 表示属性。属性的有效值和默认值在文档类型定义 (DTD) 或模式中定义。 |
| [XmlAttributeCollection](./xmlattributecollection/) | 表示属性集合，可通过名称或索引访问。 |
| [XmlCDataSection](./xmlcdatasection/) | 表示 CDATA 区段。 |
| [XmlCharacterData](./xmlcharacterdata/) | 提供多个类使用的文本操作方法。 |
| [XmlCharType](./xmlchartype/) | 供内部使用。请勿直接使用此类。 |
| [XmlComment](./xmlcomment/) | 表示 XML 注释的内容。 |
| [XmlConvert](./xmlconvert/) | 对 XML 名称进行编码和解码，并提供在运行时类型与 XML [Schema](../system.xml.schema/) 定义语言 (XSD) 类型之间转换的方法。转换数据类型时，返回的值与区域设置无关。 |
| [XmlDeclaration](./xmldeclaration/) | 表示 XML 声明节点 **<?xml version='1.0'...?>**。 |
| [XmlDocument](./xmldocument/) | 表示 XML 文档。您可以使用此类加载、验证、编辑、添加和定位文档中的 XML。 |
| [XmlDocumentFragment](./xmldocumentfragment/) | 表示一种轻量级对象，可用于树的插入操作。 |
| [XmlDocumentType](./xmldocumenttype/) | 表示文档类型声明。 |
| [XmlElement](./xmlelement/) | 表示一个元素。 |
| [XmlEntity](./xmlentity/) | 表示实体声明，例如 **<!ENTITY... >**。 |
| [XmlEntityReference](./xmlentityreference/) | 表示实体引用节点。 |
| [XmlImplementation](./xmlimplementation/) | 为一组 [XmlDocument](./xmldocument/) 对象定义上下文。 |
| [XmlLinkedNode](./xmllinkednode/) | 返回紧邻此节点之前或之后的节点。 |
| [XmlNamedNodeMap](./xmlnamednodemap/) | 表示一个可通过名称或索引访问的节点集合。 |
| [XmlNamespaceManager](./xmlnamespacemanager/) | 解析、添加和移除集合中的命名空间，并提供这些命名空间的作用域管理。 |
| [XmlNameTable](./xmlnametable/) | 原子化字符串对象表。 |
| [XmlNode](./xmlnode/) | 表示 XML 文档中的单个节点。 |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/) | 为 **XmlDocument::NodeChanged**、**XmlDocument::NodeChanging**、**XmlDocument::NodeInserted**、**XmlDocument::NodeInserting**、**XmlDocument::NodeRemoved** 和 **XmlDocument::NodeRemoving** 事件提供数据。 |
| [XmlNodeList](./xmlnodelist/) | 表示有序的节点集合。 |
| [XmlNodeReader](./xmlnodereader/) | 表示一个读取器，提供对 [XmlNode](./xmlnode/) 中 XML 数据的快速、非缓存、仅向前访问。 |
| [XmlNotation](./xmlnotation/) | 表示符号声明，例如 **<!NOTATION... >**。 |
| [XmlParserContext](./xmlparsercontext/) | 提供 [XmlReader](./xmlreader/) 解析 XML 片段所需的全部上下文信息。 |
| [XmlProcessingInstruction](./xmlprocessinginstruction/) | 表示处理指令，XML 定义它用于在文档文本中保留特定处理器的信息。 |
| [XmlQualifiedName](./xmlqualifiedname/) | 表示 XML 合格名称。 |
| [XmlReader](./xmlreader/) | 表示一个读取器，提供对 XML 数据的快速、非缓存、仅向前访问。 |
| [XmlReaderSettings](./xmlreadersettings/) | 指定在由 [XmlReader::Create](./xmlreader/create/) 方法创建的 [XmlReader](./xmlreader/) 对象上支持的一组功能。 |
| [XmlResolver](./xmlresolver/) | 解析由统一资源标识符 (URI) 命名的外部 XML 资源。 |
| [XmlSecureResolver](./xmlsecureresolver/) | 通过包装 [XmlResolver](./xmlresolver/) 对象并限制底层 [XmlResolver](./xmlresolver/) 可访问的资源，帮助保护另一种 [XmlResolver](./xmlresolver/) 实现。 |
| [XmlSignificantWhitespace](./xmlsignificantwhitespace/) | 表示混合内容节点中标记之间的空白或 **xml:space='preserve'** 范围内的空白，也称为显著空白。 |
| [XmlText](./xmltext/) | 表示元素或属性的文本内容。 |
| [XmlTextReader](./xmltextreader/) | 表示一个读取器，提供对 XML 数据的快速、非缓存、仅向前访问。 |
| [XmlTextWriter](./xmltextwriter/) | 表示一个写入器，以快速、非缓存、仅向前的方式生成符合 W3C 可扩展标记语言 (XML) 1.0 和 XML 命名空间推荐的包含 XML 数据的流或文件。 |
| [XmlUrlResolver](./xmlurlresolver/) | 解析由统一资源标识符 (URI) 命名的外部 XML 资源。 |
| [XmlValidatingReader](./xmlvalidatingreader/) | 表示一个读取器，提供文档类型定义 (DTD)、XML-Data Reduced (XDR) 架构以及 XML [Schema](../system.xml.schema/) 定义语言 (XSD) 验证。 |
| [XmlWhitespace](./xmlwhitespace/) | 表示元素内容中的空白字符。 |
| [XmlWriter](./xmlwriter/) | 表示一种写入器，提供快速、非缓存、前向仅写的方式来生成包含 XML 数据的流或文件。 |
| [XmlWriterSettings](./xmlwritersettings/) | 指定在由 [XmlWriter::Create](./xmlwriter/create/) 方法创建的 [XmlWriter](./xmlwriter/) 对象上支持的一组功能。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [ConformanceLevel](./conformancelevel/) | 指定 [XmlReader](./xmlreader/) 和 [XmlWriter](./xmlwriter/) 对象执行的输入或输出检查的程度。 |
| [DtdProcessing](./dtdprocessing/) | 指定处理 DTD 的选项。 [DtdProcessing](./dtdprocessing/) 枚举由 [XmlReaderSettings](./xmlreadersettings/) 类使用。 |
| [EntityHandling](./entityhandling/) | 指定 [XmlTextReader](./xmltextreader/) 或 [XmlValidatingReader](./xmlvalidatingreader/) 处理实体的方式。 |
| [ExceptionType](./exceptiontype/) |  |
| [Formatting](./formatting/) | 指定 [XmlTextWriter](./xmltextwriter/) 的格式化选项。 |
| [NamespaceHandling](./namespacehandling/) | 指定是否在 [XmlWriter](./xmlwriter/) 中移除重复的命名空间声明。 |
| [NewLineHandling](./newlinehandling/) | 指定如何处理换行符。 |
| [ReadState](./readstate/) | 指定读取器的状态。 |
| [TriState](./tristate/) |  |
| [ValidationType](./validationtype/) | 指定要执行的验证类型。 |
| [WhitespaceHandling](./whitespacehandling/) | 指定空白字符的处理方式。 |
| [WriteState](./writestate/) | 指定 [XmlWriter](./xmlwriter/) 的状态。 |
| [XmlDateTimeSerializationMode](./xmldatetimeserializationmode/) | 指定在字符串与 [DateTime](../system/datetime/) 之间转换时如何处理时间值。 |
| [XmlNamespaceScope](./xmlnamespacescope/) | 定义命名空间范围。 |
| [XmlNodeChangedAction](./xmlnodechangedaction/) | 指定节点更改的类型。 |
| [XmlNodeOrder](./xmlnodeorder/) | 描述节点相对于第二个节点的文档顺序。 |
| [XmlNodeType](./xmlnodetype/) | 指定节点的类型。 |
| [XmlOutputMethod](./xmloutputmethod/) | 指定用于序列化 [XmlWriter](./xmlwriter/) 输出的方法。 |
| [XmlSpace](./xmlspace/) | 指定当前 **xml:space** 范围。 |
| [XmlStandalone](./xmlstandalone/) |  |
| [XmlTokenizedType](./xmltokenizedtype/) | 表示字符串的 XML 类型。这允许将字符串读取为特定的 XML 类型，例如 CDATA 节类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [XmlException](./xmlexception/) |  |
| [XmlNodeChangedEventHandler](./xmlnodechangedeventhandler/) | 表示处理 **XmlDocument::NodeChanged**、**XmlDocument::NodeChanging**、**XmlDocument::NodeInserted**、**XmlDocument::NodeInserting**、**XmlDocument::NodeRemoved** 和 **XmlDocument::NodeRemoving** 事件的方法。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
