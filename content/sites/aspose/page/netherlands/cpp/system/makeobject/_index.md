---
title: "System::MakeObject methode"
linktitle: "MakeObject"
second_title: "Aspose.Page voor C++"
description: "System::MakeObject methode. Maakt een object op de heap en retourneert een gedeelde pointer ernaar in C++."
type: docs
weight: 24500
url: /nl/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Maakt een object op de heap en retourneert een gedeelde pointer ernaar.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Klasse om te instantieren. |
| Argumenten | Typen van constructorargumenten. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Args\&&... | Constructorargumenten. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Maakt een object op de heap en retourneert een gedeelde pointer ernaar.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [SmartPtr](../smartptr/) naar de klasse om te instantieren. |
| Argumenten | Typen van constructorargumenten. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Args\&&... | Constructorargumenten. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
