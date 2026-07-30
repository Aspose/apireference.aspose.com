---
title: "classe System::Text::ICUEncoding"
linktitle: "ICUEncoding"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::ICUEncoding. Implementazione di codifica basata su ICU. SOLO PER USO INTERNO. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2200
url: /it/cpp/system.text/icuencoding/
---
## ICUEncoding class


Implementazione di codifica basata su ICU. SOLO PER USO INTERNO. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| [GetDecoder](./getdecoder/)() override | Ottieni un decoder che inoltra le richieste a questo oggetto. |
| [GetEncoder](./getencoder/)() override | Ottieni un encoder che inoltra le richieste a questo oggetto. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il numero massimo di byte necessari per codificare un numero specificato di caratteri. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
| [GetPreamble](./getpreamble/)() override | Restituisce una sequenza di byte che indica la codifica (ad es. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Costruttore. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Confronta le codifiche utilizzando le pagine di codice. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della pagina di codice. |
## Vedi anche

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
