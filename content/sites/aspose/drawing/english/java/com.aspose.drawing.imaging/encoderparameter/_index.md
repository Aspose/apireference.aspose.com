---
title: EncoderParameter
second_title: Aspose.Drawing for Java API Reference
description: Used to pass a value or an array of values to an image encoder.
type: docs
weight: 20
url: /java/com.aspose.drawing.imaging/encoderparameter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class EncoderParameter implements System.IDisposable
```

Used to pass a value, or an array of values, to an image encoder.
## Constructors

| Constructor | Description |
| --- | --- |
| [EncoderParameter(Encoder encoder, byte value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one unsigned 8-bit integer. |
| [EncoderParameter(Encoder encoder, byte value, boolean undefined)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte-boolean-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one 8-bit value. |
| [EncoderParameter(Encoder encoder, short value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-short-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one, 16-bit integer. |
| [EncoderParameter(Encoder encoder, long value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-long-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one 64-bit integer. |
| [EncoderParameter(Encoder encoder, int numerator, int denominator)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified \{@link \#\#System\} object and a pair of 32-bit integers. |
| [EncoderParameter(Encoder encoder, long rangebegin, long rangeend)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-long-long-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and a pair of 64-bit integers. |
| [EncoderParameter(Encoder encoder, int numerator1, int demoninator1, int numerator2, int demoninator2)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-int-int-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and four, 32-bit integers. |
| [EncoderParameter(Encoder encoder, String value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-java.lang.String-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and a character string. |
| [EncoderParameter(Encoder encoder, byte[] value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of unsigned 8-bit integers. |
| [EncoderParameter(Encoder encoder, byte[] value, boolean undefined)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte---boolean-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of bytes. |
| [EncoderParameter(Encoder encoder, short[] value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-short---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of 16-bit integers. |
| [EncoderParameter(Encoder encoder, long[] value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-long---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of 64-bit integers. |
| [EncoderParameter(Encoder encoder, int[] numerator, int[] denominator)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-int---int---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and two arrays of 32-bit integers. |
| [EncoderParameter(Encoder encoder, long[] rangebegin, long[] rangeend)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-long---long---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and two arrays of 64-bit integers. |
| [EncoderParameter(Encoder encoder, int[] numerator1, int[] denominator1, int[] numerator2, int[] denominator2)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-int---int---int---int---) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and four arrays of 32-bit integers. |
| [EncoderParameter(Encoder encoder, int numberOfValues, int type, int value)](#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-int-) | Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and three integers that specify the number of values, the data type of the values, and a pointer to the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
## Methods

| Method | Description |
| --- | --- |
| [getEncoder()](#getEncoder--) | Gets the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| [setEncoder(Encoder value)](#setEncoder-com.aspose.drawing.imaging.Encoder-) | Sets the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| [getNumberOfValues()](#getNumberOfValues--) | Gets the number of elements in the array of values stored in this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| [dispose()](#dispose--) | Releases all resources used by this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
### EncoderParameter(Encoder encoder, byte value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte-}
```
public EncoderParameter(Encoder encoder, byte value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one unsigned 8-bit integer. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeByte`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | byte | An 8-bit unsigned integer that specifies the value stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, byte value, boolean undefined) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte-boolean-}
```
public EncoderParameter(Encoder encoder, byte value, boolean undefined)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one 8-bit value. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeUndefined` or `F:EncoderParameterValueType.ValueTypeByte`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | byte | A byte that specifies the value stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| undefined | boolean | If true, the `P:EncoderParameter.ValueType` property is set to `F:EncoderParameterValueType.ValueTypeUndefined`; otherwise, the `P:EncoderParameter.ValueType` property is set to `F:EncoderParameterValueType.ValueTypeByte`. |

### EncoderParameter(Encoder encoder, short value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-short-}
```
public EncoderParameter(Encoder encoder, short value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one, 16-bit integer. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeShort`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | short | A 16-bit integer that specifies the value stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. Must be nonnegative. |

### EncoderParameter(Encoder encoder, long value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-long-}
```
public EncoderParameter(Encoder encoder, long value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and one 64-bit integer. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeLong` (32 bits), and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | long | A 64-bit integer that specifies the value stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, int numerator, int denominator) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-}
```
public EncoderParameter(Encoder encoder, int numerator, int denominator)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified \{@link \#\#System\} object and a pair of 32-bit integers. The pair of integers represents a fraction, the first integer being the numerator, and the second integer being the denominator. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeRational`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| numerator | int | A 32-bit integer that represents the numerator of a fraction. Must be nonnegative. |
| denominator | int | A 32-bit integer that represents the denominator of a fraction. Must be nonnegative. |

### EncoderParameter(Encoder encoder, long rangebegin, long rangeend) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-long-long-}
```
public EncoderParameter(Encoder encoder, long rangebegin, long rangeend)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and a pair of 64-bit integers. The pair of integers represents a range of integers, the first integer being the smallest number in the range, and the second integer being the largest number in the range. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeLongRange`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| rangebegin | long | A 64-bit integer that represents the smallest number in a range of integers. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| rangeend | long | A 64-bit integer that represents the largest number in a range of integers. Must be nonnegative. This parameter is converted to a 32-bit integer before it is stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, int numerator1, int demoninator1, int numerator2, int demoninator2) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-int-int-}
```
public EncoderParameter(Encoder encoder, int numerator1, int demoninator1, int numerator2, int demoninator2)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and four, 32-bit integers. The four integers represent a range of fractions. The first two integers represent the smallest fraction in the range, and the remaining two integers represent the largest fraction in the range. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeRationalRange`, and sets the `P:EncoderParameter.NumberOfValues` property to 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| numerator1 | int | A 32-bit integer that represents the numerator of the smallest fraction in the range. Must be nonnegative. |
| demoninator1 | int | A 32-bit integer that represents the denominator of the smallest fraction in the range. Must be nonnegative. |
| numerator2 | int | A 32-bit integer that represents the numerator of the largest fraction in the range. Must be nonnegative. |
| demoninator2 | int | A 32-bit integer that represents the denominator of the largest fraction in the range. Must be nonnegative. |

### EncoderParameter(Encoder encoder, String value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-java.lang.String-}
```
public EncoderParameter(Encoder encoder, String value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and a character string. The string is converted to a null-terminated ASCII string before it is stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeAscii`, and sets the `P:EncoderParameter.NumberOfValues` property to the length of the ASCII string including the NULL terminator.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | java.lang.String | A String that specifies the value stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, byte[] value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte---}
```
public EncoderParameter(Encoder encoder, byte[] value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of unsigned 8-bit integers. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeByte`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | byte[] | An array of 8-bit unsigned integers that specifies the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, byte[] value, boolean undefined) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-byte---boolean-}
```
public EncoderParameter(Encoder encoder, byte[] value, boolean undefined)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of bytes. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeUndefined` or `F:EncoderParameterValueType.ValueTypeByte`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | byte[] | An array of bytes that specifies the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| undefined | boolean | If true, the `P:EncoderParameter.ValueType` property is set to `F:EncoderParameterValueType.ValueTypeUndefined`; otherwise, the `P:EncoderParameter.ValueType` property is set to `F:EncoderParameterValueType.ValueTypeByte`. |

### EncoderParameter(Encoder encoder, short[] value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-short---}
```
public EncoderParameter(Encoder encoder, short[] value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of 16-bit integers. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeShort`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | short[] | An array of 16-bit integers that specifies the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The integers in the array must be nonnegative. |

### EncoderParameter(Encoder encoder, long[] value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-long---}
```
public EncoderParameter(Encoder encoder, long[] value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and an array of 64-bit integers. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeLong` (32-bit), and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| value | long[] | An array of 64-bit integers that specifies the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### EncoderParameter(Encoder encoder, int[] numerator, int[] denominator) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-int---int---}
```
public EncoderParameter(Encoder encoder, int[] numerator, int[] denominator)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and two arrays of 32-bit integers. The two arrays represent an array of fractions. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeRational`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the `numerator` array, which must be the same as the number of elements in the `denominator` array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| numerator | int[] | An array of 32-bit integers that specifies the numerators of the fractions. The integers in the array must be nonnegative. |
| denominator | int[] | An array of 32-bit integers that specifies the denominators of the fractions. The integers in the array must be nonnegative. A denominator of a given index is paired with the numerator of the same index. |

### EncoderParameter(Encoder encoder, long[] rangebegin, long[] rangeend) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-long---long---}
```
public EncoderParameter(Encoder encoder, long[] rangebegin, long[] rangeend)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and two arrays of 64-bit integers. The two arrays represent an array integer ranges. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeLongRange`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the `rangebegin` array, which must be the same as the number of elements in the `rangeend` array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| rangebegin | long[] | An array of 64-bit integers that specifies the minimum values for the integer ranges. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |
| rangeend | long[] | An array of 64-bit integers that specifies the maximum values for the integer ranges. The integers in the array must be nonnegative. The 64-bit integers are converted to 32-bit integers before they are stored in the [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) object. A maximum value of a given index is paired with the minimum value of the same index. |

### EncoderParameter(Encoder encoder, int[] numerator1, int[] denominator1, int[] numerator2, int[] denominator2) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-int---int---int---int---}
```
public EncoderParameter(Encoder encoder, int[] numerator1, int[] denominator1, int[] numerator2, int[] denominator2)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and four arrays of 32-bit integers. The four arrays represent an array rational ranges. A rational range is the set of all fractions from a minimum fractional value through a maximum fractional value. Sets the `P:EncoderParameter.ValueType` property to `F:EncoderParameterValueType.ValueTypeRationalRange`, and sets the `P:EncoderParameter.NumberOfValues` property to the number of elements in the `numerator1` array, which must be the same as the number of elements in the other three arrays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| numerator1 | int[] | An array of 32-bit integers that specifies the numerators of the minimum values for the ranges. The integers in the array must be nonnegative. |
| denominator1 | int[] | An array of 32-bit integers that specifies the denominators of the minimum values for the ranges. The integers in the array must be nonnegative. |
| numerator2 | int[] | An array of 32-bit integers that specifies the numerators of the maximum values for the ranges. The integers in the array must be nonnegative. |
| denominator2 | int[] | An array of 32-bit integers that specifies the denominators of the maximum values for the ranges. The integers in the array must be nonnegative. |

### EncoderParameter(Encoder encoder, int numberOfValues, int type, int value) {#EncoderParameter-com.aspose.drawing.imaging.Encoder-int-int-int-}
```
public EncoderParameter(Encoder encoder, int numberOfValues, int type, int value)
```


Initializes a new instance of the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) class with the specified `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object and three integers that specify the number of values, the data type of the values, and a pointer to the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoder | [Encoder](../../com.aspose.drawing.imaging/encoder) | An `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object that encapsulates the globally unique identifier of the parameter category. |
| numberOfValues | int | An integer that specifies the number of values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The `P:EncoderParameter.NumberOfValues` property is set to this value. |
| type | int | A member of the `EncoderParameterValueType` enumeration that specifies the data type of the values stored in the [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The Type and `P:EncoderParameter.ValueType` properties are set to this value. |
| value | int | A pointer to an array of values of the type specified by the `type` parameter. |

### getEncoder() {#getEncoder--}
```
public Encoder getEncoder()
```


Gets the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object encapsulates the globally unique identifier (GUID) that specifies the category (for example `F:Encoder.QUALITY`, `F:Encoder.COLOR\_DEPTH`, or `F:Encoder.COMPRESSION`) of the parameter stored in this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.

**Returns:**
[Encoder](../../com.aspose.drawing.imaging/encoder) - the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.
### setEncoder(Encoder value) {#setEncoder-com.aspose.drawing.imaging.Encoder-}
```
public void setEncoder(Encoder value)
```


Sets the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. The `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object encapsulates the globally unique identifier (GUID) that specifies the category (for example `F:Encoder.QUALITY`, `F:Encoder.COLOR\_DEPTH`, or `F:Encoder.COMPRESSION`) of the parameter stored in this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Encoder](../../com.aspose.drawing.imaging/encoder) | the `Encoder`([.getEncoder](../../null/\#getEncoder)/[.setEncoder(Encoder)](../../null/\#setEncoder-Encoder-)) object associated with this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object. |

### getNumberOfValues() {#getNumberOfValues--}
```
public int getNumberOfValues()
```


Gets the number of elements in the array of values stored in this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.

**Returns:**
int - the number of elements in the array of values stored in this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this [EncoderParameter](../../com.aspose.drawing.imaging/encoderparameter) object.

