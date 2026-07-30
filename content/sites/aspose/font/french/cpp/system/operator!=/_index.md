---
title: "Méthode System::operator!="
linktitle: "operator!="
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode operator!= de la classe en C++."
type: docs
weight: 25900
url: /fr/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## Voir aussi

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| Paramètre | Description |
| --- | --- |
| Chars | Type littéral [String](../string/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| left | Chars\& | Littéral [String](../string/) à comparer. |
| right | const String\& | [String](../string/) à comparer. |

### ReturnValue

false si les chaînes correspondent, true sinon.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) à convertir en chaîne et à comparer. |
| right | const String\& | [String](../string/) à comparer. |

### ReturnValue

false si la représentation chaîne de l’objet est égale à la chaîne, true sinon.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Détermine si les URI représentés par les objets actuel et spécifié ne sont pas égaux.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Premier objet [Uri](../uri/) à comparer |
| uri2 | const SharedPtr\<Uri\>\& | Deuxième objet [Uri](../uri/) à comparer |

### ReturnValue

True si les URI ne sont pas égaux, sinon - false

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Non‑equal compare deux pointeurs intelligents.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Paramètre | Description |
| --- | --- |
| X | Type pointé du premier pointeur. |
| Y | Type d'objet pointé du deuxième pointeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Premier pointeur à comparer. |
| y | const SmartPtr\<Y\>\& | Deuxième pointeur à comparer. |

### ReturnValue

Faux si les pointeurs correspondent, vrai sinon.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


Comparaison d'inégalité du pointeur intelligent avec un pointeur simple (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| Paramètre | Description |
| --- | --- |
| X | type du pointeur intelligent. |
| Y | type du pointeur simple. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | pointeur intelligent à comparer (gauche). |
| y | const Y * | pointeur à comparer (droite). |

### ReturnValue

Faux si les pointeurs correspondent, vrai sinon.

## Voir aussi

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


Détermine si la valeur spécifiée n'est pas égale à la valeur représentée par l'objet [Nullable](../nullable/) spécifié en appliquant [operator!=()](./) à ces valeurs.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la première valeur comparande |
| T2 | Le type sous-jacent de l'objet [Nullable](../nullable/) qui représente la deuxième valeur comparande |

| Paramètre | Type | Description |
| --- | --- | --- |
| quelques | const T1\& | Une référence constante à la valeur qui doit être utilisée comme première comparande |
| other | const Nullable\<T2\>\& | Une référence constante à l'objet [Nullable](../nullable/) dont la valeur représentée doit être utilisée comme deuxième comparande |

### ReturnValue

Vrai si les comparandes ne sont pas égales, sinon - faux

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


Comparaison d'égalité du pointeur intelligent avec un pointeur simple (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| Paramètre | Description |
| --- | --- |
| X | type du pointeur simple. |
| Y | type du pointeur intelligent. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const X * | pointeur à comparer (droite). |
| y | const SmartPtr\<Y\>\& | pointeur intelligent à comparer (gauche). |

### ReturnValue

Faux si les pointeurs correspondent, vrai sinon.

## Voir aussi

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


Vérifie si le pointeur intelligent n'est pas nul.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| Paramètre | Description |
| --- | --- |
| X | Type d'objet pointé du pointeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | SmartPtr\\<X\\> const\\& | Pointeur à vérifier. |

### ReturnValue

Faux si le pointeur est nul, vrai sinon.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


Détermine si l'objet [Nullable](../nullable/) spécifié représente une valeur différente de null.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| other | std::nullptr_t | Une référence constante à un objet [Nullable](../nullable/) à tester |

### ReturnValue

Vrai si l'objet spécifié représente une valeur non nulle, faux sinon

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


Vérifie si la chaîne est nulle.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) à vérifier. |

### ReturnValue

faux si la chaîne est nulle, vrai sinon.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


Vérifie si le pointeur intelligent n'est pas nul.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| Paramètre | Description |
| --- | --- |
| X | Type d'objet pointé du pointeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | std::nullptr_t | Pointeur à vérifier. |

### ReturnValue

Faux si le pointeur est nul, vrai sinon.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| Paramètre | Description |
| --- | --- |
| T | type de pointeur [String](../string/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| left | T\& | pointeur [String](../string/) à comparer. |
| right | const String\& | [String](../string/) à comparer. |

### ReturnValue

false si les chaînes correspondent, true sinon.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
