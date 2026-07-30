---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm classe"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm classe. Classe base per gli algoritmi asimmetrici. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Classe base per gli algoritmi asimmetrici. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Esporta il blob con le informazioni della chiave. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | Informazioni RTTI. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Importa le informazioni della chiave dal blob di dati. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
