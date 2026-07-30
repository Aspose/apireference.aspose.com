---
title: "classe System::Text::UnicodeEncoding"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::UnicodeEncoding. Codifica Unicode. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Codifica Unicode. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona l'oggetto di codifica. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta le codifiche. |
| [GetHashCode](./gethashcode/)() const override | Crea hash della codifica. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il numero massimo di byte necessari per codificare un numero specificato di caratteri. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
| [GetPreamble](./getpreamble/)() override | Restituisce una sequenza di byte che indica la codifica (ad es. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Confronta le codifiche per codepage e flag. |
| [UnicodeEncoding](./unicodeencoding/)() | Costruttore. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Costruttore. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Numero di codepage big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della pagina di codice. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Numero di codepage little endian. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
