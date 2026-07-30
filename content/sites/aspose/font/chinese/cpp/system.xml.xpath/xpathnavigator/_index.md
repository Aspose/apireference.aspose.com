---
title: "System::Xml::XPath::XPathNavigator 类"
linktitle: "XPathNavigator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator 类。提供一种光标模型，用于在 C++ 中导航和编辑 XML 数据。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


提供用于导航和编辑 XML 数据的光标模型。

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | 返回一个用于在当前节点的子节点列表末尾创建一个或多个新子节点的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
| virtual [AppendChild](./appendchild/)(String) | 使用指定的 XML 数据字符串，在当前节点的子节点列表末尾创建一个新的子节点。 |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | 使用指定的 [XmlReader](../../system.xml/xmlreader/) 对象的 XML 内容，在当前节点的子节点列表末尾创建一个新的子节点。 |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | 使用指定的 [XPathNavigator](./) 中的节点，在当前节点的子节点列表末尾创建一个新的子节点。 |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | 使用指定的命名空间前缀、局部名称和命名空间 URI（以及指定的值），在当前节点的子节点列表末尾创建一个新的子元素节点。 |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | 验证 [XPathNavigator](./) 中的 XML 数据是否符合提供的 XML [Schema](../../system.xml.schema/) 定义语言（XSD）模式。 |
| virtual [Clone](./clone/)() | 在派生类中重写时，创建一个新的 [XPathNavigator](./)，其位置与此 [XPathNavigator](./) 相同的节点。 |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | 比较当前 [XPathNavigator](./) 与指定的 [XPathNavigator](./) 的位置。 |
| virtual [Compile](./compile/)(String) | 编译表示 [XPath](../) 表达式的字符串，并返回一个 [XPathExpression](../xpathexpression/) 对象。 |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | 使用指定的命名空间前缀、本地名称和命名空间 URI，以及指定的值，在当前元素节点上创建属性节点。 |
| virtual [CreateAttributes](./createattributes/)() | 返回用于在当前元素上创建新属性的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
| [CreateNavigator](./createnavigator/)() override | 返回 [XPathNavigator](./) 的副本。 |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | 删除从当前节点到指定节点的一系列兄弟节点。 |
| virtual [DeleteSelf](./deleteself/)() | 删除当前节点及其子节点。 |
| virtual [Evaluate](./evaluate/)(String) | 评估指定的 [XPath](../) 表达式并返回类型化结果。 |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 评估指定的 [XPath](../) 表达式并返回类型化结果，使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象来解析 [XPath](../) 表达式中的命名空间前缀。 |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | 评估 [XPathExpression](../xpathexpression/) 并返回类型化结果。 |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | 使用提供的上下文评估 [XPathExpression](../xpathexpression/)，并返回类型化结果。 |
| virtual [get_BaseURI](./get_baseuri/)() | 在派生类中重写时，获取当前节点的基础 URI。 |
| virtual [get_CanEdit](./get_canedit/)() | 返回一个值，指示 [XPathNavigator](./) 是否可以编辑底层 XML 数据。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 返回一个值，指示当前节点是否具有任何属性。 |
| virtual [get_HasChildren](./get_haschildren/)() | 返回一个值，指示当前节点是否具有任何子节点。 |
| virtual [get_InnerXml](./get_innerxml/)() | 返回表示当前节点子节点的标记。 |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 在派生类中重写时，获取一个值，指示当前节点是否为没有结束标签的空元素。 |
| [get_IsNode](./get_isnode/)() override | 返回一个值，指示当前节点是否表示一个 [XPath](../) 节点。 |
| virtual [get_LocalName](./get_localname/)() | 在派生类中重写时，获取当前节点的 [XPathNavigator::get_Name](./get_name/)，且不带任何命名空间前缀。 |
| virtual [get_Name](./get_name/)() | 当在派生类中被重写时，获取当前节点的限定名称。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 在派生类中重写时，获取当前节点的命名空间 URI。 |
| virtual [get_NameTable](./get_nametable/)() | 在派生类中重写时，获取 [XPathNavigator](./) 的 [XmlNameTable](../../system.xml/xmlnametable/)。 |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | 返回用于比较 [XPathNavigator](./) 对象相等性的 [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/)。 |
| virtual [get_NodeType](./get_nodetype/)() | 在派生类中重写时，获取当前节点的 [XPathNodeType](../xpathnodetype/)。 |
| virtual [get_OuterXml](./get_outerxml/)() | 返回表示当前节点及其子节点的起始和结束标签的标记。 |
| virtual [get_Prefix](./get_prefix/)() | 当在派生类中被重写时，获取与当前节点关联的命名空间前缀。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 返回因模式验证而分配给当前节点的模式信息。 |
| [get_TypedValue](./get_typedvalue/)() override | 将当前节点作为最合适类型的装箱对象返回。 |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | 供提供对存储的“虚拟化” XML 视图的 [XPathNavigator](./) 实现使用，以访问底层对象。 |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 返回当前节点的值，类型为 [Boolean](../../system/boolean/)。 |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 返回当前节点的值，类型为 [DateTime](../../system/datetime/)。 |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 返回当前节点的值，类型为 [Double](../../system/double/)。 |
| [get_ValueAsInt](./get_valueasint/)() override | 返回当前节点的值，类型为 [Int32](../../system/int32/)。 |
| [get_ValueAsLong](./get_valueaslong/)() override | 返回当前节点的值，类型为 [Int64](../../system/int64/)。 |
| [get_ValueType](./get_valuetype/)() override | 返回当前节点的类型。 |
| virtual [get_XmlLang](./get_xmllang/)() | 返回当前节点的 **xml:lang** 范围。 |
| [get_XmlType](./get_xmltype/)() override | 返回当前节点的 XmlSchemaType 信息。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 返回具有指定本地名称和命名空间 URI 的属性的值。 |
| virtual [GetNamespace](./getnamespace/)(String) | 返回与指定本地名称对应的命名空间节点的值。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 返回当前节点的作用域内命名空间。 |
| virtual [InsertAfter](./insertafter/)() | 返回一个用于在当前选定节点之后创建新兄弟节点的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
| virtual [InsertAfter](./insertafter/)(String) | 使用指定的 XML 字符串在当前选定节点之后创建一个新兄弟节点。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | 使用指定的 [XmlReader](../../system.xml/xmlreader/) 对象的 XML 内容在当前选定节点之后创建一个新兄弟节点。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | 使用指定的 [XPathNavigator](./) 对象中的节点在当前选定节点之后创建一个新兄弟节点。 |
| virtual [InsertBefore](./insertbefore/)() | 返回一个用于在当前选定节点之前创建新兄弟节点的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
| virtual [InsertBefore](./insertbefore/)(String) | 使用指定的 XML 字符串在当前选定节点之前创建一个新兄弟节点。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | 使用指定的 [XmlReader](../../system.xml/xmlreader/) 对象的 XML 内容在当前选定节点之前创建一个新兄弟节点。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | 使用指定的 [XPathNavigator](./) 对象中的节点在当前节点之前创建一个新兄弟节点。 |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | 使用指定的命名空间前缀、本地名称和命名空间 URI，并使用指定的值，在当前节点之后创建一个新兄弟元素。 |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | 使用指定的命名空间前缀、本地名称和命名空间 URI，并使用指定的值，在当前节点之前创建一个新兄弟元素。 |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | 确定指定的 [XPathNavigator](./) 是否为当前 [XPathNavigator](./) 的后代。 |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | 在派生类中重写时，确定当前的 [XPathNavigator](./) 是否位于与指定的 [XPathNavigator](./) 相同的位置。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 返回指定前缀的命名空间 URI。 |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 返回为指定的命名空间 URI 声明的前缀。 |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | 确定当前节点是否匹配指定的 [XPathExpression](../xpathexpression/)。 |
| virtual [Matches](./matches/)(String) | 确定当前节点是否匹配指定的 [XPath](../) 表达式。 |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | 在派生类中重写时，将 [XPathNavigator](./) 移动到与指定的 [XPathNavigator](./) 相同的位置。 |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | 将 [XPathNavigator](./) 移动到具有匹配本地名称和命名空间 URI 的属性。 |
| virtual [MoveToChild](./movetochild/)(String, String) | 将 [XPathNavigator](./) 移动到具有指定本地名称和命名空间 URI 的子节点。 |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | 将 [XPathNavigator](./) 移动到指定的 [XPathNodeType](../xpathnodetype/) 的子节点。 |
| virtual [MoveToFirst](./movetofirst/)() | 将 [XPathNavigator](./) 移动到当前节点的第一个兄弟节点。 |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到当前节点的第一个属性。 |
| virtual [MoveToFirstChild](./movetofirstchild/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到当前节点的第一个子节点。 |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | 在派生类中重写时，将 [XPathNavigator](./) 移动到匹配指定的 [XPathNamespaceScope](../xpathnamespacescope/) 的第一个命名空间节点。 |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | 将 [XPathNavigator](./) 移动到当前节点的第一个命名空间节点。 |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | 将 [XPathNavigator](./) 按文档顺序移动到具有指定本地名称和命名空间 URI 的元素。 |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | 将 [XPathNavigator](./) 按文档顺序移动到具有指定本地名称和命名空间 URI、以及指定边界的元素。 |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | 将 [XPathNavigator](./) 按文档顺序移动到指定的 [XPathNodeType](../xpathnodetype/) 的后续元素。 |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | 将 [XPathNavigator](./) 按文档顺序移动到指定的 [XPathNodeType](../xpathnodetype/) 的后续元素，并在指定的边界内。 |
| virtual [MoveToId](./movetoid/)(String) | 在派生类中重写时，移动到具有 **ID** 类型属性且其值匹配指定的 [String](../../system/string/) 的节点。 |
| virtual [MoveToNamespace](./movetonamespace/)(String) | 将 [XPathNavigator](./) 移动到具有指定命名空间前缀的命名空间节点。 |
| virtual [MoveToNext](./movetonext/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到当前节点的下一个兄弟节点。 |
| virtual [MoveToNext](./movetonext/)(String, String) | 将 [XPathNavigator](./) 移动到具有指定本地名称和命名空间 URI 的下一个兄弟节点。 |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | 将 [XPathNavigator](./) 移动到当前节点的下一个兄弟节点，该节点匹配指定的 [XPathNodeType](../xpathnodetype/)。 |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到下一个属性。 |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | 在派生类中重写时，将 [XPathNavigator](./) 移动到匹配指定的 [XPathNamespaceScope](../xpathnamespacescope/) 的下一个命名空间节点。 |
| [MoveToNextNamespace](./movetonextnamespace/)() | 将 [XPathNavigator](./) 移动到下一个命名空间节点。 |
| virtual [MoveToParent](./movetoparent/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到当前节点的父节点。 |
| virtual [MoveToPrevious](./movetoprevious/)() | 在派生类中重写时，将 [XPathNavigator](./) 移动到当前节点的前一个兄弟节点。 |
| virtual [MoveToRoot](./movetoroot/)() | 将 [XPathNavigator](./) 移动到当前节点所属的根节点。 |
| virtual [PrependChild](./prependchild/)() | 返回一个用于在当前节点的子节点列表开头创建新子节点的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
| virtual [PrependChild](./prependchild/)(String) | 使用指定的 XML 字符串在当前节点的子节点列表开头创建一个新子节点。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | 使用指定的 [XmlReader](../../system.xml/xmlreader/) 对象的 XML 内容，在当前节点的子节点列表开头创建一个新的子节点。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | 使用指定的 [XPathNavigator](./) 对象中的节点，在当前节点的子节点列表开头创建一个新的子节点。 |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | 使用指定的命名空间前缀、本地名称和命名空间 URI，以及指定的值，在当前节点的子节点列表开头创建一个新的子元素。 |
| virtual [ReadSubtree](./readsubtree/)() | 返回一个包含当前节点及其子节点的 [XmlReader](../../system.xml/xmlreader/) 对象。 |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | 将从当前节点到指定节点的一系列兄弟节点替换掉。 |
| virtual [ReplaceSelf](./replaceself/)(String) | 使用指定字符串的内容替换当前节点。 |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | 使用指定的 [XmlReader](../../system.xml/xmlreader/) 对象的内容替换当前节点。 |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | 使用指定的 [XPathNavigator](./) 对象的内容替换当前节点。 |
| virtual [Select](./select/)(String) | 使用指定的 [XPath](../) 表达式选择节点集。 |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 使用指定的 [XPath](../) 表达式，并使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀，选择节点集。 |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | 使用指定的 [XPathExpression](../xpathexpression/) 选择节点集。 |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | 选择当前节点的所有具有匹配的 [XPathNodeType](../xpathnodetype/) 的祖先节点。 |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | 选择当前节点的所有具有指定本地名称和命名空间 URI 的祖先节点。 |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | 选择当前节点的所有具有匹配的 [XPathNodeType](../xpathnodetype/) 的子节点。 |
| virtual [SelectChildren](./selectchildren/)(String, String) | 选择当前节点的所有具有指定本地名称和命名空间 URI 的子节点。 |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | 选择当前节点的所有具有匹配的 [XPathNodeType](../xpathnodetype/) 的后代节点。 |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | 选择当前节点的所有具有指定本地名称和命名空间 URI 的后代节点。 |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | 使用指定的 [XPath](../) 查询，在 [XPathNavigator](./) 中选择单个节点。 |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 使用指定的 [XPath](../) 查询，并使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀，在 [XPathNavigator](./) 对象中选择单个节点。 |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | 使用指定的 [XPathExpression](../xpathexpression/) 对象，在 [XPathNavigator](./) 中选择单个节点。 |
| virtual [set_InnerXml](./set_innerxml/)(String) | 设置表示当前节点子节点的标记。 |
| virtual [set_OuterXml](./set_outerxml/)(String) | 设置表示当前节点及其子节点的起始和结束标签的标记。 |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | 设置当前节点的类型化值。 |
| virtual [SetValue](./setvalue/)(String) | 设置当前节点的值。 |
| [ToString](./tostring/)() const override | 返回当前节点的文本值。 |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 返回当前节点的值，按指定的类型返回，并使用指定的 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀。 |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | 将当前节点及其子节点流式写入指定的 [XmlWriter](../../system.xml/xmlwriter/) 对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
