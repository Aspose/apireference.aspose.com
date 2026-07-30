---
title: "Classe System::Net::Http::StringContent"
linktitle: "StringContent"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::StringContent. Rappresenta il contenuto HTTP come stringa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.net.http/stringcontent/
---
## StringContent class


Rappresenta il contenuto HTTP come stringa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [StringContent](./stringcontent/)(String) | Informazioni RTTI. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Crea una nuova istanza. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Crea una nuova istanza. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | La codifica predefinita. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Il numero massimo di byte. |
## Vedi anche

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
