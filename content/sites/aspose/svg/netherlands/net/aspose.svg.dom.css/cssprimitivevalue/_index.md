---
title: Class CSSPrimitiveValue
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.Css.CSSPrimitiveValue klas. De interface CSSPrimitiveValue vertegenwoordigt een enkele CSSwaarde. Deze interface kan worden gebruikt om de waarde te bepalen van een specifieke stijleigenschap die momenteel in een blok is ingesteld of om een specifieke stijleigenschap expliciet binnen het blok in te stellen. Een exemplaar van deze interface kan worden verkregen via de getPropertyCSSValuemethode van de CSSStyleDeclarationinterface. Een CSSPrimitiveValueobject komt alleen voor in een context van een CSSeigenschap.
type: docs
weight: 480
url: /nl/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

De interface CSSPrimitiveValue vertegenwoordigt een enkele CSS-waarde. Deze interface kan worden gebruikt om de waarde te bepalen van een specifieke stijleigenschap die momenteel in een blok is ingesteld of om een specifieke stijleigenschap expliciet binnen het blok in te stellen. Een exemplaar van deze interface kan worden verkregen via de getPropertyCSSValue-methode van de CSSStyleDeclaration-interface. Een CSSPrimitiveValue-object komt alleen voor in een context van een CSS-eigenschap.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Een tekenreeksrepresentatie van de huidige waarde. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Een code die het type waarde definieert. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype/) { get; } | Het type waarde zoals gedefinieerd door de hierboven gespecificeerde constanten. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Bepaalt of de opgegevenObject is gelijk aan deze instantie. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue/)() | Deze methode wordt gebruikt om de tellerwaarde te verkrijgen. Als deze CSS-waarde geen tellerwaarde bevat, wordt een DOMException gegenereerd. Wijziging van de overeenkomstige stijleigenschap kan worden bereikt met behulp van de tellerinterface. |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue/)(ushort) | Deze methode wordt gebruikt om een float-waarde in een opgegeven eenheid te krijgen. Als deze CSS-waarde geen float-waarde bevat of niet kan worden geconverteerd naar de opgegeven eenheid, wordt een DOMException gegenereerd. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Retourneert een hash-code voor deze instantie. |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue/)(ushort) | Deze methode wordt gebruikt om een int-waarde in een gespecificeerde eenheid te verkrijgen. Als deze CSS-waarde geen int-waarde bevat of niet kan worden geconverteerd naar de opgegeven eenheid, wordt een DOMException gegenereerd. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue/)() | Deze methode wordt gebruikt om de Rect-waarde te verkrijgen. Als deze CSS-waarde geen rect-waarde bevat, wordt een DOMException gegenereerd. Wijziging van de overeenkomstige stijleigenschap kan worden bereikt met behulp van de Rect-interface. |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue/)() | Deze methode wordt gebruikt om de RGB-kleur te krijgen. Als deze CSS-waarde geen RGB-kleurwaarde bevat, wordt er een DOMException gegenereerd. Wijziging van de overeenkomstige stijleigenschap kan worden bereikt met behulp van de RGBColor-interface. |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue/)() | Deze methode wordt gebruikt om de tekenreekswaarde te verkrijgen. Als de CSS-waarde geen tekenreekswaarde bevat, wordt een DOMException gegenereerd. |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue/)(ushort, float) | Een methode om de float-waarde in te stellen met een gespecificeerde eenheid. Als de eigenschap die aan deze waarde is gekoppeld, de opgegeven eenheid of de float-waarde niet kan accepteren, blijft de waarde ongewijzigd en wordt er een DOMException verhoogd. |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue/)(ushort, int) | Een methode om de int-waarde in te stellen met een gespecificeerde eenheid. Als de eigenschap die aan deze waarde is gekoppeld de opgegeven eenheid of de int-waarde niet kan accepteren, blijft de waarde ongewijzigd en wordt er een DOMException gegenereerd. |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue/)(ushort, string) | Een methode om de tekenreekswaarde in te stellen met de opgegeven eenheid. Als de eigenschap die aan deze waarde is gekoppeld de opgegeven eenheid of tekenreekswaarde niet kan accepteren, blijft de waarde ongewijzigd en wordt er een DOMException gegenereerd. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Geeft als resultaat eenString die deze instantie vertegenwoordigt. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr/) | De waarde is een attribuutfunctie. De waarde kan worden verkregen met behulp van de methode getStringValue. |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch/) | De waarde is een lengte (ch). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm/) | De waarde is een lengte (cm). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter/) | De waarde is een teller of tellersfunctie. De waarde kan worden verkregen met behulp van de methode GetCounterValue. |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg/) | De waarde is een hoek (graden). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension/) | De waarde is een getal met een onbekende dimensie. De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm/) | De waarde is een aantal punten per centimeter (dpcm). |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi/) | De waarde is een aantal dots per inch (dpi). |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx/) | De waarde is een aantal punten per 'px'-eenheid (dppx). |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems/) | De waarde is een lengte (ems). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs/) | De waarde is een lengte (exs). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad/) | De waarde is een hoek (gradiënt). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz/) | De waarde is een frequentie (Hz). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident/) | De waarde is een identifier. De waarde kan worden verkregen met behulp van de methode getStringValue. |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in/) | De waarde is een lengte (in). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz/) | De waarde is een frequentie (kHz). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm/) | De waarde is een lengte (mm). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms/) | De waarde is een tijd (ms). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number/) | De waarde is een eenvoudig getal. De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc/) | De waarde is een lengte (pc). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage/) | De waarde is een percentage. De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt/) | De waarde is een lengte (pt). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px/) | De waarde is een lengte (px). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad/) | De waarde is een hoek (rad). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect/) | De waarde is een rect-functie. De waarde kan worden verkregen met behulp van de methode GetRectValue. |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem/) | De waarde is een lengte (rem). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor/) | De waarde is een RGB-kleur. De waarde kan worden verkregen met behulp van de methode GetRGBColorValue. |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s/) | De waarde is een tijd(en). De waarde kan worden verkregen met behulp van de methode getFloatValue. |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string/) | De waarde is een STRING. De waarde kan worden verkregen met behulp van de methode getStringValue. |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown/) | De waarde is geen herkende CSS2-waarde. De waarde kan alleen worden verkregen door het cssText-attribuut te gebruiken. |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri/) | De waarde is een URI. De waarde kan worden verkregen met behulp van de methode getStringValue. |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh/) | De waarde is een percentage van de volledige viewporthoogte. |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax/) | De waarde is een percentage van de breedte of hoogte van de viewport, afhankelijk van welke groter is. |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin/) | De waarde is een percentage van de breedte of hoogte van de viewport, afhankelijk van welke kleiner is. |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw/) | De waarde is een percentage van de volledige viewportbreedte. |

### Zie ook

* class [CSSValue](../cssvalue/)
* naamruimte [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* montage [Aspose.SVG](../../)


