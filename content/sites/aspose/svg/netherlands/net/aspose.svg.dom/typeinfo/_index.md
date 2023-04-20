---
title: Class TypeInfo
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.TypeInfo klas. De TypeInfo vertegenwoordigt een type waarnaar wordt verwezen vanuit Element of Attrknooppunten gespecificeerd in de schemas die aan het document zijn gekoppeld.
type: docs
weight: 1280
url: /nl/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

De TypeInfo vertegenwoordigt een type waarnaar wordt verwezen vanuit Element- of Attr-knooppunten, gespecificeerd in de schema's die aan het document zijn gekoppeld.

```csharp
public class TypeInfo : DOMObject
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | De naam van een type dat is gedeclareerd voor het bijbehorende element of attribuut, of null indien onbekend. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | Haalt het type naamruimte op. De naamruimte van het type dat is gedeclareerd voor het bijbehorende element of attribuut of null als het element geen declaratie heeft of als er geen naamruimte-informatie beschikbaar is. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | Deze methode retourneert als er een afleiding is tussen de definitie van het referentietype, dwz de TypeInfo waarop de methode wordt aangeroepen, en de andere typedefinitie, dwz degene die is doorgegeven als parameters. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | Als het schema van het document een XML-schema is [XML-schema deel 1], vertegenwoordigt deze constante de afleiding door uitbreiding. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | Als het documentschema een XML-schema is [XML-schema deel 1], vertegenwoordigt deze constante de lijst. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | Als het documentschema een XML-schema is [XML-schema deel 1], vertegenwoordigt deze constante de afleiding door beperking als het om complexe typen gaat, of een beperking als het om eenvoudige typen gaat. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | Als het schema van het document een XML-schema is [XML-schema deel 1], vertegenwoordigt deze constante de eenheid als het om eenvoudige typen gaat. |

### Zie ook

* class [DOMObject](../domobject/)
* naamruimte [Aspose.Svg.Dom](../../aspose.svg.dom/)
* montage [Aspose.SVG](../../)


