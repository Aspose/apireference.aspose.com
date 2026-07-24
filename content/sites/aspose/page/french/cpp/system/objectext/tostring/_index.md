---
title: "System::ObjectExt::ToString méthode"
linktitle: "ToString"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::ToString méthode. Substitution à la méthode ToString de C# pour fonctionner avec n'importe quel type C++ en C++."
type: docs
weight: 1300
url: /fr/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) littéral pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | [Nullable](../../nullable/) type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) objet pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) valeur pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type de pointeur intelligent. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) valeur pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type de structure. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Valeur de structure pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\&& | Valeur scalaire pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\&& | Valeur scalaire pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type de pointeur intelligent ou [ExceptionWrapper](../../exceptionwrapper/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | Pointeur intelligent ou [ExceptionWrapper](../../exceptionwrapper/) pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type scalaire. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | Valeur scalaire pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Substitution de la méthode ToString de C# pour fonctionner avec n'importe quel type C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type de structure. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T\& | Valeur de structure pour convertir en chaîne. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
