---
title: Aspose.ThreeD
second_title: Aspose.3D voor .NET API-referentie
description: De basisnaamruimte van Aspose.3D
type: docs
weight: 10
url: /nl/net/aspose.threed/
---
De basisnaamruimte van Aspose.3D

## Klassen

| Klas | Beschrijving |
| --- | --- |
| [A3DObject](./a3dobject/) | De basisklasse van alle Aspose.ThreeD-objecten, alle subklassen ondersteunen dynamische eigenschappen. |
| [AssetInfo](./assetinfo/) | Informatie over activa. Activa-informatie kan worden toegevoegd aan een[`Scene`](../aspose.threed/scene/) . Kind[`Scene`](../aspose.threed/scene/) kan zijn eigen hebben[`AssetInfo`](../aspose.threed/assetinfo/) om de definitie van de ouder te overschrijven. |
| [BonePose](./bonepose/) | De[`BonePose`](../aspose.threed/bonepose/) bevat de transformatiematrix voor een bot node |
| [CustomObject](./customobject/) | Metagegevens of aangepaste objecten die in 3D-bestanden worden gebruikt, worden beheerd door deze klasse. Alle aangepaste eigenschappen worden opgeslagen als dynamische eigenschappen. |
| [Entity](./entity/) | De basisklasse van alle entiteiten. Entiteit vertegenwoordigt een concreet object dat is gekoppeld onder een knooppunt zoals[`Light`](../aspose.threed.entities/light/)/[`Geometry`](../aspose.threed.entities/geometry/) . |
| [ExportException](./exportexception/) | Uitzonderingen wanneer Aspose.3D de scène niet kon exporteren naar bestand |
| [FileFormat](./fileformat/) | Bestandsformaatdefinitie |
| [FileFormatType](./fileformattype/) | Type bestandsindeling |
| [GlobalTransform](./globaltransform/) | Globale transformatie is vergelijkbaar met[`Transform`](../aspose.threed/transform/) maar het is onveranderlijk terwijl het de uiteindelijk geëvalueerde transformatie vertegenwoordigt. Rechter coördinatensysteem wordt gebruikt bij het evalueren van globale transformatie |
| [ImageRenderOptions](./imagerenderoptions/) | Opties voor[`Render`](../aspose.threed/scene/render/) En[`Render`](../aspose.threed/scene/render/) |
| [ImportException](./importexception/) | Uitzondering wanneer Aspose.3D de opgegeven bron niet kon openen |
| [License](./license/) | Biedt methoden om de component te licentiëren. |
| [Metered](./metered/) | Biedt methoden om gemeten sleutel in te stellen. |
| [Node](./node/) | Vertegenwoordigt een element in de scènegrafiek. Een scènegrafiek is een boomstructuur van Node-objecten. De boombeheerservices zijn op zichzelf staand in deze klasse. Merk op dat de Aspose.3D SDK de validiteit van de geconstrueerde scènegrafiek niet test. Het is de verantwoordelijkheid van de aanroeper om ervoor te zorgen dat er geen cyclische grafieken in een knooppunthiërarchie worden gegenereerd. Naast het boombeheer definieert deze klasse alle eigenschappen die nodig zijn om de positie van het object in de scène te beschrijven. Deze informatie omvat de basiseigenschappen van Translatie, Rotatie en Schalen en de meer geavanceerde opties voor draaipunten, limieten en IK-verbindingen, zoals stijfheid en demping. Wanneer het voor het eerst wordt gemaakt, is het Node-object "leeg" een object zonder enige grafische weergave dat alleen de positie-informatie bevat). In deze staat kan het worden gebruikt om ouders weer te geven in de knooppuntboomstructuur, maar niet veel meer. Het normale gebruik van dit type objecten is om ze een entiteit toe te voegen die het knooppunt zal specialiseren (zie de "Entiteit"). De entiteit is een object op zichzelf en is verbonden met het knooppunt. Dit betekent ook dat dezelfde entiteit kan worden gedeeld door meerdere knooppunten. Camera, Light, Mesh, enz... zijn allemaal entiteiten en ze zijn allemaal afgeleid van de basisklasse Entity. |
| [NodeVisitor](./nodevisitor/) | Een callback om door de hele knooppunthiërarchie te reizen. |
| [Pose](./pose/) | De pose wordt gebruikt om de transformatiematrix op te slaan wanneer de geometrie wordt gevild. De pose is een set van[`BonePose`](../aspose.threed/bonepose/) , elk[`BonePose`](../aspose.threed/bonepose/) slaat de concrete transformatie-informatie van het botknooppunt op. |
| [Property](./property/) | Klasse om door de gebruiker gedefinieerde eigenschappen te bevatten. |
| [PropertyCollection](./propertycollection/) | De verzameling eigenschappen |
| [Scene](./scene/) | Een scène is een object op het hoogste niveau dat de knooppunten, geometrieën, materialen, texturen, animatie, poses, subscènes en enz. bevat. Scène kan subscènes hebben, fungeert als ondersteuning voor meerdere documenten in bestanden zoals collada/blender /fbx Knooppunthiërarchie is toegankelijk via[`RootNode`](../aspose.threed/scene/rootnode/)[`Library`](../aspose.threed/scene/library/) wordt gebruikt om een referentie van niet-gekoppelde objecten tijdens serialisatie bij te houden (zoals metagegevens of aangepaste objecten), zodat het als een bibliotheek kan worden gebruikt. |
| [SceneObject](./sceneobject/) | De hoofdklasse van objecten die in een scène worden opgeslagen. |
| [Transform](./transform/) | Een transformatie bevat informatie die toegang geeft tot de matrix voor vertalen/schalen/roteren of transformeren van het object tegen minimale kosten Dit wordt gebruikt door lokale transformatie. |
| [TrialException](./trialexception/) | Dit wordt gegenereerd in Scene.Open/Scene.Save wanneer er geen licenties worden toegepast. U kunt deze uitzondering uitschakelen door SuppressTrialException in te stellen op true. |
## Interfaces

| Koppel | Beschrijving |
| --- | --- |
| [INamedObject](./inamedobject/) | Object met een naam |
## Opsomming

| Opsomming | Beschrijving |
| --- | --- |
| [Axis](./axis/) | De coördinaatas. |
| [CoordinatedSystem](./coordinatedsystem/) | Het linkshandige of rechtshandige coördinatensysteem. |
| [FileContentType](./filecontenttype/) | Type bestandsinhoud |
| [PoseType](./posetype/) | Posetype. |
| [PropertyFlags](./propertyflags/) | Eigendomsvlaggen |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
