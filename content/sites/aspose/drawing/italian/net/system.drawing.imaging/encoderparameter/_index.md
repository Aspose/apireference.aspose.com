---
title: EncoderParameter
second_title: Aspose.Drawing per .NET API Reference
description: Utilizzato per passare un valore o una matrice di valori a un codificatore di immagini.
type: docs
weight: 700
url: /it/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Utilizzato per passare un valore, o una matrice di valori, a un codificatore di immagini.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter) classe con il specificatoEncoder object e un intero a 8 bit senza segno. Imposta ilValueType proprietà aValueTypeByte , e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e una matrice di interi a 8 bit senza segno. Imposta ilValueType proprietà aValueTypeByte , e imposta ilNumberOfValues proprietà al numero di elementi nell'array. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e un intero a 64 bit. Imposta ilValueType proprietà aValueTypeLong (32 bit) e imposta il NumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e una matrice di numeri interi a 64 bit. Imposta ilValueType proprietà aValueTypeLong (32 bit) e imposta ilNumberOfValues proprietà al numero di elementi nell'array. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e un intero a 16 bit. Imposta ilValueType proprietà aValueTypeShort , e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e una matrice di numeri interi a 16 bit. Imposta ilValueType proprietà aValueTypeShort e imposta il NumberOfValues proprietà al numero di elementi nell'array. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e una stringa di caratteri. La stringa viene convertita in una stringa ASCII con terminazione null prima di viene archiviata inEncoderParameter oggetto. Imposta ilValueType proprietà aValueTypeAscii e imposta ilNumberOfValues proprietà alla lunghezza della stringa ASCII incluso il terminatore NULL. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e un valore a 8 bit. Imposta ilValueType proprietà aValueTypeUndefined oValueTypeByte , e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e un array di byte. Imposta ilValueType proprietà aValueTypeUndefined o ValueTypeByte , e imposta ilNumberOfValues al numero di elementi nell'array. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoderoggetto e una coppia di numeri interi a 32 bit. La coppia di numeri interi rappresenta una frazione, il primo intero è il numeratore e il secondo intero è il denominatore. Imposta ilValueType proprietà aValueTypeRational , e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e due matrici di numeri interi a 32 bit. I due array rappresentano un array di frazioni. Imposta ilValueType proprietà aValueTypeRational , e imposta ilNumberOfValuesproprietà al numero di elementi nella*numerator* array, che deve essere uguale al numero di elementi nel file*denominator* Vettore. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e una coppia di numeri interi a 64 bit. La coppia di numeri interi rappresenta un intervallo di interi, il primo intero è il numero più piccolo nell'intervallo e il secondo intero è il numero più grande nell'intervallo. Imposta ilValueType proprietà aValueTypeLongRange , e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e due matrici di numeri interi a 64 bit. I due array rappresentano un array intero ranges. Imposta ilValueType proprietà aValueTypeLongRange , e imposta ilNumberOfValuesproprietà al numero di elementi nella*rangebegin* array, che deve essere uguale al numero di elementi nel file*rangeend* matrice. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e tre numeri interi che specificano il numero di valori, il tipo di dati dei valori, e un puntatore ai valori memorizzati nelEncoderParameter oggetto. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e quattro numeri interi a 32 bit. I quattro numeri interi rappresentano un intervallo di frazioni. I primi due interi rappresentano la frazione più piccola nell'intervallo e i restanti due interi rappresentano la frazione più grande nell'intervallo. Imposta ilValueType proprietà a ValueTypeRationalRange e imposta ilNumberOfValues proprietà a 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Inizializza una nuova istanza di[`EncoderParameter`](../encoderparameter)classe con il specificatoEncoder oggetto e quattro matrici di numeri interi a 32 bit. Le quattro matrici rappresentano una matrice di intervalli razionali. Un intervallo razionale è l'insieme di tutte le frazioni da un valore frazionario minimo a un valore frazionario massimo. Imposta ilValueType proprietà aValueTypeRationalRange , e imposta ilNumberOfValues proprietà al numero di elementi in the*numerator1* array, che deve essere uguale al numero di elementi negli altri tre array. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Ottiene o imposta ilEncoder oggetto associato a questoEncoderParameter oggetto. IlEncoder oggetto incapsula l'identificatore univoco globale (GUID) che specifica la categoria (ad esempioQuality ,ColorDepth , oCompression ) del parametro in esso memorizzatoEncoderParameter oggetto. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Ottiene il numero di elementi nell'array di valori archiviati in questoEncoderParameter oggetto. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Rilascia tutte le risorse utilizzate da questoEncoderParameter oggetto. |

### Guarda anche

* spazio dei nomi [System.Drawing.Imaging](../../system.drawing.imaging)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
