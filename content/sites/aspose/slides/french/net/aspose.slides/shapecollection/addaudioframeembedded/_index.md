---
title: AddAudioFrameEmbedded
second_title: Référence de l'API Aspose.Slides pour .NET
description: Ajoute une nouvelle image audio avec un fichier audio intégré à la fin dune collection. Le fichier audio intégré ne peut être quun WAV. Il ajoute un nouvel audio dans la liste Presentation.Audios.
type: docs
weight: 70
url: /fr/net/aspose.slides/shapecollection/addaudioframeembedded/
---
## AddAudioFrameEmbedded(float, float, float, float, Stream) {#addaudioframeembedded_1}

Ajoute une nouvelle image audio avec un fichier audio intégré à la fin d'une collection. Le fichier audio intégré ne peut être qu'un WAV. Il ajoute un nouvel audio dans la liste Presentation.Audios.

```csharp
public IAudioFrame AddAudioFrameEmbedded(float x, float y, float width, float height, 
    Stream audio_stream)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| x | Single | Coordonnée X d'une nouvelle image audio. |
| y | Single | Coordonnée Y d'une nouvelle trame audio. |
| width | Single | Largeur d'une nouvelle trame audio. |
| height | Single | Hauteur d'une nouvelle trame audio. |
| audio_stream | Stream | Flux d'entrée avec des données audio. |

### Return_Value

Objet AudioFrame créé.

### Voir également

* interface [IAudioFrame](../../iaudioframe)
* class [ShapeCollection](../../shapecollection)
* espace de noms [Aspose.Slides](../../shapecollection)
* Assemblée [Aspose.Slides](../../../)

---

## AddAudioFrameEmbedded(float, float, float, float, IAudio) {#addaudioframeembedded}

Ajoute une nouvelle image audio avec un fichier audio intégré à la fin d'une collection. Il utilise un fichier audio de la liste Presentation.Audios.

```csharp
public IAudioFrame AddAudioFrameEmbedded(float x, float y, float width, float height, IAudio audio)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| x | Single | Coordonnée X d'une nouvelle image audio. |
| y | Single | Coordonnée Y d'une nouvelle trame audio. |
| width | Single | Largeur d'une nouvelle trame audio. |
| height | Single | Hauteur d'une nouvelle trame audio. |
| audio | IAudio | Audio de la liste Presentation.Audios. |

### Return_Value

Objet AudioFrame créé.

### Voir également

* interface [IAudioFrame](../../iaudioframe)
* interface [IAudio](../../iaudio)
* class [ShapeCollection](../../shapecollection)
* espace de noms [Aspose.Slides](../../shapecollection)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
