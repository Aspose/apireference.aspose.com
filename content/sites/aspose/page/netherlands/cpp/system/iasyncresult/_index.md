---
title: "System::IAsyncResult klasse"
linktitle: "IAsyncResult"
second_title: "Aspose.Page voor C++"
description: "System::IAsyncResult klasse. Vertegenwoordigt de status van een asynchrone bewerking. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 3100
url: /nl/cpp/system/iasyncresult/
---
## IAsyncResult class


Vertegenwoordigt de status van een asynchrone bewerking. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class IAsyncResult : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Retourneert een object dat de informatie over een asynchrone bewerking bevat. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Retourneert een instantie van WaitHandle die kan worden gebruikt om te wachten op de voltooiing van de asynchrone bewerking. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Retourneert een waarde die aangeeft of de asynchrone bewerking synchroon is voltooid. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Retourneert een waarde die aangeeft of de asynchrone bewerking is voltooid. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Gedeelde pointer naar [IAsyncResult](./). |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
