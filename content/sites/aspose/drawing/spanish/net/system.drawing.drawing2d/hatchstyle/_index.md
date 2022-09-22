---
title: HatchStyle
second_title: Referencia de Aspose.Drawing para .NET API
description: Especifica los diferentes patrones disponibles paraHatchBrush objetos.
type: docs
weight: 300
url: /es/net/system.drawing.drawing2d/hatchstyle/
---
## HatchStyle enumeration

Especifica los diferentes patrones disponibles paraHatchBrush objetos.

```csharp
public enum HatchStyle
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Horizontal | `0` | Un patrón de líneas horizontales. |
| Vertical | `1` | Un patrón de líneas verticales. |
| ForwardDiagonal | `2` | Un patrón de líneas en diagonal desde la parte superior izquierda a la parte inferior derecha. |
| BackwardDiagonal | `3` | Un patrón de líneas en diagonal desde la parte superior derecha a la parte inferior izquierda. |
| Cross | `4` | Especifica líneas horizontales y verticales que se cruzan. |
| DiagonalCross | `5` | Un patrón de líneas diagonales entrecruzadas. |
| Percent05 | `6` | Especifica un sombreado del 5 por ciento. La relación entre el color de primer plano y el color de fondo es de 5:100. |
| Percent10 | `7` | Especifica un sombreado del 10 por ciento. La relación entre el color de primer plano y el color de fondo es de 10:100. |
| Percent20 | `8` | Especifica un sombreado del 20 por ciento. La relación entre el color de primer plano y el color de fondo es de 20:100. |
| Percent25 | `9` | Especifica un sombreado del 25 por ciento. La relación entre el color de primer plano y el color de fondo es de 25:100. |
| Percent30 | `10` | Especifica un sombreado del 30 por ciento. La relación entre el color de primer plano y el color de fondo es de 30:100. |
| Percent40 | `11` | Especifica un sombreado del 40 por ciento. La relación entre el color de primer plano y el color de fondo es de 40:100. |
| Percent50 | `12` | Especifica un sombreado del 50 por ciento. La relación entre el color de primer plano y el color de fondo es de 50:100. |
| Percent60 | `13` | Especifica un sombreado del 60 por ciento. La relación entre el color de primer plano y el color de fondo es de 60:100. |
| Percent70 | `14` | Especifica un sombreado del 70 por ciento. La relación entre el color de primer plano y el color de fondo es de 70:100. |
| Percent75 | `15` | Especifica un sombreado del 75 por ciento. La relación entre el color de primer plano y el color de fondo es de 75:100. |
| Percent80 | `16` | Especifica un sombreado del 80 por ciento. La relación entre el color de primer plano y el color de fondo es de 80:100. |
| Percent90 | `17` | Especifica un sombreado del 90 por ciento. La relación entre el color de primer plano y el color de fondo es de 90:100. |
| LightDownwardDiagonal | `18` | Especifica líneas diagonales que se inclinan hacia la derecha desde los puntos superiores a los puntos inferiores y están espaciadas un 50 por ciento más juntas queForwardDiagonal, pero no tienen suavizado. |
| LightUpwardDiagonal | `19` | Especifica líneas diagonales que se inclinan hacia la izquierda desde los puntos superiores a los puntos inferiores y están espaciadas un 50 por ciento más juntas queBackwardDiagonal, pero no tienen suavizado. |
| DarkDownwardDiagonal | `20` | Especifica líneas diagonales que se inclinan hacia la derecha desde los puntos superiores a los puntos inferiores, están espaciadas un 50 por ciento más juntas que y tienen el doble del ancho deForwardDiagonal. Este patrón de sombreado no está suavizado. |
| DarkUpwardDiagonal | `21` | Especifica líneas diagonales que se inclinan hacia la izquierda desde los puntos superiores a los puntos inferiores, están espaciadas un 50 por ciento más juntas queBackwardDiagonal, y tienen el doble de su ancho, pero las líneas no están suavizadas. |
| WideDownwardDiagonal | `22` | Especifica líneas diagonales que se inclinan hacia la derecha desde los puntos superiores a los puntos inferiores, tienen el mismo espaciado que el estilo de sombreadoForwardDiagonal, y tienen el triple de su ancho, pero no tienen suavizado. |
| WideUpwardDiagonal | `23` | Especifica líneas diagonales que se inclinan hacia la izquierda desde los puntos superiores hasta los puntos inferiores, tienen el mismo espaciado que el estilo de sombreadoBackwardDiagonal, y tienen el triple de su ancho, pero no tienen suavizado. |
| LightVertical | `24` | Especifica líneas verticales que están espaciadas un 50 por ciento más juntas queVertical. |
| LightHorizontal | `25` | Especifica líneas horizontales que están espaciadas un 50 por ciento más juntas queHorizontal. |
| NarrowVertical | `26` | Especifica líneas verticales que están espaciadas un 75 por ciento más juntas que el estilo de sombreadoVertical (o 25 por ciento más juntos queLightVertical). |
| NarrowHorizontal | `27` | Especifica líneas horizontales que están espaciadas un 75 por ciento más juntas que el estilo de sombreadoHorizontal (o 25 por ciento más juntos queLightHorizontal). |
| DarkVertical | `28` | Especifica líneas verticales que están espaciadas un 50 por ciento más juntas queVertical y miden el doble de su ancho. |
| DarkHorizontal | `29` | Especifica líneas horizontales que están espaciadas un 50 por ciento más juntas queHorizontal y son el doble del ancho deHorizontal. |
| DashedDownwardDiagonal | `30` | Especifica líneas diagonales discontinuas, que se inclinan hacia la derecha desde los puntos superiores hasta los puntos inferiores. |
| DashedUpwardDiagonal | `31` | Especifica líneas diagonales discontinuas, que se inclinan hacia la izquierda desde los puntos superiores hasta los puntos inferiores. |
| DashedHorizontal | `32` | Especifica líneas horizontales discontinuas. |
| DashedVertical | `33` | Especifica líneas verticales discontinuas. |
| SmallConfetti | `34` | Especifica un sombreado que tiene la apariencia de confeti. |
| LargeConfetti | `35` | Especifica una escotilla que tiene la apariencia de confeti y está compuesta de piezas más grandes queSmallConfetti. |
| ZigZag | `36` | Especifica líneas horizontales que se componen de zigzags. |
| Wave | `37` | Especifica líneas horizontales que se componen de tildes. |
| DiagonalBrick | `38` | Especifica un sombreado que tiene la apariencia de ladrillos en capas que se inclinan hacia la izquierda desde los puntos superiores hasta los puntos inferiores. |
| HorizontalBrick | `39` | Especifica un sombreado que tiene la apariencia de ladrillos en capas horizontales. |
| Weave | `40` | Especifica un sombreado que tiene la apariencia de un material tejido. |
| Plaid | `41` | Especifica un sombreado que tiene la apariencia de un material escocés. |
| Divot | `42` | Especifica un sombreado que tiene la apariencia de divisiones. |
| DottedGrid | `43` | Especifica líneas horizontales y verticales, cada una de las cuales está compuesta por puntos, que se cruzan. |
| DottedDiamond | `44` | Especifica líneas diagonales hacia adelante y diagonales hacia atrás, cada una de las cuales está compuesta por puntos, que se cruzan. |
| Shingle | `45` | Especifica un sombreado que tiene la apariencia de tejas en capas diagonales que se inclinan hacia la derecha desde los puntos superiores hasta los puntos inferiores. |
| Trellis | `46` | Especifica un sombreado que tiene la apariencia de un enrejado. |
| Sphere | `47` | Especifica un sombreado que tiene la apariencia de esferas colocadas una al lado de la otra. |
| SmallGrid | `48` | Especifica líneas horizontales y verticales que se cruzan y están espaciadas un 50 por ciento más juntas que el estilo de sombreadoCross. |
| SmallCheckerBoard | `49` | Especifica un sombreado que tiene la apariencia de un tablero de ajedrez. |
| LargeCheckerBoard | `50` | Especifica un sombreado que tiene la apariencia de un tablero de ajedrez con cuadrados que son el doble del tamaño deSmallCheckerBoard. |
| OutlinedDiamond | `51` | Especifica líneas diagonales hacia adelante y diagonales hacia atrás que se cruzan pero no están suavizadas. |
| SolidDiamond | `52` | Especifica un sombreado que tiene la apariencia de un tablero de ajedrez colocado en diagonal. |
| LargeGrid | `4` | Especifica el estilo de sombreadoCross. |
| Min | `0` | Especifica el estilo de sombreadoHorizontal. |
| Max | `4` | Especifica el estilo de sombreadoSolidDiamond. |

### Ver también

* espacio de nombres [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
