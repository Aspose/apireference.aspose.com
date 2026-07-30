---
title: "méthode System::IterateOver"
linktitle: "ItérerSur"
second_title: "Aspose.Font pour C++"
description: "méthode System::IterateOver. Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable this avec le type cible par défaut en C++."
type: docs
weight: 23200
url: /fr/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable this avec le type cible par défaut.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Paramètre | Description |
| --- | --- |
| Enumerable | Le type d'un objet enveloppé |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(const Enumerable *) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable sans méthodes begin(), end() avec l'argument de type cible pour (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Paramètre | Description |
| --- | --- |
| T | Le type cible, il doit être renvoyé par l'itérateur |
| Enumerable | Le type d'un objet enveloppé |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable sans méthodes begin(), end() avec l'argument de type cible pour (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Paramètre | Description |
| --- | --- |
| T | Le type cible, il doit être renvoyé par l'itérateur |
| Enumerable | Le type d'un objet enveloppé |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable sans méthodes begin(), end() avec l'argument de type cible par défaut pour (auto& value : IterateOver(enumerable)) analogue au code C# suivant foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Paramètre | Description |
| --- | --- |
| Enumerable | Le type d'un objet enveloppé |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable avec méthodes begin(), end() avec l'argument de type cible par défaut pour (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Paramètre | Description |
| --- | --- |
| Enumerable | Le type d'un objet enveloppé |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable avec méthodes begin(), end() avec le type cible identique au value_type original de l'itérateur.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Paramètre | Description |
| --- | --- |
| Enumerable | Le type d'un objet enveloppé |
| T | Le type cible qui doit être renvoyé par l'itérateur |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Cette propriété de fonction enveloppe un objet enumerable (or iterable) afin qu'il puisse être utilisé avec une boucle for basée sur la plage. Cette surcharge pour Enumerable avec méthodes begin(), end() avec un type cible différent et le value_type original de l'itérateur.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Paramètre | Description |
| --- | --- |
| Enumerable | Le type d'un objet enveloppé |
| T | Le type cible qui doit être renvoyé par l'itérateur |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
