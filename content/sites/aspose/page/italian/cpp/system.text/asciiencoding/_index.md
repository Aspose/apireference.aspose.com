---
title: "System::Text::ASCIIEncoding classe"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page per C++"
description: "classe System::Text::ASCIIEncoding. Rappresenta la codifica ASCII. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Rappresenta la codifica ASCII. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Costruttore. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Restituisce il conteggio massimo di byte possibile per contenere una stringa di lunghezza di caratteri nota. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valore predefinito della codepage. |
## Vedi anche

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
