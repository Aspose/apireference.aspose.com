---
title: HatchStyle
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Spécifie les différents modèles disponibles pourHatchBrush objets.
type: docs
weight: 300
url: /fr/net/system.drawing.drawing2d/hatchstyle/
---
## HatchStyle enumeration

Spécifie les différents modèles disponibles pourHatchBrush objets.

```csharp
public enum HatchStyle
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| Horizontal | `0` | Un motif de lignes horizontales. |
| Vertical | `1` | Un motif de lignes verticales. |
| ForwardDiagonal | `2` | Un motif de lignes sur une diagonale du coin supérieur gauche au coin inférieur droit. |
| BackwardDiagonal | `3` | Un motif de lignes sur une diagonale du coin supérieur droit au coin inférieur gauche. |
| Cross | `4` | Spécifie les lignes horizontales et verticales qui se croisent. |
| DiagonalCross | `5` | Un motif de lignes diagonales entrecroisées. |
| Percent05 | `6` | Spécifie une hachure à 5 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 5:100. |
| Percent10 | `7` | Spécifie une hachure de 10 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 10:100. |
| Percent20 | `8` | Spécifie une hachure de 20 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 20:100. |
| Percent25 | `9` | Spécifie une hachure à 25 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 25:100. |
| Percent30 | `10` | Spécifie une hachure à 30 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 30:100. |
| Percent40 | `11` | Spécifie une hachure à 40 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 40:100. |
| Percent50 | `12` | Spécifie une hachure à 50 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 50:100. |
| Percent60 | `13` | Spécifie une hachure à 60 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 60:100. |
| Percent70 | `14` | Spécifie une hachure à 70 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 70:100. |
| Percent75 | `15` | Spécifie une hachure à 75 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 75:100. |
| Percent80 | `16` | Spécifie une hachure à 80 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 80:100. |
| Percent90 | `17` | Spécifie une hachure à 90 %. Le rapport entre la couleur de premier plan et la couleur d'arrière-plan est de 90:100. |
| LightDownwardDiagonal | `18` | Spécifie des lignes diagonales qui s'inclinent vers la droite des points supérieurs aux points inférieurs et sont espacées de 50 % plus près queForwardDiagonal, mais ne sont pas anticrénelés. |
| LightUpwardDiagonal | `19` | Spécifie des lignes diagonales qui s'inclinent vers la gauche des points supérieurs aux points inférieurs et sont espacées de 50 % plus près queBackwardDiagonal, mais ils ne sont pas anticrénelés. |
| DarkDownwardDiagonal | `20` | Spécifie des lignes diagonales inclinées vers la droite des points supérieurs aux points inférieurs, espacées de 50 % et deux fois plus larges queForwardDiagonal. Ce motif de hachures n'est pas anticrénelé. |
| DarkUpwardDiagonal | `21` | Spécifie des lignes diagonales qui s'inclinent vers la gauche des points supérieurs aux points inférieurs, sont espacées de 50 % plus près queBackwardDiagonal, et font deux fois sa largeur, mais les lignes ne sont pas anticrénelées. |
| WideDownwardDiagonal | `22` | Spécifie les lignes diagonales qui s'inclinent vers la droite des points supérieurs aux points inférieurs, ont le même espacement que le style de hachuresForwardDiagonal, et ont le triple de sa largeur, mais ne sont pas anticrénelés. |
| WideUpwardDiagonal | `23` | Spécifie les lignes diagonales qui s'inclinent vers la gauche des points supérieurs aux points inférieurs, ont le même espacement que le style de hachuresBackwardDiagonal, et ont le triple de sa largeur, mais ne sont pas anticrénelés. |
| LightVertical | `24` | Spécifie des lignes verticales espacées de 50 % plus près queVertical. |
| LightHorizontal | `25` | Spécifie des lignes horizontales espacées de 50 % plus près queHorizontal. |
| NarrowVertical | `26` | Spécifie des lignes verticales espacées de 75 % plus près que le style de hachuresVertical (ou 25 % plus proches queLightVertical). |
| NarrowHorizontal | `27` | Spécifie des lignes horizontales espacées de 75 % plus près que le style de hachuresHorizontal (ou 25 % plus proches queLightHorizontal). |
| DarkVertical | `28` | Spécifie des lignes verticales espacées de 50 % plus près queVertical et font le double de sa largeur. |
| DarkHorizontal | `29` | Spécifie des lignes horizontales espacées de 50 % plus près queHorizontal et font deux fois la largeur deHorizontal. |
| DashedDownwardDiagonal | `30` | Spécifie des lignes diagonales en pointillés, qui s'inclinent vers la droite des points supérieurs aux points inférieurs. |
| DashedUpwardDiagonal | `31` | Spécifie des lignes diagonales en pointillés, qui s'inclinent vers la gauche des points supérieurs aux points inférieurs. |
| DashedHorizontal | `32` | Spécifie des lignes horizontales en pointillés. |
| DashedVertical | `33` | Spécifie des lignes verticales en pointillés. |
| SmallConfetti | `34` | Spécifie une hachure qui a l'apparence de confettis. |
| LargeConfetti | `35` | Spécifie une hachure qui a l'apparence de confettis et est composée de pièces plus grandes queSmallConfetti. |
| ZigZag | `36` | Spécifie des lignes horizontales composées de zigzags. |
| Wave | `37` | Spécifie des lignes horizontales composées de tildes. |
| DiagonalBrick | `38` | Spécifie une hachure qui a l'apparence de briques en couches qui s'inclinent vers la gauche des points supérieurs aux points inférieurs. |
| HorizontalBrick | `39` | Spécifie une hachure qui a l'apparence de briques superposées horizontalement. |
| Weave | `40` | Spécifie une hachure qui a l'apparence d'un matériau tissé. |
| Plaid | `41` | Spécifie une hachure qui a l'apparence d'un matériau écossais. |
| Divot | `42` | Spécifie une hachure qui a l'apparence de divots. |
| DottedGrid | `43` | Spécifie des lignes horizontales et verticales, chacune composée de points, qui se croisent. |
| DottedDiamond | `44` | Spécifie les lignes diagonales vers l'avant et vers l'arrière, chacune composée de points, qui se croisent. |
| Shingle | `45` | Spécifie une hachure qui a l'apparence de bardeaux superposés en diagonale qui s'inclinent vers la droite des points supérieurs aux points inférieurs. |
| Trellis | `46` | Spécifie une hachure qui a l'apparence d'un treillis. |
| Sphere | `47` | Spécifie une hachure qui a l'apparence de sphères adjacentes les unes aux autres. |
| SmallGrid | `48` | Spécifie les lignes horizontales et verticales qui se croisent et sont espacées de 50 % plus près que le style de hachuresCross. |
| SmallCheckerBoard | `49` | Spécifie une hachure qui a l'apparence d'un damier. |
| LargeCheckerBoard | `50` | Spécifie une hachure qui a l'apparence d'un damier avec des carrés deux fois plus grands queSmallCheckerBoard. |
| OutlinedDiamond | `51` | Spécifie les lignes diagonales avant et arrière qui se croisent mais ne sont pas anti-crénelées. |
| SolidDiamond | `52` | Spécifie une hachure ayant l'apparence d'un damier placé en diagonale. |
| LargeGrid | `4` | Spécifie le style de hachuresCross. |
| Min | `0` | Spécifie le style de hachuresHorizontal. |
| Max | `4` | Spécifie le style de hachuresSolidDiamond. |

### Voir également

* espace de noms [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
