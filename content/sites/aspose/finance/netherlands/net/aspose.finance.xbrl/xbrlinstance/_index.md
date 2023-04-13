---
title: Class XbrlInstance
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.XbrlInstance klas. XBRLinstantie is een XMLfragment met rootelement met een xbrltag. XBRLinstantie bevat feiten uit bedrijfsrapporten waarbij elk feit overeenkomt met eenConcept gedefinieerd in hun ondersteunende DTS. XBRLinstantie bevat ook contexten en eenheden die aanvullende informatie bieden die nodig is om de feiten in de instantie te interpreteren.
type: docs
weight: 8250
url: /nl/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

XBRL-instantie is een XML-fragment met root-element met een xbrl-tag. XBRL-instantie bevat feiten uit bedrijfsrapporten, waarbij elk feit overeenkomt met een[`Concept`](../concept/) gedefinieerd in hun ondersteunende DTS. XBRL-instantie bevat ook contexten en eenheden die aanvullende informatie bieden die nodig is om de feiten in de instantie te interpreteren.

```csharp
public class XbrlInstance
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | Haalt of stelt de collectie van[`ArcroleReference`](../arcrolereference/) objecten in de XBRL-instantie. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | Haalt of stelt de collectie van[`Context`](../context/) objecten in de XBRL-instantie. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | Haalt de verzameling op van[`Fact`](../fact/) objecten in de XBRL-instantie. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | Haalt of stelt de collectie van[`FootnoteLink`](../footnotelink/) objecten in de XBRL-instantie. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | Haalt de verzameling op van[`Item`](../item/) objecten in de XBRL-instantie. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | Krijgt de[`LinkbaseRefCollection`](./linkbaserefcollection/) in de`XbrlInstance` . |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | Haalt of stelt de collectie van[`RoleReference`](../rolereference/) objecten in de XBRL-instantie. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | Haalt of stelt de schemalocatie in |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | Haalt de SchemaRef-verzameling op. |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | Haalt of stelt de collectie van[`Unit`](../unit/) objecten in de XBRL-instantie. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | Haalt de verzameling validatiefout op. |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | Verkrijg de[`XbrlDocument`](./xbrldocument/) die deze instantie bevat. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | Maak een nieuw element aan. |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | Haal alle linkbase-referentiecollecties op in xbrl-instantie en schemareferenties. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | Haalt het ArcroleType op met de opgegeven uri. |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | Krijgt het concept met de opgegeven id. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | Krijgt het concept van de locator. |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | Krijgt het concept met de opgegeven naam. |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | Haalt het concept op met de opgegeven uri en naam. |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | Haalt de context op met de opgegeven id. |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | Haalt de presentatielinks op in de xbrl-instantie. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | Haalt het RoleType op met de opgegeven uri. |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | Haalt de eenheid op met de opgegeven id. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | Controleert of deze XBRL-instantie geldig is. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | Valideert deze XBRL-instantie. |

### Zie ook

* naamruimte [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* montage [Aspose.Finance](../../)


