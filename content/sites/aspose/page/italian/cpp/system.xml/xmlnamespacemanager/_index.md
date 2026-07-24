---
title: "Classe System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page per C++"
description: "Classe System::Xml::XmlNamespaceManager. Risolve, aggiunge e rimuove i namespace da una collezione e fornisce la gestione del contesto per questi namespace in C++."
type: docs
weight: 2300
url: /it/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Risolvi, aggiungi e rimuovi spazi dei nomi in una raccolta e fornisci la gestione dell'ambito per questi spazi dei nomi.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Aggiunge il namespace specificato alla collezione. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Restituisce l'URI del namespace per il namespace predefinito. |
| virtual [get_NameTable](./get_nametable/)() | Restituisce il [XmlNameTable](../xmlnametable/) associato a questo oggetto. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore da utilizzare per iterare i namespace nel [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Restituisce una collezione di nomi di namespace indicizzati per prefisso, che può essere usata per enumerare i namespace attualmente in ambito. |
| virtual [HasNamespace](./hasnamespace/)(String) | Restituisce un valore che indica se il prefisso fornito ha un namespace definito per l'ambito attualmente spinto. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Restituisce l'URI del namespace per il prefisso specificato. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Trova il prefisso dichiarato per il dato URI del namespace. |
| virtual [PopScope](./popscope/)() | Rimuove un ambito di namespace dallo stack. |
| virtual [PushScope](./pushscope/)() | Inserisce un ambito di namespace nello stack. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Rimuove il namespace specificato per il prefisso fornito. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlNamespaceManager](./) con il [XmlNameTable](../xmlnametable/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
