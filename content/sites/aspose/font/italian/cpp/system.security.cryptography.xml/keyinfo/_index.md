---
title: "System::Security::Cryptography::Xml::KeyInfo classe"
linktitle: "KeyInfo"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::Xml::KeyInfo classe. Rappresenta l'elemento KeyInfo di una firma digitale XML o di una cifratura XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


Rappresenta l'elemento [KeyInfo](./) di una firma digitale XML o di una cifratura XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore. |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
