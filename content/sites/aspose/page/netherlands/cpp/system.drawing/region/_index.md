---
title: "System::Drawing::Region class"
linktitle: "Region"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Region class. Vertegenwoordigt het binnenste van een grafische vorm. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.drawing/region/
---
## Region class


Vertegenwoordigt het binnenste van een grafische vorm. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Region : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() const | Retourneert een kopie van het huidige object. |
| [Complement](./complement/)(const RectangleF\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het deel van het gebied dat is gedefinieerd door de opgegeven rechthoek en dat niet overlapt met dit gebied. |
| [Complement](./complement/)(const Rectangle\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het deel van het gebied dat is gedefinieerd door de opgegeven rechthoek en dat niet overlapt met dit gebied. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het deel van het gebied dat is gedefinieerd door het opgegeven pad en dat niet overlapt met dit gebied. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het deel van het opgegeven gebied dat niet overlapt met dit gebied. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Bepaalt of het opgegeven gebied identiek is aan het gebied dat wordt vertegenwoordigd door het huidige object op het opgegeven tekenoppervlak. |
| [Exclude](./exclude/)(const RectangleF\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het resultaat van het uitsluiten van het gebied dat is gedefinieerd door de opgegeven rechthoek. |
| [Exclude](./exclude/)(const Rectangle\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het resultaat van het uitsluiten van het gebied dat is gedefinieerd door de opgegeven rechthoek. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het resultaat van het uitsluiten van het gebied dat is gedefinieerd door het opgegeven pad. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Vervangt het gebied dat wordt vertegenwoordigd door het huidige object door het resultaat van het uitsluiten van het opgegeven gebied. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Haalt een [RectangleF](../rectanglef/) structuur op die een rechthoek vertegenwoordigt die dit [Region](./) begrenst op het tekenoppervlak van een [Graphics](../graphics/) object. |
| [GetRegionData](./getregiondata/)() const | Retourneert een RegionData-object dat gegevens bevat die het gebied definiëren dat wordt vertegenwoordigd door het huidige object. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Retourneert een array van [RectangleF](../rectanglef/) structuren die deze [Region](./) benaderen nadat de opgegeven matrixtransformatie is toegepast. |
| [Intersect](./intersect/)(const RectangleF\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de intersectie van deze regio en een regio gedefinieerd door de opgegeven rechthoek. |
| [Intersect](./intersect/)(const Rectangle\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de intersectie van deze regio en een regio gedefinieerd door de opgegeven rechthoek. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de intersectie van deze regio en een regio gedefinieerd door het opgegeven pad. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de intersectie van deze regio en de opgegeven regio. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Bepaalt of de regio die wordt weergegeven door het huidige object een lege binnenkant heeft op het opgegeven tekenoppervlak. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Bepaalt of de regio die wordt weergegeven door het huidige object een oneindige binnenkant heeft op het opgegeven tekenoppervlak. |
| [IsVisible](./isvisible/)(const Point\&) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(const PointF\&) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Bepaalt of een deel van de opgegeven rechthoek zich bevindt binnen de regio die wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Bepaalt of een deel van de opgegeven rechthoek zich bevindt binnen de regio die wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object met behulp van de opgegeven graphics. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object met behulp van de opgegeven graphics. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Bepaalt of een deel van de opgegeven rechthoek zich bevindt binnen de regio die wordt weergegeven door het huidige object met behulp van de opgegeven graphics. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Bepaalt of een deel van de opgegeven rechthoek zich bevindt binnen de regio die wordt weergegeven door het huidige object met behulp van de opgegeven graphics. |
| [IsVisible](./isvisible/)(float, float) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Bepaalt of het opgegeven punt zich bevindt binnen de regio die wordt weergegeven door het huidige object met behulp van de opgegeven graphics. |
| [MakeEmpty](./makeempty/)() | Initialiseert het huidige object met een lege binnenkant. |
| [MakeInfinite](./makeinfinite/)() | Initialiseert dit regio-object met een oneindige binnenkant. |
| [Region](./region/)() | Construeert een nieuw exemplaar van de klasse [Region](./). |
| [Region](./region/)(const RectangleF\&) | Construeert een nieuw exemplaar van de klasse [Region](./) dat een regio vertegenwoordigt die is gedefinieerd door de opgegeven rechthoek. |
| [Region](./region/)(const Rectangle\&) | Construeert een nieuw exemplaar van de klasse [Region](./) dat een regio vertegenwoordigt die is gedefinieerd door de opgegeven rechthoek. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Construeert een nieuw exemplaar van de klasse [Region](./) dat een regio vertegenwoordigt die is gedefinieerd door het opgegeven pad. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Construeert een nieuw exemplaar van de klasse [Region](./) dat een regio vertegenwoordigt die is gedefinieerd door het opgegeven RegionData-object. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Transformeert deze regio met de opgegeven matrix. |
| [Transform](./transform/)(const SkMatrix\&) | Transformeert deze regio met de opgegeven matrix. |
| [Translate](./translate/)(int, int) | Verplaatst de coördinaten van de regio met de opgegeven hoeveelheid. |
| [Translate](./translate/)(float, float) | Verplaatst de coördinaten van de regio met de opgegeven hoeveelheid. |
| [Union](./union/)(const RectangleF\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de unie-bewerking van deze regio en een regio gedefinieerd door de opgegeven rechthoek. |
| [Union](./union/)(const Rectangle\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de unie van deze regio en een regio gedefinieerd door de opgegeven rechthoek. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de unie van deze regio en een regio gedefinieerd door het opgegeven pad. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door het resultaat van de unie van deze regio en de opgegeven regio. |
| [Xor](./xor/)(const RectangleF\&) | Vervangt de regio die wordt weergegeven door het huidige object door de delen van deze regio en de regio gedefinieerd door de opgegeven rechthoek die niet overlappen. |
| [Xor](./xor/)(const Rectangle\&) | Vervangt de regio die wordt weergegeven door het huidige object door de delen van deze regio en de regio gedefinieerd door de opgegeven rechthoek die niet overlappen. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door de delen van deze regio en de regio gedefinieerd door het opgegeven pad die niet overlappen. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Vervangt de regio die wordt weergegeven door het huidige object door de delen van deze regio en de opgegeven regio die niet overlappen. |
| virtual [~Region](./~region/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
