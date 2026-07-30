---
title: "classe System::IO::StringWriter"
linktitle: "StringWriter"
second_title: "Aspose.Font per C++"
description: "classe System::IO::StringWriter. Implementa un TextWriter che scrive informazioni in una stringa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.io/stringwriter/
---
## StringWriter class


Implementa un [TextWriter](../textwriter/) che scrive informazioni in una stringa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Restituisce la codifica attualmente utilizzata. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Restituisce lo StringBuilder attualmente utilizzato. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Crea una nuova istanza di [StringWriter](./) utilizzando lo StringBuilder specificato e [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Crea una nuova istanza di [StringWriter](./) utilizzando lo StringBuilder specificato e [IFormatProvider](../../system/iformatprovider/) della cultura corrente. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Crea una nuova istanza di [StringWriter](./) utilizzando il [IFormatProvider](../../system/iformatprovider/) specificato. |
| [StringWriter](./stringwriter/)() | Crea una nuova istanza di [StringWriter](./) utilizzando [IFormatProvider](../../system/iformatprovider/) della cultura corrente. |
| [ToString](./tostring/)() const override | Restituisce la stringa sottostante. |
| [Write](./write/)(char_t) override | Scrive il carattere specificato nello stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di caratteri dall'array di caratteri specificato nel flusso. |
| [Write](./write/)(const String\&) override | Scrive la stringa specificata nel flusso. |
## Vedi anche

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
