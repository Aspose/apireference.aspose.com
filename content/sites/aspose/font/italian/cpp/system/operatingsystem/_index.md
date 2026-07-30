---
title: "System::OperatingSystem classe"
linktitle: "OperatingSystem"
second_title: "Aspose.Font per C++"
description: "System::OperatingSystem classe. Rappresenta un sistema operativo specifico e fornisce informazioni al riguardo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 5100
url: /it/cpp/system/operatingsystem/
---
## OperatingSystem class


Rappresenta un sistema operativo specifico e fornisce informazioni al riguardo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class OperatingSystem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Platform](./get_platform/)() const | Restituisce l'identificatore della piattaforma del sistema operativo rappresentato dall'oggetto corrente. |
| [get_ServicePack](./get_servicepack/)() const | Restituisce il nome del service pack del sistema operativo rappresentato dall'oggetto corrente. |
| [get_Version](./get_version/)() const | Restituisce un riferimento costante a un oggetto [Version](../version/) che rappresenta la versione del sistema operativo rappresentato dall'oggetto corrente. |
| [get_VersionString](./get_versionstring/)() const | Restituisce la rappresentazione testuale della versione del sistema operativo rappresentata dall'oggetto corrente. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Crea un'istanza che rappresenta un sistema operativo specificato con un determinato ID piattaforma e versione. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Crea un'istanza che rappresenta un sistema operativo specificato con un determinato ID piattaforma, versione e service pack. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione testuale della versione del sistema operativo rappresentata dall'oggetto corrente. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
