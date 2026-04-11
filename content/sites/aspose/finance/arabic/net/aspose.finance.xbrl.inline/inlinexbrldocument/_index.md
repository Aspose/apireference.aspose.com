---
title: InlineXbrlDocument
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: مستند XBRL مضمن.
type: docs
weight: 7790
url: /ar/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

مستند XBRL مضمن.

```csharp
public class InlineXbrlDocument : Document
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument#constructor)(string) | ينشئ مثيلاً جديداً من الفئة [`InlineXbrlDocument`](../inlinexbrldocument) ويفتح ملفاً. |
| [InlineXbrlDocument](inlinexbrldocument#constructor_1)(string, LoadOptions) | ينشئ مثيلاً جديداً من الفئة [`InlineXbrlDocument`](../inlinexbrldocument) ويفتح ملفاً. |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | يحصل على مجموعة [`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) في مستند XBRL المضمن. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | يحصل على عنوان URI الأساسي المطلق لهذه العقدة أو null إذا لم يتمكن التنفيذ من الحصول على عنوان URI مطلق. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | يحصل على ترميز المستند. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | يحصل على العناصر الفرعية. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | يحصل على العقد الفرعية. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | يحصل على نوع محتوى المستند. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | يحصل على مجموعة [`Context`](../../aspose.finance.xbrl/context) في مستند XBRL المضمن. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | يحصل على مجموعة [`InlineContinuation`](../inlinecontinuation) في مستند XBRL المضمن. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | هذه سمة ملائمة تسمح بالوصول المباشر إلى العقدة الفرعية التي هي عنصر المستند للمستند. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | يحصل على URI المستند. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | يحصل على مجموعة [`InlineFact`](../inlinefact) في مستند XBRL المضمن. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | يحصل على العنصر الفرعي الأول لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | يحصل على مجموعة [`InlineFootnote`](../inlinefootnote) في مستند XBRL المضمن. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | يحصل على ما إذا كانت هذه العقدة لديها أي أبناء. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | يحصل على العنصر الفرعي الأخير لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | يحصل على الجزء المحلي من الاسم المؤهل لهذه العقدة. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | يحصل على URI مساحة الاسم لهذه العقدة. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | يحصل على العقدة التي تلي هذه العقدة مباشرة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | يحصل على اسم العقدة للمستند. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | يحصل على نوع العقدة. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | يحصل أو يعيّن قيمة هذه العقدة، حسب نوعها. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | يحصل على كائن المستند المرتبط بهذه العقدة. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | يحصل على العقدة الأب. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | يحصل أو يضبط بادئة مساحة الاسم لهذه العقدة. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | يحصل على العقدة التي تسبق هذه العقدة مباشرةً. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | يحصل على [`InlineReferences`](../inlinereferences) في مستند XBRL المضمن. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | يحصل على مجموعة [`InlineRelationship`](../inlinerelationship) في مستند XBRL المضمن. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | يحصل على مجموعة [`RoleReference`](../../aspose.finance.xbrl/rolereference) في مستند XBRL المضمن. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | يحصل أو يضبط محتوى النص لهذه العقدة وفروعها. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | يحصل على مجموعة [`Unit`](../../aspose.finance.xbrl/unit) في مستند XBRL المضمن. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | يحصل على مجموعة [`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) في مستند XBRL المضمن. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | يضيف العقدة newChild إلى نهاية قائمة الأطفال لهذه العقدة. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | ينشئ عنصر HTML. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | ينشئ عنصر XBRL مضمّن. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | ينشئ عنصر مثيل xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | ينشئ عنصر قاعدة ربط xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | تصدير إلى كائن XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | تصدير إلى تدفق xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | تصدير إلى ملف xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | يحصل على ArcroleType الذي له uri المحدد. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | يحصل على السياق الذي له المعرف المحدد. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | يحصل على المفهوم بواسطة المحدد. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | يحصل على المفهوم الذي له الاسم المحدد. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | يحصل على السياق الذي له المعرف المحدد. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | يحصل على سلسلة الاستمرار وفقًا لمرجع الاستمرار. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | يحصل على RoleType الذي له uri المحدد. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | يحصل على الوحدة التي لها المعرف المحدد. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | يتحقق مما إذا كان مستند XBRL المضمن هذا صالحًا. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | إذا تم إضافة أو تحديث أو إزالة عناصر Inline Xbrl في شجرة DOM، يجب استدعاء هذه الطريقة لتحديث كائنات inline xbrl. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | يزيل عقدة الطفل المشار إليها بـ old child من قائمة الأطفال. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | يستبدل عقدة الطفل old child بـ new child في قائمة الأطفال، ويُعيد عقدة الطفل القديمة. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | ينشئ ويحفظ ملف inline xbrl إلى التدفق. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_2)(string) | ينشئ ويحفظ ملف inline xbrl إلى القرص. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(Stream, SaveOptions) | ينشئ ويحفظ ملف inline xbrl إلى التدفق. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_3)(string, SaveOptions) | ينشئ ويحفظ ملف inline xbrl إلى القرص. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | يتحقق من صحة مستند XBRL المضمن هذا. |

### انظر أيضًا

* class [Document](../../aspose.finance.xbrl.dom/document)
* namespace [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
