---
title: Pen
second_title: Aspose.Drawing för .NET API Referens
description: Definierar ett objekt som används för att rita linjer och kurvor.
type: docs
weight: 910
url: /sv/net/system.drawing/pen/
---
## Pen class

Definierar ett objekt som används för att rita linjer och kurvor.

```csharp
public class Pen : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Initierar en ny instans av[`Pen`](../pen) klass med den angivnaBrush . |
| [Pen](pen#constructor_2)(Color) | Initierar en ny instans av[`Pen`](../pen) klass med den angivnaColor . |
| [Pen](pen#constructor_1)(Brush, float) | Initierar en ny instans av klassen Pen med den angivna borsten och bredden. |
| [Pen](pen#constructor_3)(Color, float) | Initierar en ny instans av klassen Pen med de angivna egenskaperna för färg och bredd. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Hämtar eller ställer in justeringen för dettaPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Hämtar eller ställer in penseln som bestämmer attributen för dettaPen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Hämtar eller ställer in färgen på dettaPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Hämtar eller ställer in en matris med värden som anger en sammansatt penna. En sammansatt penna ritar en sammansatt linje som består av parallella linjer och mellanslag. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Får eller ställer in ett anpassat tak som ska användas i slutet av linjer som ritas med dettaPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Får eller ställer in ett anpassat tak som ska användas i början av linjer som ritas med dettaPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Hämtar eller ställer in kapsylstilen som används i slutet av strecken som utgör streckade linjer ritade med this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Hämtar eller ställer in avståndet från början av en linje till början av ett streckmönster. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Hämtar eller ställer in en rad anpassade bindestreck och blanksteg. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Hämtar eller ställer in stilen som används för streckade linjer som ritas med dettaPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Hämtar eller ställer in kepsstilen som används i slutet av linjer som ritas med denna penna. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Hämtar eller ställer in sammanfogningsstilen för ändarna av två på varandra följande linjer ritade med denna penna. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Hämtar eller ställer in gränsen för fogtjockleken på ett geringshörn. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Får stilen med linjer ritade med denna penna. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Hämtar eller ställer in kepsstilen som används i början av linjer som ritas med denna penna. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Hämtar eller ställer in en kopia av den geometriska transformationen för dettaPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Hämtar eller ställer in bredden på denna penna, i enheter av grafikobjektet som används för att rita. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Skapar en exakt kopia av dettaPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Frigör alla resurser som används av denna penna. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Multiplicerar transformationsmatrisen för dettaPen av den angivnaMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplicerar transformationsmatrisen för dettaPen av den angivnaMatrix i angiven ordning. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Återställer den geometriska transformationsmatrisen för dettaPen till identitet. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Roterar den lokala geometriska transformationen med den angivna vinkeln. Denna metod förutsätter rotationen till transformationen. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Roterar den lokala geometriska transformationen med den angivna vinkeln i angiven ordning. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Skalar den lokala geometriska transformationen med de angivna faktorerna. Denna metod förbereder skalningsmatrisen till transformationen. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skalar den lokala geometriska transformationen med de angivna faktorerna i angiven ordning. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Ställer in värdena som bestämmer stilen på taket som används för att avsluta linjer som ritas av denna[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Översätter den lokala geometriska transformationen med de angivna måtten. Denna metod lägger till översättningen till transformationen. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Översätter den lokala geometriska transformationen med de angivna måtten i angiven ordning. |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
