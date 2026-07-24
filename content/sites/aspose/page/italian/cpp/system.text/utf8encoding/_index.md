---
title: "classe System::Text::UTF8Encoding"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page per C++"
description: "Classe System::Text::UTF8Encoding. Codifica UTF-8. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2800
url: /it/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Codifica UTF-8. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

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
| [GetPreamble](./getpreamble/)() override | Restituisce il preambolo della codepage. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Confronta i parametri delle codifiche. |
| [UTF8Encoding](./utf8encoding/)() | Costruttore. |
| [UTF8Encoding](./utf8encoding/)(bool) | Costruttore. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della codepage. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Informazioni RTTI. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
