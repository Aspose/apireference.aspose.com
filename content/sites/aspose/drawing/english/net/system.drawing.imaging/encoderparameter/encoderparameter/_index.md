---
title: EncoderParameter
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 10
url: /net/system.drawing.imaging/encoderparameter/encoderparameter/
---
## EncoderParameter constructor (1 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and one unsigned 8-bit integer. Sets the ValueType property to ValueTypeByte, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, byte value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Byte | An 8-bit unsigned integer that specifies the value stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (2 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and one 8-bit value. Sets the ValueType property to ValueTypeUndefined or ValueTypeByte, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, byte value, bool undefined)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Byte | A byte that specifies the value stored in the EncoderParameter object. |
| undefined | Boolean | If true, the ValueType property is set to ValueTypeUndefined; otherwise, the ValueType property is set to ValueTypeByte. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (3 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and one, 16-bit integer. Sets the ValueType property to ValueTypeShort, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, short value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Int16 | A 16-bit integer that specifies the value stored in the EncoderParameter object. Must be nonnegative. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (4 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and one 64-bit integer. Sets the ValueType property to ValueTypeLong (32 bits), and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, long value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Int64 | A 64-bit integer that specifies the value stored in the EncoderParameter object. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (5 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and a pair of 32-bit integers. The pair of integers represents a fraction, the first integer being the numerator, and the second integer being the denominator. Sets the ValueType property to ValueTypeRational, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, int numerator, int denominator)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| numerator | Int32 | A 32-bit integer that represents the numerator of a fraction. Must be nonnegative. |
| denominator | Int32 | A 32-bit integer that represents the denominator of a fraction. Must be nonnegative. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (6 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and a pair of 64-bit integers. The pair of integers represents a range of integers, the first integer being the smallest number in the range, and the second integer being the largest number in the range. Sets the ValueType property to ValueTypeLongRange, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, long rangebegin, long rangeend)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| rangebegin | Int64 | A 64-bit integer that represents the smallest number in a range of integers. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the EncoderParameter object. |
| rangeend | Int64 | A 64-bit integer that represents the largest number in a range of integers. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (7 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and four, 32-bit integers. The four integers represent a range of fractions. The first two integers represent the smallest fraction in the range, and the remaining two integers represent the largest fraction in the range. Sets the ValueType property to ValueTypeRationalRange, and sets the NumberOfValues property to 1.

```csharp
public EncoderParameter(Encoder encoder, int numerator1, int demoninator1, int numerator2, 
    int demoninator2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| numerator1 | Int32 | A 32-bit integer that represents the numerator of the smallest fraction in the range. Must be nonnegative. |
| demoninator1 | Int32 | A 32-bit integer that represents the denominator of the smallest fraction in the range. Must be nonnegative. |
| numerator2 | Int32 | A 32-bit integer that represents the numerator of the largest fraction in the range. Must be nonnegative. |
| demoninator2 | Int32 | A 32-bit integer that represents the denominator of the largest fraction in the range. Must be nonnegative. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (8 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and a character string. The string is converted to a null-terminated ASCII string before it is stored in the EncoderParameter object. Sets the ValueType property to ValueTypeAscii, and sets the NumberOfValues property to the length of the ASCII string including the NULL terminator.

```csharp
public EncoderParameter(Encoder encoder, string value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | String | A String that specifies the value stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (9 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and an array of unsigned 8-bit integers. Sets the ValueType property to ValueTypeByte, and sets the NumberOfValues property to the number of elements in the array.

```csharp
public EncoderParameter(Encoder encoder, byte[] value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Byte[] | An array of 8-bit unsigned integers that specifies the values stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (10 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and an array of bytes. Sets the ValueType property to ValueTypeUndefined or ValueTypeByte, and sets the NumberOfValues property to the number of elements in the array.

```csharp
public EncoderParameter(Encoder encoder, byte[] value, bool undefined)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Byte[] | An array of bytes that specifies the values stored in the EncoderParameter object. |
| undefined | Boolean | If true, the ValueType property is set to ValueTypeUndefined; otherwise, the ValueType property is set to ValueTypeByte. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (11 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and an array of 16-bit integers. Sets the ValueType property to ValueTypeShort, and sets the NumberOfValues property to the number of elements in the array.

```csharp
public EncoderParameter(Encoder encoder, short[] value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Int16[] | An array of 16-bit integers that specifies the values stored in the EncoderParameter object. The integers in the array must be nonnegative. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (12 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and an array of 64-bit integers. Sets the ValueType property to ValueTypeLong (32-bit), and sets the NumberOfValues property to the number of elements in the array.

```csharp
public EncoderParameter(Encoder encoder, long[] value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| value | Int64[] | An array of 64-bit integers that specifies the values stored in the EncoderParameter object. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the EncoderParameter object. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (13 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and two arrays of 32-bit integers. The two arrays represent an array of fractions. Sets the ValueType property to ValueTypeRational, and sets the NumberOfValues property to the number of elements in the *numerator* array, which must be the same as the number of elements in the *denominator* array.

```csharp
public EncoderParameter(Encoder encoder, int[] numerator, int[] denominator)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| numerator | Int32[] | An array of 32-bit integers that specifies the numerators of the fractions. The integers in the array must be nonnegative. |
| denominator | Int32[] | An array of 32-bit integers that specifies the denominators of the fractions. The integers in the array must be nonnegative. A denominator of a given index is paired with the numerator of the same index. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (14 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and two arrays of 64-bit integers. The two arrays represent an array integer ranges. Sets the ValueType property to ValueTypeLongRange, and sets the NumberOfValues property to the number of elements in the *rangebegin* array, which must be the same as the number of elements in the *rangeend* array.

```csharp
public EncoderParameter(Encoder encoder, long[] rangebegin, long[] rangeend)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| rangebegin | Int64[] | An array of 64-bit integers that specifies the minimum values for the integer ranges. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the EncoderParameter object. |
| rangeend | Int64[] | An array of 64-bit integers that specifies the maximum values for the integer ranges. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the EncoderParameters object. A maximum value of a given index is paired with the minimum value of the same index. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (15 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and four arrays of 32-bit integers. The four arrays represent an array rational ranges. A rational range is the set of all fractions from a minimum fractional value through a maximum fractional value. Sets the ValueType property to ValueTypeRationalRange, and sets the NumberOfValues property to the number of elements in the *numerator1* array, which must be the same as the number of elements in the other three arrays.

```csharp
public EncoderParameter(Encoder encoder, int[] numerator1, int[] denominator1, int[] numerator2, 
    int[] denominator2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| numerator1 | Int32[] | An array of 32-bit integers that specifies the numerators of the minimum values for the ranges. The integers in the array must be nonnegative. |
| denominator1 | Int32[] | An array of 32-bit integers that specifies the denominators of the minimum values for the ranges. The integers in the array must be nonnegative. |
| numerator2 | Int32[] | An array of 32-bit integers that specifies the numerators of the maximum values for the ranges. The integers in the array must be nonnegative. |
| denominator2 | Int32[] | An array of 32-bit integers that specifies the denominators of the maximum values for the ranges. The integers in the array must be nonnegative. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

---

## EncoderParameter constructor (16 of 16)

Initializes a new instance of the [`EncoderParameter`](../../encoderparameter) class with the specified Encoder object and three integers that specify the number of values, the data type of the values, and a pointer to the values stored in the EncoderParameter object.

```csharp
public EncoderParameter(Encoder encoder, int numberOfValues, int type, int value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| encoder | Encoder | An Encoder object that encapsulates the globally unique identifier of the parameter category. |
| numberOfValues | Int32 | An integer that specifies the number of values stored in the EncoderParameter object. The NumberOfValues property is set to this value. |
| type | Int32 | A member of the EncoderParameterValueType enumeration that specifies the data type of the values stored in the EncoderParameter object. The Type and ValueType properties are set to this value. |
| value | Int32 | A pointer to an array of values of the type specified by the *type* parameter. |

### See Also

* class [Encoder](../../encoder)
* class [EncoderParameter](../../encoderparameter)
* namespace [System.Drawing.Imaging](../../encoderparameter)
* assembly [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
