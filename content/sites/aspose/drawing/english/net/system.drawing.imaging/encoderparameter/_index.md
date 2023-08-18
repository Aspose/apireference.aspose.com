---
title: Class EncoderParameter
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.EncoderParameter class. Used to pass a value or an array of values to an image encoder
type: docs
weight: 710
url: /net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Used to pass a value, or an array of values, to an image encoder.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and one unsigned 8-bit integer. Sets the ValueType property to ValueTypeByte, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and an array of unsigned 8-bit integers. Sets the ValueType property to ValueTypeByte, and sets the NumberOfValues property to the number of elements in the array. |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and one 64-bit integer. Sets the ValueType property to ValueTypeLong (32 bits), and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and an array of 64-bit integers. Sets the ValueType property to ValueTypeLong (32-bit), and sets the NumberOfValues property to the number of elements in the array. |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and one, 16-bit integer. Sets the ValueType property to ValueTypeShort, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and an array of 16-bit integers. Sets the ValueType property to ValueTypeShort, and sets the NumberOfValues property to the number of elements in the array. |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and a character string. The string is converted to a null-terminated ASCII string before it is stored in the EncoderParameter object. Sets the ValueType property to ValueTypeAscii, and sets the NumberOfValues property to the length of the ASCII string including the NULL terminator. |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and one 8-bit value. Sets the ValueType property to ValueTypeUndefined or ValueTypeByte, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and an array of bytes. Sets the ValueType property to ValueTypeUndefined or ValueTypeByte, and sets the NumberOfValues property to the number of elements in the array. |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and a pair of 32-bit integers. The pair of integers represents a fraction, the first integer being the numerator, and the second integer being the denominator. Sets the ValueType property to ValueTypeRational, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and two arrays of 32-bit integers. The two arrays represent an array of fractions. Sets the ValueType property to ValueTypeRational, and sets the NumberOfValues property to the number of elements in the *numerator* array, which must be the same as the number of elements in the *denominator* array. |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and a pair of 64-bit integers. The pair of integers represents a range of integers, the first integer being the smallest number in the range, and the second integer being the largest number in the range. Sets the ValueType property to ValueTypeLongRange, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and two arrays of 64-bit integers. The two arrays represent an array integer ranges. Sets the ValueType property to ValueTypeLongRange, and sets the NumberOfValues property to the number of elements in the *rangebegin* array, which must be the same as the number of elements in the *rangeend* array. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and three integers that specify the number of values, the data type of the values, and a pointer to the values stored in the EncoderParameter object. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and four, 32-bit integers. The four integers represent a range of fractions. The first two integers represent the smallest fraction in the range, and the remaining two integers represent the largest fraction in the range. Sets the ValueType property to ValueTypeRationalRange, and sets the NumberOfValues property to 1. |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | Initializes a new instance of the `EncoderParameter` class with the specified Encoder object and four arrays of 32-bit integers. The four arrays represent an array rational ranges. A rational range is the set of all fractions from a minimum fractional value through a maximum fractional value. Sets the ValueType property to ValueTypeRationalRange, and sets the NumberOfValues property to the number of elements in the *numerator1* array, which must be the same as the number of elements in the other three arrays. |

## Properties

| Name | Description |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | Gets or sets the Encoder object associated with this EncoderParameter object. The Encoder object encapsulates the globally unique identifier (GUID) that specifies the category (for example Quality, ColorDepth, or Compression) of the parameter stored in this EncoderParameter object. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | Gets the number of elements in the array of values stored in this EncoderParameter object. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | Releases all resources used by this EncoderParameter object. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


