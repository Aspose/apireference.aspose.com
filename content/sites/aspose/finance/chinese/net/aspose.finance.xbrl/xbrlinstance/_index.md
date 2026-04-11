---
title: XbrlInstance
second_title: Aspose.Finance 适用于 .NET API 参考
description: XBRL 实例是根元素带有 xbrl 标记的 XML 片段。XBRL 实例包含业务报告事实，每个事实对应其支持的 DTS 中定义的 Concept./concept。XBRL 实例还包含上下文和单位，提供解释实例中事实所需的附加信息。
type: docs
weight: 8250
url: /zh/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

XBRL 实例是根元素带有 xbrl 标记的 XML 片段。XBRL 实例包含业务报告事实，每个事实对应其支持的 DTS 中定义的 [`Concept`](../concept)。XBRL 实例还包含上下文和单位，提供解释实例中事实所需的附加信息。

```csharp
public class XbrlInstance
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences) { get; set; } | 获取或设置 XBRL 实例中 [`ArcroleReference`](../arcrolereference) 对象的集合。 |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts) { get; set; } | 获取或设置 XBRL 实例中 [`Context`](../context) 对象的集合。 |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts) { get; } | 获取 XBRL 实例中 [`Fact`](../fact) 对象的集合。 |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks) { get; set; } | 获取或设置 XBRL 实例中 [`FootnoteLink`](../footnotelink) 对象的集合。 |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items) { get; } | 获取 XBRL 实例中 [`Item`](../item) 对象的集合。 |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection) { get; } | 获取 [`XbrlInstance`](../xbrlinstance) 中的 [`LinkbaseRefCollection`](./linkbaserefcollection)。 |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences) { get; set; } | 获取或设置 XBRL 实例中 [`RoleReference`](../rolereference) 对象的集合。 |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation) { get; set; } | 获取或设置模式位置 |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs) { get; } | 获取 SchemaRef 集合。 |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units) { get; set; } | 获取或设置 XBRL 实例中 [`Unit`](../unit) 对象的集合。 |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors) { get; } | 获取验证错误的集合。 |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument) { get; } | 获取包含此实例的 [`XbrlDocument`](./xbrldocument)。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement)(string, string, string) | 创建一个新元素。 |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections)() | 获取 XBRL 实例中的所有 linkbase 引用集合以及模式引用。 |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri)(string) | 获取具有指定 uri 的 ArcroleType。 |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid)(string) | 获取具有指定 ID 的概念。 |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc)(Loc) | 通过定位器获取概念。 |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname)(string) | 获取具有指定名称的概念。 |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname)(string, string) | 获取具有指定 URI 和名称的概念。 |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid)(string) | 获取具有指定 id 的上下文。 |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks)(string, string) | 获取 XBRL 实例中的呈现链接。 |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri)(string) | 获取具有指定 uri 的 RoleType。 |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid)(string) | 获取具有指定 id 的单元。 |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid)() | 检查此 XBRL 实例是否有效。 |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate)() | 验证此 XBRL 实例。 |

### 另请参阅

* namespace [Aspose.Finance.Xbrl](../../aspose.finance.xbrl)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
