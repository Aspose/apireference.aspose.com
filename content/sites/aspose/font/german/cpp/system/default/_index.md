---
title: "System::Default-Methode"
linktitle: "Standard"
second_title: "Aspose.Font für C++"
description: "System::Default-Methode. Gibt die Referenz auf die einzige standardmäßig konstruierte Instanz des Ausnahmetyps in C++ zurück."
type: docs
weight: 16300
url: /de/cpp/system/default/
---
## System::Default() method


Gibt die Referenz auf die einzige standardmäßig konstruierte Instanz des Ausnahmetyps zurück.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ, dessen Instanz zurückgegeben wird |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


Gibt die Referenz auf die einzige standardmäßig konstruierte Instanz des Nicht‑Ausnahmetyps zurück.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ, dessen Instanz zurückgegeben wird |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
