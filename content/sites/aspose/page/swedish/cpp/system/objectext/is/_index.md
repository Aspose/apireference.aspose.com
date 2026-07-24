---
title: "System::ObjectExt::Is metod"
linktitle: "Är"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::Is metod. Implementerar ''is'' operatoröversättning. Specialisering för strängliteral i C++."
type: docs
weight: 1000
url: /sv/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Implementerar 'is'-operatorns översättning. Specialisering för sträng‑literal.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) literal. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för undantags‑omslagstyper.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Implementerar 'is' operatoröversättning. Specialisering för [Nullable](../../nullable/) typ.

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) typ. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementerar 'is'-operatorns översättning. Specialisering för värdetyper.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementerar 'is'-operatorns översättning. Specialisering för icke‑konverterbara typer.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Returnerar alltid false eftersom typerna är icke‑konvertibla.

## Se även

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för nullable‑typer.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för boxbara typer med definierad ==‑operator.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för boxbara typer utan definierad ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för pekartyper.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för enum‑typer.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |
| U | Typen på det pekade objektet. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för värdetyper som är boxade till gränssnitt.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |
| V | Typen på det pekade objektet. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


Implementerar 'is'-operatorns översättning. Specialisering för boxbara (värde)typer som exakt är vad de är.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) för att testa 'is'-operatorn. Ignoreras. |

### ReturnValue

Alltid true

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementerar 'is'-operatorns översättning. Specialisering för pekartyper optimerade för 'final'-klasser.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |
| U | Testad typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementerar 'is'-operatorns översättning. Specialisering för pekartyper.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |
| U | Testad typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Implementerar 'is'-operatorns översättning. Specialisering för enum‑typer vs svaga pekare.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |
| U | Typen på det pekade objektet. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) för att testa 'is'-operatorn. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


Implementerar 'is'-operatorns översättning. Specialisering för heltals‑literal.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Målt typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | int32_t | heltal literal. |

### ReturnValue

Sant om 'is' returnerar true, annars falskt.

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
