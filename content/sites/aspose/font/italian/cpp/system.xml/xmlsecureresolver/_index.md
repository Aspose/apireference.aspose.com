---
title: "System::Xml::XmlSecureResolver classe"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlSecureResolver classe. Aiuta a proteggere un'altra implementazione di XmlResolver avvolgendo l'oggetto XmlResolver e limitando le risorse a cui l'XmlResolver sottostante ha accesso in C++."
type: docs
weight: 3600
url: /it/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Aiuta a proteggere un'altra implementazione di [XmlResolver](../xmlresolver/) avvolgendo l'oggetto [XmlResolver](../xmlresolver/) e limitando le risorse a cui l'[XmlResolver](../xmlresolver/) sottostante ha accesso.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappa un URI a un oggetto che contiene la risorsa effettiva. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Risolvi l'URI assoluto a partire dagli URI base e relativi chiamando **ResolveUri** sull'[XmlResolver](../xmlresolver/) sottostante. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Imposta le credenziali utilizzate per autenticare le richieste web. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Inizializza una nuova istanza della classe [XmlSecureResolver](./) con l'[XmlResolver](../xmlresolver/) e l'URL forniti. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
