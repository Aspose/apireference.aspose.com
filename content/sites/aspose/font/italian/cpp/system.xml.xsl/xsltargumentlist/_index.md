---
title: "Classe System::Xml::Xsl::XsltArgumentList"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Xsl::XsltArgumentList. Contiene un numero variabile di argomenti che sono parametri XSLT o oggetti di estensione in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Contiene un numero variabile di argomenti che sono parametri XSLT o oggetti di estensione.

```cpp
class XsltArgumentList : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Aggiunge un nuovo oggetto al [XsltArgumentList](./) e lo associa all'URI dello spazio dei nomi. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Aggiunge un parametro al [XsltArgumentList](./) e lo associa al nome qualificato dello spazio dei nomi. |
| [Clear](./clear/)() | Rimuove tutti i parametri e gli oggetti di estensione dal [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Restituisce l'oggetto associato allo spazio dei nomi fornito. |
| [GetParam](./getparam/)(const String\&, const String\&) | Restituisce il parametro associato al nome qualificato dello spazio dei nomi. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Rimuove l'oggetto con l'URI dello spazio dei nomi dal [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Rimuove il parametro dal [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Implementa una nuova istanza del [XsltArgumentList](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
