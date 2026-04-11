---
title: XbrlInstance
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: مثيل XBRL هو جزء XML يحتوي على عنصر جذر يحمل علامة xbrl. يحتوي مثيل XBRL على حقائق تقرير الأعمال حيث يتطابق كل حقيقة مع مفهوم Concept./concept معرف في نظام DTS الداعم لها. كما يحتوي مثيل XBRL على سياقات ووحدات توفر معلومات إضافية ضرورية لتفسير الحقائق في المثيل.
type: docs
weight: 8250
url: /ar/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

مثيل XBRL هو جزء XML يحتوي على عنصر جذر يحمل علامة xbrl. يحتوي مثيل XBRL على حقائق تقرير الأعمال، حيث يتطابق كل حقيقة مع [`Concept`](../concept) معرف في نظام DTS الداعم لها. كما يحتوي مثيل XBRL على سياقات ووحدات توفر معلومات إضافية ضرورية لتفسير الحقائق في المثيل.

```csharp
public class XbrlInstance
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences) { get; set; } | يحصل أو يضبط مجموعة كائنات [`ArcroleReference`](../arcrolereference) في مثيل XBRL. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts) { get; set; } | يحصل أو يضبط مجموعة كائنات [`Context`](../context) في مثيل XBRL. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts) { get; } | يحصل على مجموعة كائنات [`Fact`](../fact) في مثيل XBRL. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks) { get; set; } | يحصل أو يضبط مجموعة كائنات [`FootnoteLink`](../footnotelink) في مثيل XBRL. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items) { get; } | يحصل على مجموعة كائنات [`Item`](../item) في مثيل XBRL. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection) { get; } | يحصل على [`LinkbaseRefCollection`](./linkbaserefcollection) في [`XbrlInstance`](../xbrlinstance). |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences) { get; set; } | يحصل أو يضبط مجموعة كائنات [`RoleReference`](../rolereference) في مثيل XBRL. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation) { get; set; } | يحصل أو يضبط موقع المخطط |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs) { get; } | يحصل على مجموعة SchemaRef. |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units) { get; set; } | يحصل أو يضبط مجموعة كائنات [`Unit`](../unit) في مثيل XBRL. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors) { get; } | يحصل على مجموعة أخطاء التحقق. |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument) { get; } | احصل على [`XbrlDocument`](./xbrldocument) الذي يحتوي على هذا المثيل. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement)(string, string, string) | إنشاء عنصر جديد. |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections)() | احصل على جميع مجموعات مراجع قاعدة الروابط في مثيل xbrl ومراجع المخطط. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri)(string) | يحصل على ArcroleType الذي له uri المحدد. |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid)(string) | يحصل على المفهوم الذي يملك المعرف المحدد. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc)(Loc) | يحصل على المفهوم بواسطة المحدد. |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname)(string) | يحصل على المفهوم الذي له الاسم المحدد. |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname)(string, string) | يحصل على المفهوم الذي له الـ uri والاسم المحددين. |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid)(string) | يحصل على السياق الذي له المعرف المحدد. |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks)(string, string) | يحصل على روابط العرض في مثيل xbrl. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri)(string) | يحصل على RoleType الذي له uri المحدد. |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid)(string) | يحصل على الوحدة التي لها المعرف المحدد. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid)() | يتحقق مما إذا كان مثيل XBRL هذا صالحًا. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate)() | يُصادق على مثيل XBRL هذا. |

### انظر أيضًا

* namespace [Aspose.Finance.Xbrl](../../aspose.finance.xbrl)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
