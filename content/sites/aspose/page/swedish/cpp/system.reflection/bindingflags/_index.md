---
title: "System::Reflection::BindingFlags‑enum"
linktitle: "BindingFlags"
second_title: "Aspose.Page för C++"
description: "System::Reflection::BindingFlags‑enum. Definierar medlemmar och typer för uppslagningslägen och bindningar i C++."
type: docs
weight: 1100
url: /sv/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Definierar medlemmar och typers uppslagslägen samt bindningar.

```cpp
enum class BindingFlags
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Default | 0 | Inga speciella alternativ. |
| IgnoreCase | 1 | Ignorera skiftläge i namn när du söker efter objektet. |
| DeclaredOnly | 2 | Sök endast efter medlemmar som deklarerats i typen och inte i basklasser. |
| Instance | 4 | Sök igenom instansmedlemmar. |
| Static | 8 | Sök igenom statiska medlemmar. |
| Public | 16 | Sök igenom offentliga medlemmar. |
| NonPublic | 32 | Sök igenom icke‑offentliga medlemmar. |
| FlattenHierarchy | 64 | Sök igenom basklassens offentliga och skyddade statiska medlemmar. |
| InvokeMethod | 256 | Invokar metod. |
| CreateInstance | 512 | Skapar en reflekterad typinstans. |
| GetField | 1024 | Hämtar fältvärde. |
| SetField | 2048 | Sätter fältvärde. |
| GetProperty | 4096 | Hämtar egenskapsvärde. |
| SetProperty | 8192 | Sätter egenskapsvärde. |
| PutDispProperty | 16384 | Lägger till COM-egenskap. |
| PutRefDispProperty | 32768 | Lägger till COM-referensegenskap. |
| ExactBinding | 65536 | Typbindning måste vara exakt, utan några typändringar. |
| SuppressChangeType | 131072 | Stöds inte. |
| OptionalParamBinding | 262144 | Väljer överlagring baserat på antal argument. |
| IgnoreReturn | 16777216 | Ignorerar COM-interop-returvärde. |

## Se även

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
