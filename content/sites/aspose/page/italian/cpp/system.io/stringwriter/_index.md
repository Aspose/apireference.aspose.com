---
title: "System::IO::StringWriter classe"
linktitle: "StringWriter"
second_title: "Aspose.Page per C++"
description: "System::IO::StringWriter classe. Implementa un TextWriter che scrive informazioni in una stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.io/stringwriter/
---
## StringWriter class


Implementa un [TextWriter](../textwriter/) che scrive informazioni in una stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Restituisce la codifica attualmente utilizzata. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Restituisce lo StringBuilder attualmente utilizzato. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Costruisce una nuova istanza di [StringWriter](./) usando lo StringBuilder specificato e [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Costruisce una nuova istanza di [StringWriter](./) usando lo StringBuilder specificato e [IFormatProvider](../../system/iformatprovider/) della cultura corrente. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Costruisce una nuova istanza di [StringWriter](./) usando il [IFormatProvider](../../system/iformatprovider/) specificato. |
| [StringWriter](./stringwriter/)() | Costruisce una nuova istanza di [StringWriter](./) usando [IFormatProvider](../../system/iformatprovider/) della cultura corrente. |
| [ToString](./tostring/)() const override | Restituisce la stringa sottostante. |
| [Write](./write/)(char_t) override | Scrive il carattere specificato sullo stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Scrive il sottointervallo specificato di caratteri dall'array di caratteri specificato nel flusso. |
| [Write](./write/)(const String\&) override | Scrive la stringa specificata sullo stream. |
## Vedi anche

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
