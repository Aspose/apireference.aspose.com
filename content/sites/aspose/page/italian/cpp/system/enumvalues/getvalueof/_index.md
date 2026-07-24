---
title: "System::EnumValues::GetValueOf metodo"
linktitle: "GetValueOf"
second_title: "Aspose.Page per C++"
description: "System::EnumValues::GetValueOf metodo. Restituisce il valore boxed della costante enum con il nome specificato in C++."
type: docs
weight: 500
url: /it/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


Restituisce il valore boxed della costante enum con il nome specificato.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | Il nome della costante enum |
| ignoreCase | bool | Specifica se il case deve essere ignorato durante l'interpretazione del nome della costante enum |

### ReturnValue

Un valore boxed della costante enum il cui nome è specificato in **str**.

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


Restituisce il valore boxed della costante enum con il valore specificato.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| val | long | Il valore della costante enum |

### ReturnValue

Un valore boxed della costante enum il cui valore è specificato in **str**.

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
