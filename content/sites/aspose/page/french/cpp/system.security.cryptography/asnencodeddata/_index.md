---
title: "System::Security::Cryptography::AsnEncodedData classe"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::AsnEncodedData classe. Données encodées ASN.1. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Données encodées ASN.1. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class AsnEncodedData : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Informations RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Constructeur. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Constructeur. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Constructeur. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Copie les données d'un autre objet. |
| virtual [Format](./format/)(bool) const | Formate les données sous une forme lisible par l'homme. |
| [get_Oid](./get_oid/)() const | Obtient l'identifiant d'objet des données encodées. |
| [get_RawData](./get_rawdata/)() const | Obtient les données encodées brutes. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Définit l'identifiant d'objet des données encodées. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Définit les données encodées brutes. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
