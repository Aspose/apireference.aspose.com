---
title: MeasureString
second_title: Aspose.Drawing för .NET API Referens
description: Mäter den angivna strängen när den ritas med den angivnaFont .
type: docs
weight: 620
url: /sv/net/system.drawing/graphics/measurestring/
---
## MeasureString(string, Font) {#measurestring}

Mäter den angivna strängen när den ritas med den angivnaFont .

```csharp
public SizeF MeasureString(string text, Font font)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Font som definierar textformatet för strängen. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskapen för strängen specificerad av*text* parameter som ritad med*font* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF) {#measurestring_4}

Mäter den angivna strängen när den ritas med den angivnaFont .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Font som definierar textformatet för strängen. |
| layoutArea | SizeF | SizeF struktur som anger det maximala layoutområdet för texten. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskapen för strängen specificerad av*text* parameter som ritad med*font* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int) {#measurestring_1}

Mäter den angivna strängen när den ritas med den angivnaFont .

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Font som definierar textformatet för strängen. |
| width | Int32 | Strängens maximala bredd i pixlar. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskapen för strängen specificerad av*text* parameter som ritad med*font* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, PointF, StringFormat) {#measurestring_3}

Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Fontdefinierar textformatet för strängen. |
| origin | PointF | PointF struktur som representerar det övre vänstra hörnet av strängen. |
| stringFormat | StringFormat | StringFormat som representerar formateringsinformation, såsom radavstånd, för strängen. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskapen för strängen specificerad av*text* parameter som ritad med*font* parametern och*stringFormat* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* struct [PointF](../../pointf)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int, StringFormat) {#measurestring_2}

Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Font som definierar textformatet för strängen. |
| width | Int32 | Strängens maximala bredd. |
| format | StringFormat | StringFormat som representerar formateringsinformation, såsom radavstånd, för strängen. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskap, av strängen som anges i*text* parameter som ritad med*font* parameter och*format* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat) {#measurestring_5}

Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Fontdefinierar textformatet för strängen. |
| layoutArea | SizeF | SizeF struktur som anger det maximala layoutområdet för texten. |
| stringFormat | StringFormat | StringFormat som representerar formateringsinformation, såsom radavstånd, för strängen. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskap, av strängen som anges i*text* parameter som ritad med*font* parameter och*stringFormat* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat, out int, out int) {#measurestring_6}

Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Sträng att mäta. |
| font | Font | Fontdefinierar textformatet för strängen. |
| layoutArea | SizeF | SizeF struktur som anger det maximala layoutområdet för texten. |
| stringFormat | StringFormat | StringFormat som representerar formateringsinformation, såsom radavstånd, för strängen. |
| charactersFitted | Int32& | Antal tecken i strängen. |
| linesFilled | Int32& | Antal textrader i strängen. |

### Returvärde

Denna metod returnerar enSizeF struktur som representerar storleken, i de enheter som anges avPageUnit egenskap, av strängen som anges i*text* parameter som ritad med*font* parameter och*stringFormat* parameter.

### Se även

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
