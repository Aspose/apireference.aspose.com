---
title: Aspose.Finance.Xbrl
second_title: Справочник по API Aspose.Finance для .NET
description: 
type: docs
weight: 210
url: /ru/net/aspose.finance.xbrl/
---


## Классы

| Учебный класс | Описание |
| --- | --- |
| [Arc](./arc) | Базовый абстрактный класс Xlink с типом Arc. |
| [ArcroleReference](./arcrolereference) | Этот класс используется для разрешения пользовательских значений дуги, которые используются в базе ссылок или экземпляре XBRL. |
| [ArcroleType](./arcroletype) | Этот класс используется для определения пользовательского типа роли дуги. |
| [CalculationArc](./calculationarc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink)с типом Дуги. Он определяет, как Концепции соотносятся друг с другом в целях расчета. |
| [CalculationLink](./calculationlink) | Этот класс описывает расчетные отношения между понятиями в таксономиях. |
| [CalculationLinkbaseRef](./calculationlinkbaseref) | Этот класс используется для расчета базы ссылок. |
| [Concept](./concept) | Понятия определяются двумя эквивалентными способами. В синтаксическом смысле понятие представляет собой определение элемента XML-схемы, определяющее, что элемент должен находиться в группе замещения элемента элемента или в группе замещения элемента кортежа. На семантическом уровне понятие представляет собой определение факта, который может быть сообщен о деятельности или характере деловой активности. |
| [Context](./context) | Этот класс содержит объект, период и сценарий, которые в совокупности дают соответствующий контекст для понимания значений элементов. |
| [ContextEntity](./contextentity) | Сущность[`Context`](../aspose.finance.xbrl/context) . |
| [ContextPeriod](./contextperiod) | Период действия[`Context`](../aspose.finance.xbrl/context) . |
| [ContextSenario](./contextsenario) | Сценарий[`Context`](../aspose.finance.xbrl/context) . |
| [DefinitionArc](./definitionarc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом дуги. Он определяет различные виды отношений между понятиями. |
| [DefinitionLink](./definitionlink) | Этот класс предназначен для хранения различных взаимосвязей между понятиями в таксономиях. |
| [DefinitionLinkbaseRef](./definitionlinkbaseref) | Этот класс используется для определения ссылки на базу ссылок. |
| [DimensionMember](./dimensionmember) | Класс представляет элемент измерения. Он определен в https://www.xbrl.org/specification/dimensions/rec-2012-01-25/dimensions-rec-2006-09-18+corrected-errata-2012-01-25-clean.html. |
| [Fact](./fact) | Факты могут быть простыми, и в этом случае их значения должны быть выражены как простое содержание, и факты могут быть составными, и в этом случае их значение состоит из других простых и/или составных фактов. Простые факты выражаются с помощью[`Item`](../aspose.finance.xbrl/item) . Составные факты выражаются с помощью[`Tuple`](../aspose.finance.xbrl/tuple) кортеж. |
| [Footnote](./footnote) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом ресурса. Это единственный ресурс, разрешенный в[`FootnoteLink`](../aspose.finance.xbrl/footnotelink) . |
| [FootnoteArc](./footnotearc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом Arc. Содержится вFootnoteLink . |
| [FootnoteLink](./footnotelink) | Этот класс содержит локаторы, ресурсы и дуги, описывающие нерегулярные отношения между фактами в отчете XBRL. |
| [Item](./item) | Элемент — это элемент в группе замещения для элемента элемента XBRL. Он содержит значение простого факта и ссылку на контекст (и единицу измерения для числовых элементов), необходимый для правильной интерпретации этого факта. |
| [Label](./label) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом ресурса. Хотя каждая таксономия определяет один набор элементов, представляющих набор концепций бизнес-отчетности, удобочитаемая документация XBRL для этих концепций, включая метки (строки, используемые в качестве удобочитаемых имен для каждой концепции) и другие пояснительные документации, содержится в элементе ресурса в метке Linkbase. |
| [LabelArc](./labelarc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом дуги. Он соединяет концепции с[`Label`](../aspose.finance.xbrl/label) ресурсы. |
| [LabelLink](./labellink) | Этот класс предназначен для содержания отношений между понятиями и текстовой документацией и метками для этих понятий. |
| [LabelLinkbaseRef](./labellinkbaseref) | Этот класс используется для обозначения ссылки на базу ссылок. |
| [LinkbaseRef](./linkbaseref) | Этот класс используется для ссылки на базу ссылок. |
| [LinkbaseRefCollection](./linkbaserefcollection) | Коллекция ссылок на схему базы ссылок. |
| [Loc](./loc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом локатора. |
| [LocalCacheService](./localcacheservice) | Этот класс представляет собой службу локального кэша для внешних файлов схемы и базы ссылок. |
| [Locator](./locator) | Базовый абстрактный класс Xlink с типом локатора. |
| [PresentationArc](./presentationarc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом Дуги. Он определяет, как Концепты соотносятся друг с другом для представления. |
| [PresentationLink](./presentationlink) | Этот класс предназначен для описания презентационных отношений между понятиями в таксономиях. |
| [PresentationLinkbaseRef](./presentationlinkbaseref) | Этот класс используется для ссылки на базу ссылок презентации. |
| [QualifiedName](./qualifiedname) | Тип схемы XML "QName", определенный в пространстве имен http://www.w3.org/2001/XMLSchema. |
| [Reference](./reference) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом ресурса. он позволяет таксономиям XBRL обосновывать определения концепций в авторитетных заявлениях в опубликованной деловой, финансовой и бухгалтерской литературе. |
| [ReferenceArc](./referencearc) | Этот класс является[`Xlink`](../aspose.finance.xbrl/xlink) с типом дуги. Он соединяет концепции со справочными ресурсами. |
| [ReferenceLink](./referencelink) | Этот класс предназначен для содержания взаимосвязей между понятиями и ссылками на авторитетные заявления в опубликованной деловой, финансовой и бухгалтерской литературе, которые придают значение понятиям. |
| [ReferenceLinkbaseRef](./referencelinkbaseref) | Этот класс используется для ссылки на базу ссылок. |
| [ReferencePart](./referencepart) | Дочерний элемент[`Reference`](../aspose.finance.xbrl/reference) . |
| [Resource](./resource) | Базовый абстрактный класс Xlink с типом ресурса. |
| [RoleReference](./rolereference) | Этот класс используется в отчете XBRL для ссылки на определения любых значений атрибутов пользовательских ролей, используемых в ссылках сносок в отчете XBRL. |
| [RoleType](./roletype) | Этот класс используется для определения пользовательского типа роли. |
| [SaveOptions](./saveoptions) | Представляет параметры сохранения. |
| [SchemaRef](./schemaref) | Этот класс является ссылкой на схему таксономии, которая становится частью DTS, поддерживающей экземпляр XBRL. |
| [SchemaRefCollection](./schemarefcollection) | Коллекция ссылок на схемы. |
| [SecHtmlReportSaveOption](./sechtmlreportsaveoption) | Представляет варианты сохранения отчета в формате sec html. |
| [SimpleLink](./simplelink) | Простой тип Xlink. |
| [Tuple](./tuple) | Кортеж — это элемент в группе замены для элемента кортежа XBRL. Кортежи используются для связывания частей составного факта. Эти составные части сами по себе являются фактами, но их следует интерпретировать в свете друг друга. Например, имя, возраст и компенсация директора компании должны быть сгруппированы вместе, чтобы их можно было правильно понять. |
| [Unit](./unit) | Этот класс используется для указания единиц измерения числового элемента. |
| [XbrlDocument](./xbrldocument) | Документ XBRL, содержащий один или несколько экземпляров XBRL. |
| [XbrlException](./xbrlexception) | Исключение, возникающее при возникновении указанной ошибки Aspose.Finance.Xbrl. |
| [XbrlInstance](./xbrlinstance) | Экземпляр XBRL представляет собой фрагмент XML с корневым элементом, имеющим тег xbrl. Отчет XBRL содержит факты бизнес-отчета, причем каждый факт соответствует[`Concept`](../aspose.finance.xbrl/concept) определены в поддерживающих их DTS. Отчет XBRL также содержит контексты и единицы, которые предоставляют дополнительную информацию, необходимую для интерпретации фактов в отчете. |
| [XbrlInstanceCollection](./xbrlinstancecollection) | Коллекция экземпляров XBRL. |
| [Xlink](./xlink) | Абстрактный класс для всех видов ссылок в XBRL, таких как простая ссылка, расширенная ссылка и т. д. |
## перечисление

| перечисление | Описание |
| --- | --- |
| [ArcUse](./arcuse) | Использование дуги enum. |
| [ContextPeriodType](./contextperiodtype) | [`ContextPeriod`](../aspose.finance.xbrl/contextperiod) введите enum. |
| [ElementBalanceType](./elementbalancetype) | [`Concept`](../aspose.finance.xbrl/concept) тип баланса enum. |
| [ElementPeriodType](./elementperiodtype) | [`Concept`](../aspose.finance.xbrl/concept) тип периода enum. |
| [ElementSubstitutionGroup](./elementsubstitutiongroup) | [`Concept`](../aspose.finance.xbrl/concept) тип подстановки enum. |
| [ReferenceRole](./referencerole) | Эталонная роль enum. |
| [SaveFormat](./saveformat) |  |
| [UnitType](./unittype) | Тип юнита enum. |
| [XbrlExceptionType](./xbrlexceptiontype) | Представляет код пользовательского типа исключения. |
| [XlinkType](./xlinktype) | Тип Xlink enum. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
