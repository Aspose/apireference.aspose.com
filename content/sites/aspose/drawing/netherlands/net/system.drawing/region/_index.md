---
title: Class Region
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Region klas. Beschrijft het interieur van een grafische vorm die bestaat uit rechthoeken en paden. Deze klasse kan niet worden geërfd.
type: docs
weight: 1060
url: /nl/net/system.drawing/region/
---
## Region class

Beschrijft het interieur van een grafische vorm die bestaat uit rechthoeken en paden. Deze klasse kan niet worden geërfd.

```csharp
public sealed class Region : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Region](region/#constructor)() | Initialiseert een nieuw exemplaar van het`Region` klasse. |
| [Region](region/#constructor_1)(GraphicsPath) | Initialiseert een nieuw exemplaar van het`Region` klasse met de gespecificeerdeGraphicsPath . |
| [Region](region/#constructor_3)(Rectangle) | Initialiseert een nieuw exemplaar van het`Region` klasse van de gespecificeerdeRectangle structuur. |
| [Region](region/#constructor_4)(RectangleF) | Initialiseert een nieuw exemplaar van het`Region` klasse van de gespecificeerdeRectangleF structuur. |
| [Region](region/#constructor_2)(RegionData) | Initialiseert een nieuw exemplaar van het`Region` klasse uit de opgegeven gegevens. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | Maakt hiervan een exacte kopieRegion . |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | Werkt dit bijRegion om het gedeelte van het gespecificeerde te bevattenGraphicsPath dat kruist hier niet meeRegion . |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | Werkt dit bijRegion om het gedeelte van het gespecificeerde te bevattenRectangle structure die dit niet kruistRegion . |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | Werkt dit bijRegion om het gedeelte van het gespecificeerde te bevattenRectangleF structure die dit niet kruistRegion . |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | Werkt dit bijRegion om het gedeelte van het gespecificeerde te bevattenRegiondat snijdt hier niet meeRegion . |
| [Dispose](../../system.drawing/region/dispose/)() | Geeft alle bronnen vrij die hierdoor worden gebruiktRegion . |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | Test of de opgegevenRegion is identiek hieraanRegion op het opgegeven tekenoppervlak. |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | Werkt dit bijRegion om alleen het gedeelte van het interieur te bevatten dat de gespecificeerde niet kruistGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | Werkt dit bijRegion om alleen het gedeelte van het interieur te bevatten dat niet kruist met het opgegevenRectangle structuur. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | Werkt dit bijRegion om alleen het gedeelte van het interieur te bevatten dat de gespecificeerde niet kruistRectangleF structuur. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | Werkt dit bijRegion om alleen het gedeelte van het interieur te bevatten dat niet kruist met het opgegevenRegion . |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | Krijgt eenRectangleF structuur die een rechthoek vertegenwoordigt die dit begrenstRegion op het tekenoppervlak van eenGraphics object. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | Geeft als resultaat eenRegionData die de informatie vertegenwoordigt die dit beschrijftRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | Retourneert een matrix vanRectangleF structuren die dit benaderenRegion nadat de opgegeven matrixtransformatie is toegepast. |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | Werkt dit bijRegion naar de kruising van zichzelf met het gespecificeerdeGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | Werkt dit bijRegion naar de kruising van zichzelf met het gespecificeerdeRectangle structuur. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | Werkt dit bijRegion naar het snijpunt van zichzelf met de opgegeven RectangleF structuur. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | Werkt dit bijRegion naar de kruising van zichzelf met het gespecificeerdeRegion . |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | Test of ditRegion heeft een leeg interieur op het opgegeven tekenoppervlak. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | Test of ditRegion heeft een oneindig interieur op het opgegeven tekenoppervlak. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | Test of de opgegevenPoint structuur zit hierinRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | Test of de opgegevenPointF structuur zit hierinRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | Test of een deel van het opgegevenRectangle structuur is vervat in this Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | Test of een deel van het opgegevenRectangleF structuur is vervat in ditRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | Test of het gespecificeerde punt hierin is opgenomenRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | Test of de opgegevenPoint structuur zit hierinRegion wanneer getekend met de opgegevenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | Test of de opgegevenPointF structuur zit hierinRegion wanneer getekend met de opgegevenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | Test of een deel van het opgegevenRectangle structuur is vervat in ditRegion wanneer getekend met behulp van de opgegevenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | Test of een deel van het opgegevenRectangleF structuur is vervat in ditRegion wanneer getekend met behulp van de opgegevenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | Test of het gespecificeerde punt hierin is opgenomenRegion wanneer getekend met het opgegevenGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | Test of het gespecificeerde punt hierin is opgenomenRegion object wanneer getekend met het opgegevenGraphics object. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | Test of een deel van de opgegeven rechthoek hierin is opgenomenRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | Test of een deel van de opgegeven rechthoek hierin is opgenomenRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | Test of een deel van de opgegeven rechthoek hierin is opgenomenRegion wanneer getekend met de opgegevenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | Test of een deel van de opgegeven rechthoek hierin is opgenomenRegion wanneer getekend met behulp van de opgegevenGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | Initialiseert ditRegion naar een leeg interieur. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | Initialiseert ditRegion bezwaar maken tegen een oneindig interieur. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | Transformeert ditRegion door de opgegevenMatrix . |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | Verplaatst de coördinaten hiervanRegion met het opgegeven bedrag. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | Verplaatst de coördinaten hiervanRegion met het opgegeven bedrag. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | Werkt dit bijRegion tot de vereniging van zichzelf en het gespecificeerdeGraphicsPath . |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | Werkt dit bijRegion tot de vereniging van zichzelf en het gespecificeerdeRectangle structuur. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | Werkt dit bijRegion tot de vereniging van zichzelf en het gespecificeerdeRectangleF structuur. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | Werkt dit bijRegion tot de vereniging van zichzelf en het gespecificeerdeRegion . |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | Werkt dit bijRegion naar de unie minus het snijpunt van zichzelf met de opgegeven GraphicsPath . |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | Werkt dit bijRegion naar de unie minus het snijpunt van zichzelf met de opgegeven Rectangle structuur. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | Werkt dit bijRegion naar de unie minus het snijpunt van zichzelf met de gespecificeerdeRectangleF structuur. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | Werkt dit bijRegion naar de unie minus het snijpunt van zichzelf met de opgegeven Region . |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


