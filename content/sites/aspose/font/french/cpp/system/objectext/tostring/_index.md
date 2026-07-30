---
title: "Méthode System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::ToString. Substitution de la méthode ToString de C# pour fonctionner sur tout type C++ en C++."
type: docs
weight: 1400
url: /fr/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) littéral à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type [Nullable](../../nullable/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | objet [Nullable](../../nullable/) à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type [Enum](../../enum/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | valeur [Enum](../../enum/) à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type de pointeur intelligent. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | valeur [SmartPtr](../../smartptr/) à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type de structure. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | valeur de structure à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Paramètre | Description |
| --- | --- |
| T | type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\\&& | valeur scalaire à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Paramètre | Description |
| --- | --- |
| T | type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\\&& | valeur scalaire à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type de pointeur intelligent ou [ExceptionWrapper](../../exceptionwrapper/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | Pointeur intelligent ou [ExceptionWrapper](../../exceptionwrapper/) pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | valeur scalaire à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode C# ToString pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type de structure. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | valeur de structure à convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
