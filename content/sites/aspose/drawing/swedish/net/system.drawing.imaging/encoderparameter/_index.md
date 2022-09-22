---
title: EncoderParameter
second_title: Aspose.Drawing för .NET API Referens
description: Används för att skicka ett värde eller en matris med värden till en bildkodare.
type: docs
weight: 700
url: /sv/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Används för att skicka ett värde, eller en matris med värden, till en bildkodare.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter) klass med den angivnaEncoder object och ett osignerat 8-bitars heltal. Ställer inValueType egenskap tillValueTypeByte , och ställer inNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och en matris med osignerade 8-bitars heltal. Ställer inValueType egendom tillValueTypeByte , och ställer inNumberOfValues egenskapen till antalet element i arrayen. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och ett 64-bitars heltal. Ställer inValueType egenskap tillValueTypeLong (32 bitar) och ställer in the NumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och en matris med 64-bitars heltal. Ställer inValueType egenskap tillValueTypeLong (32-bitars), och sets theNumberOfValues egenskapen till antalet element i arrayen. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och ett, 16-bitars heltal. Ställer inValueType egenskap tillValueTypeShort , och ställer inNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och en matris med 16-bitars heltal. Ställer inValueType egenskap tillValueTypeShort , och ställer in the NumberOfValues egenskapen till antalet element i arrayen. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och en teckensträng. Strängen konverteras till en nollterminerad ASCII-sträng innan den lagras iEncoderParameter objekt. Ställer inValueType egenskap tillValueTypeAscii , och set denNumberOfValues egenskapen till längden på ASCII-strängen inklusive NULL-terminatorn. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och ett 8-bitars värde. Ställer inValueType egenskap tillValueTypeUndefined ellerValueTypeByte , och ställer inNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och en array av byte. Ställer inValueType egenskap tillValueTypeUndefined or ValueTypeByte , och ställer inNumberOfValues egenskapen till antalet element i arrayen. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoderobjekt och ett par 32-bitars heltal. Heltalsparet representerar ett bråk, det första heltal är täljaren, och det andra heltal är nämnaren. Ställer inValueType egendom tillValueTypeRational , och ställer inNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och två matriser med 32-bitars heltal. De två arrayerna representerar en array av bråk. Ställer inValueType egendom tillValueTypeRational , och ställer inNumberOfValuesegenskapen till antalet element i*numerator* array, som måste vara samma som antalet element i*denominator* array. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och ett par 64-bitars heltal. Heltalsparet representerar ett intervall av heltal, det första heltal är det minsta talet i intervallet, och det andra heltal är det största talet i intervallet. AngerValueType egendom tillValueTypeLongRange , och ställer inNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och två matriser med 64-bitars heltal. De två arrayerna representerar en array heltalsområden. Ställer inValueType egendom tillValueTypeLongRange , och ställer inNumberOfValuesegenskapen till antalet element i*rangebegin* array, som måste vara samma som antalet element i*rangeend* array. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och tre heltal som anger antalet värden, datatypen för värdena, och en pekare till de värden som lagras iEncoderParameter objekt. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och fyra 32-bitars heltal. De fyra heltalen representerar ett intervall av bråk. De två första heltalen representerar den minsta bråkdelen i intervallet, och de återstående två heltalen representerar största bråkdelen i intervallet. Ställer inValueType egenskap till ValueTypeRationalRange , och set denNumberOfValues egenskap till 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Initierar en ny instans av[`EncoderParameter`](../encoderparameter)klass med specificerad Encoder objekt och fyra matriser med 32-bitars heltal. De fyra matriserna representerar en matris rationella intervall. Ett rationellt intervall är mängden av alla bråk från ett lägsta bråkvärde till ett maximalt bråkvärde. Ställer inValueType egendom tillValueTypeRationalRange , och ställer inNumberOfValues egenskapen till antalet element i the*numerator1* array, som måste vara samma som antalet element i de andra tre arrayerna. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Hämtar eller ställer inEncoder objekt associerat med dettaEncoderParameter objekt. DenEncoder objekt kapslar in den globalt unika identifieraren (GUID) som anger kategorin (till exempelQuality ,ColorDepth , ellerCompression ) av parametern som är lagrad i dennaEncoderParameter objekt. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Hämtar antalet element i arrayen av värden lagrade i dennaEncoderParameter objekt. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Frigör alla resurser som används av dettaEncoderParameter objekt. |

### Se även

* namnutrymme [System.Drawing.Imaging](../../system.drawing.imaging)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
