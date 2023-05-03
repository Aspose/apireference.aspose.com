---
title: Class Matrix
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Drawing2D.Matrix klas. Bevat een affiene matrix van 3 bij 3 die een geometrische transformatie vertegenwoordigt. Deze klasse kan niet worden geërfd.
type: docs
weight: 360
url: /nl/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Bevat een affiene matrix van 3 bij 3 die een geometrische transformatie vertegenwoordigt. Deze klasse kan niet worden geërfd.

```csharp
public sealed class Matrix : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Matrix](matrix/#constructor)() | Initialiseert een nieuwe instantie van de klasse Matrix als identiteitsmatrix. |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | Initialiseert een nieuw exemplaar van het`Matrix` class naar de geometrische transformatie gedefinieerd door de opgegeven rechthoek en reeks punten. |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | Initialiseert een nieuw exemplaar van het`Matrix` class naar de geometrische transformatie gedefinieerd door de opgegeven rechthoek en reeks punten. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | Initialiseert een nieuwe instantie van de klasse Matrix met de opgegeven elementen. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | Krijgt een array van waarden met drijvende komma die de elementen van deze matrix vertegenwoordigen. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | Krijgt een waarde die aangeeft of deze Matrix de identiteitsmatrix is. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | Krijgt een waarde die aangeeft of deze Matrix inverteerbaar is. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | Krijgt de x-vertalingswaarde (de dx-waarde of het element in de derde rij en eerste kolom) van deze matrix. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | Krijgt de y-vertalingswaarde (de`dood` waarde, of het element in de derde rij en tweede kolom) van deze Matrix. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | Maakt een exacte kopie van deze Matrix. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | Geeft alle bronnen vrij die door deze Matrix worden gebruikt. |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | Inverteert deze matrix, als deze inverteerbaar is. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | Vermenigvuldigt ditMatrix door de matrix gespecificeerd in de*matrix* parameter, door het gespecificeerdeMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | Vermenigvuldigt ditMatrix door de matrix gespecificeerd in de*matrix* parameter, en in de volgorde die is opgegeven in de*order* parameter. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | Reset ditMatrix om de elementen van de identiteitsmatrix te hebben. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | Voeg hieraan toeMatrix een rotatie met de klok mee, rond de oorsprong en met de opgegeven hoek. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | Hiermee past u een rotatie met de klok mee toe met een hoeveelheid die is gespecificeerd in de hoekparameter, rond de oorsprong (nul x- en y-coördinaten)Matrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | Past een rotatie met de klok mee toe op deze Matrix rond het punt gespecificeerd in de puntparameter, en door de rotatie vooraf te laten gaan. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | Past een rotatie met de klok mee rond het gespecificeerde punt toe op deze Matrix in de gespecificeerde volgorde. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | Past de opgegeven schaalvector toe op deze matrix door de schaalvector vooraf te laten gaan. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | Past de opgegeven schaalvector (scaleX en scaleY) toe op deze matrix in de opgegeven volgorde. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | Past de opgegeven afschuifvector toe op deze matrix door de afschuiftransformatie vooraf te laten gaan. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | Past de opgegeven afschuifvector toe op deze matrix in de opgegeven volgorde. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | Past de geometrische transformatie toe die hierdoor wordt weergegevenMatrix naar een gespecificeerde reeks punten. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | Past de geometrische transformatie toe die hierdoor wordt weergegevenMatrix naar een gespecificeerde reeks punten. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | Vermenigvuldigt elke vector in een matrix met de matrix. De translatie-elementen van deze matrix (derde rij) worden genegeerd. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | Past de gespecificeerde translatievector (offsetX en offsetY) toe op deze matrix door de translatievector vooraf te laten gaan. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | Past de opgegeven translatievector toe op deze matrix in de opgegeven volgorde. |

### Zie ook

* naamruimte [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* montage [Aspose.Drawing](../../)


