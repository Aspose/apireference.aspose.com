---
title: "Metodo System::ICustomFormatter::Format"
linktitle: "Formato"
second_title: "Aspose.Font per C++"
description: "Metodo System::ICustomFormatter::Format. Restituisce una rappresentazione stringa di un valore rappresentato dall'oggetto corrente utilizzando il formato specificato in C++."
type: docs
weight: 100
url: /it/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Restituisce una rappresentazione stringa di un valore rappresentato dall'oggetto corrente usando il formato specificato.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| formato | System::String | Il formato della stringa |
| arg | System::SharedPtr\<System::Object\> | L'oggetto da formattare |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | L'oggetto che fornisce le informazioni di formattazione |

### ReturnValue

La rappresentazione stringa di **arg** formattata secondo il formato specificato da **format** e **formatProvider**

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
