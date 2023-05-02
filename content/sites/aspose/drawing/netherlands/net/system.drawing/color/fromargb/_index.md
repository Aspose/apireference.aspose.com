---
title: Color.FromArgb
second_title: Aspose.Drawing voor .NET API-referentie
description: Color methode. Creëert eenColor structuur van een 32bits ARGBwaarde.
type: docs
weight: 1430
url: /nl/net/system.drawing/color/fromargb/
---
## FromArgb(int) {#fromargb}

Creëert eenColor structuur van een 32-bits ARGB-waarde.

```csharp
public static Color FromArgb(int argb)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| argb | Int32 | Een waarde die de 32-bits ARGB-waarde specificeert. |

### Winstwaarde

DeColor structuur die deze methode creëert.

### Zie ook

* struct [Color](../)
* naamruimte [System.Drawing](../../color/)
* montage [Aspose.Drawing](../../../)

---

## FromArgb(int, Color) {#fromargb_3}

Creëert eenColor structuur van de opgegevenColorstructuur, maar met de nieuwe gespecificeerde alfawaarde. Hoewel met deze methode een 32-bits waarde kan worden doorgegeven voor de alpha-waarde, is de waarde beperkt tot 8 bits.

```csharp
public static Color FromArgb(int alpha, Color baseColor)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| alpha | Int32 | De alfawaarde voor het nieuweColor. Geldige waarden zijn 0 tot en met 255. |
| baseColor | Color | DeColor waaruit het nieuwe ontstaatColor. |

### Winstwaarde

DeColor die deze methode creëert.

### Zie ook

* struct [Color](../)
* naamruimte [System.Drawing](../../color/)
* montage [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int) {#fromargb_1}

Creëert eenColor structuur van de opgegeven 8-bits kleurwaarden (rood, groen en blauw). De alpha-waarde is impliciet 255 (volledig ondoorzichtig). Hoewel deze methode toestaat dat een 32-bits waarde wordt doorgegeven voor elke kleurcomponent, de waarde van elke component is beperkt tot 8 bits.

```csharp
public static Color FromArgb(int red, int green, int blue)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| red | Int32 | De rode componentwaarde voor de nieuweColor. Geldige waarden zijn 0 tot en met 255. |
| green | Int32 | De groene componentwaarde voor de nieuweColor. Geldige waarden zijn 0 tot en met 255. |
| blue | Int32 | De blauwe componentwaarde voor de nieuweColor. Geldige waarden zijn 0 tot en met 255. |

### Winstwaarde

DeColor die deze methode creëert.

### Zie ook

* struct [Color](../)
* naamruimte [System.Drawing](../../color/)
* montage [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int, int) {#fromargb_2}

Creëert een kleurstructuur op basis van de vier ARGB-componentwaarden (alfa, rood, groen en blauw). Hoewel met deze methode een 32-bits waarde kan worden doorgegeven voor elke component, is de waarde van elke component beperkt tot 8 bits .

```csharp
public static Color FromArgb(int alpha, int red, int green, int blue)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| alpha | Int32 | De alfa-component. Geldige waarden zijn 0 tot en met 255. |
| red | Int32 | Het rode bestanddeel. Geldige waarden zijn 0 tot en met 255. |
| green | Int32 | De groene component. Geldige waarden zijn 0 tot en met 255. |
| blue | Int32 | Het blauwe onderdeel. Geldige waarden zijn 0 tot en met 255. |

### Winstwaarde

De kleur die deze methode creëert.

### Zie ook

* struct [Color](../)
* naamruimte [System.Drawing](../../color/)
* montage [Aspose.Drawing](../../../)


