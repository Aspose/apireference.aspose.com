---
title: "Classe System::Text::ASCIIEncoding"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Font per C++"
description: "System::Text::ASCIIEncoding class. Rappresenta la codifica ASCII. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 100
url: /it/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Rappresenta la codifica ASCII. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Costruttore. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il numero massimo di byte possibile per contenere una stringa con un conteggio di caratteri noto. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della pagina di codice. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
