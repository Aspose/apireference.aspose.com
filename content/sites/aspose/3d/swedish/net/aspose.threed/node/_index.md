---
title: Node
second_title: Aspose.3D för .NET API-referens
description: Representerar ett element i scengrafen. En scengraf är ett träd med nodobjekt. Trädhanteringstjänsterna är fristående i denna klass. Observera att Aspose.3D SDK inte testar giltigheten av den konstruerade scengrafen. Det är anroparens ansvar att se till att den inte genererar cykliska grafer i en nodhierarki. Förutom trädhanteringen definierar denna klass alla egenskaper som krävs för att beskriva objektets position i scenen. Denna information inkluderar de grundläggande translations rotations och skalningsegenskaperna och de mer avancerade alternativen för pivoter limits och IKskarvar såsom styvhet och dämpning. När det skapas första gången är Nodeobjektet tomt dvs det är ett objekt utan någon grafisk representation som endast innehåller positionsinformationen. I detta tillstånd kan det användas för att representera föräldrar i nodträdstrukturen men inte mycket mer. Den normala användningen av denna typ av objekt är att lägga till dem en entitet som kommer att specialisera noden se Entiteten. Entiteten är ett objekt i sig och är kopplat till noden. Detta innebär också att samma enhet kan delas mellan flera noder. Camera Light Mesh etc... är alla entiteter och alla härledda från basklassen Entity.
type: docs
weight: 1470
url: /sv/net/aspose.threed/node/
---
## Node class

Representerar ett element i scengrafen. En scengraf är ett träd med nodobjekt. Trädhanteringstjänsterna är fristående i denna klass. Observera att Aspose.3D SDK inte testar giltigheten av den konstruerade scengrafen. Det är anroparens ansvar att se till att den inte genererar cykliska grafer i en nodhierarki. Förutom trädhanteringen definierar denna klass alla egenskaper som krävs för att beskriva objektets position i scenen. Denna information inkluderar de grundläggande translations-, rotations- och skalningsegenskaperna och de mer avancerade alternativen för pivoter, limits och IK-skarvar, såsom styvhet och dämpning. När det skapas första gången är Node-objektet "tomt" (dvs: det är ett objekt utan någon grafisk representation som endast innehåller positionsinformationen). I detta tillstånd kan det användas för att representera föräldrar i nodträdstrukturen men inte mycket mer. Den normala användningen av denna typ av objekt är att lägga till dem en entitet som kommer att specialisera noden (se "Entiteten"). Entiteten är ett objekt i sig och är kopplat till noden. Detta innebär också att samma enhet kan delas mellan flera noder. Camera, Light, Mesh, etc... är alla entiteter och alla härledda från basklassen Entity.

```csharp
public class Node : SceneObject
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Node](node#constructor)() | Initierar en ny instans av[`Node`](../node) class. |
| [Node](node#constructor_1)(string) | Initierar en ny instans av[`Node`](../node) class. |
| [Node](node#constructor_2)(string, Entity) | Initierar en ny instans av[`Node`](../node) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Per-nod tillgång info |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Får barnnoderna. |
| [Entities](../../aspose.threed/node/entities) { get; } | Hämtar alla nod-entiteter. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Hämtar eller ställer in den första entiteten som är kopplad till denna nod, om den ställs in, raderar andra entiteter. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Hämtar eller ställer in om den här noden och alla underordnade noder/entiteter ska uteslutas under export. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Får den globala transformationen. |
| [Material](../../aspose.threed/node/material) { get; set; } | Hämtar eller ställer in det första materialet som är associerat med denna nod, om det ställs in, rensar det andra material |
| [Materials](../../aspose.threed/node/materials) { get; } | Hämtar materialet som är associerat med denna nod. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Hämtar metadata som definieras i denna nod. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Hämtar eller ställer in den överordnade noden. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [Transform](../../aspose.threed/node/transform) { get; } | Hämtar den lokala transformationen. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Hämtar eller ställer in för att visa noden |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Går igenom alla efterkommande noder (inklusive den nuvarande noden) och ringer besökaren med noden. Besökare kan bryta genomgången genom att returnera false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Lägg till en underordnad nod till denna node |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Lägg till en entitet till noden. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Skapar en underordnad nod |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Skapa en ny underordnad nod med given entitet ansluten |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Skapa en ny underordnad nod med givet nodnamn |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Skapa en ny underordnad nod med givet nodnamn |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Skapa en ny underordnad nod med givet nodnamn och bifoga specificerad entitet och en material |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Utvärdera den globala transformationen, inkludera den geometriska transformationen eller inte. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Beräkna begränsningsrutan för noden |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Hämtar den underordnade noden vid specificerat index. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Hämtar den underordnade noden med det angivna namnet |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [Merge](../../aspose.threed/node/merge)(Node) | Lossa allt under noden och fäst dem till nuvarande nod. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Välj flera objekt under aktuell nod med hjälp av XPath-liknande frågesyntax. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Välj ett objekt under aktuell nod med hjälp av XPath-liknande frågesyntax. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |
| override [ToString](../../aspose.threed/node/tostring)() | Hämtar strängrepresentationen av denna nod. |

### Se även

* class [SceneObject](../sceneobject)
* namnutrymme [Aspose.ThreeD](../../aspose.threed)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
