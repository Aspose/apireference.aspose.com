---
title: "System::EnumValuesBase::Parse-methode"
linktitle: "Parse"
second_title: "Aspose.Page voor C++"
description: "System::EnumValuesBase::Parse-methode. Retourneert een object dat een waarde van een enumeratie‑constante van het opgegeven enumeratietype met de opgegeven naam vertegenwoordigt in C++."
type: docs
weight: 400
url: /nl/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Retourneert een object dat een waarde van een enumeratie‑constante van het opgegeven enumeratietype met de opgegeven naam vertegenwoordigt.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | const TypeInfo\& | Het [TypeInfo](../../typeinfo/) object dat het type van de te retourneren enumeratiewaarde vertegenwoordigt |
| str | const String\& | De naam van de enum-constante |
| ignoreCase | bool | Specificeert of de hoofdlettergevoeligheid moet worden genegeerd bij het interpreteren van de naam van de enum-constante |

### ReturnValue

Een object dat de waarde van de enum‑constante vertegenwoordigt waarvan de naam is opgegeven in **str**.

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
