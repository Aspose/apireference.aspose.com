---
title: Aspose.Finance.Xbrl
second_title: Aspose.Finance for .NET API Reference
description: 
type: docs
weight: 210
url: /net/aspose.finance.xbrl/
---


## Classes

| Class | Description |
| --- | --- |
| abstract class [Arc](./arc) | The base abstract class of Xlink with Arc type. |
| class [ArcroleReference](./arcrolereference) | This class is used to resolve custom arcrole values that are used in a Linkbase or an XBRL Instance. |
| class [ArcroleType](./arcroletype) | This class is used to define custom arc role type. |
| class [CalculationArc](./calculationarc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It defines how Concepts relate to one another for calculation purposes. |
| class [CalculationLink](./calculationlink) | This class describes calculation relationships between Concepts in taxonomies. |
| class [CalculationLinkbaseRef](./calculationlinkbaseref) | This class is used to calculation linkbase reference. |
| class [Concept](./concept) | Concepts are defined in two equivalent ways. In a syntactic sense, a concept is an XML Schema element definition, defining the element to be in the item element substitution group or in the tuple element substitution group. At a semantic level, a concept is a definition of a kind of fact that can be reported about the activities or nature of a business activity. |
| class [Context](./context) | This class contains the entity, the period and the scenario that collectively give the appropriate context for understanding the values of items. |
| class [ContextEntity](./contextentity) | The entity of the [`Context`](aspose.finance.xbrl/context). |
| class [ContextPeriod](./contextperiod) | The peroid of the [`Context`](aspose.finance.xbrl/context). |
| class [ContextSenario](./contextsenario) | The senario of the [`Context`](aspose.finance.xbrl/context). |
| class [DefinitionArc](./definitionarc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It defines various kinds of relationships between Concepts. |
| class [DefinitionLink](./definitionlink) | This class is intended to contain a variety of miscellaneous relationships between Concepts in taxonomies. |
| class [DefinitionLinkbaseRef](./definitionlinkbaseref) | This class is used to definition linkbase reference. |
| class [DimensionMember](./dimensionmember) | The class represents dimension member. It is defined in https://www.xbrl.org/specification/dimensions/rec-2012-01-25/dimensions-rec-2006-09-18+corrected-errata-2012-01-25-clean.html. |
| abstract class [Fact](./fact) | Fact can be simple, in which case their values must be expressed as simple content, and facts can be compound, in which case their value is made up from other simple and/or compound fact. Simple fact are expressed using [`Item`](aspose.finance.xbrl/item). Compound facts are expressed using [`Tuple`](aspose.finance.xbrl/tuple)tuple. |
| class [Footnote](./footnote) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Resource type. It iss the only resource allowed in [`FootnoteLink`](aspose.finance.xbrl/footnotelink). |
| class [FootnoteArc](./footnotearc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It is contained in FootnoteLink. |
| class [FootnoteLink](./footnotelink) | This class contains Locators, resources and arcs that describe irregular relationships between facts in an XBRL Instance. |
| class [Item](./item) | An item is an element in the substitution group for the XBRL item element. It contains the value of the simple fact and a reference to the context (and unit for numeric items) needed to correctly interpret that fact. |
| class [Label](./label) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Resource type. Although each taxonomy defines a single set of elements representing a set of business reporting Concepts, the human-readable XBRL documentation for those concepts, including labels (strings used as human-readable names for each concept) and other explanatory documentation, is contained in a resource element in the label Linkbase. |
| class [LabelArc](./labelarc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It connects Concepts with [`Label`](aspose.finance.xbrl/label) resources. |
| class [LabelLink](./labellink) | This class is intended to contain relationships between Concepts and textual documentation and labels for those concepts. |
| class [LabelLinkbaseRef](./labellinkbaseref) | This class is used to label linkbase reference. |
| abstract class [LinkbaseRef](./linkbaseref) | This class is used to linkbase reference. |
| class [LinkbaseRefCollection](./linkbaserefcollection) | Collection of schema linkbase references. |
| class [Loc](./loc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Locator type. |
| static class [LocalCacheService](./localcacheservice) | This class is a local cache service for schema and linkbase external files. |
| abstract class [Locator](./locator) | The base abstract class of Xlink with Locator type. |
| class [PresentationArc](./presentationarc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It defines how Concepts relate to one another for presentation. |
| class [PresentationLink](./presentationlink) | This class is intended to describe presentational relationships between Concepts in taxonomies. |
| class [PresentationLinkbaseRef](./presentationlinkbaseref) | This class is used to presentation linkbase reference. |
| class [QualifiedName](./qualifiedname) | XML schema type "QName" as defined in the http://www.w3.org/2001/XMLSchema namespace. |
| class [Reference](./reference) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Resource type. it enables XBRL taxonomies to ground the definitions of Concepts in authoritative statements in published business, financial and accounting literature. |
| class [ReferenceArc](./referencearc) | This class is a [`Xlink`](aspose.finance.xbrl/xlink) with Arc type. It connects Concepts with reference resources. |
| class [ReferenceLink](./referencelink) | This class is intended to contain relationships between Concepts and references to authoritative statements in the published business, financial and accounting literature that give meaning to the concepts. |
| class [ReferenceLinkbaseRef](./referencelinkbaseref) | This class is used to reference linkbase reference. |
| class [ReferencePart](./referencepart) | The child member of [`Reference`](aspose.finance.xbrl/reference). |
| abstract class [Resource](./resource) | The base abstract class of Xlink with Resource type. |
| class [RoleReference](./rolereference) | This class is used in XBRL instance to reference the definitions of any custom role attribute values used in footnote links in the XBRL instance. |
| class [RoleType](./roletype) | This class is used to define custom role type. |
| class [SaveOptions](./saveoptions) | Represents save options. |
| class [SchemaRef](./schemaref) | This class is a reference to a Taxonomy Schema that becomes part of the DTS supporting the XBRL instance. |
| class [SchemaRefCollection](./schemarefcollection) | Collection of schema references. |
| abstract class [SimpleLink](./simplelink) | Simple type Xlink. |
| class [Tuple](./tuple) | A tuple is an element in the substitution group for the XBRL tuple element. Tuples are used to bind together the parts of a compound fact. Those constituent parts are themselves, facts but they must be interpreted in light of each-other. For example, the name, age and compensation of a director of a company need to be grouped together to be correctly understood. |
| class [Unit](./unit) | This class is used to specifies the units in which a Numeric Item has been measured. |
| class [XbrlDocument](./xbrldocument) | An XBRL document which contains one or more XBRL instance. |
| class [XbrlInstance](./xbrlinstance) | XBRL instance is XML fragment with root element having a xbrl tag. XBRL instance contains business report facts, with each fact corresponding to a [`Concept`](aspose.finance.xbrl/concept) defined in their supporting DTS. XBRL instance also contains contexts and units that provide additional information needed to interpret the facts in the instance. |
| class [XbrlInstanceCollection](./xbrlinstancecollection) | Collection of XBRL instances. |
| abstract class [Xlink](./xlink) | Abstract class for all kinds of links in XBRL, such as simple link, extend link and so on. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [ArcUse](./arcuse) | The arc use enum. |
| enum [ContextPeriodType](./contextperiodtype) | [`ContextPeriod`](aspose.finance.xbrl/contextperiod) type enum. |
| enum [ElementBalanceType](./elementbalancetype) | [`Concept`](aspose.finance.xbrl/concept) balance type enum. |
| enum [ElementPeriodType](./elementperiodtype) | [`Concept`](aspose.finance.xbrl/concept) period type enum. |
| enum [ElementSubstitutionGroup](./elementsubstitutiongroup) | [`Concept`](aspose.finance.xbrl/concept) substitution type enum. |
| enum [ReferenceRole](./referencerole) | Reference role enum. |
| enum [SaveFormat](./saveformat) |  |
| enum [UnitType](./unittype) | The unit type enum. |
| enum [XlinkType](./xlinktype) | Xlink type enum. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
