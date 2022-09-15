---
title: EncoderParameter
second_title: Referencia de Aspose.Drawing para .NET API
description: Se utiliza para pasar un valor o una matriz de valores a un codificador de imágenes.
type: docs
weight: 700
url: /es/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Se utiliza para pasar un valor, o una matriz de valores, a un codificador de imágenes.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter) clase con el especificadoEncoder object y un entero de 8 bits sin signo. Establece elValueType propiedad aValueTypeByte , y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y una matriz de enteros de 8 bits sin signo. Establece elValueType propiedad aValueTypeByte , y establece elNumberOfValues propiedad al número de elementos en la matriz. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y un entero de 64 bits. Establece elValueType propiedad aValueTypeLong (32 bits) y establece the NumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y una matriz de enteros de 64 bits. Establece elValueType propiedad aValueTypeLong (32 bits) y establece elNumberOfValues propiedad al número de elementos en la matriz. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y un entero de 16 bits. Establece elValueType propiedad aValueTypeShort , y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y una matriz de enteros de 16 bits. Establece elValueType propiedad aValueTypeShort , y establece the NumberOfValues propiedad al número de elementos en la matriz. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y una cadena de caracteres. La cadena se convierte en una cadena ASCII terminada en cero antes se almacena en elEncoderParameter objeto. Establece elValueType propiedad aValueTypeAscii y establece elNumberOfValues propiedad a la longitud de la cadena ASCII, incluido el terminador NULL. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y un valor de 8 bits. Establece elValueType propiedad aValueTypeUndefined oValueTypeByte , y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y una matriz de bytes. Establece elValueType propiedad aValueTypeUndefined o ValueTypeByte , y establece elNumberOfValues propiedad al número de elementos de la matriz. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoderobjeto y un par de enteros de 32 bits. El par de enteros representa una fracción, siendo el primer entero el numerador y el segundo entero el denominador. Establece elValueType propiedad aValueTypeRational , y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y dos matrices de enteros de 32 bits. Las dos matrices representan una matriz de fracciones. Establece elValueType propiedad aValueTypeRational , y establece elNumberOfValuespropiedad al número de elementos en el*numerator* array, que debe ser igual al número de elementos en el*denominator* formación. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y un par de enteros de 64 bits. El par de enteros representa un rango de enteros, siendo el primer entero el número más pequeño del rango y el segundo entero el número más grande del rango. Establece elValueType propiedad aValueTypeLongRange , y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y dos matrices de enteros de 64 bits. Las dos matrices representan rangos enteros de una matriz. Establece elValueType propiedad aValueTypeLongRange , y establece elNumberOfValuespropiedad al número de elementos en el*rangebegin* array, que debe ser igual al número de elementos en el*rangeend* matriz. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y tres enteros que especifican el número de valores, el tipo de datos de los valores, y un puntero a los valores almacenados en elEncoderParameter objeto. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y cuatro enteros de 32 bits. Los cuatro enteros representan un rango de fracciones. Los dos primeros enteros representan la fracción más pequeña del rango, y los dos enteros restantes representan la fracción más grande del rango. Establece elValueType propiedad a ValueTypeRationalRange y establece elNumberOfValues propiedad a 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Inicializa una nueva instancia del[`EncoderParameter`](../encoderparameter)clase con el especificado Encoder objeto y cuatro matrices de enteros de 32 bits. Las cuatro matrices representan rangos racionales de una matriz. Un rango racional es el conjunto de todas las fracciones desde un valor fraccionario mínimo hasta un valor fraccionario máximo. Establece elValueType propiedad aValueTypeRationalRange , y establece elNumberOfValues propiedad al número de elementos en el*numerator1* array, que debe ser igual al número de elementos de los otros tres arrays. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Obtiene o establece elEncoder objeto asociado con esteEncoderParameter objeto. ElEncoder El objeto encapsula el identificador único global (GUID) que especifica la categoría (por ejemploQuality ,ColorDepth , oCompression ) del parámetro almacenado en esteEncoderParameter objeto. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Obtiene el número de elementos en la matriz de valores almacenados en esteEncoderParameter objeto. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Libera todos los recursos utilizados por esteEncoderParameter objeto. |

### Ver también

* espacio de nombres [System.Drawing.Imaging](../../system.drawing.imaging)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
