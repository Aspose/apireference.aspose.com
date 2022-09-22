---
title: EncoderParameter
second_title: Aspose.Drawing für .NET-API-Referenz
description: Wird verwendet um einen Wert oder ein Array von Werten an einen Bildcodierer zu übergeben.
type: docs
weight: 700
url: /de/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Wird verwendet, um einen Wert oder ein Array von Werten an einen Bildcodierer zu übergeben.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter) Klasse mit den angegebenenEncoder object und eine 8-Bit-Ganzzahl ohne Vorzeichen. Setzt dieValueType property zuValueTypeByte , und setzt dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und ein Array von vorzeichenlosen 8-Bit-Ganzzahlen. Legt dieValueType Eigentum zuValueTypeByte , und setzt dieNumberOfValues Eigenschaft auf die Anzahl der Elemente im Array. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und eine 64-Bit-Ganzzahl. Setzt dieValueType property zuValueTypeLong (32 Bit) und setzt the NumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und ein Array von 64-Bit-Ganzzahlen. Setzt dieValueType Eigentum anValueTypeLong (32-Bit) und sets dieNumberOfValues Eigenschaft auf die Anzahl der Elemente im Array. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und eine 16-Bit-Ganzzahl. Setzt dieValueType property zuValueTypeShort , und setzt dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und ein Array von 16-Bit-Ganzzahlen. Setzt dieValueType Eigentum anValueTypeShort , und setzt the NumberOfValues Eigenschaft auf die Anzahl der Elemente im Array. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und eine Zeichenfolge. Die Zeichenfolge wird in eine nullterminierte ASCII-Zeichenfolge umgewandelt, bevor sie im gespeichert wirdEncoderParameter Objekt. Setzt dieValueType Eigentum anValueTypeAscii , und sets dieNumberOfValues -Eigenschaft auf die Länge des ASCII-Strings einschließlich des NULL-Terminators. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und einen 8-Bit-Wert. Setzt dieValueType property zuValueTypeUndefined oderValueTypeByte , und setzt dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und ein Array von Bytes. Setzt dieValueType Eigentum anValueTypeUndefined oder ValueTypeByte , und setzt dieNumberOfValues -Eigenschaft auf die Anzahl der Elemente im Array. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder-Objekt und ein Paar 32-Bit-Ganzzahlen. Das Zahlenpaar stellt einen Bruch dar, wobei die erste Ganzzahl der Zähler und die zweite Ganzzahl der Nenner ist. Legt festValueType Eigentum zuValueTypeRational , und setzt dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und zwei Arrays mit 32-Bit-Ganzzahlen. Die beiden Arrays stellen ein Array von Brüchen dar. Setzt dieValueType Eigentum zuValueTypeRational , und setzt dieNumberOfValuesEigenschaft auf die Anzahl der Elemente in der*numerator* Array, das mit der Anzahl von elements in der identisch sein muss*denominator* Reihe. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und ein Paar 64-Bit-Ganzzahlen. Das Ganzzahlpaar stellt einen Bereich von Ganzzahlen dar, wobei die erste Ganzzahl die kleinste Zahl im Bereich und die zweite Ganzzahl die größte Zahl im Bereich ist. Legt festValueType Eigentum zuValueTypeLongRange , und setzt dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und zwei Arrays mit 64-Bit-Ganzzahlen. Die beiden Arrays stellen ein Array ganzzahliger Bereiche dar. Legt die festValueType Eigentum zuValueTypeLongRange , und setzt dieNumberOfValuesEigenschaft auf die Anzahl der Elemente in der*rangebegin* Array, das mit der Anzahl von elements in der identisch sein muss*rangeend* array. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder -Objekt und drei Ganzzahlen, die die Anzahl der Werte, den Datentyp der Werte, und einen Zeiger auf die in der gespeicherten Werte angebenEncoderParameter Objekt. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und vier 32-Bit-Ganzzahlen. Die vier Ganzzahlen stellen einen Bereich von Brüchen dar. Die ersten beiden Ganzzahlen stellen den kleinsten Bruch im Bereich dar, und die verbleibenden zwei Ganzzahlen stellen den größten Bruch im Bereich dar. Setzt dieValueType Eigentum an ValueTypeRationalRange , und sets dieNumberOfValues Eigenschaft zu 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Initialisiert eine neue Instanz von[`EncoderParameter`](../encoderparameter)Klasse mit dem angegebenen Encoder Objekt und vier Arrays von 32-Bit-Ganzzahlen. Die vier Arrays stellen ein Array rationaler Bereiche dar. Ein rationaler Bereich ist die Menge aller Brüche von einem minimalen Bruchwert bis zu einem maximalen Bruchwert. Legt festValueType Eigentum zuValueTypeRationalRange , und setzt dieNumberOfValues Eigenschaft auf die Anzahl der Elemente in die*numerator1* Array, das der Anzahl der Elemente in den anderen drei Arrays entsprechen muss. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Ruft ab oder setzt dieEncoder damit verbundenes ObjektEncoderParameter Objekt. DieEncoder -Objekt kapselt den global eindeutigen Bezeichner (GUID) ein, der die Kategorie angibt (zQuality ,ColorDepth , oderCompression ) des darin hinterlegten ParametersEncoderParameter Objekt. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Ruft die Anzahl der Elemente im Array der darin gespeicherten Werte abEncoderParameter Objekt. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Gibt alle von diesem verwendeten Ressourcen freiEncoderParameter Objekt. |

### Siehe auch

* namensraum [System.Drawing.Imaging](../../system.drawing.imaging)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
