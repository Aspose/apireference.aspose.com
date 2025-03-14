---
title: WriteLine()
second_title: Aspose.Slides for C++ API Reference
description: Outputs the current line terminator to the standard output stream.
type: docs
weight: 14
url: /cpp/system/console/writeline/
---
## Console::WriteLine() method


Outputs the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine()
```

## Console::WriteLine(const SharedPtr\<T\>\&) method


Outputs the string representation of the specified object followed by the current line terminator to the standard output stream.

```cpp
template<class T> static void System::Console::WriteLine(const SharedPtr<T> &object)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| T | Type of the object to output |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| object | const [SharedPtr](../../sharedptr/)\<T\>\& | [Object](../../object/) to output |

## Console::WriteLine(bool) method


Outputs the string representation of bool value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(bool value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **bool** | The value to output |

## Console::WriteLine(char_t) method


Outputs the specified character value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(char_t value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | char_t | The value to output |

## Console::WriteLine(const ArrayPtr\<char_t\>\&) method


Outputs the string representation of the specified character array followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | const [ArrayPtr](../../arrayptr/)\<char_t\>\& | The array to output |

## Console::WriteLine(const Decimal\&) method


Outputs the string representation of [Decimal](../../decimal/) value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const Decimal &value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | const [Decimal](../../decimal/)\& | The value to output |

## Console::WriteLine(double) method


Outputs the string representation of double-precision floating-point value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(double value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **double** | The value to output |

## Console::WriteLine(float) method


Outputs the string representation of single-precision floating-point value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(float value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **float** | The value to output |

## Console::WriteLine(int32_t) method


Outputs the string representation of 32-bit integer value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(int32_t value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **int32_t** | The value to output |

## Console::WriteLine(int64_t) method


Outputs the string representation of 64-bit integer value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(int64_t value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **int64_t** | The value to output |

## Console::WriteLine(const String\&) method


Outputs the specified string object followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const String &value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | const [String](../../string/)\& | The string object to output |

## Console::WriteLine(const char_t *) method


Outputs the specified c-string followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const char_t *value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | const char_t * | The c-string to output |

## Console::WriteLine(const TypeInfo\&) method


Outputs the string representation of [TypeInfo](../../typeinfo/) value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const TypeInfo &value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | const [TypeInfo](../../typeinfo/)\& | The value to output |

## Console::WriteLine(uint32_t) method


Outputs the string representation of unsigned 32-bit integer value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(uint32_t value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **uint32_t** | The value to output |

## Console::WriteLine(uint64_t) method


Outputs the string representation of unsigned 64-bit integer value followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(uint64_t value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| value | **uint64_t** | The value to output |

## Console::WriteLine(const ArrayPtr\<char_t\>\&, int, int) method


Outputs the string representation of the specified range of the specified character array followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer, int index, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | const [ArrayPtr](../../arrayptr/)\<char_t\>\& | The character array |
| index | int | The index in the array at which the range to output begins |
| count | int | The number of elements in the range to output |

## Console::WriteLine(const Exception\&) method


Outputs the string representation of the specified Exception object followed by the current line terminator to the standard output stream.

```cpp
static void System::Console::WriteLine(const Exception &e)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| e | const [Exception](../../exception/)\& | The value to output |

## Console::WriteLine(const String\&, Args\&&...) method


Outputs the string representation of the specified arguments formatted according to the specified format followed by the current line terminator to the standard output stream.

```cpp
template<class...> static void System::Console::WriteLine(const String &format, Args &&... args)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| The | types of the values to output |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| format | const [String](../../string/)\& | The string format |
| args | Args\&&... | The values to output |

## Console::WriteLine(const char *) method




```cpp
static void System::Console::WriteLine(const char *)=delete
```

## See Also

* Typedef [SharedPtr](../../sharedptr/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Exception](../../exception/)
* Class [Console](../)
* Class [Decimal](../../decimal/)
* Class [String](../../string/)
* Class [TypeInfo](../../typeinfo/)
* Namespace [System](../../)
* Library [Aspose.Slides](../../../)