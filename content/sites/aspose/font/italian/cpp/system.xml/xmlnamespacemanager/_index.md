---
title: "Classe System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNamespaceManager. Risolve, aggiunge e rimuove spazi dei nomi da una collezione e fornisce la gestione dell'ambito per questi spazi dei nomi in C++."
type: docs
weight: 2300
url: /it/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Risolvi, aggiungi e rimuovi spazi dei nomi da una raccolta e fornisci la gestione dell'ambito per questi spazi dei nomi.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Aggiunge lo spazio dei nomi fornito alla collezione. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Restituisce l'URI dello spazio dei nomi per lo spazio dei nomi predefinito. |
| virtual [get_NameTable](./get_nametable/)() | Restituisce il [XmlNameTable](../xmlnametable/) associato a questo oggetto. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore da utilizzare per iterare gli spazi dei nomi nel [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Restituisce una collezione di nomi di spazi dei nomi indicizzati per prefisso che può essere usata per enumerare gli spazi dei nomi attualmente in ambito. |
| virtual [HasNamespace](./hasnamespace/)(String) | Restituisce un valore che indica se il prefisso fornito ha uno spazio dei nomi definito per l'ambito attualmente spinto. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Restituisce l'URI dello spazio dei nomi per il prefisso specificato. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Trova il prefisso dichiarato per il dato URI dello spazio dei nomi. |
| virtual [PopScope](./popscope/)() | Rimuove dallo stack un ambito di spazio dei nomi. |
| virtual [PushScope](./pushscope/)() | Aggiunge sullo stack un ambito di spazio dei nomi. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Rimuove lo spazio dei nomi fornito per il prefisso specificato. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlNamespaceManager](./) con la [XmlNameTable](../xmlnametable/) specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
