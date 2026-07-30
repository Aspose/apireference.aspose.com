---
title: "classe System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Font per C++"
description: "classe System::EnumValues. Fornisce meta‑informazioni sui costanti di enumerazione del tipo enum **E** in C++."
type: docs
weight: 2300
url: /it/cpp/system/enumvalues/
---
## EnumValues class


Fornisce informazioni meta sui costanti di enumerazione del tipo enum **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parametro | Descrizione |
| --- | --- |
| E | Il tipo di enumerazione |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EnumValues](./enumvalues/)() | Costruisce un'istanza. |
| [GetNames](./getnames/)() const override | Restituisce un array contenente tutti i nomi dell'enumerazione **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Recupera un array dei nomi dei costanti in una enumerazione specificata. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Restituisce il tipo sottostante dell'enumerazione specificata. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Restituisce il tipo sottostante dell'enumerazione specificata. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Restituisce il valore boxed della costante enum con il nome specificato. |
| [GetValueOf](./getvalueof/)(long) const override | Restituisce il valore boxed della costante enum con il valore specificato. |
| [GetValues](./getvalues/)() const override | Restituisce un array contenente tutti i valori dell'enumerazione **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Restituisce un array contenente tutti i valori del tipo di enumerazione specificato. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Restituisce un oggetto che rappresenta il valore di una costante di enumerazione del tipo di enumerazione specificato con il nome specificato. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Converte il valore intero senza segno a 64 bit specificato in un membro di enumerazione. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Converte l'oggetto specificato con un valore intero in un membro di enumerazione. |
| virtual [~EnumValues](./~enumvalues/)() | Distruttore. |

## Vedi anche

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
