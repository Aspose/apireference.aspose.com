---
title: "Classe System::Xml::Resolvers::XmlPreloadedResolver"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page per C++"
description: "Classe System::Xml::Resolvers::XmlPreloadedResolver. Rappresenta una classe utilizzata per prepopolare la cache con DTD o flussi XML in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Rappresenta una classe utilizzata per prepopolare la cache con DTD o flussi XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Aggiunge un array di byte al deposito [XmlPreloadedResolver](./) e lo associa a un URI. Se il deposito contiene già una mappatura per lo stesso URI, la mappatura esistente viene sovrascritta. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Aggiunge un array di byte al deposito [XmlPreloadedResolver](./) e lo associa a un URI. Se il deposito contiene già una mappatura per lo stesso URI, la mappatura esistente viene sovrascritta. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Aggiunge uno Stream al deposito [XmlPreloadedResolver](./) e lo associa a un URI. Se il deposito contiene già una mappatura per lo stesso URI, la mappatura esistente viene sovrascritta. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Aggiunge una stringa con dati precaricati al deposito [XmlPreloadedResolver](./) e la associa a un URI. Se il deposito contiene già una mappatura per lo stesso URI, la mappatura esistente viene sovrascritta. |
| [get_PreloadedUris](./get_preloadeduris/)() | Restituisce una collezione di URI precaricati. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappa un URI a un oggetto che contiene la risorsa effettiva. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Rimuove i dati corrispondenti all'URI dal [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Risolvi l'URI assoluto a partire dagli URI base e relativi. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Imposta le credenziali utilizzate per autenticare la sottostante [Net::WebRequest](../../system.net/webrequest/). |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Determina se il resolver supporta altri Types oltre a Stream. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Inizializza una nuova istanza della classe [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Inizializza una nuova istanza della classe [XmlPreloadedResolver](./) con i DTD ben noti pre‑caricati specificati. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Inizializza una nuova istanza della classe [XmlPreloadedResolver](./) con il risolutore di fallback specificato. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Inizializza una nuova istanza della classe [XmlPreloadedResolver](./) con il risolutore di fallback specificato e i DTD ben noti pre‑caricati. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Inizializza una nuova istanza della classe [XmlPreloadedResolver](./) con il risolutore di fallback specificato, i DTD ben noti pre‑caricati e il comparatore di uguaglianza URI. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
