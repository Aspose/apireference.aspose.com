---
title: "System::Drawing::CopyPixelOperation énum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::CopyPixelOperation enum. Spécifie comment la couleur source dans une opération de copie de pixel est combinée avec la couleur de destination pour obtenir une couleur finale en C++."
type: docs
weight: 3000
url: /fr/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Spécifie comment la couleur source dans une opération de copie de pixel est combinée avec la couleur de destination pour obtenir une couleur finale.

```cpp
enum class CopyPixelOperation
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Le bitmap n'est pas reflété. |
| Blackness | 66 | La région de destination est remplie en utilisant la couleur d'index 0 dans la palette physique. |
| NotSourceErase | 1114278 | Les couleurs source et destination sont combinées par OR et la couleur résultante est ensuite inversée. |
| NotSourceCopy | 3342344 | La région source est inversée puis copiée vers la destination. |
| SourceErase | 4457256 | Les couleurs inversées de la région de destination sont ANDed avec les couleurs de la région source. |
| DestinationInvert | 5570569 | La région de destination est inversée. |
| PatInvert | 5898313 | Les couleurs du pinceau actuellement sélectionné dans le contexte de périphérique de destination sont XORed avec les couleurs de la destination. |
| SourceInvert | 6684742 | Les couleurs des régions source et destination sont XORed. |
| SourceAnd | 8913094 | Les couleurs des régions source et destination sont ANDed. |
| MergePaint | 12255782 | Les couleurs de la région source inversée sont ORed avec les couleurs de la région de destination. |
| MergeCopy | 12583114 | Les couleurs de la région source sont ANDed avec les couleurs du pinceau sélectionné du contexte de périphérique de destination. |
| SourceCopy | 13369376 | La région source est copiée directement dans la région de destination. |
| SourcePaint | 15597702 | Les couleurs des régions source et destination sont ORed. |
| PatCopy | 15728673 | Le pinceau actuellement sélectionné dans le contexte de périphérique de destination est copié vers le bitmap de destination. |
| PatPaint | 16452105 | Les couleurs du pinceau actuellement sélectionné dans le contexte de périphérique de destination sont combinées par OU avec les couleurs de la région source inversée. Le résultat de cette opération est combiné par OU avec les couleurs de la région de destination. |
| Blancheur | 16711778 | La région de destination est remplie en utilisant la couleur d'index 1 dans la palette physique. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) qui sont superposés au-dessus de la fenêtre de l'application sont inclus dans l'image résultante. |

## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
