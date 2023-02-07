---
title: Scene
second_title: Aspose.3D voor .NET API-referentie
description: Een scène is een object op het hoogste niveau dat de knooppunten geometrieën materialen texturen animatie poses subscènes en enz. bevat. Scène kan subscènes hebben fungeert als ondersteuning voor meerdere documenten in bestanden zoals collada/blender /fbx Knooppunthiërarchie is toegankelijk viaRootNode./scene/rootnode/Library./scene/library/ wordt gebruikt om een referentie van nietgekoppelde objecten tijdens serialisatie bij te houden zoals metagegevens of aangepaste objecten zodat het als een bibliotheek kan worden gebruikt.
type: docs
weight: 2250
url: /nl/net/aspose.threed/scene/
---
## Scene class

Een scène is een object op het hoogste niveau dat de knooppunten, geometrieën, materialen, texturen, animatie, poses, subscènes en enz. bevat. Scène kan subscènes hebben, fungeert als ondersteuning voor meerdere documenten in bestanden zoals collada/blender /fbx Knooppunthiërarchie is toegankelijk via[`RootNode`](./rootnode/)[`Library`](./library/) wordt gebruikt om een referentie van niet-gekoppelde objecten tijdens serialisatie bij te houden (zoals metagegevens of aangepaste objecten), zodat het als een bibliotheek kan worden gebruikt.

```csharp
public class Scene : SceneObject
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Scene](scene/#constructor)() | Initialiseert een nieuw exemplaar van het`Scene` klasse. |
| [Scene](scene/#constructor_1)(Entity) | Initialiseert een nieuw exemplaar van het`Scene` klasse met een entiteit gekoppeld aan een nieuw knooppunt. |
| [Scene](scene/#constructor_2)(Scene, string) | Initialiseert een nieuw exemplaar van het`Scene`klasse als subscène. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | Krijgt alles[`AnimationClip`](../../aspose.threed.animation/animationclip/) gedefinieerd in de scène. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | Haalt of stelt de activa-informatie op het hoogste niveau in |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | Haalt of stelt de actieve[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | Objecten die niet direct in de scènehiërarchie worden gebruikt, kunnen in de bibliotheek worden gedefinieerd. Dit is handig wanneer u subscènes gebruikt en herbruikbare componenten onder subscènes plaatst. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Krijgt of stelt de naam in. |
| [Poses](../../aspose.threed/scene/poses/) { get; } | Krijgt alles[`Pose`](../pose/) gebruikt in deze scène. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Haalt de verzameling van alle eigenschappen op. |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | Haalt het hoofdknooppunt van de scène op. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Krijgt de scène waartoe dit object behoort |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | Krijgt alle subscènes |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | Opent de scène van gegeven pad |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | Opent de scène van gegeven pad |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | Opent de scène vanaf het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | Opent de scène vanaf het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | Opent de scène van gegeven stream |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | Opent de scène van een bepaalde stream met behulp van de opgegeven bestandsindeling. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | Opent de scène van een bepaalde stream met behulp van opgegeven IO-configuratie. |
| [Clear](../../aspose.threed/scene/clear/)() | Wist de inhoud van de scène en herstelt de standaardinstellingen. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | Een verkorte functie om het[`AnimationClip`](../../aspose.threed.animation/animationclip/) De eerste[`AnimationClip`](../../aspose.threed.animation/animationclip/) zal worden toegewezen aan de[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Vindt de eigenschap. Het kan een dynamische eigenschap zijn (gemaakt door CreateDynamicProperty/SetProperty) of native eigenschap (geïdentificeerd door zijn naam) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | Krijgt een naam[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Haal de waarde op van gespecificeerde eigenschap |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | Opent de scène van gegeven stream |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | Opent de scène van gegeven pad |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | Opent de scène van gegeven stream |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | Opent de scène van gegeven pad |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | Opent de scène vanaf het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | Opent de scène van een bepaalde stream met behulp van de opgegeven bestandsindeling. |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | Opent de scène van een bepaalde stream met behulp van opgegeven IO-configuratie. |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | Opent de scène vanaf het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | Opent de scène vanaf het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Verwijdert een dynamische eigenschap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Verwijder de gespecificeerde eigenschap geïdentificeerd door name |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | Render de scène in bitmap vanuit het perspectief van de gegeven camera. |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | Render de scène in een extern bestand vanuit het perspectief van de gegeven camera. De standaard uitvoergrootte is 1024x768 en het uitvoerformaat is png |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | Render de scène in bitmap vanuit het perspectief van de gegeven camera. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | Render de scène in een extern bestand vanuit het perspectief van de gegeven camera. |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Render de scène in een extern bestand vanuit het perspectief van de gegeven camera. |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | Slaat de scène op naar het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | Slaat de scène op om te streamen met de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | Slaat de scène op om te streamen met de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | Slaat de scène op naar het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | Slaat de scène op naar het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | Slaat de scène op om te streamen met de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | Slaat de scène op om te streamen met de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | Slaat de scène op naar het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | Slaat de scène op naar het opgegeven pad met behulp van de opgegeven bestandsindeling. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Stelt de waarde in van gespecificeerde eigenschap |

### Zie ook

* class [SceneObject](../sceneobject/)
* naamruimte [Aspose.ThreeD](../../aspose.threed/)
* montage [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
