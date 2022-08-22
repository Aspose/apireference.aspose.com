---
title: Scene
second_title: Aspose.3D för .NET API-referens
description: En scen är ett objekt på toppnivå som innehåller noder geometrier material texturer animationer poser underscener och etc. Scen kan ha underscener fungerar som stöd för flera dokument i filer som collada/blender /fbx Nodhierarki kan nås viaRootNode./scene/rootnodeLibrary./scene/library används för att hålla en referens för obundna objekt under serialisering som metadata eller anpassade objekt så att det kan användas som ett bibliotek.
type: docs
weight: 2250
url: /sv/net/aspose.threed/scene/
---
## Scene class

En scen är ett objekt på toppnivå som innehåller noder, geometrier, material, texturer, animationer, poser, underscener och etc. Scen kan ha underscener, fungerar som stöd för flera dokument i filer som collada/blender /fbx Nodhierarki kan nås via[`RootNode`](./rootnode)[`Library`](./library) används för att hålla en referens för obundna objekt under serialisering (som metadata eller anpassade objekt) så att det kan användas som ett bibliotek.

```csharp
public class Scene : SceneObject
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Scene](scene#constructor)() | Initierar en ny instans av[`Scene`](../scene) class. |
| [Scene](scene#constructor_1)(Entity) | Initierar en ny instans av[`Scene`](../scene) klass med en enhet kopplad till en ny nod. |
| [Scene](scene#constructor_2)(Scene, string) | Initierar en ny instans av[`Scene`](../scene)klass som en underscen. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Får alla[`AnimationClip`](../../aspose.threed.animation/animationclip) definieras i scenen. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Hämtar eller ställer in tillgångsinformationen på toppnivå |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Hämtar eller ställer in den aktiva[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Objekt som inte används direkt i scenhierarkin kan definieras i Library. Detta är användbart när du använder underscener och lägger återanvändbara komponenter under underscener. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Får alla[`Pose`](../pose) används i den här scenen. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Hämtar scenens rotnod. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Hämtar scenen som detta objekt tillhör |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Hämtar alla underscener |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Öppnar scenen från given path |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Öppnar scenen från given path |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Öppnar scenen från given sökväg med angivet filformat. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Öppnar scenen från given sökväg med angivet filformat. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Öppnar scenen från given stream |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Öppnar scenen från en given ström med angivet filformat. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Öppnar scenen från en given ström med hjälp av specificerad IO config. |
| [Clear](../../aspose.threed/scene/clear)() | Rensar sceninnehållet och återställer standardinställningarna. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | En förkortningsfunktion för att skapa och registrera[`AnimationClip`](../../aspose.threed.animation/animationclip) Den första[`AnimationClip`](../../aspose.threed.animation/animationclip) kommer att tilldelas[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Får ett namn[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Öppnar scenen från given stream |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Öppnar scenen från given path |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Öppnar scenen från given stream |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Öppnar scenen från given path |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Öppnar scenen från given sökväg med angivet filformat. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Öppnar scenen från en given ström med angivet filformat. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Öppnar scenen från en given ström med hjälp av specificerad IO config. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Öppnar scenen från given sökväg med angivet filformat. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Öppnar scenen från given sökväg med angivet filformat. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Rendera scenen till bitmapp från ett givet kamerans perspektiv. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Rendera scenen till en extern fil från ett givet kamerans perspektiv. Standardutdatastorleken är 1024x768 och utdataformatet är png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Rendera scenen till bitmapp från ett givet kamerans perspektiv. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Gör scenen till en extern fil ur ett givet kamerans perspektiv. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Gör scenen till en extern fil ur ett givet kamerans perspektiv. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Sparar scenen till angiven sökväg med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Sparar scenen för att streama med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Sparar scenen för att streama med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Sparar scenen till angiven sökväg med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Sparar scenen till angiven sökväg med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Sparar scenen för att streama med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Sparar scenen för att streama med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Sparar scenen till angiven sökväg med angivet filformat. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Sparar scenen till angiven sökväg med angivet filformat. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |

### Se även

* class [SceneObject](../sceneobject)
* namnutrymme [Aspose.ThreeD](../../aspose.threed)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
