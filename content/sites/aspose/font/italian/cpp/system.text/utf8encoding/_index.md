---
title: "System::Text::UTF8Encoding classe"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::UTF8Encoding. Codifica UTF-8. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2800
url: /it/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Codifica UTF-8. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona l'oggetto di codifica. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta con l'oggetto. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash della codifica. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il numero massimo di byte necessari per codificare un numero specificato di caratteri. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
| [GetPreamble](./getpreamble/)() override | Ottiene il preambolo della pagina di codice. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Confronta i parametri delle codifiche. |
| [UTF8Encoding](./utf8encoding/)() | Costruttore. |
| [UTF8Encoding](./utf8encoding/)(bool) | Costruttore. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della pagina di codice. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Informazioni RTTI. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
