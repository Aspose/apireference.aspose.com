---
title: "System::Default-Methode"
linktitle: "Default"
second_title: "Aspose.Page für C++"
description: "System::Default-Methode. Gibt die Referenz auf die einzige standardkonstruiert‑Instanz des Ausnahmetyps in C++ zurück."
type: docs
weight: 16200
url: /de/cpp/system/default/
---
## System::Default() method


Gibt die Referenz auf die einzige standardkonstruiert‑Instanz des Ausnahmetyps zurück.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ, dessen Instanz zurückgegeben wird |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Gibt die Referenz auf die einzige standardkonstruiert‑Instanz des Nicht‑Ausnahmetyps zurück.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ, dessen Instanz zurückgegeben wird |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
