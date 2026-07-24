---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue klasse"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue klasse. Vertegenwoordigt een waarde van de ''Content-Disposition'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Vertegenwoordigt een waarde van de 'Content-Disposition' header. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Construeert een nieuw exemplaar. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_CreationDate](./get_creationdate/)() | Haalt de aanmaakdatum van het bestand op. |
| [get_DispositionType](./get_dispositiontype/)() | RTTI-informatie. |
| [get_FileName](./get_filename/)() | Haalt een waarde op die bepaalt hoe een bestandsnaam moet worden geconstrueerd voor het opslaan van de berichtpayload. Deze wordt gebruikt wanneer de entiteit losgekoppeld is en in een afzonderlijk bestand wordt opgeslagen. |
| [get_FileNameStar](./get_filenamestar/)() | Haalt een waarde op die bepaalt hoe bestandsnamen moeten worden geconstrueerd voor het opslaan van de berichtpayload. Deze wordt gebruikt wanneer de entiteiten losgekoppeld zijn en in afzonderlijke bestanden worden opgeslagen. |
| [get_ModificationDate](./get_modificationdate/)() | Haalt de wijzigingsdatum van het bestand op. |
| [get_Name](./get_name/)() | Haalt een naam op voor een deel van de inhoudsbody. |
| [get_Parameters](./get_parameters/)() | Retourneert een parameterscollectie van de 'Content-Disposition' header. |
| [get_ReadDate](./get_readdate/)() | Haalt de datum op waarop het bestand voor het laatst werd gelezen. |
| [get_Size](./get_size/)() | Haalt een geschatte bestandsgrootte op. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven tekenreeks vanaf de opgegeven index naar een instantie van de [ContentDispositionHeaderValue](./) klasse. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [Parse](./parse/)(String) | Converteert een meegegeven tekenreeks naar een instantie van de [ContentDispositionHeaderValue](./) klasse. |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Stelt de aanmaakdatum van het bestand in. |
| [set_DispositionType](./set_dispositiontype/)(String) | Stelt een disposition‑type in. |
| [set_FileName](./set_filename/)(String) | Stelt een waarde in die bepaalt hoe een bestandsnaam moet worden geconstrueerd voor het opslaan van de berichtpayload. Deze wordt gebruikt wanneer de entiteit losgekoppeld is en in een afzonderlijk bestand wordt opgeslagen. |
| [set_FileNameStar](./set_filenamestar/)(String) | Stelt een waarde in die bepaalt hoe bestandsnamen moeten worden geconstrueerd voor het opslaan van de berichtpayload. Deze wordt gebruikt wanneer de entiteiten losgekoppeld zijn en in afzonderlijke bestanden worden opgeslagen. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Stelt de wijzigingsdatum van het bestand in. |
| [set_Name](./set_name/)(String) | Stelt een naam in voor een deel van de inhoudsbody. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Stelt de datum in waarop het bestand voor het laatst werd gelezen. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Stelt een geschatte bestandsgrootte in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Probeert een meegegeven string omzetten naar een instantie van de [ContentDispositionHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
