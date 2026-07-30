---
title: "classe System::SmartPtrInfo"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Font per C++"
description: "System::SmartPtrInfo class. Classe di servizio per testare e modificare i contenuti di SmartPtr senza conoscere il tipo finale. Usata per la raccolta dei rifiuti e il rilevamento di riferimenti ciclici, ecc. Pensala come un ''pointer to pointer''. Non possiamo usare il basetype di SmartPtr poiché non ne ha; invece, usiamo questa classe ''info'' in C++."
type: docs
weight: 5600
url: /it/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Classe di servizio per testare e modificare i contenuti di [SmartPtr](../smartptr/) senza conoscere il tipo finale. Usata per la raccolta dei rifiuti e il rilevamento di riferimenti ciclici, ecc. Pensala come un 'pointer to pointer'. Non possiamo usare il basetype di [SmartPtr](../smartptr/) poiché non ne ha; invece, usiamo questa classe 'info'.

```cpp
class SmartPtrInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Ottiene l'oggetto grezzo a cui punta il puntatore di riferimento. |
| [getObject](./getobject/)() const | Ottiene l'oggetto a cui punta il puntatore di riferimento. |
| [getOwned](./getowned/)() const | Ottiene il puntatore posseduto dall'oggetto. |
| [operator bool](./operatorbool/)() const | Verifica se l'oggetto info punta a un puntatore non nullo. |
| [operator!](./operator!/)() const | Verifica se l'oggetto info non punta a un puntatore non nullo. |
| [operator->](./operator-_/)() const | Consente di chiamare i metodi di [Object](../object/) puntato dal puntatore di riferimento. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Confronta (less) i valori dei puntatori referenziati da due oggetti info. |
| [SmartPtrInfo](./smartptrinfo/)() | Crea un oggetto [SmartPtrInfo](./) vuoto. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Crea un oggetto [SmartPtrInfo](./) con informazioni su uno smart pointer specifico. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
