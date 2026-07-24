---
title: "System::Net::EndPoint klasse"
linktitle: "EndPoint"
second_title: "Aspose.Page voor C++"
description: "System::Net::EndPoint klasse. De abstracte klasse bevat een netwerkadres. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om het als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.net/endpoint/
---
## EndPoint class


De abstracte klasse bevat een netwerkadres. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om het als argument aan functies door te geven.

```cpp
class EndPoint : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Maak een nieuwe instantie van de [EndPoint](./) klasse met het opgegeven socketadres. |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI-informatie. |
| virtual [GetImpl](./getimpl/)() const | Retourneert een pointer naar de implementatie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ImplPtr](./implptr/) | Een pointer naar implementatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
