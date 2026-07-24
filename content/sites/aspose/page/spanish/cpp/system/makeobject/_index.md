---
title: "método System::MakeObject"
linktitle: "MakeObject"
second_title: "Aspose.Page para C++"
description: "método System::MakeObject. Crea un objeto en el montón y devuelve un puntero compartido a él en C++."
type: docs
weight: 24500
url: /es/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Crea un objeto en el montón y devuelve un puntero compartido a él.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parámetro | Descripción |
| --- | --- |
| T | Clase para instanciar. |
| Argumentos | Tipos de los argumentos del constructor. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| args | Args\&&... | Argumentos del constructor. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Crea un objeto en el montón y devuelve un puntero compartido a él.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parámetro | Descripción |
| --- | --- |
| T | [SmartPtr](../smartptr/) a la clase para instanciar. |
| Argumentos | Tipos de los argumentos del constructor. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| args | Args\&&... | Argumentos del constructor. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
