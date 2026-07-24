---
title: "System::Xml::XPath::XPathNavigator فئة"
linktitle: "XPathNavigator"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XPath::XPathNavigator فئة. توفر نموذج مؤشر للتنقل وتحرير بيانات XML في C++."
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
| virtual [AppendChild](./appendchild/)() | تُعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة فرعية واحدة أو أكثر جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية. |
| virtual [AppendChild](./appendchild/)(String) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام سلسلة بيانات XML المحددة. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام العقد في [XPathNavigator](./) المحدد. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | ينشئ عقدة عنصر فرعي جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي ومعرف الفضاء الاسمي المحددين مع القيمة المحددة. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | يتحقق من أن بيانات XML في [XPathNavigator](./) تتطابق مع مخطط تعريف لغة XML [Schema](../../system.xml.schema/) (XSD) المقدم. |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تنشئ [XPathNavigator](./) جديدًا يتموضع على نفس العقدة مثل هذا [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | يقارن موضع [XPathNavigator](./) الحالي بموضع [XPathNavigator](./) المحدد. |
| virtual [Compile](./compile/)(String) | يُجمع سلسلة تمثل تعبيرًا [XPath](../) ويعيد كائنًا من نوع [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | ينشئ عقدة سمة على عقدة العنصر الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي ومعرف الفضاء الاسمي المحددين مع القيمة المحددة. |
| virtual [CreateAttributes](./createattributes/)() | يعيد كائنًا من نوع [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء سمات جديدة على العنصر الحالي. |
| [CreateNavigator](./createnavigator/)() override | يعيد نسخة من [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | يحذف مجموعة من العقد الشقيقة من العقدة الحالية إلى العقدة المحددة. |
| virtual [DeleteSelf](./deleteself/)() | يحذف العقدة الحالية وعقدها الفرعية. |
| virtual [Evaluate](./evaluate/)(String) | يقيم التعبير [XPath](../) المحدد ويعيد النتيجة ذات النوع. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يقيم التعبير [XPath](../) المحدد ويعيد النتيجة ذات النوع، باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات الفضاء الاسمي في تعبير [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | يقيم [XPathExpression](../xpathexpression/) ويعيد النتيجة ذات النوع. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | يستخدم السياق المقدم لتقييم [XPathExpression](../xpathexpression/)، ويعيد النتيجة ذات النوع. |
| virtual [get_BaseURI](./get_baseuri/)() | عند تجاوزها في فئة مشتقة، يحصل على عنوان URI الأساسي للعقدة الحالية. |
| virtual [get_CanEdit](./get_canedit/)() | يعيد قيمة تشير إلى ما إذا كان بإمكان [XPathNavigator](./) تعديل بيانات XML الأساسية. |
| virtual [get_HasAttributes](./get_hasattributes/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| virtual [get_HasChildren](./get_haschildren/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي عقد فرعية. |
| virtual [get_InnerXml](./get_innerxml/)() | يعيد الترميز الذي يمثل العقد الفرعية للعقدة الحالية. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | عند تجاوزها في فئة مشتقة، يحصل على قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا بدون علامة إغلاق. |
| [get_IsNode](./get_isnode/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تمثل عقدة [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | عند تجاوزها في فئة مشتقة، يحصل على [XPathNavigator::get_Name](./get_name/) للعقدة الحالية بدون أي بادئة فضاء اسمي. |
| virtual [get_Name](./get_name/)() | عند تجاوزها في فئة مشتقة، تُعيد الاسم المؤهل للعقدة الحالية. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | عند تجاوزها في فئة مشتقة، تحصل على معرف مساحة الاسم للعنصر الحالي. |
| virtual [get_NameTable](./get_nametable/)() | عند تجاوزها في فئة مشتقة، تحصل على [XmlNameTable](../../system.xml/xmlnametable/) الخاص بـ [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | تُرجع [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) المستخدم للمقارنة المتساوية لكائنات [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | عند تجاوزها في فئة مشتقة، تحصل على [XPathNodeType](../xpathnodetype/) للعنصر الحالي. |
| virtual [get_OuterXml](./get_outerxml/)() | تُرجع العلامة التي تمثل وسوم الفتح والإغلاق للعنصر الحالي وعناصره الفرعية. |
| virtual [get_Prefix](./get_prefix/)() | عند تجاوزها في فئة مشتقة، تحصل على بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | يعيد معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجةً للتحقق من صحة المخطط. |
| [get_TypedValue](./get_typedvalue/)() override | تُرجع العنصر الحالي ككائن معبأ من النوع الأنسب. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | يُستخدم من قبل تطبيقات [XPathNavigator](./) التي توفر عرض XML "مُفترض" فوق مخزن، لتوفير الوصول إلى الكائنات الأساسية. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | تُرجع قيمة العنصر الحالي كـ [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | تُرجع قيمة العنصر الحالي كـ [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | تُرجع قيمة العنصر الحالي كـ [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | تُرجع قيمة العنصر الحالي كـ [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | تُرجع قيمة العنصر الحالي كـ [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | يرجع نوع العقدة الحالية. |
| virtual [get_XmlLang](./get_xmllang/)() | تُرجع نطاق **xml:lang** للعنصر الحالي. |
| [get_XmlType](./get_xmltype/)() override | تُرجع معلومات XmlSchemaType للعنصر الحالي. |
| virtual [GetAttribute](./getattribute/)(String, String) | يعيد قيمة السمة ذات الاسم المحلي المحدد وURI مساحة الاسم. |
| virtual [GetNamespace](./getnamespace/)(String) | تُرجع قيمة عقدة مساحة الاسم المقابلة للاسم المحلي المحدد. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | تُرجع مساحات الاسم المتاحة ضمن نطاق العنصر الحالي. |
| virtual [InsertAfter](./insertafter/)() | تُرجع كائن [XmlWriter](../../system.xml/xmlwriter/) يستخدم لإنشاء عقدة شقيقة جديدة بعد العقدة المحددة حاليًا. |
| virtual [InsertAfter](./insertafter/)(String) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام سلسلة XML المحددة. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة شقيقة جديدة بعد العقدة المحددة حاليًا باستخدام العقد الموجودة في كائن [XPathNavigator](./) المحدد. |
| virtual [InsertBefore](./insertbefore/)() | تُرجع كائن [XmlWriter](../../system.xml/xmlwriter/) يستخدم لإنشاء عقدة شقيقة جديدة قبل العقدة المحددة حاليًا. |
| virtual [InsertBefore](./insertbefore/)(String) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام سلسلة XML المحددة. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة شقيقة جديدة قبل العقدة المحددة حاليًا باستخدام العقد الموجودة في [XPathNavigator](./) المحدد. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | ينشئ عنصر شقيق جديد بعد العنصر الحالي باستخدام بادئة مساحة الاسم، الاسم المحلي ومعرف مساحة الاسم المحددين، مع القيمة المحددة. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | ينشئ عنصرًا شقيقًا جديدًا قبل العقدة الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي وURI الفضاء الاسمي المحدد، مع القيمة المحددة. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | يحدد ما إذا كان [XPathNavigator](./) المحدد هو سليل [XPathNavigator](./) الحالي. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | عند تجاوزها في فئة مشتقة، تحدد ما إذا كان [XPathNavigator](./) الحالي في نفس الموقع مثل [XPathNavigator](./) المحدد. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يعيد URI مساحة الاسم للبادئة المحددة. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | يعيد البادئة المعلنة للـ URI الفضاء الاسمي المحدد. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | يحدد ما إذا كانت العقدة الحالية تطابق [XPathExpression](../xpathexpression/) المحددة. |
| virtual [Matches](./matches/)(String) | يحدد ما إذا كانت العقدة الحالية تطابق تعبير [XPath](../) المحدد. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى نفس الموقع مثل [XPathNavigator](./) المحدد. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | تنقل [XPathNavigator](./) إلى السمة التي لها الاسم المحلي وURI الفضاء الاسمي المتطابقين. |
| virtual [MoveToChild](./movetochild/)(String, String) | تنقل [XPathNavigator](./) إلى العقدة الفرعية التي لها الاسم المحلي وURI الفضاء الاسمي المحددين. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | تنقل [XPathNavigator](./) إلى العقدة الفرعية من نوع [XPathNodeType](../xpathnodetype/) المحدد. |
| virtual [MoveToFirst](./movetofirst/)() | تنقل [XPathNavigator](./) إلى أول عقدة شقيقة للعقدة الحالية. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى أول سمة للعقدة الحالية. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى أول عقدة فرعية للعقدة الحالية. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى أول عقدة فضاء اسمي تطابق [XPathNamespaceScope](../xpathnamespacescope/) المحدد. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | تنقل [XPathNavigator](./) إلى أول عقدة فضاء اسمي للعقدة الحالية. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | تنقل [XPathNavigator](./) إلى العنصر الذي له الاسم المحلي وURI الفضاء الاسمي المحددين وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | تنقل [XPathNavigator](./) إلى العنصر الذي له الاسم المحلي وURI الفضاء الاسمي المحددين، إلى الحد المحدد، وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | تنقل [XPathNavigator](./) إلى العنصر التالي من نوع [XPathNodeType](../xpathnodetype/) المحدد وفق ترتيب المستند. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | تنقل [XPathNavigator](./) إلى العنصر التالي من نوع [XPathNodeType](../xpathnodetype/) المحدد، إلى الحد المحدد، وفق ترتيب المستند. |
| virtual [MoveToId](./movetoid/)(String) | عند تجاوزها في فئة مشتقة، تنقل إلى العقدة التي تحتوي على سمة من النوع **ID** قيمتها تطابق [String](../../system/string/) المحدد. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | تنقل [XPathNavigator](./) إلى عقدة الفضاء الاسمي التي لها البادئة المحددة. |
| virtual [MoveToNext](./movetonext/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى العقدة الشقيقة التالية للعقدة الحالية. |
| virtual [MoveToNext](./movetonext/)(String, String) | تنقل [XPathNavigator](./) إلى العقدة الشقيقة التالية التي لها الاسم المحلي وURI الفضاء الاسمي المحددين. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | تنقل [XPathNavigator](./) إلى العقدة الشقيقة التالية للعقدة الحالية التي تطابق [XPathNodeType](../xpathnodetype/) المحدد. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى السمة التالية. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى عقدة مساحة الاسم التالية التي تطابق [XPathNamespaceScope](../xpathnamespacescope/) المحددة. |
| [MoveToNextNamespace](./movetonextnamespace/)() | تنقل [XPathNavigator](./) إلى عقدة مساحة الاسم التالية. |
| virtual [MoveToParent](./movetoparent/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى العقدة الأب للعقدة الحالية. |
| virtual [MoveToPrevious](./movetoprevious/)() | عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](./) إلى العقدة الشقيقة السابقة للعقدة الحالية. |
| virtual [MoveToRoot](./movetoroot/)() | تنقل [XPathNavigator](./) إلى عقدة الجذر التي تنتمي إليها العقدة الحالية. |
| virtual [PrependChild](./prependchild/)() | تُعيد كائن [XmlWriter](../../system.xml/xmlwriter/) يُستخدم لإنشاء عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية. |
| virtual [PrependChild](./prependchild/)(String) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام سلسلة XML المحددة. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام محتويات XML لكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | ينشئ عقدة فرعية جديدة في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام العقد الموجودة في كائن [XPathNavigator](./) المحدد. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | ينشئ عنصرًا فرعيًا جديدًا في بداية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة مساحة الاسم والاسم المحلي وعنوان URI لمساحة الاسم المحددة بالقيمة المحددة. |
| virtual [ReadSubtree](./readsubtree/)() | تُعيد كائن [XmlReader](../../system.xml/xmlreader/) يحتوي على العقدة الحالية وعقدها الفرعية. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | يستبدل مجموعة من العقد الشقيقة من العقدة الحالية إلى العقدة المحددة. |
| virtual [ReplaceSelf](./replaceself/)(String) | يستبدل العقدة الحالية بمحتوى السلسلة المحددة. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | يستبدل العقدة الحالية بمحتويات كائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | يستبدل العقدة الحالية بمحتويات كائن [XPathNavigator](./) المحدد. |
| virtual [Select](./select/)(String) | يختار مجموعة عقد، باستخدام تعبير [XPath](../) المحدد. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يختار مجموعة عقد باستخدام تعبير [XPath](../) المحدد مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات مساحات الاسم. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | يختار مجموعة عقد باستخدام [XPathExpression](../xpathexpression/) المحدد. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | يختار جميع العقد السلفية للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | يختار جميع العقد السلفية للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | يختار جميع العقد الفرعية للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectChildren](./selectchildren/)(String, String) | يختار جميع العقد الفرعية للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | يختار جميع العقد المتفرعة للعقدة الحالية التي لها نوع [XPathNodeType](../xpathnodetype/) متطابق. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | يختار جميع العقد المتفرعة للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | يختار عقدة واحدة في [XPathNavigator](./) باستخدام استعلام [XPath](../) المحدد. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | يختار عقدة واحدة في كائن [XPathNavigator](./) باستخدام استعلام [XPath](../) المحدد مع كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات المساحات الاسمية. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | يختار عقدة واحدة في [XPathNavigator](./) باستخدام كائن [XPathExpression](../xpathexpression/) المحدد. |
| virtual [set_InnerXml](./set_innerxml/)(String) | يضبط الترميز الذي يمثل العقد الفرعية للعقدة الحالية. |
| virtual [set_OuterXml](./set_outerxml/)(String) | يضبط الترميز الذي يمثل وسوم الفتح والإغلاق للعقدة الحالية وعقدها الفرعية. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | يضبط القيمة ذات النوع للعقدة الحالية. |
| virtual [SetValue](./setvalue/)(String) | يضبط قيمة العقدة الحالية. |
| [ToString](./tostring/)() const override | يعيد القيمة النصية للعقدة الحالية. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | يرجع قيمة العقدة الحالية بالنوع المحدد، باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات المساحات الاسمية. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | يبث العقدة الحالية وعقدها الفرعية إلى كائن [XmlWriter](../../system.xml/xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
