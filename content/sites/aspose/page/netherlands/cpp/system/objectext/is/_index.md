---
title: "System::ObjectExt::Is methode"
linktitle: "Is"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::Is methode. Implementeert de ''is''-operatorvertaling. Specialisatie voor tekenreeksletterlijke in C++."
type: docs
weight: 1000
url: /nl/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Implementeert vertaling van de 'is' operator. Specialisatie voor tekenreeksletterlijke.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) letterlijke. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor exceptie-wrappertypen.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Implementeert vertaling van de 'is'-operator. Specialisatie voor het type [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) type. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor waardetypen.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor niet-converteerbare typen.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Geeft altijd false terug omdat de types niet converteerbaar zijn.

## Zie ook

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor nullable typen.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare typen met de == operator gedefinieerd.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare typen zonder gedefinieerde ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor enumtypen.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |
| U | Type van het aangewezen object. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor waardetypen verpakt naar interfaces.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |
| V | Type van het aangewezen object. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare (waarde)typen, wat precies betekent dat ze dat zijn.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) om te testen op de 'is'-operator. Genegeerd. |

### ReturnValue

Altijd true

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen geoptimaliseerd voor 'final' klassen.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |
| U | Getest type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |
| U | Getest type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Implementeert vertaling van de 'is' operator. Specialisatie voor enumtypen versus zwakke pointers.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |
| U | Type van het aangewezen object. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) om te testen op de 'is'-operator. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


Implementeert vertaling van de 'is' operator. Specialisatie voor gehele getal literal.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | int32_t | integer literal. |

### ReturnValue

Waar als 'is' true retourneert, anders false.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
