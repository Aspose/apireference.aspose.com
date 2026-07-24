---
title: "System::Collections::ObjectModel::KeyedCollection klass"
linktitle: "KeyedCollection"
second_title: "Aspose.Page för C++"
description: "System::Collections::ObjectModel::KeyedCollection-klass. Abstrakt samling av element med inbäddade nycklar. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 200
url: /sv/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Abstrakt samling av element med inbäddade nycklar. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Beskrivning |
| --- | --- |
| TKey | Nyckeltyp. |
| TItem | värdetyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Lägg till objekt i behållarens slut. |
| [Contains](./contains/)(TKey) | Kontrollerar om nyckeln finns i behållaren. |
| [get_Comparer](./get_comparer/)() | Hämtar jämförare. |
| [idx_get](./idx_get/)(TKey) | Hämtar objekt på specifikt index. |
| [Remove](./remove/)(TKey) | Tar bort nyckeln från behållaren. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Gör så att ett specifikt mallargument behandlas som en svag pekare istället för en delad pekare (om tillämpligt). |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Uppslagsordboks skapande tröskelvärde, standard. |

## Se även

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
