---
title: Aspose.ThreeD
second_title: Aspose.3D för .NET API-referens
description: Basnamnområdet för Aspose.3D
type: docs
weight: 10
url: /sv/net/aspose.threed/
---
Basnamnområdet för Aspose.3D

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [A3DObject](./a3dobject) | Basklassen för alla Aspose.ThreeD-objekt, alla underklasser kommer att stödja dynamiska egenskaper. |
| [AssetInfo](./assetinfo) | Information om tillgång. Tillgångsinformation kan bifogas en[`Scene`](../aspose.threed/scene) . Barn[`Scene`](../aspose.threed/scene) kan ha sin egen[`AssetInfo`](../aspose.threed/assetinfo) för att åsidosätta förälders definition. |
| [BonePose](./bonepose) | Den[`BonePose`](../aspose.threed/bonepose) innehåller transformationsmatrisen för en bennod |
| [CustomObject](./customobject) | Metadata eller anpassade objekt som används i 3D-filer hanteras av denna klass. Alla anpassade egenskaper sparas som dynamiska egenskaper. |
| [Entity](./entity) | Basklassen för alla entiteter. Entitet representerar ett konkret objekt som fästs under en nod som t.ex.[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Undantag när Aspose.3D misslyckades med att exportera scenen till file |
| [FileFormat](./fileformat) | Filformat definition |
| [FileFormatType](./fileformattype) | Filformattyp |
| [GlobalTransform](./globaltransform) | Global transformation liknar[`Transform`](../aspose.threed/transform) men det är oföränderligt medan det representerar den slutliga utvärderade transformationen. Höger koordinatsystem används vid utvärdering av global transform |
| [ImageRenderOptions](./imagerenderoptions) | Alternativ för[`Render`](../aspose.threed/scene/render) och[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Undantag när Aspose.3D inte kunde öppna den angivna source |
| [License](./license) | Tillhandahåller metoder för att licensiera komponenten. |
| [Metered](./metered) | Tillhandahåller metoder för att ställa in mätnyckel. |
| [Node](./node) | Representerar ett element i scengrafen. En scengraf är ett träd med nodobjekt. Trädhanteringstjänsterna är fristående i denna klass. Observera att Aspose.3D SDK inte testar giltigheten av den konstruerade scengrafen. Det är anroparens ansvar att se till att den inte genererar cykliska grafer i en nodhierarki. Förutom trädhanteringen definierar denna klass alla egenskaper som krävs för att beskriva objektets position i scenen. Denna information inkluderar de grundläggande translations-, rotations- och skalningsegenskaperna och de mer avancerade alternativen för pivoter, limits och IK-skarvar, såsom styvhet och dämpning. När det skapas första gången är Node-objektet "tomt" (dvs: det är ett objekt utan någon grafisk representation som endast innehåller positionsinformationen). I detta tillstånd kan det användas för att representera föräldrar i nodträdstrukturen men inte mycket mer. Den normala användningen av denna typ av objekt är att lägga till dem en entitet som kommer att specialisera noden (se "Entiteten"). Entiteten är ett objekt i sig och är kopplat till noden. Detta innebär också att samma enhet kan delas mellan flera noder. Camera, Light, Mesh, etc... är alla entiteter och alla härledda från basklassen Entity. |
| [NodeVisitor](./nodevisitor) | En återuppringning för att resa genom hela nodhierarkin. |
| [Pose](./pose) | Posen används för att lagra transformationsmatris när geometrin är skalad. Posen är en uppsättning av[`BonePose`](../aspose.threed/bonepose) , varje[`BonePose`](../aspose.threed/bonepose) sparar den konkreta transformationsinformationen för bennoden. |
| [Property](./property) | Klass som innehåller användardefinierade egenskaper. |
| [PropertyCollection](./propertycollection) | Samlingen av egenskaper |
| [Scene](./scene) | En scen är ett objekt på toppnivå som innehåller noder, geometrier, material, texturer, animationer, poser, underscener och etc. Scen kan ha underscener, fungerar som stöd för flera dokument i filer som collada/blender /fbx Nodhierarki kan nås via[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) används för att hålla en referens för obundna objekt under serialisering (som metadata eller anpassade objekt) så att det kan användas som ett bibliotek. |
| [SceneObject](./sceneobject) | Rotklassen av objekt som kommer att lagras i en scen. |
| [Transform](./transform) | En transformation innehåller information som tillåter åtkomst till objektets translate/scale/rotation eller transformationsmatris till lägsta kostnad Detta används av lokal transform. |
| [TrialException](./trialexception) | Detta höjs i Scene.Open/Scene.Spara när inga licenser tillämpas. Du kan stänga av detta undantag genom att ställa in SuppressTrialException till true. |
## Gränssnitt

| Gränssnitt | Beskrivning |
| --- | --- |
| [INamedObject](./inamedobject) | Objekt som har namnet |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [Axis](./axis) | Koordinataxeln. |
| [CoordinatedSystem](./coordinatedsystem) | Det vänster- eller högerhänta koordinatsystemet. |
| [FileContentType](./filecontenttype) | Filinnehållstyp |
| [PoseType](./posetype) | Posetyp. |
| [PropertyFlags](./propertyflags) | Fastighetens flaggor |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
