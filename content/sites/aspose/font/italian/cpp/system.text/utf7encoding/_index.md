---
title: "Classe System::Text::UTF7Encoding"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::UTF7Encoding. Codifica UTF-7. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


Codifica UTF-7. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona l'oggetto di codifica. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta con l'oggetto. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Ottieni il numero di caratteri necessari per codificare una stringa. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| [GetDecoder](./getdecoder/)() override | Ottieni un decoder che inoltra le richieste a questo oggetto. |
| [GetEncoder](./getencoder/)() override | Ottieni un encoder che inoltra le richieste a questo oggetto. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash della codifica. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il numero massimo di byte necessari per codificare un numero specificato di caratteri. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Decodifica un buffer di byte in una stringa. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Decodifica un buffer di byte in una stringa. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Decodifica un buffer di byte in una stringa. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Confronta i parametri delle codifiche. |
| [UTF7Encoding](./utf7encoding/)() | Costruttore. |
| [UTF7Encoding](./utf7encoding/)(bool) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della pagina di codice. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Numero magico usato da [Windows](../../system.windows/) per l'ID della pagina di codice UTF-7. |
## Vedi anche

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
