---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Font per C++"
description: "System::Reflection::FieldAttributes enum. Attributi di campo riflessi in C++."
type: docs
weight: 1200
url: /it/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Attributi del campo riflesso.

```cpp
enum class FieldAttributes
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| FieldAccessMask | 7 | Maschera di accesso ai membri. Usa questa maschera per recuperare le informazioni di accessibilità. |
| PrivateScope | 0 | Membri non referenziabili. |
| Private | 1 | Membri privati. |
| FamANDAssem | 2 | Membri privati e a livello di assembly. |
| Assembly | 3 | Membri a livello di assembly. |
| Family | 4 | Membri accessibili per tipo e sottotipi. |
| FamORAssem | 5 | Membri accessibili per tipo, sottotipi e assembly. |
| Public | 6 | Membri accessibili da chiunque. |
| Static | 16 | Membri statici in opposizione ai membri di istanza. |
| InitOnly | 32 | Membri const che possono solo essere inizializzati ma non modificati. |
| Literal | 64 | Membri costanti a tempo di compilazione. |
| NotSerialized | 128 | Membri non serializzati. |
| SpecialName | 512 | Campo speciale di uno dei nomi seguenti. |
| PinvokeImpl | 8192 | Implementazione inoltrata di Interop. |
| ReservedMask | 38144 | Flag riservati solo per l'uso a runtime. |
| RTSpecialName | 1024 | Il runtime dovrebbe verificare la codifica del nome. |
| HasFieldMarshal | 4096 | Le informazioni di marshalling sono presenti. |
| HasDefault | 32768 | Il valore predefinito è presente. |
| HasFieldRVA | 256 | RVA è presente. |

## Vedi anche

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
