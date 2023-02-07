---
title: Node
second_title: Aspose.3D voor .NET API-referentie
description: Vertegenwoordigt een element in de scènegrafiek. Een scènegrafiek is een boomstructuur van Nodeobjecten. De boombeheerservices zijn op zichzelf staand in deze klasse. Merk op dat de Aspose.3D SDK de validiteit van de geconstrueerde scènegrafiek niet test. Het is de verantwoordelijkheid van de aanroeper om ervoor te zorgen dat er geen cyclische grafieken in een knooppunthiërarchie worden gegenereerd. Naast het boombeheer definieert deze klasse alle eigenschappen die nodig zijn om de positie van het object in de scène te beschrijven. Deze informatie omvat de basiseigenschappen van Translatie Rotatie en Schalen en de meer geavanceerde opties voor draaipunten limieten en IKverbindingen zoals stijfheid en demping. Wanneer het voor het eerst wordt gemaakt is het Nodeobject leeg een object zonder enige grafische weergave dat alleen de positieinformatie bevat. In deze staat kan het worden gebruikt om ouders weer te geven in de knooppuntboomstructuur maar niet veel meer. Het normale gebruik van dit type objecten is om ze een entiteit toe te voegen die het knooppunt zal specialiseren zie de Entiteit. De entiteit is een object op zichzelf en is verbonden met het knooppunt. Dit betekent ook dat dezelfde entiteit kan worden gedeeld door meerdere knooppunten. Camera Light Mesh enz... zijn allemaal entiteiten en ze zijn allemaal afgeleid van de basisklasse Entity.
type: docs
weight: 1470
url: /nl/net/aspose.threed/node/
---
## Node class

Vertegenwoordigt een element in de scènegrafiek. Een scènegrafiek is een boomstructuur van Node-objecten. De boombeheerservices zijn op zichzelf staand in deze klasse. Merk op dat de Aspose.3D SDK de validiteit van de geconstrueerde scènegrafiek niet test. Het is de verantwoordelijkheid van de aanroeper om ervoor te zorgen dat er geen cyclische grafieken in een knooppunthiërarchie worden gegenereerd. Naast het boombeheer definieert deze klasse alle eigenschappen die nodig zijn om de positie van het object in de scène te beschrijven. Deze informatie omvat de basiseigenschappen van Translatie, Rotatie en Schalen en de meer geavanceerde opties voor draaipunten, limieten en IK-verbindingen, zoals stijfheid en demping. Wanneer het voor het eerst wordt gemaakt, is het Node-object "leeg" een object zonder enige grafische weergave dat alleen de positie-informatie bevat). In deze staat kan het worden gebruikt om ouders weer te geven in de knooppuntboomstructuur, maar niet veel meer. Het normale gebruik van dit type objecten is om ze een entiteit toe te voegen die het knooppunt zal specialiseren (zie de "Entiteit"). De entiteit is een object op zichzelf en is verbonden met het knooppunt. Dit betekent ook dat dezelfde entiteit kan worden gedeeld door meerdere knooppunten. Camera, Light, Mesh, enz... zijn allemaal entiteiten en ze zijn allemaal afgeleid van de basisklasse Entity.

```csharp
public class Node : SceneObject
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Node](node/#constructor)() | Initialiseert een nieuw exemplaar van het`Node` klasse. |
| [Node](node/#constructor_1)(string) | Initialiseert een nieuw exemplaar van het`Node` klasse. |
| [Node](node/#constructor_2)(string, Entity) | Initialiseert een nieuw exemplaar van het`Node` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo/) { get; set; } | Activa-info per knooppunt |
| [ChildNodes](../../aspose.threed/node/childnodes/) { get; } | Haalt de onderliggende knooppunten op. |
| [Entities](../../aspose.threed/node/entities/) { get; } | Haalt alle knooppuntentiteiten op. |
| [Entity](../../aspose.threed/node/entity/) { get; set; } | Haalt of stelt de eerste entiteit in die aan dit knooppunt is gekoppeld, indien ingesteld, worden andere entiteiten gewist. |
| [Excluded](../../aspose.threed/node/excluded/) { get; set; } | Haalt op of stelt in of dit knooppunt en alle onderliggende knooppunten/entiteiten tijdens het exporteren moeten worden uitgesloten. |
| [GlobalTransform](../../aspose.threed/node/globaltransform/) { get; } | Krijgt de globale transformatie. |
| [Material](../../aspose.threed/node/material/) { get; set; } | Haalt of stelt het eerste materiaal in dat aan dit knooppunt is gekoppeld, als het wordt ingesteld, worden andere materialen gewist |
| [Materials](../../aspose.threed/node/materials/) { get; } | Haalt de materialen op die bij dit knooppunt horen. |
| [MetaDatas](../../aspose.threed/node/metadatas/) { get; } | Haalt de metagegevens op die in dit knooppunt zijn gedefinieerd. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [ParentNode](../../aspose.threed/node/parentnode/) { get; set; } | Haalt of stelt het bovenliggende knooppunt in. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [Transform](../../aspose.threed/node/transform/) { get; } | Haalt de lokale transformatie op. |
| [Visible](../../aspose.threed/node/visible/) { get; set; } | Krijgt of stelt in om het knooppunt te tonen |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Accept](../../aspose.threed/node/accept/)(NodeVisitor) | Loopt door alle onderliggende knooppunten (inclusief het huidige knooppunt) en roept de bezoeker op met het knooppunt. Bezoeker kan de doorloop doorbreken door false terug te geven |
| [AddChildNode](../../aspose.threed/node/addchildnode/)(Node) | Voeg een onderliggend knooppunt toe aan dit knooppunt |
| [AddEntity](../../aspose.threed/node/addentity/)(Entity) | Voeg een entiteit toe aan het knooppunt. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode)() | Creëert een onderliggend knooppunt |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_1)(Entity) | Maak een nieuw onderliggend knooppunt met de gegeven entiteit eraan vast |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_2)(string) | Maak een nieuwe onderliggende node met gegeven node name |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_3)(string, Entity) | Maak een nieuwe onderliggende node met gegeven node name |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_4)(string, Entity, Material) | Maak een nieuw onderliggend knooppunt met de gegeven knooppuntnaam en voeg een gespecificeerde entiteit en een materiaal toe |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform/)(bool) | Evalueer de globale transformatie, inclusief de geometrische transformatie of niet. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox/)() | Bereken het begrenzingsvak van het knooppunt |
| [GetChild](../../aspose.threed/node/getchild/#getchild)(int) | Haalt het onderliggende knooppunt op bij opgegeven index. |
| [GetChild](../../aspose.threed/node/getchild/#getchild_1)(string) | Haalt het onderliggende knooppunt op met de opgegeven naam |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity/)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [Merge](../../aspose.threed/node/merge/)(Node) | Koppel alles onder het knooppunt los en koppel het aan het huidige knooppunt. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [SelectObjects](../../aspose.threed/node/selectobjects/)(string) | Selecteer meerdere objecten onder het huidige knooppunt met behulp van XPath-achtige query-syntaxis. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject/)(string) | Selecteer een enkel object onder het huidige knooppunt met behulp van XPath-achtige query-syntaxis. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |
| override [ToString](../../aspose.threed/node/tostring/)() | Haalt de tekenreeksrepresentatie op van dit knooppunt. |

### Zie ook

* class [SceneObject](../sceneobject/)
* naamruimte [Aspose.ThreeD](../../aspose.threed/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
