---
title: Class EncoderParameter
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.EncoderParameter klas. Wordt gebruikt om een waarde of een reeks waarden door te geven aan een afbeeldingsencoder.
type: docs
weight: 700
url: /nl/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Wordt gebruikt om een waarde, of een reeks waarden, door te geven aan een afbeeldingsencoder.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | Initialiseert een nieuw exemplaar van het`EncoderParameter` klasse met de gespecificeerdeEncoder object en één niet-ondertekend 8-bits geheel getal. Stelt deValueType eigenschap aanValueTypeByte , en stelt deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een reeks niet-ondertekende 8-bits gehele getallen. Stelt deValueType eigendom aanValueTypeByte , en stelt deNumberOfValues eigenschap aan het aantal elementen in de array. |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en één 64-bits geheel getal. Stelt deValueType eigenschap aanValueTypeLong (32 bits), en stelt the inNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een array van 64-bits gehele getallen. Stelt deValueType eigendom aanValueTypeLong (32-bit), en sets deNumberOfValues eigenschap aan het aantal elementen in de array. |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en één 16-bits geheel getal. Stelt deValueType eigenschap aanValueTypeShort , en stelt deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een array van 16-bits gehele getallen. Stelt deValueType eigendom aanValueTypeShort , en stelt the inNumberOfValues eigenschap aan het aantal elementen in de array. |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een tekenreeks. De tekenreeks wordt geconverteerd naar een null-beëindigde ASCII-tekenreeks voordat deze wordt opgeslagen in deEncoderParameter voorwerp. Stelt deValueType eigendom aanValueTypeAscii , en sets deNumberOfValues eigenschap aan de lengte van de ASCII-tekenreeks inclusief de NULL-terminator. |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en één 8-bits waarde. Stelt deValueType eigenschap aanValueTypeUndefined ofValueTypeByte , en stelt deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een reeks bytes. Stelt deValueType eigendom aanValueTypeUndefined of ValueTypeByte , en stelt deNumberOfValues eigenschap aan het aantal elementen in de array. |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoderobject en een paar 32-bits gehele getallen. Het paar gehele getallen vertegenwoordigt een breuk, waarbij het eerste gehele getal de teller is en het tweede gehele getal de noemer. Stelt deValueType eigendom aanValueTypeRational , en stelt deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en twee arrays van 32-bits gehele getallen. De twee arrays vertegenwoordigen een array van breuken. Stelt deValueType eigendom aanValueTypeRational , en stelt deNumberOfValueseigenschap aan het aantal elementen in de*numerator* array, die hetzelfde moet zijn als het aantal elementen in het*denominator* reeks. |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en een paar 64-bits gehele getallen. Het paar gehele getallen vertegenwoordigt een bereik van gehele getallen, het eerste gehele getal is het kleinste getal in het bereik en het tweede gehele getal is het grootste getal in het bereik. Stelt deValueType eigendom aanValueTypeLongRange , en stelt deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en twee arrays van 64-bits gehele getallen. De twee arrays vertegenwoordigen een array integer ranges. Stelt deValueType eigendom aanValueTypeLongRange , en stelt deNumberOfValueseigenschap aan het aantal elementen in de*rangebegin* array, die hetzelfde moet zijn als het aantal elementen in het*rangeend* matrix. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en drie gehele getallen die het aantal waarden specificeren, het gegevenstype van de waarden, en een verwijzing naar de waarden die zijn opgeslagen in deEncoderParameter object. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en vier 32-bits gehele getallen. De vier gehele getallen vertegenwoordigen een bereik van breuken. De eerste twee gehele getallen vertegenwoordigen de kleinste breuk in het bereik en de overige twee gehele getallen vertegenwoordigen de grootste breuk in het bereik. Stelt deValueType eigenschap to ValueTypeRationalRange , en sets deNumberOfValues eigendom tot 1. |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | Initialiseert een nieuw exemplaar van het`EncoderParameter`klasse met de opgegeven Encoder object en vier arrays van 32-bits gehele getallen. De vier arrays vertegenwoordigen een rationele reeks van een reeks. Een rationele reeks is de verzameling van alle breuken van een minimale breukwaarde tot en met een maximale breukwaarde. Stelt deValueType eigendom aanValueTypeRationalRange , en stelt deNumberOfValues eigenschap aan het aantal elementen in de*numerator1* array, die hetzelfde moet zijn als het aantal elementen in de andere drie arrays. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | Haalt of stelt deEncoder object dat hiermee verband houdtEncoderParameter object. DeEncoder object kapselt de globally unique identifier (GUID) in die de categorie specificeert (bijvoorbeeldQuality ,ColorDepth , ofCompression ) van de parameter die hierin is opgeslagenEncoderParameter object. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | Haalt het aantal elementen op in de reeks waarden die hierin is opgeslagenEncoderParameter object. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | Geeft alle bronnen vrij die hierdoor worden gebruiktEncoderParameter object. |

### Zie ook

* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


