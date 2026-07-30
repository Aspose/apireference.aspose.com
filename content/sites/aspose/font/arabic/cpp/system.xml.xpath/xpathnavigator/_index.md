---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator class. يوفر نموذج مؤشر للتنقل وتحرير بيانات XML في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


يوفر نموذج مؤشر للتنقل وتحرير بيانات XML.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | يعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقد فرعية جديدة واحدة أو أكثر في نهاية قائمة العقد الفرعية للعقدة الحالية. |
| virtual [AppendChild](./appendchild/)(String) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام سلسلة بيانات XML المحددة. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام العقد الموجودة في [XPathNavigator](./) المحدد. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | ينشئ عقدة عنصر فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة الفضاء الاسمي، الاسم المحلي، وURI الفضاء الاسمي المحددين مع القيمة المحددة. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | يتحقق من أن بيانات XML في [XPathNavigator](./) تتوافق مع مخطط تعريف لغة XML [Schema](../../system.xml.schema/) (XSD) المقدم. |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تنشئ [XPathNavigator](./) جديدًا موضعًا على نفس العقدة مثل هذا [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | يقارن موضع [XPathNavigator](./) الحالي بموضع [XPathNavigator](./) المحدد. |
| virtual [Compile](./compile/)(String) | يقوم بتجميع سلسلة تمثل تعبير [XPath](../) ويعيد كائن [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | ينشئ عقدة سمة على عقدة العنصر الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي وعنوان URI للفضاء الاسمي المحددين مع القيمة المحددة. |
| virtual [CreateAttributes](./createattributes/)() | يعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء سمات جديدة على العنصر الحالي. |
| [CreateNavigator](./createnavigator/)() override | يعيد نسخة من [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | يحذف نطاقًا من العقد الشقيقة من العقدة الحالية إلى العقدة المحددة. |
| virtual [DeleteSelf](./deleteself/)() | يحذف العقدة الحالية وعقدها الفرعية. |
| virtual [Evaluate](./evaluate/)(String) | يقيم التعبير [XPath](../) المحدد ويعيد النتيجة ذات النوع. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يقيم التعبير [XPath](../) المحدد ويعيد النتيجة ذات النوع، باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي في تعبير [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | يقيم [XPathExpression](../xpathexpression/) ويعيد النتيجة ذات النوع. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | يستخدم السياق المقدم لتقييم [XPathExpression](../xpathexpression/)، ويعيد النتيجة ذات النوع. |
| virtual [get_BaseURI](./get_baseuri/)() | عند تجاوزها في فئة مشتقة، تحصل على عنوان URI الأساسي للعقدة الحالية. |
| virtual [get_CanEdit](./get_canedit/)() | يعيد قيمة تشير إلى ما إذا كان بإمكان [XPathNavigator](./) تعديل بيانات XML الأساسية. |
| virtual [get_HasAttributes](./get_hasattributes/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| virtual [get_HasChildren](./get_haschildren/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي عقد فرعية. |
| virtual [get_InnerXml](./get_innerxml/)() | يعيد الترميز الذي يمثل العقد الفرعية للعقدة الحالية. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | عند تجاوزها في فئة مشتقة، يحصل على قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا بدون وسم إغلاق. |
| [get_IsNode](./get_isnode/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تمثل عقدة [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | عند تجاوزها في فئة مشتقة، يحصل على [XPathNavigator::get_Name](./get_name/) للعقدة الحالية دون أي بادئة فضاء اسمي. |
| virtual [get_Name](./get_name/)() | عند تجاوزها في فئة مشتقة، تحصل على الاسم المؤهل للعقدة الحالية. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | عند تجاوزها في فئة مشتقة، يحصل على عنوان URI للفضاء الاسمي للعقدة الحالية. |
| virtual [get_NameTable](./get_nametable/)() | عند تجاوزها في فئة مشتقة، يحصل على [XmlNameTable](../../system.xml/xmlnametable/) الخاص بـ [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | يعيد [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) يُستخدم لمقارنة المساواة لكائنات [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | عند تجاوزها في فئة مشتقة، يحصل على [XPathNodeType](../xpathnodetype/) للعقدة الحالية. |
| virtual [get_OuterXml](./get_outerxml/)() | يعيد الترميز الذي يمثل وسمي الفتح والإغلاق للعقدة الحالية وعقدها الفرعية. |
| virtual [get_Prefix](./get_prefix/)() | عند تجاوزها في فئة مشتقة، تحصل على بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | يرجع معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجة للتحقق من صحة المخطط. |
| [get_TypedValue](./get_typedvalue/)() override | يعيد العقدة الحالية ككائن معبأ من النوع الأنسب. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | يُستخدم من قبل تطبيقات [XPathNavigator](./) التي توفر عرض XML "مُفترض" فوق مخزن، لتوفير الوصول إلى الكائنات الأساسية. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | يعيد قيمة العقدة الحالية كـ [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | يعيد قيمة العقدة الحالية كـ [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | يعيد قيمة العقدة الحالية كـ [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | يعيد قيمة العقدة الحالية كـ [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | يعيد قيمة العقدة الحالية كـ [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | يعيد نوع العقدة الحالية. |
| virtual [get_XmlLang](./get_xmllang/)() | يعيد نطاق **xml:lang** للعقدة الحالية. |
| [get_XmlType](./get_xmltype/)() override | يعيد معلومات XmlSchemaType للعقدة الحالية. |
| virtual [GetAttribute](./getattribute/)(String, String) | يعيد قيمة السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم. |
| virtual [GetNamespace](./getnamespace/)(String) | يعيد قيمة عقدة النطاق التي تتطابق مع الاسم المحلي المحدد. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | يعيد النطاقات داخل نطاق العقدة الحالية. |
| virtual [InsertAfter](./insertafter/)() | يعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة شقيقة جديدة بعد العقدة المحددة حاليًا. |
| virtual [InsertAfter](./insertafter/)(String) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام سلسلة XML المحددة. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام العقد الموجودة في كائن [XPathNavigator](./) المحدد. |
| virtual [InsertBefore](./insertbefore/)() | يعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة شقيقة جديدة قبل العقدة المحددة حاليًا. |
| virtual [InsertBefore](./insertbefore/)(String) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام سلسلة XML المحددة. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام العقد الموجودة في كائن [XPathNavigator](./) المحدد. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | ينشئ عنصر شقيق جديد بعد العقدة الحالية باستخدام بادئة النطاق، الاسم المحلي، وعنوان URI للنطاق المحدد، مع القيمة المحددة. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | ينشئ عنصر شقيق جديد قبل العقدة الحالية باستخدام بادئة النطاق، الاسم المحلي، وعنوان URI للنطاق المحدد، مع القيمة المحددة. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | يحدد ما إذا كان [XPathNavigator](./) المحدد تابعًا للعقدة [XPathNavigator](./) الحالية. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | عند تجاوزه في فئة مشتقة، يحدد ما إذا كان [XPathNavigator](./) الحالي في نفس الموضع مثل [XPathNavigator](./) المحدد. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يعيد URI مساحة الاسم للبادئة المحددة. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | يعيد البادئة المعلنة لعنوان URI للنطاق المحدد. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | يحدد ما إذا كانت العقدة الحالية تطابق [XPathExpression](../xpathexpression/) المحددة. |
| virtual [Matches](./matches/)(String) | يحدد ما إذا كانت العقدة الحالية تطابق تعبير [XPath](../) المحدد. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | عند تجاوزه في فئة مشتقة، ينقل [XPathNavigator](./) إلى نفس الموضع مثل [XPathNavigator](./) المحدد. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | ينقل الـ [XPathNavigator](./) إلى السمة التي لها الاسم المحلي والمسار (URI) المتطابق. |
| virtual [MoveToChild](./movetochild/)(String, String) | ينقل الـ [XPathNavigator](./) إلى العقدة الفرعية التي لها الاسم المحلي والمسار (URI) المحددين. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | ينقل الـ [XPathNavigator](./) إلى العقدة الفرعية من نوع [XPathNodeType](../xpathnodetype/) المحدد. |
| virtual [MoveToFirst](./movetofirst/)() | ينقل الـ [XPathNavigator](./) إلى أول عقدة شقيقة للعقدة الحالية. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى أول سمة للعقدة الحالية. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى أول عقدة فرعية للعقدة الحالية. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى أول عقدة مساحة اسم تتطابق مع [XPathNamespaceScope](../xpathnamespacescope/) المحددة. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | ينقل الـ [XPathNavigator](./) إلى أول عقدة مساحة اسم للعقدة الحالية. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | ينقل الـ [XPathNavigator](./) إلى العنصر الذي له الاسم المحلي والمسار (URI) المحددين وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | ينقل الـ [XPathNavigator](./) إلى العنصر الذي له الاسم المحلي والمسار (URI) المحددين، إلى الحد المحدد، وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | ينقل الـ [XPathNavigator](./) إلى العنصر التالي من نوع [XPathNodeType](../xpathnodetype/) المحدد وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | ينقل الـ [XPathNavigator](./) إلى العنصر التالي من نوع [XPathNodeType](../xpathnodetype/) المحدد، إلى الحد المحدد، وفق ترتيب المستند. |
| virtual [MoveToId](./movetoid/)(String) | عند تجاوزها في فئة مشتقة، تنقل إلى العقدة التي تحتوي على سمة من النوع **ID** قيمتها تتطابق مع الـ [String](../../system/string/) المحدد. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | ينقل الـ [XPathNavigator](./) إلى عقدة مساحة الاسم التي لها البادئة المحددة. |
| virtual [MoveToNext](./movetonext/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى العقدة الشقيقة التالية للعقدة الحالية. |
| virtual [MoveToNext](./movetonext/)(String, String) | ينقل الـ [XPathNavigator](./) إلى العقدة الشقيقة التالية التي لها الاسم المحلي والمسار (URI) المحددين. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | ينقل الـ [XPathNavigator](./) إلى العقدة الشقيقة التالية للعقدة الحالية التي تتطابق مع [XPathNodeType](../xpathnodetype/) المحدد. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى السمة التالية. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى عقدة مساحة الاسم التالية التي تتطابق مع [XPathNamespaceScope](../xpathnamespacescope/) المحدد. |
| [MoveToNextNamespace](./movetonextnamespace/)() | ينقل الـ [XPathNavigator](./) إلى عقدة مساحة الاسم التالية. |
| virtual [MoveToParent](./movetoparent/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى العقدة الأصلية للعقدة الحالية. |
| virtual [MoveToPrevious](./movetoprevious/)() | عند تجاوزها في فئة مشتقة، تنقل الـ [XPathNavigator](./) إلى العقدة الشقيقة السابقة للعقدة الحالية. |
| virtual [MoveToRoot](./movetoroot/)() | ينقل الـ [XPathNavigator](./) إلى عقدة الجذر التي تنتمي إليها العقدة الحالية. |
| virtual [PrependChild](./prependchild/)() | يعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية. |
| virtual [PrependChild](./prependchild/)(String) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام سلسلة XML المحددة. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام العقد في كائن [XPathNavigator](./) المحدد. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | ينشئ عنصرًا فرعيًا جديدًا في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي وURI للفضاء الاسمي المحددين بالقيمة المحددة. |
| virtual [ReadSubtree](./readsubtree/)() | يرجع كائن [XmlReader](../../system.xml/xmlreader/) يحتوي على العقدة الحالية وعقدها الفرعية. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | يستبدل مجموعة من العقد الشقيقة من العقدة الحالية إلى العقدة المحددة. |
| virtual [ReplaceSelf](./replaceself/)(String) | يستبدل العقدة الحالية بمحتوى السلسلة المحددة. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | يستبدل العقدة الحالية بمحتويات كائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | يستبدل العقدة الحالية بمحتويات كائن [XPathNavigator](./) المحدد. |
| virtual [Select](./select/)(String) | يختار مجموعة عقد، باستخدام تعبير [XPath](../) المحدد. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يختار مجموعة عقد باستخدام تعبير [XPath](../) المحدد مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | يختار مجموعة عقد باستخدام [XPathExpression](../xpathexpression/) المحدد. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | يختار جميع العقد الأصلية للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | يختار جميع العقد الأصلية للعقدة الحالية التي لها الاسم المحلي وURI للفضاء الاسمي المحددين. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | يختار جميع العقد الفرعية للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectChildren](./selectchildren/)(String, String) | يختار جميع العقد الفرعية للعقدة الحالية التي لها الاسم المحلي وURI للفضاء الاسمي المحددين. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | يختار جميع العقد السفلية للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | يختار جميع العقد السفلية للعقدة الحالية التي لها الاسم المحلي وURI للفضاء الاسمي المحددين. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | يختار عقدة واحدة في [XPathNavigator](./) باستخدام استعلام [XPath](../) المحدد. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يختار عقدة واحدة في كائن [XPathNavigator](./) باستخدام استعلام [XPath](../) المحدد مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | يختار عقدة واحدة في [XPathNavigator](./) باستخدام كائن [XPathExpression](../xpathexpression/) المحدد. |
| virtual [set_InnerXml](./set_innerxml/)(String) | يضبط الترميز الذي يمثل العقد الفرعية للعقدة الحالية. |
| virtual [set_OuterXml](./set_outerxml/)(String) | يضبط الترميز الذي يمثل وسوم الفتح والإغلاق للعقدة الحالية وعقدها الفرعية. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | يضبط القيمة ذات النوع للعقدة الحالية. |
| virtual [SetValue](./setvalue/)(String) | يضبط قيمة العقدة الحالية. |
| [ToString](./tostring/)() const override | يعيد القيمة النصية للعقدة الحالية. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | يرجع قيمة العقدة الحالية كـ Type المحدد، باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | يبث العقدة الحالية وعقدها الفرعية إلى كائن [XmlWriter](../../system.xml/xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
