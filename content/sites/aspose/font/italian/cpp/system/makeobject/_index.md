---
title: "Metodo System::MakeObject"
linktitle: "MakeObject"
second_title: "Aspose.Font per C++"
description: "System::MakeObject metodo. Crea un oggetto sull'heap e restituisce un puntatore condiviso a esso in C++."
type: docs
weight: 24600
url: /it/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Crea un oggetto sull'heap e restituisce un puntatore condiviso a esso.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | Classe da istanziare. |
| Argomenti | Tipi degli argomenti del costruttore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| argomenti | Args\&&... | Argomenti del costruttore. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


Crea un oggetto sull'heap e restituisce un puntatore condiviso a esso.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | [SmartPtr](../smartptr/) alla classe da istanziare. |
| Argomenti | Tipi degli argomenti del costruttore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| argomenti | Args\&&... | Argomenti del costruttore. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
