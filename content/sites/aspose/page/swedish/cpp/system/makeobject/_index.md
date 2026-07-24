---
title: "System::MakeObject metod"
linktitle: "MakeObject"
second_title: "Aspose.Page för C++"
description: "System::MakeObject metod. Skapar ett objekt på heapen och returnerar en delad pekare till det i C++."
type: docs
weight: 24500
url: /sv/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Skapar ett objekt på heapen och returnerar en delad pekare till det.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Klass att instansiera. |
| Argument | Konstruktorns argumenttyper. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Args\&&... | Konstruktorns argument. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Skapar ett objekt på heapen och returnerar en delad pekare till det.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | [SmartPtr](../smartptr/) till klass att instansiera. |
| Argument | Konstruktorns argumenttyper. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Args\&&... | Konstruktorns argument. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
