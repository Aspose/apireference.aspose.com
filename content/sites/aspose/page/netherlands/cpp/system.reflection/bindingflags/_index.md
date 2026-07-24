---
title: "System::Reflection::BindingFlags enum"
linktitle: "BindingFlags"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::BindingFlags enum. Definieert leden en types zoekmodi en bindingen in C++."
type: docs
weight: 1100
url: /nl/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Definieert leden- en type‑opzoekmodi en bindingen.

```cpp
enum class BindingFlags
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Default | 0 | Geen speciale opties. |
| IgnoreCase | 1 | Negeer hoofdlettergevoeligheid van de naam bij het zoeken naar een item. |
| DeclaredOnly | 2 | Zoek alleen naar leden die gedeclareerd zijn in het type en niet in basistypen. |
| Instance | 4 | Doorzoek instantie‑leden. |
| Static | 8 | Doorzoek statische leden. |
| Public | 16 | Doorzoek openbare leden. |
| NonPublic | 32 | Doorzoek niet‑openbare leden. |
| FlattenHierarchy | 64 | Doorzoek openbare en beschermde statische leden van het basistype. |
| InvokeMethod | 256 | Roept de methode aan. |
| CreateInstance | 512 | Maakt een gereflecteerd type‑exemplaar. |
| GetField | 1024 | Haalt de veldwaarde op. |
| SetField | 2048 | Stelt de veldwaarde in. |
| GetProperty | 4096 | Haalt de eigenschapswaarde op. |
| SetProperty | 8192 | Stelt de eigenschapswaarde in. |
| PutDispProperty | 16384 | Plaatst COM-eigenschap. |
| PutRefDispProperty | 32768 | Plaatst COM-referentie-eigenschap. |
| ExactBinding | 65536 | Typbinding moet exact zijn, zonder typewijzigingen. |
| SuppressChangeType | 131072 | Niet ondersteund. |
| OptionalParamBinding | 262144 | Selecteert overload op basis van het aantal argumenten. |
| IgnoreReturn | 16777216 | Negeert de retourwaarde van COM-interoperatie. |

## Zie ook

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
