---
title: "System::Text::UTF32Encoding classe"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page per C++"
description: "System::Text::UTF32Encoding classe. Codifica UTF-32. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Codifica UTF-32. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona l'oggetto di codifica. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta con l'oggetto. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash della codifica. |
| [GetPreamble](./getpreamble/)() override | Restituisce il preambolo della codepage. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Confronta i parametri delle codifiche. |
| [UTF32Encoding](./utf32encoding/)() | Costruttore. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Costruttore. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Numero magico usato da [Windows](../../system.windows/) per l'ID della codepage UTF-32 big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della codepage. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Numero magico usato da [Windows](../../system.windows/) per l'ID della codepage UTF-32 little endian. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
