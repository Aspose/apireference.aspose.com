---
title: "System::Net::WebClient classe"
linktitle: "WebClient"
second_title: "Aspose.Font per C++"
description: "System::Net::WebClient classe. WebClient fornisce metodi comuni per l'invio e la ricezione dei dati. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3500
url: /it/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Scarica la risorsa specificata come array di byte. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Scarica la risorsa specificata come array di byte. |
| [DownloadString](./downloadstring/)(const String\&) const | Scarica la risorsa specificata come stringa. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Scarica la risorsa specificata come stringa. |
| [get_Encoding](./get_encoding/)() const | Ottiene la codifica usata per scaricare o caricare stringhe. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Imposta la codifica usata per scaricare o caricare stringhe. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | NON IMPLEMENTATO. |
| [WebClient](./webclient/)() | Informazioni RTTI. |
| [~WebClient](./~webclient/)() | Distrugge l'istanza corrente. |
## Vedi anche

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
