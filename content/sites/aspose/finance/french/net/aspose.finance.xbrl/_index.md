---
title: Aspose.Finance.Xbrl
second_title: Référence de l'API Aspose.Finance pour .NET
description: 
type: docs
weight: 210
url: /fr/net/aspose.finance.xbrl/
---


## Des classes

| Classer | La description |
| --- | --- |
| [Arc](./arc) | La classe abstraite de base de Xlink avec le type Arc. |
| [ArcroleReference](./arcrolereference) | Cette classe est utilisée pour résoudre les valeurs d'arcrole personnalisées qui sont utilisées dans une Linkbase ou une instance XBRL. |
| [ArcroleType](./arcroletype) | Cette classe est utilisée pour définir le type de rôle d'arc personnalisé. |
| [CalculationArc](./calculationarc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink)avec le type d'arc. Il définit la relation entre les concepts à des fins de calcul. |
| [CalculationLink](./calculationlink) | Cette classe décrit les relations de calcul entre les concepts dans les taxonomies. |
| [CalculationLinkbaseRef](./calculationlinkbaseref) | Cette classe est utilisée pour calculer la référence de base de liens. |
| [Concept](./concept) | Les concepts sont définis de deux manières équivalentes. Dans un sens syntaxique, un concept est une définition d'élément de schéma XML, définissant l'élément comme étant dans le groupe de substitution d'élément d'élément ou dans le groupe de substitution d'élément de tuple. Au niveau sémantique, un concept est une définition d'un type de fait qui peut être rapporté sur les activités ou la nature d'une activité commerciale. |
| [Context](./context) | Cette classe contient l'entité, la période et le scénario qui donnent collectivement le contexte approprié pour comprendre les valeurs des éléments. |
| [ContextEntity](./contextentity) | L'entité du[`Context`](../aspose.finance.xbrl/context) . |
| [ContextPeriod](./contextperiod) | La période du[`Context`](../aspose.finance.xbrl/context) . |
| [ContextSenario](./contextsenario) | Le scénario du[`Context`](../aspose.finance.xbrl/context) . |
| [DefinitionArc](./definitionarc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) de type Arc. Il définit différents types de relations entre les Concepts. |
| [DefinitionLink](./definitionlink) | Cette classe est destinée à contenir une variété de relations diverses entre les concepts dans les taxonomies. |
| [DefinitionLinkbaseRef](./definitionlinkbaseref) | Cette classe est utilisée pour définir la référence de la base de liens. |
| [DimensionMember](./dimensionmember) | La classe représente le membre de dimension. Il est défini dans https://www.xbrl.org/specification/dimensions/rec-2012-01-25/dimensions-rec-2006-09-18+corrected-errata-2012-01-25-clean.html. |
| [Fact](./fact) | Les faits peuvent être simples, auquel cas leurs valeurs doivent être exprimées sous forme de contenu simple, et les faits peuvent être composés, auquel cas leur valeur est constituée d'autres faits simples et/ou composés. Les faits simples sont exprimés en utilisant[`Item`](../aspose.finance.xbrl/item) . Les faits composés sont exprimés en utilisant[`Tuple`](../aspose.finance.xbrl/tuple) tuple. |
| [Footnote](./footnote) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type de ressource. C'est la seule ressource autorisée dans[`FootnoteLink`](../aspose.finance.xbrl/footnotelink) . |
| [FootnoteArc](./footnotearc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) de type Arc. Il est contenu dansFootnoteLink . |
| [FootnoteLink](./footnotelink) | Cette classe contient des localisateurs, des ressources et des arcs qui décrivent des relations irrégulières entre des faits dans une instance XBRL. |
| [Item](./item) | Un élément est un élément du groupe de substitution pour l'élément d'élément XBRL. Il contient la valeur du fait simple et une référence au contexte (et à l'unité pour les éléments numériques) nécessaires pour interpréter correctement ce fait. |
| [Label](./label) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type de ressource. Bien que chaque taxonomie définisse un ensemble unique d'éléments représentant un ensemble de concepts de reporting d'entreprise, la documentation XBRL lisible par l'homme pour ces concepts, y compris les étiquettes (chaînes utilisées comme noms lisibles par l'homme pour chaque concept) et d'autres informations explicatives documentation, est contenue dans un élément de ressource dans l'étiquette Linkbase. |
| [LabelArc](./labelarc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type d'arc. Il relie les concepts avec[`Label`](../aspose.finance.xbrl/label) ressources. |
| [LabelLink](./labellink) | Cette classe est destinée à contenir les relations entre les concepts et la documentation textuelle et les étiquettes de ces concepts. |
| [LabelLinkbaseRef](./labellinkbaseref) | Cette classe est utilisée pour étiqueter la référence de la base de liens. |
| [LinkbaseRef](./linkbaseref) | Cette classe est utilisée pour lier la référence de base. |
| [LinkbaseRefCollection](./linkbaserefcollection) | Collection de références de base de liens de schéma. |
| [Loc](./loc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type de localisateur. |
| [LocalCacheService](./localcacheservice) | Cette classe est un service de cache local pour les fichiers externes de schéma et de base de liens. |
| [Locator](./locator) | La classe abstraite de base de Xlink avec le type Locator. |
| [PresentationArc](./presentationarc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type Arc. Il définit comment les concepts sont liés les uns aux autres pour la présentation. |
| [PresentationLink](./presentationlink) | Cette classe est destinée à décrire les relations de présentation entre les concepts dans les taxonomies. |
| [PresentationLinkbaseRef](./presentationlinkbaseref) | Cette classe est utilisée pour la référence de la base de liens de présentation. |
| [QualifiedName](./qualifiedname) | Type de schéma XML "QName" tel que défini dans l'espace de noms http://www.w3.org/2001/XMLSchema. |
| [Reference](./reference) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) avec le type de ressource. , il permet aux taxonomies XBRL de fonder les définitions des concepts sur des déclarations faisant autorité dans la littérature commerciale, financière et comptable publiée. |
| [ReferenceArc](./referencearc) | Cette classe est une[`Xlink`](../aspose.finance.xbrl/xlink) de type Arc. Il relie les Concepts aux ressources de référence. |
| [ReferenceLink](./referencelink) | Cette classe est destinée à contenir les relations entre les concepts et les références aux déclarations faisant autorité dans la littérature commerciale, financière et comptable publiée qui donnent un sens aux concepts. |
| [ReferenceLinkbaseRef](./referencelinkbaseref) | Cette classe est utilisée pour référencer la référence de la base de liens. |
| [ReferencePart](./referencepart) | Le membre enfant de[`Reference`](../aspose.finance.xbrl/reference) . |
| [Resource](./resource) | La classe abstraite de base de Xlink avec le type de ressource. |
| [RoleReference](./rolereference) | Cette classe est utilisée dans l'instance XBRL pour référencer les définitions de toutes les valeurs d'attribut de rôle personnalisé utilisées dans les liens de note de bas de page dans l'instance XBRL. |
| [RoleType](./roletype) | Cette classe est utilisée pour définir le type de rôle personnalisé. |
| [SaveOptions](./saveoptions) | Représente les options de sauvegarde. |
| [SchemaRef](./schemaref) | Cette classe est une référence à un schéma de taxonomie qui fait partie du DTS prenant en charge l'instance XBRL. |
| [SchemaRefCollection](./schemarefcollection) | Collection de références de schéma. |
| [SecHtmlReportSaveOption](./sechtmlreportsaveoption) | Représente les options d'enregistrement du rapport html sec. |
| [SimpleLink](./simplelink) | Type simple Xlink. |
| [Tuple](./tuple) | Un tuple est un élément du groupe de substitution pour l'élément de tuple XBRL. Les tuples sont utilisés pour lier ensemble les parties d'un fait composé. Ces éléments constitutifs sont eux-mêmes des faits mais ils doivent être interprétés à la lumière les uns des autres. Par exemple, le nom, l'âge et la rémunération d'un dirigeant d'entreprise doivent être regroupés pour être correctement compris. |
| [Unit](./unit) | Cette classe est utilisée pour spécifier les unités dans lesquelles un élément numérique a été mesuré. |
| [XbrlDocument](./xbrldocument) | Un document XBRL qui contient une ou plusieurs instances XBRL. |
| [XbrlException](./xbrlexception) | L'exception qui est levée lorsque l'erreur spécifiée par Aspose.Finance.Xbrl se produit. |
| [XbrlInstance](./xbrlinstance) | L'instance XBRL est un fragment XML avec un élément racine ayant une balise xbrl. L'instance XBRL contient des faits de rapport d'activité, chaque fait correspondant à un[`Concept`](../aspose.finance.xbrl/concept) définis dans leur DTS de support. L'instance XBRL contient également des contextes et des unités qui fournissent des informations supplémentaires nécessaires pour interpréter les faits dans l'instance. |
| [XbrlInstanceCollection](./xbrlinstancecollection) | Collection d'instances XBRL. |
| [Xlink](./xlink) | Classe abstraite pour tous les types de liens en XBRL, tels que lien simple, lien étendu, etc. |
## Énumération

| Énumération | La description |
| --- | --- |
| [ArcUse](./arcuse) | L'arc utilise enum. |
| [ContextPeriodType](./contextperiodtype) | [`ContextPeriod`](../aspose.finance.xbrl/contextperiod) tapez enum. |
| [ElementBalanceType](./elementbalancetype) | [`Concept`](../aspose.finance.xbrl/concept) type de solde enum. |
| [ElementPeriodType](./elementperiodtype) | [`Concept`](../aspose.finance.xbrl/concept) type de période enum. |
| [ElementSubstitutionGroup](./elementsubstitutiongroup) | [`Concept`](../aspose.finance.xbrl/concept) substitution type enum. |
| [ReferenceRole](./referencerole) | Rôle de référence enum. |
| [SaveFormat](./saveformat) |  |
| [UnitType](./unittype) | Le type d'unité enum. |
| [XbrlExceptionType](./xbrlexceptiontype) | Représente le code de type d'exception personnalisé. |
| [XlinkType](./xlinktype) | Énumération de type Xlink. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
