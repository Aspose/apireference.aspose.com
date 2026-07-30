---
title: "System::Security::Cryptography::AsymmetricAlgorithm classe"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm classe. Classe base astratta per gli algoritmi di crittografia asimmetrica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Classe base astratta per gli algoritmi di crittografia asimmetrica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clear](./clear/)() | Rilascia tutte le risorse. |
| static [Create](./create/)() | Crea un algoritmo predefinito. Non implementato. |
| static [Create](./create/)(const String\&) | Crea un algoritmo per nome. Non implementato. |
| [Dispose](./dispose/)() override | Rilascia le risorse possedute dall'oggetto corrente. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Legge i parametri dell'algoritmo da una stringa XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Ottiene l'algoritmo di scambio chiavi da utilizzare. |
| virtual [get_KeySize](./get_keysize/)() | Informazioni RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Ottiene l'array delle dimensioni di chiave consentite. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Ottiene l'algoritmo di firma da utilizzare. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Imposta la dimensione della chiave. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Scrive i parametri dell'algoritmo in una stringa XML. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
