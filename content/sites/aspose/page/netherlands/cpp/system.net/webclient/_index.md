---
title: "System::Net::WebClient klasse"
linktitle: "WebClient"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebClient klasse. WebClient biedt algemene methoden voor het verzenden en ontvangen van gegevens. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 3500
url: /nl/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Downloadt de opgegeven bron als een byte‑array. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Downloadt de opgegeven bron als een byte‑array. |
| [DownloadString](./downloadstring/)(const String\&) const | Downloadt de opgegeven bron als een string. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Downloadt de opgegeven bron als een string. |
| [get_Encoding](./get_encoding/)() const | Haalt de codering op die wordt gebruikt om strings te downloaden of uploaden. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Stelt de codering in die wordt gebruikt om strings te downloaden of uploaden. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | NOG NIET GEÏMPLENTEERD. |
| [WebClient](./webclient/)() | RTTI-informatie. |
| [~WebClient](./~webclient/)() | Vernietigt de huidige instantie. |
## Zie ook

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
