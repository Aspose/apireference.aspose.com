---
title: Aspose.Finance.Xbrl
second_title: Aspose.Finance 适用于 .NET API 参考
description: 
type: docs
weight: 210
url: /zh/net/aspose.finance.xbrl/
---


## 类

| 类 | 描述 |
| --- | --- |
| [Arc](./arc) | Xlink 的 Arc 类型的基抽象类。 |
| [ArcroleReference](./arcrolereference) | 此类用于解析在 Linkbase 或 XBRL 实例中使用的自定义 arcrole 值。 |
| [ArcroleType](./arcroletype) | 此类用于定义自定义 arc role 类型。 |
| [CalculationArc](./calculationarc) | 此类是一个具有 Arc 类型的 [`Xlink`](../aspose.finance.xbrl/xlink)。它定义了概念在计算目的下相互关联的方式。 |
| [CalculationLink](./calculationlink) | 此类描述了分类法中概念之间的计算关系。 |
| [CalculationLinkbaseRef](./calculationlinkbaseref) | 此类用于计算 linkbase 引用。 |
| [Concept](./concept) | 概念有两种等价的定义方式。语法层面上，概念是 XML Schema 元素定义，定义该元素属于 item 元素替代组或 tuple 元素替代组。语义层面上，概念是对一种可报告业务活动或业务性质的事实的定义。 |
| [Context](./context) | 此类包含实体、期间和情景，它们共同提供理解项目值所需的适当上下文。 |
| [ContextEntity](./contextentity) | [`Context`](../aspose.finance.xbrl/context) 的实体。 |
| [ContextPeriod](./contextperiod) | [`Context`](../aspose.finance.xbrl/context) 的期间。 |
| [ContextSenario](./contextsenario) | [`Context`](../aspose.finance.xbrl/context) 的情景。 |
| [DefinitionArc](./definitionarc) | 此类是一个具有 Arc 类型的 [`Xlink`](../aspose.finance.xbrl/xlink)。它定义了概念之间的各种关系。 |
| [DefinitionLink](./definitionlink) | 此类旨在包含分类法中概念之间的各种杂项关系。 |
| [DefinitionLinkbaseRef](./definitionlinkbaseref) | 此类用于定义链接库引用。 |
| [DimensionMember](./dimensionmember) | 该类表示维度成员。它在 https://www.xbrl.org/specification/dimensions/rec-2012-01-25/dimensions-rec-2006-09-18+corrected-errata-2012-01-25-clean.html 中定义。 |
| [Fact](./fact) | 事实可以是简单的，在这种情况下，它们的值必须以简单内容表示；事实也可以是复合的，在这种情况下，它们的值由其他简单和/或复合事实组成。简单事实使用[`Item`](../aspose.finance.xbrl/item)表示。复合事实使用[`Tuple`](../aspose.finance.xbrl/tuple)表示。 |
| [Footnote](./footnote) | 此类是具有 Resource 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它是 [`FootnoteLink`](../aspose.finance.xbrl/footnotelink) 中唯一允许的资源。 |
| [FootnoteArc](./footnotearc) | 此类是具有 Arc 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它包含在 FootnoteLink 中。 |
| [FootnoteLink](./footnotelink) | 此类包含定位器、资源和弧，描述 XBRL 实例中事实之间的不规则关系。 |
| [IOConfig](./ioconfig) |  |
| [Item](./item) | Item 是 XBRL 项目元素的替代组中的一个元素。它包含简单事实的值以及正确解释该事实所需的上下文引用（以及数值项目的单位）。 |
| [Label](./label) | 此类是具有 Resource 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。虽然每个分类法定义了一组表示业务报告概念的元素，但这些概念的人类可读 XBRL 文档，包括标签（用作每个概念的人类可读名称的字符串）和其他说明性文档，均包含在标签 Linkbase 中的资源元素里。 |
| [LabelArc](./labelarc) | 此类是具有 Arc 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它将概念与[`Label`](../aspose.finance.xbrl/label)资源连接起来。 |
| [LabelLink](./labellink) | 此类旨在包含概念与其文本文档及标签之间的关系。 |
| [LabelLinkbaseRef](./labellinkbaseref) | 此类用于标签链接库引用。 |
| [LinkbaseRef](./linkbaseref) | 此类用于链接库引用。 |
| [LinkbaseRefCollection](./linkbaserefcollection) | 模式链接库引用的集合。 |
| [LoadOptions](./loadoptions) | 用于为不同类型配置文件加载选项的基类 |
| [Loc](./loc) | 此类是具有 Locator 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。 |
| [LocalCacheService](./localcacheservice) | 此类是用于模式和链接库外部文件的本地缓存服务。 |
| [Locator](./locator) | 具有 Locator 类型的 Xlink 基础抽象类。 |
| [PresentationArc](./presentationarc) | 此类是具有 Arc 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它定义了概念在呈现时相互关联的方式。 |
| [PresentationLink](./presentationlink) | 此类旨在描述分类法中概念之间的呈现关系。 |
| [PresentationLinkbaseRef](./presentationlinkbaseref) | 此类用于呈现链接库引用。 |
| [QualifiedName](./qualifiedname) | XML 架构类型 "QName"，如 http://www.w3.org/2001/XMLSchema 命名空间中所定义。 |
| [Reference](./reference) | 此类是具有 Resource 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它使 XBRL 分类法能够在已发布的商业、金融和会计文献中的权威声明中确立概念的定义。 |
| [ReferenceArc](./referencearc) | 此类是具有 Arc 类型的[`Xlink`](../aspose.finance.xbrl/xlink)。它将概念与参考资源连接起来。 |
| [ReferenceLink](./referencelink) | 此类旨在包含概念与已发布的商业、金融和会计文献中权威声明的引用之间的关系，这些声明赋予概念意义。 |
| [ReferenceLinkbaseRef](./referencelinkbaseref) | 此类用于引用链接库引用。 |
| [ReferencePart](./referencepart) | [`Reference`](../aspose.finance.xbrl/reference) 的子成员。 |
| [Resource](./resource) | Xlink 的带 Resource 类型的基础抽象类。 |
| [RoleReference](./rolereference) | 此类在 XBRL 实例中用于引用在脚注链接中使用的任何自定义角色属性值的定义。 |
| [RoleType](./roletype) | 此类用于定义自定义角色类型。 |
| [SaveOptions](./saveoptions) | 表示保存选项。 |
| [SchemaRef](./schemaref) | 此类是对一个分类法模式的引用，该模式成为支持 XBRL 实例的 DTS 的一部分。 |
| [SchemaRefCollection](./schemarefcollection) | 模式引用的集合。 |
| [SecHtmlReportSaveOption](./sechtmlreportsaveoption) | 表示保存 sec html 报告的选项。 |
| [SimpleLink](./simplelink) | 简单类型 Xlink。 |
| [Tuple](./tuple) | 元组是 XBRL 元组元素的替代组中的一个元素。元组用于将复合事实的各部分绑定在一起。这些组成部分本身也是事实，但必须相互关联地进行解释。例如，公司的董事的姓名、年龄和薪酬需要组合在一起才能正确理解。 |
| [Unit](./unit) | 此类用于指定对 Numeric Item 进行计量的单位。 |
| [XbrlDocument](./xbrldocument) | 包含一个或多个 XBRL 实例的 XBRL 文档。 |
| [XbrlException](./xbrlexception) | 当出现 Aspose.Finance.Xbrl 指定的错误时抛出的异常。 |
| [XbrlInstance](./xbrlinstance) | XBRL 实例是具有 xbrl 标记根元素的 XML 片段。XBRL 实例包含业务报告事实，每个事实对应于在其支持的 DTS 中定义的 [`Concept`](../aspose.finance.xbrl/concept)。XBRL 实例还包含提供解释实例中事实所需的附加信息的上下文和单位。 |
| [XbrlInstanceCollection](./xbrlinstancecollection) | XBRL 实例的集合。 |
| [Xlink](./xlink) | XBRL 中各种链接的抽象类，例如 simple link、extend link 等。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [ArcUse](./arcuse) | arc 用法枚举。 |
| [ContextPeriodType](./contextperiodtype) | [`ContextPeriod`](../aspose.finance.xbrl/contextperiod) 类型枚举。 |
| [ElementBalanceType](./elementbalancetype) | [`Concept`](../aspose.finance.xbrl/concept) 余额类型枚举。 |
| [ElementPeriodType](./elementperiodtype) | [`Concept`](../aspose.finance.xbrl/concept) 期间类型枚举。 |
| [ElementSubstitutionGroup](./elementsubstitutiongroup) | [`Concept`](../aspose.finance.xbrl/concept) 替代类型枚举。 |
| [ReferenceRole](./referencerole) | 引用角色枚举。 |
| [SaveFormat](./saveformat) |  |
| [UnitType](./unittype) | 单位类型枚举。 |
| [XbrlExceptionType](./xbrlexceptiontype) | 表示自定义异常类型代码。 |
| [XlinkType](./xlinktype) | Xlink 类型枚举。 |

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
