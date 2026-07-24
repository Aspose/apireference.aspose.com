---
title: "Enum System::Reflection::BindingFlags"
linktitle: "BindingFlags"
second_title: "Aspose.Page per C++"
description: "Enum System::Reflection::BindingFlags. Definisce i membri e le modalità di ricerca dei tipi e i binding in C++."
type: docs
weight: 1100
url: /it/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Definisce i membri e le modalità di ricerca e collegamento dei tipi.

```cpp
enum class BindingFlags
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Default | 0 | Nessuna opzione speciale. |
| IgnoreCase | 1 | Ignora la differenza tra maiuscole e minuscole del nome durante la ricerca dell'elemento. |
| DeclaredOnly | 2 | Cerca solo i membri dichiarati nel tipo e non nei tipi base. |
| Instance | 4 | Cerca tra i membri di istanza. |
| Static | 8 | Cerca tra i membri statici. |
| Public | 16 | Cerca tra i membri pubblici. |
| NonPublic | 32 | Cerca tra i membri non pubblici. |
| FlattenHierarchy | 64 | Cerca tra i membri statici pubblici e protetti del tipo base. |
| InvokeMethod | 256 | Invoca il metodo. |
| CreateInstance | 512 | Crea un'istanza del tipo riflesso. |
| GetField | 1024 | Ottiene il valore del campo. |
| SetField | 2048 | Imposta il valore del campo. |
| GetProperty | 4096 | Ottiene il valore della proprietà. |
| SetProperty | 8192 | Imposta il valore della proprietà. |
| PutDispProperty | 16384 | Imposta la proprietà COM. |
| PutRefDispProperty | 32768 | Imposta la proprietà di riferimento COM. |
| ExactBinding | 65536 | Il binding del tipo deve essere esatto, senza alcuna modifica del tipo. |
| SuppressChangeType | 131072 | Non supportato. |
| OptionalParamBinding | 262144 | Seleziona il sovraccarico in base al numero di argomenti. |
| IgnoreReturn | 16777216 | Ignora il valore di ritorno dell'interoperabilità COM. |

## Vedi anche

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
