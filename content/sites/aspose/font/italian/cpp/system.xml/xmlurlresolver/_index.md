---
title: "Classe System::Xml::XmlUrlResolver"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlUrlResolver. Risolve risorse XML esterne nominate da un Uniform Resource Identifier (URI) in C++."
type: docs
weight: 4100
url: /it/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Risolvi le risorse XML esterne nominate da un Uniform Resource Identifier (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappa un URI a un oggetto che contiene la risorsa effettiva. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Risolvi l'URI assoluto a partire dagli URI base e relativi. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Imposta la politica di cache per l'oggetto WebRequest sottostante. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Imposta le credenziali utilizzate per autenticare le richieste web. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Imposta il proxy di rete per l'oggetto WebRequest sottostante. |
| [XmlUrlResolver](./xmlurlresolver/)() | Inizializza una nuova istanza della classe [XmlUrlResolver](./). |
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
