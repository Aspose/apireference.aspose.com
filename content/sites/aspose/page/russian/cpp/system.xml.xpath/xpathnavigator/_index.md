---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator class. Предоставляет модель курсора для навигации и редактирования XML‑данных в C++."
type: docs
weight: 500
url: /ru/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Предоставляет курсорную модель для навигации и редактирования XML‑данных.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Возвращает объект [XmlWriter](../../system.xml/xmlwriter/), используемый для создания одного или нескольких новых дочерних узлов в конце списка дочерних узлов текущего узла. |
| virtual [AppendChild](./appendchild/)(String) | Создает новый дочерний узел в конце списка дочерних узлов текущего узла, используя указанную строку XML‑данных. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Создает новый дочерний узел в конце списка дочерних узлов текущего узла, используя содержимое XML указанного объекта [XmlReader](../../system.xml/xmlreader/). |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Создает новый дочерний узел в конце списка дочерних узлов текущего узла, используя узлы в указанном [XPathNavigator](./). |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Создает новый дочерний элементный узел в конце списка дочерних узлов текущего узла, используя указанный префикс пространства имен, локальное имя и URI пространства имен со значением. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Проверяет, что XML‑данные в [XPathNavigator](./) соответствуют предоставленной схеме XML [Schema](../../system.xml.schema/) языка определения (XSD). |
| virtual [Clone](./clone/)() | При переопределении в производном классе создает новый [XPathNavigator](./), расположенный в том же узле, что и этот [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Сравнивает позицию текущего [XPathNavigator](./) с позицией указанного [XPathNavigator](./). |
| virtual [Compile](./compile/)(String) | Компилирует строку, представляющую выражение [XPath](../), и возвращает объект [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Создает узел атрибута в текущем элементном узле, используя указанный префикс пространства имен, локальное имя и URI пространства имен со значением. |
| virtual [CreateAttributes](./createattributes/)() | Возвращает объект [XmlWriter](../../system.xml/xmlwriter/), используемый для создания новых атрибутов в текущем элементе. |
| [CreateNavigator](./createnavigator/)() override | Возвращает копию [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Удаляет диапазон соседних узлов от текущего узла до указанного узла. |
| virtual [DeleteSelf](./deleteself/)() | Удаляет текущий узел и его дочерние узлы. |
| virtual [Evaluate](./evaluate/)(String) | Выполняет указанное выражение [XPath](../) и возвращает типизированный результат. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Выполняет указанное выражение [XPath](../) и возвращает типизированный результат, используя указанный объект [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) для разрешения префиксов пространств имен в выражении [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Выполняет [XPathExpression](../xpathexpression/) и возвращает типизированный результат. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Использует предоставленный контекст для выполнения [XPathExpression](../xpathexpression/) и возвращает типизированный результат. |
| virtual [get_BaseURI](./get_baseuri/)() | При переопределении в производном классе получает базовый URI для текущего узла. |
| virtual [get_CanEdit](./get_canedit/)() | Возвращает значение, указывающее, может ли [XPathNavigator](./) изменять базовые XML‑данные. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Возвращает значение, указывающее, имеет ли текущий узел какие-либо атрибуты. |
| virtual [get_HasChildren](./get_haschildren/)() | Возвращает значение, указывающее, имеет ли текущий узел какие-либо дочерние узлы. |
| virtual [get_InnerXml](./get_innerxml/)() | Возвращает разметку, представляющую дочерние узлы текущего узла. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | При переопределении в производном классе получает значение, указывающее, является ли текущий узел пустым элементом без закрывающего тега. |
| [get_IsNode](./get_isnode/)() override | Возвращает значение, указывающее, представляет ли текущий узел узел [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | При переопределении в производном классе получает [XPathNavigator::get_Name](./get_name/) текущего узла без какого-либо префикса пространства имен. |
| virtual [get_Name](./get_name/)() | При переопределении в производном классе возвращает квалифицированное имя текущего узла. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | При переопределении в производном классе получает URI пространства имён текущего узла. |
| virtual [get_NameTable](./get_nametable/)() | При переопределении в производном классе получает [XmlNameTable](../../system.xml/xmlnametable/) объекта [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Возвращает [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/), используемый для сравнения на равенство объектов [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | При переопределении в производном классе получает [XPathNodeType](../xpathnodetype/) текущего узла. |
| virtual [get_OuterXml](./get_outerxml/)() | Возвращает разметку, представляющую открывающие и закрывающие теги текущего узла и его дочерних узлов. |
| virtual [get_Prefix](./get_prefix/)() | При переопределении в производном классе получает префикс пространства имён, связанный с текущим узлом. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Возвращает информацию схемы, назначенную текущему узлу в результате проверки схемы. |
| [get_TypedValue](./get_typedvalue/)() override | Возвращает текущий узел в виде упакованного объекта наиболее подходящего типа. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Используется реализациями [XPathNavigator](./), которые предоставляют "виртуализированный" XML‑вид над хранилищем, чтобы обеспечить доступ к базовым объектам. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Возвращает значение текущего узла как [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Возвращает значение текущего узла как [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Возвращает значение текущего узла как [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Возвращает значение текущего узла как [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Возвращает значение текущего узла как [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Возвращает тип текущего узла. |
| virtual [get_XmlLang](./get_xmllang/)() | Возвращает область действия **xml:lang** для текущего узла. |
| [get_XmlType](./get_xmltype/)() override | Возвращает информацию XmlSchemaType для текущего узла. |
| virtual [GetAttribute](./getattribute/)(String, String) | Возвращает значение атрибута с указанным локальным именем и URI пространства имён. |
| virtual [GetNamespace](./getnamespace/)(String) | Возвращает значение узла пространства имён, соответствующего указанному локальному имени. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Возвращает области видимости пространств имён текущего узла. |
| virtual [InsertAfter](./insertafter/)() | Возвращает объект [XmlWriter](../../system.xml/xmlwriter/), используемый для создания нового узла‑соседа после текущего выбранного узла. |
| virtual [InsertAfter](./insertafter/)(String) | Создаёт новый узел‑сосед после текущего выбранного узла, используя указанную строку XML. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Создаёт новый узел‑сосед после текущего выбранного узла, используя XML‑содержимое указанного объекта [XmlReader](../../system.xml/xmlreader/). |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Создаёт новый узел‑сосед после текущего выбранного узла, используя узлы из указанного объекта [XPathNavigator](./). |
| virtual [InsertBefore](./insertbefore/)() | Возвращает объект [XmlWriter](../../system.xml/xmlwriter/), используемый для создания нового узла‑соседа перед текущим выбранным узлом. |
| virtual [InsertBefore](./insertbefore/)(String) | Создаёт новый узел‑сосед перед текущим выбранным узлом, используя указанную строку XML. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Создаёт новый узел‑сосед перед текущим выбранным узлом, используя XML‑содержимое указанного объекта [XmlReader](../../system.xml/xmlreader/). |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Создаёт новый узел‑сосед перед текущим выбранным узлом, используя узлы из указанного [XPathNavigator](./). |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Создаёт новый элемент‑сосед после текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён, с указанным значением. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Создает новый соседний элемент перед текущим узлом, используя указанный префикс пространства имен, локальное имя и указанный URI пространства имен, с указанным значением. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Определяет, является ли указанный [XPathNavigator](./) потомком текущего [XPathNavigator](./). |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | При переопределении в производном классе определяет, находится ли текущий [XPathNavigator](./) в той же позиции, что и указанный [XPathNavigator](./). |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Возвращает URI пространства имён для указанного префикса. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Возвращает префикс, объявленный для указанного URI пространства имен. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Определяет, соответствует ли текущий узел указанному [XPathExpression](../xpathexpression/). |
| virtual [Matches](./matches/)(String) | Определяет, соответствует ли текущий узел указанному выражению [XPath](../). |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | При переопределении в производном классе перемещает [XPathNavigator](./) в ту же позицию, что и указанный [XPathNavigator](./). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Перемещает [XPathNavigator](./) к атрибуту с соответствующим локальным именем и URI пространства имен. |
| virtual [MoveToChild](./movetochild/)(String, String) | Перемещает [XPathNavigator](./) к дочернему узлу с указанным локальным именем и URI пространства имен. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Перемещает [XPathNavigator](./) к дочернему узлу указанного типа [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToFirst](./movetofirst/)() | Перемещает [XPathNavigator](./) к первому соседнему узлу текущего узла. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к первому атрибуту текущего узла. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к первому дочернему узлу текущего узла. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | При переопределении в производном классе перемещает [XPathNavigator](./) к первому узлу пространства имен, соответствующему указанному [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Перемещает [XPathNavigator](./) к первому узлу пространства имен текущего узла. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Перемещает [XPathNavigator](./) к элементу с указанным локальным именем и URI пространства имен в порядке следования в документе. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Перемещает [XPathNavigator](./) к элементу с указанным локальным именем и URI пространства имен, до указанной границы, в порядке следования в документе. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Перемещает [XPathNavigator](./) к следующему элементу указанного типа [XPathNodeType](../xpathnodetype/) в порядке следования в документе. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Перемещает [XPathNavigator](./) к следующему элементу указанного типа [XPathNodeType](../xpathnodetype/), до указанной границы, в порядке следования в документе. |
| virtual [MoveToId](./movetoid/)(String) | При переопределении в производном классе перемещается к узлу, имеющему атрибут типа **ID**, значение которого соответствует указанному [String](../../system/string/). |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Перемещает [XPathNavigator](./) к узлу пространства имен с указанным префиксом пространства имен. |
| virtual [MoveToNext](./movetonext/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к следующему соседнему узлу текущего узла. |
| virtual [MoveToNext](./movetonext/)(String, String) | Перемещает [XPathNavigator](./) к следующему соседнему узлу с указанным локальным именем и URI пространства имен. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Перемещает [XPathNavigator](./) к следующему соседнему узлу текущего узла, соответствующему указанному типу [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к следующему атрибуту. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | При переопределении в производном классе перемещает [XPathNavigator](./) к следующему узлу пространства имён, соответствующему указанному [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToNextNamespace](./movetonextnamespace/)() | Перемещает [XPathNavigator](./) к следующему узлу пространства имён. |
| virtual [MoveToParent](./movetoparent/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к родительскому узлу текущего узла. |
| virtual [MoveToPrevious](./movetoprevious/)() | При переопределении в производном классе перемещает [XPathNavigator](./) к предыдущему соседнему узлу текущего узла. |
| virtual [MoveToRoot](./movetoroot/)() | Перемещает [XPathNavigator](./) к корневому узлу, к которому принадлежит текущий узел. |
| virtual [PrependChild](./prependchild/)() | Возвращает объект [XmlWriter](../../system.xml/xmlwriter/), используемый для создания нового дочернего узла в начале списка дочерних узлов текущего узла. |
| virtual [PrependChild](./prependchild/)(String) | Создаёт новый дочерний узел в начале списка дочерних узлов текущего узла, используя указанную XML‑строку. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Создаёт новый дочерний узел в начале списка дочерних узлов текущего узла, используя XML‑содержимое указанного объекта [XmlReader](../../system.xml/xmlreader/). |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Создаёт новый дочерний узел в начале списка дочерних узлов текущего узла, используя узлы указанного объекта [XPathNavigator](./). |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Создаёт новый дочерний элемент в начале списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён со значением. |
| virtual [ReadSubtree](./readsubtree/)() | Возвращает объект [XmlReader](../../system.xml/xmlreader/), содержащий текущий узел и его дочерние узлы. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Заменяет диапазон соседних узлов от текущего узла до указанного узла. |
| virtual [ReplaceSelf](./replaceself/)(String) | Заменяет текущий узел содержимым указанной строки. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Заменяет текущий узел содержимым указанного объекта [XmlReader](../../system.xml/xmlreader/). |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Заменяет текущий узел содержимым указанного объекта [XPathNavigator](./). |
| virtual [Select](./select/)(String) | Выбирает набор узлов, используя указанное выражение [XPath](../). |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Выбирает набор узлов, используя указанное выражение [XPath](../) и указанный объект [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) для разрешения префиксов пространств имён. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Выбирает набор узлов, используя указанное [XPathExpression](../xpathexpression/). |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Выбирает все предковые узлы текущего узла, соответствующие [XPathNodeType](../xpathnodetype/). |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Выбирает все предковые узлы текущего узла с указанным локальным именем и URI пространства имён. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Выбирает все дочерние узлы текущего узла, соответствующие [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Выбирает все дочерние узлы текущего узла с указанным локальным именем и URI пространства имён. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Выбирает все потомки текущего узла, соответствующие [XPathNodeType](../xpathnodetype/). |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Выбирает все потомки текущего узла с указанным локальным именем и URI пространства имён. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Выбирает один узел в [XPathNavigator](./), используя указанный запрос [XPath](../). |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Выбирает один узел в объекте [XPathNavigator](./), используя указанный запрос [XPath](../) с объектом [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/), указанным для разрешения префиксов пространств имён. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Выбирает один узел в [XPathNavigator](./), используя указанный объект [XPathExpression](../xpathexpression/). |
| virtual [set_InnerXml](./set_innerxml/)(String) | Устанавливает разметку, представляющую дочерние узлы текущего узла. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Устанавливает разметку, представляющую открывающие и закрывающие теги текущего узла и его дочерних узлов. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Устанавливает типизированное значение текущего узла. |
| virtual [SetValue](./setvalue/)(String) | Устанавливает значение текущего узла. |
| [ToString](./tostring/)() const override | Возвращает текстовое значение текущего узла. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Возвращает значение текущего узла как указанный тип, используя объект [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/), указанный для разрешения префиксов пространств имён. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Передаёт текущий узел и его дочерние узлы в указанный объект [XmlWriter](../../system.xml/xmlwriter/). |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## См. также

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
